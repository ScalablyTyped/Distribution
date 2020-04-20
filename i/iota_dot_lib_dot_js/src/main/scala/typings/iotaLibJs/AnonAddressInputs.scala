package typings.iotaLibJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddressInputs extends js.Object {
  var address: String
  var inputs: js.Array[String]
}

object AnonAddressInputs {
  @scala.inline
  def apply(address: String, inputs: js.Array[String]): AnonAddressInputs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddressInputs]
  }
}

