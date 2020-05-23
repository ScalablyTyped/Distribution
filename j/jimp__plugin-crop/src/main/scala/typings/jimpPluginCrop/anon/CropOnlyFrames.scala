package typings.jimpPluginCrop.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropOnlyFrames extends js.Object {
  var cropOnlyFrames: js.UndefOr[Boolean] = js.undefined
  var cropSymmetric: js.UndefOr[Boolean] = js.undefined
  var leaveBorder: js.UndefOr[Double] = js.undefined
  var tolerance: js.UndefOr[Double] = js.undefined
}

object CropOnlyFrames {
  @scala.inline
  def apply(
    cropOnlyFrames: js.UndefOr[Boolean] = js.undefined,
    cropSymmetric: js.UndefOr[Boolean] = js.undefined,
    leaveBorder: js.UndefOr[Double] = js.undefined,
    tolerance: js.UndefOr[Double] = js.undefined
  ): CropOnlyFrames = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cropOnlyFrames)) __obj.updateDynamic("cropOnlyFrames")(cropOnlyFrames.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cropSymmetric)) __obj.updateDynamic("cropSymmetric")(cropSymmetric.get.asInstanceOf[js.Any])
    if (!js.isUndefined(leaveBorder)) __obj.updateDynamic("leaveBorder")(leaveBorder.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tolerance)) __obj.updateDynamic("tolerance")(tolerance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropOnlyFrames]
  }
}

