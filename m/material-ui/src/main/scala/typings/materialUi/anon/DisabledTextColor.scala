package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisabledTextColor extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var disabledTextColor: js.UndefOr[String] = js.undefined
  
  var errorColor: js.UndefOr[String] = js.undefined
  
  var floatingLabelColor: js.UndefOr[String] = js.undefined
  
  var focusColor: js.UndefOr[String] = js.undefined
  
  var hintColor: js.UndefOr[String] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
}
object DisabledTextColor {
  
  @scala.inline
  def apply(): DisabledTextColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisabledTextColor]
  }
  
  @scala.inline
  implicit class DisabledTextColorMutableBuilder[Self <: DisabledTextColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setDisabledTextColor(value: String): Self = StObject.set(x, "disabledTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledTextColorUndefined: Self = StObject.set(x, "disabledTextColor", js.undefined)
    
    @scala.inline
    def setErrorColor(value: String): Self = StObject.set(x, "errorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorColorUndefined: Self = StObject.set(x, "errorColor", js.undefined)
    
    @scala.inline
    def setFloatingLabelColor(value: String): Self = StObject.set(x, "floatingLabelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelColorUndefined: Self = StObject.set(x, "floatingLabelColor", js.undefined)
    
    @scala.inline
    def setFocusColor(value: String): Self = StObject.set(x, "focusColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusColorUndefined: Self = StObject.set(x, "focusColor", js.undefined)
    
    @scala.inline
    def setHintColor(value: String): Self = StObject.set(x, "hintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintColorUndefined: Self = StObject.set(x, "hintColor", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
