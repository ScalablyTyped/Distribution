package typings.materialTextfield.adapterMod

import typings.materialTextfield.AnonBadInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeInputType extends js.Object {
  var badInput: Boolean
  var disabled: Boolean
  var validity: AnonBadInput
  var value: String
}

object NativeInputType {
  @scala.inline
  def apply(badInput: Boolean, disabled: Boolean, validity: AnonBadInput, value: String): NativeInputType = {
    val __obj = js.Dynamic.literal(badInput = badInput.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], validity = validity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NativeInputType]
  }
}

