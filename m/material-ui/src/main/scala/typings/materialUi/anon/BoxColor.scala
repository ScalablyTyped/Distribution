package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxColor extends StObject {
  
  var boxColor: js.UndefOr[String] = js.undefined
  
  var checkedColor: js.UndefOr[String] = js.undefined
  
  var disabledColor: js.UndefOr[String] = js.undefined
  
  var labelColor: js.UndefOr[String] = js.undefined
  
  var labelDisabledColor: js.UndefOr[String] = js.undefined
  
  var requiredColor: js.UndefOr[String] = js.undefined
}
object BoxColor {
  
  inline def apply(): BoxColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxColor]
  }
  
  extension [Self <: BoxColor](x: Self) {
    
    inline def setBoxColor(value: String): Self = StObject.set(x, "boxColor", value.asInstanceOf[js.Any])
    
    inline def setBoxColorUndefined: Self = StObject.set(x, "boxColor", js.undefined)
    
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
  }
}
