package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumericTextBoxOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ NumericTextBoxChangeEvent, scala.Unit]] = js.undefined
  var culture: js.UndefOr[java.lang.String] = js.undefined
  var decimals: js.UndefOr[scala.Double] = js.undefined
  var downArrowText: js.UndefOr[java.lang.String] = js.undefined
  var factor: js.UndefOr[scala.Double] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var restrictDecimals: js.UndefOr[scala.Boolean] = js.undefined
  var round: js.UndefOr[scala.Boolean] = js.undefined
  var spin: js.UndefOr[js.Function1[/* e */ NumericTextBoxSpinEvent, scala.Unit]] = js.undefined
  var spinners: js.UndefOr[scala.Boolean] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var upArrowText: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object NumericTextBoxOptions {
  @scala.inline
  def apply(
    change: /* e */ NumericTextBoxChangeEvent => scala.Unit = null,
    culture: java.lang.String = null,
    decimals: scala.Int | scala.Double = null,
    downArrowText: java.lang.String = null,
    factor: scala.Int | scala.Double = null,
    format: java.lang.String = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    placeholder: java.lang.String = null,
    restrictDecimals: js.UndefOr[scala.Boolean] = js.undefined,
    round: js.UndefOr[scala.Boolean] = js.undefined,
    spin: /* e */ NumericTextBoxSpinEvent => scala.Unit = null,
    spinners: js.UndefOr[scala.Boolean] = js.undefined,
    step: scala.Int | scala.Double = null,
    upArrowText: java.lang.String = null,
    value: scala.Int | scala.Double = null
  ): NumericTextBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (downArrowText != null) __obj.updateDynamic("downArrowText")(downArrowText)
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(restrictDecimals)) __obj.updateDynamic("restrictDecimals")(restrictDecimals)
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round)
    if (spin != null) __obj.updateDynamic("spin")(js.Any.fromFunction1(spin))
    if (!js.isUndefined(spinners)) __obj.updateDynamic("spinners")(spinners)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (upArrowText != null) __obj.updateDynamic("upArrowText")(upArrowText)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericTextBoxOptions]
  }
}

