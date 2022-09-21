package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderinvoicesCreateRefundInvoiceRequest extends StObject {
  
  /** [required] The ID of the invoice. */
  var invoiceId: js.UndefOr[String] = js.undefined
  
  /** [required] The ID of the operation, unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.undefined
  
  /** Option to create a refund-only invoice. Exactly one of `refundOnlyOption` or `returnOption` must be provided. */
  var refundOnlyOption: js.UndefOr[OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption] = js.undefined
  
  /** Option to create an invoice for a refund and mark all items within the invoice as returned. Exactly one of `refundOnlyOption` or `returnOption` must be provided. */
  var returnOption: js.UndefOr[OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption] = js.undefined
  
  /** Invoice details for different shipment groups. */
  var shipmentInvoices: js.UndefOr[js.Array[ShipmentInvoice]] = js.undefined
}
object OrderinvoicesCreateRefundInvoiceRequest {
  
  inline def apply(): OrderinvoicesCreateRefundInvoiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderinvoicesCreateRefundInvoiceRequest]
  }
  
  extension [Self <: OrderinvoicesCreateRefundInvoiceRequest](x: Self) {
    
    inline def setInvoiceId(value: String): Self = StObject.set(x, "invoiceId", value.asInstanceOf[js.Any])
    
    inline def setInvoiceIdUndefined: Self = StObject.set(x, "invoiceId", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setRefundOnlyOption(value: OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption): Self = StObject.set(x, "refundOnlyOption", value.asInstanceOf[js.Any])
    
    inline def setRefundOnlyOptionUndefined: Self = StObject.set(x, "refundOnlyOption", js.undefined)
    
    inline def setReturnOption(value: OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption): Self = StObject.set(x, "returnOption", value.asInstanceOf[js.Any])
    
    inline def setReturnOptionUndefined: Self = StObject.set(x, "returnOption", js.undefined)
    
    inline def setShipmentInvoices(value: js.Array[ShipmentInvoice]): Self = StObject.set(x, "shipmentInvoices", value.asInstanceOf[js.Any])
    
    inline def setShipmentInvoicesUndefined: Self = StObject.set(x, "shipmentInvoices", js.undefined)
    
    inline def setShipmentInvoicesVarargs(value: ShipmentInvoice*): Self = StObject.set(x, "shipmentInvoices", js.Array(value*))
  }
}
