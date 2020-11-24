package typings.koaWebsocket.mod

import typings.node.httpsMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa-websocket", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply[StateT, CustomT](app: typings.koa.mod.^[StateT, CustomT]): App[StateT, CustomT] = js.native
  def apply[StateT, CustomT](
    app: typings.koa.mod.^[StateT, CustomT],
    wsOptions: js.UndefOr[scala.Nothing],
    httpsOptions: ServerOptions
  ): App[StateT, CustomT] = js.native
  def apply[StateT, CustomT](app: typings.koa.mod.^[StateT, CustomT], wsOptions: typings.ws.mod.ServerOptions): App[StateT, CustomT] = js.native
  def apply[StateT, CustomT](
    app: typings.koa.mod.^[StateT, CustomT],
    wsOptions: typings.ws.mod.ServerOptions,
    httpsOptions: ServerOptions
  ): App[StateT, CustomT] = js.native
}
