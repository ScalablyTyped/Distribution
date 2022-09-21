package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderreturnsReturnItem extends StObject {
  
  /**
    * Refunds the item.
    */
  var refund: js.UndefOr[SchemaOrderreturnsRefundOperation] = js.undefined
  
  /**
    * Rejects the item.
    */
  var reject: js.UndefOr[SchemaOrderreturnsRejectOperation] = js.undefined
  
  /**
    * Unit level ID for the return item. Different units of the same product will have different IDs.
    */
  var returnItemId: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderreturnsReturnItem {
  
  inline def apply(): SchemaOrderreturnsReturnItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderreturnsReturnItem]
  }
  
  extension [Self <: SchemaOrderreturnsReturnItem](x: Self) {
    
    inline def setRefund(value: SchemaOrderreturnsRefundOperation): Self = StObject.set(x, "refund", value.asInstanceOf[js.Any])
    
    inline def setRefundUndefined: Self = StObject.set(x, "refund", js.undefined)
    
    inline def setReject(value: SchemaOrderreturnsRejectOperation): Self = StObject.set(x, "reject", value.asInstanceOf[js.Any])
    
    inline def setRejectUndefined: Self = StObject.set(x, "reject", js.undefined)
    
    inline def setReturnItemId(value: String): Self = StObject.set(x, "returnItemId", value.asInstanceOf[js.Any])
    
    inline def setReturnItemIdNull: Self = StObject.set(x, "returnItemId", null)
    
    inline def setReturnItemIdUndefined: Self = StObject.set(x, "returnItemId", js.undefined)
  }
}
