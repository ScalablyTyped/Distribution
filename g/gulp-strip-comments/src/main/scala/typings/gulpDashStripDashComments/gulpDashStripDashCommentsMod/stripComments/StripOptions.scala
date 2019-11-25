package typings.gulpDashStripDashComments.gulpDashStripDashCommentsMod.stripComments

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripOptions extends js.Object {
  var ignore: js.UndefOr[RegExp | js.Array[RegExp]] = js.undefined
  var safe: js.UndefOr[Boolean] = js.undefined
  var space: js.UndefOr[Boolean] = js.undefined
  var trim: js.UndefOr[Boolean] = js.undefined
}

object StripOptions {
  @scala.inline
  def apply(
    ignore: RegExp | js.Array[RegExp] = null,
    safe: js.UndefOr[Boolean] = js.undefined,
    space: js.UndefOr[Boolean] = js.undefined,
    trim: js.UndefOr[Boolean] = js.undefined
  ): StripOptions = {
    val __obj = js.Dynamic.literal()
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe.asInstanceOf[js.Any])
    if (!js.isUndefined(space)) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripOptions]
  }
}

