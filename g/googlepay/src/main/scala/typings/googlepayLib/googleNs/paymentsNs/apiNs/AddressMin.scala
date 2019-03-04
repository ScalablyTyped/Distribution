package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressMin extends Address {
  var countryCode: java.lang.String
  var name: java.lang.String
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  var postalCode: java.lang.String
}

object AddressMin {
  @scala.inline
  def apply(
    countryCode: java.lang.String,
    name: java.lang.String,
    postalCode: java.lang.String,
    phoneNumber: java.lang.String = null
  ): AddressMin = {
    val __obj = js.Dynamic.literal(countryCode = countryCode, name = name, postalCode = postalCode)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    __obj.asInstanceOf[AddressMin]
  }
}

