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
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], fullAddress = fullAddress.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddressOutput]
  }
}

