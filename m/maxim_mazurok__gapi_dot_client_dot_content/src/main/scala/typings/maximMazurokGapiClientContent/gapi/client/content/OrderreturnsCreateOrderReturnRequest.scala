package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderreturnsCreateOrderReturnRequest extends js.Object {
  
  /** The list of line items to return. */
  var lineItems: js.UndefOr[js.Array[OrderreturnsLineItem]] = js.native
  
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.native
  
  /** The ID of the order. */
  var orderId: js.UndefOr[String] = js.native
  
  /** The way of the package being returned. */
  var returnMethodType: js.UndefOr[String] = js.native
}
object OrderreturnsCreateOrderReturnRequest {
  
  @scala.inline
  def apply(): OrderreturnsCreateOrderReturnRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreturnsCreateOrderReturnRequest]
  }
  
  @scala.inline
  implicit class OrderreturnsCreateOrderReturnRequestOps[Self <: OrderreturnsCreateOrderReturnRequest] (val x: Self) extends AnyVal {
    
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
    def setLineItemsVarargs(value: OrderreturnsLineItem*): Self = this.set("lineItems", js.Array(value :_*))
    
    @scala.inline
    def setLineItems(value: js.Array[OrderreturnsLineItem]): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItems: Self = this.set("lineItems", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    
    @scala.inline
    def setReturnMethodType(value: String): Self = this.set("returnMethodType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnMethodType: Self = this.set("returnMethodType", js.undefined)
  }
}
