package typings.ibmUnderscoreDb.ibmUnderscoreDbMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ibm_db", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var FETCH_ARRAY: String = js.native
  var FETCH_OBJECT: String = js.native
  var SQL_DESTROY: String = js.native
  var SQL_DROP: String = js.native
  var SQL_RESET_PARAMS: String = js.native
  var SQL_UNBIND: String = js.native
  var SQSQL_CLOSE: String = js.native
  def close(db: Database): Unit = js.native
  def debug(x: Boolean): Unit = js.native
  def default(): Database = js.native
  def default(options: Options): Database = js.native
  def getElapsedTime(): String = js.native
  def open(connStr: String): js.Promise[Database] = js.native
  def open(connStr: String, cb: js.Function2[/* err */ Error, /* db */ Database, Unit]): Unit = js.native
  def open(connStr: String, options: Options): js.Promise[Database] = js.native
  def open(connStr: String, options: Options, cb: js.Function2[/* err */ Error, /* db */ Database, Unit]): Unit = js.native
  def open(connStr: ConnStr): js.Promise[Database] = js.native
  def open(connStr: ConnStr, cb: js.Function2[/* err */ Error, /* db */ Database, Unit]): Unit = js.native
  def open(connStr: ConnStr, options: Options): js.Promise[Database] = js.native
  def open(connStr: ConnStr, options: Options, cb: js.Function2[/* err */ Error, /* db */ Database, Unit]): Unit = js.native
  def openSync(connStr: String): Database = js.native
  def openSync(connStr: String, options: Options): Database = js.native
  def openSync(connStr: ConnStr): Database = js.native
  def openSync(connStr: ConnStr, options: Options): Database = js.native
}

