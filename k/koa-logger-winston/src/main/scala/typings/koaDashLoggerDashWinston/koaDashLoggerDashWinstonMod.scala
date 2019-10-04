package typings.koaDashLoggerDashWinston

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
import typings.winston.winstonMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-logger-winston", JSImport.Namespace)
@js.native
object koaDashLoggerDashWinstonMod extends js.Object {
  def apply(logger: Logger): Middleware[DefaultState, DefaultContext] = js.native
}

