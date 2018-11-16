package typings
package ibmUnderscoreDbLib.ibmUnderscoreDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ibm_db", JSImport.Namespace)
@js.native
object ibmUnderscoreDbModMembers extends js.Object {
  var FETCH_ARRAY: java.lang.String = js.native
  var FETCH_OBJECT: java.lang.String = js.native
  var SQL_DESTROY: java.lang.String = js.native
  var SQL_DROP: java.lang.String = js.native
  var SQL_RESET_PARAMS: java.lang.String = js.native
  var SQL_UNBIND: java.lang.String = js.native
  var SQSQL_CLOSE: java.lang.String = js.native
  def close(db: Database): scala.Unit = js.native
  def debug(x: scala.Boolean): scala.Unit = js.native
  def default(): Database = js.native
  def default(options: Options): Database = js.native
  def getElapsedTime(): java.lang.String = js.native
  def open(connStr: ConnStr): stdLib.Promise[Database] = js.native
  def open(connStr: ConnStr, cb: js.Function2[/* err */ stdLib.Error, /* db */ Database, scala.Unit]): scala.Unit = js.native
  def open(connStr: ConnStr, options: Options): stdLib.Promise[Database] = js.native
  def open(
    connStr: ConnStr,
    options: Options,
    cb: js.Function2[/* err */ stdLib.Error, /* db */ Database, scala.Unit]
  ): scala.Unit = js.native
  def open(connStr: java.lang.String): stdLib.Promise[Database] = js.native
  def open(connStr: java.lang.String, cb: js.Function2[/* err */ stdLib.Error, /* db */ Database, scala.Unit]): scala.Unit = js.native
  def open(connStr: java.lang.String, options: Options): stdLib.Promise[Database] = js.native
  def open(
    connStr: java.lang.String,
    options: Options,
    cb: js.Function2[/* err */ stdLib.Error, /* db */ Database, scala.Unit]
  ): scala.Unit = js.native
  def openSync(connStr: ConnStr): Database = js.native
  def openSync(connStr: ConnStr, options: Options): Database = js.native
  def openSync(connStr: java.lang.String): Database = js.native
  def openSync(connStr: java.lang.String, options: Options): Database = js.native
}

