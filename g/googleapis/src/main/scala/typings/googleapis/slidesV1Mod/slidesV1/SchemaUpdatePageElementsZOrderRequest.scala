package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates the Z-order of page elements. Z-order is an ordering of the
  * elements on the page from back to front. The page element in the front may
  * cover the elements that are behind it.
  */
trait SchemaUpdatePageElementsZOrderRequest extends StObject {
  
  /**
    * The Z-order operation to apply on the page elements.  When applying the
    * operation on multiple page elements, the relative Z-orders within these
    * page elements before the operation is maintained.
    */
  var operation: js.UndefOr[String] = js.undefined
  
  /**
    * The object IDs of the page elements to update.  All the page elements
    * must be on the same page and must not be grouped.
    */
  var pageElementObjectIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaUpdatePageElementsZOrderRequest {
  
  inline def apply(): SchemaUpdatePageElementsZOrderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdatePageElementsZOrderRequest]
  }
  
  extension [Self <: SchemaUpdatePageElementsZOrderRequest](x: Self) {
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setPageElementObjectIds(value: js.Array[String]): Self = StObject.set(x, "pageElementObjectIds", value.asInstanceOf[js.Any])
    
    inline def setPageElementObjectIdsUndefined: Self = StObject.set(x, "pageElementObjectIds", js.undefined)
    
    inline def setPageElementObjectIdsVarargs(value: String*): Self = StObject.set(x, "pageElementObjectIds", js.Array(value :_*))
  }
}
