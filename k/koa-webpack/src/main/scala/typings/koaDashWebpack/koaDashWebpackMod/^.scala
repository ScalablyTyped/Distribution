package typings.koaDashWebpack.koaDashWebpackMod

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-webpack", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Promise[(Middleware[DefaultState, DefaultContext]) with CombinedWebpackMiddleware] = js.native
  def apply(options: Options): js.Promise[(Middleware[DefaultState, DefaultContext]) with CombinedWebpackMiddleware] = js.native
}

