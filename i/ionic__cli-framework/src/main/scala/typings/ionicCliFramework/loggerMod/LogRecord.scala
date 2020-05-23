package typings.ionicCliFramework.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogRecord extends js.Object {
  var format: js.UndefOr[Boolean] = js.undefined
  var level: js.UndefOr[LoggerLevelWeight] = js.undefined
  var logger: Logger
  var msg: String
}

object LogRecord {
  @scala.inline
  def apply(
    logger: Logger,
    msg: String,
    format: js.UndefOr[Boolean] = js.undefined,
    level: js.UndefOr[LoggerLevelWeight] = js.undefined
  ): LogRecord = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format.get.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogRecord]
  }
}

