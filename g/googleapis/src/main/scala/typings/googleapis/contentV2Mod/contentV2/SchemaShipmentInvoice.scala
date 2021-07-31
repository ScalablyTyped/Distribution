package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShipmentInvoice extends StObject {
  
  /**
    * [required] Invoice summary.
    */
  var invoiceSummary: js.UndefOr[SchemaInvoiceSummary] = js.undefined
  
  /**
    * [required] Invoice details per line item.
    */
  var lineItemInvoices: js.UndefOr[js.Array[SchemaShipmentInvoiceLineItemInvoice]] = js.undefined
  
  /**
    * [required] ID of the shipment group. It is assigned by the merchant in
    * the shipLineItems method and is used to group multiple line items that
    * have the same kind of shipping charges.
    */
  var shipmentGroupId: js.UndefOr[String] = js.undefined
}
object SchemaShipmentInvoice {
  
  @scala.inline
  def apply(): SchemaShipmentInvoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShipmentInvoice]
  }
  
  @scala.inline
  implicit class SchemaShipmentInvoiceMutableBuilder[Self <: SchemaShipmentInvoice] (val x: Self) extends AnyVal {
    
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
    def setShipmentGroupId(value: String): Self = StObject.set(x, "shipmentGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentGroupIdUndefined: Self = StObject.set(x, "shipmentGroupId", js.undefined)
  }
}
