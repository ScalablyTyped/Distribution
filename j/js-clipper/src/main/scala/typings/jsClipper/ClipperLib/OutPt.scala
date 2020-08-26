package typings.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutPt extends js.Object {
  var idx: Double = js.native
  var next: OutPt = js.native
  var prev: OutPt = js.native
  var pt: OutPt = js.native
}

object OutPt {
  @scala.inline
  def apply(idx: Double, next: OutPt, prev: OutPt, pt: OutPt): OutPt = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], pt = pt.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutPt]
  }
  @scala.inline
  implicit class OutPtOps[Self <: OutPt] (val x: Self) extends AnyVal {
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
    def setIdx(value: Double): Self = this.set("idx", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: OutPt): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrev(value: OutPt): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def setPt(value: OutPt): Self = this.set("pt", value.asInstanceOf[js.Any])
  }
  
}

