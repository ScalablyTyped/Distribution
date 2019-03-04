package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- googlepayLib.googleNs.paymentsNs.apiNs.Address because Already inherited */ trait AddressFull extends AddressMin {
  var address1: java.lang.String
  var address2: java.lang.String
  var address3: java.lang.String
  var administrativeArea: java.lang.String
  var locality: java.lang.String
  var sortingCode: java.lang.String
}

object AddressFull {
  @scala.inline
  def apply(
    address1: java.lang.String,
    address2: java.lang.String,
    address3: java.lang.String,
    administrativeArea: java.lang.String,
    countryCode: java.lang.String,
    locality: java.lang.String,
    name: java.lang.String,
    postalCode: java.lang.String,
    sortingCode: java.lang.String,
    phoneNumber: java.lang.String = null
  ): AddressFull = {
    val __obj = js.Dynamic.literal(address1 = address1, address2 = address2, address3 = address3, administrativeArea = administrativeArea, countryCode = countryCode, locality = locality, name = name, postalCode = postalCode, sortingCode = sortingCode)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    __obj.asInstanceOf[AddressFull]
  }
}

