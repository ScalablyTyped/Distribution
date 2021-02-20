package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestOrderLineItem extends StObject {
  
  /** Required. Product data from the time of the order placement. */
  var product: js.UndefOr[TestOrderLineItemProduct] = js.native
  
  /** Required. Number of items ordered. */
  var quantityOrdered: js.UndefOr[Double] = js.native
  
  /** Required. Details of the return policy for the line item. */
  var returnInfo: js.UndefOr[OrderLineItemReturnInfo] = js.native
  
  /** Required. Details of the requested shipping for the line item. */
  var shippingDetails: js.UndefOr[OrderLineItemShippingDetails] = js.native
}
object TestOrderLineItem {
  
  @scala.inline
  def apply(): TestOrderLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOrderLineItem]
  }
  
  @scala.inline
  implicit class TestOrderLineItemMutableBuilder[Self <: TestOrderLineItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProduct(value: TestOrderLineItemProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    @scala.inline
    def setQuantityOrdered(value: Double): Self = StObject.set(x, "quantityOrdered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityOrderedUndefined: Self = StObject.set(x, "quantityOrdered", js.undefined)
    
    @scala.inline
    def setReturnInfo(value: OrderLineItemReturnInfo): Self = StObject.set(x, "returnInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnInfoUndefined: Self = StObject.set(x, "returnInfo", js.undefined)
    
    @scala.inline
    def setShippingDetails(value: OrderLineItemShippingDetails): Self = StObject.set(x, "shippingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingDetailsUndefined: Self = StObject.set(x, "shippingDetails", js.undefined)
  }
}
