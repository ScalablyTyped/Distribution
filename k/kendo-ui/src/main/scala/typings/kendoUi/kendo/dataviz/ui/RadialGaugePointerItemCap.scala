package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadialGaugePointerItemCap extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
}
object RadialGaugePointerItemCap {
  
  inline def apply(): RadialGaugePointerItemCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialGaugePointerItemCap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RadialGaugePointerItemCap] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
