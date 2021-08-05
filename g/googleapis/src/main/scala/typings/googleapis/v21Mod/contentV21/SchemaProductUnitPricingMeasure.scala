package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductUnitPricingMeasure extends StObject {
  
  /**
    * The unit of the measure.
    */
  var unit: js.UndefOr[String] = js.undefined
  
  /**
    * The measure of an item.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object SchemaProductUnitPricingMeasure {
  
  inline def apply(): SchemaProductUnitPricingMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductUnitPricingMeasure]
  }
  
  extension [Self <: SchemaProductUnitPricingMeasure](x: Self) {
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
