package typings.k6

import typings.k6.httpMod.CookieJar_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalWebsocketsMod {
  
  @js.native
  sealed trait BinaryType extends StObject
  @JSImport("k6/experimental/websockets", "BinaryType")
  @js.native
  object BinaryType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BinaryType & String] = js.native
    
    /**
      * Binary data is returned in ArrayBuffer form. k6 supports only this type.
      */
    @js.native
    sealed trait ArrayBuffer
      extends StObject
         with BinaryType
    /* "ArrayBuffer" */ val ArrayBuffer: typings.k6.experimentalWebsocketsMod.BinaryType.ArrayBuffer & String = js.native
  }
  
  @js.native
  sealed trait CompressionAlgorithm extends StObject
  @JSImport("k6/experimental/websockets", "CompressionAlgorithm")
  @js.native
  object CompressionAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CompressionAlgorithm & String] = js.native
    
    /**
      * Deflate compression algorithm.
      * k6 supports only this compression algorithm.
      */
    @js.native
    sealed trait Deflate
      extends StObject
         with CompressionAlgorithm
    /* "deflate" */ val Deflate: typings.k6.experimentalWebsocketsMod.CompressionAlgorithm.Deflate & String = js.native
  }
  
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
    /* "close" */ val Close: typings.k6.experimentalWebsocketsMod.EventName.Close & String = js.native
    
    /**
      * Event fired when a connection has been closed due to an error.
      */
    @js.native
    sealed trait Error
      extends StObject
         with EventName
    /* "error" */ val Error: typings.k6.experimentalWebsocketsMod.EventName.Error & String = js.native
    
    /**
      * Event fired when a message has been received from the server.
      */
    @js.native
    sealed trait Message
      extends StObject
         with EventName
    /* "message" */ val Message: typings.k6.experimentalWebsocketsMod.EventName.Message & String = js.native
    
    /**
      * Event fired when the connection is opened and ready to communicate.
      */
    @js.native
    sealed trait Open
      extends StObject
         with EventName
    /* "open" */ val Open: typings.k6.experimentalWebsocketsMod.EventName.Open & String = js.native
    
    /**
      * Event fired when a ping message has been received from the server.
      */
    @js.native
    sealed trait Ping
      extends StObject
         with EventName
    /* "ping" */ val Ping: typings.k6.experimentalWebsocketsMod.EventName.Ping & String = js.native
    
    /**
      * Event fired when a pong message has been received from the server.
      */
    @js.native
    sealed trait Pong
      extends StObject
         with EventName
    /* "pong" */ val Pong: typings.k6.experimentalWebsocketsMod.EventName.Pong & String = js.native
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
    /* 2 */ val Binary: typings.k6.experimentalWebsocketsMod.MessageType.Binary & Double = js.native
    
    /**
      * The message is a close control message. The optional message
      * payload contains a numeric code and a text reason.
      */
    @js.native
    sealed trait Close
      extends StObject
         with MessageType
    /* 8 */ val Close: typings.k6.experimentalWebsocketsMod.MessageType.Close & Double = js.native
    
    /**
      * The message is a ping control message. The optional message
      * payload is UTF-8 encoded text.
      */
    @js.native
    sealed trait PingMessage
      extends StObject
         with MessageType
    /* 9 */ val PingMessage: typings.k6.experimentalWebsocketsMod.MessageType.PingMessage & Double = js.native
    
    /**
      * The message is a pong control message. The optional message
      * payload is UTF-8 encoded text.
      */
    @js.native
    sealed trait PongMessage
      extends StObject
         with MessageType
    /* 10 */ val PongMessage: typings.k6.experimentalWebsocketsMod.MessageType.PongMessage & Double = js.native
    
    /**
      * The message is a text message. The text message payload is
      * interpreted as UTF-8 encodedtext data.
      */
    @js.native
    sealed trait Text
      extends StObject
         with MessageType
    /* 1 */ val Text: typings.k6.experimentalWebsocketsMod.MessageType.Text & Double = js.native
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
    /* 3 */ val Closed: typings.k6.experimentalWebsocketsMod.ReadyState.Closed & Double = js.native
    
    /**
      * The connection is in the process of closing.
      */
    @js.native
    sealed trait Closing
      extends StObject
         with ReadyState
    /* 2 */ val Closing: typings.k6.experimentalWebsocketsMod.ReadyState.Closing & Double = js.native
    
    /**
      * Socket has been created. The connection is not yet open.
      */
    @js.native
    sealed trait Connecting
      extends StObject
         with ReadyState
    /* 0 */ val Connecting: typings.k6.experimentalWebsocketsMod.ReadyState.Connecting & Double = js.native
    
    /**
      * The connection is open and ready to communicate.
      */
    @js.native
    sealed trait Open
      extends StObject
         with ReadyState
    /* 1 */ val Open: typings.k6.experimentalWebsocketsMod.ReadyState.Open & Double = js.native
  }
  
  @JSImport("k6/experimental/websockets", "WebSocket")
  @js.native
  open class WebSocket protected () extends StObject {
    /**
      * The Websocket constructor returns a newly created WebSocket object.
      * https://k6.io/docs/javascript-api/k6-experimental/websockets/websocket/
      *
      * @param url - The URL to which to connect; this should be the URL to which the WebSocket server will respond.
      * @param protocols - Either a single protocol string or an array of protocol strings. The param is reserved for future use and will be presently ignored.
      * @param params - Used for setting various WebSocket connection parameters such as headers, cookie jar, compression, etc.
      */
    def this(url: String) = this()
    def this(url: String, protocols: Null, params: Params) = this()
    def this(url: String, protocols: Unit, params: Params) = this()
    
    /**
      * Bind event names to event handlers to be executed when their
      * respective event is received by the server.
      * https://k6.io/docs/javascript-api/k6-experimental/websockets/websocket/websocket-addeventlistener/
      *
      * @param event - the event to listen for
      * @param listener - the callback to invoke when the event is emitted
      */
    def addEventListener(event: EventName, listener: js.Function1[/* event */ MessageEvent | ErrorEvent, Unit]): Unit = js.native
    
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
      * https://k6.io/docs/javascript-api/k6-experimental/websockets/websocket/websocket-close/
      *
      * @param code - An integer WebSocket connection close code value indicating a reason for closure.
      * @param reason - A human-readable string WebSocket connection close reason. No longer than 123 bytes of UTF-8 text.
      */
    def close(): Unit = js.native
    def close(code: Double): Unit = js.native
    def close(code: Double, reason: String): Unit = js.native
    def close(code: Unit, reason: String): Unit = js.native
    
    /**
      * Sets an event handler which is invoked when the WebSocket connection's closes.
      * https://k6.io/docs/javascript-api/k6-experimental/websockets/websocket/websocket-onclose/
      */
    def onclose(): Unit = js.native
    
    /**
      * Sets an event handler which is invoked when errors occur.
      * https://k6.io/docs/javascript-api/k6-experimental/websockets/websocket/websocket-onerror/
      *
      * @param event - the error event
      */
    def onerror(): Unit = js.native
    def onerror(event: ErrorEvent): Unit = js.native
    
    /**
      * Sets an event handler which is invoked when a message event happens.
      * https://k6.io/docs/javascript-api/k6-experimental/websockets/websocket/websocket-onmessage/
      *
      * @param event - the message event
      */
    def onmessage(): Unit = js.native
    def onmessage(event: MessageEvent): Unit = js.native
    
    /**
      * Sets an event handler which is invoked when the WebSocket connection's opens.
      * https://k6.io/docs/javascript-api/k6-experimental/websockets/websocket/websocket-onopen/
      */
    def onopen(): Unit = js.native
    
    /**
      * Sets an event handler which is invoked when a ping message is received.
      * https://k6.io/docs/javascript-api/k6-experimental/websockets/websocket/websocket-onping/
      */
    def onping(): Unit = js.native
    
    /**
      * Sets an event handler which is invoked when a pong message is received.
      * https://k6.io/docs/javascript-api/k6-experimental/websockets/websocket/websocket-onpong/
      */
    def onpong(): Unit = js.native
    
    /**
      * Sends a ping message over the WebSocket connection.
      * https://k6.io/docs/javascript-api/k6-experimental/websockets/websocket/websocket-ping/
      */
    def ping(): Unit = js.native
    
    /**
      * The current state of the Websocket connection.
      */
    val readyState: ReadyState = js.native
    
    /**
      * Enqueues data to be transmitted to the server over the WebSocket connection.
      * https://k6.io/docs/javascript-api/k6-experimental/websockets/websocket/websocket-send/
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
  
  trait ErrorEvent extends StObject {
    
    /**
      * The read-only property that returns the error message.
      */
    var error: String
    
    /**
      * The read-only property that returns the time (in milliseconds) at which the event was created.
      */
    var timestamp: Double
    
    /**
      * the type of the event.
      */
    var `type`: MessageType
  }
  object ErrorEvent {
    
    inline def apply(error: String, timestamp: Double, `type`: MessageType): ErrorEvent = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorEvent] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: MessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageEvent extends StObject {
    
    /**
      * The data sent by the message emitter.
      */
    var data: String | js.typedarray.ArrayBuffer
    
    /**
      * The read-only property that returns the time (in milliseconds) at which the event was created.
      */
    var timestamp: Double
    
    /**
      * the type of the event.
      */
    var `type`: MessageType
  }
  object MessageEvent {
    
    inline def apply(data: String | js.typedarray.ArrayBuffer, timestamp: Double, `type`: MessageType): MessageEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageEvent] (val x: Self) extends AnyVal {
      
      inline def setData(value: String | js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: MessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Params extends StObject {
    
    /**
      * Compression algorithm.
      * If the option is left unset, it defaults to no compression.
      */
    var compression: js.UndefOr[CompressionAlgorithm] = js.undefined
    
    /** Request headers. */
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * The cookie jar that will be used when making the initial HTTP request to establish the WebSocket connection.
      * If empty, the default VU cookie jar will be used.
      */
    var jar: js.UndefOr[CookieJar_] = js.undefined
    
    /** The custom metric tags. */
    var tags: js.UndefOr[Record[String, Double | String | Boolean]] = js.undefined
  }
  object Params {
    
    inline def apply(): Params = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      inline def setCompression(value: CompressionAlgorithm): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setJar(value: CookieJar_): Self = StObject.set(x, "jar", value.asInstanceOf[js.Any])
      
      inline def setJarUndefined: Self = StObject.set(x, "jar", js.undefined)
      
      inline def setTags(value: Record[String, Double | String | Boolean]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
