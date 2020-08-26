package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartOptions extends js.Object {
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
  implicit class ChartOptionsOps[Self <: ChartOptions] (val x: Self) extends AnyVal {
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
    def setAutoBind(value: Boolean): Self = this.set("autoBind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoBind: Self = this.set("autoBind", js.undefined)
    @scala.inline
    def setAxisDefaults(value: ChartAxisDefaults): Self = this.set("axisDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisDefaults: Self = this.set("axisDefaults", js.undefined)
    @scala.inline
    def setAxisLabelClick(value: /* e */ ChartAxisLabelClickEvent => Unit): Self = this.set("axisLabelClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAxisLabelClick: Self = this.set("axisLabelClick", js.undefined)
    @scala.inline
    def setCategoryAxisVarargs(value: ChartCategoryAxisItem*): Self = this.set("categoryAxis", js.Array(value :_*))
    @scala.inline
    def setCategoryAxis(value: ChartCategoryAxisItem | js.Array[ChartCategoryAxisItem]): Self = this.set("categoryAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryAxis: Self = this.set("categoryAxis", js.undefined)
    @scala.inline
    def setChartArea(value: ChartChartArea): Self = this.set("chartArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartArea: Self = this.set("chartArea", js.undefined)
    @scala.inline
    def setDataBound(value: /* e */ ChartDataBoundEvent => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDrag(value: /* e */ ChartDragEvent => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    @scala.inline
    def setDragEnd(value: /* e */ ChartDragEndEvent => Unit): Self = this.set("dragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragEnd: Self = this.set("dragEnd", js.undefined)
    @scala.inline
    def setDragStart(value: /* e */ ChartDragStartEvent => Unit): Self = this.set("dragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragStart: Self = this.set("dragStart", js.undefined)
    @scala.inline
    def setLegend(value: ChartLegend): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setLegendItemClick(value: /* e */ ChartLegendItemClickEvent => Unit): Self = this.set("legendItemClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLegendItemClick: Self = this.set("legendItemClick", js.undefined)
    @scala.inline
    def setLegendItemHover(value: /* e */ ChartLegendItemHoverEvent => Unit): Self = this.set("legendItemHover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLegendItemHover: Self = this.set("legendItemHover", js.undefined)
    @scala.inline
    def setLegendItemLeave(value: /* e */ ChartLegendItemLeaveEvent => Unit): Self = this.set("legendItemLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLegendItemLeave: Self = this.set("legendItemLeave", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNoteClick(value: /* e */ ChartNoteClickEvent => Unit): Self = this.set("noteClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNoteClick: Self = this.set("noteClick", js.undefined)
    @scala.inline
    def setNoteHover(value: /* e */ ChartNoteHoverEvent => Unit): Self = this.set("noteHover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNoteHover: Self = this.set("noteHover", js.undefined)
    @scala.inline
    def setNoteLeave(value: /* e */ ChartNoteLeaveEvent => Unit): Self = this.set("noteLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNoteLeave: Self = this.set("noteLeave", js.undefined)
    @scala.inline
    def setPaneRender(value: /* e */ ChartPaneRenderEvent => Unit): Self = this.set("paneRender", js.Any.fromFunction1(value))
    @scala.inline
    def deletePaneRender: Self = this.set("paneRender", js.undefined)
    @scala.inline
    def setPanesVarargs(value: ChartPane*): Self = this.set("panes", js.Array(value :_*))
    @scala.inline
    def setPanes(value: js.Array[ChartPane]): Self = this.set("panes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanes: Self = this.set("panes", js.undefined)
    @scala.inline
    def setPannable(value: Boolean | ChartPannable): Self = this.set("pannable", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePannable: Self = this.set("pannable", js.undefined)
    @scala.inline
    def setPdf(value: ChartPdf): Self = this.set("pdf", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePdf: Self = this.set("pdf", js.undefined)
    @scala.inline
    def setPersistSeriesVisibility(value: Boolean): Self = this.set("persistSeriesVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistSeriesVisibility: Self = this.set("persistSeriesVisibility", js.undefined)
    @scala.inline
    def setPlotArea(value: ChartPlotArea): Self = this.set("plotArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlotArea: Self = this.set("plotArea", js.undefined)
    @scala.inline
    def setPlotAreaClick(value: /* e */ ChartPlotAreaClickEvent => Unit): Self = this.set("plotAreaClick", js.Any.fromFunction1(value))
    @scala.inline
    def deletePlotAreaClick: Self = this.set("plotAreaClick", js.undefined)
    @scala.inline
    def setPlotAreaHover(value: /* e */ ChartPlotAreaHoverEvent => Unit): Self = this.set("plotAreaHover", js.Any.fromFunction1(value))
    @scala.inline
    def deletePlotAreaHover: Self = this.set("plotAreaHover", js.undefined)
    @scala.inline
    def setPlotAreaLeave(value: /* e */ ChartPlotAreaLeaveEvent => Unit): Self = this.set("plotAreaLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deletePlotAreaLeave: Self = this.set("plotAreaLeave", js.undefined)
    @scala.inline
    def setRender(value: /* e */ ChartRenderEvent => Unit): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setRenderAs(value: String): Self = this.set("renderAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderAs: Self = this.set("renderAs", js.undefined)
    @scala.inline
    def setSelect(value: /* e */ ChartSelectEvent => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSelectEnd(value: /* e */ ChartSelectEndEvent => Unit): Self = this.set("selectEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelectEnd: Self = this.set("selectEnd", js.undefined)
    @scala.inline
    def setSelectStart(value: /* e */ ChartSelectStartEvent => Unit): Self = this.set("selectStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelectStart: Self = this.set("selectStart", js.undefined)
    @scala.inline
    def setSeriesVarargs(value: ChartSeriesItem*): Self = this.set("series", js.Array(value :_*))
    @scala.inline
    def setSeries(value: js.Array[ChartSeriesItem]): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setSeriesClick(value: /* e */ ChartSeriesClickEvent => Unit): Self = this.set("seriesClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSeriesClick: Self = this.set("seriesClick", js.undefined)
    @scala.inline
    def setSeriesColors(value: js.Any): Self = this.set("seriesColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesColors: Self = this.set("seriesColors", js.undefined)
    @scala.inline
    def setSeriesDefaults(value: ChartSeriesDefaults): Self = this.set("seriesDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesDefaults: Self = this.set("seriesDefaults", js.undefined)
    @scala.inline
    def setSeriesHover(value: /* e */ ChartSeriesHoverEvent => Unit): Self = this.set("seriesHover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSeriesHover: Self = this.set("seriesHover", js.undefined)
    @scala.inline
    def setSeriesLeave(value: /* e */ ChartSeriesLeaveEvent => Unit): Self = this.set("seriesLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSeriesLeave: Self = this.set("seriesLeave", js.undefined)
    @scala.inline
    def setSeriesOver(value: /* e */ ChartSeriesOverEvent => Unit): Self = this.set("seriesOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSeriesOver: Self = this.set("seriesOver", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTitle(value: String | ChartTitle): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTooltip(value: ChartTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTransitions(value: Boolean): Self = this.set("transitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitions: Self = this.set("transitions", js.undefined)
    @scala.inline
    def setValueAxisVarargs(value: ChartValueAxisItem*): Self = this.set("valueAxis", js.Array(value :_*))
    @scala.inline
    def setValueAxis(value: ChartValueAxisItem | js.Array[ChartValueAxisItem]): Self = this.set("valueAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueAxis: Self = this.set("valueAxis", js.undefined)
    @scala.inline
    def setXAxisVarargs(value: ChartXAxisItem*): Self = this.set("xAxis", js.Array(value :_*))
    @scala.inline
    def setXAxis(value: ChartXAxisItem | js.Array[ChartXAxisItem]): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxis: Self = this.set("xAxis", js.undefined)
    @scala.inline
    def setYAxisVarargs(value: ChartYAxisItem*): Self = this.set("yAxis", js.Array(value :_*))
    @scala.inline
    def setYAxis(value: ChartYAxisItem | js.Array[ChartYAxisItem]): Self = this.set("yAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxis: Self = this.set("yAxis", js.undefined)
    @scala.inline
    def setZoom(value: /* e */ ChartZoomEvent => Unit): Self = this.set("zoom", js.Any.fromFunction1(value))
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    @scala.inline
    def setZoomEnd(value: /* e */ ChartZoomEndEvent => Unit): Self = this.set("zoomEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteZoomEnd: Self = this.set("zoomEnd", js.undefined)
    @scala.inline
    def setZoomStart(value: /* e */ ChartZoomStartEvent => Unit): Self = this.set("zoomStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteZoomStart: Self = this.set("zoomStart", js.undefined)
    @scala.inline
    def setZoomable(value: Boolean | ChartZoomable): Self = this.set("zoomable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomable: Self = this.set("zoomable", js.undefined)
  }
  
}

