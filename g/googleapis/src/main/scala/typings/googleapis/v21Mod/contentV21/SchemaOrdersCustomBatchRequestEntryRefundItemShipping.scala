package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersCustomBatchRequestEntryRefundItemShipping extends StObject {
  
  /**
    * The amount that is refunded. If this is not the first refund for the shipment, this should be the newly refunded amount.
    */
  var amount: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * If set to true, all shipping costs for the order will be refunded. If this is true, amount shouldn't be provided and will be ignored. If set to false, submit the amount of the partial shipping refund, excluding the shipping tax. The shipping tax is calculated and handled on Google's side.
    */
  var fullRefund: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaOrdersCustomBatchRequestEntryRefundItemShipping {
  
  inline def apply(): SchemaOrdersCustomBatchRequestEntryRefundItemShipping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntryRefundItemShipping]
  }
  
  extension [Self <: SchemaOrdersCustomBatchRequestEntryRefundItemShipping](x: Self) {
    
    inline def setAmount(value: SchemaPrice): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setFullRefund(value: Boolean): Self = StObject.set(x, "fullRefund", value.asInstanceOf[js.Any])
    
    inline def setFullRefundNull: Self = StObject.set(x, "fullRefund", null)
    
    inline def setFullRefundUndefined: Self = StObject.set(x, "fullRefund", js.undefined)
  }
}
