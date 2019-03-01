package typings
package herokuDashLoggerLib.herokuDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerConfig extends js.Object {
  var color: js.UndefOr[scala.Boolean] = js.undefined
  var level: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[scala.Boolean] = js.undefined
  var readable: js.UndefOr[scala.Boolean] = js.undefined
}

object LoggerConfig {
  @scala.inline
  def apply(
    color: js.UndefOr[scala.Boolean] = js.undefined,
    level: java.lang.String = null,
    prefix: js.UndefOr[scala.Boolean] = js.undefined,
    readable: js.UndefOr[scala.Boolean] = js.undefined
  ): LoggerConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    if (level != null) __obj.updateDynamic("level")(level)
    if (!js.isUndefined(prefix)) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable)
    __obj.asInstanceOf[LoggerConfig]
  }
}

