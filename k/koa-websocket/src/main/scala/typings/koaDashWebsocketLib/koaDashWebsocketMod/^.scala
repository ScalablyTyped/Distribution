package typings
package koaDashWebsocketLib.koaDashWebsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-websocket", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[StateT, CustomT](app: koaLib.koaMod.^[StateT, CustomT]): App[StateT, CustomT] = js.native
  def apply[StateT, CustomT](app: koaLib.koaMod.^[StateT, CustomT], wsOptions: wsLib.wsMod.ServerOptions): App[StateT, CustomT] = js.native
  def apply[StateT, CustomT](
    app: koaLib.koaMod.^[StateT, CustomT],
    wsOptions: wsLib.wsMod.ServerOptions,
    httpsOptions: nodeLib.httpsMod.ServerOptions
  ): App[StateT, CustomT] = js.native
}

