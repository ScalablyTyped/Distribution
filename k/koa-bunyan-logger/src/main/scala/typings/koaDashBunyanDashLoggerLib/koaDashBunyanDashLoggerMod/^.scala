package typings
package koaDashBunyanDashLoggerLib.koaDashBunyanDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-bunyan-logger", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def apply(logger: bunyanLib.bunyanMod.^): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def requestIdContext(): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def requestIdContext(opts: RequestIdContextOptions): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def requestLogger(): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def requestLogger(opts: RequestLoggerOptions): koaLib.koaMod.Middleware[_, js.Object] = js.native
}

