package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductUnitPricingBaseMeasure extends StObject {
  
  /**
    * The unit of the denominator.
    */
  var unit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The denominator of the unit price.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaProductUnitPricingBaseMeasure {
  
  inline def apply(): SchemaProductUnitPricingBaseMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductUnitPricingBaseMeasure]
  }
  
  extension [Self <: SchemaProductUnitPricingBaseMeasure](x: Self) {
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitNull: Self = StObject.set(x, "unit", null)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
