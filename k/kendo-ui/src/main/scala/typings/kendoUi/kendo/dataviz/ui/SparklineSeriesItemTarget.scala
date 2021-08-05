package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineSeriesItemTarget extends StObject {
  
  var border: js.UndefOr[js.Function | SparklineSeriesItemTargetBorder] = js.undefined
  
  var color: js.UndefOr[String | js.Function] = js.undefined
  
  var line: js.UndefOr[SparklineSeriesItemTargetLine] = js.undefined
}
object SparklineSeriesItemTarget {
  
  inline def apply(): SparklineSeriesItemTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineSeriesItemTarget]
  }
  
  extension [Self <: SparklineSeriesItemTarget](x: Self) {
    
    inline def setBorder(value: js.Function | SparklineSeriesItemTargetBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String | js.Function): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLine(value: SparklineSeriesItemTargetLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
