package typings.atMaterialTextfield.adapterMod

import typings.atMaterialTextfield.Anon_BadInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeInputType extends js.Object {
  var badInput: Boolean
  var disabled: Boolean
  var validity: Anon_BadInput
  var value: String
}

object NativeInputType {
  @scala.inline
  def apply(badInput: Boolean, disabled: Boolean, validity: Anon_BadInput, value: String): NativeInputType = {
    val __obj = js.Dynamic.literal(badInput = badInput, disabled = disabled, validity = validity, value = value)
  
    __obj.asInstanceOf[NativeInputType]
  }
}

