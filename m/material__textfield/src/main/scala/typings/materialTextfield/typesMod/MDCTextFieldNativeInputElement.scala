package typings.materialTextfield.typesMod

import typings.materialTextfield.anon.PickValidityStatebadInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.HTMLInputElement, 'disabled' | 'maxLength' | 'type' | 'value' | 'required'> & {  validity :std.Pick<std.ValidityState, 'badInput' | 'valid'>} */
@js.native
trait MDCTextFieldNativeInputElement extends js.Object {
  
  var disabled: Boolean = js.native
  
  var maxLength: Double = js.native
  
  var required: Boolean = js.native
  
  var `type`: String = js.native
  
  var validity: PickValidityStatebadInput = js.native
  
  var value: String = js.native
}
object MDCTextFieldNativeInputElement {
  
  @scala.inline
  def apply(
    disabled: Boolean,
    maxLength: Double,
    required: Boolean,
    `type`: String,
    validity: PickValidityStatebadInput,
    value: String
  ): MDCTextFieldNativeInputElement = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], validity = validity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCTextFieldNativeInputElement]
  }
  
  @scala.inline
  implicit class MDCTextFieldNativeInputElementOps[Self <: MDCTextFieldNativeInputElement] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidity(value: PickValidityStatebadInput): Self = this.set("validity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
