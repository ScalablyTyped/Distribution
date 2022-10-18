package typings.matrixAppserviceBridge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsBridgeBlockerMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/bridge-blocker", "BridgeBlocker")
  @js.native
  open class BridgeBlocker protected () extends StObject {
    def this(userLimit: Double) = this()
    
    var _isBlocked: Boolean = js.native
    
    def blockBridge(): js.Promise[Unit] = js.native
    
    /**
      * Check `users` param against the limit and block the bridge when it's exceeded.
      */
    def checkLimits(users: Double): js.Promise[Unit] = js.native
    
    def isBlocked: Boolean = js.native
    
    def unblockBridge(): js.Promise[Unit] = js.native
    
    /* private */ var userLimit: Any = js.native
  }
}
