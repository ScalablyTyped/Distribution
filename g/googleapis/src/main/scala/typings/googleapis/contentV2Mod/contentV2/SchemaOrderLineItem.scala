package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderLineItem extends js.Object {
  
  /**
    * Annotations that are attached to the line item.
    */
  var annotations: js.UndefOr[js.Array[SchemaOrderMerchantProvidedAnnotation]] = js.native
  
  /**
    * Cancellations of the line item.
    */
  var cancellations: js.UndefOr[js.Array[SchemaOrderCancellation]] = js.native
  
  /**
    * The ID of the line item.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Total price for the line item. For example, if two items for $10 are
    * purchased, the total price will be $20.
    */
  var price: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * Product data as seen by customer from the time of the order placement.
    * Note that certain attributes values (e.g. title or gtin) might be
    * reformatted and no longer match values submitted via product feed.
    */
  var product: js.UndefOr[SchemaOrderLineItemProduct] = js.native
  
  /**
    * Number of items canceled.
    */
  var quantityCanceled: js.UndefOr[Double] = js.native
  
  /**
    * Number of items delivered.
    */
  var quantityDelivered: js.UndefOr[Double] = js.native
  
  /**
    * Number of items ordered.
    */
  var quantityOrdered: js.UndefOr[Double] = js.native
  
  /**
    * Number of items pending.
    */
  var quantityPending: js.UndefOr[Double] = js.native
  
  /**
    * Number of items returned.
    */
  var quantityReturned: js.UndefOr[Double] = js.native
  
  /**
    * Number of items shipped.
    */
  var quantityShipped: js.UndefOr[Double] = js.native
  
  /**
    * Details of the return policy for the line item.
    */
  var returnInfo: js.UndefOr[SchemaOrderLineItemReturnInfo] = js.native
  
  /**
    * Returns of the line item.
    */
  var returns: js.UndefOr[js.Array[SchemaOrderReturn]] = js.native
  
  /**
    * Details of the requested shipping for the line item.
    */
  var shippingDetails: js.UndefOr[SchemaOrderLineItemShippingDetails] = js.native
  
  /**
    * Total tax amount for the line item. For example, if two items are
    * purchased, and each have a cost tax of $2, the total tax amount will be
    * $4.
    */
  var tax: js.UndefOr[SchemaPrice] = js.native
}
object SchemaOrderLineItem {
  
  @scala.inline
  def apply(): SchemaOrderLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLineItem]
  }
  
  @scala.inline
  implicit class SchemaOrderLineItemOps[Self <: SchemaOrderLineItem] (val x: Self) extends AnyVal {
    
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
    def setAnnotationsVarargs(value: SchemaOrderMerchantProvidedAnnotation*): Self = this.set("annotations", js.Array(value :_*))
    
    @scala.inline
    def setAnnotations(value: js.Array[SchemaOrderMerchantProvidedAnnotation]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setCancellationsVarargs(value: SchemaOrderCancellation*): Self = this.set("cancellations", js.Array(value :_*))
    
    @scala.inline
    def setCancellations(value: js.Array[SchemaOrderCancellation]): Self = this.set("cancellations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancellations: Self = this.set("cancellations", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setPrice(value: SchemaPrice): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setProduct(value: SchemaOrderLineItemProduct): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    
    @scala.inline
    def setQuantityCanceled(value: Double): Self = this.set("quantityCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantityCanceled: Self = this.set("quantityCanceled", js.undefined)
    
    @scala.inline
    def setQuantityDelivered(value: Double): Self = this.set("quantityDelivered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantityDelivered: Self = this.set("quantityDelivered", js.undefined)
    
    @scala.inline
    def setQuantityOrdered(value: Double): Self = this.set("quantityOrdered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantityOrdered: Self = this.set("quantityOrdered", js.undefined)
    
    @scala.inline
    def setQuantityPending(value: Double): Self = this.set("quantityPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantityPending: Self = this.set("quantityPending", js.undefined)
    
    @scala.inline
    def setQuantityReturned(value: Double): Self = this.set("quantityReturned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantityReturned: Self = this.set("quantityReturned", js.undefined)
    
    @scala.inline
    def setQuantityShipped(value: Double): Self = this.set("quantityShipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantityShipped: Self = this.set("quantityShipped", js.undefined)
    
    @scala.inline
    def setReturnInfo(value: SchemaOrderLineItemReturnInfo): Self = this.set("returnInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnInfo: Self = this.set("returnInfo", js.undefined)
    
    @scala.inline
    def setReturnsVarargs(value: SchemaOrderReturn*): Self = this.set("returns", js.Array(value :_*))
    
    @scala.inline
    def setReturns(value: js.Array[SchemaOrderReturn]): Self = this.set("returns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturns: Self = this.set("returns", js.undefined)
    
    @scala.inline
    def setShippingDetails(value: SchemaOrderLineItemShippingDetails): Self = this.set("shippingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingDetails: Self = this.set("shippingDetails", js.undefined)
    
    @scala.inline
    def setTax(value: SchemaPrice): Self = this.set("tax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTax: Self = this.set("tax", js.undefined)
  }
}
