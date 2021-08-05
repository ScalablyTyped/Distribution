package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadialGaugePointerItem extends StObject {
  
  var cap: js.UndefOr[RadialGaugePointerItemCap] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object RadialGaugePointerItem {
  
  inline def apply(): RadialGaugePointerItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialGaugePointerItem]
  }
  
  extension [Self <: RadialGaugePointerItem](x: Self) {
    
    inline def setCap(value: RadialGaugePointerItemCap): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
    
    inline def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
