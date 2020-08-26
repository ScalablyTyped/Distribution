package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashContour extends js.Object {
  var fill: FlashFill = js.native
  var interior: Boolean = js.native
  var orientation: Double = js.native
  def getHalfEdge(): FlashHalfEdge = js.native
}

object FlashContour {
  @scala.inline
  def apply(fill: FlashFill, getHalfEdge: () => FlashHalfEdge, interior: Boolean, orientation: Double): FlashContour = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], getHalfEdge = js.Any.fromFunction0(getHalfEdge), interior = interior.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashContour]
  }
  @scala.inline
  implicit class FlashContourOps[Self <: FlashContour] (val x: Self) extends AnyVal {
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
    def setFill(value: FlashFill): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetHalfEdge(value: () => FlashHalfEdge): Self = this.set("getHalfEdge", js.Any.fromFunction0(value))
    @scala.inline
    def setInterior(value: Boolean): Self = this.set("interior", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(value: Double): Self = this.set("orientation", value.asInstanceOf[js.Any])
  }
  
}

