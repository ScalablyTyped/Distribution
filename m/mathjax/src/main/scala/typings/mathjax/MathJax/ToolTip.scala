package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolTip extends js.Object {
  
  /*The delay (in milliseconds) before the tooltop is cleared after the mouse moves out of the maction element.*/
  var delayClear: Double = js.native
  
  /*The delay (in milliseconds) before the tooltip is posted after the mouse is moved over the maction element.*/
  var delayPost: Double = js.native
  
  /*The X offset from the mouse position (in pixels) where the tooltip will be placed.*/
  var offsetX: Double = js.native
  
  /*The Y offset from the mouse position (in pixels) where the tooltip will be placed.*/
  var offsetY: Double = js.native
}
object ToolTip {
  
  @scala.inline
  def apply(delayClear: Double, delayPost: Double, offsetX: Double, offsetY: Double): ToolTip = {
    val __obj = js.Dynamic.literal(delayClear = delayClear.asInstanceOf[js.Any], delayPost = delayPost.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolTip]
  }
  
  @scala.inline
  implicit class ToolTipOps[Self <: ToolTip] (val x: Self) extends AnyVal {
    
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
    def setDelayClear(value: Double): Self = this.set("delayClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayPost(value: Double): Self = this.set("delayPost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
  }
}
