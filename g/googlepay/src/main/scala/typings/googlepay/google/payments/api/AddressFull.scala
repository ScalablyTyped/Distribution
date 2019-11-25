package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.googlepay.google.payments.api.Address because Already inherited */ trait AddressFull extends AddressMin {
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
    val __obj = js.Dynamic.literal(address1 = address1.asInstanceOf[js.Any], address2 = address2.asInstanceOf[js.Any], address3 = address3.asInstanceOf[js.Any], administrativeArea = administrativeArea.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], sortingCode = sortingCode.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressFull]
  }
}

