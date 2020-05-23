package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.stepper.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepperSelectEvent extends StepperActivateEvent {
  var preventDefault: js.Function
  def isDefaultPrevented(): Boolean
}

object StepperSelectEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    originalEvent: js.Any = null,
    sender: Stepper = null,
    step: Step = null
  ): StepperSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any])
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperSelectEvent]
  }
}

