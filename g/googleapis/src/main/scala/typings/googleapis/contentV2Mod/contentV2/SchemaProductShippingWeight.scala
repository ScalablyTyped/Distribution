package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductShippingWeight extends StObject {
  
  /**
    * The unit of value.
    */
  var unit: js.UndefOr[String] = js.undefined
  
  /**
    * The weight of the product used to calculate the shipping cost of the
    * item.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object SchemaProductShippingWeight {
  
  inline def apply(): SchemaProductShippingWeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductShippingWeight]
  }
  
  extension [Self <: SchemaProductShippingWeight](x: Self) {
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
