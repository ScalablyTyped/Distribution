package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.stepper.StepOptions
import typings.kendoUi.kendoUiStrings.horizontal
import typings.kendoUi.kendoUiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepperOptions extends js.Object {
  var activate: js.UndefOr[js.Function1[/* e */ StepperActivateEvent, Unit]] = js.undefined
  var indicator: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[Boolean] = js.undefined
  var linear: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var orientation: js.UndefOr[String | horizontal | vertical] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ StepperSelectEvent, Unit]] = js.undefined
  var selectOnFocus: js.UndefOr[Boolean] = js.undefined
  var steps: js.Array[StepOptions | String]
}

object StepperOptions {
  @scala.inline
  def apply(
    steps: js.Array[StepOptions | String],
    activate: /* e */ StepperActivateEvent => Unit = null,
    indicator: js.UndefOr[Boolean] = js.undefined,
    label: js.UndefOr[Boolean] = js.undefined,
    linear: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    orientation: String | horizontal | vertical = null,
    select: /* e */ StepperSelectEvent => Unit = null,
    selectOnFocus: js.UndefOr[Boolean] = js.undefined
  ): StepperOptions = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction1(activate))
    if (!js.isUndefined(indicator)) __obj.updateDynamic("indicator")(indicator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.get.asInstanceOf[js.Any])
    if (!js.isUndefined(linear)) __obj.updateDynamic("linear")(linear.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (!js.isUndefined(selectOnFocus)) __obj.updateDynamic("selectOnFocus")(selectOnFocus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperOptions]
  }
}

