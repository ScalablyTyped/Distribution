package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatorOptions extends StObject {
  
  var errorTemplate: js.UndefOr[String] = js.undefined
  
  var messages: js.UndefOr[Any] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var rules: js.UndefOr[Any] = js.undefined
  
  var validate: js.UndefOr[js.Function1[/* e */ ValidatorValidateEvent, Unit]] = js.undefined
  
  var validateInput: js.UndefOr[js.Function1[/* e */ ValidatorValidateInputEvent, Unit]] = js.undefined
  
  var validateOnBlur: js.UndefOr[Boolean] = js.undefined
  
  var validationSummary: js.UndefOr[Boolean | ValidationSummary] = js.undefined
}
object ValidatorOptions {
  
  inline def apply(): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidatorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidatorOptions] (val x: Self) extends AnyVal {
    
    inline def setErrorTemplate(value: String): Self = StObject.set(x, "errorTemplate", value.asInstanceOf[js.Any])
    
    inline def setErrorTemplateUndefined: Self = StObject.set(x, "errorTemplate", js.undefined)
    
    inline def setMessages(value: Any): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRules(value: Any): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setValidate(value: /* e */ ValidatorValidateEvent => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    inline def setValidateInput(value: /* e */ ValidatorValidateInputEvent => Unit): Self = StObject.set(x, "validateInput", js.Any.fromFunction1(value))
    
    inline def setValidateInputUndefined: Self = StObject.set(x, "validateInput", js.undefined)
    
    inline def setValidateOnBlur(value: Boolean): Self = StObject.set(x, "validateOnBlur", value.asInstanceOf[js.Any])
    
    inline def setValidateOnBlurUndefined: Self = StObject.set(x, "validateOnBlur", js.undefined)
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    inline def setValidationSummary(value: Boolean | ValidationSummary): Self = StObject.set(x, "validationSummary", value.asInstanceOf[js.Any])
    
    inline def setValidationSummaryUndefined: Self = StObject.set(x, "validationSummary", js.undefined)
  }
}
