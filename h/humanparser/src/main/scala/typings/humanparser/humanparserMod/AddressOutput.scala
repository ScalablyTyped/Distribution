package typings.humanparser.humanparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressOutput extends js.Object {
  var address: String
  var city: String
  var fullAddress: String
  var state: String
  var zip: String
}

object AddressOutput {
  @scala.inline
  def apply(address: String, city: String, fullAddress: String, state: String, zip: String): AddressOutput = {
    val __obj = js.Dynamic.literal(address = address, city = city, fullAddress = fullAddress, state = state, zip = zip)
  
    __obj.asInstanceOf[AddressOutput]
  }
}

