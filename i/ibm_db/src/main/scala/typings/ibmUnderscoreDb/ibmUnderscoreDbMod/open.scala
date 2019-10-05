package typings.ibmUnderscoreDb.ibmUnderscoreDbMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ibm_db", "open")
@js.native
object open extends js.Object {
  def apply(connStr: String): js.Promise[Database] = js.native
  def apply(connStr: String, cb: js.Function2[/* err */ Error, /* db */ Database, Unit]): Unit = js.native
  def apply(connStr: String, options: Options): js.Promise[Database] = js.native
  def apply(connStr: String, options: Options, cb: js.Function2[/* err */ Error, /* db */ Database, Unit]): Unit = js.native
  def apply(connStr: ConnStr): js.Promise[Database] = js.native
  def apply(connStr: ConnStr, cb: js.Function2[/* err */ Error, /* db */ Database, Unit]): Unit = js.native
  def apply(connStr: ConnStr, options: Options): js.Promise[Database] = js.native
  def apply(connStr: ConnStr, options: Options, cb: js.Function2[/* err */ Error, /* db */ Database, Unit]): Unit = js.native
}

