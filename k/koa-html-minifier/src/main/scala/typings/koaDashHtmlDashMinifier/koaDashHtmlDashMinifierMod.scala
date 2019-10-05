package typings.koaDashHtmlDashMinifier

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
import typings.koaDashHtmlDashMinifier.koaDashHtmlDashMinifierMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-html-minifier", JSImport.Namespace)
@js.native
object koaDashHtmlDashMinifierMod extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(options: Options): Middleware[DefaultState, DefaultContext] = js.native
  type Options = typings.htmlDashMinifier.htmlDashMinifierMod.Options
}

