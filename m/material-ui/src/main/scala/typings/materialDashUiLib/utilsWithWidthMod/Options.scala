package typings
package materialDashUiLib.utilsWithWidthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var largeWidth: js.UndefOr[scala.Double] = js.undefined
  var mediumWidth: js.UndefOr[scala.Double] = js.undefined
  var resizeInterval: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    largeWidth: scala.Int | scala.Double = null,
    mediumWidth: scala.Int | scala.Double = null,
    resizeInterval: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (largeWidth != null) __obj.updateDynamic("largeWidth")(largeWidth.asInstanceOf[js.Any])
    if (mediumWidth != null) __obj.updateDynamic("mediumWidth")(mediumWidth.asInstanceOf[js.Any])
    if (resizeInterval != null) __obj.updateDynamic("resizeInterval")(resizeInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

