package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrdersCustomBatchRequestEntryRefund extends StObject {
  
  /**
    * Deprecated. Please use amountPretax and amountTax instead.
    */
  var amount: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * The amount that is refunded. Either amount or amountPretax should be
    * filled.
    */
  var amountPretax: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * Tax amount that corresponds to refund amount in amountPretax. Optional,
    * but if filled, amountPretax must be set. Calculated automatically if not
    * provided.
    */
  var amountTax: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * The reason for the refund.
    */
  var reason: js.UndefOr[String] = js.native
  
  /**
    * The explanation of the reason.
    */
  var reasonText: js.UndefOr[String] = js.native
}
object SchemaOrdersCustomBatchRequestEntryRefund {
  
  @scala.inline
  def apply(): SchemaOrdersCustomBatchRequestEntryRefund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntryRefund]
  }
  
  @scala.inline
  implicit class SchemaOrdersCustomBatchRequestEntryRefundMutableBuilder[Self <: SchemaOrdersCustomBatchRequestEntryRefund] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: SchemaPrice): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountPretax(value: SchemaPrice): Self = StObject.set(x, "amountPretax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountPretaxUndefined: Self = StObject.set(x, "amountPretax", js.undefined)
    
    @scala.inline
    def setAmountTax(value: SchemaPrice): Self = StObject.set(x, "amountTax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountTaxUndefined: Self = StObject.set(x, "amountTax", js.undefined)
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonText(value: String): Self = StObject.set(x, "reasonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonTextUndefined: Self = StObject.set(x, "reasonText", js.undefined)
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
