package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartOptions extends js.Object {
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var axisDefaults: js.UndefOr[js.Any] = js.undefined
  var axisLabelClick: js.UndefOr[js.Function1[/* e */ StockChartAxisLabelClickEvent, scala.Unit]] = js.undefined
  var categoryAxis: js.UndefOr[StockChartCategoryAxisItem | js.Array[StockChartCategoryAxisItem]] = js.undefined
  var chartArea: js.UndefOr[StockChartChartArea] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ StockChartEvent, scala.Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any] = js.undefined
  var dateField: js.UndefOr[java.lang.String] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ StockChartDragEvent, scala.Unit]] = js.undefined
  var dragEnd: js.UndefOr[js.Function1[/* e */ StockChartDragEndEvent, scala.Unit]] = js.undefined
  var dragStart: js.UndefOr[js.Function1[/* e */ StockChartDragStartEvent, scala.Unit]] = js.undefined
  var legend: js.UndefOr[StockChartLegend] = js.undefined
  var legendItemClick: js.UndefOr[js.Function1[/* e */ StockChartLegendItemClickEvent, scala.Unit]] = js.undefined
  var legendItemHover: js.UndefOr[js.Function1[/* e */ StockChartLegendItemHoverEvent, scala.Unit]] = js.undefined
  var legendItemLeave: js.UndefOr[js.Function1[/* e */ StockChartLegendItemLeaveEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var navigator: js.UndefOr[StockChartNavigator] = js.undefined
  var noteClick: js.UndefOr[js.Function1[/* e */ StockChartNoteClickEvent, scala.Unit]] = js.undefined
  var noteHover: js.UndefOr[js.Function1[/* e */ StockChartNoteHoverEvent, scala.Unit]] = js.undefined
  var noteLeave: js.UndefOr[js.Function1[/* e */ StockChartNoteLeaveEvent, scala.Unit]] = js.undefined
  var paneRender: js.UndefOr[js.Function1[/* e */ StockChartPaneRenderEvent, scala.Unit]] = js.undefined
  var panes: js.UndefOr[js.Array[StockChartPane]] = js.undefined
  var pdf: js.UndefOr[StockChartPdf] = js.undefined
  var persistSeriesVisibility: js.UndefOr[scala.Boolean] = js.undefined
  var plotArea: js.UndefOr[StockChartPlotArea] = js.undefined
  var plotAreaClick: js.UndefOr[js.Function1[/* e */ StockChartPlotAreaClickEvent, scala.Unit]] = js.undefined
  var plotAreaHover: js.UndefOr[js.Function1[/* e */ StockChartPlotAreaHoverEvent, scala.Unit]] = js.undefined
  var plotAreaLeave: js.UndefOr[js.Function1[/* e */ StockChartPlotAreaLeaveEvent, scala.Unit]] = js.undefined
  var render: js.UndefOr[js.Function1[/* e */ StockChartRenderEvent, scala.Unit]] = js.undefined
  var renderAs: js.UndefOr[java.lang.String] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ StockChartSelectEvent, scala.Unit]] = js.undefined
  var selectEnd: js.UndefOr[js.Function1[/* e */ StockChartSelectEndEvent, scala.Unit]] = js.undefined
  var selectStart: js.UndefOr[js.Function1[/* e */ StockChartSelectStartEvent, scala.Unit]] = js.undefined
  var series: js.UndefOr[js.Array[StockChartSeriesItem]] = js.undefined
  var seriesClick: js.UndefOr[js.Function1[/* e */ StockChartSeriesClickEvent, scala.Unit]] = js.undefined
  var seriesColors: js.UndefOr[js.Any] = js.undefined
  var seriesDefaults: js.UndefOr[StockChartSeriesDefaults] = js.undefined
  var seriesHover: js.UndefOr[js.Function1[/* e */ StockChartSeriesHoverEvent, scala.Unit]] = js.undefined
  var seriesLeave: js.UndefOr[js.Function1[/* e */ StockChartSeriesLeaveEvent, scala.Unit]] = js.undefined
  var seriesOver: js.UndefOr[js.Function1[/* e */ StockChartSeriesOverEvent, scala.Unit]] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[StockChartTitle] = js.undefined
  var tooltip: js.UndefOr[StockChartTooltip] = js.undefined
  var transitions: js.UndefOr[scala.Boolean] = js.undefined
  var valueAxis: js.UndefOr[StockChartValueAxisItem | js.Array[StockChartValueAxisItem]] = js.undefined
  var zoom: js.UndefOr[js.Function1[/* e */ StockChartZoomEvent, scala.Unit]] = js.undefined
  var zoomEnd: js.UndefOr[js.Function1[/* e */ StockChartZoomEndEvent, scala.Unit]] = js.undefined
  var zoomStart: js.UndefOr[js.Function1[/* e */ StockChartZoomStartEvent, scala.Unit]] = js.undefined
}

