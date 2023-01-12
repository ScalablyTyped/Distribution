package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersCustomBatchRequestEntryRefundItemShipping extends StObject {
  
  /** The amount that is refunded. If this is not the first refund for the shipment, this should be the newly refunded amount. */
  var amount: js.UndefOr[Price] = js.undefined
  
  /**
    * If set to true, all shipping costs for the order will be refunded. If this is true, amount shouldn't be provided and will be ignored. If set to false, submit the amount of the
    * partial shipping refund, excluding the shipping tax. The shipping tax is calculated and handled on Google's side.
    */
  var fullRefund: js.UndefOr[Boolean] = js.undefined
}
object OrdersCustomBatchRequestEntryRefundItemShipping {
  
  inline def apply(): OrdersCustomBatchRequestEntryRefundItemShipping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryRefundItemShipping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrdersCustomBatchRequestEntryRefundItemShipping] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Price): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setFullRefund(value: Boolean): Self = StObject.set(x, "fullRefund", value.asInstanceOf[js.Any])
    
    inline def setFullRefundUndefined: Self = StObject.set(x, "fullRefund", js.undefined)
  }
}
