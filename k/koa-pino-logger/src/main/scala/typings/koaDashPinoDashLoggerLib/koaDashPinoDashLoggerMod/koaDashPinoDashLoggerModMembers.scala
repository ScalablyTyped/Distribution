package typings
package koaDashPinoDashLoggerLib.koaDashPinoDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-pino-logger", JSImport.Namespace)
@js.native
object koaDashPinoDashLoggerModMembers extends js.Object {
  def apply(): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def apply(opts: koaDashPinoDashLoggerLib.koaDashPinoDashLoggerMod.loggerNs.HttpLoggerOptions): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def apply(
    opts: koaDashPinoDashLoggerLib.koaDashPinoDashLoggerMod.loggerNs.HttpLoggerOptions,
    stream: nodeLib.streamMod.Writable | nodeLib.streamMod.Duplex | nodeLib.streamMod.Transform
  ): koaLib.koaMod.ApplicationNs.Middleware = js.native
}

