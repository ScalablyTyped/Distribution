package typings.ionicDiscover

import typings.ionicDiscover.ionicDiscoverStrings.connect
import typings.ionicDiscover.ionicDiscoverStrings.error
import typings.node.eventsMod.EventEmitter
import typings.std.Set
import typings.ws.mod.Server
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommMod {
  
  @JSImport("@ionic/discover/dist/comm", "CommServer")
  @js.native
  open class CommServer protected () extends EventEmitter {
    def this(
      namespace: String,
      /**
      * Unique identifier of the publisher.
      */
    id: String,
      /**
      * Port of communication server.
      */
    port: Double
    ) = this()
    
    def clients: Set[WebSocket] = js.native
    
    /**
      * Unique identifier of the publisher.
      */
    var id: String = js.native
    
    var namespace: String = js.native
    
    @JSName("on")
    def on_connect(event: connect, listener: js.Function1[/* data */ CommServerConnectionPayload, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    /* private */ var parseData: Any = js.native
    
    /**
      * Port of communication server.
      */
    var port: Double = js.native
    
    /* protected */ var server: js.UndefOr[Server[WebSocket]] = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def stop(): js.Promise[Unit] = js.native
  }
  
  trait CommServerConnectionPayload extends StObject {
    
    var device: String
    
    var event: connect
  }
  object CommServerConnectionPayload {
    
    inline def apply(device: String): CommServerConnectionPayload = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], event = "connect")
      __obj.asInstanceOf[CommServerConnectionPayload]
    }
    
    extension [Self <: CommServerConnectionPayload](x: Self) {
      
      inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: connect): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
}
