package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderreturnsReturnItem extends StObject {
  
  /** Refunds the item. */
  var refund: js.UndefOr[OrderreturnsRefundOperation] = js.native
  
  /** Rejects the item. */
  var reject: js.UndefOr[OrderreturnsRejectOperation] = js.native
  
  /** Unit level ID for the return item. Different units of the same product will have different IDs. */
  var returnItemId: js.UndefOr[String] = js.native
}
object OrderreturnsReturnItem {
  
  @scala.inline
  def apply(): OrderreturnsReturnItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreturnsReturnItem]
  }
  
  @scala.inline
  implicit class OrderreturnsReturnItemMutableBuilder[Self <: OrderreturnsReturnItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefund(value: OrderreturnsRefundOperation): Self = StObject.set(x, "refund", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefundUndefined: Self = StObject.set(x, "refund", js.undefined)
    
    @scala.inline
    def setReject(value: OrderreturnsRejectOperation): Self = StObject.set(x, "reject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectUndefined: Self = StObject.set(x, "reject", js.undefined)
    
    @scala.inline
    def setReturnItemId(value: String): Self = StObject.set(x, "returnItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnItemIdUndefined: Self = StObject.set(x, "returnItemId", js.undefined)
  }
}
