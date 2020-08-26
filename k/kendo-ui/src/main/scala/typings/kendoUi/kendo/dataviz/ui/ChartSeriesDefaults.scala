package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartSeriesDefaults extends js.Object {
  var area: js.UndefOr[js.Any] = js.native
  var bar: js.UndefOr[js.Any] = js.native
  var border: js.UndefOr[ChartSeriesDefaultsBorder] = js.native
  var bubble: js.UndefOr[js.Any] = js.native
  var candlestick: js.UndefOr[js.Any] = js.native
  var column: js.UndefOr[js.Any] = js.native
  var donut: js.UndefOr[js.Any] = js.native
  var gap: js.UndefOr[Double] = js.native
  var labels: js.UndefOr[ChartSeriesDefaultsLabels] = js.native
  var line: js.UndefOr[js.Any] = js.native
  var notes: js.UndefOr[ChartSeriesDefaultsNotes] = js.native
  var ohlc: js.UndefOr[js.Any] = js.native
  var overlay: js.UndefOr[ChartSeriesDefaultsOverlay] = js.native
  var pie: js.UndefOr[js.Any] = js.native
  var rangeArea: js.UndefOr[js.Any] = js.native
  var scatter: js.UndefOr[js.Any] = js.native
  var scatterLine: js.UndefOr[js.Any] = js.native
  var spacing: js.UndefOr[Double] = js.native
  var stack: js.UndefOr[Boolean | ChartSeriesDefaultsStack] = js.native
  var tooltip: js.UndefOr[ChartSeriesDefaultsTooltip] = js.native
  var `type`: js.UndefOr[String] = js.native
  var verticalArea: js.UndefOr[js.Any] = js.native
  var verticalLine: js.UndefOr[js.Any] = js.native
  var verticalRangeArea: js.UndefOr[js.Any] = js.native
  var visual: js.UndefOr[js.Function] = js.native
}

object ChartSeriesDefaults {
  @scala.inline
  def apply(): ChartSeriesDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesDefaults]
  }
  @scala.inline
  implicit class ChartSeriesDefaultsOps[Self <: ChartSeriesDefaults] (val x: Self) extends AnyVal {
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
    def setArea(value: js.Any): Self = this.set("area", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    @scala.inline
    def setBar(value: js.Any): Self = this.set("bar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBar: Self = this.set("bar", js.undefined)
    @scala.inline
    def setBorder(value: ChartSeriesDefaultsBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setBubble(value: js.Any): Self = this.set("bubble", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubble: Self = this.set("bubble", js.undefined)
    @scala.inline
    def setCandlestick(value: js.Any): Self = this.set("candlestick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCandlestick: Self = this.set("candlestick", js.undefined)
    @scala.inline
    def setColumn(value: js.Any): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setDonut(value: js.Any): Self = this.set("donut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDonut: Self = this.set("donut", js.undefined)
    @scala.inline
    def setGap(value: Double): Self = this.set("gap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    @scala.inline
    def setLabels(value: ChartSeriesDefaultsLabels): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLine(value: js.Any): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setNotes(value: ChartSeriesDefaultsNotes): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    @scala.inline
    def setOhlc(value: js.Any): Self = this.set("ohlc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOhlc: Self = this.set("ohlc", js.undefined)
    @scala.inline
    def setOverlay(value: ChartSeriesDefaultsOverlay): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setPie(value: js.Any): Self = this.set("pie", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePie: Self = this.set("pie", js.undefined)
    @scala.inline
    def setRangeArea(value: js.Any): Self = this.set("rangeArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeArea: Self = this.set("rangeArea", js.undefined)
    @scala.inline
    def setScatter(value: js.Any): Self = this.set("scatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScatter: Self = this.set("scatter", js.undefined)
    @scala.inline
    def setScatterLine(value: js.Any): Self = this.set("scatterLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScatterLine: Self = this.set("scatterLine", js.undefined)
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    @scala.inline
    def setStack(value: Boolean | ChartSeriesDefaultsStack): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    @scala.inline
    def setTooltip(value: ChartSeriesDefaultsTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVerticalArea(value: js.Any): Self = this.set("verticalArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalArea: Self = this.set("verticalArea", js.undefined)
    @scala.inline
    def setVerticalLine(value: js.Any): Self = this.set("verticalLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalLine: Self = this.set("verticalLine", js.undefined)
    @scala.inline
    def setVerticalRangeArea(value: js.Any): Self = this.set("verticalRangeArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalRangeArea: Self = this.set("verticalRangeArea", js.undefined)
    @scala.inline
    def setVisual(value: js.Function): Self = this.set("visual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisual: Self = this.set("visual", js.undefined)
  }
  
}

