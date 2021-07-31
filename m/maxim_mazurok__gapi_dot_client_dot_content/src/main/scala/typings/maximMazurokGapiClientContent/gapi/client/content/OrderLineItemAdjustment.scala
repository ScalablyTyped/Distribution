package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderLineItemAdjustment extends StObject {
  
  /** Adjustment for total price of the line item. */
  var priceAdjustment: js.UndefOr[Price] = js.undefined
  
  /** Adjustment for total tax of the line item. */
  var taxAdjustment: js.UndefOr[Price] = js.undefined
  
  /** Type of this adjustment. Acceptable values are: - "`promotion`" */
  var `type`: js.UndefOr[String] = js.undefined
}
object OrderLineItemAdjustment {
  
  @scala.inline
  def apply(): OrderLineItemAdjustment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLineItemAdjustment]
  }
  
  @scala.inline
  implicit class OrderLineItemAdjustmentMutableBuilder[Self <: OrderLineItemAdjustment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriceAdjustment(value: Price): Self = StObject.set(x, "priceAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceAdjustmentUndefined: Self = StObject.set(x, "priceAdjustment", js.undefined)
    
    @scala.inline
    def setTaxAdjustment(value: Price): Self = StObject.set(x, "taxAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxAdjustmentUndefined: Self = StObject.set(x, "taxAdjustment", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
