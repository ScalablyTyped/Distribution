package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.stepper.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepperActivateEvent extends StObject {
  
  var originalEvent: js.UndefOr[js.Any] = js.native
  
  var sender: js.UndefOr[Stepper] = js.native
  
  var step: js.UndefOr[Step] = js.native
}
object StepperActivateEvent {
  
  @scala.inline
  def apply(): StepperActivateEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepperActivateEvent]
  }
  
  @scala.inline
  implicit class StepperActivateEventMutableBuilder[Self <: StepperActivateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    
    @scala.inline
    def setSender(value: Stepper): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    @scala.inline
    def setStep(value: Step): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
