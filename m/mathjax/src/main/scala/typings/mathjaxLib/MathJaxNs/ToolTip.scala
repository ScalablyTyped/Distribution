package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolTip extends js.Object {
  /*The delay (in milliseconds) before the tooltop is cleared after the mouse moves out of the maction element.*/
  var delayClear: scala.Double
  /*The delay (in milliseconds) before the tooltip is posted after the mouse is moved over the maction element.*/
  var delayPost: scala.Double
  /*The X offset from the mouse position (in pixels) where the tooltip will be placed.*/
  var offsetX: scala.Double
  /*The Y offset from the mouse position (in pixels) where the tooltip will be placed.*/
  var offsetY: scala.Double
}

object ToolTip {
  @scala.inline
  def apply(delayClear: scala.Double, delayPost: scala.Double, offsetX: scala.Double, offsetY: scala.Double): ToolTip = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delayClear")(delayClear)
    __obj.updateDynamic("delayPost")(delayPost)
    __obj.updateDynamic("offsetX")(offsetX)
    __obj.updateDynamic("offsetY")(offsetY)
    __obj.asInstanceOf[ToolTip]
  }
}

