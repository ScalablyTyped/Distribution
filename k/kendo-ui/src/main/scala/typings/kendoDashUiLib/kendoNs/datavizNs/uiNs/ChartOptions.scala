package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartOptions extends js.Object {
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var axisDefaults: js.UndefOr[ChartAxisDefaults] = js.undefined
  var axisLabelClick: js.UndefOr[js.Function1[/* e */ ChartAxisLabelClickEvent, scala.Unit]] = js.undefined
  var categoryAxis: js.UndefOr[ChartCategoryAxisItem | js.Array[ChartCategoryAxisItem]] = js.undefined
  var chartArea: js.UndefOr[ChartChartArea] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ ChartDataBoundEvent, scala.Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ ChartDragEvent, scala.Unit]] = js.undefined
  var dragEnd: js.UndefOr[js.Function1[/* e */ ChartDragEndEvent, scala.Unit]] = js.undefined
  var dragStart: js.UndefOr[js.Function1[/* e */ ChartDragStartEvent, scala.Unit]] = js.undefined
  var legend: js.UndefOr[ChartLegend] = js.undefined
  var legendItemClick: js.UndefOr[js.Function1[/* e */ ChartLegendItemClickEvent, scala.Unit]] = js.undefined
  var legendItemHover: js.UndefOr[js.Function1[/* e */ ChartLegendItemHoverEvent, scala.Unit]] = js.undefined
  var legendItemLeave: js.UndefOr[js.Function1[/* e */ ChartLegendItemLeaveEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var noteClick: js.UndefOr[js.Function1[/* e */ ChartNoteClickEvent, scala.Unit]] = js.undefined
  var noteHover: js.UndefOr[js.Function1[/* e */ ChartNoteHoverEvent, scala.Unit]] = js.undefined
  var noteLeave: js.UndefOr[js.Function1[/* e */ ChartNoteLeaveEvent, scala.Unit]] = js.undefined
  var paneRender: js.UndefOr[js.Function1[/* e */ ChartPaneRenderEvent, scala.Unit]] = js.undefined
  var panes: js.UndefOr[js.Array[ChartPane]] = js.undefined
  var pannable: js.UndefOr[scala.Boolean | ChartPannable] = js.undefined
  var pdf: js.UndefOr[ChartPdf] = js.undefined
  var persistSeriesVisibility: js.UndefOr[scala.Boolean] = js.undefined
  var plotArea: js.UndefOr[ChartPlotArea] = js.undefined
  var plotAreaClick: js.UndefOr[js.Function1[/* e */ ChartPlotAreaClickEvent, scala.Unit]] = js.undefined
  var plotAreaHover: js.UndefOr[js.Function1[/* e */ ChartPlotAreaHoverEvent, scala.Unit]] = js.undefined
  var plotAreaLeave: js.UndefOr[js.Function1[/* e */ ChartPlotAreaLeaveEvent, scala.Unit]] = js.undefined
  var render: js.UndefOr[js.Function1[/* e */ ChartRenderEvent, scala.Unit]] = js.undefined
  var renderAs: js.UndefOr[java.lang.String] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ ChartSelectEvent, scala.Unit]] = js.undefined
  var selectEnd: js.UndefOr[js.Function1[/* e */ ChartSelectEndEvent, scala.Unit]] = js.undefined
  var selectStart: js.UndefOr[js.Function1[/* e */ ChartSelectStartEvent, scala.Unit]] = js.undefined
  var series: js.UndefOr[js.Array[ChartSeriesItem]] = js.undefined
  var seriesClick: js.UndefOr[js.Function1[/* e */ ChartSeriesClickEvent, scala.Unit]] = js.undefined
  var seriesColors: js.UndefOr[js.Any] = js.undefined
  var seriesDefaults: js.UndefOr[ChartSeriesDefaults] = js.undefined
  var seriesHover: js.UndefOr[js.Function1[/* e */ ChartSeriesHoverEvent, scala.Unit]] = js.undefined
  var seriesLeave: js.UndefOr[js.Function1[/* e */ ChartSeriesLeaveEvent, scala.Unit]] = js.undefined
  var seriesOver: js.UndefOr[js.Function1[/* e */ ChartSeriesOverEvent, scala.Unit]] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String | ChartTitle] = js.undefined
  var tooltip: js.UndefOr[ChartTooltip] = js.undefined
  var transitions: js.UndefOr[scala.Boolean] = js.undefined
  var valueAxis: js.UndefOr[ChartValueAxisItem | js.Array[ChartValueAxisItem]] = js.undefined
  var xAxis: js.UndefOr[ChartXAxisItem | js.Array[ChartXAxisItem]] = js.undefined
  var yAxis: js.UndefOr[ChartYAxisItem | js.Array[ChartYAxisItem]] = js.undefined
  var zoom: js.UndefOr[js.Function1[/* e */ ChartZoomEvent, scala.Unit]] = js.undefined
  var zoomEnd: js.UndefOr[js.Function1[/* e */ ChartZoomEndEvent, scala.Unit]] = js.undefined
  var zoomStart: js.UndefOr[js.Function1[/* e */ ChartZoomStartEvent, scala.Unit]] = js.undefined
  var zoomable: js.UndefOr[scala.Boolean | ChartZoomable] = js.undefined
}

