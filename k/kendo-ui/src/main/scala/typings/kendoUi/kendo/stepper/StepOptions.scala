package typings.kendoUi.kendo.stepper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepOptions extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var iconTemplate: js.UndefOr[String | js.Function] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var indicatorVisible: js.UndefOr[Boolean] = js.undefined
  var isFirstStep: js.UndefOr[Boolean] = js.undefined
  var isLastStep: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelVisible: js.UndefOr[Boolean] = js.undefined
  var previous: js.UndefOr[Boolean] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var successIcon: js.UndefOr[String] = js.undefined
}

object StepOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    iconTemplate: String | js.Function = null,
    index: js.UndefOr[Double] = js.undefined,
    indicatorVisible: js.UndefOr[Boolean] = js.undefined,
    isFirstStep: js.UndefOr[Boolean] = js.undefined,
    isLastStep: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    labelVisible: js.UndefOr[Boolean] = js.undefined,
    previous: js.UndefOr[Boolean] = js.undefined,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    successIcon: String = null
  ): StepOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconTemplate != null) __obj.updateDynamic("iconTemplate")(iconTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indicatorVisible)) __obj.updateDynamic("indicatorVisible")(indicatorVisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isFirstStep)) __obj.updateDynamic("isFirstStep")(isFirstStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLastStep)) __obj.updateDynamic("isLastStep")(isLastStep.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelVisible)) __obj.updateDynamic("labelVisible")(labelVisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(previous)) __obj.updateDynamic("previous")(previous.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (successIcon != null) __obj.updateDynamic("successIcon")(successIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepOptions]
  }
}

