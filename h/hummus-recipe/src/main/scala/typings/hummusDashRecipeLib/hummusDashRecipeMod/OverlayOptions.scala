package typings
package hummusDashRecipeLib.hummusDashRecipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayOptions extends js.Object {
  var fitHeight: js.UndefOr[scala.Boolean] = js.undefined
  var fitWidth: js.UndefOr[scala.Boolean] = js.undefined
  var keepAspectRatio: js.UndefOr[scala.Boolean] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
}

object OverlayOptions {
  @scala.inline
  def apply(
    fitHeight: js.UndefOr[scala.Boolean] = js.undefined,
    fitWidth: js.UndefOr[scala.Boolean] = js.undefined,
    keepAspectRatio: js.UndefOr[scala.Boolean] = js.undefined,
    scale: scala.Int | scala.Double = null
  ): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fitHeight)) __obj.updateDynamic("fitHeight")(fitHeight)
    if (!js.isUndefined(fitWidth)) __obj.updateDynamic("fitWidth")(fitWidth)
    if (!js.isUndefined(keepAspectRatio)) __obj.updateDynamic("keepAspectRatio")(keepAspectRatio)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayOptions]
  }
}

