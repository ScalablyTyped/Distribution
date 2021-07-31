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
  
  @scala.inline
  def apply(): CheckedColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckedColor]
  }
  
  @scala.inline
  implicit class CheckedColorMutableBuilder[Self <: CheckedColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setCheckedColor(value: String): Self = StObject.set(x, "checkedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedColorUndefined: Self = StObject.set(x, "checkedColor", js.undefined)
    
    @scala.inline
    def setDisabledColor(value: String): Self = StObject.set(x, "disabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledColorUndefined: Self = StObject.set(x, "disabledColor", js.undefined)
    
    @scala.inline
    def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
    
    @scala.inline
    def setLabelDisabledColor(value: String): Self = StObject.set(x, "labelDisabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelDisabledColorUndefined: Self = StObject.set(x, "labelDisabledColor", js.undefined)
    
    @scala.inline
    def setRequiredColor(value: String): Self = StObject.set(x, "requiredColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredColorUndefined: Self = StObject.set(x, "requiredColor", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
