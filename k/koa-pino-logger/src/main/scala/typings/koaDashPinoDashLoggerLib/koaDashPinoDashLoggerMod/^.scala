package typings
package koaDashPinoDashLoggerLib.koaDashPinoDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-pino-logger", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  def apply(opts: pinoDashHttpLib.pinoDashHttpMod.PinoHttpNs.Options): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  def apply(
    opts: pinoDashHttpLib.pinoDashHttpMod.PinoHttpNs.Options,
    stream: pinoLib.pinoMod.PNs.DestinationStream
  ): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  def apply(stream: pinoLib.pinoMod.PNs.DestinationStream): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
}

