package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption extends StObject {
  
  /** Optional description of the return reason. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [required] Reason for the return. Acceptable values are: - "`customerDiscretionaryReturn`" - "`customerInitiatedMerchantCancel`" - "`deliveredTooLate`" - "`expiredItem`" -
    * "`invalidCoupon`" - "`malformedShippingAddress`" - "`other`" - "`productArrivedDamaged`" - "`productNotAsDescribed`" - "`qualityNotAsExpected`" - "`undeliverableShippingAddress`" -
    * "`unsupportedPoBoxAddress`" - "`wrongProductShipped`"
    */
  var reason: js.UndefOr[String] = js.native
}
object OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption {
  
  @scala.inline
  def apply(): OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption]
  }
  
  @scala.inline
  implicit class OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOptionMutableBuilder[Self <: OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
