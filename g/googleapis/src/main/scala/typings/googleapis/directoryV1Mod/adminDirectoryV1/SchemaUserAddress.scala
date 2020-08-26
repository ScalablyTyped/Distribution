package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for address.
  */
@js.native
trait SchemaUserAddress extends js.Object {
  /**
    * Country.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * Country code.
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * Custom type.
    */
  var customType: js.UndefOr[String] = js.native
  /**
    * Extended Address.
    */
  var extendedAddress: js.UndefOr[String] = js.native
  /**
    * Formatted address.
    */
  var formatted: js.UndefOr[String] = js.native
  /**
    * Locality.
    */
  var locality: js.UndefOr[String] = js.native
  /**
    * Other parts of address.
    */
  var poBox: js.UndefOr[String] = js.native
  /**
    * Postal code.
    */
  var postalCode: js.UndefOr[String] = js.native
  /**
    * If this is user&#39;s primary address. Only one entry could be marked as
    * primary.
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * Region.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * User supplied address was structured. Structured addresses are NOT
    * supported at this time. You might be able to write structured addresses,
    * but any values will eventually be clobbered.
    */
  var sourceIsStructured: js.UndefOr[Boolean] = js.native
  /**
    * Street.
    */
  var streetAddress: js.UndefOr[String] = js.native
  /**
    * Each entry can have a type which indicates standard values of that entry.
    * For example address could be of home, work etc. In addition to the
    * standard type, an entry can have a custom type and can take any value.
    * Such type should have the CUSTOM value as type and also have a customType
    * value.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaUserAddress {
  @scala.inline
  def apply(): SchemaUserAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserAddress]
  }
  @scala.inline
  implicit class SchemaUserAddressOps[Self <: SchemaUserAddress] (val x: Self) extends AnyVal {
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    @scala.inline
    def setCustomType(value: String): Self = this.set("customType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomType: Self = this.set("customType", js.undefined)
    @scala.inline
    def setExtendedAddress(value: String): Self = this.set("extendedAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedAddress: Self = this.set("extendedAddress", js.undefined)
    @scala.inline
    def setFormatted(value: String): Self = this.set("formatted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatted: Self = this.set("formatted", js.undefined)
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocality: Self = this.set("locality", js.undefined)
    @scala.inline
    def setPoBox(value: String): Self = this.set("poBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoBox: Self = this.set("poBox", js.undefined)
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setSourceIsStructured(value: Boolean): Self = this.set("sourceIsStructured", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceIsStructured: Self = this.set("sourceIsStructured", js.undefined)
    @scala.inline
    def setStreetAddress(value: String): Self = this.set("streetAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreetAddress: Self = this.set("streetAddress", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

