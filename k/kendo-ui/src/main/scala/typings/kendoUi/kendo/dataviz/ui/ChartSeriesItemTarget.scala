package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSeriesItemTarget extends StObject {
  
  var border: js.UndefOr[js.Function | ChartSeriesItemTargetBorder] = js.undefined
  
  var color: js.UndefOr[String | js.Function] = js.undefined
  
  var line: js.UndefOr[ChartSeriesItemTargetLine] = js.undefined
}
object ChartSeriesItemTarget {
  
  inline def apply(): ChartSeriesItemTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemTarget]
  }
  
  extension [Self <: ChartSeriesItemTarget](x: Self) {
    
    inline def setBorder(value: js.Function | ChartSeriesItemTargetBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String | js.Function): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLine(value: ChartSeriesItemTargetLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
