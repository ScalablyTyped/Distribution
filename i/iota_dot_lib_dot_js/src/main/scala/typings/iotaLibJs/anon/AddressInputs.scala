package typings.iotaLibJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressInputs extends js.Object {
  var address: String
  var inputs: js.Array[String]
}

object AddressInputs {
  @scala.inline
  def apply(address: String, inputs: js.Array[String]): AddressInputs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressInputs]
  }
}

