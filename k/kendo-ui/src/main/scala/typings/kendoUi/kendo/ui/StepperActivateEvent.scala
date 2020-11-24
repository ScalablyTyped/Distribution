package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.stepper.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepperActivateEvent extends js.Object {
  
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
  implicit class StepperActivateEventOps[Self <: StepperActivateEvent] (val x: Self) extends AnyVal {
    
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
    def setOriginalEvent(value: js.Any): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalEvent: Self = this.set("originalEvent", js.undefined)
    
    @scala.inline
    def setSender(value: Stepper): Self = this.set("sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSender: Self = this.set("sender", js.undefined)
    
    @scala.inline
    def setStep(value: Step): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}
