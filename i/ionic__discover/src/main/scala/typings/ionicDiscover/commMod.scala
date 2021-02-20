package typings.ionicDiscover

import typings.ionicDiscover.ionicDiscoverStrings.connect
import typings.ionicDiscover.ionicDiscoverStrings.error
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.std.Set
import typings.ws.mod.Server
import typings.ws.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commMod {
  
  @JSImport("@ionic/discover/dist/comm", "CommServer")
  @js.native
  class CommServer protected () extends EventEmitter {
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
    
    def clients: Set[^] = js.native
    
    /**
      * Unique identifier of the publisher.
      */
    var id: String = js.native
    
    var namespace: String = js.native
    
    @JSName("on")
    def on_connect(event: connect, listener: js.Function1[/* data */ CommServerConnectionPayload, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    var parseData: js.Any = js.native
    
    /**
      * Port of communication server.
      */
    var port: Double = js.native
    
    var server: js.UndefOr[Server] = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def stop(): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait CommServerConnectionPayload extends StObject {
    
    var device: String = js.native
    
    var event: connect = js.native
  }
  object CommServerConnectionPayload {
    
    @scala.inline
    def apply(device: String, event: connect): CommServerConnectionPayload = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommServerConnectionPayload]
    }
    
    @scala.inline
    implicit class CommServerConnectionPayloadMutableBuilder[Self <: CommServerConnectionPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: connect): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
}
