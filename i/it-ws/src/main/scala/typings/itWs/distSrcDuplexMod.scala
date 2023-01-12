package typings.itWs

import typings.itStreamTypes.mod.Duplex
import typings.itStreamTypes.mod.Source
import typings.itWs.distSrcSinkMod.SinkOptions
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDuplexMod {
  
  @JSImport("it-ws/dist/src/duplex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(socket: WebSocket): DuplexWebSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any]).asInstanceOf[DuplexWebSocket]
  inline def default(socket: WebSocket, options: DuplexWebSocketOptions): DuplexWebSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DuplexWebSocket]
  
  trait DuplexWebSocket
    extends StObject
       with Duplex[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]] {
    
    def close(): js.Promise[Unit]
    
    def connected(): js.Promise[Unit]
    
    def destroy(): Unit
    
    var localAddress: js.UndefOr[String] = js.undefined
    
    var localPort: js.UndefOr[Double] = js.undefined
    
    var remoteAddress: String
    
    var remotePort: Double
    
    var socket: WebSocket
  }
  object DuplexWebSocket {
    
    inline def apply(
      close: () => js.Promise[Unit],
      connected: () => js.Promise[Unit],
      destroy: () => Unit,
      remoteAddress: String,
      remotePort: Double,
      sink: /* source */ Source[js.typedarray.Uint8Array] => js.Promise[Unit],
      socket: WebSocket,
      source: Source[js.typedarray.Uint8Array]
    ): DuplexWebSocket = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connected = js.Any.fromFunction0(connected), destroy = js.Any.fromFunction0(destroy), remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], sink = js.Any.fromFunction1(sink), socket = socket.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[DuplexWebSocket]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DuplexWebSocket] (val x: Self) extends AnyVal {
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setConnected(value: () => js.Promise[Unit]): Self = StObject.set(x, "connected", js.Any.fromFunction0(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      inline def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
      
      inline def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
      
      inline def setRemotePort(value: Double): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
      
      inline def setSocket(value: WebSocket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  trait DuplexWebSocketOptions
    extends StObject
       with SinkOptions {
    
    var remoteAddress: js.UndefOr[String] = js.undefined
    
    var remotePort: js.UndefOr[Double] = js.undefined
  }
  object DuplexWebSocketOptions {
    
    inline def apply(): DuplexWebSocketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DuplexWebSocketOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DuplexWebSocketOptions] (val x: Self) extends AnyVal {
      
      inline def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
      
      inline def setRemoteAddressUndefined: Self = StObject.set(x, "remoteAddress", js.undefined)
      
      inline def setRemotePort(value: Double): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
      
      inline def setRemotePortUndefined: Self = StObject.set(x, "remotePort", js.undefined)
    }
  }
}
