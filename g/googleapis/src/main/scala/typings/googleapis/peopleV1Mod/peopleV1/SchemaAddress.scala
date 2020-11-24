package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s physical address. May be a P.O. box or street address. All
  * fields are optional.
  */
@js.native
trait SchemaAddress extends js.Object {
  
  /**
    * The city of the address.
    */
  var city: js.UndefOr[String] = js.native
  
  /**
    * The country of the address.
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * The [ISO 3166-1 alpha-2](http://www.iso.org/iso/country_codes.htm)
    * country code of the address.
    */
  var countryCode: js.UndefOr[String] = js.native
  
  /**
    * The extended address of the address; for example, the apartment number.
    */
  var extendedAddress: js.UndefOr[String] = js.native
  
  /**
    * The read-only type of the address translated and formatted in the
    * viewer&#39;s account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.native
  
  /**
    * The unstructured value of the address. If this is not set by the user it
    * will be automatically constructed from structured values.
    */
  var formattedValue: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the address.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  
  /**
    * The P.O. box of the address.
    */
  var poBox: js.UndefOr[String] = js.native
  
  /**
    * The postal code of the address.
    */
  var postalCode: js.UndefOr[String] = js.native
  
  /**
    * The region of the address; for example, the state or province.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * The street address.
    */
  var streetAddress: js.UndefOr[String] = js.native
  
  /**
    * The type of the address. The type can be custom or one of these
    * predefined values:  * `home` * `work` * `other`
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaAddress {
  
  @scala.inline
  def apply(): SchemaAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddress]
  }
  
  @scala.inline
  implicit class SchemaAddressOps[Self <: SchemaAddress] (val x: Self) extends AnyVal {
    
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
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    
    @scala.inline
    def setExtendedAddress(value: String): Self = this.set("extendedAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendedAddress: Self = this.set("extendedAddress", js.undefined)
    
    @scala.inline
    def setFormattedType(value: String): Self = this.set("formattedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormattedType: Self = this.set("formattedType", js.undefined)
    
    @scala.inline
    def setFormattedValue(value: String): Self = this.set("formattedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormattedValue: Self = this.set("formattedValue", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setPoBox(value: String): Self = this.set("poBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoBox: Self = this.set("poBox", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
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
