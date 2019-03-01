package typings
package atMaterialTextfieldLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoundationMapType extends js.Object {
  var helperText: js.UndefOr[atMaterialTextfieldLib.helperDashTextMod.MDCTextFieldHelperTextFoundation] = js.undefined
  var icon: js.UndefOr[atMaterialTextfieldLib.iconMod.MDCTextFieldIconFoundation] = js.undefined
}

object FoundationMapType {
  @scala.inline
  def apply(
    helperText: atMaterialTextfieldLib.helperDashTextMod.MDCTextFieldHelperTextFoundation = null,
    icon: atMaterialTextfieldLib.iconMod.MDCTextFieldIconFoundation = null
  ): FoundationMapType = {
    val __obj = js.Dynamic.literal()
    if (helperText != null) __obj.updateDynamic("helperText")(helperText)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    __obj.asInstanceOf[FoundationMapType]
  }
}

