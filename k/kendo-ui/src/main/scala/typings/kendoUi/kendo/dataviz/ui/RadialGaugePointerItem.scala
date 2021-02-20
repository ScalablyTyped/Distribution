package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialGaugePointerItem extends StObject {
  
  var cap: js.UndefOr[RadialGaugePointerItemCap] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object RadialGaugePointerItem {
  
  @scala.inline
  def apply(): RadialGaugePointerItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialGaugePointerItem]
  }
  
  @scala.inline
  implicit class RadialGaugePointerItemMutableBuilder[Self <: RadialGaugePointerItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCap(value: RadialGaugePointerItemCap): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
