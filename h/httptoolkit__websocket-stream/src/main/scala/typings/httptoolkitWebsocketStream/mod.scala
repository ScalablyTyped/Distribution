package typings.httptoolkitWebsocketStream

import typings.httptoolkitWebsocketStream.httptoolkitWebsocketStreamStrings.`ws-close`
import typings.httptoolkitWebsocketStream.httptoolkitWebsocketStreamStrings.connection
import typings.httptoolkitWebsocketStream.httptoolkitWebsocketStreamStrings.error
import typings.httptoolkitWebsocketStream.httptoolkitWebsocketStreamStrings.headers
import typings.httptoolkitWebsocketStream.httptoolkitWebsocketStreamStrings.listening
import typings.httptoolkitWebsocketStream.httptoolkitWebsocketStreamStrings.stream
import typings.node.httpMod.IncomingMessage
import typings.node.streamMod.Duplex
import typings.ws.mod.CloseEvent
import typings.ws.mod.ServerOptions
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(target: String): WebSocketDuplex = ^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any]).asInstanceOf[WebSocketDuplex]
  inline def apply(target: String, options: ClientOptions): WebSocketDuplex = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebSocketDuplex]
  inline def apply(target: String, protocols: String): WebSocketDuplex = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any])).asInstanceOf[WebSocketDuplex]
  inline def apply(target: String, protocols: String, options: ClientOptions): WebSocketDuplex = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebSocketDuplex]
  inline def apply(target: String, protocols: js.Array[String]): WebSocketDuplex = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any])).asInstanceOf[WebSocketDuplex]
  inline def apply(target: String, protocols: js.Array[String], options: ClientOptions): WebSocketDuplex = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebSocketDuplex]
  inline def apply(target: String, protocols: Unit, options: ClientOptions): WebSocketDuplex = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebSocketDuplex]
  inline def apply(target: WebSocket): WebSocketDuplex = ^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any]).asInstanceOf[WebSocketDuplex]
  inline def apply(target: WebSocket, options: ClientOptions): WebSocketDuplex = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebSocketDuplex]
  inline def apply(target: WebSocket, protocols: String): WebSocketDuplex = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any])).asInstanceOf[WebSocketDuplex]
  inline def apply(target: WebSocket, protocols: String, options: ClientOptions): WebSocketDuplex = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebSocketDuplex]
  inline def apply(target: WebSocket, protocols: js.Array[String]): WebSocketDuplex = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any])).asInstanceOf[WebSocketDuplex]
  inline def apply(target: WebSocket, protocols: js.Array[String], options: ClientOptions): WebSocketDuplex = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebSocketDuplex]
  inline def apply(target: WebSocket, protocols: Unit, options: ClientOptions): WebSocketDuplex = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebSocketDuplex]
  
  @JSImport("@httptoolkit/websocket-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@httptoolkit/websocket-stream", "Server")
  @js.native
  open class Server ()
    extends typings.ws.mod.Server[WebSocket] {
    def this(options: ServerOptions) = this()
    def this(options: Unit, callback: js.Function0[Unit]) = this()
    def this(options: ServerOptions, callback: js.Function0[Unit]) = this()
    
    @JSName("on")
    def on_connection(
      event: connection,
      cb: js.ThisFunction2[
          /* this */ typings.ws.mod.Server[WebSocket], 
          /* socket */ WebSocket, 
          /* request */ IncomingMessage, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_error(
      event: error,
      cb: js.ThisFunction1[/* this */ typings.ws.mod.Server[WebSocket], /* error */ js.Error, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_headers(
      event: headers,
      cb: js.ThisFunction2[
          /* this */ typings.ws.mod.Server[WebSocket], 
          /* headers */ js.Array[String], 
          /* request */ IncomingMessage, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_listening(event: listening, cb: js.ThisFunction0[/* this */ typings.ws.mod.Server[WebSocket], Unit]): this.type = js.native
    @JSName("on")
    def on_stream(
      event: stream,
      cb: js.ThisFunction2[
          /* this */ typings.ws.mod.Server[WebSocket], 
          /* stream */ WebSocketDuplex, 
          /* request */ IncomingMessage, 
          Unit
        ]
    ): this.type = js.native
  }
  
  inline def createServer(): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[Server]
  inline def createServer(opts: Unit, callback: js.Function0[Unit]): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Server]
  inline def createServer(opts: ServerOptions): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(opts.asInstanceOf[js.Any]).asInstanceOf[Server]
  inline def createServer(opts: ServerOptions, callback: js.Function0[Unit]): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Server]
  
  trait ClientOptions
    extends StObject
       with typings.ws.mod.ClientOptions {
    
    var binary: js.UndefOr[Boolean] = js.undefined
    
    var browserBufferSize: js.UndefOr[Double] = js.undefined
    
    var browserBufferTimeout: js.UndefOr[Double] = js.undefined
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    extension [Self <: ClientOptions](x: Self) {
      
      inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setBrowserBufferSize(value: Double): Self = StObject.set(x, "browserBufferSize", value.asInstanceOf[js.Any])
      
      inline def setBrowserBufferSizeUndefined: Self = StObject.set(x, "browserBufferSize", js.undefined)
      
      inline def setBrowserBufferTimeout(value: Double): Self = StObject.set(x, "browserBufferTimeout", value.asInstanceOf[js.Any])
      
      inline def setBrowserBufferTimeoutUndefined: Self = StObject.set(x, "browserBufferTimeout", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    }
  }
  
  @js.native
  trait WebSocketDuplex extends Duplex {
    
    @JSName("on")
    def on_wsclose(event: `ws-close`, listener: js.Function1[/* close */ CloseEvent, Unit]): WebSocketDuplex = js.native
    
    var socket: WebSocket = js.native
  }
}
