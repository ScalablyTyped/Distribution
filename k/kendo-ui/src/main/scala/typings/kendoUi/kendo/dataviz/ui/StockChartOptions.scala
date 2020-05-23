package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartOptions extends js.Object {
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var axisDefaults: js.UndefOr[js.Any] = js.undefined
  var axisLabelClick: js.UndefOr[js.Function1[/* e */ StockChartAxisLabelClickEvent, Unit]] = js.undefined
  var categoryAxis: js.UndefOr[StockChartCategoryAxisItem | js.Array[StockChartCategoryAxisItem]] = js.undefined
  var chartArea: js.UndefOr[StockChartChartArea] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ StockChartEvent, Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any] = js.undefined
  var dateField: js.UndefOr[String] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ StockChartDragEvent, Unit]] = js.undefined
  var dragEnd: js.UndefOr[js.Function1[/* e */ StockChartDragEndEvent, Unit]] = js.undefined
  var dragStart: js.UndefOr[js.Function1[/* e */ StockChartDragStartEvent, Unit]] = js.undefined
  var legend: js.UndefOr[StockChartLegend] = js.undefined
  var legendItemClick: js.UndefOr[js.Function1[/* e */ StockChartLegendItemClickEvent, Unit]] = js.undefined
  var legendItemHover: js.UndefOr[js.Function1[/* e */ StockChartLegendItemHoverEvent, Unit]] = js.undefined
  var legendItemLeave: js.UndefOr[js.Function1[/* e */ StockChartLegendItemLeaveEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var navigator: js.UndefOr[StockChartNavigator] = js.undefined
  var noteClick: js.UndefOr[js.Function1[/* e */ StockChartNoteClickEvent, Unit]] = js.undefined
  var noteHover: js.UndefOr[js.Function1[/* e */ StockChartNoteHoverEvent, Unit]] = js.undefined
  var noteLeave: js.UndefOr[js.Function1[/* e */ StockChartNoteLeaveEvent, Unit]] = js.undefined
  var paneRender: js.UndefOr[js.Function1[/* e */ StockChartPaneRenderEvent, Unit]] = js.undefined
  var panes: js.UndefOr[js.Array[StockChartPane]] = js.undefined
  var pdf: js.UndefOr[StockChartPdf] = js.undefined
  var persistSeriesVisibility: js.UndefOr[Boolean] = js.undefined
  var plotArea: js.UndefOr[StockChartPlotArea] = js.undefined
  var plotAreaClick: js.UndefOr[js.Function1[/* e */ StockChartPlotAreaClickEvent, Unit]] = js.undefined
  var plotAreaHover: js.UndefOr[js.Function1[/* e */ StockChartPlotAreaHoverEvent, Unit]] = js.undefined
  var plotAreaLeave: js.UndefOr[js.Function1[/* e */ StockChartPlotAreaLeaveEvent, Unit]] = js.undefined
  var render: js.UndefOr[js.Function1[/* e */ StockChartRenderEvent, Unit]] = js.undefined
  var renderAs: js.UndefOr[String] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ StockChartSelectEvent, Unit]] = js.undefined
  var selectEnd: js.UndefOr[js.Function1[/* e */ StockChartSelectEndEvent, Unit]] = js.undefined
  var selectStart: js.UndefOr[js.Function1[/* e */ StockChartSelectStartEvent, Unit]] = js.undefined
  var series: js.UndefOr[js.Array[StockChartSeriesItem]] = js.undefined
  var seriesClick: js.UndefOr[js.Function1[/* e */ StockChartSeriesClickEvent, Unit]] = js.undefined
  var seriesColors: js.UndefOr[js.Any] = js.undefined
  var seriesDefaults: js.UndefOr[StockChartSeriesDefaults] = js.undefined
  var seriesHover: js.UndefOr[js.Function1[/* e */ StockChartSeriesHoverEvent, Unit]] = js.undefined
  var seriesLeave: js.UndefOr[js.Function1[/* e */ StockChartSeriesLeaveEvent, Unit]] = js.undefined
  var seriesOver: js.UndefOr[js.Function1[/* e */ StockChartSeriesOverEvent, Unit]] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[StockChartTitle] = js.undefined
  var tooltip: js.UndefOr[StockChartTooltip] = js.undefined
  var transitions: js.UndefOr[Boolean] = js.undefined
  var valueAxis: js.UndefOr[StockChartValueAxisItem | js.Array[StockChartValueAxisItem]] = js.undefined
  var zoom: js.UndefOr[js.Function1[/* e */ StockChartZoomEvent, Unit]] = js.undefined
  var zoomEnd: js.UndefOr[js.Function1[/* e */ StockChartZoomEndEvent, Unit]] = js.undefined
  var zoomStart: js.UndefOr[js.Function1[/* e */ StockChartZoomStartEvent, Unit]] = js.undefined
}

