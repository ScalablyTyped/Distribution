package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.wizard.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WizardSelectEvent extends WizardEvent {
  
  var button: js.UndefOr[Button] = js.native
  
  var originalEvent: js.UndefOr[js.Any] = js.native
  
  var step: js.UndefOr[Step] = js.native
  
  var stepper: js.UndefOr[Stepper] = js.native
}
object WizardSelectEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Wizard): WizardSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[WizardSelectEvent]
  }
  
  @scala.inline
  implicit class WizardSelectEventMutableBuilder[Self <: WizardSelectEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: Button): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    
    @scala.inline
    def setStep(value: Step): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setStepper(value: Stepper): Self = StObject.set(x, "stepper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepperUndefined: Self = StObject.set(x, "stepper", js.undefined)
  }
}
