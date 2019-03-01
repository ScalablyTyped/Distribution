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

object SparklineOptions {
  @scala.inline
  def apply(
    autoBind: js.UndefOr[scala.Boolean] = js.undefined,
    axisDefaults: js.Any = null,
    axisLabelClick: js.Function1[/* e */ SparklineAxisLabelClickEvent, scala.Unit] = null,
    categoryAxis: SparklineCategoryAxisItem | js.Array[SparklineCategoryAxisItem] = null,
    chartArea: SparklineChartArea = null,
    data: js.Any = null,
    dataBound: js.Function1[/* e */ SparklineEvent, scala.Unit] = null,
    dataSource: js.Any = null,
    drag: js.Function1[/* e */ SparklineDragEvent, scala.Unit] = null,
    dragEnd: js.Function1[/* e */ SparklineDragEndEvent, scala.Unit] = null,
    dragStart: js.Function1[/* e */ SparklineDragStartEvent, scala.Unit] = null,
    name: java.lang.String = null,
    paneRender: js.Function1[/* e */ SparklinePaneRenderEvent, scala.Unit] = null,
    plotArea: SparklinePlotArea = null,
    plotAreaClick: js.Function1[/* e */ SparklinePlotAreaClickEvent, scala.Unit] = null,
    plotAreaHover: js.Function1[/* e */ SparklinePlotAreaHoverEvent, scala.Unit] = null,
    plotAreaLeave: js.Function1[/* e */ SparklinePlotAreaLeaveEvent, scala.Unit] = null,
    pointWidth: scala.Int | scala.Double = null,
    renderAs: java.lang.String = null,
    series: js.Array[SparklineSeriesItem] = null,
    seriesClick: js.Function1[/* e */ SparklineSeriesClickEvent, scala.Unit] = null,
    seriesColors: js.Any = null,
    seriesDefaults: SparklineSeriesDefaults = null,
    seriesHover: js.Function1[/* e */ SparklineSeriesHoverEvent, scala.Unit] = null,
    seriesLeave: js.Function1[/* e */ SparklineSeriesLeaveEvent, scala.Unit] = null,
    seriesOver: js.Function1[/* e */ SparklineSeriesOverEvent, scala.Unit] = null,
    theme: java.lang.String = null,
    tooltip: SparklineTooltip = null,
    transitions: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    valueAxis: SparklineValueAxisItem | js.Array[SparklineValueAxisItem] = null,
    zoom: js.Function1[/* e */ SparklineZoomEvent, scala.Unit] = null,
    zoomEnd: js.Function1[/* e */ SparklineZoomEndEvent, scala.Unit] = null,
    zoomStart: js.Function1[/* e */ SparklineZoomStartEvent, scala.Unit] = null
  ): SparklineOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (axisDefaults != null) __obj.updateDynamic("axisDefaults")(axisDefaults)
    if (axisLabelClick != null) __obj.updateDynamic("axisLabelClick")(axisLabelClick)
    if (categoryAxis != null) __obj.updateDynamic("categoryAxis")(categoryAxis.asInstanceOf[js.Any])
    if (chartArea != null) __obj.updateDynamic("chartArea")(chartArea)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(dragEnd)
    if (dragStart != null) __obj.updateDynamic("dragStart")(dragStart)
    if (name != null) __obj.updateDynamic("name")(name)
    if (paneRender != null) __obj.updateDynamic("paneRender")(paneRender)
    if (plotArea != null) __obj.updateDynamic("plotArea")(plotArea)
    if (plotAreaClick != null) __obj.updateDynamic("plotAreaClick")(plotAreaClick)
    if (plotAreaHover != null) __obj.updateDynamic("plotAreaHover")(plotAreaHover)
    if (plotAreaLeave != null) __obj.updateDynamic("plotAreaLeave")(plotAreaLeave)
    if (pointWidth != null) __obj.updateDynamic("pointWidth")(pointWidth.asInstanceOf[js.Any])
    if (renderAs != null) __obj.updateDynamic("renderAs")(renderAs)
    if (series != null) __obj.updateDynamic("series")(series)
    if (seriesClick != null) __obj.updateDynamic("seriesClick")(seriesClick)
    if (seriesColors != null) __obj.updateDynamic("seriesColors")(seriesColors)
    if (seriesDefaults != null) __obj.updateDynamic("seriesDefaults")(seriesDefaults)
    if (seriesHover != null) __obj.updateDynamic("seriesHover")(seriesHover)
    if (seriesLeave != null) __obj.updateDynamic("seriesLeave")(seriesLeave)
    if (seriesOver != null) __obj.updateDynamic("seriesOver")(seriesOver)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (!js.isUndefined(transitions)) __obj.updateDynamic("transitions")(transitions)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom)
    if (zoomEnd != null) __obj.updateDynamic("zoomEnd")(zoomEnd)
    if (zoomStart != null) __obj.updateDynamic("zoomStart")(zoomStart)
    __obj.asInstanceOf[SparklineOptions]
  }
}

