package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaMerchantOrderReturnItem extends js.Object {
  
  var customerReturnReason: js.UndefOr[SchemaCustomerReturnReason] = js.native
  
  var itemId: js.UndefOr[String] = js.native
  
  var merchantReturnReason: js.UndefOr[SchemaRefundReason] = js.native
  
  var product: js.UndefOr[SchemaOrderLineItemProduct] = js.native
  
  var returnShipmentIds: js.UndefOr[js.Array[String]] = js.native
  
  var state: js.UndefOr[String] = js.native
}
object SchemaMerchantOrderReturnItem {
  
  @scala.inline
  def apply(): SchemaMerchantOrderReturnItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMerchantOrderReturnItem]
  }
  
  @scala.inline
  implicit class SchemaMerchantOrderReturnItemOps[Self <: SchemaMerchantOrderReturnItem] (val x: Self) extends AnyVal {
    
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
    def setCustomerReturnReason(value: SchemaCustomerReturnReason): Self = this.set("customerReturnReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerReturnReason: Self = this.set("customerReturnReason", js.undefined)
    
    @scala.inline
    def setItemId(value: String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    
    @scala.inline
    def setMerchantReturnReason(value: SchemaRefundReason): Self = this.set("merchantReturnReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantReturnReason: Self = this.set("merchantReturnReason", js.undefined)
    
    @scala.inline
    def setProduct(value: SchemaOrderLineItemProduct): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    
    @scala.inline
    def setReturnShipmentIdsVarargs(value: String*): Self = this.set("returnShipmentIds", js.Array(value :_*))
    
    @scala.inline
    def setReturnShipmentIds(value: js.Array[String]): Self = this.set("returnShipmentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnShipmentIds: Self = this.set("returnShipmentIds", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
