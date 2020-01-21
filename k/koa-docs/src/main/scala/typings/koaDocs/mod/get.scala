package typings.koaDocs.mod

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaDocs.mod.koaDocs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-docs", "get")
@js.native
object get extends js.Object {
  def apply(path: String, options: Options): Middleware[DefaultState, DefaultContext] = js.native
}

