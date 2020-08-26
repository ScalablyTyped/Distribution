package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinishingStitching extends js.Object {
  var `stitching-angle`: js.UndefOr[Double] = js.native
  var `stitching-locations`: js.UndefOr[js.Array[Double]] = js.native
  var `stitching-method`: js.UndefOr[StitchingMethod] = js.native
  var `stitching-offset`: js.UndefOr[Double] = js.native
  var `stitching-reference-edge`: js.UndefOr[ReferenceEdge] = js.native
}

object FinishingStitching {
  @scala.inline
  def apply(): FinishingStitching = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingStitching]
  }
  @scala.inline
  implicit class FinishingStitchingOps[Self <: FinishingStitching] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setStitching-angle`(value: Double): Self = this.set("stitching-angle", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStitching-angle`: Self = this.set("stitching-angle", js.undefined)
    @scala.inline
    def `setStitching-locationsVarargs`(value: Double*): Self = this.set("stitching-locations", js.Array(value :_*))
    @scala.inline
    def `setStitching-locations`(value: js.Array[Double]): Self = this.set("stitching-locations", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStitching-locations`: Self = this.set("stitching-locations", js.undefined)
    @scala.inline
    def `setStitching-method`(value: StitchingMethod): Self = this.set("stitching-method", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStitching-method`: Self = this.set("stitching-method", js.undefined)
    @scala.inline
    def `setStitching-offset`(value: Double): Self = this.set("stitching-offset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStitching-offset`: Self = this.set("stitching-offset", js.undefined)
    @scala.inline
    def `setStitching-reference-edge`(value: ReferenceEdge): Self = this.set("stitching-reference-edge", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStitching-reference-edge`: Self = this.set("stitching-reference-edge", js.undefined)
  }
  
}

