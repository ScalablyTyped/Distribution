package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextBoxOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ TextBoxChangeEvent, Unit]] = js.undefined
  
  var enable: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[String | js.Function | TextBoxLabel] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object TextBoxOptions {
  
  @scala.inline
  def apply(): TextBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextBoxOptions]
  }
  
  @scala.inline
  implicit class TextBoxOptionsMutableBuilder[Self <: TextBoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: /* e */ TextBoxChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setLabel(value: String | js.Function | TextBoxLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
