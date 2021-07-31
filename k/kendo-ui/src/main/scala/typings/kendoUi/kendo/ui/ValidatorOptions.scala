package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatorOptions extends StObject {
  
  var errorTemplate: js.UndefOr[String] = js.undefined
  
  var messages: js.UndefOr[js.Any] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var rules: js.UndefOr[js.Any] = js.undefined
  
  var validate: js.UndefOr[js.Function1[/* e */ ValidatorValidateEvent, Unit]] = js.undefined
  
  var validateInput: js.UndefOr[js.Function1[/* e */ ValidatorValidateInputEvent, Unit]] = js.undefined
  
  var validateOnBlur: js.UndefOr[Boolean] = js.undefined
  
  var validationSummary: js.UndefOr[Boolean | ValidationSummary] = js.undefined
}
object ValidatorOptions {
  
  @scala.inline
  def apply(): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidatorOptions]
  }
  
  @scala.inline
  implicit class ValidatorOptionsMutableBuilder[Self <: ValidatorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorTemplate(value: String): Self = StObject.set(x, "errorTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorTemplateUndefined: Self = StObject.set(x, "errorTemplate", js.undefined)
    
    @scala.inline
    def setMessages(value: js.Any): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRules(value: js.Any): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setValidate(value: /* e */ ValidatorValidateEvent => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateInput(value: /* e */ ValidatorValidateInputEvent => Unit): Self = StObject.set(x, "validateInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateInputUndefined: Self = StObject.set(x, "validateInput", js.undefined)
    
    @scala.inline
    def setValidateOnBlur(value: Boolean): Self = StObject.set(x, "validateOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnBlurUndefined: Self = StObject.set(x, "validateOnBlur", js.undefined)
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    @scala.inline
    def setValidationSummary(value: Boolean | ValidationSummary): Self = StObject.set(x, "validationSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationSummaryUndefined: Self = StObject.set(x, "validationSummary", js.undefined)
  }
}
