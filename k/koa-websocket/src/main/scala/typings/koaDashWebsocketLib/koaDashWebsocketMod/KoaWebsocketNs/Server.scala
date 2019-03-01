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
    listen: js.Function1[wsLib.wsMod.WebSocketNs.ServerOptions, wsLib.wsMod.Server],
    middleware: js.Array[Middleware],
    onConnection: js.Function2[wsLib.wsMod.namespaced, nodeLib.httpMod.IncomingMessage, scala.Unit],
    use: js.Function1[Middleware, Server],
    server: wsLib.wsMod.Server = null
  ): Server = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app")(app)
    __obj.updateDynamic("listen")(listen)
    __obj.updateDynamic("middleware")(middleware)
    __obj.updateDynamic("onConnection")(onConnection)
    __obj.updateDynamic("use")(use)
    if (server != null) __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[Server]
  }
}

