package typings.iotaDotLibDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressInputs extends js.Object {
  var address: String
  var inputs: js.Array[String]
}

object Anon_AddressInputs {
  @scala.inline
  def apply(address: String, inputs: js.Array[String]): Anon_AddressInputs = {
    val __obj = js.Dynamic.literal(address = address, inputs = inputs)
  
    __obj.asInstanceOf[Anon_AddressInputs]
  }
}

