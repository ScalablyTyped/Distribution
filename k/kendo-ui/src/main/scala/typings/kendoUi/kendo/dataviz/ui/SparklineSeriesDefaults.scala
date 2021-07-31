package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineSeriesDefaults extends StObject {
  
  var area: js.UndefOr[js.Any] = js.undefined
  
  var bar: js.UndefOr[js.Any] = js.undefined
  
  var border: js.UndefOr[SparklineSeriesDefaultsBorder] = js.undefined
  
  var column: js.UndefOr[js.Any] = js.undefined
  
  var gap: js.UndefOr[Double] = js.undefined
  
  var labels: js.UndefOr[SparklineSeriesDefaultsLabels] = js.undefined
  
  var line: js.UndefOr[js.Any] = js.undefined
  
  var overlay: js.UndefOr[js.Any] = js.undefined
  
  var pie: js.UndefOr[js.Any] = js.undefined
  
  var spacing: js.UndefOr[Double] = js.undefined
  
  var stack: js.UndefOr[Boolean | SparklineSeriesDefaultsStack] = js.undefined
  
  var tooltip: js.UndefOr[SparklineSeriesDefaultsTooltip] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SparklineSeriesDefaults {
  
  @scala.inline
  def apply(): SparklineSeriesDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineSeriesDefaults]
  }
  
  @scala.inline
  implicit class SparklineSeriesDefaultsMutableBuilder[Self <: SparklineSeriesDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArea(value: js.Any): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    @scala.inline
    def setBar(value: js.Any): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
    
    @scala.inline
    def setBorder(value: SparklineSeriesDefaultsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    @scala.inline
    def setLabels(value: SparklineSeriesDefaultsLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLine(value: js.Any): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setOverlay(value: js.Any): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    @scala.inline
    def setPie(value: js.Any): Self = StObject.set(x, "pie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieUndefined: Self = StObject.set(x, "pie", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    @scala.inline
    def setStack(value: Boolean | SparklineSeriesDefaultsStack): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setTooltip(value: SparklineSeriesDefaultsTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
