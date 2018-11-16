package typings
package koaDashPinoDashLoggerLib.koaDashPinoDashLoggerMod.loggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HttpLoggerOptions
  extends pinoLib.pinoMod.PNs.LoggerOptions {
  var genReqId: js.UndefOr[js.Function1[/* req */ nodeLib.httpMod.IncomingMessage, scala.Double]] = js.undefined
  var logger: js.UndefOr[pinoLib.pinoMod.PNs.Logger] = js.undefined
  var stream: js.UndefOr[
    nodeLib.streamMod.Writable | nodeLib.streamMod.Duplex | nodeLib.streamMod.Transform
  ] = js.undefined
  var useLevel: js.UndefOr[pinoLib.pinoMod.PNs.Level] = js.undefined
}

