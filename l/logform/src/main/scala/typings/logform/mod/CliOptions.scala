package typings.logform.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CliOptions
  extends ColorizeOptions
     with PadLevelsOptions

object CliOptions {
  @scala.inline
  def apply(
    all: js.UndefOr[Boolean] = js.undefined,
    colors: Record[String, String] = null,
    level: js.UndefOr[Boolean] = js.undefined,
    levels: Record[String, Double] = null,
    message: js.UndefOr[Boolean] = js.undefined
  ): CliOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.get.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (!js.isUndefined(message)) __obj.updateDynamic("message")(message.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CliOptions]
  }
}

