package typings.kendoUi.kendo.ui

import typings.kendoUi.kendoUiStrings.grid
import typings.kendoUi.kendoUiStrings.horizontal
import typings.kendoUi.kendoUiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormOptions extends StObject {
  
  var buttonsTemplate: js.UndefOr[String | js.Function] = js.native
  
  var change: js.UndefOr[js.Function1[/* e */ FormChangeEvent, Unit]] = js.native
  
  var clear: js.UndefOr[js.Function1[/* e */ FormClearEvent, Unit]] = js.native
  
  var focusFirst: js.UndefOr[Boolean] = js.native
  
  var formData: js.UndefOr[FormData] = js.native
  
  var formatLabel: js.UndefOr[js.Function] = js.native
  
  var grid: js.UndefOr[FormGridOptions] = js.native
  
  var items: js.UndefOr[js.Array[FormItem]] = js.native
  
  var layout: js.UndefOr[String | grid] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var orientation: js.UndefOr[String | horizontal | vertical] = js.native
  
  var submit: js.UndefOr[js.Function1[/* e */ FormSubmitEvent, Unit]] = js.native
  
  var validatable: js.UndefOr[FormValidatable] = js.native
  
  var validate: js.UndefOr[js.Function1[/* e */ FormValidateEvent, Unit]] = js.native
  
  var validateField: js.UndefOr[js.Function1[/* e */ FormValidateFieldEvent, Unit]] = js.native
}
object FormOptions {
  
  @scala.inline
  def apply(): FormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormOptions]
  }
  
  @scala.inline
  implicit class FormOptionsMutableBuilder[Self <: FormOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonsTemplate(value: String | js.Function): Self = StObject.set(x, "buttonsTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsTemplateUndefined: Self = StObject.set(x, "buttonsTemplate", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ FormChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setClear(value: /* e */ FormClearEvent => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    @scala.inline
    def setFocusFirst(value: Boolean): Self = StObject.set(x, "focusFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusFirstUndefined: Self = StObject.set(x, "focusFirst", js.undefined)
    
    @scala.inline
    def setFormData(value: FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    @scala.inline
    def setFormatLabel(value: js.Function): Self = StObject.set(x, "formatLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatLabelUndefined: Self = StObject.set(x, "formatLabel", js.undefined)
    
    @scala.inline
    def setGrid(value: FormGridOptions): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[FormItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: FormItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLayout(value: String | grid): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrientation(value: String | horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setSubmit(value: /* e */ FormSubmitEvent => Unit): Self = StObject.set(x, "submit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
    
    @scala.inline
    def setValidatable(value: FormValidatable): Self = StObject.set(x, "validatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatableUndefined: Self = StObject.set(x, "validatable", js.undefined)
    
    @scala.inline
    def setValidate(value: /* e */ FormValidateEvent => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateField(value: /* e */ FormValidateFieldEvent => Unit): Self = StObject.set(x, "validateField", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateFieldUndefined: Self = StObject.set(x, "validateField", js.undefined)
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
