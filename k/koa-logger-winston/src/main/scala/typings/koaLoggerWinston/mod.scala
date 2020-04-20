package typings.koaLoggerWinston

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.winston.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-logger-winston", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(logger: Logger): Middleware[DefaultState, DefaultContext] = js.native
}

