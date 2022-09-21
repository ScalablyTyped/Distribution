package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.wizard.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WizardSelectEvent
  extends StObject
     with WizardEvent {
  
  var button: js.UndefOr[Button] = js.undefined
  
  var originalEvent: js.UndefOr[Any] = js.undefined
  
  var step: js.UndefOr[Step] = js.undefined
  
  var stepper: js.UndefOr[Stepper] = js.undefined
}
object WizardSelectEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Wizard): WizardSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[WizardSelectEvent]
  }
  
  extension [Self <: WizardSelectEvent](x: Self) {
    
    inline def setButton(value: Button): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    
    inline def setStep(value: Step): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setStepper(value: Stepper): Self = StObject.set(x, "stepper", value.asInstanceOf[js.Any])
    
    inline def setStepperUndefined: Self = StObject.set(x, "stepper", js.undefined)
  }
}
