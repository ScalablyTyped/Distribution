package typings.koaWebpack.mod

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-webpack", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Promise[(Middleware[DefaultState, DefaultContext]) with CombinedWebpackMiddleware] = js.native
  def apply(options: Options): js.Promise[(Middleware[DefaultState, DefaultContext]) with CombinedWebpackMiddleware] = js.native
}

