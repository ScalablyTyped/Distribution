package typings
package atIonicCliDashFrameworkLib.libLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamHandlerOptions extends js.Object {
  val filter: js.UndefOr[js.Function1[/* record */ LogRecord, scala.Boolean]] = js.undefined
  val formatter: js.UndefOr[LoggerFormatter] = js.undefined
  val stream: nodeLib.NodeJSNs.WritableStream
}

