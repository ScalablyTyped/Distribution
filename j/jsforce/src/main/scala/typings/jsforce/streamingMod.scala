package typings.jsforce

import typings.jsforce.anon.CreatedDate
import typings.jsforce.channelMod.Channel
import typings.jsforce.connectionMod.Connection
import typings.jsforce.recordMod.Record
import typings.jsforce.topicMod.Topic
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamingMod {
  
  @JSImport("jsforce/streaming", "Streaming")
  @js.native
  open class Streaming protected () extends EventEmitter {
    def this(connection: Connection) = this()
    
    def channel(channelId: String): Channel = js.native
    
    def createClient(): Any = js.native
    def createClient(extensions: js.Array[Any]): Any = js.native
    
    def subscribe(name: String, listener: StreamingMessage): Any = js.native
    
    // Faye Subscription
    def topic(name: String): Topic = js.native
    
    def unsubscribe(name: String, listener: StreamingMessage): Streaming = js.native
  }
  
  object StreamingExtension {
    
    @JSImport("jsforce/streaming", "StreamingExtension.AuthFailure")
    @js.native
    open class AuthFailure protected () extends StObject {
      def this(failureCallback: js.Function0[Any]) = this()
    }
    
    @JSImport("jsforce/streaming", "StreamingExtension.Replay")
    @js.native
    open class Replay protected () extends StObject {
      def this(channel: String, replayId: Double) = this()
    }
  }
  
  trait StreamingMessage extends StObject {
    
    var event: CreatedDate
    
    var sobject: Record[Any]
  }
  object StreamingMessage {
    
    inline def apply(event: CreatedDate, sobject: Record[Any]): StreamingMessage = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], sobject = sobject.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamingMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamingMessage] (val x: Self) extends AnyVal {
      
      inline def setEvent(value: CreatedDate): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setSobject(value: Record[Any]): Self = StObject.set(x, "sobject", value.asInstanceOf[js.Any])
    }
  }
}
