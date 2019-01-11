package typings
package ibmUnderscoreDbLib.ibmUnderscoreDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ibm_db", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var FETCH_ARRAY: java.lang.String = js.native
  var FETCH_OBJECT: java.lang.String = js.native
  var SQL_DESTROY: java.lang.String = js.native
  var SQL_DROP: java.lang.String = js.native
  var SQL_RESET_PARAMS: java.lang.String = js.native
  var SQL_UNBIND: java.lang.String = js.native
  var SQSQL_CLOSE: java.lang.String = js.native
  def close(db: ibmUnderscoreDbLib.ibmUnderscoreDbMod.Database): scala.Unit = js.native
  def debug(x: scala.Boolean): scala.Unit = js.native
  def default(): ibmUnderscoreDbLib.ibmUnderscoreDbMod.Database = js.native
  def default(options: ibmUnderscoreDbLib.ibmUnderscoreDbMod.Options): ibmUnderscoreDbLib.ibmUnderscoreDbMod.Database = js.native
  def getElapsedTime(): java.lang.String = js.native
  def open(connStr: ibmUnderscoreDbLib.ibmUnderscoreDbMod.ConnStr): js.Promise[ibmUnderscoreDbLib.ibmUnderscoreDbMod.Database] = js.native
  def open(
    connStr: ibmUnderscoreDbLib.ibmUnderscoreDbMod.ConnStr,
    cb: js.Function2[
      /* err */ stdLib.Error, 
      /* db */ ibmUnderscoreDbLib.ibmUnderscoreDbMod.Database, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def open(
    connStr: ibmUnderscoreDbLib.ibmUnderscoreDbMod.ConnStr,
    options: ibmUnderscoreDbLib.ibmUnderscoreDbMod.Options
  ): js.Promise[ibmUnderscoreDbLib.ibmUnderscoreDbMod.Database] = js.native
  def open(
    connStr: ibmUnderscoreDbLib.ibmUnderscoreDbMod.ConnStr,
    options: ibmUnderscoreDbLib.ibmUnderscoreDbMod.Options,
    cb: js.Function2[
      /* err */ stdLib.Error, 
      /* db */ ibmUnderscoreDbLib.ibmUnderscoreDbMod.Database, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def open(connStr: java.lang.String): js.Promise[ibmUnderscoreDbLib.ibmUnderscoreDbMod.Database] = js.native
  def open(
    connStr: java.lang.String,
    cb: js.Function2[
      /* err */ stdLib.Error, 
      /* db */ ibmUnderscoreDbLib.ibmUnderscoreDbMod.Database, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def open(connStr: java.lang.String, options: ibmUnderscoreDbLib.ibmUnderscoreDbMod.Options): js.Promise[ibmUnderscoreDbLib.ibmUnderscoreDbMod.Database] = js.native
  def open(
    connStr: java.lang.String,
    options: ibmUnderscoreDbLib.ibmUnderscoreDbMod.Options,
    cb: js.Function2[
      /* err */ stdLib.Error, 
      /* db */ ibmUnderscoreDbLib.ibmUnderscoreDbMod.Database, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def openSync(connStr: ibmUnderscoreDbLib.ibmUnderscoreDbMod.ConnStr): ibmUnderscoreDbLib.ibmUnderscoreDbMod.Database = js.native
  def openSync(
    connStr: ibmUnderscoreDbLib.ibmUnderscoreDbMod.ConnStr,
    options: ibmUnderscoreDbLib.ibmUnderscoreDbMod.Options
  ): ibmUnderscoreDbLib.ibmUnderscoreDbMod.Database = js.native
  def openSync(connStr: java.lang.String): ibmUnderscoreDbLib.ibmUnderscoreDbMod.Database = js.native
  def openSync(connStr: java.lang.String, options: ibmUnderscoreDbLib.ibmUnderscoreDbMod.Options): ibmUnderscoreDbLib.ibmUnderscoreDbMod.Database = js.native
}

