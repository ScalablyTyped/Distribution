package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlipswitchOptions extends js.Object {
  var corners: js.UndefOr[Boolean] = js.undefined
  var defaults: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var enhanced: js.UndefOr[Boolean] = js.undefined
  var mini: js.UndefOr[Boolean] = js.undefined
  var offText: js.UndefOr[String] = js.undefined
  var onText: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var wrapperClass: js.UndefOr[String] = js.undefined
}

object FlipswitchOptions {
  @scala.inline
  def apply(
    corners: js.UndefOr[Boolean] = js.undefined,
    defaults: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enhanced: js.UndefOr[Boolean] = js.undefined,
    mini: js.UndefOr[Boolean] = js.undefined,
    offText: String = null,
    onText: String = null,
    theme: String = null,
    wrapperClass: String = null
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

