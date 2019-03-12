package typings
package koaDashWebsocketLib.koaDashWebsocketMod.KoaWebsocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  var app: App
  var middleware: js.Array[Middleware]
  var server: js.UndefOr[wsLib.wsMod.Server] = js.undefined
  def listen(options: wsLib.wsMod.WebSocketNs.ServerOptions): wsLib.wsMod.Server
  def onConnection(socket: wsLib.wsMod.namespaced, request: nodeLib.httpMod.IncomingMessage): scala.Unit
  def use(middleware: Middleware): this.type
}

object Server {
  @scala.inline
  def apply(
    app: App,
    listen: wsLib.wsMod.WebSocketNs.ServerOptions => wsLib.wsMod.Server,
    middleware: js.Array[Middleware],
    onConnection: (wsLib.wsMod.namespaced, nodeLib.httpMod.IncomingMessage) => scala.Unit,
    use: Middleware => Server,
    server: wsLib.wsMod.Server = null
  ): Server = {
    val __obj = js.Dynamic.literal(app = app, listen = js.Any.fromFunction1(listen), middleware = middleware, onConnection = js.Any.fromFunction2(onConnection), use = js.Any.fromFunction1(use))
    if (server != null) __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[Server]
  }
}

