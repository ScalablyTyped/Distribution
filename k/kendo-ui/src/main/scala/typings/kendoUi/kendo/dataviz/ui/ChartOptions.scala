package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartOptions extends StObject {
  
  var autoBind: js.UndefOr[Boolean] = js.native
  
  var axisDefaults: js.UndefOr[ChartAxisDefaults] = js.native
  
  var axisLabelClick: js.UndefOr[js.Function1[/* e */ ChartAxisLabelClickEvent, Unit]] = js.native
  
  var categoryAxis: js.UndefOr[ChartCategoryAxisItem | js.Array[ChartCategoryAxisItem]] = js.native
  
  var chartArea: js.UndefOr[ChartChartArea] = js.native
  
  var dataBound: js.UndefOr[js.Function1[/* e */ ChartDataBoundEvent, Unit]] = js.native
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  
  var drag: js.UndefOr[js.Function1[/* e */ ChartDragEvent, Unit]] = js.native
  
  var dragEnd: js.UndefOr[js.Function1[/* e */ ChartDragEndEvent, Unit]] = js.native
  
  var dragStart: js.UndefOr[js.Function1[/* e */ ChartDragStartEvent, Unit]] = js.native
  
  var legend: js.UndefOr[ChartLegend] = js.native
  
  var legendItemClick: js.UndefOr[js.Function1[/* e */ ChartLegendItemClickEvent, Unit]] = js.native
  
  var legendItemHover: js.UndefOr[js.Function1[/* e */ ChartLegendItemHoverEvent, Unit]] = js.native
  
  var legendItemLeave: js.UndefOr[js.Function1[/* e */ ChartLegendItemLeaveEvent, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var noteClick: js.UndefOr[js.Function1[/* e */ ChartNoteClickEvent, Unit]] = js.native
  
  var noteHover: js.UndefOr[js.Function1[/* e */ ChartNoteHoverEvent, Unit]] = js.native
  
  var noteLeave: js.UndefOr[js.Function1[/* e */ ChartNoteLeaveEvent, Unit]] = js.native
  
  var paneRender: js.UndefOr[js.Function1[/* e */ ChartPaneRenderEvent, Unit]] = js.native
  
  var panes: js.UndefOr[js.Array[ChartPane]] = js.native
  
  var pannable: js.UndefOr[Boolean | ChartPannable] = js.native
  
  var pdf: js.UndefOr[ChartPdf] = js.native
  
  var persistSeriesVisibility: js.UndefOr[Boolean] = js.native
  
  var plotArea: js.UndefOr[ChartPlotArea] = js.native
  
  var plotAreaClick: js.UndefOr[js.Function1[/* e */ ChartPlotAreaClickEvent, Unit]] = js.native
  
  var plotAreaHover: js.UndefOr[js.Function1[/* e */ ChartPlotAreaHoverEvent, Unit]] = js.native
  
  var plotAreaLeave: js.UndefOr[js.Function1[/* e */ ChartPlotAreaLeaveEvent, Unit]] = js.native
  
  var render: js.UndefOr[js.Function1[/* e */ ChartRenderEvent, Unit]] = js.native
  
  var renderAs: js.UndefOr[String] = js.native
  
  var select: js.UndefOr[js.Function1[/* e */ ChartSelectEvent, Unit]] = js.native
  
  var selectEnd: js.UndefOr[js.Function1[/* e */ ChartSelectEndEvent, Unit]] = js.native
  
  var selectStart: js.UndefOr[js.Function1[/* e */ ChartSelectStartEvent, Unit]] = js.native
  
  var series: js.UndefOr[js.Array[ChartSeriesItem]] = js.native
  
  var seriesClick: js.UndefOr[js.Function1[/* e */ ChartSeriesClickEvent, Unit]] = js.native
  
  var seriesColors: js.UndefOr[js.Any] = js.native
  
  var seriesDefaults: js.UndefOr[ChartSeriesDefaults] = js.native
  
  var seriesHover: js.UndefOr[js.Function1[/* e */ ChartSeriesHoverEvent, Unit]] = js.native
  
  var seriesLeave: js.UndefOr[js.Function1[/* e */ ChartSeriesLeaveEvent, Unit]] = js.native
  
  var seriesOver: js.UndefOr[js.Function1[/* e */ ChartSeriesOverEvent, Unit]] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String | ChartTitle] = js.native
  
  var tooltip: js.UndefOr[ChartTooltip] = js.native
  
  var transitions: js.UndefOr[Boolean] = js.native
  
  var valueAxis: js.UndefOr[ChartValueAxisItem | js.Array[ChartValueAxisItem]] = js.native
  
  var xAxis: js.UndefOr[ChartXAxisItem | js.Array[ChartXAxisItem]] = js.native
  
  var yAxis: js.UndefOr[ChartYAxisItem | js.Array[ChartYAxisItem]] = js.native
  
  var zoom: js.UndefOr[js.Function1[/* e */ ChartZoomEvent, Unit]] = js.native
  
  var zoomEnd: js.UndefOr[js.Function1[/* e */ ChartZoomEndEvent, Unit]] = js.native
  
  var zoomStart: js.UndefOr[js.Function1[/* e */ ChartZoomStartEvent, Unit]] = js.native
  
  var zoomable: js.UndefOr[Boolean | ChartZoomable] = js.native
}
object ChartOptions {
  
  @scala.inline
  def apply(): ChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartOptions]
  }
  
  @scala.inline
  implicit class ChartOptionsMutableBuilder[Self <: ChartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    @scala.inline
    def setAxisDefaults(value: ChartAxisDefaults): Self = StObject.set(x, "axisDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisDefaultsUndefined: Self = StObject.set(x, "axisDefaults", js.undefined)
    
    @scala.inline
    def setAxisLabelClick(value: /* e */ ChartAxisLabelClickEvent => Unit): Self = StObject.set(x, "axisLabelClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAxisLabelClickUndefined: Self = StObject.set(x, "axisLabelClick", js.undefined)
    
    @scala.inline
    def setCategoryAxis(value: ChartCategoryAxisItem | js.Array[ChartCategoryAxisItem]): Self = StObject.set(x, "categoryAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryAxisUndefined: Self = StObject.set(x, "categoryAxis", js.undefined)
    
    @scala.inline
    def setCategoryAxisVarargs(value: ChartCategoryAxisItem*): Self = StObject.set(x, "categoryAxis", js.Array(value :_*))
    
    @scala.inline
    def setChartArea(value: ChartChartArea): Self = StObject.set(x, "chartArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartAreaUndefined: Self = StObject.set(x, "chartArea", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ ChartDataBoundEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDrag(value: /* e */ ChartDragEvent => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragEnd(value: /* e */ ChartDragEndEvent => Unit): Self = StObject.set(x, "dragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragEndUndefined: Self = StObject.set(x, "dragEnd", js.undefined)
    
    @scala.inline
    def setDragStart(value: /* e */ ChartDragStartEvent => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setLegend(value: ChartLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendItemClick(value: /* e */ ChartLegendItemClickEvent => Unit): Self = StObject.set(x, "legendItemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLegendItemClickUndefined: Self = StObject.set(x, "legendItemClick", js.undefined)
    
    @scala.inline
    def setLegendItemHover(value: /* e */ ChartLegendItemHoverEvent => Unit): Self = StObject.set(x, "legendItemHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLegendItemHoverUndefined: Self = StObject.set(x, "legendItemHover", js.undefined)
    
    @scala.inline
    def setLegendItemLeave(value: /* e */ ChartLegendItemLeaveEvent => Unit): Self = StObject.set(x, "legendItemLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLegendItemLeaveUndefined: Self = StObject.set(x, "legendItemLeave", js.undefined)
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNoteClick(value: /* e */ ChartNoteClickEvent => Unit): Self = StObject.set(x, "noteClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNoteClickUndefined: Self = StObject.set(x, "noteClick", js.undefined)
    
    @scala.inline
    def setNoteHover(value: /* e */ ChartNoteHoverEvent => Unit): Self = StObject.set(x, "noteHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNoteHoverUndefined: Self = StObject.set(x, "noteHover", js.undefined)
    
    @scala.inline
    def setNoteLeave(value: /* e */ ChartNoteLeaveEvent => Unit): Self = StObject.set(x, "noteLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNoteLeaveUndefined: Self = StObject.set(x, "noteLeave", js.undefined)
    
    @scala.inline
    def setPaneRender(value: /* e */ ChartPaneRenderEvent => Unit): Self = StObject.set(x, "paneRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPaneRenderUndefined: Self = StObject.set(x, "paneRender", js.undefined)
    
    @scala.inline
    def setPanes(value: js.Array[ChartPane]): Self = StObject.set(x, "panes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanesUndefined: Self = StObject.set(x, "panes", js.undefined)
    
    @scala.inline
    def setPanesVarargs(value: ChartPane*): Self = StObject.set(x, "panes", js.Array(value :_*))
    
    @scala.inline
    def setPannable(value: Boolean | ChartPannable): Self = StObject.set(x, "pannable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPannableUndefined: Self = StObject.set(x, "pannable", js.undefined)
    
    @scala.inline
    def setPdf(value: ChartPdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    @scala.inline
    def setPersistSeriesVisibility(value: Boolean): Self = StObject.set(x, "persistSeriesVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistSeriesVisibilityUndefined: Self = StObject.set(x, "persistSeriesVisibility", js.undefined)
    
    @scala.inline
    def setPlotArea(value: ChartPlotArea): Self = StObject.set(x, "plotArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotAreaClick(value: /* e */ ChartPlotAreaClickEvent => Unit): Self = StObject.set(x, "plotAreaClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPlotAreaClickUndefined: Self = StObject.set(x, "plotAreaClick", js.undefined)
    
    @scala.inline
    def setPlotAreaHover(value: /* e */ ChartPlotAreaHoverEvent => Unit): Self = StObject.set(x, "plotAreaHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPlotAreaHoverUndefined: Self = StObject.set(x, "plotAreaHover", js.undefined)
    
    @scala.inline
    def setPlotAreaLeave(value: /* e */ ChartPlotAreaLeaveEvent => Unit): Self = StObject.set(x, "plotAreaLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPlotAreaLeaveUndefined: Self = StObject.set(x, "plotAreaLeave", js.undefined)
    
    @scala.inline
    def setPlotAreaUndefined: Self = StObject.set(x, "plotArea", js.undefined)
    
    @scala.inline
    def setRender(value: /* e */ ChartRenderEvent => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderAs(value: String): Self = StObject.set(x, "renderAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderAsUndefined: Self = StObject.set(x, "renderAs", js.undefined)
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ ChartSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectEnd(value: /* e */ ChartSelectEndEvent => Unit): Self = StObject.set(x, "selectEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectEndUndefined: Self = StObject.set(x, "selectEnd", js.undefined)
    
    @scala.inline
    def setSelectStart(value: /* e */ ChartSelectStartEvent => Unit): Self = StObject.set(x, "selectStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectStartUndefined: Self = StObject.set(x, "selectStart", js.undefined)
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Array[ChartSeriesItem]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesClick(value: /* e */ ChartSeriesClickEvent => Unit): Self = StObject.set(x, "seriesClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeriesClickUndefined: Self = StObject.set(x, "seriesClick", js.undefined)
    
    @scala.inline
    def setSeriesColors(value: js.Any): Self = StObject.set(x, "seriesColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesColorsUndefined: Self = StObject.set(x, "seriesColors", js.undefined)
    
    @scala.inline
    def setSeriesDefaults(value: ChartSeriesDefaults): Self = StObject.set(x, "seriesDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesDefaultsUndefined: Self = StObject.set(x, "seriesDefaults", js.undefined)
    
    @scala.inline
    def setSeriesHover(value: /* e */ ChartSeriesHoverEvent => Unit): Self = StObject.set(x, "seriesHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeriesHoverUndefined: Self = StObject.set(x, "seriesHover", js.undefined)
    
    @scala.inline
    def setSeriesLeave(value: /* e */ ChartSeriesLeaveEvent => Unit): Self = StObject.set(x, "seriesLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeriesLeaveUndefined: Self = StObject.set(x, "seriesLeave", js.undefined)
    
    @scala.inline
    def setSeriesOver(value: /* e */ ChartSeriesOverEvent => Unit): Self = StObject.set(x, "seriesOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeriesOverUndefined: Self = StObject.set(x, "seriesOver", js.undefined)
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: ChartSeriesItem*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTitle(value: String | ChartTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTooltip(value: ChartTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setTransitions(value: Boolean): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    
    @scala.inline
    def setValueAxis(value: ChartValueAxisItem | js.Array[ChartValueAxisItem]): Self = StObject.set(x, "valueAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAxisUndefined: Self = StObject.set(x, "valueAxis", js.undefined)
    
    @scala.inline
    def setValueAxisVarargs(value: ChartValueAxisItem*): Self = StObject.set(x, "valueAxis", js.Array(value :_*))
    
    @scala.inline
    def setXAxis(value: ChartXAxisItem | js.Array[ChartXAxisItem]): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    @scala.inline
    def setXAxisVarargs(value: ChartXAxisItem*): Self = StObject.set(x, "xAxis", js.Array(value :_*))
    
    @scala.inline
    def setYAxis(value: ChartYAxisItem | js.Array[ChartYAxisItem]): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
    
    @scala.inline
    def setYAxisVarargs(value: ChartYAxisItem*): Self = StObject.set(x, "yAxis", js.Array(value :_*))
    
    @scala.inline
    def setZoom(value: /* e */ ChartZoomEvent => Unit): Self = StObject.set(x, "zoom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomEnd(value: /* e */ ChartZoomEndEvent => Unit): Self = StObject.set(x, "zoomEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomEndUndefined: Self = StObject.set(x, "zoomEnd", js.undefined)
    
    @scala.inline
    def setZoomStart(value: /* e */ ChartZoomStartEvent => Unit): Self = StObject.set(x, "zoomStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomStartUndefined: Self = StObject.set(x, "zoomStart", js.undefined)
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    
    @scala.inline
    def setZoomable(value: Boolean | ChartZoomable): Self = StObject.set(x, "zoomable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomableUndefined: Self = StObject.set(x, "zoomable", js.undefined)
  }
}
