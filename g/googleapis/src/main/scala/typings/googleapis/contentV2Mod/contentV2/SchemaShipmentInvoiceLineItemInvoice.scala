package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaShipmentInvoiceLineItemInvoice extends js.Object {
  
  /**
    * ID of the line item. Either lineItemId or productId must be set.
    */
  var lineItemId: js.UndefOr[String] = js.native
  
  /**
    * ID of the product. This is the REST ID used in the products service.
    * Either lineItemId or productId must be set.
    */
  var productId: js.UndefOr[String] = js.native
  
  /**
    * [required] The shipment unit ID is assigned by the merchant and defines
    * individual quantities within a line item. The same ID can be assigned to
    * units that are the same while units that differ must be assigned a
    * different ID (for example: free or promotional units).
    */
  var shipmentUnitIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * [required] Invoice details for a single unit.
    */
  var unitInvoice: js.UndefOr[SchemaUnitInvoice] = js.native
}
object SchemaShipmentInvoiceLineItemInvoice {
  
  @scala.inline
  def apply(): SchemaShipmentInvoiceLineItemInvoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShipmentInvoiceLineItemInvoice]
  }
  
  @scala.inline
  implicit class SchemaShipmentInvoiceLineItemInvoiceOps[Self <: SchemaShipmentInvoiceLineItemInvoice] (val x: Self) extends AnyVal {
    
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
    def setLineItemId(value: String): Self = this.set("lineItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItemId: Self = this.set("lineItemId", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setShipmentUnitIdsVarargs(value: String*): Self = this.set("shipmentUnitIds", js.Array(value :_*))
    
    @scala.inline
    def setShipmentUnitIds(value: js.Array[String]): Self = this.set("shipmentUnitIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentUnitIds: Self = this.set("shipmentUnitIds", js.undefined)
    
    @scala.inline
    def setUnitInvoice(value: SchemaUnitInvoice): Self = this.set("unitInvoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitInvoice: Self = this.set("unitInvoice", js.undefined)
  }
}
