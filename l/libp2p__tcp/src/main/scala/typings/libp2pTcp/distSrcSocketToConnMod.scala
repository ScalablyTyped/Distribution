package typings.libp2pTcp

import typings.libp2pInterfaceConnection.mod.MultiaddrConnection
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.node.netMod.Socket
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSocketToConnMod {
  
  @JSImport("@libp2p/tcp/dist/src/socket-to-conn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toMultiaddrConnection(socket: Socket): MultiaddrConnection = ^.asInstanceOf[js.Dynamic].applyDynamic("toMultiaddrConnection")(socket.asInstanceOf[js.Any]).asInstanceOf[MultiaddrConnection]
  inline def toMultiaddrConnection(socket: Socket, options: ToConnectionOptions): MultiaddrConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("toMultiaddrConnection")(socket.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MultiaddrConnection]
  
  trait ToConnectionOptions extends StObject {
    
    var listeningAddr: js.UndefOr[Multiaddr_] = js.undefined
    
    var localAddr: js.UndefOr[Multiaddr_] = js.undefined
    
    var remoteAddr: js.UndefOr[Multiaddr_] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    var socketCloseTimeout: js.UndefOr[Double] = js.undefined
    
    var socketInactivityTimeout: js.UndefOr[Double] = js.undefined
  }
  object ToConnectionOptions {
    
    inline def apply(): ToConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToConnectionOptions]
    }
    
    extension [Self <: ToConnectionOptions](x: Self) {
      
      inline def setListeningAddr(value: Multiaddr_): Self = StObject.set(x, "listeningAddr", value.asInstanceOf[js.Any])
      
      inline def setListeningAddrUndefined: Self = StObject.set(x, "listeningAddr", js.undefined)
      
      inline def setLocalAddr(value: Multiaddr_): Self = StObject.set(x, "localAddr", value.asInstanceOf[js.Any])
      
      inline def setLocalAddrUndefined: Self = StObject.set(x, "localAddr", js.undefined)
      
      inline def setRemoteAddr(value: Multiaddr_): Self = StObject.set(x, "remoteAddr", value.asInstanceOf[js.Any])
      
      inline def setRemoteAddrUndefined: Self = StObject.set(x, "remoteAddr", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSocketCloseTimeout(value: Double): Self = StObject.set(x, "socketCloseTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketCloseTimeoutUndefined: Self = StObject.set(x, "socketCloseTimeout", js.undefined)
      
      inline def setSocketInactivityTimeout(value: Double): Self = StObject.set(x, "socketInactivityTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketInactivityTimeoutUndefined: Self = StObject.set(x, "socketInactivityTimeout", js.undefined)
    }
  }
}
