package typings.atJimpPluginDashCrop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CropOnlyFrames extends js.Object {
  var cropOnlyFrames: js.UndefOr[Boolean] = js.undefined
  var cropSymmetric: js.UndefOr[Boolean] = js.undefined
  var leaveBorder: js.UndefOr[Double] = js.undefined
  var tolerance: js.UndefOr[Double] = js.undefined
}

object Anon_CropOnlyFrames {
  @scala.inline
  def apply(
    cropOnlyFrames: js.UndefOr[Boolean] = js.undefined,
    cropSymmetric: js.UndefOr[Boolean] = js.undefined,
    leaveBorder: Int | Double = null,
    tolerance: Int | Double = null
  ): Anon_CropOnlyFrames = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cropOnlyFrames)) __obj.updateDynamic("cropOnlyFrames")(cropOnlyFrames.asInstanceOf[js.Any])
    if (!js.isUndefined(cropSymmetric)) __obj.updateDynamic("cropSymmetric")(cropSymmetric.asInstanceOf[js.Any])
    if (leaveBorder != null) __obj.updateDynamic("leaveBorder")(leaveBorder.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CropOnlyFrames]
  }
}

