package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormValidatable extends js.Object {
  
  var errorTemplate: String | js.Function = js.native
  
  var validateOnBlur: Boolean = js.native
  
  var validationSummary: Boolean = js.native
}
object FormValidatable {
  
  @scala.inline
  def apply(errorTemplate: String | js.Function, validateOnBlur: Boolean, validationSummary: Boolean): FormValidatable = {
    val __obj = js.Dynamic.literal(errorTemplate = errorTemplate.asInstanceOf[js.Any], validateOnBlur = validateOnBlur.asInstanceOf[js.Any], validationSummary = validationSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormValidatable]
  }
  
  @scala.inline
  implicit class FormValidatableOps[Self <: FormValidatable] (val x: Self) extends AnyVal {
    
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
    def setErrorTemplate(value: String | js.Function): Self = this.set("errorTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnBlur(value: Boolean): Self = this.set("validateOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationSummary(value: Boolean): Self = this.set("validationSummary", value.asInstanceOf[js.Any])
  }
}
