package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartAxisDefaults extends StObject {
  
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
  implicit class ChartAxisDefaultsMutableBuilder[Self <: ChartAxisDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCrosshair(value: ChartAxisDefaultsCrosshair): Self = StObject.set(x, "crosshair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairUndefined: Self = StObject.set(x, "crosshair", js.undefined)
    
    @scala.inline
    def setLabels(value: ChartAxisDefaultsLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLine(value: ChartAxisDefaultsLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setMajorGridLines(value: ChartAxisDefaultsMajorGridLines): Self = StObject.set(x, "majorGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorGridLinesUndefined: Self = StObject.set(x, "majorGridLines", js.undefined)
    
    @scala.inline
    def setMajorTicks(value: ChartAxisDefaultsMajorTicks): Self = StObject.set(x, "majorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorTicksUndefined: Self = StObject.set(x, "majorTicks", js.undefined)
    
    @scala.inline
    def setMinorGridLines(value: ChartAxisDefaultsMinorGridLines): Self = StObject.set(x, "minorGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorGridLinesUndefined: Self = StObject.set(x, "minorGridLines", js.undefined)
    
    @scala.inline
    def setMinorTicks(value: ChartAxisDefaultsMinorTicks): Self = StObject.set(x, "minorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTicksUndefined: Self = StObject.set(x, "minorTicks", js.undefined)
    
    @scala.inline
    def setNarrowRange(value: Boolean): Self = StObject.set(x, "narrowRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNarrowRangeUndefined: Self = StObject.set(x, "narrowRange", js.undefined)
    
    @scala.inline
    def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    @scala.inline
    def setPlotBands(value: js.Array[ChartAxisDefaultsPlotBand]): Self = StObject.set(x, "plotBands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotBandsUndefined: Self = StObject.set(x, "plotBands", js.undefined)
    
    @scala.inline
    def setPlotBandsVarargs(value: ChartAxisDefaultsPlotBand*): Self = StObject.set(x, "plotBands", js.Array(value :_*))
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    @scala.inline
    def setTitle(value: ChartAxisDefaultsTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
