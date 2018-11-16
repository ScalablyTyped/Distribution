package typings
package koaDashWebsocketLib.koaDashWebsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-websocket", JSImport.Namespace)
@js.native
object koaDashWebsocketModMembers extends js.Object {
  def apply(app: koaLib.koaMod.namespaced): koaDashWebsocketLib.koaDashWebsocketMod.KoaWebsocketNs.App = js.native
  def apply(app: koaLib.koaMod.namespaced, wsOptions: wsLib.wsMod.WebSocketNs.ServerOptions): koaDashWebsocketLib.koaDashWebsocketMod.KoaWebsocketNs.App = js.native
  def apply(
    app: koaLib.koaMod.namespaced,
    wsOptions: wsLib.wsMod.WebSocketNs.ServerOptions,
    httpsOptions: nodeLib.httpsMod.ServerOptions
  ): koaDashWebsocketLib.koaDashWebsocketMod.KoaWebsocketNs.App = js.native
}

