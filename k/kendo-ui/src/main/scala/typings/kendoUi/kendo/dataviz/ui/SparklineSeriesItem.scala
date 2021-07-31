package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineSeriesItem extends StObject {
  
  var aggregate: js.UndefOr[String | js.Function] = js.undefined
  
  var axis: js.UndefOr[String] = js.undefined
  
  var border: js.UndefOr[SparklineSeriesItemBorder] = js.undefined
  
  var categoryField: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String | js.Function] = js.undefined
  
  var colorField: js.UndefOr[String] = js.undefined
  
  var connectors: js.UndefOr[SparklineSeriesItemConnectors] = js.undefined
  
  var currentField: js.UndefOr[String] = js.undefined
  
  var dashType: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var explodeField: js.UndefOr[String] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
  
  var gap: js.UndefOr[Double] = js.undefined
  
  var highlight: js.UndefOr[SparklineSeriesItemHighlight] = js.undefined
  
  var labels: js.UndefOr[SparklineSeriesItemLabels] = js.undefined
  
  var line: js.UndefOr[String | SparklineSeriesItemLine] = js.undefined
  
  var markers: js.UndefOr[SparklineSeriesItemMarkers] = js.undefined
  
  var missingValues: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var negativeColor: js.UndefOr[String] = js.undefined
  
  var notes: js.UndefOr[SparklineSeriesItemNotes] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var overlay: js.UndefOr[SparklineSeriesItemOverlay] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var spacing: js.UndefOr[Double] = js.undefined
  
  var stack: js.UndefOr[Boolean | String | SparklineSeriesItemStack] = js.undefined
  
  var startAngle: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[SparklineSeriesItemTarget] = js.undefined
  
  var targetField: js.UndefOr[String] = js.undefined
  
  var tooltip: js.UndefOr[SparklineSeriesItemTooltip] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object SparklineSeriesItem {
  
  @scala.inline
  def apply(): SparklineSeriesItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineSeriesItem]
  }
  
  @scala.inline
  implicit class SparklineSeriesItemMutableBuilder[Self <: SparklineSeriesItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregate(value: String | js.Function): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    @scala.inline
    def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setBorder(value: SparklineSeriesItemBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setCategoryField(value: String): Self = StObject.set(x, "categoryField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryFieldUndefined: Self = StObject.set(x, "categoryField", js.undefined)
    
    @scala.inline
    def setColor(value: String | js.Function): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorField(value: String): Self = StObject.set(x, "colorField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorFieldUndefined: Self = StObject.set(x, "colorField", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setConnectors(value: SparklineSeriesItemConnectors): Self = StObject.set(x, "connectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorsUndefined: Self = StObject.set(x, "connectors", js.undefined)
    
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
    def setExplodeField(value: String): Self = StObject.set(x, "explodeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplodeFieldUndefined: Self = StObject.set(x, "explodeField", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    @scala.inline
    def setHighlight(value: SparklineSeriesItemHighlight): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    @scala.inline
    def setLabels(value: SparklineSeriesItemLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLine(value: String | SparklineSeriesItemLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setMarkers(value: SparklineSeriesItemMarkers): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
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
    def setNotes(value: SparklineSeriesItemNotes): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOverlay(value: SparklineSeriesItemOverlay): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    @scala.inline
    def setStack(value: Boolean | String | SparklineSeriesItemStack): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTarget(value: SparklineSeriesItemTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetField(value: String): Self = StObject.set(x, "targetField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFieldUndefined: Self = StObject.set(x, "targetField", js.undefined)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTooltip(value: SparklineSeriesItemTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
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
