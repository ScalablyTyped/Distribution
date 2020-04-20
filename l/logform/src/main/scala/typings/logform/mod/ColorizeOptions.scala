package typings.logform.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorizeOptions extends js.Object {
  /**
    * If set to `true` the color will be applied to the `message` and `level`.
    */
  var all: js.UndefOr[Boolean] = js.undefined
  /**
    * An object containing the colors for the log levels. For example: `{ info: 'blue', error: 'red' }`.
    */
  var colors: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * If set to `true` the color will be applied to the `level`.
    */
  var level: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to `true` the color will be applied to the `message`.
    */
  var message: js.UndefOr[Boolean] = js.undefined
}

object ColorizeOptions {
  @scala.inline
  def apply(
    all: js.UndefOr[Boolean] = js.undefined,
    colors: Record[String, String] = null,
    level: js.UndefOr[Boolean] = js.undefined,
    message: js.UndefOr[Boolean] = js.undefined
  ): ColorizeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(message)) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorizeOptions]
  }
}

