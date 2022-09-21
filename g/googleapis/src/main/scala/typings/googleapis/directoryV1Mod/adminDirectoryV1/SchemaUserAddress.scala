package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserAddress extends StObject {
  
  /**
    * Country.
    */
  var country: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Country code.
    */
  var countryCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Custom type.
    */
  var customType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Extended Address.
    */
  var extendedAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Formatted address.
    */
  var formatted: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Locality.
    */
  var locality: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Other parts of address.
    */
  var poBox: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Postal code.
    */
  var postalCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If this is user's primary address. Only one entry could be marked as primary.
    */
  var primary: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Region.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User supplied address was structured. Structured addresses are NOT supported at this time. You might be able to write structured addresses but any values will eventually be clobbered.
    */
  var sourceIsStructured: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Street.
    */
  var streetAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Each entry can have a type which indicates standard values of that entry. For example address could be of home work etc. In addition to the standard type an entry can have a custom type and can take any value. Such type should have the CUSTOM value as type and also have a customType value.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserAddress {
  
  inline def apply(): SchemaUserAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserAddress]
  }
  
  extension [Self <: SchemaUserAddress](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeNull: Self = StObject.set(x, "countryCode", null)
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCustomType(value: String): Self = StObject.set(x, "customType", value.asInstanceOf[js.Any])
    
    inline def setCustomTypeNull: Self = StObject.set(x, "customType", null)
    
    inline def setCustomTypeUndefined: Self = StObject.set(x, "customType", js.undefined)
    
    inline def setExtendedAddress(value: String): Self = StObject.set(x, "extendedAddress", value.asInstanceOf[js.Any])
    
    inline def setExtendedAddressNull: Self = StObject.set(x, "extendedAddress", null)
    
    inline def setExtendedAddressUndefined: Self = StObject.set(x, "extendedAddress", js.undefined)
    
    inline def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
    
    inline def setFormattedNull: Self = StObject.set(x, "formatted", null)
    
    inline def setFormattedUndefined: Self = StObject.set(x, "formatted", js.undefined)
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setLocalityNull: Self = StObject.set(x, "locality", null)
    
    inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    inline def setPoBox(value: String): Self = StObject.set(x, "poBox", value.asInstanceOf[js.Any])
    
    inline def setPoBoxNull: Self = StObject.set(x, "poBox", null)
    
    inline def setPoBoxUndefined: Self = StObject.set(x, "poBox", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeNull: Self = StObject.set(x, "postalCode", null)
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryNull: Self = StObject.set(x, "primary", null)
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSourceIsStructured(value: Boolean): Self = StObject.set(x, "sourceIsStructured", value.asInstanceOf[js.Any])
    
    inline def setSourceIsStructuredNull: Self = StObject.set(x, "sourceIsStructured", null)
    
    inline def setSourceIsStructuredUndefined: Self = StObject.set(x, "sourceIsStructured", js.undefined)
    
    inline def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    inline def setStreetAddressNull: Self = StObject.set(x, "streetAddress", null)
    
    inline def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
