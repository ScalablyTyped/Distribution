package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionPostalCodeArea extends StObject {
  
  /**
    * Required. A range of postal codes.
    */
  var postalCodes: js.UndefOr[js.Array[SchemaRegionPostalCodeAreaPostalCodeRange]] = js.undefined
  
  /**
    * Required. CLDR territory code or the country the postal code group applies to.
    */
  var regionCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaRegionPostalCodeArea {
  
  inline def apply(): SchemaRegionPostalCodeArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionPostalCodeArea]
  }
  
  extension [Self <: SchemaRegionPostalCodeArea](x: Self) {
    
    inline def setPostalCodes(value: js.Array[SchemaRegionPostalCodeAreaPostalCodeRange]): Self = StObject.set(x, "postalCodes", value.asInstanceOf[js.Any])
    
    inline def setPostalCodesUndefined: Self = StObject.set(x, "postalCodes", js.undefined)
    
    inline def setPostalCodesVarargs(value: SchemaRegionPostalCodeAreaPostalCodeRange*): Self = StObject.set(x, "postalCodes", js.Array(value*))
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeNull: Self = StObject.set(x, "regionCode", null)
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
