package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dense extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var filled: js.UndefOr[scala.Boolean] = js.undefined
  var focused: js.UndefOr[scala.Boolean] = js.undefined
  var margin: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.dense | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.none | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.normal
  ] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var startAdornment: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object Anon_Dense {
  @scala.inline
  def apply(
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    filled: js.UndefOr[scala.Boolean] = js.undefined,
    focused: js.UndefOr[scala.Boolean] = js.undefined,
    margin: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.dense | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.none | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.normal = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    startAdornment: reactLib.reactMod.ReactNs.ReactNode = null
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

