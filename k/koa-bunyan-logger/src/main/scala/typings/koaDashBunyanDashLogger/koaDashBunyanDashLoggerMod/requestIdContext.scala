package typings.koaDashBunyanDashLogger.koaDashBunyanDashLoggerMod

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-bunyan-logger", "requestIdContext")
@js.native
object requestIdContext extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: RequestIdContextOptions): Middleware[DefaultState, DefaultContext] = js.native
}

