package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.wizard.Step
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
  implicit class WizardSelectEventOps[Self <: WizardSelectEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setButton(value: Button): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setOriginalEvent(value: js.Any): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalEvent: Self = this.set("originalEvent", js.undefined)
    
    @scala.inline
    def setStep(value: Step): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setStepper(value: Stepper): Self = this.set("stepper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepper: Self = this.set("stepper", js.undefined)
  }
}
