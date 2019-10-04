package typings.koaDashPinoDashLogger.koaDashPinoDashLoggerMod

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
import typings.pino.pinoMod.DestinationStream
import typings.pinoDashHttp.pinoDashHttpMod.Options
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

