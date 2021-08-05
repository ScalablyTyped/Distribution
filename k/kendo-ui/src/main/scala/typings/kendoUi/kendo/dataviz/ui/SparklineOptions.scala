package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineOptions extends StObject {
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var axisDefaults: js.UndefOr[js.Any] = js.undefined
  
  var axisLabelClick: js.UndefOr[js.Function1[/* e */ SparklineAxisLabelClickEvent, Unit]] = js.undefined
  
  var categoryAxis: js.UndefOr[SparklineCategoryAxisItem | js.Array[SparklineCategoryAxisItem]] = js.undefined
  
  var chartArea: js.UndefOr[SparklineChartArea] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ SparklineEvent, Unit]] = js.undefined
  
  var dataSource: js.UndefOr[js.Any] = js.undefined
  
  var drag: js.UndefOr[js.Function1[/* e */ SparklineDragEvent, Unit]] = js.undefined
  
  var dragEnd: js.UndefOr[js.Function1[/* e */ SparklineDragEndEvent, Unit]] = js.undefined
  
  var dragStart: js.UndefOr[js.Function1[/* e */ SparklineDragStartEvent, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var paneRender: js.UndefOr[js.Function1[/* e */ SparklinePaneRenderEvent, Unit]] = js.undefined
  
  var plotArea: js.UndefOr[SparklinePlotArea] = js.undefined
  
  var plotAreaClick: js.UndefOr[js.Function1[/* e */ SparklinePlotAreaClickEvent, Unit]] = js.undefined
  
  var plotAreaHover: js.UndefOr[js.Function1[/* e */ SparklinePlotAreaHoverEvent, Unit]] = js.undefined
  
  var plotAreaLeave: js.UndefOr[js.Function1[/* e */ SparklinePlotAreaLeaveEvent, Unit]] = js.undefined
  
  var pointWidth: js.UndefOr[Double] = js.undefined
  
  var renderAs: js.UndefOr[String] = js.undefined
  
  var series: js.UndefOr[js.Array[SparklineSeriesItem]] = js.undefined
  
  var seriesClick: js.UndefOr[js.Function1[/* e */ SparklineSeriesClickEvent, Unit]] = js.undefined
  
  var seriesColors: js.UndefOr[js.Any] = js.undefined
  
  var seriesDefaults: js.UndefOr[SparklineSeriesDefaults] = js.undefined
  
  var seriesHover: js.UndefOr[js.Function1[/* e */ SparklineSeriesHoverEvent, Unit]] = js.undefined
  
  var seriesLeave: js.UndefOr[js.Function1[/* e */ SparklineSeriesLeaveEvent, Unit]] = js.undefined
  
  var seriesOver: js.UndefOr[js.Function1[/* e */ SparklineSeriesOverEvent, Unit]] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  var tooltip: js.UndefOr[SparklineTooltip] = js.undefined
  
  var transitions: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var valueAxis: js.UndefOr[SparklineValueAxisItem | js.Array[SparklineValueAxisItem]] = js.undefined
  
  var zoom: js.UndefOr[js.Function1[/* e */ SparklineZoomEvent, Unit]] = js.undefined
  
  var zoomEnd: js.UndefOr[js.Function1[/* e */ SparklineZoomEndEvent, Unit]] = js.undefined
  
  var zoomStart: js.UndefOr[js.Function1[/* e */ SparklineZoomStartEvent, Unit]] = js.undefined
}
object SparklineOptions {
  
  inline def apply(): SparklineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineOptions]
  }
  
  extension [Self <: SparklineOptions](x: Self) {
    
    inline def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    inline def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    inline def setAxisDefaults(value: js.Any): Self = StObject.set(x, "axisDefaults", value.asInstanceOf[js.Any])
    
    inline def setAxisDefaultsUndefined: Self = StObject.set(x, "axisDefaults", js.undefined)
    
    inline def setAxisLabelClick(value: /* e */ SparklineAxisLabelClickEvent => Unit): Self = StObject.set(x, "axisLabelClick", js.Any.fromFunction1(value))
    
    inline def setAxisLabelClickUndefined: Self = StObject.set(x, "axisLabelClick", js.undefined)
    
    inline def setCategoryAxis(value: SparklineCategoryAxisItem | js.Array[SparklineCategoryAxisItem]): Self = StObject.set(x, "categoryAxis", value.asInstanceOf[js.Any])
    
    inline def setCategoryAxisUndefined: Self = StObject.set(x, "categoryAxis", js.undefined)
    
    inline def setCategoryAxisVarargs(value: SparklineCategoryAxisItem*): Self = StObject.set(x, "categoryAxis", js.Array(value :_*))
    
    inline def setChartArea(value: SparklineChartArea): Self = StObject.set(x, "chartArea", value.asInstanceOf[js.Any])
    
    inline def setChartAreaUndefined: Self = StObject.set(x, "chartArea", js.undefined)
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataBound(value: /* e */ SparklineEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDrag(value: /* e */ SparklineDragEvent => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    inline def setDragEnd(value: /* e */ SparklineDragEndEvent => Unit): Self = StObject.set(x, "dragEnd", js.Any.fromFunction1(value))
    
    inline def setDragEndUndefined: Self = StObject.set(x, "dragEnd", js.undefined)
    
    inline def setDragStart(value: /* e */ SparklineDragStartEvent => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction1(value))
    
    inline def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPaneRender(value: /* e */ SparklinePaneRenderEvent => Unit): Self = StObject.set(x, "paneRender", js.Any.fromFunction1(value))
    
    inline def setPaneRenderUndefined: Self = StObject.set(x, "paneRender", js.undefined)
    
    inline def setPlotArea(value: SparklinePlotArea): Self = StObject.set(x, "plotArea", value.asInstanceOf[js.Any])
    
    inline def setPlotAreaClick(value: /* e */ SparklinePlotAreaClickEvent => Unit): Self = StObject.set(x, "plotAreaClick", js.Any.fromFunction1(value))
    
    inline def setPlotAreaClickUndefined: Self = StObject.set(x, "plotAreaClick", js.undefined)
    
    inline def setPlotAreaHover(value: /* e */ SparklinePlotAreaHoverEvent => Unit): Self = StObject.set(x, "plotAreaHover", js.Any.fromFunction1(value))
    
    inline def setPlotAreaHoverUndefined: Self = StObject.set(x, "plotAreaHover", js.undefined)
    
    inline def setPlotAreaLeave(value: /* e */ SparklinePlotAreaLeaveEvent => Unit): Self = StObject.set(x, "plotAreaLeave", js.Any.fromFunction1(value))
    
    inline def setPlotAreaLeaveUndefined: Self = StObject.set(x, "plotAreaLeave", js.undefined)
    
    inline def setPlotAreaUndefined: Self = StObject.set(x, "plotArea", js.undefined)
    
    inline def setPointWidth(value: Double): Self = StObject.set(x, "pointWidth", value.asInstanceOf[js.Any])
    
    inline def setPointWidthUndefined: Self = StObject.set(x, "pointWidth", js.undefined)
    
    inline def setRenderAs(value: String): Self = StObject.set(x, "renderAs", value.asInstanceOf[js.Any])
    
    inline def setRenderAsUndefined: Self = StObject.set(x, "renderAs", js.undefined)
    
    inline def setSeries(value: js.Array[SparklineSeriesItem]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesClick(value: /* e */ SparklineSeriesClickEvent => Unit): Self = StObject.set(x, "seriesClick", js.Any.fromFunction1(value))
    
    inline def setSeriesClickUndefined: Self = StObject.set(x, "seriesClick", js.undefined)
    
    inline def setSeriesColors(value: js.Any): Self = StObject.set(x, "seriesColors", value.asInstanceOf[js.Any])
    
    inline def setSeriesColorsUndefined: Self = StObject.set(x, "seriesColors", js.undefined)
    
    inline def setSeriesDefaults(value: SparklineSeriesDefaults): Self = StObject.set(x, "seriesDefaults", value.asInstanceOf[js.Any])
    
    inline def setSeriesDefaultsUndefined: Self = StObject.set(x, "seriesDefaults", js.undefined)
    
    inline def setSeriesHover(value: /* e */ SparklineSeriesHoverEvent => Unit): Self = StObject.set(x, "seriesHover", js.Any.fromFunction1(value))
    
    inline def setSeriesHoverUndefined: Self = StObject.set(x, "seriesHover", js.undefined)
    
    inline def setSeriesLeave(value: /* e */ SparklineSeriesLeaveEvent => Unit): Self = StObject.set(x, "seriesLeave", js.Any.fromFunction1(value))
    
    inline def setSeriesLeaveUndefined: Self = StObject.set(x, "seriesLeave", js.undefined)
    
    inline def setSeriesOver(value: /* e */ SparklineSeriesOverEvent => Unit): Self = StObject.set(x, "seriesOver", js.Any.fromFunction1(value))
    
    inline def setSeriesOverUndefined: Self = StObject.set(x, "seriesOver", js.undefined)
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: SparklineSeriesItem*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTooltip(value: SparklineTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTransitions(value: Boolean): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValueAxis(value: SparklineValueAxisItem | js.Array[SparklineValueAxisItem]): Self = StObject.set(x, "valueAxis", value.asInstanceOf[js.Any])
    
    inline def setValueAxisUndefined: Self = StObject.set(x, "valueAxis", js.undefined)
    
    inline def setValueAxisVarargs(value: SparklineValueAxisItem*): Self = StObject.set(x, "valueAxis", js.Array(value :_*))
    
    inline def setZoom(value: /* e */ SparklineZoomEvent => Unit): Self = StObject.set(x, "zoom", js.Any.fromFunction1(value))
    
    inline def setZoomEnd(value: /* e */ SparklineZoomEndEvent => Unit): Self = StObject.set(x, "zoomEnd", js.Any.fromFunction1(value))
    
    inline def setZoomEndUndefined: Self = StObject.set(x, "zoomEnd", js.undefined)
    
    inline def setZoomStart(value: /* e */ SparklineZoomStartEvent => Unit): Self = StObject.set(x, "zoomStart", js.Any.fromFunction1(value))
    
    inline def setZoomStartUndefined: Self = StObject.set(x, "zoomStart", js.undefined)
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
