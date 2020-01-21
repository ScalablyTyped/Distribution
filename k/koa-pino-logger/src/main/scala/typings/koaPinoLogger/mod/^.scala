package typings.koaPinoLogger.mod

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.pino.mod.DestinationStream
import typings.pinoHttp.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-pino-logger", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: Options): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: Options, stream: DestinationStream): Middleware[DefaultState, DefaultContext] = js.native
  def apply(stream: DestinationStream): Middleware[DefaultState, DefaultContext] = js.native
}

