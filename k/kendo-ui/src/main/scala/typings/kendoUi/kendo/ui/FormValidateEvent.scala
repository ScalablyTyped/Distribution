package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormValidateEvent
  extends StObject
     with FormEvent {
  
  var errors: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var model: js.UndefOr[Model] = js.undefined
  
  var valid: js.UndefOr[Boolean] = js.undefined
}
object FormValidateEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Form): FormValidateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormValidateEvent]
  }
  
  @scala.inline
  implicit class FormValidateEventMutableBuilder[Self <: FormValidateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[js.Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: js.Any*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
  }
}
