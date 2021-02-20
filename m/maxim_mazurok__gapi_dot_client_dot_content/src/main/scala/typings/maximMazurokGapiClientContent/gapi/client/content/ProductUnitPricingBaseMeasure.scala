package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductUnitPricingBaseMeasure extends StObject {
  
  /** The unit of the denominator. */
  var unit: js.UndefOr[String] = js.native
  
  /** The denominator of the unit price. */
  var value: js.UndefOr[String] = js.native
}
object ProductUnitPricingBaseMeasure {
  
  @scala.inline
  def apply(): ProductUnitPricingBaseMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductUnitPricingBaseMeasure]
  }
  
  @scala.inline
  implicit class ProductUnitPricingBaseMeasureMutableBuilder[Self <: ProductUnitPricingBaseMeasure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
