package typings.materialTextfield.adapterMod

import typings.materialTextfield.helperTextMod.MDCTextFieldHelperTextFoundation
import typings.materialTextfield.iconMod.MDCTextFieldIconFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoundationMapType extends js.Object {
  var helperText: js.UndefOr[MDCTextFieldHelperTextFoundation] = js.undefined
  var icon: js.UndefOr[MDCTextFieldIconFoundation] = js.undefined
}

object FoundationMapType {
  @scala.inline
  def apply(helperText: MDCTextFieldHelperTextFoundation = null, icon: MDCTextFieldIconFoundation = null): FoundationMapType = {
    val __obj = js.Dynamic.literal()
    if (helperText != null) __obj.updateDynamic("helperText")(helperText.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoundationMapType]
  }
}

