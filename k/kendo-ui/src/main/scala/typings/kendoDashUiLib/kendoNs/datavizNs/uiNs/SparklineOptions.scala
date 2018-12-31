package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineOptions extends js.Object {
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var axisDefaults: js.UndefOr[js.Any] = js.undefined
  var axisLabelClick: js.UndefOr[js.Function1[/* e */ SparklineAxisLabelClickEvent, scala.Unit]] = js.undefined
  var categoryAxis: js.UndefOr[SparklineCategoryAxisItem | js.Array[SparklineCategoryAxisItem]] = js.undefined
  var chartArea: js.UndefOr[SparklineChartArea] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ SparklineEvent, scala.Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ SparklineDragEvent, scala.Unit]] = js.undefined
  var dragEnd: js.UndefOr[js.Function1[/* e */ SparklineDragEndEvent, scala.Unit]] = js.undefined
  var dragStart: js.UndefOr[js.Function1[/* e */ SparklineDragStartEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var paneRender: js.UndefOr[js.Function1[/* e */ SparklinePaneRenderEvent, scala.Unit]] = js.undefined
  var plotArea: js.UndefOr[SparklinePlotArea] = js.undefined
  var plotAreaClick: js.UndefOr[js.Function1[/* e */ SparklinePlotAreaClickEvent, scala.Unit]] = js.undefined
  var plotAreaHover: js.UndefOr[js.Function1[/* e */ SparklinePlotAreaHoverEvent, scala.Unit]] = js.undefined
  var plotAreaLeave: js.UndefOr[js.Function1[/* e */ SparklinePlotAreaLeaveEvent, scala.Unit]] = js.undefined
  var pointWidth: js.UndefOr[scala.Double] = js.undefined
  var renderAs: js.UndefOr[java.lang.String] = js.undefined
  var series: js.UndefOr[js.Array[SparklineSeriesItem]] = js.undefined
  var seriesClick: js.UndefOr[js.Function1[/* e */ SparklineSeriesClickEvent, scala.Unit]] = js.undefined
  var seriesColors: js.UndefOr[js.Any] = js.undefined
  var seriesDefaults: js.UndefOr[SparklineSeriesDefaults] = js.undefined
  var seriesHover: js.UndefOr[js.Function1[/* e */ SparklineSeriesHoverEvent, scala.Unit]] = js.undefined
  var seriesLeave: js.UndefOr[js.Function1[/* e */ SparklineSeriesLeaveEvent, scala.Unit]] = js.undefined
  var seriesOver: js.UndefOr[js.Function1[/* e */ SparklineSeriesOverEvent, scala.Unit]] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var tooltip: js.UndefOr[SparklineTooltip] = js.undefined
  var transitions: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var valueAxis: js.UndefOr[SparklineValueAxisItem | js.Array[SparklineValueAxisItem]] = js.undefined
  var zoom: js.UndefOr[js.Function1[/* e */ SparklineZoomEvent, scala.Unit]] = js.undefined
  var zoomEnd: js.UndefOr[js.Function1[/* e */ SparklineZoomEndEvent, scala.Unit]] = js.undefined
  var zoomStart: js.UndefOr[js.Function1[/* e */ SparklineZoomStartEvent, scala.Unit]] = js.undefined
}

