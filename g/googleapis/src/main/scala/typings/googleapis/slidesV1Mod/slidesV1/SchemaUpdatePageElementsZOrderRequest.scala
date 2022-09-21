package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdatePageElementsZOrderRequest extends StObject {
  
  /**
    * The Z-order operation to apply on the page elements. When applying the operation on multiple page elements, the relative Z-orders within these page elements before the operation is maintained.
    */
  var operation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The object IDs of the page elements to update. All the page elements must be on the same page and must not be grouped.
    */
  var pageElementObjectIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaUpdatePageElementsZOrderRequest {
  
  inline def apply(): SchemaUpdatePageElementsZOrderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdatePageElementsZOrderRequest]
  }
  
  extension [Self <: SchemaUpdatePageElementsZOrderRequest](x: Self) {
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationNull: Self = StObject.set(x, "operation", null)
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setPageElementObjectIds(value: js.Array[String]): Self = StObject.set(x, "pageElementObjectIds", value.asInstanceOf[js.Any])
    
    inline def setPageElementObjectIdsNull: Self = StObject.set(x, "pageElementObjectIds", null)
    
    inline def setPageElementObjectIdsUndefined: Self = StObject.set(x, "pageElementObjectIds", js.undefined)
    
    inline def setPageElementObjectIdsVarargs(value: String*): Self = StObject.set(x, "pageElementObjectIds", js.Array(value*))
  }
}
