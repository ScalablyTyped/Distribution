package typings.itWs

import typings.itStreamTypes.mod.Sink
import typings.itWs.distSrcClientMod.WebSocketOptions
import typings.itWs.distSrcDuplexMod.DuplexWebSocket
import typings.itWs.distSrcDuplexMod.DuplexWebSocketOptions
import typings.itWs.distSrcServerMod.ServerOptions
import typings.itWs.distSrcServerMod.WebSocketServer
import typings.itWs.distSrcSinkMod.SinkOptions
import typings.itWs.distSrcSourceMod.ConnectedSource
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-ws", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(addr: String): DuplexWebSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(addr.asInstanceOf[js.Any]).asInstanceOf[DuplexWebSocket]
  inline def connect(addr: String, opts: WebSocketOptions): DuplexWebSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(addr.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DuplexWebSocket]
  
  inline def createServer(): WebSocketServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[WebSocketServer]
  inline def createServer(opts: ServerOptions): WebSocketServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(opts.asInstanceOf[js.Any]).asInstanceOf[WebSocketServer]
  
  inline def duplex(socket: WebSocket): DuplexWebSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("duplex")(socket.asInstanceOf[js.Any]).asInstanceOf[DuplexWebSocket]
  inline def duplex(socket: WebSocket, options: DuplexWebSocketOptions): DuplexWebSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("duplex")(socket.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DuplexWebSocket]
  
  inline def sink(socket: WebSocket, options: SinkOptions): Sink[js.typedarray.Uint8Array, js.Promise[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sink")(socket.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sink[js.typedarray.Uint8Array, js.Promise[Unit]]]
  
  inline def source(socket: WebSocket): ConnectedSource = ^.asInstanceOf[js.Dynamic].applyDynamic("source")(socket.asInstanceOf[js.Any]).asInstanceOf[ConnectedSource]
}
