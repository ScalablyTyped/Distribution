package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolTip extends StObject {
  
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
  
  inline def apply(delayClear: Double, delayPost: Double, offsetX: Double, offsetY: Double): ToolTip = {
    val __obj = js.Dynamic.literal(delayClear = delayClear.asInstanceOf[js.Any], delayPost = delayPost.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolTip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToolTip] (val x: Self) extends AnyVal {
    
    inline def setDelayClear(value: Double): Self = StObject.set(x, "delayClear", value.asInstanceOf[js.Any])
    
    inline def setDelayPost(value: Double): Self = StObject.set(x, "delayPost", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
  }
}
