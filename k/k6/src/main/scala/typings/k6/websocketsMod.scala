package typings.k6

import typings.k6.k6Strings.arrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object websocketsMod {
  
  @js.native
  sealed trait EventName extends StObject
  @JSImport("k6/experimental/websockets", "EventName")
  @js.native
  object EventName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventName & String] = js.native
    
    /**
      * Event fired when the connection has been closed.
      */
    @js.native
    sealed trait Close
      extends StObject
         with EventName
    /* "close" */ val Close: typings.k6.websocketsMod.EventName.Close & String = js.native
    
    /**
      * Event fired when a connection has been closed due to an error.
      */
    @js.native
    sealed trait Error
      extends StObject
         with EventName
    /* "error" */ val Error: typings.k6.websocketsMod.EventName.Error & String = js.native
    
    /**
      * Event fired when a message has been received from the server.
      */
    @js.native
    sealed trait Message
      extends StObject
         with EventName
    /* "message" */ val Message: typings.k6.websocketsMod.EventName.Message & String = js.native
    
    /**
      * Event fired when the connection is opened and ready to communcate.
      */
    @js.native
    sealed trait Open
      extends StObject
         with EventName
    /* "open" */ val Open: typings.k6.websocketsMod.EventName.Open & String = js.native
  }
  
  @js.native
  sealed trait MessageType extends StObject
  @JSImport("k6/experimental/websockets", "MessageType")
  @js.native
  object MessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MessageType & Double] = js.native
    
    /**
      * The message is a binary message.
      */
    @js.native
    sealed trait Binary
      extends StObject
         with MessageType
    /* 2 */ val Binary: typings.k6.websocketsMod.MessageType.Binary & Double = js.native
    
    /**
      * The message is a close control message. The optional message
      * payload contains a numeric code and a text reason.
      */
    @js.native
    sealed trait Close
      extends StObject
         with MessageType
    /* 8 */ val Close: typings.k6.websocketsMod.MessageType.Close & Double = js.native
    
    /**
      * The message is a ping control message. The optional message
      * payload is UTF-8 encoded text.
      */
    @js.native
    sealed trait PingMessage
      extends StObject
         with MessageType
    /* 9 */ val PingMessage: typings.k6.websocketsMod.MessageType.PingMessage & Double = js.native
    
    /**
      * The message is a pong control message. The optional message
      * payload is UTF-8 encoded text.
      */
    @js.native
    sealed trait PongMessage
      extends StObject
         with MessageType
    /* 10 */ val PongMessage: typings.k6.websocketsMod.MessageType.PongMessage & Double = js.native
    
    /**
      * The message is a text message. The text message payload is
      * interpreted as UTF-8 encodedtext data.
      */
    @js.native
    sealed trait Text
      extends StObject
         with MessageType
    /* 1 */ val Text: typings.k6.websocketsMod.MessageType.Text & Double = js.native
  }
  
  @js.native
  sealed trait ReadyState extends StObject
  @JSImport("k6/experimental/websockets", "ReadyState")
  @js.native
  object ReadyState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ReadyState & Double] = js.native
    
    /**
      * The connection is closed or couldn't be opened.
      */
    @js.native
    sealed trait Closed
      extends StObject
         with ReadyState
    /* 3 */ val Closed: typings.k6.websocketsMod.ReadyState.Closed & Double = js.native
    
    /**
      * The connection is in the process of closing.
      */
    @js.native
    sealed trait Closing
      extends StObject
         with ReadyState
    /* 2 */ val Closing: typings.k6.websocketsMod.ReadyState.Closing & Double = js.native
    
    /**
      * Socket has been created. The connection is not yet open.
      */
    @js.native
    sealed trait Connecting
      extends StObject
         with ReadyState
    /* 0 */ val Connecting: typings.k6.websocketsMod.ReadyState.Connecting & Double = js.native
    
    /**
      * The connection is open and ready to communicate.
      */
    @js.native
    sealed trait Open
      extends StObject
         with ReadyState
    /* 1 */ val Open: typings.k6.websocketsMod.ReadyState.Open & Double = js.native
  }
  
  @JSImport("k6/experimental/websockets", "WebSocket")
  @js.native
  open class WebSocket protected () extends StObject {
    /**
      * The Websocket constructor returns a newly created WebSocket object.
      *
      * @param url - The URL to which to connect; this should be the URL to which the WebSocket server will respond.
      */
    def this(url: String) = this()
    
    /**
      * Bind event names to event handlers to be executed when their
      * respective event is received by the server.
      *
      * @param event - the event to listen for
      * @param listener - the callback to invoke when the event is emitted
      */
    def addEventListener(event: EventName, listener: js.Function1[/* message */ MessageEvent, Unit]): Unit = js.native
    
    /**
      * The type of binary data being transmitted over the connection.
      */
    val binaryType: BinaryType = js.native
    
    /**
      * The number of bytes of data that have been queued using calls to send()
      * but not yet transmitted to the network.
      *
      * This value resets to zero once all queued data has been sent.
      * This value does not reset to zero when the connection is closed;
      * if you keep calling send(), this will continue to climb.
      */
    val bufferedAmount: Double = js.native
    
    /**
      * Closes the WebSocket connection or connection attempt, if any.
      */
    def close(): Unit = js.native
    
    /**
      * The current state of the Websocket connection.
      */
    val readyState: ReadyState = js.native
    
    /**
      * Enqueues data to be transmitted to the server over the WebSocket connection.
      *
      * @param data - the data to send to the server
      */
    def send(data: String): Unit = js.native
    def send(data: js.typedarray.ArrayBuffer): Unit = js.native
    
    /**
      * The absolute URL to which the Websocket connection is established.
      */
    val url: String = js.native
  }
  
  type BinaryType = arrayBuffer
  
  trait MessageEvent extends StObject {
    
    /**
      * The data sent by the message emitter.
      */
    var data: String | js.typedarray.ArrayBuffer
    
    /**
      * The time when the message was received.
      */
    var time: Double
    
    /**
      * the type of the event.
      */
    var `type`: MessageType
  }
  object MessageEvent {
    
    inline def apply(data: String | js.typedarray.ArrayBuffer, time: Double, `type`: MessageType): MessageEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageEvent]
    }
    
    extension [Self <: MessageEvent](x: Self) {
      
      inline def setData(value: String | js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setType(value: MessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
