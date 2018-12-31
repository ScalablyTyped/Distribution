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

