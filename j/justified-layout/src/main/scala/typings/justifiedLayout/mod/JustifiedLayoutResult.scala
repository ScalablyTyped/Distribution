package typings.justifiedLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results from calculating the justified layout.
  */
@js.native
trait JustifiedLayoutResult extends js.Object {
  /**
    * Computed positional and sizing properties of a box in the justified layout.
    */
  var boxes: js.Array[LayoutBox] = js.native
  /**
    * Height of the container containing the justified layout.
    */
  var containerHeight: Double = js.native
  /**
    * Number of items that are in rows that aren't fully-packed.
    */
  var widowCount: Double = js.native
}

object JustifiedLayoutResult {
  @scala.inline
  def apply(boxes: js.Array[LayoutBox], containerHeight: Double, widowCount: Double): JustifiedLayoutResult = {
    val __obj = js.Dynamic.literal(boxes = boxes.asInstanceOf[js.Any], containerHeight = containerHeight.asInstanceOf[js.Any], widowCount = widowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[JustifiedLayoutResult]
  }
  @scala.inline
  implicit class JustifiedLayoutResultOps[Self <: JustifiedLayoutResult] (val x: Self) extends AnyVal {
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
    def setBoxesVarargs(value: LayoutBox*): Self = this.set("boxes", js.Array(value :_*))
    @scala.inline
    def setBoxes(value: js.Array[LayoutBox]): Self = this.set("boxes", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerHeight(value: Double): Self = this.set("containerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidowCount(value: Double): Self = this.set("widowCount", value.asInstanceOf[js.Any])
  }
  
}

