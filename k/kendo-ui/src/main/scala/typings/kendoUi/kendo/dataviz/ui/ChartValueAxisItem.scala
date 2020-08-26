package typings.kendoUi.kendo.dataviz.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartValueAxisItem extends js.Object {
  var axisCrossingValue: js.UndefOr[js.Any | Date] = js.native
  var background: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var crosshair: js.UndefOr[ChartValueAxisItemCrosshair] = js.native
  var labels: js.UndefOr[ChartValueAxisItemLabels] = js.native
  var line: js.UndefOr[ChartValueAxisItemLine] = js.native
  var majorGridLines: js.UndefOr[ChartValueAxisItemMajorGridLines] = js.native
  var majorTicks: js.UndefOr[ChartValueAxisItemMajorTicks] = js.native
  var majorUnit: js.UndefOr[Double] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var minorGridLines: js.UndefOr[ChartValueAxisItemMinorGridLines] = js.native
  var minorTicks: js.UndefOr[ChartValueAxisItemMinorTicks] = js.native
  var minorUnit: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var narrowRange: js.UndefOr[Boolean] = js.native
  var notes: js.UndefOr[ChartValueAxisItemNotes] = js.native
  var pane: js.UndefOr[String] = js.native
  var plotBands: js.UndefOr[js.Array[ChartValueAxisItemPlotBand]] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[ChartValueAxisItemTitle] = js.native
  var `type`: js.UndefOr[String] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object ChartValueAxisItem {
  @scala.inline
  def apply(): ChartValueAxisItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartValueAxisItem]
  }
  @scala.inline
  implicit class ChartValueAxisItemOps[Self <: ChartValueAxisItem] (val x: Self) extends AnyVal {
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
    def setAxisCrossingValue(value: js.Any | Date): Self = this.set("axisCrossingValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisCrossingValue: Self = this.set("axisCrossingValue", js.undefined)
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCrosshair(value: ChartValueAxisItemCrosshair): Self = this.set("crosshair", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrosshair: Self = this.set("crosshair", js.undefined)
    @scala.inline
    def setLabels(value: ChartValueAxisItemLabels): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLine(value: ChartValueAxisItemLine): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setMajorGridLines(value: ChartValueAxisItemMajorGridLines): Self = this.set("majorGridLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorGridLines: Self = this.set("majorGridLines", js.undefined)
    @scala.inline
    def setMajorTicks(value: ChartValueAxisItemMajorTicks): Self = this.set("majorTicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorTicks: Self = this.set("majorTicks", js.undefined)
    @scala.inline
    def setMajorUnit(value: Double): Self = this.set("majorUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorUnit: Self = this.set("majorUnit", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinorGridLines(value: ChartValueAxisItemMinorGridLines): Self = this.set("minorGridLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorGridLines: Self = this.set("minorGridLines", js.undefined)
    @scala.inline
    def setMinorTicks(value: ChartValueAxisItemMinorTicks): Self = this.set("minorTicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorTicks: Self = this.set("minorTicks", js.undefined)
    @scala.inline
    def setMinorUnit(value: Double): Self = this.set("minorUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorUnit: Self = this.set("minorUnit", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNarrowRange(value: Boolean): Self = this.set("narrowRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNarrowRange: Self = this.set("narrowRange", js.undefined)
    @scala.inline
    def setNotes(value: ChartValueAxisItemNotes): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    @scala.inline
    def setPane(value: String): Self = this.set("pane", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePane: Self = this.set("pane", js.undefined)
    @scala.inline
    def setPlotBandsVarargs(value: ChartValueAxisItemPlotBand*): Self = this.set("plotBands", js.Array(value :_*))
    @scala.inline
    def setPlotBands(value: js.Array[ChartValueAxisItemPlotBand]): Self = this.set("plotBands", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlotBands: Self = this.set("plotBands", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    @scala.inline
    def setTitle(value: ChartValueAxisItemTitle): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

