package typings.koaWebsocket.mod

import typings.ws.mod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-websocket", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[StateT, CustomT](app: typings.koa.mod.^[StateT, CustomT]): App[StateT, CustomT] = js.native
  def apply[StateT, CustomT](app: typings.koa.mod.^[StateT, CustomT], wsOptions: ServerOptions): App[StateT, CustomT] = js.native
  def apply[StateT, CustomT](
    app: typings.koa.mod.^[StateT, CustomT],
    wsOptions: ServerOptions,
    httpsOptions: typings.node.httpsMod.ServerOptions
  ): App[StateT, CustomT] = js.native
}

