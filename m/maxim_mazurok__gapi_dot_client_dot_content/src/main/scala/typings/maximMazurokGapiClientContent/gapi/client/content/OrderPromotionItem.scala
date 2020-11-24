package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderPromotionItem extends js.Object {
  
  /** The line item ID of a product. Do not provide for `orders.createtestorder`. */
  var lineItemId: js.UndefOr[String] = js.native
  
  /** Required. Offer ID of a product. Only for `orders.createtestorder`. */
  var offerId: js.UndefOr[String] = js.native
  
  /** `orders.createtestorder`. */
  var productId: js.UndefOr[String] = js.native
  
  /** The quantity of the associated product. Do not provide for `orders.createtestorder`. */
  var quantity: js.UndefOr[Double] = js.native
}
object OrderPromotionItem {
  
  @scala.inline
  def apply(): OrderPromotionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderPromotionItem]
  }
  
  @scala.inline
  implicit class OrderPromotionItemOps[Self <: OrderPromotionItem] (val x: Self) extends AnyVal {
    
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
    def setOfferId(value: String): Self = this.set("offerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferId: Self = this.set("offerId", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
  }
}
