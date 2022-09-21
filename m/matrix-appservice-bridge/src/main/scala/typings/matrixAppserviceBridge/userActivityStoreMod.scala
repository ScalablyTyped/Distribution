package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.bridgeStoreMod.BridgeStore
import typings.matrixAppserviceBridge.userActivityMod.UserActivity
import typings.matrixAppserviceBridge.userActivityMod.UserActivitySet
import typings.nedb.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userActivityStoreMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/user-activity-store", "UserActivityStore")
  @js.native
  open class UserActivityStore protected () extends BridgeStore {
    /**
      * Construct a store suitable for user bridging information.
      * @param db The connected NEDB database instance
      */
    def this(db: ^[Any]) = this()
    
    def getActivitySet(): js.Promise[UserActivitySet] = js.native
    
    def storeUserActivity(mxid: String, activity: UserActivity): js.Promise[Unit] = js.native
  }
}
