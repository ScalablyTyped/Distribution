package typings.koaDashBunyanDashLogger.koaDashBunyanDashLoggerMod

import typings.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-bunyan-logger", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Middleware[_, js.Object] = js.native
  def apply(logger: typings.bunyan.bunyanMod.^): Middleware[_, js.Object] = js.native
  def requestIdContext(): Middleware[_, js.Object] = js.native
  def requestIdContext(opts: RequestIdContextOptions): Middleware[_, js.Object] = js.native
  def requestLogger(): Middleware[_, js.Object] = js.native
  def requestLogger(opts: RequestLoggerOptions): Middleware[_, js.Object] = js.native
}

