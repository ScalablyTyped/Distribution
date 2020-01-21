package typings.koaViews.mod

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaViews.AnonAutoRender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-views", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(dir: String): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: String, opts: AnonAutoRender): Middleware[DefaultState, DefaultContext] = js.native
}

