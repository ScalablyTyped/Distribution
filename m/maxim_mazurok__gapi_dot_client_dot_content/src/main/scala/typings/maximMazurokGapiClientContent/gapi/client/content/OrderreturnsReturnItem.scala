package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderreturnsReturnItem extends StObject {
  
  /** Refunds the item. */
  var refund: js.UndefOr[OrderreturnsRefundOperation] = js.undefined
  
  /** Rejects the item. */
  var reject: js.UndefOr[OrderreturnsRejectOperation] = js.undefined
  
  /** Unit level ID for the return item. Different units of the same product will have different IDs. */
  var returnItemId: js.UndefOr[String] = js.undefined
}
object OrderreturnsReturnItem {
  
  inline def apply(): OrderreturnsReturnItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreturnsReturnItem]
  }
  
  extension [Self <: OrderreturnsReturnItem](x: Self) {
    
    inline def setRefund(value: OrderreturnsRefundOperation): Self = StObject.set(x, "refund", value.asInstanceOf[js.Any])
    
    inline def setRefundUndefined: Self = StObject.set(x, "refund", js.undefined)
    
    inline def setReject(value: OrderreturnsRejectOperation): Self = StObject.set(x, "reject", value.asInstanceOf[js.Any])
    
    inline def setRejectUndefined: Self = StObject.set(x, "reject", js.undefined)
    
    inline def setReturnItemId(value: String): Self = StObject.set(x, "returnItemId", value.asInstanceOf[js.Any])
    
    inline def setReturnItemIdUndefined: Self = StObject.set(x, "returnItemId", js.undefined)
  }
}
