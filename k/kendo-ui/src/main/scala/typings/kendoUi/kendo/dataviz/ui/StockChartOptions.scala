package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockChartOptions extends js.Object {
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
  implicit class StockChartOptionsOps[Self <: StockChartOptions] (val x: Self) extends AnyVal {
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
    def setAxisDefaults(value: js.Any): Self = this.set("axisDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisDefaults: Self = this.set("axisDefaults", js.undefined)
    @scala.inline
    def setAxisLabelClick(value: /* e */ StockChartAxisLabelClickEvent => Unit): Self = this.set("axisLabelClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAxisLabelClick: Self = this.set("axisLabelClick", js.undefined)
    @scala.inline
    def setCategoryAxisVarargs(value: StockChartCategoryAxisItem*): Self = this.set("categoryAxis", js.Array(value :_*))
    @scala.inline
    def setCategoryAxis(value: StockChartCategoryAxisItem | js.Array[StockChartCategoryAxisItem]): Self = this.set("categoryAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryAxis: Self = this.set("categoryAxis", js.undefined)
    @scala.inline
    def setChartArea(value: StockChartChartArea): Self = this.set("chartArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartArea: Self = this.set("chartArea", js.undefined)
    @scala.inline
    def setDataBound(value: /* e */ StockChartEvent => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDateField(value: String): Self = this.set("dateField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateField: Self = this.set("dateField", js.undefined)
    @scala.inline
    def setDrag(value: /* e */ StockChartDragEvent => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    @scala.inline
    def setDragEnd(value: /* e */ StockChartDragEndEvent => Unit): Self = this.set("dragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragEnd: Self = this.set("dragEnd", js.undefined)
    @scala.inline
    def setDragStart(value: /* e */ StockChartDragStartEvent => Unit): Self = this.set("dragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragStart: Self = this.set("dragStart", js.undefined)
    @scala.inline
    def setLegend(value: StockChartLegend): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setLegendItemClick(value: /* e */ StockChartLegendItemClickEvent => Unit): Self = this.set("legendItemClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLegendItemClick: Self = this.set("legendItemClick", js.undefined)
    @scala.inline
    def setLegendItemHover(value: /* e */ StockChartLegendItemHoverEvent => Unit): Self = this.set("legendItemHover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLegendItemHover: Self = this.set("legendItemHover", js.undefined)
    @scala.inline
    def setLegendItemLeave(value: /* e */ StockChartLegendItemLeaveEvent => Unit): Self = this.set("legendItemLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLegendItemLeave: Self = this.set("legendItemLeave", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNavigator(value: StockChartNavigator): Self = this.set("navigator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigator: Self = this.set("navigator", js.undefined)
    @scala.inline
    def setNoteClick(value: /* e */ StockChartNoteClickEvent => Unit): Self = this.set("noteClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNoteClick: Self = this.set("noteClick", js.undefined)
    @scala.inline
    def setNoteHover(value: /* e */ StockChartNoteHoverEvent => Unit): Self = this.set("noteHover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNoteHover: Self = this.set("noteHover", js.undefined)
    @scala.inline
    def setNoteLeave(value: /* e */ StockChartNoteLeaveEvent => Unit): Self = this.set("noteLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNoteLeave: Self = this.set("noteLeave", js.undefined)
    @scala.inline
    def setPaneRender(value: /* e */ StockChartPaneRenderEvent => Unit): Self = this.set("paneRender", js.Any.fromFunction1(value))
    @scala.inline
    def deletePaneRender: Self = this.set("paneRender", js.undefined)
    @scala.inline
    def setPanesVarargs(value: StockChartPane*): Self = this.set("panes", js.Array(value :_*))
    @scala.inline
    def setPanes(value: js.Array[StockChartPane]): Self = this.set("panes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanes: Self = this.set("panes", js.undefined)
    @scala.inline
    def setPdf(value: StockChartPdf): Self = this.set("pdf", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePdf: Self = this.set("pdf", js.undefined)
    @scala.inline
    def setPersistSeriesVisibility(value: Boolean): Self = this.set("persistSeriesVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistSeriesVisibility: Self = this.set("persistSeriesVisibility", js.undefined)
    @scala.inline
    def setPlotArea(value: StockChartPlotArea): Self = this.set("plotArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlotArea: Self = this.set("plotArea", js.undefined)
    @scala.inline
    def setPlotAreaClick(value: /* e */ StockChartPlotAreaClickEvent => Unit): Self = this.set("plotAreaClick", js.Any.fromFunction1(value))
    @scala.inline
    def deletePlotAreaClick: Self = this.set("plotAreaClick", js.undefined)
    @scala.inline
    def setPlotAreaHover(value: /* e */ StockChartPlotAreaHoverEvent => Unit): Self = this.set("plotAreaHover", js.Any.fromFunction1(value))
    @scala.inline
    def deletePlotAreaHover: Self = this.set("plotAreaHover", js.undefined)
    @scala.inline
    def setPlotAreaLeave(value: /* e */ StockChartPlotAreaLeaveEvent => Unit): Self = this.set("plotAreaLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deletePlotAreaLeave: Self = this.set("plotAreaLeave", js.undefined)
    @scala.inline
    def setRender(value: /* e */ StockChartRenderEvent => Unit): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setRenderAs(value: String): Self = this.set("renderAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderAs: Self = this.set("renderAs", js.undefined)
    @scala.inline
    def setSelect(value: /* e */ StockChartSelectEvent => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSelectEnd(value: /* e */ StockChartSelectEndEvent => Unit): Self = this.set("selectEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelectEnd: Self = this.set("selectEnd", js.undefined)
    @scala.inline
    def setSelectStart(value: /* e */ StockChartSelectStartEvent => Unit): Self = this.set("selectStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelectStart: Self = this.set("selectStart", js.undefined)
    @scala.inline
    def setSeriesVarargs(value: StockChartSeriesItem*): Self = this.set("series", js.Array(value :_*))
    @scala.inline
    def setSeries(value: js.Array[StockChartSeriesItem]): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setSeriesClick(value: /* e */ StockChartSeriesClickEvent => Unit): Self = this.set("seriesClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSeriesClick: Self = this.set("seriesClick", js.undefined)
    @scala.inline
    def setSeriesColors(value: js.Any): Self = this.set("seriesColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesColors: Self = this.set("seriesColors", js.undefined)
    @scala.inline
    def setSeriesDefaults(value: StockChartSeriesDefaults): Self = this.set("seriesDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesDefaults: Self = this.set("seriesDefaults", js.undefined)
    @scala.inline
    def setSeriesHover(value: /* e */ StockChartSeriesHoverEvent => Unit): Self = this.set("seriesHover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSeriesHover: Self = this.set("seriesHover", js.undefined)
    @scala.inline
    def setSeriesLeave(value: /* e */ StockChartSeriesLeaveEvent => Unit): Self = this.set("seriesLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSeriesLeave: Self = this.set("seriesLeave", js.undefined)
    @scala.inline
    def setSeriesOver(value: /* e */ StockChartSeriesOverEvent => Unit): Self = this.set("seriesOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSeriesOver: Self = this.set("seriesOver", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTitle(value: StockChartTitle): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTooltip(value: StockChartTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTransitions(value: Boolean): Self = this.set("transitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitions: Self = this.set("transitions", js.undefined)
    @scala.inline
    def setValueAxisVarargs(value: StockChartValueAxisItem*): Self = this.set("valueAxis", js.Array(value :_*))
    @scala.inline
    def setValueAxis(value: StockChartValueAxisItem | js.Array[StockChartValueAxisItem]): Self = this.set("valueAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueAxis: Self = this.set("valueAxis", js.undefined)
    @scala.inline
    def setZoom(value: /* e */ StockChartZoomEvent => Unit): Self = this.set("zoom", js.Any.fromFunction1(value))
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    @scala.inline
    def setZoomEnd(value: /* e */ StockChartZoomEndEvent => Unit): Self = this.set("zoomEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteZoomEnd: Self = this.set("zoomEnd", js.undefined)
    @scala.inline
    def setZoomStart(value: /* e */ StockChartZoomStartEvent => Unit): Self = this.set("zoomStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteZoomStart: Self = this.set("zoomStart", js.undefined)
  }
  
}

