package typings.kendoUi.kendo.ui

import typings.kendoUi.kendoUiStrings.grid
import typings.kendoUi.kendoUiStrings.horizontal
import typings.kendoUi.kendoUiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormOptions extends js.Object {
  
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
  implicit class FormOptionsOps[Self <: FormOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setButtonsTemplate(value: String | js.Function): Self = this.set("buttonsTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonsTemplate: Self = this.set("buttonsTemplate", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ FormChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setClear(value: /* e */ FormClearEvent => Unit): Self = this.set("clear", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    
    @scala.inline
    def setFocusFirst(value: Boolean): Self = this.set("focusFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusFirst: Self = this.set("focusFirst", js.undefined)
    
    @scala.inline
    def setFormData(value: FormData): Self = this.set("formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormData: Self = this.set("formData", js.undefined)
    
    @scala.inline
    def setFormatLabel(value: js.Function): Self = this.set("formatLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatLabel: Self = this.set("formatLabel", js.undefined)
    
    @scala.inline
    def setGrid(value: FormGridOptions): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: FormItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[FormItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setLayout(value: String | grid): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrientation(value: String | horizontal | vertical): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setSubmit(value: /* e */ FormSubmitEvent => Unit): Self = this.set("submit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSubmit: Self = this.set("submit", js.undefined)
    
    @scala.inline
    def setValidatable(value: FormValidatable): Self = this.set("validatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidatable: Self = this.set("validatable", js.undefined)
    
    @scala.inline
    def setValidate(value: /* e */ FormValidateEvent => Unit): Self = this.set("validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    
    @scala.inline
    def setValidateField(value: /* e */ FormValidateFieldEvent => Unit): Self = this.set("validateField", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidateField: Self = this.set("validateField", js.undefined)
  }
}
