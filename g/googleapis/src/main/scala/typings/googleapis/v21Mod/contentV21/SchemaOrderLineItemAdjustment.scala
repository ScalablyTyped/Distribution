package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderLineItemAdjustment extends StObject {
  
  /**
    * Adjustment for total price of the line item.
    */
  var priceAdjustment: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Adjustment for total tax of the line item.
    */
  var taxAdjustment: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Type of this adjustment. Acceptable values are: - "`promotion`"
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderLineItemAdjustment {
  
  inline def apply(): SchemaOrderLineItemAdjustment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLineItemAdjustment]
  }
  
  extension [Self <: SchemaOrderLineItemAdjustment](x: Self) {
    
    inline def setPriceAdjustment(value: SchemaPrice): Self = StObject.set(x, "priceAdjustment", value.asInstanceOf[js.Any])
    
    inline def setPriceAdjustmentUndefined: Self = StObject.set(x, "priceAdjustment", js.undefined)
    
    inline def setTaxAdjustment(value: SchemaPrice): Self = StObject.set(x, "taxAdjustment", value.asInstanceOf[js.Any])
    
    inline def setTaxAdjustmentUndefined: Self = StObject.set(x, "taxAdjustment", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
