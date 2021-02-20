package typings.hammerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CssProps extends StObject {
  
  var contentZooming: String = js.native
  
  var tapHighlightColor: String = js.native
  
  var touchCallout: String = js.native
  
  var touchSelect: String = js.native
  
  var userDrag: String = js.native
  
  var userSelect: String = js.native
}
object CssProps {
  
  @scala.inline
  def apply(
    contentZooming: String,
    tapHighlightColor: String,
    touchCallout: String,
    touchSelect: String,
    userDrag: String,
    userSelect: String
  ): CssProps = {
    val __obj = js.Dynamic.literal(contentZooming = contentZooming.asInstanceOf[js.Any], tapHighlightColor = tapHighlightColor.asInstanceOf[js.Any], touchCallout = touchCallout.asInstanceOf[js.Any], touchSelect = touchSelect.asInstanceOf[js.Any], userDrag = userDrag.asInstanceOf[js.Any], userSelect = userSelect.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssProps]
  }
  
  @scala.inline
  implicit class CssPropsMutableBuilder[Self <: CssProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentZooming(value: String): Self = StObject.set(x, "contentZooming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapHighlightColor(value: String): Self = StObject.set(x, "tapHighlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchCallout(value: String): Self = StObject.set(x, "touchCallout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchSelect(value: String): Self = StObject.set(x, "touchSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDrag(value: String): Self = StObject.set(x, "userDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSelect(value: String): Self = StObject.set(x, "userSelect", value.asInstanceOf[js.Any])
  }
}
