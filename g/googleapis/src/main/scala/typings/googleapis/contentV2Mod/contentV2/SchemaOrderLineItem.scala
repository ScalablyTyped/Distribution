package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderLineItem extends StObject {
  
  /**
    * Annotations that are attached to the line item.
    */
  var annotations: js.UndefOr[js.Array[SchemaOrderMerchantProvidedAnnotation]] = js.undefined
  
  /**
    * Cancellations of the line item.
    */
  var cancellations: js.UndefOr[js.Array[SchemaOrderCancellation]] = js.undefined
  
  /**
    * The ID of the line item.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total price for the line item. For example, if two items for $10 are purchased, the total price will be $20.
    */
  var price: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Product data as seen by customer from the time of the order placement. Note that certain attributes values (e.g. title or gtin) might be reformatted and no longer match values submitted via product feed.
    */
  var product: js.UndefOr[SchemaOrderLineItemProduct] = js.undefined
  
  /**
    * Number of items canceled.
    */
  var quantityCanceled: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of items delivered.
    */
  var quantityDelivered: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of items ordered.
    */
  var quantityOrdered: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of items pending.
    */
  var quantityPending: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of items ready for pickup.
    */
  var quantityReadyForPickup: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of items returned.
    */
  var quantityReturned: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of items shipped.
    */
  var quantityShipped: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Details of the return policy for the line item.
    */
  var returnInfo: js.UndefOr[SchemaOrderLineItemReturnInfo] = js.undefined
  
  /**
    * Returns of the line item.
    */
  var returns: js.UndefOr[js.Array[SchemaOrderReturn]] = js.undefined
  
  /**
    * Details of the requested shipping for the line item.
    */
  var shippingDetails: js.UndefOr[SchemaOrderLineItemShippingDetails] = js.undefined
  
  /**
    * Total tax amount for the line item. For example, if two items are purchased, and each have a cost tax of $2, the total tax amount will be $4.
    */
  var tax: js.UndefOr[SchemaPrice] = js.undefined
}
object SchemaOrderLineItem {
  
  inline def apply(): SchemaOrderLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLineItem]
  }
  
  extension [Self <: SchemaOrderLineItem](x: Self) {
    
    inline def setAnnotations(value: js.Array[SchemaOrderMerchantProvidedAnnotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: SchemaOrderMerchantProvidedAnnotation*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setCancellations(value: js.Array[SchemaOrderCancellation]): Self = StObject.set(x, "cancellations", value.asInstanceOf[js.Any])
    
    inline def setCancellationsUndefined: Self = StObject.set(x, "cancellations", js.undefined)
    
    inline def setCancellationsVarargs(value: SchemaOrderCancellation*): Self = StObject.set(x, "cancellations", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPrice(value: SchemaPrice): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setProduct(value: SchemaOrderLineItemProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setQuantityCanceled(value: Double): Self = StObject.set(x, "quantityCanceled", value.asInstanceOf[js.Any])
    
    inline def setQuantityCanceledNull: Self = StObject.set(x, "quantityCanceled", null)
    
    inline def setQuantityCanceledUndefined: Self = StObject.set(x, "quantityCanceled", js.undefined)
    
    inline def setQuantityDelivered(value: Double): Self = StObject.set(x, "quantityDelivered", value.asInstanceOf[js.Any])
    
    inline def setQuantityDeliveredNull: Self = StObject.set(x, "quantityDelivered", null)
    
    inline def setQuantityDeliveredUndefined: Self = StObject.set(x, "quantityDelivered", js.undefined)
    
    inline def setQuantityOrdered(value: Double): Self = StObject.set(x, "quantityOrdered", value.asInstanceOf[js.Any])
    
    inline def setQuantityOrderedNull: Self = StObject.set(x, "quantityOrdered", null)
    
    inline def setQuantityOrderedUndefined: Self = StObject.set(x, "quantityOrdered", js.undefined)
    
    inline def setQuantityPending(value: Double): Self = StObject.set(x, "quantityPending", value.asInstanceOf[js.Any])
    
    inline def setQuantityPendingNull: Self = StObject.set(x, "quantityPending", null)
    
    inline def setQuantityPendingUndefined: Self = StObject.set(x, "quantityPending", js.undefined)
    
    inline def setQuantityReadyForPickup(value: Double): Self = StObject.set(x, "quantityReadyForPickup", value.asInstanceOf[js.Any])
    
    inline def setQuantityReadyForPickupNull: Self = StObject.set(x, "quantityReadyForPickup", null)
    
    inline def setQuantityReadyForPickupUndefined: Self = StObject.set(x, "quantityReadyForPickup", js.undefined)
    
    inline def setQuantityReturned(value: Double): Self = StObject.set(x, "quantityReturned", value.asInstanceOf[js.Any])
    
    inline def setQuantityReturnedNull: Self = StObject.set(x, "quantityReturned", null)
    
    inline def setQuantityReturnedUndefined: Self = StObject.set(x, "quantityReturned", js.undefined)
    
    inline def setQuantityShipped(value: Double): Self = StObject.set(x, "quantityShipped", value.asInstanceOf[js.Any])
    
    inline def setQuantityShippedNull: Self = StObject.set(x, "quantityShipped", null)
    
    inline def setQuantityShippedUndefined: Self = StObject.set(x, "quantityShipped", js.undefined)
    
    inline def setReturnInfo(value: SchemaOrderLineItemReturnInfo): Self = StObject.set(x, "returnInfo", value.asInstanceOf[js.Any])
    
    inline def setReturnInfoUndefined: Self = StObject.set(x, "returnInfo", js.undefined)
    
    inline def setReturns(value: js.Array[SchemaOrderReturn]): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
    
    inline def setReturnsUndefined: Self = StObject.set(x, "returns", js.undefined)
    
    inline def setReturnsVarargs(value: SchemaOrderReturn*): Self = StObject.set(x, "returns", js.Array(value*))
    
    inline def setShippingDetails(value: SchemaOrderLineItemShippingDetails): Self = StObject.set(x, "shippingDetails", value.asInstanceOf[js.Any])
    
    inline def setShippingDetailsUndefined: Self = StObject.set(x, "shippingDetails", js.undefined)
    
    inline def setTax(value: SchemaPrice): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
    
    inline def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
  }
}
