package typings.libp2pTcp

import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceTransport.mod.Listener
import typings.libp2pInterfaceTransport.mod.Upgrader
import typings.libp2pTcp.mod.TCPCreateListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcListenerMod {
  
  @JSImport("@libp2p/tcp/dist/src/listener", "TCPListener")
  @js.native
  open class TCPListener protected () extends Listener {
    def this(context: Context) = this()
    
    /** Keep track of open connections to destroy in case of timeout */
    /* private */ val connections: Any = js.native
    
    /* private */ val context: Any = js.native
    
    /* private */ var onSocket: Any = js.native
    
    /* private */ val server: Any = js.native
    
    /* private */ var status: Any = js.native
  }
  
  trait Context
    extends StObject
       with TCPCreateListenerOptions {
    
    @JSName("handler")
    var handler_Context: js.UndefOr[js.Function1[/* conn */ Connection, Unit]] = js.undefined
    
    var maxConnections: js.UndefOr[Double] = js.undefined
    
    var socketCloseTimeout: js.UndefOr[Double] = js.undefined
    
    var socketInactivityTimeout: js.UndefOr[Double] = js.undefined
  }
  object Context {
    
    inline def apply(upgrader: Upgrader): Context = {
      val __obj = js.Dynamic.literal(upgrader = upgrader.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setHandler(value: /* conn */ Connection => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
      
      inline def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
      
      inline def setSocketCloseTimeout(value: Double): Self = StObject.set(x, "socketCloseTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketCloseTimeoutUndefined: Self = StObject.set(x, "socketCloseTimeout", js.undefined)
      
      inline def setSocketInactivityTimeout(value: Double): Self = StObject.set(x, "socketInactivityTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketInactivityTimeoutUndefined: Self = StObject.set(x, "socketInactivityTimeout", js.undefined)
    }
  }
}
