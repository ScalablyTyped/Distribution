package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googlepay.google.payments.api.AddressMin
  - typings.googlepay.google.payments.api.AddressFull
*/
trait Address extends js.Object

object Address {
  @scala.inline
  def AddressMin(countryCode: String, name: String, postalCode: String, phoneNumber: String = null): Address = {
    val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  @scala.inline
  def AddressFull(
    address1: String,
    address2: String,
    address3: String,
    administrativeArea: String,
    countryCode: String,
    locality: String,
    name: String,
    postalCode: String,
    sortingCode: String,
    phoneNumber: String = null
  ): Address = {
    val __obj = js.Dynamic.literal(address1 = address1.asInstanceOf[js.Any], address2 = address2.asInstanceOf[js.Any], address3 = address3.asInstanceOf[js.Any], administrativeArea = administrativeArea.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], sortingCode = sortingCode.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

