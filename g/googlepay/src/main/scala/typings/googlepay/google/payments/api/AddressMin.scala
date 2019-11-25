package typings.googlepay.google.payments.api

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
    val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressMin]
  }
}

