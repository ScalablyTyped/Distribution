package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumericTextBoxOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ NumericTextBoxChangeEvent, Unit]] = js.undefined
  var culture: js.UndefOr[String] = js.undefined
  var decimals: js.UndefOr[Double] = js.undefined
  var downArrowText: js.UndefOr[String] = js.undefined
  var factor: js.UndefOr[Double] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String | js.Function | NumericTextBoxLabel] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var restrictDecimals: js.UndefOr[Boolean] = js.undefined
  var round: js.UndefOr[Boolean] = js.undefined
  var spin: js.UndefOr[js.Function1[/* e */ NumericTextBoxSpinEvent, Unit]] = js.undefined
  var spinners: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var upArrowText: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object NumericTextBoxOptions {
  @scala.inline
  def apply(
    change: /* e */ NumericTextBoxChangeEvent => Unit = null,
    culture: String = null,
    decimals: js.UndefOr[Double] = js.undefined,
    downArrowText: String = null,
    factor: js.UndefOr[Double] = js.undefined,
    format: String = null,
    label: String | js.Function | NumericTextBoxLabel = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    name: String = null,
    placeholder: String = null,
    restrictDecimals: js.UndefOr[Boolean] = js.undefined,
    round: js.UndefOr[Boolean] = js.undefined,
    spin: /* e */ NumericTextBoxSpinEvent => Unit = null,
    spinners: js.UndefOr[Boolean] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    upArrowText: String = null,
    value: js.UndefOr[Double] = js.undefined
  ): NumericTextBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (!js.isUndefined(decimals)) __obj.updateDynamic("decimals")(decimals.get.asInstanceOf[js.Any])
    if (downArrowText != null) __obj.updateDynamic("downArrowText")(downArrowText.asInstanceOf[js.Any])
    if (!js.isUndefined(factor)) __obj.updateDynamic("factor")(factor.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictDecimals)) __obj.updateDynamic("restrictDecimals")(restrictDecimals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.get.asInstanceOf[js.Any])
    if (spin != null) __obj.updateDynamic("spin")(js.Any.fromFunction1(spin))
    if (!js.isUndefined(spinners)) __obj.updateDynamic("spinners")(spinners.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (upArrowText != null) __obj.updateDynamic("upArrowText")(upArrowText.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericTextBoxOptions]
  }
}

