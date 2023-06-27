package typings.kendoUi.kendo.ui

import typings.kendoUi.kendoUiStrings.grid
import typings.kendoUi.kendoUiStrings.horizontal
import typings.kendoUi.kendoUiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormOptions extends StObject {
  
  var buttonsTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ FormChangeEvent, Unit]] = js.undefined
  
  var clear: js.UndefOr[js.Function1[/* e */ FormClearEvent, Unit]] = js.undefined
  
  var focusFirst: js.UndefOr[Boolean] = js.undefined
  
  var formData: js.UndefOr[FormData] = js.undefined
  
  var formatLabel: js.UndefOr[js.Function] = js.undefined
  
  var grid: js.UndefOr[FormGridOptions] = js.undefined
  
  var items: js.UndefOr[js.Array[FormItem]] = js.undefined
  
  var layout: js.UndefOr[String | grid] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var orientation: js.UndefOr[String | horizontal | vertical] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var submit: js.UndefOr[js.Function1[/* e */ FormSubmitEvent, Unit]] = js.undefined
  
  var validatable: js.UndefOr[FormValidatable] = js.undefined
  
  var validate: js.UndefOr[js.Function1[/* e */ FormValidateEvent, Unit]] = js.undefined
  
  var validateField: js.UndefOr[js.Function1[/* e */ FormValidateFieldEvent, Unit]] = js.undefined
}
object FormOptions {
  
  inline def apply(): FormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormOptions] (val x: Self) extends AnyVal {
    
    inline def setButtonsTemplate(value: String | js.Function): Self = StObject.set(x, "buttonsTemplate", value.asInstanceOf[js.Any])
    
    inline def setButtonsTemplateUndefined: Self = StObject.set(x, "buttonsTemplate", js.undefined)
    
    inline def setChange(value: /* e */ FormChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setClear(value: /* e */ FormClearEvent => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setFocusFirst(value: Boolean): Self = StObject.set(x, "focusFirst", value.asInstanceOf[js.Any])
    
    inline def setFocusFirstUndefined: Self = StObject.set(x, "focusFirst", js.undefined)
    
    inline def setFormData(value: FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setFormatLabel(value: js.Function): Self = StObject.set(x, "formatLabel", value.asInstanceOf[js.Any])
    
    inline def setFormatLabelUndefined: Self = StObject.set(x, "formatLabel", js.undefined)
    
    inline def setGrid(value: FormGridOptions): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setItems(value: js.Array[FormItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: FormItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLayout(value: String | grid): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrientation(value: String | horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSubmit(value: /* e */ FormSubmitEvent => Unit): Self = StObject.set(x, "submit", js.Any.fromFunction1(value))
    
    inline def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
    
    inline def setValidatable(value: FormValidatable): Self = StObject.set(x, "validatable", value.asInstanceOf[js.Any])
    
    inline def setValidatableUndefined: Self = StObject.set(x, "validatable", js.undefined)
    
    inline def setValidate(value: /* e */ FormValidateEvent => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    inline def setValidateField(value: /* e */ FormValidateFieldEvent => Unit): Self = StObject.set(x, "validateField", js.Any.fromFunction1(value))
    
    inline def setValidateFieldUndefined: Self = StObject.set(x, "validateField", js.undefined)
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
