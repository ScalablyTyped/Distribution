package typings.hammerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssProps extends StObject {
  
  var contentZooming: String
  
  var tapHighlightColor: String
  
  var touchCallout: String
  
  var touchSelect: String
  
  var userDrag: String
  
  var userSelect: String
}
object CssProps {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: CssProps] (val x: Self) extends AnyVal {
    
    inline def setContentZooming(value: String): Self = StObject.set(x, "contentZooming", value.asInstanceOf[js.Any])
    
    inline def setTapHighlightColor(value: String): Self = StObject.set(x, "tapHighlightColor", value.asInstanceOf[js.Any])
    
    inline def setTouchCallout(value: String): Self = StObject.set(x, "touchCallout", value.asInstanceOf[js.Any])
    
    inline def setTouchSelect(value: String): Self = StObject.set(x, "touchSelect", value.asInstanceOf[js.Any])
    
    inline def setUserDrag(value: String): Self = StObject.set(x, "userDrag", value.asInstanceOf[js.Any])
    
    inline def setUserSelect(value: String): Self = StObject.set(x, "userSelect", value.asInstanceOf[js.Any])
  }
}
