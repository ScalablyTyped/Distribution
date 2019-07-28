package typings.idb.idbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("idb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def deleteDb(name: String): js.Promise[Unit] = js.native
  def openDb(name: String): js.Promise[DB] = js.native
  def openDb(name: String, version: Double): js.Promise[DB] = js.native
  def openDb(name: String, version: Double, upgradeCallback: js.Function1[/* db */ UpgradeDB, Unit]): js.Promise[DB] = js.native
}

