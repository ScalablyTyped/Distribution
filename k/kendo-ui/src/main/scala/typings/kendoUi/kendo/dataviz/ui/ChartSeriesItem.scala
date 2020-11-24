package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSeriesItem extends js.Object {
  
  var aggregate: js.UndefOr[String | js.Function] = js.native
  
  var axis: js.UndefOr[String] = js.native
  
  var border: js.UndefOr[ChartSeriesItemBorder] = js.native
  
  var categoryAxis: js.UndefOr[String] = js.native
  
  var categoryField: js.UndefOr[String] = js.native
  
  var closeField: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String | js.Function] = js.native
  
  var colorField: js.UndefOr[String] = js.native
  
  var connectors: js.UndefOr[ChartSeriesItemConnectors] = js.native
  
  var currentField: js.UndefOr[String] = js.native
  
  var dashType: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var downColor: js.UndefOr[String | js.Function] = js.native
  
  var downColorField: js.UndefOr[String] = js.native
  
  var dynamicHeight: js.UndefOr[Boolean] = js.native
  
  var dynamicSlope: js.UndefOr[Boolean] = js.native
  
  var errorBars: js.UndefOr[ChartSeriesItemErrorBars] = js.native
  
  var errorHighField: js.UndefOr[String] = js.native
  
  var errorLowField: js.UndefOr[String] = js.native
  
  var explodeField: js.UndefOr[String] = js.native
  
  var extremes: js.UndefOr[ChartSeriesItemExtremes] = js.native
  
  var field: js.UndefOr[String] = js.native
  
  var fromField: js.UndefOr[String] = js.native
  
  var gap: js.UndefOr[Double] = js.native
  
  var highField: js.UndefOr[String] = js.native
  
  var highlight: js.UndefOr[ChartSeriesItemHighlight] = js.native
  
  var holeSize: js.UndefOr[Double] = js.native
  
  var labels: js.UndefOr[ChartSeriesItemLabels] = js.native
  
  var line: js.UndefOr[String | ChartSeriesItemLine] = js.native
  
  var lowField: js.UndefOr[String] = js.native
  
  var lowerField: js.UndefOr[String] = js.native
  
  var margin: js.UndefOr[Double | ChartSeriesItemMargin] = js.native
  
  var markers: js.UndefOr[ChartSeriesItemMarkers] = js.native
  
  var maxSize: js.UndefOr[Double] = js.native
  
  var meanField: js.UndefOr[String] = js.native
  
  var medianField: js.UndefOr[String] = js.native
  
  var minSize: js.UndefOr[Double] = js.native
  
  var missingValues: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var neckRatio: js.UndefOr[Double] = js.native
  
  var negativeColor: js.UndefOr[String] = js.native
  
  var negativeValues: js.UndefOr[ChartSeriesItemNegativeValues] = js.native
  
  var noteTextField: js.UndefOr[String] = js.native
  
  var notes: js.UndefOr[ChartSeriesItemNotes] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var openField: js.UndefOr[String] = js.native
  
  var outliers: js.UndefOr[ChartSeriesItemOutliers] = js.native
  
  var outliersField: js.UndefOr[String] = js.native
  
  var overlay: js.UndefOr[ChartSeriesItemOverlay] = js.native
  
  var padding: js.UndefOr[Double] = js.native
  
  var q1Field: js.UndefOr[String] = js.native
  
  var q3Field: js.UndefOr[String] = js.native
  
  var segmentSpacing: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var sizeField: js.UndefOr[String] = js.native
  
  var spacing: js.UndefOr[Double] = js.native
  
  var stack: js.UndefOr[Boolean | String | ChartSeriesItemStack] = js.native
  
  var startAngle: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[String] = js.native
  
  var summaryField: js.UndefOr[String] = js.native
  
  var target: js.UndefOr[ChartSeriesItemTarget] = js.native
  
  var targetField: js.UndefOr[String] = js.native
  
  var toField: js.UndefOr[String] = js.native
  
  var tooltip: js.UndefOr[ChartSeriesItemTooltip] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var upperField: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var visibleInLegend: js.UndefOr[Boolean] = js.native
  
  var visibleInLegendField: js.UndefOr[String] = js.native
  
  var visual: js.UndefOr[js.Function] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var xAxis: js.UndefOr[String] = js.native
  
  var xErrorHighField: js.UndefOr[String] = js.native
  
  var xErrorLowField: js.UndefOr[String] = js.native
  
  var xField: js.UndefOr[String] = js.native
  
  var yAxis: js.UndefOr[String] = js.native
  
  var yErrorHighField: js.UndefOr[String] = js.native
  
  var yErrorLowField: js.UndefOr[String] = js.native
  
  var yField: js.UndefOr[String] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object ChartSeriesItem {
  
  @scala.inline
  def apply(): ChartSeriesItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItem]
  }
  
  @scala.inline
  implicit class ChartSeriesItemOps[Self <: ChartSeriesItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAggregate(value: String | js.Function): Self = this.set("aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregate: Self = this.set("aggregate", js.undefined)
    
    @scala.inline
    def setAxis(value: String): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setBorder(value: ChartSeriesItemBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setCategoryAxis(value: String): Self = this.set("categoryAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryAxis: Self = this.set("categoryAxis", js.undefined)
    
    @scala.inline
    def setCategoryField(value: String): Self = this.set("categoryField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryField: Self = this.set("categoryField", js.undefined)
    
    @scala.inline
    def setCloseField(value: String): Self = this.set("closeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseField: Self = this.set("closeField", js.undefined)
    
    @scala.inline
    def setColor(value: String | js.Function): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorField(value: String): Self = this.set("colorField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorField: Self = this.set("colorField", js.undefined)
    
    @scala.inline
    def setConnectors(value: ChartSeriesItemConnectors): Self = this.set("connectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectors: Self = this.set("connectors", js.undefined)
    
    @scala.inline
    def setCurrentField(value: String): Self = this.set("currentField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentField: Self = this.set("currentField", js.undefined)
    
    @scala.inline
    def setDashType(value: String): Self = this.set("dashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashType: Self = this.set("dashType", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDownColor(value: String | js.Function): Self = this.set("downColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownColor: Self = this.set("downColor", js.undefined)
    
    @scala.inline
    def setDownColorField(value: String): Self = this.set("downColorField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownColorField: Self = this.set("downColorField", js.undefined)
    
    @scala.inline
    def setDynamicHeight(value: Boolean): Self = this.set("dynamicHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicHeight: Self = this.set("dynamicHeight", js.undefined)
    
    @scala.inline
    def setDynamicSlope(value: Boolean): Self = this.set("dynamicSlope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicSlope: Self = this.set("dynamicSlope", js.undefined)
    
    @scala.inline
    def setErrorBars(value: ChartSeriesItemErrorBars): Self = this.set("errorBars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorBars: Self = this.set("errorBars", js.undefined)
    
    @scala.inline
    def setErrorHighField(value: String): Self = this.set("errorHighField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorHighField: Self = this.set("errorHighField", js.undefined)
    
    @scala.inline
    def setErrorLowField(value: String): Self = this.set("errorLowField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorLowField: Self = this.set("errorLowField", js.undefined)
    
    @scala.inline
    def setExplodeField(value: String): Self = this.set("explodeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplodeField: Self = this.set("explodeField", js.undefined)
    
    @scala.inline
    def setExtremes(value: ChartSeriesItemExtremes): Self = this.set("extremes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtremes: Self = this.set("extremes", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setFromField(value: String): Self = this.set("fromField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromField: Self = this.set("fromField", js.undefined)
    
    @scala.inline
    def setGap(value: Double): Self = this.set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    
    @scala.inline
    def setHighField(value: String): Self = this.set("highField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighField: Self = this.set("highField", js.undefined)
    
    @scala.inline
    def setHighlight(value: ChartSeriesItemHighlight): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    
    @scala.inline
    def setHoleSize(value: Double): Self = this.set("holeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoleSize: Self = this.set("holeSize", js.undefined)
    
    @scala.inline
    def setLabels(value: ChartSeriesItemLabels): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLine(value: String | ChartSeriesItemLine): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setLowField(value: String): Self = this.set("lowField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowField: Self = this.set("lowField", js.undefined)
    
    @scala.inline
    def setLowerField(value: String): Self = this.set("lowerField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerField: Self = this.set("lowerField", js.undefined)
    
    @scala.inline
    def setMargin(value: Double | ChartSeriesItemMargin): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMarkers(value: ChartSeriesItemMarkers): Self = this.set("markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkers: Self = this.set("markers", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setMeanField(value: String): Self = this.set("meanField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeanField: Self = this.set("meanField", js.undefined)
    
    @scala.inline
    def setMedianField(value: String): Self = this.set("medianField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedianField: Self = this.set("medianField", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    
    @scala.inline
    def setMissingValues(value: String): Self = this.set("missingValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissingValues: Self = this.set("missingValues", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNeckRatio(value: Double): Self = this.set("neckRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeckRatio: Self = this.set("neckRatio", js.undefined)
    
    @scala.inline
    def setNegativeColor(value: String): Self = this.set("negativeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegativeColor: Self = this.set("negativeColor", js.undefined)
    
    @scala.inline
    def setNegativeValues(value: ChartSeriesItemNegativeValues): Self = this.set("negativeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegativeValues: Self = this.set("negativeValues", js.undefined)
    
    @scala.inline
    def setNoteTextField(value: String): Self = this.set("noteTextField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoteTextField: Self = this.set("noteTextField", js.undefined)
    
    @scala.inline
    def setNotes(value: ChartSeriesItemNotes): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setOpenField(value: String): Self = this.set("openField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenField: Self = this.set("openField", js.undefined)
    
    @scala.inline
    def setOutliers(value: ChartSeriesItemOutliers): Self = this.set("outliers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutliers: Self = this.set("outliers", js.undefined)
    
    @scala.inline
    def setOutliersField(value: String): Self = this.set("outliersField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutliersField: Self = this.set("outliersField", js.undefined)
    
    @scala.inline
    def setOverlay(value: ChartSeriesItemOverlay): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setQ1Field(value: String): Self = this.set("q1Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ1Field: Self = this.set("q1Field", js.undefined)
    
    @scala.inline
    def setQ3Field(value: String): Self = this.set("q3Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ3Field: Self = this.set("q3Field", js.undefined)
    
    @scala.inline
    def setSegmentSpacing(value: Double): Self = this.set("segmentSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentSpacing: Self = this.set("segmentSpacing", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSizeField(value: String): Self = this.set("sizeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeField: Self = this.set("sizeField", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    
    @scala.inline
    def setStack(value: Boolean | String | ChartSeriesItemStack): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSummaryField(value: String): Self = this.set("summaryField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaryField: Self = this.set("summaryField", js.undefined)
    
    @scala.inline
    def setTarget(value: ChartSeriesItemTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetField(value: String): Self = this.set("targetField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetField: Self = this.set("targetField", js.undefined)
    
    @scala.inline
    def setToField(value: String): Self = this.set("toField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToField: Self = this.set("toField", js.undefined)
    
    @scala.inline
    def setTooltip(value: ChartSeriesItemTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUpperField(value: String): Self = this.set("upperField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpperField: Self = this.set("upperField", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setVisibleInLegend(value: Boolean): Self = this.set("visibleInLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleInLegend: Self = this.set("visibleInLegend", js.undefined)
    
    @scala.inline
    def setVisibleInLegendField(value: String): Self = this.set("visibleInLegendField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleInLegendField: Self = this.set("visibleInLegendField", js.undefined)
    
    @scala.inline
    def setVisual(value: js.Function): Self = this.set("visual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisual: Self = this.set("visual", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setXAxis(value: String): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxis: Self = this.set("xAxis", js.undefined)
    
    @scala.inline
    def setXErrorHighField(value: String): Self = this.set("xErrorHighField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXErrorHighField: Self = this.set("xErrorHighField", js.undefined)
    
    @scala.inline
    def setXErrorLowField(value: String): Self = this.set("xErrorLowField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXErrorLowField: Self = this.set("xErrorLowField", js.undefined)
    
    @scala.inline
    def setXField(value: String): Self = this.set("xField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXField: Self = this.set("xField", js.undefined)
    
    @scala.inline
    def setYAxis(value: String): Self = this.set("yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxis: Self = this.set("yAxis", js.undefined)
    
    @scala.inline
    def setYErrorHighField(value: String): Self = this.set("yErrorHighField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYErrorHighField: Self = this.set("yErrorHighField", js.undefined)
    
    @scala.inline
    def setYErrorLowField(value: String): Self = this.set("yErrorLowField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYErrorLowField: Self = this.set("yErrorLowField", js.undefined)
    
    @scala.inline
    def setYField(value: String): Self = this.set("yField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYField: Self = this.set("yField", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
