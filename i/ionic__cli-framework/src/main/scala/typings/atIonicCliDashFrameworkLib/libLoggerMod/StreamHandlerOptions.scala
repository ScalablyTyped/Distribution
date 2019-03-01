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

object StreamHandlerOptions {
  @scala.inline
  def apply(
    stream: nodeLib.NodeJSNs.WritableStream,
    filter: js.Function1[/* record */ LogRecord, scala.Boolean] = null,
    formatter: LoggerFormatter = null
  ): StreamHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stream")(stream)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    __obj.asInstanceOf[StreamHandlerOptions]
  }
}

