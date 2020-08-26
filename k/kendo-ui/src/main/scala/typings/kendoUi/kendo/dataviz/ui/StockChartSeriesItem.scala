package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockChartSeriesItem extends js.Object {
  var aggregate: js.UndefOr[String | js.Function] = js.native
  var axis: js.UndefOr[String] = js.native
  var border: js.UndefOr[StockChartSeriesItemBorder] = js.native
  var categoryField: js.UndefOr[String] = js.native
  var closeField: js.UndefOr[String] = js.native
  var color: js.UndefOr[String | js.Function] = js.native
  var colorField: js.UndefOr[String] = js.native
  var currentField: js.UndefOr[String] = js.native
  var dashType: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var downColor: js.UndefOr[String | js.Function] = js.native
  var downColorField: js.UndefOr[String] = js.native
  var field: js.UndefOr[String] = js.native
  var gap: js.UndefOr[Double] = js.native
  var highField: js.UndefOr[String] = js.native
  var highlight: js.UndefOr[StockChartSeriesItemHighlight] = js.native
  var labels: js.UndefOr[StockChartSeriesItemLabels] = js.native
  var line: js.UndefOr[String | StockChartSeriesItemLine] = js.native
  var lowField: js.UndefOr[String] = js.native
  var markers: js.UndefOr[StockChartSeriesItemMarkers] = js.native
  var missingValues: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var negativeColor: js.UndefOr[String] = js.native
  var notes: js.UndefOr[StockChartSeriesItemNotes] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var openField: js.UndefOr[String] = js.native
  var overlay: js.UndefOr[StockChartSeriesItemOverlay] = js.native
  var spacing: js.UndefOr[Double] = js.native
  var stack: js.UndefOr[Boolean | String | StockChartSeriesItemStack] = js.native
  var style: js.UndefOr[String] = js.native
  var target: js.UndefOr[StockChartSeriesItemTarget] = js.native
  var targetField: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[StockChartSeriesItemTooltip] = js.native
  var `type`: js.UndefOr[String] = js.native
  var visibleInLegend: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object StockChartSeriesItem {
  @scala.inline
  def apply(): StockChartSeriesItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartSeriesItem]
  }
  @scala.inline
  implicit class StockChartSeriesItemOps[Self <: StockChartSeriesItem] (val x: Self) extends AnyVal {
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
    def setBorder(value: StockChartSeriesItemBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setGap(value: Double): Self = this.set("gap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    @scala.inline
    def setHighField(value: String): Self = this.set("highField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighField: Self = this.set("highField", js.undefined)
    @scala.inline
    def setHighlight(value: StockChartSeriesItemHighlight): Self = this.set("highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    @scala.inline
    def setLabels(value: StockChartSeriesItemLabels): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLine(value: String | StockChartSeriesItemLine): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setLowField(value: String): Self = this.set("lowField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowField: Self = this.set("lowField", js.undefined)
    @scala.inline
    def setMarkers(value: StockChartSeriesItemMarkers): Self = this.set("markers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkers: Self = this.set("markers", js.undefined)
    @scala.inline
    def setMissingValues(value: String): Self = this.set("missingValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissingValues: Self = this.set("missingValues", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNegativeColor(value: String): Self = this.set("negativeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeColor: Self = this.set("negativeColor", js.undefined)
    @scala.inline
    def setNotes(value: StockChartSeriesItemNotes): Self = this.set("notes", value.asInstanceOf[js.Any])
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
    def setOverlay(value: StockChartSeriesItemOverlay): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    @scala.inline
    def setStack(value: Boolean | String | StockChartSeriesItemStack): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTarget(value: StockChartSeriesItemTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTargetField(value: String): Self = this.set("targetField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetField: Self = this.set("targetField", js.undefined)
    @scala.inline
    def setTooltip(value: StockChartSeriesItemTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisibleInLegend(value: Boolean): Self = this.set("visibleInLegend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleInLegend: Self = this.set("visibleInLegend", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

