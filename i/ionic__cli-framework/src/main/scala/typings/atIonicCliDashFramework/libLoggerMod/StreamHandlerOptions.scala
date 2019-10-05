package typings.atIonicCliDashFramework.libLoggerMod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamHandlerOptions extends js.Object {
  val filter: js.UndefOr[js.Function1[/* record */ LogRecord, Boolean]] = js.undefined
  val formatter: js.UndefOr[LoggerFormatter] = js.undefined
  val stream: WritableStream
}

object StreamHandlerOptions {
  @scala.inline
  def apply(
    stream: WritableStream,
    filter: /* record */ LogRecord => Boolean = null,
    formatter: /* record */ LogRecord => String = null
  ): StreamHandlerOptions = {
    val __obj = js.Dynamic.literal(stream = stream)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    __obj.asInstanceOf[StreamHandlerOptions]
  }
}

