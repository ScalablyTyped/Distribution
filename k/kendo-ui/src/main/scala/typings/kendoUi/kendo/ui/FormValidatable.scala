package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormValidatable extends StObject {
  
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
  implicit class FormValidatableMutableBuilder[Self <: FormValidatable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorTemplate(value: String | js.Function): Self = StObject.set(x, "errorTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnBlur(value: Boolean): Self = StObject.set(x, "validateOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationSummary(value: Boolean): Self = StObject.set(x, "validationSummary", value.asInstanceOf[js.Any])
  }
}
