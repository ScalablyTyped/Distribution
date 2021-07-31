package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersCustomBatchRequestEntryCreateTestReturnReturnItem extends StObject {
  
  /** The ID of the line item to return. */
  var lineItemId: js.UndefOr[String] = js.undefined
  
  /** Quantity that is returned. */
  var quantity: js.UndefOr[Double] = js.undefined
}
object OrdersCustomBatchRequestEntryCreateTestReturnReturnItem {
  
  @scala.inline
  def apply(): OrdersCustomBatchRequestEntryCreateTestReturnReturnItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryCreateTestReturnReturnItem]
  }
  
  @scala.inline
  implicit class OrdersCustomBatchRequestEntryCreateTestReturnReturnItemMutableBuilder[Self <: OrdersCustomBatchRequestEntryCreateTestReturnReturnItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
