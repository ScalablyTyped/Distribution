package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderreturnsProcessRequest extends js.Object {
  
  /** Option to charge the customer return shipping cost. */
  var fullChargeReturnShippingCost: js.UndefOr[Boolean] = js.native
  
  /** [required] The ID of the operation, unique across all operations for a given order return. */
  var operationId: js.UndefOr[String] = js.native
  
  /** Refunds for original shipping fee. */
  var refundShippingFee: js.UndefOr[OrderreturnsRefundOperation] = js.native
  
  /** The list of items to return. */
  var returnItems: js.UndefOr[js.Array[OrderreturnsReturnItem]] = js.native
}
object OrderreturnsProcessRequest {
  
  @scala.inline
  def apply(): OrderreturnsProcessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreturnsProcessRequest]
  }
  
  @scala.inline
  implicit class OrderreturnsProcessRequestOps[Self <: OrderreturnsProcessRequest] (val x: Self) extends AnyVal {
    
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
    def setFullChargeReturnShippingCost(value: Boolean): Self = this.set("fullChargeReturnShippingCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullChargeReturnShippingCost: Self = this.set("fullChargeReturnShippingCost", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    
    @scala.inline
    def setRefundShippingFee(value: OrderreturnsRefundOperation): Self = this.set("refundShippingFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefundShippingFee: Self = this.set("refundShippingFee", js.undefined)
    
    @scala.inline
    def setReturnItemsVarargs(value: OrderreturnsReturnItem*): Self = this.set("returnItems", js.Array(value :_*))
    
    @scala.inline
    def setReturnItems(value: js.Array[OrderreturnsReturnItem]): Self = this.set("returnItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnItems: Self = this.set("returnItems", js.undefined)
  }
}
