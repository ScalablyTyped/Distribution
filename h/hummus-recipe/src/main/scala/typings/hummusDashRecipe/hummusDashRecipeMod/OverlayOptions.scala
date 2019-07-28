package typings.hummusDashRecipe.hummusDashRecipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayOptions extends js.Object {
  var fitHeight: js.UndefOr[Boolean] = js.undefined
  var fitWidth: js.UndefOr[Boolean] = js.undefined
  var keepAspectRatio: js.UndefOr[Boolean] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
}

object OverlayOptions {
  @scala.inline
  def apply(
    fitHeight: js.UndefOr[Boolean] = js.undefined,
    fitWidth: js.UndefOr[Boolean] = js.undefined,
    keepAspectRatio: js.UndefOr[Boolean] = js.undefined,
    scale: Int | Double = null
  ): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fitHeight)) __obj.updateDynamic("fitHeight")(fitHeight)
    if (!js.isUndefined(fitWidth)) __obj.updateDynamic("fitWidth")(fitWidth)
    if (!js.isUndefined(keepAspectRatio)) __obj.updateDynamic("keepAspectRatio")(keepAspectRatio)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayOptions]
  }
}

