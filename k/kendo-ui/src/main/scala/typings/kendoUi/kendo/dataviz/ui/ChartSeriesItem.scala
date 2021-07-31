package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSeriesItem extends StObject {
  
  var aggregate: js.UndefOr[String | js.Function] = js.undefined
  
  var axis: js.UndefOr[String] = js.undefined
  
  var border: js.UndefOr[ChartSeriesItemBorder] = js.undefined
  
  var categoryAxis: js.UndefOr[String] = js.undefined
  
  var categoryField: js.UndefOr[String] = js.undefined
  
  var closeField: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String | js.Function] = js.undefined
  
  var colorField: js.UndefOr[String] = js.undefined
  
  var connectors: js.UndefOr[ChartSeriesItemConnectors] = js.undefined
  
  var currentField: js.UndefOr[String] = js.undefined
  
  var dashType: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var downColor: js.UndefOr[String | js.Function] = js.undefined
  
  var downColorField: js.UndefOr[String] = js.undefined
  
  var dynamicHeight: js.UndefOr[Boolean] = js.undefined
  
  var dynamicSlope: js.UndefOr[Boolean] = js.undefined
  
  var errorBars: js.UndefOr[ChartSeriesItemErrorBars] = js.undefined
  
  var errorHighField: js.UndefOr[String] = js.undefined
  
  var errorLowField: js.UndefOr[String] = js.undefined
  
  var explodeField: js.UndefOr[String] = js.undefined
  
  var extremes: js.UndefOr[ChartSeriesItemExtremes] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
  
  var fromField: js.UndefOr[String] = js.undefined
  
  var gap: js.UndefOr[Double] = js.undefined
  
  var highField: js.UndefOr[String] = js.undefined
  
  var highlight: js.UndefOr[ChartSeriesItemHighlight] = js.undefined
  
  var holeSize: js.UndefOr[Double] = js.undefined
  
  var labels: js.UndefOr[ChartSeriesItemLabels] = js.undefined
  
  var line: js.UndefOr[String | ChartSeriesItemLine] = js.undefined
  
  var lowField: js.UndefOr[String] = js.undefined
  
  var lowerField: js.UndefOr[String] = js.undefined
  
  var margin: js.UndefOr[Double | ChartSeriesItemMargin] = js.undefined
  
  var markers: js.UndefOr[ChartSeriesItemMarkers] = js.undefined
  
  var maxSize: js.UndefOr[Double] = js.undefined
  
  var meanField: js.UndefOr[String] = js.undefined
  
  var medianField: js.UndefOr[String] = js.undefined
  
  var minSize: js.UndefOr[Double] = js.undefined
  
  var missingValues: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var neckRatio: js.UndefOr[Double] = js.undefined
  
  var negativeColor: js.UndefOr[String] = js.undefined
  
  var negativeValues: js.UndefOr[ChartSeriesItemNegativeValues] = js.undefined
  
  var noteTextField: js.UndefOr[String] = js.undefined
  
  var notes: js.UndefOr[ChartSeriesItemNotes] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var openField: js.UndefOr[String] = js.undefined
  
  var outliers: js.UndefOr[ChartSeriesItemOutliers] = js.undefined
  
  var outliersField: js.UndefOr[String] = js.undefined
  
  var overlay: js.UndefOr[ChartSeriesItemOverlay] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var q1Field: js.UndefOr[String] = js.undefined
  
  var q3Field: js.UndefOr[String] = js.undefined
  
  var segmentSpacing: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var sizeField: js.UndefOr[String] = js.undefined
  
  var spacing: js.UndefOr[Double] = js.undefined
  
  var stack: js.UndefOr[Boolean | String | ChartSeriesItemStack] = js.undefined
  
  var startAngle: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
  
  var summaryField: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[ChartSeriesItemTarget] = js.undefined
  
  var targetField: js.UndefOr[String] = js.undefined
  
  var toField: js.UndefOr[String] = js.undefined
  
  var tooltip: js.UndefOr[ChartSeriesItemTooltip] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var upperField: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var visibleInLegend: js.UndefOr[Boolean] = js.undefined
  
  var visibleInLegendField: js.UndefOr[String] = js.undefined
  
  var visual: js.UndefOr[js.Function] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var xAxis: js.UndefOr[String] = js.undefined
  
  var xErrorHighField: js.UndefOr[String] = js.undefined
  
  var xErrorLowField: js.UndefOr[String] = js.undefined
  
  var xField: js.UndefOr[String] = js.undefined
  
  var yAxis: js.UndefOr[String] = js.undefined
  
  var yErrorHighField: js.UndefOr[String] = js.undefined
  
  var yErrorLowField: js.UndefOr[String] = js.undefined
  
  var yField: js.UndefOr[String] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object ChartSeriesItem {
  
  @scala.inline
  def apply(): ChartSeriesItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItem]
  }
  
  @scala.inline
  implicit class ChartSeriesItemMutableBuilder[Self <: ChartSeriesItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregate(value: String | js.Function): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    @scala.inline
    def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setBorder(value: ChartSeriesItemBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setCategoryAxis(value: String): Self = StObject.set(x, "categoryAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryAxisUndefined: Self = StObject.set(x, "categoryAxis", js.undefined)
    
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
    def setConnectors(value: ChartSeriesItemConnectors): Self = StObject.set(x, "connectors", value.asInstanceOf[js.Any])
    
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
    def setDownColor(value: String | js.Function): Self = StObject.set(x, "downColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownColorField(value: String): Self = StObject.set(x, "downColorField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownColorFieldUndefined: Self = StObject.set(x, "downColorField", js.undefined)
    
    @scala.inline
    def setDownColorUndefined: Self = StObject.set(x, "downColor", js.undefined)
    
    @scala.inline
    def setDynamicHeight(value: Boolean): Self = StObject.set(x, "dynamicHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicHeightUndefined: Self = StObject.set(x, "dynamicHeight", js.undefined)
    
    @scala.inline
    def setDynamicSlope(value: Boolean): Self = StObject.set(x, "dynamicSlope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicSlopeUndefined: Self = StObject.set(x, "dynamicSlope", js.undefined)
    
    @scala.inline
    def setErrorBars(value: ChartSeriesItemErrorBars): Self = StObject.set(x, "errorBars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorBarsUndefined: Self = StObject.set(x, "errorBars", js.undefined)
    
    @scala.inline
    def setErrorHighField(value: String): Self = StObject.set(x, "errorHighField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorHighFieldUndefined: Self = StObject.set(x, "errorHighField", js.undefined)
    
    @scala.inline
    def setErrorLowField(value: String): Self = StObject.set(x, "errorLowField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorLowFieldUndefined: Self = StObject.set(x, "errorLowField", js.undefined)
    
    @scala.inline
    def setExplodeField(value: String): Self = StObject.set(x, "explodeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplodeFieldUndefined: Self = StObject.set(x, "explodeField", js.undefined)
    
    @scala.inline
    def setExtremes(value: ChartSeriesItemExtremes): Self = StObject.set(x, "extremes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtremesUndefined: Self = StObject.set(x, "extremes", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setFromField(value: String): Self = StObject.set(x, "fromField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromFieldUndefined: Self = StObject.set(x, "fromField", js.undefined)
    
    @scala.inline
    def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    @scala.inline
    def setHighField(value: String): Self = StObject.set(x, "highField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighFieldUndefined: Self = StObject.set(x, "highField", js.undefined)
    
    @scala.inline
    def setHighlight(value: ChartSeriesItemHighlight): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    @scala.inline
    def setHoleSize(value: Double): Self = StObject.set(x, "holeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoleSizeUndefined: Self = StObject.set(x, "holeSize", js.undefined)
    
    @scala.inline
    def setLabels(value: ChartSeriesItemLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLine(value: String | ChartSeriesItemLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setLowField(value: String): Self = StObject.set(x, "lowField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowFieldUndefined: Self = StObject.set(x, "lowField", js.undefined)
    
    @scala.inline
    def setLowerField(value: String): Self = StObject.set(x, "lowerField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerFieldUndefined: Self = StObject.set(x, "lowerField", js.undefined)
    
    @scala.inline
    def setMargin(value: Double | ChartSeriesItemMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMarkers(value: ChartSeriesItemMarkers): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    @scala.inline
    def setMeanField(value: String): Self = StObject.set(x, "meanField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeanFieldUndefined: Self = StObject.set(x, "meanField", js.undefined)
    
    @scala.inline
    def setMedianField(value: String): Self = StObject.set(x, "medianField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedianFieldUndefined: Self = StObject.set(x, "medianField", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    @scala.inline
    def setMissingValues(value: String): Self = StObject.set(x, "missingValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingValuesUndefined: Self = StObject.set(x, "missingValues", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNeckRatio(value: Double): Self = StObject.set(x, "neckRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeckRatioUndefined: Self = StObject.set(x, "neckRatio", js.undefined)
    
    @scala.inline
    def setNegativeColor(value: String): Self = StObject.set(x, "negativeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeColorUndefined: Self = StObject.set(x, "negativeColor", js.undefined)
    
    @scala.inline
    def setNegativeValues(value: ChartSeriesItemNegativeValues): Self = StObject.set(x, "negativeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeValuesUndefined: Self = StObject.set(x, "negativeValues", js.undefined)
    
    @scala.inline
    def setNoteTextField(value: String): Self = StObject.set(x, "noteTextField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteTextFieldUndefined: Self = StObject.set(x, "noteTextField", js.undefined)
    
    @scala.inline
    def setNotes(value: ChartSeriesItemNotes): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
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
    def setOutliers(value: ChartSeriesItemOutliers): Self = StObject.set(x, "outliers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutliersField(value: String): Self = StObject.set(x, "outliersField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutliersFieldUndefined: Self = StObject.set(x, "outliersField", js.undefined)
    
    @scala.inline
    def setOutliersUndefined: Self = StObject.set(x, "outliers", js.undefined)
    
    @scala.inline
    def setOverlay(value: ChartSeriesItemOverlay): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setQ1Field(value: String): Self = StObject.set(x, "q1Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ1FieldUndefined: Self = StObject.set(x, "q1Field", js.undefined)
    
    @scala.inline
    def setQ3Field(value: String): Self = StObject.set(x, "q3Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ3FieldUndefined: Self = StObject.set(x, "q3Field", js.undefined)
    
    @scala.inline
    def setSegmentSpacing(value: Double): Self = StObject.set(x, "segmentSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentSpacingUndefined: Self = StObject.set(x, "segmentSpacing", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeField(value: String): Self = StObject.set(x, "sizeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeFieldUndefined: Self = StObject.set(x, "sizeField", js.undefined)
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    @scala.inline
    def setStack(value: Boolean | String | ChartSeriesItemStack): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
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
    def setSummaryField(value: String): Self = StObject.set(x, "summaryField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryFieldUndefined: Self = StObject.set(x, "summaryField", js.undefined)
    
    @scala.inline
    def setTarget(value: ChartSeriesItemTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetField(value: String): Self = StObject.set(x, "targetField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFieldUndefined: Self = StObject.set(x, "targetField", js.undefined)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setToField(value: String): Self = StObject.set(x, "toField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToFieldUndefined: Self = StObject.set(x, "toField", js.undefined)
    
    @scala.inline
    def setTooltip(value: ChartSeriesItemTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpperField(value: String): Self = StObject.set(x, "upperField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperFieldUndefined: Self = StObject.set(x, "upperField", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleInLegend(value: Boolean): Self = StObject.set(x, "visibleInLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleInLegendField(value: String): Self = StObject.set(x, "visibleInLegendField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleInLegendFieldUndefined: Self = StObject.set(x, "visibleInLegendField", js.undefined)
    
    @scala.inline
    def setVisibleInLegendUndefined: Self = StObject.set(x, "visibleInLegend", js.undefined)
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setVisual(value: js.Function): Self = StObject.set(x, "visual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualUndefined: Self = StObject.set(x, "visual", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setXAxis(value: String): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    @scala.inline
    def setXErrorHighField(value: String): Self = StObject.set(x, "xErrorHighField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXErrorHighFieldUndefined: Self = StObject.set(x, "xErrorHighField", js.undefined)
    
    @scala.inline
    def setXErrorLowField(value: String): Self = StObject.set(x, "xErrorLowField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXErrorLowFieldUndefined: Self = StObject.set(x, "xErrorLowField", js.undefined)
    
    @scala.inline
    def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXFieldUndefined: Self = StObject.set(x, "xField", js.undefined)
    
    @scala.inline
    def setYAxis(value: String): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
    
    @scala.inline
    def setYErrorHighField(value: String): Self = StObject.set(x, "yErrorHighField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYErrorHighFieldUndefined: Self = StObject.set(x, "yErrorHighField", js.undefined)
    
    @scala.inline
    def setYErrorLowField(value: String): Self = StObject.set(x, "yErrorLowField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYErrorLowFieldUndefined: Self = StObject.set(x, "yErrorLowField", js.undefined)
    
    @scala.inline
    def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYFieldUndefined: Self = StObject.set(x, "yField", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
