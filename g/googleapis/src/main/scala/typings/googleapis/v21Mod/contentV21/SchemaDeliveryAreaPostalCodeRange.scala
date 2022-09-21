package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeliveryAreaPostalCodeRange extends StObject {
  
  /**
    * Required. A postal code or a pattern of the form prefix* denoting the inclusive lower bound of the range defining the area. Examples values: `"94108"`, `"9410*"`, `"9*"`.
    */
  var firstPostalCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A postal code or a pattern of the form prefix* denoting the inclusive upper bound of the range defining the area (for example [070* - 078*] results in the range [07000 - 07899]). It must have the same length as `firstPostalCode`: if `firstPostalCode` is a postal code then `lastPostalCode` must be a postal code too; if firstPostalCode is a pattern then `lastPostalCode` must be a pattern with the same prefix length. Ignored if not set, then the area is defined as being all the postal codes matching `firstPostalCode`.
    */
  var lastPostalCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeliveryAreaPostalCodeRange {
  
  inline def apply(): SchemaDeliveryAreaPostalCodeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliveryAreaPostalCodeRange]
  }
  
  extension [Self <: SchemaDeliveryAreaPostalCodeRange](x: Self) {
    
    inline def setFirstPostalCode(value: String): Self = StObject.set(x, "firstPostalCode", value.asInstanceOf[js.Any])
    
    inline def setFirstPostalCodeNull: Self = StObject.set(x, "firstPostalCode", null)
    
    inline def setFirstPostalCodeUndefined: Self = StObject.set(x, "firstPostalCode", js.undefined)
    
    inline def setLastPostalCode(value: String): Self = StObject.set(x, "lastPostalCode", value.asInstanceOf[js.Any])
    
    inline def setLastPostalCodeNull: Self = StObject.set(x, "lastPostalCode", null)
    
    inline def setLastPostalCodeUndefined: Self = StObject.set(x, "lastPostalCode", js.undefined)
  }
}
