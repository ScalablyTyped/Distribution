package typings.k6

import org.scalablytyped.runtime.StringDictionary
import typings.k6.httpMod.CookieJar_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wsMod {
  
  @JSImport("k6/ws", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This module provides a WebSocket client implementing the WebSocket protocol.
    * https://k6.io/docs/javascript-api/k6-ws/
    */
  object default {
    
    @JSImport("k6/ws", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Open WebSocket connection.
      * https://k6.io/docs/javascript-api/k6-ws/connect-url-params-callback/
      * @param url - Request URL.
      * @param callback - Logic to execute with socket.
      * @returns HTTP response to connection request.
      * @example
      * let res = ws.connect(url, function(socket) {
      *   socket.on('open', function() {
      *     console.log('WebSocket connection established!');
      *     socket.close();
      *   });
      * });
      */
    inline def connect(url: String, callback: Executor): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Response]
    inline def connect(url: String, params: Null, callback: Executor): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Response]
    /**
      * Open WebSocket connection.
      * https://k6.io/docs/javascript-api/k6-ws/connect-url-params-callback/
      * @param url - Request URL.
      * @param params - Request parameters.
      * @param callback - Logic to execute with socket.
      * @returns HTTP response to connection request.
      * @example
      * let res = ws.connect(url, { param1: true } , function(socket) {
      *   socket.on('open', function() {
      *     console.log('WebSocket connection established!');
      *     socket.close();
      *   });
      * });
      */
    inline def connect(url: String, params: Params, callback: Executor): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Response]
  }
  
  /* note: abstract class */ @JSImport("k6/ws", "Socket")
  @js.native
  open class Socket () extends StObject {
    
    /**
      * Close connection.
      * https://k6.io/docs/javascript-api/k6-ws/socket/socket-close/
      * @param code - WebSocket status code.
      * @example
      * socket.close();
      */
    def close(): Unit = js.native
    def close(code: Double): Unit = js.native
    
    /**
      * Listen to event.
      * https://k6.io/docs/javascript-api/k6-ws/socket/socket-on-event-callback/
      * @param event - Event type.
      * @param handler - Event handler.
      * @example
      * socket.on('message', function(message) {
      *   console.log(`Received message: ${message}`);
      * });
      * socket.on('close', function() {
      *   console.log('disconnected');
      * });
      */
    def on[ET /* <: EventType */](event: ET, handler: EventHandler[ET]): Unit = js.native
    
    /**
      * Send ping.
      * https://k6.io/docs/javascript-api/k6-ws/socket/socket-ping/
      * @example
      * socket.ping();
      */
    def ping(): Unit = js.native
    
    /**
      * Send data.
      * https://k6.io/docs/javascript-api/k6-ws/socket/socket-send-data/
      * @param data - Data to send.
      * @example
      * socket.send(JSON.stringify({ data: 'hola' }));
      */
    def send(data: String): Unit = js.native
    
    /**
      * Send data.
      * @param data - Data to send.
      * @example
      * const binFile = open('./file.pdf', 'b');
      * export default function () {
      *   ws.connect('http://wshost/', function(socket) {
      *     socket.on('open', function() {
      *       socket.sendBinary(binFile);
      *     });
      *     socket.on('binaryMessage', function(msg) {
      *       // msg is an ArrayBuffer, so we can wrap it in a typed array directly.
      *       new Uint8Array(msg);
      *     });
      *   });
      * }
      */
    def sendBinary(data: js.typedarray.ArrayBuffer): Unit = js.native
    
    /**
      * Call a function repeatedly, while the WebSocket connection is open.
      * https://k6.io/docs/javascript-api/k6-ws/socket/socket-setinterval-callback-interval/
      * @param handler - The function to call every `interval` milliseconds.
      * @param interval - Milliseconds between two calls to `callback`.
      * @example
      * socket.setInterval(function timeout() {
      *  socket.ping();
      *  console.log('Pinging every 1sec (setInterval test)');
      * }, 1000);
      */
    def setInterval(handler: TimerHandler, interval: Double): Unit = js.native
    
    /**
      * Call a function at a later time,
      * if the WebSocket connection is still open then.
      * https://k6.io/docs/javascript-api/k6-ws/socket/socket-settimeout-callback-delay/
      * @param handler - The function to call when `delay` has expired.
      * @param delay - Delay in milliseconds.
      * @example
      * socket.setTimeout(function timeout() {
      *  console.log('Call after 1second');
      * }, 1000);
      */
    def setTimeout(handler: TimerHandler, delay: Double): Unit = js.native
  }
  
  /* note: abstract class */ @JSImport("k6/ws", "WebSocketError")
  @js.native
  open class WebSocketError () extends StObject {
    
    /** Error message. */
    def error(): String = js.native
  }
  
  inline def connect(url: String, callback: Executor): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Response]
  inline def connect(url: String, params: Null, callback: Executor): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Response]
  inline def connect(url: String, params: Params, callback: Executor): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Response]
  
  type BinaryMessageEventHandler = js.Function1[/* message */ js.typedarray.ArrayBuffer, Unit]
  
  type CloseEventHandler = js.Function1[/* code */ Double, Unit]
  
  type ErrorEventHandler = js.Function1[/* error */ WebSocketError, Unit]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ET extends 'close' ? k6.k6/ws.CloseEventHandler : ET extends 'error' ? k6.k6/ws.ErrorEventHandler : ET extends 'message' ? k6.k6/ws.MessageEventHandler : ET extends 'binaryMessage' ? k6.k6/ws.BinaryMessageEventHandler : ET extends 'open' ? k6.k6/ws.OpenEventHandler : ET extends 'ping' ? k6.k6/ws.PingEventHandler : ET extends 'pong' ? k6.k6/ws.PongEventHandler : never
    }}}
    */
  @js.native
  trait EventHandler[ET /* <: EventType */] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.k6.k6Strings.close
    - typings.k6.k6Strings.error
    - typings.k6.k6Strings.message
    - typings.k6.k6Strings.open
    - typings.k6.k6Strings.ping
    - typings.k6.k6Strings.pong
    - typings.k6.k6Strings.binaryMessage
  */
  trait EventType extends StObject
  object EventType {
    
    inline def binaryMessage: typings.k6.k6Strings.binaryMessage = "binaryMessage".asInstanceOf[typings.k6.k6Strings.binaryMessage]
    
    inline def close: typings.k6.k6Strings.close = "close".asInstanceOf[typings.k6.k6Strings.close]
    
    inline def error: typings.k6.k6Strings.error = "error".asInstanceOf[typings.k6.k6Strings.error]
    
    inline def message: typings.k6.k6Strings.message = "message".asInstanceOf[typings.k6.k6Strings.message]
    
    inline def open: typings.k6.k6Strings.open = "open".asInstanceOf[typings.k6.k6Strings.open]
    
    inline def ping: typings.k6.k6Strings.ping = "ping".asInstanceOf[typings.k6.k6Strings.ping]
    
    inline def pong: typings.k6.k6Strings.pong = "pong".asInstanceOf[typings.k6.k6Strings.pong]
  }
  
  type Executor = js.Function1[/* socket */ Socket, Unit]
  
  type MessageEventHandler = js.Function1[/* message */ String, Unit]
  
  type OpenEventHandler = js.Function0[Unit]
  
  trait Params extends StObject {
    
    /**
      * Compression algorithm. The only supported algorithm is `deflate`.
      * If the option is left unset or empty, it defaults to no compression.
      */
    var compression: js.UndefOr[String] = js.undefined
    
    /** Request headers. */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The cookie jar that will be used when making the initial HTTP request to establish the WebSocket connection.
      * If empty, the default VU cookie jar will be used.
      */
    var jar: js.UndefOr[CookieJar_] = js.undefined
    
    /** Response time metric tags. */
    var tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object Params {
    
    inline def apply(): Params = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Params]
    }
    
    extension [Self <: Params](x: Self) {
      
      inline def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setJar(value: CookieJar_): Self = StObject.set(x, "jar", value.asInstanceOf[js.Any])
      
      inline def setJarUndefined: Self = StObject.set(x, "jar", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  type PingEventHandler = js.Function0[Unit]
  
  type PongEventHandler = js.Function0[Unit]
  
  trait Response extends StObject {
    
    /** Response body. */
    var body: String
    
    /** Non-HTTP error message. */
    var error: String
    
    /** Response headers. */
    var headers: StringDictionary[String]
    
    /** HTTP status code. */
    var status: Double
    
    /** Fetched URL. May differ from request URL due to redirects. */
    var url: String
  }
  object Response {
    
    inline def apply(body: String, error: String, headers: StringDictionary[String], status: Double, url: String): Response = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type TimerHandler = js.Function0[Unit]
}
