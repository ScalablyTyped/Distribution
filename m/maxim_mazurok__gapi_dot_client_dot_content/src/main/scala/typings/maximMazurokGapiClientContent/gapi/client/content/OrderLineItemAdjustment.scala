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
  
  inline def apply(): OrderLineItemAdjustment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLineItemAdjustment]
  }
  
  extension [Self <: OrderLineItemAdjustment](x: Self) {
    
    inline def setPriceAdjustment(value: Price): Self = StObject.set(x, "priceAdjustment", value.asInstanceOf[js.Any])
    
    inline def setPriceAdjustmentUndefined: Self = StObject.set(x, "priceAdjustment", js.undefined)
    
    inline def setTaxAdjustment(value: Price): Self = StObject.set(x, "taxAdjustment", value.asInstanceOf[js.Any])
    
    inline def setTaxAdjustmentUndefined: Self = StObject.set(x, "taxAdjustment", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
