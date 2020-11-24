package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartAxisDefaults extends js.Object {
  
  var background: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var crosshair: js.UndefOr[ChartAxisDefaultsCrosshair] = js.native
  
  var labels: js.UndefOr[ChartAxisDefaultsLabels] = js.native
  
  var line: js.UndefOr[ChartAxisDefaultsLine] = js.native
  
  var majorGridLines: js.UndefOr[ChartAxisDefaultsMajorGridLines] = js.native
  
  var majorTicks: js.UndefOr[ChartAxisDefaultsMajorTicks] = js.native
  
  var minorGridLines: js.UndefOr[ChartAxisDefaultsMinorGridLines] = js.native
  
  var minorTicks: js.UndefOr[ChartAxisDefaultsMinorTicks] = js.native
  
  var narrowRange: js.UndefOr[Boolean] = js.native
  
  var pane: js.UndefOr[String] = js.native
  
  var plotBands: js.UndefOr[js.Array[ChartAxisDefaultsPlotBand]] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var startAngle: js.UndefOr[Double] = js.native
  
  var title: js.UndefOr[ChartAxisDefaultsTitle] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object ChartAxisDefaults {
  
  @scala.inline
  def apply(): ChartAxisDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisDefaults]
  }
  
  @scala.inline
  implicit class ChartAxisDefaultsOps[Self <: ChartAxisDefaults] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCrosshair(value: ChartAxisDefaultsCrosshair): Self = this.set("crosshair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrosshair: Self = this.set("crosshair", js.undefined)
    
    @scala.inline
    def setLabels(value: ChartAxisDefaultsLabels): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLine(value: ChartAxisDefaultsLine): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setMajorGridLines(value: ChartAxisDefaultsMajorGridLines): Self = this.set("majorGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorGridLines: Self = this.set("majorGridLines", js.undefined)
    
    @scala.inline
    def setMajorTicks(value: ChartAxisDefaultsMajorTicks): Self = this.set("majorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorTicks: Self = this.set("majorTicks", js.undefined)
    
    @scala.inline
    def setMinorGridLines(value: ChartAxisDefaultsMinorGridLines): Self = this.set("minorGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorGridLines: Self = this.set("minorGridLines", js.undefined)
    
    @scala.inline
    def setMinorTicks(value: ChartAxisDefaultsMinorTicks): Self = this.set("minorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTicks: Self = this.set("minorTicks", js.undefined)
    
    @scala.inline
    def setNarrowRange(value: Boolean): Self = this.set("narrowRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNarrowRange: Self = this.set("narrowRange", js.undefined)
    
    @scala.inline
    def setPane(value: String): Self = this.set("pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePane: Self = this.set("pane", js.undefined)
    
    @scala.inline
    def setPlotBandsVarargs(value: ChartAxisDefaultsPlotBand*): Self = this.set("plotBands", js.Array(value :_*))
    
    @scala.inline
    def setPlotBands(value: js.Array[ChartAxisDefaultsPlotBand]): Self = this.set("plotBands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlotBands: Self = this.set("plotBands", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    
    @scala.inline
    def setTitle(value: ChartAxisDefaultsTitle): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
