package typings.koaDashJsonDashError.koaDashJsonDashErrorMod

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
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

