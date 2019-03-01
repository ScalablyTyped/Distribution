package typings
package kikDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KikGetOptions extends js.Object {
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var minResults: js.UndefOr[scala.Double] = js.undefined
  var quality: js.UndefOr[scala.Double] = js.undefined
}

object KikGetOptions {
  @scala.inline
  def apply(
    maxHeight: scala.Int | scala.Double = null,
    maxResults: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    minResults: scala.Int | scala.Double = null,
    quality: scala.Int | scala.Double = null
  ): KikGetOptions = {
    val __obj = js.Dynamic.literal()
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minResults != null) __obj.updateDynamic("minResults")(minResults.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[KikGetOptions]
  }
}

