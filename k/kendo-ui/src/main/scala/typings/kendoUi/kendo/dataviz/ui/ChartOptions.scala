package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartOptions extends StObject {
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var axisDefaults: js.UndefOr[ChartAxisDefaults] = js.undefined
  
  var axisLabelClick: js.UndefOr[js.Function1[/* e */ ChartAxisLabelClickEvent, Unit]] = js.undefined
  
  var categoryAxis: js.UndefOr[ChartCategoryAxisItem | js.Array[ChartCategoryAxisItem]] = js.undefined
  
  var chartArea: js.UndefOr[ChartChartArea] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ ChartDataBoundEvent, Unit]] = js.undefined
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  
  var drag: js.UndefOr[js.Function1[/* e */ ChartDragEvent, Unit]] = js.undefined
  
  var dragEnd: js.UndefOr[js.Function1[/* e */ ChartDragEndEvent, Unit]] = js.undefined
  
  var dragStart: js.UndefOr[js.Function1[/* e */ ChartDragStartEvent, Unit]] = js.undefined
  
  var legend: js.UndefOr[ChartLegend] = js.undefined
  
  var legendItemClick: js.UndefOr[js.Function1[/* e */ ChartLegendItemClickEvent, Unit]] = js.undefined
  
  var legendItemHover: js.UndefOr[js.Function1[/* e */ ChartLegendItemHoverEvent, Unit]] = js.undefined
  
  var legendItemLeave: js.UndefOr[js.Function1[/* e */ ChartLegendItemLeaveEvent, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var noteClick: js.UndefOr[js.Function1[/* e */ ChartNoteClickEvent, Unit]] = js.undefined
  
  var noteHover: js.UndefOr[js.Function1[/* e */ ChartNoteHoverEvent, Unit]] = js.undefined
  
  var noteLeave: js.UndefOr[js.Function1[/* e */ ChartNoteLeaveEvent, Unit]] = js.undefined
  
  var paneRender: js.UndefOr[js.Function1[/* e */ ChartPaneRenderEvent, Unit]] = js.undefined
  
  var panes: js.UndefOr[js.Array[ChartPane]] = js.undefined
  
  var pannable: js.UndefOr[Boolean | ChartPannable] = js.undefined
  
  var pdf: js.UndefOr[ChartPdf] = js.undefined
  
  var persistSeriesVisibility: js.UndefOr[Boolean] = js.undefined
  
  var plotArea: js.UndefOr[ChartPlotArea] = js.undefined
  
  var plotAreaClick: js.UndefOr[js.Function1[/* e */ ChartPlotAreaClickEvent, Unit]] = js.undefined
  
  var plotAreaHover: js.UndefOr[js.Function1[/* e */ ChartPlotAreaHoverEvent, Unit]] = js.undefined
  
  var plotAreaLeave: js.UndefOr[js.Function1[/* e */ ChartPlotAreaLeaveEvent, Unit]] = js.undefined
  
  var render: js.UndefOr[js.Function1[/* e */ ChartRenderEvent, Unit]] = js.undefined
  
  var renderAs: js.UndefOr[String] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ ChartSelectEvent, Unit]] = js.undefined
  
  var selectEnd: js.UndefOr[js.Function1[/* e */ ChartSelectEndEvent, Unit]] = js.undefined
  
  var selectStart: js.UndefOr[js.Function1[/* e */ ChartSelectStartEvent, Unit]] = js.undefined
  
  var series: js.UndefOr[js.Array[ChartSeriesItem]] = js.undefined
  
  var seriesClick: js.UndefOr[js.Function1[/* e */ ChartSeriesClickEvent, Unit]] = js.undefined
  
  var seriesColors: js.UndefOr[js.Any] = js.undefined
  
  var seriesDefaults: js.UndefOr[ChartSeriesDefaults] = js.undefined
  
  var seriesHover: js.UndefOr[js.Function1[/* e */ ChartSeriesHoverEvent, Unit]] = js.undefined
  
  var seriesLeave: js.UndefOr[js.Function1[/* e */ ChartSeriesLeaveEvent, Unit]] = js.undefined
  
  var seriesOver: js.UndefOr[js.Function1[/* e */ ChartSeriesOverEvent, Unit]] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String | ChartTitle] = js.undefined
  
  var tooltip: js.UndefOr[ChartTooltip] = js.undefined
  
  var transitions: js.UndefOr[Boolean] = js.undefined
  
  var valueAxis: js.UndefOr[ChartValueAxisItem | js.Array[ChartValueAxisItem]] = js.undefined
  
  var xAxis: js.UndefOr[ChartXAxisItem | js.Array[ChartXAxisItem]] = js.undefined
  
  var yAxis: js.UndefOr[ChartYAxisItem | js.Array[ChartYAxisItem]] = js.undefined
  
  var zoom: js.UndefOr[js.Function1[/* e */ ChartZoomEvent, Unit]] = js.undefined
  
  var zoomEnd: js.UndefOr[js.Function1[/* e */ ChartZoomEndEvent, Unit]] = js.undefined
  
  var zoomStart: js.UndefOr[js.Function1[/* e */ ChartZoomStartEvent, Unit]] = js.undefined
  
  var zoomable: js.UndefOr[Boolean | ChartZoomable] = js.undefined
}
object ChartOptions {
  
