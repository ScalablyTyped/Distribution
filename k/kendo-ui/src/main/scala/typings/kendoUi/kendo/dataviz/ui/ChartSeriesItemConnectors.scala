package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSeriesItemConnectors extends StObject {
  
  var color: js.UndefOr[String | js.Function] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ChartSeriesItemConnectors {
  
  inline def apply(): ChartSeriesItemConnectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemConnectors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartSeriesItemConnectors] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String | js.Function): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
