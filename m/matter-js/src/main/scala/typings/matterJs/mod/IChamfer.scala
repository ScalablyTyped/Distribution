package typings.matterJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChamfer extends js.Object {
  var quality: js.UndefOr[Double] = js.undefined
  var qualityMax: js.UndefOr[Double] = js.undefined
  var qualityMin: js.UndefOr[Double] = js.undefined
  var radius: js.UndefOr[Double | js.Array[Double]] = js.undefined
}

object IChamfer {
  @scala.inline
  def apply(
    quality: js.UndefOr[Double] = js.undefined,
    qualityMax: js.UndefOr[Double] = js.undefined,
    qualityMin: js.UndefOr[Double] = js.undefined,
    radius: Double | js.Array[Double] = null
  ): IChamfer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(qualityMax)) __obj.updateDynamic("qualityMax")(qualityMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(qualityMin)) __obj.updateDynamic("qualityMin")(qualityMin.get.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChamfer]
  }
}

