package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderreturnsReturnItem extends js.Object {
  
  /** Refunds the item. */
  var refund: js.UndefOr[OrderreturnsRefundOperation] = js.native
  
  /** Rejects the item. */
  var reject: js.UndefOr[OrderreturnsRejectOperation] = js.native
  
  /** Unit level ID for the return item. Different units of the same product will have different IDs. */
  var returnItemId: js.UndefOr[String] = js.native
}
object OrderreturnsReturnItem {
  
  @scala.inline
  def apply(): OrderreturnsReturnItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreturnsReturnItem]
  }
  
  @scala.inline
  implicit class OrderreturnsReturnItemOps[Self <: OrderreturnsReturnItem] (val x: Self) extends AnyVal {
    
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
    def setRefund(value: OrderreturnsRefundOperation): Self = this.set("refund", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefund: Self = this.set("refund", js.undefined)
    
    @scala.inline
    def setReject(value: OrderreturnsRejectOperation): Self = this.set("reject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReject: Self = this.set("reject", js.undefined)
    
    @scala.inline
    def setReturnItemId(value: String): Self = this.set("returnItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnItemId: Self = this.set("returnItemId", js.undefined)
  }
}