object ChartOptions {
  @scala.inline
  def apply(
    autoBind: js.UndefOr[scala.Boolean] = js.undefined,
    axisDefaults: ChartAxisDefaults = null,
    axisLabelClick: /* e */ ChartAxisLabelClickEvent => scala.Unit = null,
    categoryAxis: ChartCategoryAxisItem | js.Array[ChartCategoryAxisItem] = null,
    chartArea: ChartChartArea = null,
    dataBound: /* e */ ChartDataBoundEvent => scala.Unit = null,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource = null,
    drag: /* e */ ChartDragEvent => scala.Unit = null,
    dragEnd: /* e */ ChartDragEndEvent => scala.Unit = null,
    dragStart: /* e */ ChartDragStartEvent => scala.Unit = null,
    legend: ChartLegend = null,
    legendItemClick: /* e */ ChartLegendItemClickEvent => scala.Unit = null,
    legendItemHover: /* e */ ChartLegendItemHoverEvent => scala.Unit = null,
    legendItemLeave: /* e */ ChartLegendItemLeaveEvent => scala.Unit = null,
    name: java.lang.String = null,
    noteClick: /* e */ ChartNoteClickEvent => scala.Unit = null,
    noteHover: /* e */ ChartNoteHoverEvent => scala.Unit = null,
    noteLeave: /* e */ ChartNoteLeaveEvent => scala.Unit = null,
    paneRender: /* e */ ChartPaneRenderEvent => scala.Unit = null,
    panes: js.Array[ChartPane] = null,
    pannable: scala.Boolean | ChartPannable = null,
    pdf: ChartPdf = null,
    persistSeriesVisibility: js.UndefOr[scala.Boolean] = js.undefined,
    plotArea: ChartPlotArea = null,
    plotAreaClick: /* e */ ChartPlotAreaClickEvent => scala.Unit = null,
    plotAreaHover: /* e */ ChartPlotAreaHoverEvent => scala.Unit = null,
    plotAreaLeave: /* e */ ChartPlotAreaLeaveEvent => scala.Unit = null,
    render: /* e */ ChartRenderEvent => scala.Unit = null,
    renderAs: java.lang.String = null,
    select: /* e */ ChartSelectEvent => scala.Unit = null,
    selectEnd: /* e */ ChartSelectEndEvent => scala.Unit = null,
    selectStart: /* e */ ChartSelectStartEvent => scala.Unit = null,
    series: js.Array[ChartSeriesItem] = null,
    seriesClick: /* e */ ChartSeriesClickEvent => scala.Unit = null,
    seriesColors: js.Any = null,
    seriesDefaults: ChartSeriesDefaults = null,
    seriesHover: /* e */ ChartSeriesHoverEvent => scala.Unit = null,
    seriesLeave: /* e */ ChartSeriesLeaveEvent => scala.Unit = null,
    seriesOver: /* e */ ChartSeriesOverEvent => scala.Unit = null,
    theme: java.lang.String = null,
    title: java.lang.String | ChartTitle = null,
    tooltip: ChartTooltip = null,
    transitions: js.UndefOr[scala.Boolean] = js.undefined,
    valueAxis: ChartValueAxisItem | js.Array[ChartValueAxisItem] = null,
    xAxis: ChartXAxisItem | js.Array[ChartXAxisItem] = null,
    yAxis: ChartYAxisItem | js.Array[ChartYAxisItem] = null,
    zoom: /* e */ ChartZoomEvent => scala.Unit = null,
    zoomEnd: /* e */ ChartZoomEndEvent => scala.Unit = null,
    zoomStart: /* e */ ChartZoomStartEvent => scala.Unit = null,
    zoomable: scala.Boolean | ChartZoomable = null
  ): ChartOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (axisDefaults != null) __obj.updateDynamic("axisDefaults")(axisDefaults)
    if (axisLabelClick != null) __obj.updateDynamic("axisLabelClick")(js.Any.fromFunction1(axisLabelClick))
    if (categoryAxis != null) __obj.updateDynamic("categoryAxis")(categoryAxis.asInstanceOf[js.Any])
    if (chartArea != null) __obj.updateDynamic("chartArea")(chartArea)
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(js.Any.fromFunction1(dragEnd))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction1(dragStart))
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (legendItemClick != null) __obj.updateDynamic("legendItemClick")(js.Any.fromFunction1(legendItemClick))
    if (legendItemHover != null) __obj.updateDynamic("legendItemHover")(js.Any.fromFunction1(legendItemHover))
    if (legendItemLeave != null) __obj.updateDynamic("legendItemLeave")(js.Any.fromFunction1(legendItemLeave))
    if (name != null) __obj.updateDynamic("name")(name)
    if (noteClick != null) __obj.updateDynamic("noteClick")(js.Any.fromFunction1(noteClick))
    if (noteHover != null) __obj.updateDynamic("noteHover")(js.Any.fromFunction1(noteHover))
    if (noteLeave != null) __obj.updateDynamic("noteLeave")(js.Any.fromFunction1(noteLeave))
    if (paneRender != null) __obj.updateDynamic("paneRender")(js.Any.fromFunction1(paneRender))
    if (panes != null) __obj.updateDynamic("panes")(panes)
    if (pannable != null) __obj.updateDynamic("pannable")(pannable.asInstanceOf[js.Any])
    if (pdf != null) __obj.updateDynamic("pdf")(pdf)
    if (!js.isUndefined(persistSeriesVisibility)) __obj.updateDynamic("persistSeriesVisibility")(persistSeriesVisibility)
    if (plotArea != null) __obj.updateDynamic("plotArea")(plotArea)
    if (plotAreaClick != null) __obj.updateDynamic("plotAreaClick")(js.Any.fromFunction1(plotAreaClick))
    if (plotAreaHover != null) __obj.updateDynamic("plotAreaHover")(js.Any.fromFunction1(plotAreaHover))
    if (plotAreaLeave != null) __obj.updateDynamic("plotAreaLeave")(js.Any.fromFunction1(plotAreaLeave))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (renderAs != null) __obj.updateDynamic("renderAs")(renderAs)
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (selectEnd != null) __obj.updateDynamic("selectEnd")(js.Any.fromFunction1(selectEnd))
    if (selectStart != null) __obj.updateDynamic("selectStart")(js.Any.fromFunction1(selectStart))
    if (series != null) __obj.updateDynamic("series")(series)
    if (seriesClick != null) __obj.updateDynamic("seriesClick")(js.Any.fromFunction1(seriesClick))
    if (seriesColors != null) __obj.updateDynamic("seriesColors")(seriesColors)
    if (seriesDefaults != null) __obj.updateDynamic("seriesDefaults")(seriesDefaults)
    if (seriesHover != null) __obj.updateDynamic("seriesHover")(js.Any.fromFunction1(seriesHover))
    if (seriesLeave != null) __obj.updateDynamic("seriesLeave")(js.Any.fromFunction1(seriesLeave))
    if (seriesOver != null) __obj.updateDynamic("seriesOver")(js.Any.fromFunction1(seriesOver))
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (!js.isUndefined(transitions)) __obj.updateDynamic("transitions")(transitions)
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(js.Any.fromFunction1(zoom))
    if (zoomEnd != null) __obj.updateDynamic("zoomEnd")(js.Any.fromFunction1(zoomEnd))
    if (zoomStart != null) __obj.updateDynamic("zoomStart")(js.Any.fromFunction1(zoomStart))
    if (zoomable != null) __obj.updateDynamic("zoomable")(zoomable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartOptions]
  }
}

