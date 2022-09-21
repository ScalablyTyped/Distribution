package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineSeriesDefaults extends StObject {
  
  var area: js.UndefOr[Any] = js.undefined
  
  var bar: js.UndefOr[Any] = js.undefined
  
  var border: js.UndefOr[SparklineSeriesDefaultsBorder] = js.undefined
  
  var column: js.UndefOr[Any] = js.undefined
  
  var gap: js.UndefOr[Double] = js.undefined
  
  var labels: js.UndefOr[SparklineSeriesDefaultsLabels] = js.undefined
  
  var line: js.UndefOr[Any] = js.undefined
  
  var overlay: js.UndefOr[Any] = js.undefined
  
  var pie: js.UndefOr[Any] = js.undefined
  
  var spacing: js.UndefOr[Double] = js.undefined
  
  var stack: js.UndefOr[Boolean | SparklineSeriesDefaultsStack] = js.undefined
  
  var tooltip: js.UndefOr[SparklineSeriesDefaultsTooltip] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SparklineSeriesDefaults {
  
  inline def apply(): SparklineSeriesDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineSeriesDefaults]
  }
  
  extension [Self <: SparklineSeriesDefaults](x: Self) {
    
    inline def setArea(value: Any): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    inline def setBar(value: Any): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
    
    inline def setBorder(value: SparklineSeriesDefaultsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setLabels(value: SparklineSeriesDefaultsLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLine(value: Any): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setOverlay(value: Any): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    inline def setPie(value: Any): Self = StObject.set(x, "pie", value.asInstanceOf[js.Any])
    
    inline def setPieUndefined: Self = StObject.set(x, "pie", js.undefined)
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setStack(value: Boolean | SparklineSeriesDefaultsStack): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setTooltip(value: SparklineSeriesDefaultsTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
