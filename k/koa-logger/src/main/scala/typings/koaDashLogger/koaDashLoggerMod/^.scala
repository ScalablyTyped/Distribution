package typings.koaDashLogger.koaDashLoggerMod

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-logger", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: Transporter | TransporterOpts): Middleware[DefaultState, DefaultContext] = js.native
}

