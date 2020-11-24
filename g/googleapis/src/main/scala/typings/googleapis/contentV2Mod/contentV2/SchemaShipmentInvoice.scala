package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaShipmentInvoice extends js.Object {
  
  /**
    * [required] Invoice summary.
    */
  var invoiceSummary: js.UndefOr[SchemaInvoiceSummary] = js.native
  
  /**
    * [required] Invoice details per line item.
    */
  var lineItemInvoices: js.UndefOr[js.Array[SchemaShipmentInvoiceLineItemInvoice]] = js.native
  
  /**
    * [required] ID of the shipment group. It is assigned by the merchant in
    * the shipLineItems method and is used to group multiple line items that
    * have the same kind of shipping charges.
    */
  var shipmentGroupId: js.UndefOr[String] = js.native
}
object SchemaShipmentInvoice {
  
  @scala.inline
  def apply(): SchemaShipmentInvoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShipmentInvoice]
  }
  
  @scala.inline
  implicit class SchemaShipmentInvoiceOps[Self <: SchemaShipmentInvoice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInvoiceSummary(value: SchemaInvoiceSummary): Self = this.set("invoiceSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoiceSummary: Self = this.set("invoiceSummary", js.undefined)
    
    @scala.inline
    def setLineItemInvoicesVarargs(value: SchemaShipmentInvoiceLineItemInvoice*): Self = this.set("lineItemInvoices", js.Array(value :_*))
    
    @scala.inline
    def setLineItemInvoices(value: js.Array[SchemaShipmentInvoiceLineItemInvoice]): Self = this.set("lineItemInvoices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItemInvoices: Self = this.set("lineItemInvoices", js.undefined)
    
    @scala.inline
    def setShipmentGroupId(value: String): Self = this.set("shipmentGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentGroupId: Self = this.set("shipmentGroupId", js.undefined)
  }
}
