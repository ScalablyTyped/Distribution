package typings.k6

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wsMod {
  
  @JSImport("k6/ws", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This module provides a WebSocket client implementing the WebSocket protocol.
    * https://k6.io/docs/javascript-api/k6-ws
    */
  object default {
    
    @JSImport("k6/ws", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Open WebSocket connection.
      * https://k6.io/docs/javascript-api/k6-ws/connect-url-params-callback
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
      * https://k6.io/docs/javascript-api/k6-ws/connect-url-params-callback
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
  
  @JSImport("k6/ws", "Socket")
  @js.native
  abstract class Socket () extends StObject {
    
    /**
      * Close connection.
      * https://k6.io/docs/javascript-api/k6-ws/socket/socket-close
      * @param code - WebSocket status code.
      * @example
      * socket.close();
      */
    def close(): Unit = js.native
    def close(code: Double): Unit = js.native
    
    /**
      * Listen to event.
      * https://k6.io/docs/javascript-api/k6-ws/socket/socket-on-event-callback
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
      * https://k6.io/docs/javascript-api/k6-ws/socket/socket-ping
      * @example
      * socket.ping();
      */
    def ping(): Unit = js.native
    
    /**
      * Send data.
      * https://k6.io/docs/javascript-api/k6-ws/socket/socket-send-data
      * @param data - Data to send.
      * @example
      * socket.send(JSON.stringify({ data: 'hola' }));
      */
    def send(data: String): Unit = js.native
    
    /**
      * Call a function repeatedly, while the WebSocket connection is open.
      * https://k6.io/docs/javascript-api/k6-ws/socket/socket-setinterval-callback-interval
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
      * https://k6.io/docs/javascript-api/k6-ws/socket/socket-settimeout-callback-delay
      * @param handler - The function to call when `delay` has expired.
      * @param delay - Delay in milliseconds.
      * @example
      * socket.setTimeout(function timeout() {
      *  console.log('Call after 1second');
      * }, 1000);
      */
    def setTimeout(handler: TimerHandler, delay: Double): Unit = js.native
  }
  
  @JSImport("k6/ws", "WebSocketError")
  @js.native
  abstract class WebSocketError () extends StObject {
    
    /** Error message. */
    def error(): String = js.native
  }
  
  inline def connect(url: String, callback: Executor): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Response]
  inline def connect(url: String, params: Null, callback: Executor): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Response]
  inline def connect(url: String, params: Params, callback: Executor): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Response]
  
  type CloseEventHandler = js.Function1[/* code */ Double, Unit]
  
  type ErrorEventHandler = js.Function1[/* error */ WebSocketError, Unit]
  
  type EventHandler[ET /* <: EventType */] = PongEventHandler | PingEventHandler | OpenEventHandler | MessageEventHandler | ErrorEventHandler | CloseEventHandler
  
  /* Rewritten from type alias, can be one of: 
    - typings.k6.k6Strings.close
    - typings.k6.k6Strings.error
    - typings.k6.k6Strings.message
    - typings.k6.k6Strings.open
    - typings.k6.k6Strings.ping
    - typings.k6.k6Strings.pong
  */
  trait EventType extends StObject
  object EventType {
    
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
    
    /** Request headers. */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /** Response time metric tags. */
    var tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object Params {
    
    inline def apply(): Params = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Params]
    }
    
    extension [Self <: Params](x: Self) {
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
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
  
  /**
    * This module provides a WebSocket client implementing the WebSocket protocol.
    * https://k6.io/docs/javascript-api/k6-ws
    */
  object ws
}
