package typings.libp2pWebsockets

import typings.itWs.distSrcDuplexMod.DuplexWebSocket
import typings.libp2pInterfaceConnection.mod.MultiaddrConnection
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSocketToConnMod {
  
  @JSImport("@libp2p/websockets/dist/src/socket-to-conn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def socketToMaConn(stream: DuplexWebSocket, remoteAddr: Multiaddr_): MultiaddrConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("socketToMaConn")(stream.asInstanceOf[js.Any], remoteAddr.asInstanceOf[js.Any])).asInstanceOf[MultiaddrConnection]
  inline def socketToMaConn(stream: DuplexWebSocket, remoteAddr: Multiaddr_, options: SocketToConnOptions): MultiaddrConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("socketToMaConn")(stream.asInstanceOf[js.Any], remoteAddr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MultiaddrConnection]
  
  trait SocketToConnOptions
    extends StObject
       with AbortOptions {
    
    var localAddr: js.UndefOr[Multiaddr_] = js.undefined
  }
  object SocketToConnOptions {
    
    inline def apply(): SocketToConnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocketToConnOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SocketToConnOptions] (val x: Self) extends AnyVal {
      
      inline def setLocalAddr(value: Multiaddr_): Self = StObject.set(x, "localAddr", value.asInstanceOf[js.Any])
      
      inline def setLocalAddrUndefined: Self = StObject.set(x, "localAddr", js.undefined)
    }
  }
}
