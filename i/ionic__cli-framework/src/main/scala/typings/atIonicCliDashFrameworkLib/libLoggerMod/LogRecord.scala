package typings
package atIonicCliDashFrameworkLib.libLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogRecord extends js.Object {
  var format: js.UndefOr[scala.Boolean] = js.undefined
  var level: js.UndefOr[LoggerLevelWeight] = js.undefined
  var logger: Logger
  var msg: java.lang.String
}

object LogRecord {
  @scala.inline
  def apply(
    logger: Logger,
    msg: java.lang.String,
    format: js.UndefOr[scala.Boolean] = js.undefined,
    level: js.UndefOr[LoggerLevelWeight] = js.undefined
  ): LogRecord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("logger")(logger)
    __obj.updateDynamic("msg")(msg)
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level)
    __obj.asInstanceOf[LogRecord]
  }
}

