package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatorValidateEvent
  extends StObject
     with ValidatorEvent {
  
  var errors: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var valid: js.UndefOr[Boolean] = js.undefined
}
object ValidatorValidateEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Validator): ValidatorValidateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorValidateEvent]
  }
  
  @scala.inline
  implicit class ValidatorValidateEventMutableBuilder[Self <: ValidatorValidateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[js.Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: js.Any*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
  }
}
