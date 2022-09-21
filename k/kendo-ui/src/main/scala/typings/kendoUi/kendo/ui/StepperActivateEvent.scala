package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.stepper.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepperActivateEvent extends StObject {
  
  var originalEvent: js.UndefOr[Any] = js.undefined
  
  var sender: js.UndefOr[Stepper] = js.undefined
  
  var step: js.UndefOr[Step] = js.undefined
}
object StepperActivateEvent {
  
  inline def apply(): StepperActivateEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepperActivateEvent]
  }
  
  extension [Self <: StepperActivateEvent](x: Self) {
    
    inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    
    inline def setSender(value: Stepper): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    inline def setStep(value: Step): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
