package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinishingStitching extends js.Object {
  var `stitching-angle`: js.UndefOr[Double] = js.undefined
  var `stitching-locations`: js.UndefOr[js.Array[Double]] = js.undefined
  var `stitching-method`: js.UndefOr[StitchingMethod] = js.undefined
  var `stitching-offset`: js.UndefOr[Double] = js.undefined
  var `stitching-reference-edge`: js.UndefOr[ReferenceEdge] = js.undefined
}

object FinishingStitching {
  @scala.inline
  def apply(
    `stitching-angle`: js.UndefOr[Double] = js.undefined,
    `stitching-locations`: js.Array[Double] = null,
    `stitching-method`: StitchingMethod = null,
    `stitching-offset`: js.UndefOr[Double] = js.undefined,
    `stitching-reference-edge`: ReferenceEdge = null
  ): FinishingStitching = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`stitching-angle`)) __obj.updateDynamic("stitching-angle")(`stitching-angle`.get.asInstanceOf[js.Any])
    if (`stitching-locations` != null) __obj.updateDynamic("stitching-locations")(`stitching-locations`.asInstanceOf[js.Any])
    if (`stitching-method` != null) __obj.updateDynamic("stitching-method")(`stitching-method`.asInstanceOf[js.Any])
    if (!js.isUndefined(`stitching-offset`)) __obj.updateDynamic("stitching-offset")(`stitching-offset`.get.asInstanceOf[js.Any])
    if (`stitching-reference-edge` != null) __obj.updateDynamic("stitching-reference-edge")(`stitching-reference-edge`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinishingStitching]
  }
}

