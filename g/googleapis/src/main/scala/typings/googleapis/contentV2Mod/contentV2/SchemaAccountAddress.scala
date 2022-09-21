package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountAddress extends StObject {
  
  /**
    * CLDR country code (e.g. "US"). This value cannot be set for a sub-account of an MCA. All MCA sub-accounts inherit the country of their parent MCA.
    */
  var country: js.UndefOr[String | Null] = js.undefined
  
  /**
    * City, town or commune. May also include dependent localities or sublocalities (e.g. neighborhoods or suburbs).
    */
  var locality: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Postal code or ZIP (e.g. "94043").
    */
  var postalCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Top-level administrative subdivision of the country. For example, a state like California ("CA") or a province like Quebec ("QC").
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Street-level part of the address.
    */
  var streetAddress: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountAddress {
  
  inline def apply(): SchemaAccountAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountAddress]
  }
  
  extension [Self <: SchemaAccountAddress](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setLocalityNull: Self = StObject.set(x, "locality", null)
    
    inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeNull: Self = StObject.set(x, "postalCode", null)
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    inline def setStreetAddressNull: Self = StObject.set(x, "streetAddress", null)
    
    inline def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
  }
}
