package typings.katex.autoRenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderMathInElementSpecificOptionsDelimiters extends js.Object {
  /**
    * A boolean of whether the math in the expression should be rendered in display mode or not
    */
  var display: Boolean = js.native
  /**
    * A string which starts the math expression (i.e. the left delimiter)
    */
  var left: String = js.native
  /**
    * A string which ends the math expression (i.e. the right delimiter)
    */
  var right: String = js.native
}

object RenderMathInElementSpecificOptionsDelimiters {
  @scala.inline
  def apply(display: Boolean, left: String, right: String): RenderMathInElementSpecificOptionsDelimiters = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderMathInElementSpecificOptionsDelimiters]
  }
  @scala.inline
  implicit class RenderMathInElementSpecificOptionsDelimitersOps[Self <: RenderMathInElementSpecificOptionsDelimiters] (val x: Self) extends AnyVal {
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
    def setDisplay(value: Boolean): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: String): Self = this.set("right", value.asInstanceOf[js.Any])
  }
  
}

