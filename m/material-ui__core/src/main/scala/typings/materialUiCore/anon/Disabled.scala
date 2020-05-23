package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreStrings.dense
import typings.materialUiCore.materialUiCoreStrings.none
import typings.materialUiCore.materialUiCoreStrings.normal
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disabled extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[Boolean] = js.native
  var filled: js.UndefOr[Boolean] = js.native
  var focused: js.UndefOr[Boolean] = js.native
  var margin: js.UndefOr[dense | none | normal] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var startAdornment: js.UndefOr[ReactNode] = js.native
}

object Disabled {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    filled: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    margin: dense | none | normal = null,
    required: js.UndefOr[Boolean] = js.undefined,
    startAdornment: ReactNode = null
  ): Disabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filled)) __obj.updateDynamic("filled")(filled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.get.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (startAdornment != null) __obj.updateDynamic("startAdornment")(startAdornment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
}

