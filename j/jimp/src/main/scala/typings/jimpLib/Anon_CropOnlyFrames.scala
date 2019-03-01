package typings
package jimpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CropOnlyFrames extends js.Object {
  var cropOnlyFrames: js.UndefOr[scala.Boolean] = js.undefined
  var cropSymmetric: js.UndefOr[scala.Boolean] = js.undefined
  var leaveBorder: js.UndefOr[scala.Double] = js.undefined
  var tolerance: js.UndefOr[scala.Double] = js.undefined
}

object Anon_CropOnlyFrames {
  @scala.inline
  def apply(
    cropOnlyFrames: js.UndefOr[scala.Boolean] = js.undefined,
    cropSymmetric: js.UndefOr[scala.Boolean] = js.undefined,
    leaveBorder: scala.Int | scala.Double = null,
    tolerance: scala.Int | scala.Double = null
  ): Anon_CropOnlyFrames = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cropOnlyFrames)) __obj.updateDynamic("cropOnlyFrames")(cropOnlyFrames)
    if (!js.isUndefined(cropSymmetric)) __obj.updateDynamic("cropSymmetric")(cropSymmetric)
    if (leaveBorder != null) __obj.updateDynamic("leaveBorder")(leaveBorder.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CropOnlyFrames]
  }
}

