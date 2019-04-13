package typings
package humanparserLib.humanparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressOutput extends js.Object {
  var address: java.lang.String
  var city: java.lang.String
  var fullAddress: java.lang.String
  var state: java.lang.String
  var zip: java.lang.String
}

object AddressOutput {
  @scala.inline
  def apply(
    address: java.lang.String,
    city: java.lang.String,
    fullAddress: java.lang.String,
    state: java.lang.String,
    zip: java.lang.String
  ): AddressOutput = {
    val __obj = js.Dynamic.literal(address = address, city = city, fullAddress = fullAddress, state = state, zip = zip)
  
    __obj.asInstanceOf[AddressOutput]
  }
}

