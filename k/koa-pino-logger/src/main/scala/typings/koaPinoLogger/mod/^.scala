package typings.koaPinoLogger.mod

import typings.pino.mod.DestinationStream
import typings.pinoHttp.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa-pino-logger", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): Middleware = js.native
  def apply(opts: js.UndefOr[scala.Nothing], stream: DestinationStream): Middleware = js.native
  def apply(opts: Options): Middleware = js.native
  def apply(opts: Options, stream: DestinationStream): Middleware = js.native
  def apply(stream: DestinationStream): Middleware = js.native
}