object StockChartOptions {
  @scala.inline
  def apply(
    autoBind: js.UndefOr[Boolean] = js.undefined,
    axisDefaults: js.Any = null,
    axisLabelClick: /* e */ StockChartAxisLabelClickEvent => Unit = null,
    categoryAxis: StockChartCategoryAxisItem | js.Array[StockChartCategoryAxisItem] = null,
    chartArea: StockChartChartArea = null,
    dataBound: /* e */ StockChartEvent => Unit = null,
    dataSource: js.Any = null,
    dateField: String = null,
    drag: /* e */ StockChartDragEvent => Unit = null,
    dragEnd: /* e */ StockChartDragEndEvent => Unit = null,
    dragStart: /* e */ StockChartDragStartEvent => Unit = null,
    legend: StockChartLegend = null,
    legendItemClick: /* e */ StockChartLegendItemClickEvent => Unit = null,
    legendItemHover: /* e */ StockChartLegendItemHoverEvent => Unit = null,
    legendItemLeave: /* e */ StockChartLegendItemLeaveEvent => Unit = null,
    name: String = null,
    navigator: StockChartNavigator = null,
    noteClick: /* e */ StockChartNoteClickEvent => Unit = null,
    noteHover: /* e */ StockChartNoteHoverEvent => Unit = null,
    noteLeave: /* e */ StockChartNoteLeaveEvent => Unit = null,
    paneRender: /* e */ StockChartPaneRenderEvent => Unit = null,
    panes: js.Array[StockChartPane] = null,
    pdf: StockChartPdf = null,
    persistSeriesVisibility: js.UndefOr[Boolean] = js.undefined,
    plotArea: StockChartPlotArea = null,
    plotAreaClick: /* e */ StockChartPlotAreaClickEvent => Unit = null,
    plotAreaHover: /* e */ StockChartPlotAreaHoverEvent => Unit = null,
    plotAreaLeave: /* e */ StockChartPlotAreaLeaveEvent => Unit = null,
    render: /* e */ StockChartRenderEvent => Unit = null,
    renderAs: String = null,
    select: /* e */ StockChartSelectEvent => Unit = null,
    selectEnd: /* e */ StockChartSelectEndEvent => Unit = null,
    selectStart: /* e */ StockChartSelectStartEvent => Unit = null,
    series: js.Array[StockChartSeriesItem] = null,
    seriesClick: /* e */ StockChartSeriesClickEvent => Unit = null,
    seriesColors: js.Any = null,
    seriesDefaults: StockChartSeriesDefaults = null,
    seriesHover: /* e */ StockChartSeriesHoverEvent => Unit = null,
    seriesLeave: /* e */ StockChartSeriesLeaveEvent => Unit = null,
    seriesOver: /* e */ StockChartSeriesOverEvent => Unit = null,
    theme: String = null,
    title: StockChartTitle = null,
    tooltip: StockChartTooltip = null,
    transitions: js.UndefOr[Boolean] = js.undefined,
    valueAxis: StockChartValueAxisItem | js.Array[StockChartValueAxisItem] = null,
    zoom: /* e */ StockChartZoomEvent => Unit = null,
    zoomEnd: /* e */ StockChartZoomEndEvent => Unit = null,
    zoomStart: /* e */ StockChartZoomStartEvent => Unit = null
  ): StockChartOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind.get.asInstanceOf[js.Any])
    if (axisDefaults != null) __obj.updateDynamic("axisDefaults")(axisDefaults.asInstanceOf[js.Any])
    if (axisLabelClick != null) __obj.updateDynamic("axisLabelClick")(js.Any.fromFunction1(axisLabelClick))
    if (categoryAxis != null) __obj.updateDynamic("categoryAxis")(categoryAxis.asInstanceOf[js.Any])
    if (chartArea != null) __obj.updateDynamic("chartArea")(chartArea.asInstanceOf[js.Any])
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dateField != null) __obj.updateDynamic("dateField")(dateField.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(js.Any.fromFunction1(dragEnd))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction1(dragStart))
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (legendItemClick != null) __obj.updateDynamic("legendItemClick")(js.Any.fromFunction1(legendItemClick))
    if (legendItemHover != null) __obj.updateDynamic("legendItemHover")(js.Any.fromFunction1(legendItemHover))
    if (legendItemLeave != null) __obj.updateDynamic("legendItemLeave")(js.Any.fromFunction1(legendItemLeave))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (navigator != null) __obj.updateDynamic("navigator")(navigator.asInstanceOf[js.Any])
    if (noteClick != null) __obj.updateDynamic("noteClick")(js.Any.fromFunction1(noteClick))
    if (noteHover != null) __obj.updateDynamic("noteHover")(js.Any.fromFunction1(noteHover))
    if (noteLeave != null) __obj.updateDynamic("noteLeave")(js.Any.fromFunction1(noteLeave))
    if (paneRender != null) __obj.updateDynamic("paneRender")(js.Any.fromFunction1(paneRender))
    if (panes != null) __obj.updateDynamic("panes")(panes.asInstanceOf[js.Any])
    if (pdf != null) __obj.updateDynamic("pdf")(pdf.asInstanceOf[js.Any])
    if (!js.isUndefined(persistSeriesVisibility)) __obj.updateDynamic("persistSeriesVisibility")(persistSeriesVisibility.get.asInstanceOf[js.Any])
    if (plotArea != null) __obj.updateDynamic("plotArea")(plotArea.asInstanceOf[js.Any])
    if (plotAreaClick != null) __obj.updateDynamic("plotAreaClick")(js.Any.fromFunction1(plotAreaClick))
    if (plotAreaHover != null) __obj.updateDynamic("plotAreaHover")(js.Any.fromFunction1(plotAreaHover))
    if (plotAreaLeave != null) __obj.updateDynamic("plotAreaLeave")(js.Any.fromFunction1(plotAreaLeave))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (renderAs != null) __obj.updateDynamic("renderAs")(renderAs.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (selectEnd != null) __obj.updateDynamic("selectEnd")(js.Any.fromFunction1(selectEnd))
    if (selectStart != null) __obj.updateDynamic("selectStart")(js.Any.fromFunction1(selectStart))
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (seriesClick != null) __obj.updateDynamic("seriesClick")(js.Any.fromFunction1(seriesClick))
    if (seriesColors != null) __obj.updateDynamic("seriesColors")(seriesColors.asInstanceOf[js.Any])
    if (seriesDefaults != null) __obj.updateDynamic("seriesDefaults")(seriesDefaults.asInstanceOf[js.Any])
    if (seriesHover != null) __obj.updateDynamic("seriesHover")(js.Any.fromFunction1(seriesHover))
    if (seriesLeave != null) __obj.updateDynamic("seriesLeave")(js.Any.fromFunction1(seriesLeave))
    if (seriesOver != null) __obj.updateDynamic("seriesOver")(js.Any.fromFunction1(seriesOver))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(transitions)) __obj.updateDynamic("transitions")(transitions.get.asInstanceOf[js.Any])
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(js.Any.fromFunction1(zoom))
    if (zoomEnd != null) __obj.updateDynamic("zoomEnd")(js.Any.fromFunction1(zoomEnd))
    if (zoomStart != null) __obj.updateDynamic("zoomStart")(js.Any.fromFunction1(zoomStart))
    __obj.asInstanceOf[StockChartOptions]
  }
}

