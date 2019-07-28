package typings.koaDashWebsocket.koaDashWebsocketMod

import typings.ws.wsMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-websocket", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[StateT, CustomT](app: typings.koa.koaMod.^[StateT, CustomT]): App[StateT, CustomT] = js.native
  def apply[StateT, CustomT](app: typings.koa.koaMod.^[StateT, CustomT], wsOptions: ServerOptions): App[StateT, CustomT] = js.native
  def apply[StateT, CustomT](
    app: typings.koa.koaMod.^[StateT, CustomT],
    wsOptions: ServerOptions,
    httpsOptions: typings.node.httpsMod.ServerOptions
  ): App[StateT, CustomT] = js.native
}

