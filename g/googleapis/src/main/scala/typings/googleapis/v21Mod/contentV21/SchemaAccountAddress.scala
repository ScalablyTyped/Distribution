package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountAddress extends StObject {
  
  /**
    * CLDR country code (e.g. &quot;US&quot;).
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * City, town or commune. May also include dependent localities or
    * sublocalities (e.g. neighborhoods or suburbs).
    */
  var locality: js.UndefOr[String] = js.undefined
  
  /**
    * Postal code or ZIP (e.g. &quot;94043&quot;).
    */
  var postalCode: js.UndefOr[String] = js.undefined
  
  /**
    * Top-level administrative subdivision of the country. For example, a state
    * like California (&quot;CA&quot;) or a province like Quebec
    * (&quot;QC&quot;).
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Street-level part of the address.
    */
  var streetAddress: js.UndefOr[String] = js.undefined
}
object SchemaAccountAddress {
  
  inline def apply(): SchemaAccountAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountAddress]
  }
  
  extension [Self <: SchemaAccountAddress](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    inline def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
  }
}
