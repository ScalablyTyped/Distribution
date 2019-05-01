package typings
package idbLib.idbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("idb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def deleteDb(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def openDb(name: java.lang.String): js.Promise[DB] = js.native
  def openDb(name: java.lang.String, version: scala.Double): js.Promise[DB] = js.native
  def openDb(
    name: java.lang.String,
    version: scala.Double,
    upgradeCallback: js.Function1[/* db */ UpgradeDB, scala.Unit]
  ): js.Promise[DB] = js.native
}

