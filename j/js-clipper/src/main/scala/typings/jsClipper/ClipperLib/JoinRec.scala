package typings.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JoinRec extends js.Object {
  var poly1Idx: Double = js.native
  var poly2Idx: Double = js.native
  var pt1a: IntPoint = js.native
  var pt1b: IntPoint = js.native
  var pt2a: IntPoint = js.native
  var pt2b: IntPoint = js.native
}

object JoinRec {
  @scala.inline
  def apply(poly1Idx: Double, poly2Idx: Double, pt1a: IntPoint, pt1b: IntPoint, pt2a: IntPoint, pt2b: IntPoint): JoinRec = {
    val __obj = js.Dynamic.literal(poly1Idx = poly1Idx.asInstanceOf[js.Any], poly2Idx = poly2Idx.asInstanceOf[js.Any], pt1a = pt1a.asInstanceOf[js.Any], pt1b = pt1b.asInstanceOf[js.Any], pt2a = pt2a.asInstanceOf[js.Any], pt2b = pt2b.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinRec]
  }
  @scala.inline
  implicit class JoinRecOps[Self <: JoinRec] (val x: Self) extends AnyVal {
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
    def setPoly1Idx(value: Double): Self = this.set("poly1Idx", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoly2Idx(value: Double): Self = this.set("poly2Idx", value.asInstanceOf[js.Any])
    @scala.inline
    def setPt1a(value: IntPoint): Self = this.set("pt1a", value.asInstanceOf[js.Any])
    @scala.inline
    def setPt1b(value: IntPoint): Self = this.set("pt1b", value.asInstanceOf[js.Any])
    @scala.inline
    def setPt2a(value: IntPoint): Self = this.set("pt2a", value.asInstanceOf[js.Any])
    @scala.inline
    def setPt2b(value: IntPoint): Self = this.set("pt2b", value.asInstanceOf[js.Any])
  }
  
}

