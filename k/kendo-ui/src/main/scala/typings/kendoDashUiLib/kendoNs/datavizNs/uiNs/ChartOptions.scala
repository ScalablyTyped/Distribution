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

