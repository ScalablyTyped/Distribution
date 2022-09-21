package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPostalCodeRange extends StObject {
  
  /**
    * A postal code or a pattern of the form `prefix*` denoting the inclusive lower bound of the range defining the area. Examples values: `"94108"`, `"9410*"`, `"9*"`. Required.
    */
  var postalCodeRangeBegin: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A postal code or a pattern of the form `prefix*` denoting the inclusive upper bound of the range defining the area. It must have the same length as `postalCodeRangeBegin`: if `postalCodeRangeBegin` is a postal code then `postalCodeRangeEnd` must be a postal code too; if `postalCodeRangeBegin` is a pattern then `postalCodeRangeEnd` must be a pattern with the same prefix length. Optional: if not set, then the area is defined as being all the postal codes matching `postalCodeRangeBegin`.
    */
  var postalCodeRangeEnd: js.UndefOr[String | Null] = js.undefined
}
object SchemaPostalCodeRange {
  
  inline def apply(): SchemaPostalCodeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostalCodeRange]
  }
  
  extension [Self <: SchemaPostalCodeRange](x: Self) {
    
    inline def setPostalCodeRangeBegin(value: String): Self = StObject.set(x, "postalCodeRangeBegin", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeRangeBeginNull: Self = StObject.set(x, "postalCodeRangeBegin", null)
    
    inline def setPostalCodeRangeBeginUndefined: Self = StObject.set(x, "postalCodeRangeBegin", js.undefined)
    
    inline def setPostalCodeRangeEnd(value: String): Self = StObject.set(x, "postalCodeRangeEnd", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeRangeEndNull: Self = StObject.set(x, "postalCodeRangeEnd", null)
    
    inline def setPostalCodeRangeEndUndefined: Self = StObject.set(x, "postalCodeRangeEnd", js.undefined)
  }
}
