package typings.googlepay.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressMin extends Address {
  var countryCode: String
  var name: String
  var phoneNumber: js.UndefOr[String] = js.undefined
  var postalCode: String
}

object AddressMin {
  @scala.inline
  def apply(countryCode: String, name: String, postalCode: String, phoneNumber: String = null): AddressMin = {
    val __obj = js.Dynamic.literal(countryCode = countryCode, name = name, postalCode = postalCode)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    __obj.asInstanceOf[AddressMin]
  }
}

