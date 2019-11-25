package typings.katex.distContribAutoDashRenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderMathInElementSpecificOptionsDelimiters extends js.Object {
  /**
    * A boolean of whether the math in the expression should be rendered in display mode or not
    */
  var display: Boolean
  /**
    * A string which starts the math expression (i.e. the left delimiter)
    */
  var left: String
  /**
    * A string which ends the math expression (i.e. the right delimiter)
    */
  var right: String
}

object RenderMathInElementSpecificOptionsDelimiters {
  @scala.inline
  def apply(display: Boolean, left: String, right: String): RenderMathInElementSpecificOptionsDelimiters = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderMathInElementSpecificOptionsDelimiters]
  }
}

