package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSeriesItemBorder extends StObject {
  
  var color: js.UndefOr[String | js.Function] = js.undefined
  
  var dashType: js.UndefOr[String | js.Function] = js.undefined
  
  var opacity: js.UndefOr[Double | js.Function] = js.undefined
  
  var width: js.UndefOr[Double | js.Function] = js.undefined
}
object ChartSeriesItemBorder {
  
  inline def apply(): ChartSeriesItemBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemBorder]
  }
  
  extension [Self <: ChartSeriesItemBorder](x: Self) {
    
    inline def setColor(value: String | js.Function): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashType(value: String | js.Function): Self = StObject.set(x, "dashType", value.asInstanceOf[js.Any])
    
    inline def setDashTypeUndefined: Self = StObject.set(x, "dashType", js.undefined)
    
    inline def setOpacity(value: Double | js.Function): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setWidth(value: Double | js.Function): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
