package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolTip extends js.Object {
  /*The delay (in milliseconds) before the tooltop is cleared after the mouse moves out of the maction element.*/
  var delayClear: Double
  /*The delay (in milliseconds) before the tooltip is posted after the mouse is moved over the maction element.*/
  var delayPost: Double
  /*The X offset from the mouse position (in pixels) where the tooltip will be placed.*/
  var offsetX: Double
  /*The Y offset from the mouse position (in pixels) where the tooltip will be placed.*/
  var offsetY: Double
}

object ToolTip {
  @scala.inline
  def apply(delayClear: Double, delayPost: Double, offsetX: Double, offsetY: Double): ToolTip = {
    val __obj = js.Dynamic.literal(delayClear = delayClear.asInstanceOf[js.Any], delayPost = delayPost.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ToolTip]
  }
}

