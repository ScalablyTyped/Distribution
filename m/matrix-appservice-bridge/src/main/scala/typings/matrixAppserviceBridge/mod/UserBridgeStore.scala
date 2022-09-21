package typings.matrixAppserviceBridge.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "UserBridgeStore")
@js.native
open class UserBridgeStore protected ()
  extends typings.matrixAppserviceBridge.userBridgeStoreMod.UserBridgeStore {
  /**
    * Construct a store suitable for user bridging information.
    * @param db The connected NEDB database instance
    */
  def this(db: typings.nedb.mod.^[Any]) = this()
}
