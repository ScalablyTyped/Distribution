package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineOptions extends js.Object {
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var axisDefaults: js.UndefOr[js.Any] = js.undefined
  var axisLabelClick: js.UndefOr[js.Function1[/* e */ SparklineAxisLabelClickEvent, Unit]] = js.undefined
  var categoryAxis: js.UndefOr[SparklineCategoryAxisItem | js.Array[SparklineCategoryAxisItem]] = js.undefined
  var chartArea: js.UndefOr[SparklineChartArea] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ SparklineEvent, Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ SparklineDragEvent, Unit]] = js.undefined
  var dragEnd: js.UndefOr[js.Function1[/* e */ SparklineDragEndEvent, Unit]] = js.undefined
  var dragStart: js.UndefOr[js.Function1[/* e */ SparklineDragStartEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var paneRender: js.UndefOr[js.Function1[/* e */ SparklinePaneRenderEvent, Unit]] = js.undefined
  var plotArea: js.UndefOr[SparklinePlotArea] = js.undefined
  var plotAreaClick: js.UndefOr[js.Function1[/* e */ SparklinePlotAreaClickEvent, Unit]] = js.undefined
  var plotAreaHover: js.UndefOr[js.Function1[/* e */ SparklinePlotAreaHoverEvent, Unit]] = js.undefined
  var plotAreaLeave: js.UndefOr[js.Function1[/* e */ SparklinePlotAreaLeaveEvent, Unit]] = js.undefined
  var pointWidth: js.UndefOr[Double] = js.undefined
  var renderAs: js.UndefOr[String] = js.undefined
  var series: js.UndefOr[js.Array[SparklineSeriesItem]] = js.undefined
  var seriesClick: js.UndefOr[js.Function1[/* e */ SparklineSeriesClickEvent, Unit]] = js.undefined
  var seriesColors: js.UndefOr[js.Any] = js.undefined
  var seriesDefaults: js.UndefOr[SparklineSeriesDefaults] = js.undefined
  var seriesHover: js.UndefOr[js.Function1[/* e */ SparklineSeriesHoverEvent, Unit]] = js.undefined
  var seriesLeave: js.UndefOr[js.Function1[/* e */ SparklineSeriesLeaveEvent, Unit]] = js.undefined
  var seriesOver: js.UndefOr[js.Function1[/* e */ SparklineSeriesOverEvent, Unit]] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[SparklineTooltip] = js.undefined
  var transitions: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var valueAxis: js.UndefOr[SparklineValueAxisItem | js.Array[SparklineValueAxisItem]] = js.undefined
  var zoom: js.UndefOr[js.Function1[/* e */ SparklineZoomEvent, Unit]] = js.undefined
  var zoomEnd: js.UndefOr[js.Function1[/* e */ SparklineZoomEndEvent, Unit]] = js.undefined
  var zoomStart: js.UndefOr[js.Function1[/* e */ SparklineZoomStartEvent, Unit]] = js.undefined
}

object SparklineOptions {
  @scala.inline
  def apply(
    autoBind: js.UndefOr[Boolean] = js.undefined,
    axisDefaults: js.Any = null,
    axisLabelClick: /* e */ SparklineAxisLabelClickEvent => Unit = null,
    categoryAxis: SparklineCategoryAxisItem | js.Array[SparklineCategoryAxisItem] = null,
    chartArea: SparklineChartArea = null,
    data: js.Any = null,
    dataBound: /* e */ SparklineEvent => Unit = null,
    dataSource: js.Any = null,
    drag: /* e */ SparklineDragEvent => Unit = null,
    dragEnd: /* e */ SparklineDragEndEvent => Unit = null,
    dragStart: /* e */ SparklineDragStartEvent => Unit = null,
    name: String = null,
    paneRender: /* e */ SparklinePaneRenderEvent => Unit = null,
    plotArea: SparklinePlotArea = null,
    plotAreaClick: /* e */ SparklinePlotAreaClickEvent => Unit = null,
    plotAreaHover: /* e */ SparklinePlotAreaHoverEvent => Unit = null,
    plotAreaLeave: /* e */ SparklinePlotAreaLeaveEvent => Unit = null,
    pointWidth: Int | Double = null,
    renderAs: String = null,
    series: js.Array[SparklineSeriesItem] = null,
    seriesClick: /* e */ SparklineSeriesClickEvent => Unit = null,
    seriesColors: js.Any = null,
    seriesDefaults: SparklineSeriesDefaults = null,
    seriesHover: /* e */ SparklineSeriesHoverEvent => Unit = null,
    seriesLeave: /* e */ SparklineSeriesLeaveEvent => Unit = null,
    seriesOver: /* e */ SparklineSeriesOverEvent => Unit = null,
    theme: String = null,
    tooltip: SparklineTooltip = null,
    transitions: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    valueAxis: SparklineValueAxisItem | js.Array[SparklineValueAxisItem] = null,
    zoom: /* e */ SparklineZoomEvent => Unit = null,
    zoomEnd: /* e */ SparklineZoomEndEvent => Unit = null,
    zoomStart: /* e */ SparklineZoomStartEvent => Unit = null
  ): SparklineOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (axisDefaults != null) __obj.updateDynamic("axisDefaults")(axisDefaults)
    if (axisLabelClick != null) __obj.updateDynamic("axisLabelClick")(js.Any.fromFunction1(axisLabelClick))
    if (categoryAxis != null) __obj.updateDynamic("categoryAxis")(categoryAxis.asInstanceOf[js.Any])
    if (chartArea != null) __obj.updateDynamic("chartArea")(chartArea)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(js.Any.fromFunction1(dragEnd))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction1(dragStart))
    if (name != null) __obj.updateDynamic("name")(name)
    if (paneRender != null) __obj.updateDynamic("paneRender")(js.Any.fromFunction1(paneRender))
    if (plotArea != null) __obj.updateDynamic("plotArea")(plotArea)
    if (plotAreaClick != null) __obj.updateDynamic("plotAreaClick")(js.Any.fromFunction1(plotAreaClick))
    if (plotAreaHover != null) __obj.updateDynamic("plotAreaHover")(js.Any.fromFunction1(plotAreaHover))
    if (plotAreaLeave != null) __obj.updateDynamic("plotAreaLeave")(js.Any.fromFunction1(plotAreaLeave))
    if (pointWidth != null) __obj.updateDynamic("pointWidth")(pointWidth.asInstanceOf[js.Any])
    if (renderAs != null) __obj.updateDynamic("renderAs")(renderAs)
    if (series != null) __obj.updateDynamic("series")(series)
    if (seriesClick != null) __obj.updateDynamic("seriesClick")(js.Any.fromFunction1(seriesClick))
    if (seriesColors != null) __obj.updateDynamic("seriesColors")(seriesColors)
    if (seriesDefaults != null) __obj.updateDynamic("seriesDefaults")(seriesDefaults)
    if (seriesHover != null) __obj.updateDynamic("seriesHover")(js.Any.fromFunction1(seriesHover))
    if (seriesLeave != null) __obj.updateDynamic("seriesLeave")(js.Any.fromFunction1(seriesLeave))
    if (seriesOver != null) __obj.updateDynamic("seriesOver")(js.Any.fromFunction1(seriesOver))
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (!js.isUndefined(transitions)) __obj.updateDynamic("transitions")(transitions)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(js.Any.fromFunction1(zoom))
    if (zoomEnd != null) __obj.updateDynamic("zoomEnd")(js.Any.fromFunction1(zoomEnd))
    if (zoomStart != null) __obj.updateDynamic("zoomStart")(js.Any.fromFunction1(zoomStart))
    __obj.asInstanceOf[SparklineOptions]
  }
}

