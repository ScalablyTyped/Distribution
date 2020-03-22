package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of a user's address.
  */
trait Address extends js.Object {
  /**
    * The first line of the address.
    *
    * Will be set to empty string if the address does not have a first
    * line.
    *
    * @default ""
    */
  var address1: js.UndefOr[String] = js.undefined
  /**
    * The second line of the address.
    *
    * Will be set to empty string if the address does not have a second
    * line.
    *
    * @default ""
    */
  var address2: js.UndefOr[String] = js.undefined
  /**
    * The third line of the address.
    *
    * Will be set to empty string if the address does not have a third
    * line.
    *
    * @default ""
    */
  var address3: js.UndefOr[String] = js.undefined
  /**
    * The administrative area (e.g. state or province).
    */
  var administrativeArea: String
  /**
    * The two-letter ISO-3166 country code.
    */
  var countryCode: String
  /**
    * The locality (e.g. city or town).
    */
  var locality: String
  /**
    * Name of the recipient at this address.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The phone number.
    *
    * This field will only be present if the caller requested that a phone
    * number be returned.
    */
  var phoneNumber: js.UndefOr[String] = js.undefined
  /**
    * The postal code (also known in some places as ZIP code).
    *
    * Note: some regions do not have postal codes. In those cases
    * this field will be set to an empty string.
    */
  var postalCode: String
  /**
    * The sorting code.
    *
    * Note: some regions do not have sorting codes. In those cases
    * this field will be set to an empty string.
    */
  var sortingCode: js.UndefOr[String] = js.undefined
}

object Address {
  @scala.inline
  def apply(
    administrativeArea: String,
    countryCode: String,
    locality: String,
    postalCode: String,
    address1: String = null,
    address2: String = null,
    address3: String = null,
    name: String = null,
    phoneNumber: String = null,
    sortingCode: String = null
  ): Address = {
    val __obj = js.Dynamic.literal(administrativeArea = administrativeArea.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any])
    if (address1 != null) __obj.updateDynamic("address1")(address1.asInstanceOf[js.Any])
    if (address2 != null) __obj.updateDynamic("address2")(address2.asInstanceOf[js.Any])
    if (address3 != null) __obj.updateDynamic("address3")(address3.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (sortingCode != null) __obj.updateDynamic("sortingCode")(sortingCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

