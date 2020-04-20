package typings.logform.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UncolorizeOptions extends js.Object {
  /**
    * Disables the uncolorize format for `info.level` if set to `false`.
    */
  var level: js.UndefOr[Boolean] = js.undefined
  /**
    * Disables the uncolorize format for `info.message` if set to `false`.
    */
  var message: js.UndefOr[Boolean] = js.undefined
  /**
    * Disables the uncolorize format for `info[MESSAGE]` if set to `false`.
    */
  var raw: js.UndefOr[Boolean] = js.undefined
}

object UncolorizeOptions {
  @scala.inline
  def apply(
    level: js.UndefOr[Boolean] = js.undefined,
    message: js.UndefOr[Boolean] = js.undefined,
    raw: js.UndefOr[Boolean] = js.undefined
  ): UncolorizeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(message)) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[UncolorizeOptions]
  }
}

