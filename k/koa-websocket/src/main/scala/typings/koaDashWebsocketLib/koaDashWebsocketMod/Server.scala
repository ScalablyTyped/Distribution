package typings
package koaDashWebsocketLib.koaDashWebsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-websocket", "Server")
@js.native
class Server protected ()
  extends koaDashWebsocketLib.koaDashWebsocketMod.KoaWebsocketNs.Server {
  def this(app: koaLib.koaMod.namespaced) = this()
  /* CompleteClass */
  override var app: koaDashWebsocketLib.koaDashWebsocketMod.KoaWebsocketNs.App = js.native
  /* CompleteClass */
  override var middleware: js.Array[koaDashWebsocketLib.koaDashWebsocketMod.KoaWebsocketNs.Middleware] = js.native
  /* CompleteClass */
  override def listen(options: wsLib.wsMod.WebSocketNs.ServerOptions): wsLib.wsMod.Server = js.native
  /* CompleteClass */
  override def onConnection(socket: wsLib.wsMod.namespaced, request: nodeLib.httpMod.IncomingMessage): scala.Unit = js.native
  /* CompleteClass */
  override def use(middleware: koaDashWebsocketLib.koaDashWebsocketMod.KoaWebsocketNs.Middleware): this.type = js.native
}

