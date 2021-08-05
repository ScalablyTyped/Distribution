package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.wizard.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WizardFormValidateFailedEvent
  extends StObject
     with WizardEvent {
  
  var form: js.UndefOr[Form] = js.undefined
  
  var step: js.UndefOr[Step] = js.undefined
}
object WizardFormValidateFailedEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Wizard): WizardFormValidateFailedEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[WizardFormValidateFailedEvent]
  }
  
  extension [Self <: WizardFormValidateFailedEvent](x: Self) {
    
    inline def setForm(value: Form): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setStep(value: Step): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
