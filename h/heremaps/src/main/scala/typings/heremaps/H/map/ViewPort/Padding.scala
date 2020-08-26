package typings.heremaps.H.map.ViewPort

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents viewport padding definition.
  * @property top {number} - the padding on the top edge (in pixels)
  * @property right {number} - the padding on the right edge (in pixels)
  * @property bottom {number} - the padding on the bottom edge (in pixels)
  * @property left {number} - the padding on the left edge (in pixels)
  */
@js.native
trait Padding extends js.Object {
  var bottom: Double = js.native
  var left: Double = js.native
  var right: Double = js.native
  var top: Double = js.native
}

object Padding {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): Padding = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Padding]
  }
  @scala.inline
  implicit class PaddingOps[Self <: Padding] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

