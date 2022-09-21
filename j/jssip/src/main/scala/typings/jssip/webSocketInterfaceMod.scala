package typings.jssip

import typings.std.ArrayBufferLike
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webSocketInterfaceMod {
  
  @JSImport("jssip/lib/WebSocketInterface", "Socket")
  @js.native
  open class Socket () extends StObject {
    
    def connect(): Unit = js.native
    
    def disconnect(): Unit = js.native
    
    def isConnected(): Boolean = js.native
    
    def isConnecting(): Boolean = js.native
    
    def onconnect(): Unit = js.native
    
    def ondata[T](event: T): Unit = js.native
    
    def ondisconnect(event: DisconnectEvent): Unit = js.native
    
    def send(message: String): Boolean = js.native
    def send(message: js.typedarray.ArrayBufferView): Boolean = js.native
    def send(message: ArrayBufferLike): Boolean = js.native
    def send(message: Blob): Boolean = js.native
    
    def sip_uri: String = js.native
    
    def url: String = js.native
    
    def via_transport: String = js.native
    def via_transport_=(value: String): Unit = js.native
  }
  
  @JSImport("jssip/lib/WebSocketInterface", "WebSocketInterface")
  @js.native
  open class WebSocketInterface protected () extends Socket {
    def this(url: String) = this()
  }
  
  trait DisconnectEvent extends StObject {
    
    var code: js.UndefOr[Double] = js.undefined
    
    var error: Boolean
    
    var reason: js.UndefOr[String] = js.undefined
    
    var socket: Socket
  }
  object DisconnectEvent {
    
    inline def apply(error: Boolean, socket: Socket): DisconnectEvent = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisconnectEvent]
    }
    
    extension [Self <: DisconnectEvent](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  trait WeightedSocket extends StObject {
    
    var socket: Socket
    
    var weight: Double
  }
  object WeightedSocket {
    
    inline def apply(socket: Socket, weight: Double): WeightedSocket = {
      val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[WeightedSocket]
    }
    
    extension [Self <: WeightedSocket](x: Self) {
      
      inline def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
}
