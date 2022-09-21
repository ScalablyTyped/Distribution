package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddress extends StObject {
  
  /**
    * Required. Top-level administrative subdivision of the country. For example, a state like California ("CA") or a province like Quebec ("QC").
    */
  var administrativeArea: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. City, town or commune. May also include dependent localities or sublocalities (for example, neighborhoods or suburbs).
    */
  var city: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. [CLDR country code](https://github.com/unicode-org/cldr/blob/latest/common/main/en.xml) (for example, "US").
    */
  var country: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Postal code or ZIP (for example, "94043").
    */
  var postalCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Street-level part of the address. Use `\n` to add a second line.
    */
  var streetAddress: js.UndefOr[String | Null] = js.undefined
}
object SchemaAddress {
  
  inline def apply(): SchemaAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddress]
  }
  
  extension [Self <: SchemaAddress](x: Self) {
    
    inline def setAdministrativeArea(value: String): Self = StObject.set(x, "administrativeArea", value.asInstanceOf[js.Any])
    
    inline def setAdministrativeAreaNull: Self = StObject.set(x, "administrativeArea", null)
    
    inline def setAdministrativeAreaUndefined: Self = StObject.set(x, "administrativeArea", js.undefined)
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityNull: Self = StObject.set(x, "city", null)
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeNull: Self = StObject.set(x, "postalCode", null)
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    inline def setStreetAddressNull: Self = StObject.set(x, "streetAddress", null)
    
    inline def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
  }
}
