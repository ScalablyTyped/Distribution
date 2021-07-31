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
  
  @scala.inline
  def apply(): StockChartSeriesItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartSeriesItem]
  }
  
  @scala.inline
  implicit class StockChartSeriesItemMutableBuilder[Self <: StockChartSeriesItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregate(value: String | js.Function): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    @scala.inline
    def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setBorder(value: StockChartSeriesItemBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setCategoryField(value: String): Self = StObject.set(x, "categoryField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryFieldUndefined: Self = StObject.set(x, "categoryField", js.undefined)
    
    @scala.inline
    def setCloseField(value: String): Self = StObject.set(x, "closeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseFieldUndefined: Self = StObject.set(x, "closeField", js.undefined)
    
    @scala.inline
    def setColor(value: String | js.Function): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorField(value: String): Self = StObject.set(x, "colorField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorFieldUndefined: Self = StObject.set(x, "colorField", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCurrentField(value: String): Self = StObject.set(x, "currentField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentFieldUndefined: Self = StObject.set(x, "currentField", js.undefined)
    
    @scala.inline
    def setDashType(value: String): Self = StObject.set(x, "dashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashTypeUndefined: Self = StObject.set(x, "dashType", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDownColor(value: String | js.Function): Self = StObject.set(x, "downColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownColorField(value: String): Self = StObject.set(x, "downColorField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownColorFieldUndefined: Self = StObject.set(x, "downColorField", js.undefined)
    
    @scala.inline
    def setDownColorUndefined: Self = StObject.set(x, "downColor", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    @scala.inline
    def setHighField(value: String): Self = StObject.set(x, "highField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighFieldUndefined: Self = StObject.set(x, "highField", js.undefined)
    
    @scala.inline
    def setHighlight(value: StockChartSeriesItemHighlight): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    @scala.inline
    def setLabels(value: StockChartSeriesItemLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLine(value: String | StockChartSeriesItemLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setLowField(value: String): Self = StObject.set(x, "lowField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowFieldUndefined: Self = StObject.set(x, "lowField", js.undefined)
    
    @scala.inline
    def setMarkers(value: StockChartSeriesItemMarkers): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    @scala.inline
    def setMissingValues(value: String): Self = StObject.set(x, "missingValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingValuesUndefined: Self = StObject.set(x, "missingValues", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNegativeColor(value: String): Self = StObject.set(x, "negativeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeColorUndefined: Self = StObject.set(x, "negativeColor", js.undefined)
    
    @scala.inline
    def setNotes(value: StockChartSeriesItemNotes): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOpenField(value: String): Self = StObject.set(x, "openField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenFieldUndefined: Self = StObject.set(x, "openField", js.undefined)
    
    @scala.inline
    def setOverlay(value: StockChartSeriesItemOverlay): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    @scala.inline
    def setStack(value: Boolean | String | StockChartSeriesItemStack): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTarget(value: StockChartSeriesItemTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetField(value: String): Self = StObject.set(x, "targetField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFieldUndefined: Self = StObject.set(x, "targetField", js.undefined)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTooltip(value: StockChartSeriesItemTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisibleInLegend(value: Boolean): Self = StObject.set(x, "visibleInLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleInLegendUndefined: Self = StObject.set(x, "visibleInLegend", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
