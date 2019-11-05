package typings.koaDashDocs.koaDashDocsMod

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
import typings.koaDashDocs.koaDashDocsMod.koaDocs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-docs", "get")
@js.native
object get extends js.Object {
  def apply(path: String, options: Options): Middleware[DefaultState, DefaultContext] = js.native
}

