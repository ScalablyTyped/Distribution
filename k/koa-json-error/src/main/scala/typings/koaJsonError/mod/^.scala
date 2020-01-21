package typings.koaJsonError.mod

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-json-error", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Error handler for pure Koa 2.0.0+ JSON apps
    */
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(options: JSONErrorOptions): Middleware[DefaultState, DefaultContext] = js.native
}

