package typings.koaDashWebsocket.koaDashWebsocketMod

import typings.koa.koaMod.^
import typings.node.httpMod.IncomingMessage
import typings.ws.wsMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-websocket", "Server")
@js.native
class Server[StateT, CustomT] protected () extends js.Object {
  def this(app: ^[StateT, CustomT]) = this()
  var app: App[StateT, CustomT] = js.native
  var middleware: js.Array[Middleware[StateT, CustomT]] = js.native
  var server: js.UndefOr[typings.ws.wsMod.Server] = js.native
  def listen(options: ServerOptions): typings.ws.wsMod.Server = js.native
  def onConnection(socket: typings.ws.wsMod.^, request: IncomingMessage): Unit = js.native
  def use(middleware: Middleware[StateT, CustomT]): this.type = js.native
}

