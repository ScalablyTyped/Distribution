package typings
package atMaterialTextfieldLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeInputType extends js.Object {
  var badInput: scala.Boolean
  var disabled: scala.Boolean
  var validity: atMaterialTextfieldLib.Anon_BadInput
  var value: java.lang.String
}

object NativeInputType {
  @scala.inline
  def apply(
    badInput: scala.Boolean,
    disabled: scala.Boolean,
    validity: atMaterialTextfieldLib.Anon_BadInput,
    value: java.lang.String
  ): NativeInputType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("badInput")(badInput)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("validity")(validity)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[NativeInputType]
  }
}

