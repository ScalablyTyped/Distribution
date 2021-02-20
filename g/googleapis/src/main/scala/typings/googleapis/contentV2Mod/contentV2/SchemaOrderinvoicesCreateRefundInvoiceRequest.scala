package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderinvoicesCreateRefundInvoiceRequest extends StObject {
  
  /**
    * [required] The ID of the invoice.
    */
  var invoiceId: js.UndefOr[String] = js.native
  
  /**
    * [required] The ID of the operation, unique across all operations for a
    * given order.
    */
  var operationId: js.UndefOr[String] = js.native
  
  /**
    * Option to create a refund-only invoice. Exactly one of refundOnlyOption
    * or returnOption must be provided.
    */
  var refundOnlyOption: js.UndefOr[SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption] = js.native
  
  /**
    * Option to create an invoice for a refund and mark all items within the
    * invoice as returned. Exactly one of refundOnlyOption or returnOption must
    * be provided.
    */
  var returnOption: js.UndefOr[SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption] = js.native
  
  /**
    * Invoice details for different shipment groups.
    */
  var shipmentInvoices: js.UndefOr[js.Array[SchemaShipmentInvoice]] = js.native
}
object SchemaOrderinvoicesCreateRefundInvoiceRequest {
  
  @scala.inline
  def apply(): SchemaOrderinvoicesCreateRefundInvoiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderinvoicesCreateRefundInvoiceRequest]
  }
  
  @scala.inline
  implicit class SchemaOrderinvoicesCreateRefundInvoiceRequestMutableBuilder[Self <: SchemaOrderinvoicesCreateRefundInvoiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvoiceId(value: String): Self = StObject.set(x, "invoiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoiceIdUndefined: Self = StObject.set(x, "invoiceId", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setRefundOnlyOption(value: SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption): Self = StObject.set(x, "refundOnlyOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefundOnlyOptionUndefined: Self = StObject.set(x, "refundOnlyOption", js.undefined)
    
    @scala.inline
    def setReturnOption(value: SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption): Self = StObject.set(x, "returnOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnOptionUndefined: Self = StObject.set(x, "returnOption", js.undefined)
    
    @scala.inline
    def setShipmentInvoices(value: js.Array[SchemaShipmentInvoice]): Self = StObject.set(x, "shipmentInvoices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentInvoicesUndefined: Self = StObject.set(x, "shipmentInvoices", js.undefined)
    
    @scala.inline
    def setShipmentInvoicesVarargs(value: SchemaShipmentInvoice*): Self = StObject.set(x, "shipmentInvoices", js.Array(value :_*))
  }
}
