package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartOptions extends StObject {
  
  var autoBind: js.UndefOr[Boolean] = js.native
  
  var axisDefaults: js.UndefOr[js.Any] = js.native
  
  var axisLabelClick: js.UndefOr[js.Function1[/* e */ StockChartAxisLabelClickEvent, Unit]] = js.native
  
  var categoryAxis: js.UndefOr[StockChartCategoryAxisItem | js.Array[StockChartCategoryAxisItem]] = js.native
  
  var chartArea: js.UndefOr[StockChartChartArea] = js.native
  
  var dataBound: js.UndefOr[js.Function1[/* e */ StockChartEvent, Unit]] = js.native
  
  var dataSource: js.UndefOr[js.Any] = js.native
  
  var dateField: js.UndefOr[String] = js.native
  
  var drag: js.UndefOr[js.Function1[/* e */ StockChartDragEvent, Unit]] = js.native
  
  var dragEnd: js.UndefOr[js.Function1[/* e */ StockChartDragEndEvent, Unit]] = js.native
  
  var dragStart: js.UndefOr[js.Function1[/* e */ StockChartDragStartEvent, Unit]] = js.native
  
  var legend: js.UndefOr[StockChartLegend] = js.native
  
  var legendItemClick: js.UndefOr[js.Function1[/* e */ StockChartLegendItemClickEvent, Unit]] = js.native
  
  var legendItemHover: js.UndefOr[js.Function1[/* e */ StockChartLegendItemHoverEvent, Unit]] = js.native
  
  var legendItemLeave: js.UndefOr[js.Function1[/* e */ StockChartLegendItemLeaveEvent, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var navigator: js.UndefOr[StockChartNavigator] = js.native
  
  var noteClick: js.UndefOr[js.Function1[/* e */ StockChartNoteClickEvent, Unit]] = js.native
  
  var noteHover: js.UndefOr[js.Function1[/* e */ StockChartNoteHoverEvent, Unit]] = js.native
  
  var noteLeave: js.UndefOr[js.Function1[/* e */ StockChartNoteLeaveEvent, Unit]] = js.native
  
  var paneRender: js.UndefOr[js.Function1[/* e */ StockChartPaneRenderEvent, Unit]] = js.native
  
  var panes: js.UndefOr[js.Array[StockChartPane]] = js.native
  
  var pdf: js.UndefOr[StockChartPdf] = js.native
  
  var persistSeriesVisibility: js.UndefOr[Boolean] = js.native
  
  var plotArea: js.UndefOr[StockChartPlotArea] = js.native
  
  var plotAreaClick: js.UndefOr[js.Function1[/* e */ StockChartPlotAreaClickEvent, Unit]] = js.native
  
  var plotAreaHover: js.UndefOr[js.Function1[/* e */ StockChartPlotAreaHoverEvent, Unit]] = js.native
  
  var plotAreaLeave: js.UndefOr[js.Function1[/* e */ StockChartPlotAreaLeaveEvent, Unit]] = js.native
  
  var render: js.UndefOr[js.Function1[/* e */ StockChartRenderEvent, Unit]] = js.native
  
  var renderAs: js.UndefOr[String] = js.native
  
  var select: js.UndefOr[js.Function1[/* e */ StockChartSelectEvent, Unit]] = js.native
  
  var selectEnd: js.UndefOr[js.Function1[/* e */ StockChartSelectEndEvent, Unit]] = js.native
  
  var selectStart: js.UndefOr[js.Function1[/* e */ StockChartSelectStartEvent, Unit]] = js.native
  
  var series: js.UndefOr[js.Array[StockChartSeriesItem]] = js.native
  
  var seriesClick: js.UndefOr[js.Function1[/* e */ StockChartSeriesClickEvent, Unit]] = js.native
  
  var seriesColors: js.UndefOr[js.Any] = js.native
  
  var seriesDefaults: js.UndefOr[StockChartSeriesDefaults] = js.native
  
  var seriesHover: js.UndefOr[js.Function1[/* e */ StockChartSeriesHoverEvent, Unit]] = js.native
  
  var seriesLeave: js.UndefOr[js.Function1[/* e */ StockChartSeriesLeaveEvent, Unit]] = js.native
  
  var seriesOver: js.UndefOr[js.Function1[/* e */ StockChartSeriesOverEvent, Unit]] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[StockChartTitle] = js.native
  
  var tooltip: js.UndefOr[StockChartTooltip] = js.native
  
  var transitions: js.UndefOr[Boolean] = js.native
  
  var valueAxis: js.UndefOr[StockChartValueAxisItem | js.Array[StockChartValueAxisItem]] = js.native
  
  var zoom: js.UndefOr[js.Function1[/* e */ StockChartZoomEvent, Unit]] = js.native
  
  var zoomEnd: js.UndefOr[js.Function1[/* e */ StockChartZoomEndEvent, Unit]] = js.native
  
  var zoomStart: js.UndefOr[js.Function1[/* e */ StockChartZoomStartEvent, Unit]] = js.native
}
object StockChartOptions {
  
  @scala.inline
  def apply(): StockChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartOptions]
  }
  
  @scala.inline
  implicit class StockChartOptionsMutableBuilder[Self <: StockChartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    @scala.inline
    def setAxisDefaults(value: js.Any): Self = StObject.set(x, "axisDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisDefaultsUndefined: Self = StObject.set(x, "axisDefaults", js.undefined)
    
    @scala.inline
    def setAxisLabelClick(value: /* e */ StockChartAxisLabelClickEvent => Unit): Self = StObject.set(x, "axisLabelClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAxisLabelClickUndefined: Self = StObject.set(x, "axisLabelClick", js.undefined)
    
    @scala.inline
    def setCategoryAxis(value: StockChartCategoryAxisItem | js.Array[StockChartCategoryAxisItem]): Self = StObject.set(x, "categoryAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryAxisUndefined: Self = StObject.set(x, "categoryAxis", js.undefined)
    
    @scala.inline
    def setCategoryAxisVarargs(value: StockChartCategoryAxisItem*): Self = StObject.set(x, "categoryAxis", js.Array(value :_*))
    
    @scala.inline
    def setChartArea(value: StockChartChartArea): Self = StObject.set(x, "chartArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartAreaUndefined: Self = StObject.set(x, "chartArea", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ StockChartEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDateField(value: String): Self = StObject.set(x, "dateField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFieldUndefined: Self = StObject.set(x, "dateField", js.undefined)
    
    @scala.inline
    def setDrag(value: /* e */ StockChartDragEvent => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragEnd(value: /* e */ StockChartDragEndEvent => Unit): Self = StObject.set(x, "dragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragEndUndefined: Self = StObject.set(x, "dragEnd", js.undefined)
    
    @scala.inline
    def setDragStart(value: /* e */ StockChartDragStartEvent => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setLegend(value: StockChartLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendItemClick(value: /* e */ StockChartLegendItemClickEvent => Unit): Self = StObject.set(x, "legendItemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLegendItemClickUndefined: Self = StObject.set(x, "legendItemClick", js.undefined)
    
    @scala.inline
    def setLegendItemHover(value: /* e */ StockChartLegendItemHoverEvent => Unit): Self = StObject.set(x, "legendItemHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLegendItemHoverUndefined: Self = StObject.set(x, "legendItemHover", js.undefined)
    
    @scala.inline
    def setLegendItemLeave(value: /* e */ StockChartLegendItemLeaveEvent => Unit): Self = StObject.set(x, "legendItemLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLegendItemLeaveUndefined: Self = StObject.set(x, "legendItemLeave", js.undefined)
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNavigator(value: StockChartNavigator): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatorUndefined: Self = StObject.set(x, "navigator", js.undefined)
    
    @scala.inline
    def setNoteClick(value: /* e */ StockChartNoteClickEvent => Unit): Self = StObject.set(x, "noteClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNoteClickUndefined: Self = StObject.set(x, "noteClick", js.undefined)
    
    @scala.inline
    def setNoteHover(value: /* e */ StockChartNoteHoverEvent => Unit): Self = StObject.set(x, "noteHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNoteHoverUndefined: Self = StObject.set(x, "noteHover", js.undefined)
    
    @scala.inline
    def setNoteLeave(value: /* e */ StockChartNoteLeaveEvent => Unit): Self = StObject.set(x, "noteLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNoteLeaveUndefined: Self = StObject.set(x, "noteLeave", js.undefined)
    
    @scala.inline
    def setPaneRender(value: /* e */ StockChartPaneRenderEvent => Unit): Self = StObject.set(x, "paneRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPaneRenderUndefined: Self = StObject.set(x, "paneRender", js.undefined)
    
    @scala.inline
    def setPanes(value: js.Array[StockChartPane]): Self = StObject.set(x, "panes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanesUndefined: Self = StObject.set(x, "panes", js.undefined)
    
    @scala.inline
    def setPanesVarargs(value: StockChartPane*): Self = StObject.set(x, "panes", js.Array(value :_*))
    
    @scala.inline
    def setPdf(value: StockChartPdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    @scala.inline
    def setPersistSeriesVisibility(value: Boolean): Self = StObject.set(x, "persistSeriesVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistSeriesVisibilityUndefined: Self = StObject.set(x, "persistSeriesVisibility", js.undefined)
    
    @scala.inline
    def setPlotArea(value: StockChartPlotArea): Self = StObject.set(x, "plotArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotAreaClick(value: /* e */ StockChartPlotAreaClickEvent => Unit): Self = StObject.set(x, "plotAreaClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPlotAreaClickUndefined: Self = StObject.set(x, "plotAreaClick", js.undefined)
    
    @scala.inline
    def setPlotAreaHover(value: /* e */ StockChartPlotAreaHoverEvent => Unit): Self = StObject.set(x, "plotAreaHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPlotAreaHoverUndefined: Self = StObject.set(x, "plotAreaHover", js.undefined)
    
    @scala.inline
    def setPlotAreaLeave(value: /* e */ StockChartPlotAreaLeaveEvent => Unit): Self = StObject.set(x, "plotAreaLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPlotAreaLeaveUndefined: Self = StObject.set(x, "plotAreaLeave", js.undefined)
    
    @scala.inline
    def setPlotAreaUndefined: Self = StObject.set(x, "plotArea", js.undefined)
    
    @scala.inline
    def setRender(value: /* e */ StockChartRenderEvent => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderAs(value: String): Self = StObject.set(x, "renderAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderAsUndefined: Self = StObject.set(x, "renderAs", js.undefined)
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ StockChartSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectEnd(value: /* e */ StockChartSelectEndEvent => Unit): Self = StObject.set(x, "selectEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectEndUndefined: Self = StObject.set(x, "selectEnd", js.undefined)
    
    @scala.inline
    def setSelectStart(value: /* e */ StockChartSelectStartEvent => Unit): Self = StObject.set(x, "selectStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectStartUndefined: Self = StObject.set(x, "selectStart", js.undefined)
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Array[StockChartSeriesItem]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesClick(value: /* e */ StockChartSeriesClickEvent => Unit): Self = StObject.set(x, "seriesClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeriesClickUndefined: Self = StObject.set(x, "seriesClick", js.undefined)
    
    @scala.inline
    def setSeriesColors(value: js.Any): Self = StObject.set(x, "seriesColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesColorsUndefined: Self = StObject.set(x, "seriesColors", js.undefined)
    
    @scala.inline
    def setSeriesDefaults(value: StockChartSeriesDefaults): Self = StObject.set(x, "seriesDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesDefaultsUndefined: Self = StObject.set(x, "seriesDefaults", js.undefined)
    
    @scala.inline
    def setSeriesHover(value: /* e */ StockChartSeriesHoverEvent => Unit): Self = StObject.set(x, "seriesHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeriesHoverUndefined: Self = StObject.set(x, "seriesHover", js.undefined)
    
    @scala.inline
    def setSeriesLeave(value: /* e */ StockChartSeriesLeaveEvent => Unit): Self = StObject.set(x, "seriesLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeriesLeaveUndefined: Self = StObject.set(x, "seriesLeave", js.undefined)
    
    @scala.inline
    def setSeriesOver(value: /* e */ StockChartSeriesOverEvent => Unit): Self = StObject.set(x, "seriesOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeriesOverUndefined: Self = StObject.set(x, "seriesOver", js.undefined)
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: StockChartSeriesItem*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTitle(value: StockChartTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTooltip(value: StockChartTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setTransitions(value: Boolean): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    
    @scala.inline
    def setValueAxis(value: StockChartValueAxisItem | js.Array[StockChartValueAxisItem]): Self = StObject.set(x, "valueAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAxisUndefined: Self = StObject.set(x, "valueAxis", js.undefined)
    
    @scala.inline
    def setValueAxisVarargs(value: StockChartValueAxisItem*): Self = StObject.set(x, "valueAxis", js.Array(value :_*))
    
    @scala.inline
    def setZoom(value: /* e */ StockChartZoomEvent => Unit): Self = StObject.set(x, "zoom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomEnd(value: /* e */ StockChartZoomEndEvent => Unit): Self = StObject.set(x, "zoomEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomEndUndefined: Self = StObject.set(x, "zoomEnd", js.undefined)
    
    @scala.inline
    def setZoomStart(value: /* e */ StockChartZoomStartEvent => Unit): Self = StObject.set(x, "zoomStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomStartUndefined: Self = StObject.set(x, "zoomStart", js.undefined)
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
