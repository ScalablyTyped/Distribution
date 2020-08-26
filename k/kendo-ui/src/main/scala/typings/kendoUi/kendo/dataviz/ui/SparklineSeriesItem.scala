package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparklineSeriesItem extends js.Object {
  var aggregate: js.UndefOr[String | js.Function] = js.native
  var axis: js.UndefOr[String] = js.native
  var border: js.UndefOr[SparklineSeriesItemBorder] = js.native
  var categoryField: js.UndefOr[String] = js.native
  var color: js.UndefOr[String | js.Function] = js.native
  var colorField: js.UndefOr[String] = js.native
  var connectors: js.UndefOr[SparklineSeriesItemConnectors] = js.native
  var currentField: js.UndefOr[String] = js.native
  var dashType: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var explodeField: js.UndefOr[String] = js.native
  var field: js.UndefOr[String] = js.native
  var gap: js.UndefOr[Double] = js.native
  var highlight: js.UndefOr[SparklineSeriesItemHighlight] = js.native
  var labels: js.UndefOr[SparklineSeriesItemLabels] = js.native
  var line: js.UndefOr[String | SparklineSeriesItemLine] = js.native
  var markers: js.UndefOr[SparklineSeriesItemMarkers] = js.native
  var missingValues: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var negativeColor: js.UndefOr[String] = js.native
  var notes: js.UndefOr[SparklineSeriesItemNotes] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var overlay: js.UndefOr[SparklineSeriesItemOverlay] = js.native
  var padding: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
  var spacing: js.UndefOr[Double] = js.native
  var stack: js.UndefOr[Boolean | String | SparklineSeriesItemStack] = js.native
  var startAngle: js.UndefOr[Double] = js.native
  var style: js.UndefOr[String] = js.native
  var target: js.UndefOr[SparklineSeriesItemTarget] = js.native
  var targetField: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[SparklineSeriesItemTooltip] = js.native
  var `type`: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object SparklineSeriesItem {
  @scala.inline
  def apply(): SparklineSeriesItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineSeriesItem]
  }
  @scala.inline
  implicit class SparklineSeriesItemOps[Self <: SparklineSeriesItem] (val x: Self) extends AnyVal {
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
    def setBorder(value: SparklineSeriesItemBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setCategoryField(value: String): Self = this.set("categoryField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryField: Self = this.set("categoryField", js.undefined)
    @scala.inline
    def setColor(value: String | js.Function): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColorField(value: String): Self = this.set("colorField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorField: Self = this.set("colorField", js.undefined)
    @scala.inline
    def setConnectors(value: SparklineSeriesItemConnectors): Self = this.set("connectors", value.asInstanceOf[js.Any])
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
    def setExplodeField(value: String): Self = this.set("explodeField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplodeField: Self = this.set("explodeField", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setGap(value: Double): Self = this.set("gap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    @scala.inline
    def setHighlight(value: SparklineSeriesItemHighlight): Self = this.set("highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    @scala.inline
    def setLabels(value: SparklineSeriesItemLabels): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLine(value: String | SparklineSeriesItemLine): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setMarkers(value: SparklineSeriesItemMarkers): Self = this.set("markers", value.asInstanceOf[js.Any])
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
    def setNotes(value: SparklineSeriesItemNotes): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOverlay(value: SparklineSeriesItemOverlay): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    @scala.inline
    def setStack(value: Boolean | String | SparklineSeriesItemStack): Self = this.set("stack", value.asInstanceOf[js.Any])
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
    def setTarget(value: SparklineSeriesItemTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTargetField(value: String): Self = this.set("targetField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetField: Self = this.set("targetField", js.undefined)
    @scala.inline
    def setTooltip(value: SparklineSeriesItemTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
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

