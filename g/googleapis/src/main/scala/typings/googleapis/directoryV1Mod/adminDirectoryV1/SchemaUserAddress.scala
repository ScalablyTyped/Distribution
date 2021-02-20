package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for address.
  */
@js.native
trait SchemaUserAddress extends StObject {
  
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
  implicit class SchemaUserAddressMutableBuilder[Self <: SchemaUserAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setCustomType(value: String): Self = StObject.set(x, "customType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTypeUndefined: Self = StObject.set(x, "customType", js.undefined)
    
    @scala.inline
    def setExtendedAddress(value: String): Self = StObject.set(x, "extendedAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedAddressUndefined: Self = StObject.set(x, "extendedAddress", js.undefined)
    
    @scala.inline
    def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedUndefined: Self = StObject.set(x, "formatted", js.undefined)
    
    @scala.inline
    def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    @scala.inline
    def setPoBox(value: String): Self = StObject.set(x, "poBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoBoxUndefined: Self = StObject.set(x, "poBox", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setSourceIsStructured(value: Boolean): Self = StObject.set(x, "sourceIsStructured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIsStructuredUndefined: Self = StObject.set(x, "sourceIsStructured", js.undefined)
    
    @scala.inline
    def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
