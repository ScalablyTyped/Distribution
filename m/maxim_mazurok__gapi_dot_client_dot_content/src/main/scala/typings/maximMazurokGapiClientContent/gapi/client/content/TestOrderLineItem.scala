package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestOrderLineItem extends StObject {
  
  /** Required. Product data from the time of the order placement. */
  var product: js.UndefOr[TestOrderLineItemProduct] = js.undefined
  
  /** Required. Number of items ordered. */
  var quantityOrdered: js.UndefOr[Double] = js.undefined
  
  /** Required. Details of the return policy for the line item. */
  var returnInfo: js.UndefOr[OrderLineItemReturnInfo] = js.undefined
  
  /** Required. Details of the requested shipping for the line item. */
  var shippingDetails: js.UndefOr[OrderLineItemShippingDetails] = js.undefined
}
object TestOrderLineItem {
  
  inline def apply(): TestOrderLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOrderLineItem]
  }
  
  extension [Self <: TestOrderLineItem](x: Self) {
    
    inline def setProduct(value: TestOrderLineItemProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setQuantityOrdered(value: Double): Self = StObject.set(x, "quantityOrdered", value.asInstanceOf[js.Any])
    
    inline def setQuantityOrderedUndefined: Self = StObject.set(x, "quantityOrdered", js.undefined)
    
    inline def setReturnInfo(value: OrderLineItemReturnInfo): Self = StObject.set(x, "returnInfo", value.asInstanceOf[js.Any])
    
    inline def setReturnInfoUndefined: Self = StObject.set(x, "returnInfo", js.undefined)
    
    inline def setShippingDetails(value: OrderLineItemShippingDetails): Self = StObject.set(x, "shippingDetails", value.asInstanceOf[js.Any])
    
    inline def setShippingDetailsUndefined: Self = StObject.set(x, "shippingDetails", js.undefined)
  }
}
