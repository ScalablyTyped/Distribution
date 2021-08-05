package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption extends StObject {
  
  /** Optional description of the return reason. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * [required] Reason for the return. Acceptable values are: - "`customerDiscretionaryReturn`" - "`customerInitiatedMerchantCancel`" - "`deliveredTooLate`" - "`expiredItem`" -
    * "`invalidCoupon`" - "`malformedShippingAddress`" - "`other`" - "`productArrivedDamaged`" - "`productNotAsDescribed`" - "`qualityNotAsExpected`" - "`undeliverableShippingAddress`" -
    * "`unsupportedPoBoxAddress`" - "`wrongProductShipped`"
    */
  var reason: js.UndefOr[String] = js.undefined
}
object OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption {
  
  inline def apply(): OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption]
  }
  
  extension [Self <: OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
