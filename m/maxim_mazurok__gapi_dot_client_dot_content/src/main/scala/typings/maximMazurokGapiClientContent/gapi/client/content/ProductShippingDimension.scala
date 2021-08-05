package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductShippingDimension extends StObject {
  
  /** The unit of value. */
  var unit: js.UndefOr[String] = js.undefined
  
  /** The dimension of the product used to calculate the shipping cost of the item. */
  var value: js.UndefOr[Double] = js.undefined
}
object ProductShippingDimension {
  
  inline def apply(): ProductShippingDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductShippingDimension]
  }
  
  extension [Self <: ProductShippingDimension](x: Self) {
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
