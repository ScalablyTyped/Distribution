package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPostalCodesListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#postalCodesListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Postal code collection.
    */
  var postalCodes: js.UndefOr[js.Array[SchemaPostalCode]] = js.undefined
}
object SchemaPostalCodesListResponse {
  
  inline def apply(): SchemaPostalCodesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostalCodesListResponse]
  }
  
  extension [Self <: SchemaPostalCodesListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPostalCodes(value: js.Array[SchemaPostalCode]): Self = StObject.set(x, "postalCodes", value.asInstanceOf[js.Any])
    
    inline def setPostalCodesUndefined: Self = StObject.set(x, "postalCodes", js.undefined)
    
    inline def setPostalCodesVarargs(value: SchemaPostalCode*): Self = StObject.set(x, "postalCodes", js.Array(value*))
  }
}
