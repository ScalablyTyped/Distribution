package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for postal address of a customer.
  */
@js.native
trait SchemaCustomerPostalAddress extends js.Object {
  /**
    * A customer&#39;s physical address. The address can be composed of one to
    * three lines.
    */
  var addressLine1: js.UndefOr[String] = js.native
  /**
    * Address line 2 of the address.
    */
  var addressLine2: js.UndefOr[String] = js.native
  /**
    * Address line 3 of the address.
    */
  var addressLine3: js.UndefOr[String] = js.native
  /**
    * The customer contact&#39;s name.
    */
  var contactName: js.UndefOr[String] = js.native
  /**
    * This is a required property. For countryCode information see the ISO 3166
    * country code elements.
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * Name of the locality. An example of a locality value is the city of San
    * Francisco.
    */
  var locality: js.UndefOr[String] = js.native
  /**
    * The company or company division name.
    */
  var organizationName: js.UndefOr[String] = js.native
  /**
    * The postal code. A postalCode example is a postal zip code such as 10009.
    * This is in accordance with -
    * http://portablecontacts.net/draft-spec.html#address_element.
    */
  var postalCode: js.UndefOr[String] = js.native
  /**
    * Name of the region. An example of a region value is NY for the state of
    * New York.
    */
  var region: js.UndefOr[String] = js.native
}

object SchemaCustomerPostalAddress {
  @scala.inline
  def apply(): SchemaCustomerPostalAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerPostalAddress]
  }
  @scala.inline
  implicit class SchemaCustomerPostalAddressOps[Self <: SchemaCustomerPostalAddress] (val x: Self) extends AnyVal {
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
    def setAddressLine1(value: String): Self = this.set("addressLine1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressLine1: Self = this.set("addressLine1", js.undefined)
    @scala.inline
    def setAddressLine2(value: String): Self = this.set("addressLine2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressLine2: Self = this.set("addressLine2", js.undefined)
    @scala.inline
    def setAddressLine3(value: String): Self = this.set("addressLine3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressLine3: Self = this.set("addressLine3", js.undefined)
    @scala.inline
    def setContactName(value: String): Self = this.set("contactName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactName: Self = this.set("contactName", js.undefined)
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocality: Self = this.set("locality", js.undefined)
    @scala.inline
    def setOrganizationName(value: String): Self = this.set("organizationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationName: Self = this.set("organizationName", js.undefined)
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
  
}

