package typings.herokuLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerConfig extends js.Object {
  var color: js.UndefOr[Boolean] = js.undefined
  var level: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var readable: js.UndefOr[Boolean] = js.undefined
}

object LoggerConfig {
  @scala.inline
  def apply(
    color: js.UndefOr[Boolean] = js.undefined,
    level: String = null,
    prefix: String = null,
    readable: js.UndefOr[Boolean] = js.undefined
  ): LoggerConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerConfig]
  }
}

