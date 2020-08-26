package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of a user's address.
  */
@js.native
trait Address extends js.Object {
  /**
    * The first line of the address.
    *
    * Will be set to empty string if the address does not have a first
    * line.
    *
    * @default ""
    */
  var address1: js.UndefOr[String] = js.native
  /**
    * The second line of the address.
    *
    * Will be set to empty string if the address does not have a second
    * line.
    *
    * @default ""
    */
  var address2: js.UndefOr[String] = js.native
  /**
    * The third line of the address.
    *
    * Will be set to empty string if the address does not have a third
    * line.
    *
    * @default ""
    */
  var address3: js.UndefOr[String] = js.native
  /**
    * The administrative area (e.g. state or province).
    */
  var administrativeArea: String = js.native
  /**
    * The two-letter ISO-3166 country code.
    */
  var countryCode: String = js.native
  /**
    * The locality (e.g. city or town).
    */
  var locality: String = js.native
  /**
    * Name of the recipient at this address.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The phone number.
    *
    * This field will only be present if the caller requested that a phone
    * number be returned.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  /**
    * The postal code (also known in some places as ZIP code).
    *
    * Note: some regions do not have postal codes. In those cases
    * this field will be set to an empty string.
    */
  var postalCode: String = js.native
  /**
    * The sorting code.
    *
    * Note: some regions do not have sorting codes. In those cases
    * this field will be set to an empty string.
    */
  var sortingCode: js.UndefOr[String] = js.native
}

object Address {
  @scala.inline
  def apply(administrativeArea: String, countryCode: String, locality: String, postalCode: String): Address = {
    val __obj = js.Dynamic.literal(administrativeArea = administrativeArea.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdministrativeArea(value: String): Self = this.set("administrativeArea", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddress1(value: String): Self = this.set("address1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress1: Self = this.set("address1", js.undefined)
    @scala.inline
    def setAddress2(value: String): Self = this.set("address2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress2: Self = this.set("address2", js.undefined)
    @scala.inline
    def setAddress3(value: String): Self = this.set("address3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress3: Self = this.set("address3", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    @scala.inline
    def setSortingCode(value: String): Self = this.set("sortingCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortingCode: Self = this.set("sortingCode", js.undefined)
  }
  
}

