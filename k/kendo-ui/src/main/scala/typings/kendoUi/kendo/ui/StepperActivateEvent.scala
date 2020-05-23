package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.stepper.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepperActivateEvent extends js.Object {
  var originalEvent: js.UndefOr[js.Any] = js.undefined
  var sender: js.UndefOr[Stepper] = js.undefined
  var step: js.UndefOr[Step] = js.undefined
}

object StepperActivateEvent {
  @scala.inline
  def apply(originalEvent: js.Any = null, sender: Stepper = null, step: Step = null): StepperActivateEvent = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperActivateEvent]
  }
}

