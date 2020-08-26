package typings.materialTextfield.typesMod

import typings.materialTextfield.foundationMod.MDCTextFieldCharacterCounterFoundation
import typings.materialTextfield.helperTextFoundationMod.MDCTextFieldHelperTextFoundation
import typings.materialTextfield.iconFoundationMod.MDCTextFieldIconFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTextFieldFoundationMap extends js.Object {
  var characterCounter: MDCTextFieldCharacterCounterFoundation = js.native
  var helperText: MDCTextFieldHelperTextFoundation = js.native
  var leadingIcon: MDCTextFieldIconFoundation = js.native
  var trailingIcon: MDCTextFieldIconFoundation = js.native
}

object MDCTextFieldFoundationMap {
  @scala.inline
  def apply(
    characterCounter: MDCTextFieldCharacterCounterFoundation,
    helperText: MDCTextFieldHelperTextFoundation,
    leadingIcon: MDCTextFieldIconFoundation,
    trailingIcon: MDCTextFieldIconFoundation
  ): MDCTextFieldFoundationMap = {
    val __obj = js.Dynamic.literal(characterCounter = characterCounter.asInstanceOf[js.Any], helperText = helperText.asInstanceOf[js.Any], leadingIcon = leadingIcon.asInstanceOf[js.Any], trailingIcon = trailingIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCTextFieldFoundationMap]
  }
  @scala.inline
  implicit class MDCTextFieldFoundationMapOps[Self <: MDCTextFieldFoundationMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCharacterCounter(value: MDCTextFieldCharacterCounterFoundation): Self = this.set("characterCounter", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelperText(value: MDCTextFieldHelperTextFoundation): Self = this.set("helperText", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeadingIcon(value: MDCTextFieldIconFoundation): Self = this.set("leadingIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrailingIcon(value: MDCTextFieldIconFoundation): Self = this.set("trailingIcon", value.asInstanceOf[js.Any])
  }
  
}

