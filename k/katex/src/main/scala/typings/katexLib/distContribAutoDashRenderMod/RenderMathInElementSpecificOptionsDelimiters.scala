package typings
package katexLib.distContribAutoDashRenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderMathInElementSpecificOptionsDelimiters extends js.Object {
  /**
    * A boolean of whether the math in the expression should be rendered in display mode or not
    */
  var display: scala.Boolean
  /**
    * A string which starts the math expression (i.e. the left delimiter)
    */
  var left: java.lang.String
  /**
    * A string which ends the math expression (i.e. the right delimiter)
    */
  var right: java.lang.String
}

object RenderMathInElementSpecificOptionsDelimiters {
  @scala.inline
  def apply(display: scala.Boolean, left: java.lang.String, right: java.lang.String): RenderMathInElementSpecificOptionsDelimiters = {
    val __obj = js.Dynamic.literal(display = display, left = left, right = right)
  
    __obj.asInstanceOf[RenderMathInElementSpecificOptionsDelimiters]
  }
}

