/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2013 by Pentaho : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.di.trans.steps.tableinputplus;

import java.sql.ResultSet;

import org.pentaho.di.core.RowSet;
import org.pentaho.di.core.database.Database;
import org.pentaho.di.core.row.RowMetaInterface;
import org.pentaho.di.trans.step.BaseStepData;
import org.pentaho.di.trans.step.StepDataInterface;
import org.pentaho.di.trans.step.errorhandling.StreamInterface;

/**
 * @author Matt
 * @since 20-jan-2005
 */
public class TableInputPlusData extends BaseStepData implements StepDataInterface {
  public Object[] nextrow;
  public Object[] thisrow;
  public Database db;
  public ResultSet rs;
  public String lookupStep;
  public RowMetaInterface rowMeta;
  public RowSet rowSet;
  public boolean isCanceled;
  public StreamInterface infoStream;

  public TableInputPlusData() {
    super();

    db = null;
    thisrow = null;
    nextrow = null;
    rs = null;
    lookupStep = null;
  }

}
