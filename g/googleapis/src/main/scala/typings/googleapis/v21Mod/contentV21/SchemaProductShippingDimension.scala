package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductShippingDimension extends StObject {
  
  /**
    * The unit of value.
    */
  var unit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The dimension of the product used to calculate the shipping cost of the item.
    */
  var value: js.UndefOr[Double | Null] = js.undefined
}
object SchemaProductShippingDimension {
  
  inline def apply(): SchemaProductShippingDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductShippingDimension]
  }
  
  extension [Self <: SchemaProductShippingDimension](x: Self) {
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitNull: Self = StObject.set(x, "unit", null)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
