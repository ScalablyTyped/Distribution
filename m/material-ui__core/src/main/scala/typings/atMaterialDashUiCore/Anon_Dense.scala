package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.dense
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.none
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.normal
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dense extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var filled: js.UndefOr[Boolean] = js.undefined
  var focused: js.UndefOr[Boolean] = js.undefined
  var margin: js.UndefOr[dense | none | normal] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var startAdornment: js.UndefOr[ReactNode] = js.undefined
}

object Anon_Dense {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    filled: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    margin: dense | none | normal = null,
    required: js.UndefOr[Boolean] = js.undefined,
    startAdornment: ReactNode = null
  ): Anon_Dense = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(filled)) __obj.updateDynamic("filled")(filled)
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (startAdornment != null) __obj.updateDynamic("startAdornment")(startAdornment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Dense]
  }
}

