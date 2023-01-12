package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextBoxLabel extends StObject {
  
  var content: js.UndefOr[String | js.Function] = js.undefined
  
  var floating: js.UndefOr[Boolean] = js.undefined
}
object TextBoxLabel {
  
  inline def apply(): TextBoxLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextBoxLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextBoxLabel] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String | js.Function): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
    
    inline def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
  }
}
