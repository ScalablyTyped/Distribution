package typings
package atIonicCliDashFrameworkLib.libLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerHandler extends js.Object {
  var formatter: js.UndefOr[LoggerFormatter] = js.undefined
  def handle(record: LogRecord): scala.Unit
}

object LoggerHandler {
  @scala.inline
  def apply(
    clone: js.Function0[LoggerHandler],
    handle: js.Function1[LogRecord, scala.Unit],
    formatter: LoggerFormatter = null
  ): LoggerHandler = {
    val __obj = js.Dynamic.literal(clone = clone, handle = handle)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    __obj.asInstanceOf[LoggerHandler]
  }
}

