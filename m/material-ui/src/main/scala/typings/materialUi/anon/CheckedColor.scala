package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckedColor extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var checkedColor: js.UndefOr[String] = js.undefined
  
  var disabledColor: js.UndefOr[String] = js.undefined
  
  var labelColor: js.UndefOr[String] = js.undefined
  
  var labelDisabledColor: js.UndefOr[String] = js.undefined
  
  var requiredColor: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
}
object CheckedColor {
  
  inline def apply(): CheckedColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckedColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckedColor] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setCheckedColor(value: String): Self = StObject.set(x, "checkedColor", value.asInstanceOf[js.Any])
    
    inline def setCheckedColorUndefined: Self = StObject.set(x, "checkedColor", js.undefined)
    
    inline def setDisabledColor(value: String): Self = StObject.set(x, "disabledColor", value.asInstanceOf[js.Any])
    
    inline def setDisabledColorUndefined: Self = StObject.set(x, "disabledColor", js.undefined)
    
    inline def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
    
    inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
    
    inline def setLabelDisabledColor(value: String): Self = StObject.set(x, "labelDisabledColor", value.asInstanceOf[js.Any])
    
    inline def setLabelDisabledColorUndefined: Self = StObject.set(x, "labelDisabledColor", js.undefined)
    
    inline def setRequiredColor(value: String): Self = StObject.set(x, "requiredColor", value.asInstanceOf[js.Any])
    
    inline def setRequiredColorUndefined: Self = StObject.set(x, "requiredColor", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
