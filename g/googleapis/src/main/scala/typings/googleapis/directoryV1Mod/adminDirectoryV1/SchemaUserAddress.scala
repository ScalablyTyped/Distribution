package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for address.
  */
trait SchemaUserAddress extends StObject {
  
  /**
    * Country.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * Country code.
    */
  var countryCode: js.UndefOr[String] = js.undefined
  
  /**
    * Custom type.
    */
  var customType: js.UndefOr[String] = js.undefined
  
  /**
    * Extended Address.
    */
  var extendedAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Formatted address.
    */
  var formatted: js.UndefOr[String] = js.undefined
  
  /**
    * Locality.
    */
  var locality: js.UndefOr[String] = js.undefined
  
  /**
    * Other parts of address.
    */
  var poBox: js.UndefOr[String] = js.undefined
  
  /**
    * Postal code.
    */
  var postalCode: js.UndefOr[String] = js.undefined
  
  /**
    * If this is user&#39;s primary address. Only one entry could be marked as
    * primary.
    */
  var primary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Region.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * User supplied address was structured. Structured addresses are NOT
    * supported at this time. You might be able to write structured addresses,
    * but any values will eventually be clobbered.
    */
  var sourceIsStructured: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Street.
    */
  var streetAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Each entry can have a type which indicates standard values of that entry.
    * For example address could be of home, work etc. In addition to the
    * standard type, an entry can have a custom type and can take any value.
    * Such type should have the CUSTOM value as type and also have a customType
    * value.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaUserAddress {
  
  inline def apply(): SchemaUserAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserAddress]
  }
  
  extension [Self <: SchemaUserAddress](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCustomType(value: String): Self = StObject.set(x, "customType", value.asInstanceOf[js.Any])
    
    inline def setCustomTypeUndefined: Self = StObject.set(x, "customType", js.undefined)
    
    inline def setExtendedAddress(value: String): Self = StObject.set(x, "extendedAddress", value.asInstanceOf[js.Any])
    
    inline def setExtendedAddressUndefined: Self = StObject.set(x, "extendedAddress", js.undefined)
    
    inline def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
    
    inline def setFormattedUndefined: Self = StObject.set(x, "formatted", js.undefined)
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    inline def setPoBox(value: String): Self = StObject.set(x, "poBox", value.asInstanceOf[js.Any])
    
    inline def setPoBoxUndefined: Self = StObject.set(x, "poBox", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSourceIsStructured(value: Boolean): Self = StObject.set(x, "sourceIsStructured", value.asInstanceOf[js.Any])
    
    inline def setSourceIsStructuredUndefined: Self = StObject.set(x, "sourceIsStructured", js.undefined)
    
    inline def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    inline def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
