package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderLineItem extends StObject {
  
  /** Price and tax adjustments applied on the line item. */
  var adjustments: js.UndefOr[js.Array[OrderLineItemAdjustment]] = js.undefined
  
  /** Annotations that are attached to the line item. */
  var annotations: js.UndefOr[js.Array[OrderMerchantProvidedAnnotation]] = js.undefined
  
  /** Cancellations of the line item. */
  var cancellations: js.UndefOr[js.Array[OrderCancellation]] = js.undefined
  
  /** The ID of the line item. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Total price for the line item. For example, if two items for $10 are purchased, the total price will be $20. */
  var price: js.UndefOr[Price] = js.undefined
  
  /**
    * Product data as seen by customer from the time of the order placement. Note that certain attributes values (e.g. title or gtin) might be reformatted and no longer match values
    * submitted via product feed.
    */
  var product: js.UndefOr[OrderLineItemProduct] = js.undefined
  
  /** Number of items canceled. */
  var quantityCanceled: js.UndefOr[Double] = js.undefined
  
  /** Number of items delivered. */
  var quantityDelivered: js.UndefOr[Double] = js.undefined
  
  /** Number of items ordered. */
  var quantityOrdered: js.UndefOr[Double] = js.undefined
  
  /** Number of items pending. */
  var quantityPending: js.UndefOr[Double] = js.undefined
  
  /** Number of items ready for pickup. */
  var quantityReadyForPickup: js.UndefOr[Double] = js.undefined
  
  /** Number of items returned. */
  var quantityReturned: js.UndefOr[Double] = js.undefined
  
  /** Number of items shipped. */
  var quantityShipped: js.UndefOr[Double] = js.undefined
  
  /** Number of items undeliverable. */
  var quantityUndeliverable: js.UndefOr[Double] = js.undefined
  
  /** Details of the return policy for the line item. */
  var returnInfo: js.UndefOr[OrderLineItemReturnInfo] = js.undefined
  
  /** Returns of the line item. */
  var returns: js.UndefOr[js.Array[OrderReturn]] = js.undefined
  
  /** Details of the requested shipping for the line item. */
  var shippingDetails: js.UndefOr[OrderLineItemShippingDetails] = js.undefined
  
  /** Total tax amount for the line item. For example, if two items are purchased, and each have a cost tax of $2, the total tax amount will be $4. */
  var tax: js.UndefOr[Price] = js.undefined
}
object OrderLineItem {
  
  @scala.inline
  def apply(): OrderLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLineItem]
  }
  
  @scala.inline
  implicit class OrderLineItemMutableBuilder[Self <: OrderLineItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustments(value: js.Array[OrderLineItemAdjustment]): Self = StObject.set(x, "adjustments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustmentsUndefined: Self = StObject.set(x, "adjustments", js.undefined)
    
    @scala.inline
    def setAdjustmentsVarargs(value: OrderLineItemAdjustment*): Self = StObject.set(x, "adjustments", js.Array(value :_*))
    
    @scala.inline
    def setAnnotations(value: js.Array[OrderMerchantProvidedAnnotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: OrderMerchantProvidedAnnotation*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    @scala.inline
    def setCancellations(value: js.Array[OrderCancellation]): Self = StObject.set(x, "cancellations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancellationsUndefined: Self = StObject.set(x, "cancellations", js.undefined)
    
    @scala.inline
    def setCancellationsVarargs(value: OrderCancellation*): Self = StObject.set(x, "cancellations", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    @scala.inline
    def setProduct(value: OrderLineItemProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    @scala.inline
    def setQuantityCanceled(value: Double): Self = StObject.set(x, "quantityCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityCanceledUndefined: Self = StObject.set(x, "quantityCanceled", js.undefined)
    
    @scala.inline
    def setQuantityDelivered(value: Double): Self = StObject.set(x, "quantityDelivered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityDeliveredUndefined: Self = StObject.set(x, "quantityDelivered", js.undefined)
    
    @scala.inline
    def setQuantityOrdered(value: Double): Self = StObject.set(x, "quantityOrdered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityOrderedUndefined: Self = StObject.set(x, "quantityOrdered", js.undefined)
    
    @scala.inline
    def setQuantityPending(value: Double): Self = StObject.set(x, "quantityPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityPendingUndefined: Self = StObject.set(x, "quantityPending", js.undefined)
    
    @scala.inline
    def setQuantityReadyForPickup(value: Double): Self = StObject.set(x, "quantityReadyForPickup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityReadyForPickupUndefined: Self = StObject.set(x, "quantityReadyForPickup", js.undefined)
    
    @scala.inline
    def setQuantityReturned(value: Double): Self = StObject.set(x, "quantityReturned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityReturnedUndefined: Self = StObject.set(x, "quantityReturned", js.undefined)
    
    @scala.inline
    def setQuantityShipped(value: Double): Self = StObject.set(x, "quantityShipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityShippedUndefined: Self = StObject.set(x, "quantityShipped", js.undefined)
    
    @scala.inline
    def setQuantityUndeliverable(value: Double): Self = StObject.set(x, "quantityUndeliverable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndeliverableUndefined: Self = StObject.set(x, "quantityUndeliverable", js.undefined)
    
    @scala.inline
    def setReturnInfo(value: OrderLineItemReturnInfo): Self = StObject.set(x, "returnInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnInfoUndefined: Self = StObject.set(x, "returnInfo", js.undefined)
    
    @scala.inline
    def setReturns(value: js.Array[OrderReturn]): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnsUndefined: Self = StObject.set(x, "returns", js.undefined)
    
    @scala.inline
    def setReturnsVarargs(value: OrderReturn*): Self = StObject.set(x, "returns", js.Array(value :_*))
    
    @scala.inline
    def setShippingDetails(value: OrderLineItemShippingDetails): Self = StObject.set(x, "shippingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingDetailsUndefined: Self = StObject.set(x, "shippingDetails", js.undefined)
    
    @scala.inline
    def setTax(value: Price): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
  }
}
