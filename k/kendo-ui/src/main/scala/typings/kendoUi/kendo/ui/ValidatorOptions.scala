package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidatorOptions extends js.Object {
  
  var errorTemplate: js.UndefOr[String] = js.native
  
  var messages: js.UndefOr[js.Any] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var rules: js.UndefOr[js.Any] = js.native
  
  var validate: js.UndefOr[js.Function1[/* e */ ValidatorValidateEvent, Unit]] = js.native
  
  var validateInput: js.UndefOr[js.Function1[/* e */ ValidatorValidateInputEvent, Unit]] = js.native
  
  var validateOnBlur: js.UndefOr[Boolean] = js.native
  
  var validationSummary: js.UndefOr[Boolean | ValidationSummary] = js.native
}
object ValidatorOptions {
  
  @scala.inline
  def apply(): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidatorOptions]
  }
  
  @scala.inline
  implicit class ValidatorOptionsOps[Self <: ValidatorOptions] (val x: Self) extends AnyVal {
    
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
    def setErrorTemplate(value: String): Self = this.set("errorTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorTemplate: Self = this.set("errorTemplate", js.undefined)
    
    @scala.inline
    def setMessages(value: js.Any): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRules(value: js.Any): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    
    @scala.inline
    def setValidate(value: /* e */ ValidatorValidateEvent => Unit): Self = this.set("validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    
    @scala.inline
    def setValidateInput(value: /* e */ ValidatorValidateInputEvent => Unit): Self = this.set("validateInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidateInput: Self = this.set("validateInput", js.undefined)
    
    @scala.inline
    def setValidateOnBlur(value: Boolean): Self = this.set("validateOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateOnBlur: Self = this.set("validateOnBlur", js.undefined)
    
    @scala.inline
    def setValidationSummary(value: Boolean | ValidationSummary): Self = this.set("validationSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationSummary: Self = this.set("validationSummary", js.undefined)
  }
}
