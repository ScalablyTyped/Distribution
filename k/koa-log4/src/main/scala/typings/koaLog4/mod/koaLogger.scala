package typings.koaLog4.mod

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-log4", "koaLogger")
@js.native
object koaLogger extends js.Object {
  def apply(logger4js: typings.log4js.mod.Logger): Middleware[DefaultState, DefaultContext] = js.native
  def apply(logger4js: typings.log4js.mod.Logger, optionsOrFormat: String): Middleware[DefaultState, DefaultContext] = js.native
  def apply(logger4js: typings.log4js.mod.Logger, optionsOrFormat: Options): Middleware[DefaultState, DefaultContext] = js.native
}

