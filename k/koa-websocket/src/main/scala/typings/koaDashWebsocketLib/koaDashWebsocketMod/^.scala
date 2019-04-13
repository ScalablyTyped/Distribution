package typings
package koaDashWebsocketLib.koaDashWebsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-websocket", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(app: koaLib.koaMod.^[_, js.Object]): App = js.native
  def apply(app: koaLib.koaMod.^[_, js.Object], wsOptions: wsLib.wsMod.ServerOptions): App = js.native
  def apply(
    app: koaLib.koaMod.^[_, js.Object],
    wsOptions: wsLib.wsMod.ServerOptions,
    httpsOptions: nodeLib.httpsMod.ServerOptions
  ): App = js.native
}

