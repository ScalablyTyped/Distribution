package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionPostalCodeArea extends StObject {
  
  /** Required. A range of postal codes. */
  var postalCodes: js.UndefOr[js.Array[RegionPostalCodeAreaPostalCodeRange]] = js.undefined
  
  /** Required. CLDR territory code or the country the postal code group applies to. */
  var regionCode: js.UndefOr[String] = js.undefined
}
object RegionPostalCodeArea {
  
  inline def apply(): RegionPostalCodeArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionPostalCodeArea]
  }
  
  extension [Self <: RegionPostalCodeArea](x: Self) {
    
    inline def setPostalCodes(value: js.Array[RegionPostalCodeAreaPostalCodeRange]): Self = StObject.set(x, "postalCodes", value.asInstanceOf[js.Any])
    
    inline def setPostalCodesUndefined: Self = StObject.set(x, "postalCodes", js.undefined)
    
    inline def setPostalCodesVarargs(value: RegionPostalCodeAreaPostalCodeRange*): Self = StObject.set(x, "postalCodes", js.Array(value*))
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
