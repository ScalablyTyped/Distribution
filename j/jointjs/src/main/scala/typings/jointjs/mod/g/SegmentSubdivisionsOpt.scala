package typings.jointjs.mod.g

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentSubdivisionsOpt extends PrecisionOpt {
  var segmentSubdivisions: js.UndefOr[js.Array[js.Array[Curve]]] = js.native
}

object SegmentSubdivisionsOpt {
  @scala.inline
  def apply(): SegmentSubdivisionsOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentSubdivisionsOpt]
  }
  @scala.inline
  implicit class SegmentSubdivisionsOptOps[Self <: SegmentSubdivisionsOpt] (val x: Self) extends AnyVal {
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
    def setSegmentSubdivisionsVarargs(value: js.Array[Curve]*): Self = this.set("segmentSubdivisions", js.Array(value :_*))
    @scala.inline
    def setSegmentSubdivisions(value: js.Array[js.Array[Curve]]): Self = this.set("segmentSubdivisions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentSubdivisions: Self = this.set("segmentSubdivisions", js.undefined)
  }
  
}

