package typings.materialTabScroller.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTabScrollerHorizontalEdges extends js.Object {
  var left: Double = js.native
  var right: Double = js.native
}

object MDCTabScrollerHorizontalEdges {
  @scala.inline
  def apply(left: Double, right: Double): MDCTabScrollerHorizontalEdges = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCTabScrollerHorizontalEdges]
  }
  @scala.inline
  implicit class MDCTabScrollerHorizontalEdgesOps[Self <: MDCTabScrollerHorizontalEdges] (val x: Self) extends AnyVal {
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
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
  }
  
}

