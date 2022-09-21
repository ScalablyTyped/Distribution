package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeliveryArea extends StObject {
  
  /**
    * Required. The country that the product can be delivered to. Submit a [unicode CLDR region](http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml) such as `US` or `CH`.
    */
  var countryCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A postal code, postal code range or postal code prefix that defines this area. Limited to US and AUS.
    */
  var postalCodeRange: js.UndefOr[SchemaDeliveryAreaPostalCodeRange] = js.undefined
  
  /**
    * A state, territory, or prefecture. This is supported for the United States, Australia, and Japan. Provide a subdivision code from the ISO 3166-2 code tables ([US](https://en.wikipedia.org/wiki/ISO_3166-2:US), [AU](https://en.wikipedia.org/wiki/ISO_3166-2:AU), or [JP](https://en.wikipedia.org/wiki/ISO_3166-2:JP)) without country prefix (for example, `"NY"`, `"NSW"`, `"03"`).
    */
  var regionCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeliveryArea {
  
  inline def apply(): SchemaDeliveryArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliveryArea]
  }
  
  extension [Self <: SchemaDeliveryArea](x: Self) {
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeNull: Self = StObject.set(x, "countryCode", null)
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setPostalCodeRange(value: SchemaDeliveryAreaPostalCodeRange): Self = StObject.set(x, "postalCodeRange", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeRangeUndefined: Self = StObject.set(x, "postalCodeRange", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeNull: Self = StObject.set(x, "regionCode", null)
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
