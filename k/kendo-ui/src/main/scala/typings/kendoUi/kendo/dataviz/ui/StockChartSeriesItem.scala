package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartSeriesItem extends StObject {
  
  var aggregate: js.UndefOr[String | js.Function] = js.undefined
  
  var axis: js.UndefOr[String] = js.undefined
  
  var border: js.UndefOr[StockChartSeriesItemBorder] = js.undefined
  
  var categoryField: js.UndefOr[String] = js.undefined
  
  var closeField: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String | js.Function] = js.undefined
  
  var colorField: js.UndefOr[String] = js.undefined
  
  var currentField: js.UndefOr[String] = js.undefined
  
  var dashType: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var downColor: js.UndefOr[String | js.Function] = js.undefined
  
  var downColorField: js.UndefOr[String] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
  
  var gap: js.UndefOr[Double] = js.undefined
  
  var highField: js.UndefOr[String] = js.undefined
  
  var highlight: js.UndefOr[StockChartSeriesItemHighlight] = js.undefined
  
  var labels: js.UndefOr[StockChartSeriesItemLabels] = js.undefined
  
  var line: js.UndefOr[String | StockChartSeriesItemLine] = js.undefined
  
  var lowField: js.UndefOr[String] = js.undefined
  
  var markers: js.UndefOr[StockChartSeriesItemMarkers] = js.undefined
  
  var missingValues: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var negativeColor: js.UndefOr[String] = js.undefined
  
  var notes: js.UndefOr[StockChartSeriesItemNotes] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var openField: js.UndefOr[String] = js.undefined
  
  var overlay: js.UndefOr[StockChartSeriesItemOverlay] = js.undefined
  
  var spacing: js.UndefOr[Double] = js.undefined
  
  var stack: js.UndefOr[Boolean | String | StockChartSeriesItemStack] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[StockChartSeriesItemTarget] = js.undefined
  
  var targetField: js.UndefOr[String] = js.undefined
  
  var tooltip: js.UndefOr[StockChartSeriesItemTooltip] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var visibleInLegend: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object StockChartSeriesItem {
  
  inline def apply(): StockChartSeriesItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartSeriesItem]
  }
  
  extension [Self <: StockChartSeriesItem](x: Self) {
    
    inline def setAggregate(value: String | js.Function): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    inline def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setBorder(value: StockChartSeriesItemBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setCategoryField(value: String): Self = StObject.set(x, "categoryField", value.asInstanceOf[js.Any])
    
    inline def setCategoryFieldUndefined: Self = StObject.set(x, "categoryField", js.undefined)
    
    inline def setCloseField(value: String): Self = StObject.set(x, "closeField", value.asInstanceOf[js.Any])
    
    inline def setCloseFieldUndefined: Self = StObject.set(x, "closeField", js.undefined)
    
    inline def setColor(value: String | js.Function): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorField(value: String): Self = StObject.set(x, "colorField", value.asInstanceOf[js.Any])
    
    inline def setColorFieldUndefined: Self = StObject.set(x, "colorField", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCurrentField(value: String): Self = StObject.set(x, "currentField", value.asInstanceOf[js.Any])
    
    inline def setCurrentFieldUndefined: Self = StObject.set(x, "currentField", js.undefined)
    
    inline def setDashType(value: String): Self = StObject.set(x, "dashType", value.asInstanceOf[js.Any])
    
    inline def setDashTypeUndefined: Self = StObject.set(x, "dashType", js.undefined)
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDownColor(value: String | js.Function): Self = StObject.set(x, "downColor", value.asInstanceOf[js.Any])
    
    inline def setDownColorField(value: String): Self = StObject.set(x, "downColorField", value.asInstanceOf[js.Any])
    
    inline def setDownColorFieldUndefined: Self = StObject.set(x, "downColorField", js.undefined)
    
    inline def setDownColorUndefined: Self = StObject.set(x, "downColor", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setHighField(value: String): Self = StObject.set(x, "highField", value.asInstanceOf[js.Any])
    
    inline def setHighFieldUndefined: Self = StObject.set(x, "highField", js.undefined)
    
    inline def setHighlight(value: StockChartSeriesItemHighlight): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    inline def setLabels(value: StockChartSeriesItemLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLine(value: String | StockChartSeriesItemLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setLowField(value: String): Self = StObject.set(x, "lowField", value.asInstanceOf[js.Any])
    
    inline def setLowFieldUndefined: Self = StObject.set(x, "lowField", js.undefined)
    
    inline def setMarkers(value: StockChartSeriesItemMarkers): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    inline def setMissingValues(value: String): Self = StObject.set(x, "missingValues", value.asInstanceOf[js.Any])
    
    inline def setMissingValuesUndefined: Self = StObject.set(x, "missingValues", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNegativeColor(value: String): Self = StObject.set(x, "negativeColor", value.asInstanceOf[js.Any])
    
    inline def setNegativeColorUndefined: Self = StObject.set(x, "negativeColor", js.undefined)
    
    inline def setNotes(value: StockChartSeriesItemNotes): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOpenField(value: String): Self = StObject.set(x, "openField", value.asInstanceOf[js.Any])
    
    inline def setOpenFieldUndefined: Self = StObject.set(x, "openField", js.undefined)
    
    inline def setOverlay(value: StockChartSeriesItemOverlay): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setStack(value: Boolean | String | StockChartSeriesItemStack): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTarget(value: StockChartSeriesItemTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetField(value: String): Self = StObject.set(x, "targetField", value.asInstanceOf[js.Any])
    
    inline def setTargetFieldUndefined: Self = StObject.set(x, "targetField", js.undefined)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTooltip(value: StockChartSeriesItemTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisibleInLegend(value: Boolean): Self = StObject.set(x, "visibleInLegend", value.asInstanceOf[js.Any])
    
    inline def setVisibleInLegendUndefined: Self = StObject.set(x, "visibleInLegend", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
