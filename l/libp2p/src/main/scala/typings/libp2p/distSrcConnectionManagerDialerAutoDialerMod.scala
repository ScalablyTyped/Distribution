package typings.libp2p

import typings.libp2pComponents.mod.Components
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConnectionManagerDialerAutoDialerMod {
  
  @JSImport("libp2p/dist/src/connection-manager/dialer/auto-dialer", "AutoDialer")
  @js.native
  open class AutoDialer protected () extends StObject {
    def this(components: Components, init: AutoDialerInit) = this()
    
    /* private */ val components: Any = js.native
    
    /* private */ val dialTimeout: Any = js.native
    
    /* private */ val enabled: Any = js.native
    
    def handle(evt: CustomEvent[PeerInfo]): Unit = js.native
    
    /* private */ val minConnections: Any = js.native
  }
  
  trait AutoDialerInit extends StObject {
    
    var dialTimeout: Double
    
    var enabled: Boolean
    
    var minConnections: Double
  }
  object AutoDialerInit {
    
    inline def apply(dialTimeout: Double, enabled: Boolean, minConnections: Double): AutoDialerInit = {
      val __obj = js.Dynamic.literal(dialTimeout = dialTimeout.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], minConnections = minConnections.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoDialerInit]
    }
    
    extension [Self <: AutoDialerInit](x: Self) {
      
      inline def setDialTimeout(value: Double): Self = StObject.set(x, "dialTimeout", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setMinConnections(value: Double): Self = StObject.set(x, "minConnections", value.asInstanceOf[js.Any])
    }
  }
}
