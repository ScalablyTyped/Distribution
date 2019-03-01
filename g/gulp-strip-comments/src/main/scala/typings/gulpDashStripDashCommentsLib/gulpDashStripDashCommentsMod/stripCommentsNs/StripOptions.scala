package typings
package gulpDashStripDashCommentsLib.gulpDashStripDashCommentsMod.stripCommentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripOptions extends js.Object {
  var ignore: js.UndefOr[stdLib.RegExp | js.Array[stdLib.RegExp]] = js.undefined
  var safe: js.UndefOr[scala.Boolean] = js.undefined
  var space: js.UndefOr[scala.Boolean] = js.undefined
  var trim: js.UndefOr[scala.Boolean] = js.undefined
}

object StripOptions {
  @scala.inline
  def apply(
    ignore: stdLib.RegExp | js.Array[stdLib.RegExp] = null,
    safe: js.UndefOr[scala.Boolean] = js.undefined,
    space: js.UndefOr[scala.Boolean] = js.undefined,
    trim: js.UndefOr[scala.Boolean] = js.undefined
  ): StripOptions = {
    val __obj = js.Dynamic.literal()
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe)
    if (!js.isUndefined(space)) __obj.updateDynamic("space")(space)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    __obj.asInstanceOf[StripOptions]
  }
}

