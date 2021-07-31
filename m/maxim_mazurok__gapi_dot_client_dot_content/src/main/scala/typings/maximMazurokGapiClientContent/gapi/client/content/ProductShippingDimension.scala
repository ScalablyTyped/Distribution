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
  
  @scala.inline
  def apply(): ProductShippingDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductShippingDimension]
  }
  
  @scala.inline
  implicit class ProductShippingDimensionMutableBuilder[Self <: ProductShippingDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
