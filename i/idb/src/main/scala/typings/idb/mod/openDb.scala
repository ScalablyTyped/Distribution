package typings.idb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("idb", "openDb")
@js.native
object openDb extends js.Object {
  def apply(name: String): js.Promise[DB] = js.native
  def apply(name: String, version: Double): js.Promise[DB] = js.native
  def apply(name: String, version: Double, upgradeCallback: js.Function1[/* db */ UpgradeDB, Unit]): js.Promise[DB] = js.native
}