  inline def apply(): ChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartOptions]
  }
  
  extension [Self <: ChartOptions](x: Self) {
    
    inline def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    inline def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    inline def setAxisDefaults(value: ChartAxisDefaults): Self = StObject.set(x, "axisDefaults", value.asInstanceOf[js.Any])
    
    inline def setAxisDefaultsUndefined: Self = StObject.set(x, "axisDefaults", js.undefined)
    
    inline def setAxisLabelClick(value: /* e */ ChartAxisLabelClickEvent => Unit): Self = StObject.set(x, "axisLabelClick", js.Any.fromFunction1(value))
    
    inline def setAxisLabelClickUndefined: Self = StObject.set(x, "axisLabelClick", js.undefined)
    
    inline def setCategoryAxis(value: ChartCategoryAxisItem | js.Array[ChartCategoryAxisItem]): Self = StObject.set(x, "categoryAxis", value.asInstanceOf[js.Any])
    
    inline def setCategoryAxisUndefined: Self = StObject.set(x, "categoryAxis", js.undefined)
    
    inline def setCategoryAxisVarargs(value: ChartCategoryAxisItem*): Self = StObject.set(x, "categoryAxis", js.Array(value :_*))
    
    inline def setChartArea(value: ChartChartArea): Self = StObject.set(x, "chartArea", value.asInstanceOf[js.Any])
    
    inline def setChartAreaUndefined: Self = StObject.set(x, "chartArea", js.undefined)
    
    inline def setDataBound(value: /* e */ ChartDataBoundEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataSource(value: js.Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDrag(value: /* e */ ChartDragEvent => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    inline def setDragEnd(value: /* e */ ChartDragEndEvent => Unit): Self = StObject.set(x, "dragEnd", js.Any.fromFunction1(value))
    
    inline def setDragEndUndefined: Self = StObject.set(x, "dragEnd", js.undefined)
    
    inline def setDragStart(value: /* e */ ChartDragStartEvent => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction1(value))
    
    inline def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setLegend(value: ChartLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendItemClick(value: /* e */ ChartLegendItemClickEvent => Unit): Self = StObject.set(x, "legendItemClick", js.Any.fromFunction1(value))
    
    inline def setLegendItemClickUndefined: Self = StObject.set(x, "legendItemClick", js.undefined)
    
    inline def setLegendItemHover(value: /* e */ ChartLegendItemHoverEvent => Unit): Self = StObject.set(x, "legendItemHover", js.Any.fromFunction1(value))
    
    inline def setLegendItemHoverUndefined: Self = StObject.set(x, "legendItemHover", js.undefined)
    
    inline def setLegendItemLeave(value: /* e */ ChartLegendItemLeaveEvent => Unit): Self = StObject.set(x, "legendItemLeave", js.Any.fromFunction1(value))
    
    inline def setLegendItemLeaveUndefined: Self = StObject.set(x, "legendItemLeave", js.undefined)
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNoteClick(value: /* e */ ChartNoteClickEvent => Unit): Self = StObject.set(x, "noteClick", js.Any.fromFunction1(value))
    
    inline def setNoteClickUndefined: Self = StObject.set(x, "noteClick", js.undefined)
    
    inline def setNoteHover(value: /* e */ ChartNoteHoverEvent => Unit): Self = StObject.set(x, "noteHover", js.Any.fromFunction1(value))
    
    inline def setNoteHoverUndefined: Self = StObject.set(x, "noteHover", js.undefined)
    
    inline def setNoteLeave(value: /* e */ ChartNoteLeaveEvent => Unit): Self = StObject.set(x, "noteLeave", js.Any.fromFunction1(value))
    
    inline def setNoteLeaveUndefined: Self = StObject.set(x, "noteLeave", js.undefined)
    
    inline def setPaneRender(value: /* e */ ChartPaneRenderEvent => Unit): Self = StObject.set(x, "paneRender", js.Any.fromFunction1(value))
    
    inline def setPaneRenderUndefined: Self = StObject.set(x, "paneRender", js.undefined)
    
    inline def setPanes(value: js.Array[ChartPane]): Self = StObject.set(x, "panes", value.asInstanceOf[js.Any])
    
    inline def setPanesUndefined: Self = StObject.set(x, "panes", js.undefined)
    
    inline def setPanesVarargs(value: ChartPane*): Self = StObject.set(x, "panes", js.Array(value :_*))
    
    inline def setPannable(value: Boolean | ChartPannable): Self = StObject.set(x, "pannable", value.asInstanceOf[js.Any])
    
    inline def setPannableUndefined: Self = StObject.set(x, "pannable", js.undefined)
    
    inline def setPdf(value: ChartPdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    inline def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    inline def setPersistSeriesVisibility(value: Boolean): Self = StObject.set(x, "persistSeriesVisibility", value.asInstanceOf[js.Any])
    
    inline def setPersistSeriesVisibilityUndefined: Self = StObject.set(x, "persistSeriesVisibility", js.undefined)
    
    inline def setPlotArea(value: ChartPlotArea): Self = StObject.set(x, "plotArea", value.asInstanceOf[js.Any])
    
    inline def setPlotAreaClick(value: /* e */ ChartPlotAreaClickEvent => Unit): Self = StObject.set(x, "plotAreaClick", js.Any.fromFunction1(value))
    
    inline def setPlotAreaClickUndefined: Self = StObject.set(x, "plotAreaClick", js.undefined)
    
    inline def setPlotAreaHover(value: /* e */ ChartPlotAreaHoverEvent => Unit): Self = StObject.set(x, "plotAreaHover", js.Any.fromFunction1(value))
    
    inline def setPlotAreaHoverUndefined: Self = StObject.set(x, "plotAreaHover", js.undefined)
    
    inline def setPlotAreaLeave(value: /* e */ ChartPlotAreaLeaveEvent => Unit): Self = StObject.set(x, "plotAreaLeave", js.Any.fromFunction1(value))
    
    inline def setPlotAreaLeaveUndefined: Self = StObject.set(x, "plotAreaLeave", js.undefined)
    
    inline def setPlotAreaUndefined: Self = StObject.set(x, "plotArea", js.undefined)
    
    inline def setRender(value: /* e */ ChartRenderEvent => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    inline def setRenderAs(value: String): Self = StObject.set(x, "renderAs", value.asInstanceOf[js.Any])
    
    inline def setRenderAsUndefined: Self = StObject.set(x, "renderAs", js.undefined)
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setSelect(value: /* e */ ChartSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectEnd(value: /* e */ ChartSelectEndEvent => Unit): Self = StObject.set(x, "selectEnd", js.Any.fromFunction1(value))
    
    inline def setSelectEndUndefined: Self = StObject.set(x, "selectEnd", js.undefined)
    
    inline def setSelectStart(value: /* e */ ChartSelectStartEvent => Unit): Self = StObject.set(x, "selectStart", js.Any.fromFunction1(value))
    
    inline def setSelectStartUndefined: Self = StObject.set(x, "selectStart", js.undefined)
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSeries(value: js.Array[ChartSeriesItem]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesClick(value: /* e */ ChartSeriesClickEvent => Unit): Self = StObject.set(x, "seriesClick", js.Any.fromFunction1(value))
    
    inline def setSeriesClickUndefined: Self = StObject.set(x, "seriesClick", js.undefined)
    
    inline def setSeriesColors(value: js.Any): Self = StObject.set(x, "seriesColors", value.asInstanceOf[js.Any])
    
    inline def setSeriesColorsUndefined: Self = StObject.set(x, "seriesColors", js.undefined)
    
    inline def setSeriesDefaults(value: ChartSeriesDefaults): Self = StObject.set(x, "seriesDefaults", value.asInstanceOf[js.Any])
    
    inline def setSeriesDefaultsUndefined: Self = StObject.set(x, "seriesDefaults", js.undefined)
    
    inline def setSeriesHover(value: /* e */ ChartSeriesHoverEvent => Unit): Self = StObject.set(x, "seriesHover", js.Any.fromFunction1(value))
    
    inline def setSeriesHoverUndefined: Self = StObject.set(x, "seriesHover", js.undefined)
    
    inline def setSeriesLeave(value: /* e */ ChartSeriesLeaveEvent => Unit): Self = StObject.set(x, "seriesLeave", js.Any.fromFunction1(value))
    
    inline def setSeriesLeaveUndefined: Self = StObject.set(x, "seriesLeave", js.undefined)
    
    inline def setSeriesOver(value: /* e */ ChartSeriesOverEvent => Unit): Self = StObject.set(x, "seriesOver", js.Any.fromFunction1(value))
    
    inline def setSeriesOverUndefined: Self = StObject.set(x, "seriesOver", js.undefined)
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: ChartSeriesItem*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitle(value: String | ChartTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTooltip(value: ChartTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTransitions(value: Boolean): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    
    inline def setValueAxis(value: ChartValueAxisItem | js.Array[ChartValueAxisItem]): Self = StObject.set(x, "valueAxis", value.asInstanceOf[js.Any])
    
    inline def setValueAxisUndefined: Self = StObject.set(x, "valueAxis", js.undefined)
    
    inline def setValueAxisVarargs(value: ChartValueAxisItem*): Self = StObject.set(x, "valueAxis", js.Array(value :_*))
    
    inline def setXAxis(value: ChartXAxisItem | js.Array[ChartXAxisItem]): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    inline def setXAxisVarargs(value: ChartXAxisItem*): Self = StObject.set(x, "xAxis", js.Array(value :_*))
    
    inline def setYAxis(value: ChartYAxisItem | js.Array[ChartYAxisItem]): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
    
    inline def setYAxisVarargs(value: ChartYAxisItem*): Self = StObject.set(x, "yAxis", js.Array(value :_*))
    
    inline def setZoom(value: /* e */ ChartZoomEvent => Unit): Self = StObject.set(x, "zoom", js.Any.fromFunction1(value))
    
    inline def setZoomEnd(value: /* e */ ChartZoomEndEvent => Unit): Self = StObject.set(x, "zoomEnd", js.Any.fromFunction1(value))
    
    inline def setZoomEndUndefined: Self = StObject.set(x, "zoomEnd", js.undefined)
    
    inline def setZoomStart(value: /* e */ ChartZoomStartEvent => Unit): Self = StObject.set(x, "zoomStart", js.Any.fromFunction1(value))
    
    inline def setZoomStartUndefined: Self = StObject.set(x, "zoomStart", js.undefined)
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    
    inline def setZoomable(value: Boolean | ChartZoomable): Self = StObject.set(x, "zoomable", value.asInstanceOf[js.Any])
    
    inline def setZoomableUndefined: Self = StObject.set(x, "zoomable", js.undefined)
  }
}
