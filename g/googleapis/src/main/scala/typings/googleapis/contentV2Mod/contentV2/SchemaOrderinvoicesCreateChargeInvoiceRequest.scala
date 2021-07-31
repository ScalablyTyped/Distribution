package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderinvoicesCreateChargeInvoiceRequest extends StObject {
  
  /**
    * [required] The ID of the invoice.
    */
  var invoiceId: js.UndefOr[String] = js.undefined
  
  /**
    * [required] Invoice summary.
    */
  var invoiceSummary: js.UndefOr[SchemaInvoiceSummary] = js.undefined
  
  /**
    * [required] Invoice details per line item.
    */
  var lineItemInvoices: js.UndefOr[js.Array[SchemaShipmentInvoiceLineItemInvoice]] = js.undefined
  
  /**
    * [required] The ID of the operation, unique across all operations for a
    * given order.
    */
  var operationId: js.UndefOr[String] = js.undefined
  
  /**
    * [required] ID of the shipment group. It is assigned by the merchant in
    * the shipLineItems method and is used to group multiple line items that
    * have the same kind of shipping charges.
    */
  var shipmentGroupId: js.UndefOr[String] = js.undefined
}
object SchemaOrderinvoicesCreateChargeInvoiceRequest {
  
  @scala.inline
  def apply(): SchemaOrderinvoicesCreateChargeInvoiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderinvoicesCreateChargeInvoiceRequest]
  }
  
  @scala.inline
  implicit class SchemaOrderinvoicesCreateChargeInvoiceRequestMutableBuilder[Self <: SchemaOrderinvoicesCreateChargeInvoiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvoiceId(value: String): Self = StObject.set(x, "invoiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoiceIdUndefined: Self = StObject.set(x, "invoiceId", js.undefined)
    
    @scala.inline
    def setInvoiceSummary(value: SchemaInvoiceSummary): Self = StObject.set(x, "invoiceSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoiceSummaryUndefined: Self = StObject.set(x, "invoiceSummary", js.undefined)
    
    @scala.inline
    def setLineItemInvoices(value: js.Array[SchemaShipmentInvoiceLineItemInvoice]): Self = StObject.set(x, "lineItemInvoices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemInvoicesUndefined: Self = StObject.set(x, "lineItemInvoices", js.undefined)
    
    @scala.inline
    def setLineItemInvoicesVarargs(value: SchemaShipmentInvoiceLineItemInvoice*): Self = StObject.set(x, "lineItemInvoices", js.Array(value :_*))
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setShipmentGroupId(value: String): Self = StObject.set(x, "shipmentGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentGroupIdUndefined: Self = StObject.set(x, "shipmentGroupId", js.undefined)
  }
}
