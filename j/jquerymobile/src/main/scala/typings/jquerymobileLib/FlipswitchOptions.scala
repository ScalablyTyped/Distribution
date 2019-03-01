package typings
package jquerymobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlipswitchOptions extends js.Object {
  var corners: js.UndefOr[scala.Boolean] = js.undefined
  var defaults: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var enhanced: js.UndefOr[scala.Boolean] = js.undefined
  var mini: js.UndefOr[scala.Boolean] = js.undefined
  var offText: js.UndefOr[java.lang.String] = js.undefined
  var onText: js.UndefOr[java.lang.String] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var wrapperClass: js.UndefOr[java.lang.String] = js.undefined
}

object FlipswitchOptions {
  @scala.inline
  def apply(
    corners: js.UndefOr[scala.Boolean] = js.undefined,
    defaults: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    enhanced: js.UndefOr[scala.Boolean] = js.undefined,
    mini: js.UndefOr[scala.Boolean] = js.undefined,
    offText: java.lang.String = null,
    onText: java.lang.String = null,
    theme: java.lang.String = null,
    wrapperClass: java.lang.String = null
  ): FlipswitchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(corners)) __obj.updateDynamic("corners")(corners)
    if (!js.isUndefined(defaults)) __obj.updateDynamic("defaults")(defaults)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(enhanced)) __obj.updateDynamic("enhanced")(enhanced)
    if (!js.isUndefined(mini)) __obj.updateDynamic("mini")(mini)
    if (offText != null) __obj.updateDynamic("offText")(offText)
    if (onText != null) __obj.updateDynamic("onText")(onText)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (wrapperClass != null) __obj.updateDynamic("wrapperClass")(wrapperClass)
    __obj.asInstanceOf[FlipswitchOptions]
  }
}

