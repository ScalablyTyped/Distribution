package typings.googlepay.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.googlepay.googleNs.paymentsNs.apiNs.Address because Already inherited */ trait AddressFull extends AddressMin {
  var address1: String
  var address2: String
  var address3: String
  var administrativeArea: String
  var locality: String
  var sortingCode: String
}

object AddressFull {
  @scala.inline
  def apply(
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
  ): AddressFull = {
    val __obj = js.Dynamic.literal(address1 = address1, address2 = address2, address3 = address3, administrativeArea = administrativeArea, countryCode = countryCode, locality = locality, name = name, postalCode = postalCode, sortingCode = sortingCode)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    __obj.asInstanceOf[AddressFull]
  }
}

