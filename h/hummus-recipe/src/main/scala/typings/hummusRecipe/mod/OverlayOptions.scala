package typings.hummusRecipe.mod

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
    scale: js.UndefOr[Double] = js.undefined
  ): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fitHeight)) __obj.updateDynamic("fitHeight")(fitHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fitWidth)) __obj.updateDynamic("fitWidth")(fitWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAspectRatio)) __obj.updateDynamic("keepAspectRatio")(keepAspectRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayOptions]
  }
}

