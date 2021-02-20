package typings.hapiJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationResult extends StObject {
  
  var error: js.UndefOr[ValidationError] = js.native
  
  var errors: js.UndefOr[ValidationError] = js.native
  
  var value: js.Any = js.native
  
  var warning: js.UndefOr[ValidationError] = js.native
}
object ValidationResult {
  
  @scala.inline
  def apply(value: js.Any): ValidationResult = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationResult]
  }
  
  @scala.inline
  implicit class ValidationResultMutableBuilder[Self <: ValidationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: ValidationError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setErrors(value: ValidationError): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarning(value: ValidationError): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
