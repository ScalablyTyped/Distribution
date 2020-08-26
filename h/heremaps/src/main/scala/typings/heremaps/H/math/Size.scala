package typings.heremaps.H.math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for representing sizes consisting of a width and height.
  * @property w {number} - The size's width value
  * @property h {number} - The size's height value
  */
@js.native
trait Size extends js.Object {
  var h: Double = js.native
  var w: Double = js.native
}

object Size {
  @scala.inline
  def apply(h: Double, w: Double): Size = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  @scala.inline
  implicit class SizeOps[Self <: Size] (val x: Self) extends AnyVal {
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
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
  }
  
}

