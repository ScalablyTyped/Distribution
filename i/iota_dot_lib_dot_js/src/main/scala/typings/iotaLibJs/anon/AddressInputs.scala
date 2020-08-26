package typings.iotaLibJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressInputs extends js.Object {
  var address: String = js.native
  var inputs: js.Array[String] = js.native
}

object AddressInputs {
  @scala.inline
  def apply(address: String, inputs: js.Array[String]): AddressInputs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressInputs]
  }
  @scala.inline
  implicit class AddressInputsOps[Self <: AddressInputs] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputsVarargs(value: String*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[String]): Self = this.set("inputs", value.asInstanceOf[js.Any])
  }
  
}

