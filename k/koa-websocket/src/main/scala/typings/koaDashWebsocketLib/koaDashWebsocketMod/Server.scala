package typings
package koaDashWebsocketLib.koaDashWebsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-websocket", "Server")
@js.native
class Server protected () extends js.Object {
  def this(app: koaLib.koaMod.^[_, js.Object]) = this()
  var app: App = js.native
  var middleware: js.Array[Middleware] = js.native
  var server: js.UndefOr[wsLib.wsMod.Server] = js.native
  def listen(options: wsLib.wsMod.ServerOptions): wsLib.wsMod.Server = js.native
  def onConnection(socket: wsLib.wsMod.^, request: nodeLib.httpMod.IncomingMessage): scala.Unit = js.native
  def use(middleware: Middleware): this.type = js.native
}