object StockChartOptions {
  @scala.inline
  def apply(
    autoBind: js.UndefOr[scala.Boolean] = js.undefined,
    axisDefaults: js.Any = null,
    axisLabelClick: js.Function1[/* e */ StockChartAxisLabelClickEvent, scala.Unit] = null,
    categoryAxis: StockChartCategoryAxisItem | js.Array[StockChartCategoryAxisItem] = null,
    chartArea: StockChartChartArea = null,
    dataBound: js.Function1[/* e */ StockChartEvent, scala.Unit] = null,
    dataSource: js.Any = null,
    dateField: java.lang.String = null,
    drag: js.Function1[/* e */ StockChartDragEvent, scala.Unit] = null,
    dragEnd: js.Function1[/* e */ StockChartDragEndEvent, scala.Unit] = null,
    dragStart: js.Function1[/* e */ StockChartDragStartEvent, scala.Unit] = null,
    legend: StockChartLegend = null,
    legendItemClick: js.Function1[/* e */ StockChartLegendItemClickEvent, scala.Unit] = null,
    legendItemHover: js.Function1[/* e */ StockChartLegendItemHoverEvent, scala.Unit] = null,
    legendItemLeave: js.Function1[/* e */ StockChartLegendItemLeaveEvent, scala.Unit] = null,
    name: java.lang.String = null,
    navigator: StockChartNavigator = null,
    noteClick: js.Function1[/* e */ StockChartNoteClickEvent, scala.Unit] = null,
    noteHover: js.Function1[/* e */ StockChartNoteHoverEvent, scala.Unit] = null,
    noteLeave: js.Function1[/* e */ StockChartNoteLeaveEvent, scala.Unit] = null,
    paneRender: js.Function1[/* e */ StockChartPaneRenderEvent, scala.Unit] = null,
    panes: js.Array[StockChartPane] = null,
    pdf: StockChartPdf = null,
    persistSeriesVisibility: js.UndefOr[scala.Boolean] = js.undefined,
    plotArea: StockChartPlotArea = null,
    plotAreaClick: js.Function1[/* e */ StockChartPlotAreaClickEvent, scala.Unit] = null,
    plotAreaHover: js.Function1[/* e */ StockChartPlotAreaHoverEvent, scala.Unit] = null,
    plotAreaLeave: js.Function1[/* e */ StockChartPlotAreaLeaveEvent, scala.Unit] = null,
    render: js.Function1[/* e */ StockChartRenderEvent, scala.Unit] = null,
    renderAs: java.lang.String = null,
    select: js.Function1[/* e */ StockChartSelectEvent, scala.Unit] = null,
    selectEnd: js.Function1[/* e */ StockChartSelectEndEvent, scala.Unit] = null,
    selectStart: js.Function1[/* e */ StockChartSelectStartEvent, scala.Unit] = null,
    series: js.Array[StockChartSeriesItem] = null,
    seriesClick: js.Function1[/* e */ StockChartSeriesClickEvent, scala.Unit] = null,
    seriesColors: js.Any = null,
    seriesDefaults: StockChartSeriesDefaults = null,
    seriesHover: js.Function1[/* e */ StockChartSeriesHoverEvent, scala.Unit] = null,
    seriesLeave: js.Function1[/* e */ StockChartSeriesLeaveEvent, scala.Unit] = null,
    seriesOver: js.Function1[/* e */ StockChartSeriesOverEvent, scala.Unit] = null,
    theme: java.lang.String = null,
    title: StockChartTitle = null,
    tooltip: StockChartTooltip = null,
    transitions: js.UndefOr[scala.Boolean] = js.undefined,
    valueAxis: StockChartValueAxisItem | js.Array[StockChartValueAxisItem] = null,
    zoom: js.Function1[/* e */ StockChartZoomEvent, scala.Unit] = null,
    zoomEnd: js.Function1[/* e */ StockChartZoomEndEvent, scala.Unit] = null,
    zoomStart: js.Function1[/* e */ StockChartZoomStartEvent, scala.Unit] = null
  ): StockChartOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (axisDefaults != null) __obj.updateDynamic("axisDefaults")(axisDefaults)
    if (axisLabelClick != null) __obj.updateDynamic("axisLabelClick")(axisLabelClick)
    if (categoryAxis != null) __obj.updateDynamic("categoryAxis")(categoryAxis.asInstanceOf[js.Any])
    if (chartArea != null) __obj.updateDynamic("chartArea")(chartArea)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (dateField != null) __obj.updateDynamic("dateField")(dateField)
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(dragEnd)
    if (dragStart != null) __obj.updateDynamic("dragStart")(dragStart)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (legendItemClick != null) __obj.updateDynamic("legendItemClick")(legendItemClick)
    if (legendItemHover != null) __obj.updateDynamic("legendItemHover")(legendItemHover)
    if (legendItemLeave != null) __obj.updateDynamic("legendItemLeave")(legendItemLeave)
    if (name != null) __obj.updateDynamic("name")(name)
    if (navigator != null) __obj.updateDynamic("navigator")(navigator)
    if (noteClick != null) __obj.updateDynamic("noteClick")(noteClick)
    if (noteHover != null) __obj.updateDynamic("noteHover")(noteHover)
    if (noteLeave != null) __obj.updateDynamic("noteLeave")(noteLeave)
    if (paneRender != null) __obj.updateDynamic("paneRender")(paneRender)
    if (panes != null) __obj.updateDynamic("panes")(panes)
    if (pdf != null) __obj.updateDynamic("pdf")(pdf)
    if (!js.isUndefined(persistSeriesVisibility)) __obj.updateDynamic("persistSeriesVisibility")(persistSeriesVisibility)
    if (plotArea != null) __obj.updateDynamic("plotArea")(plotArea)
    if (plotAreaClick != null) __obj.updateDynamic("plotAreaClick")(plotAreaClick)
    if (plotAreaHover != null) __obj.updateDynamic("plotAreaHover")(plotAreaHover)
    if (plotAreaLeave != null) __obj.updateDynamic("plotAreaLeave")(plotAreaLeave)
    if (render != null) __obj.updateDynamic("render")(render)
    if (renderAs != null) __obj.updateDynamic("renderAs")(renderAs)
    if (select != null) __obj.updateDynamic("select")(select)
    if (selectEnd != null) __obj.updateDynamic("selectEnd")(selectEnd)
    if (selectStart != null) __obj.updateDynamic("selectStart")(selectStart)
    if (series != null) __obj.updateDynamic("series")(series)
    if (seriesClick != null) __obj.updateDynamic("seriesClick")(seriesClick)
    if (seriesColors != null) __obj.updateDynamic("seriesColors")(seriesColors)
    if (seriesDefaults != null) __obj.updateDynamic("seriesDefaults")(seriesDefaults)
    if (seriesHover != null) __obj.updateDynamic("seriesHover")(seriesHover)
    if (seriesLeave != null) __obj.updateDynamic("seriesLeave")(seriesLeave)
    if (seriesOver != null) __obj.updateDynamic("seriesOver")(seriesOver)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (title != null) __obj.updateDynamic("title")(title)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (!js.isUndefined(transitions)) __obj.updateDynamic("transitions")(transitions)
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom)
    if (zoomEnd != null) __obj.updateDynamic("zoomEnd")(zoomEnd)
    if (zoomStart != null) __obj.updateDynamic("zoomStart")(zoomStart)
    __obj.asInstanceOf[StockChartOptions]
  }
}

