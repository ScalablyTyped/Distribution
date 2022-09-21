package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionPostalCodeAreaPostalCodeRange extends StObject {
  
  /**
    * Required. A postal code or a pattern of the form prefix* denoting the inclusive lower bound of the range defining the area. Examples values: "94108", "9410*", "9*".
    */
  var begin: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A postal code or a pattern of the form prefix* denoting the inclusive upper bound of the range defining the area. It must have the same length as postalCodeRangeBegin: if postalCodeRangeBegin is a postal code then postalCodeRangeEnd must be a postal code too; if postalCodeRangeBegin is a pattern then postalCodeRangeEnd must be a pattern with the same prefix length. Optional: if not set, then the area is defined as being all the postal codes matching postalCodeRangeBegin.
    */
  var end: js.UndefOr[String | Null] = js.undefined
}
object SchemaRegionPostalCodeAreaPostalCodeRange {
  
  inline def apply(): SchemaRegionPostalCodeAreaPostalCodeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionPostalCodeAreaPostalCodeRange]
  }
  
  extension [Self <: SchemaRegionPostalCodeAreaPostalCodeRange](x: Self) {
    
    inline def setBegin(value: String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    inline def setBeginNull: Self = StObject.set(x, "begin", null)
    
    inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndNull: Self = StObject.set(x, "end", null)
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
  }
}
