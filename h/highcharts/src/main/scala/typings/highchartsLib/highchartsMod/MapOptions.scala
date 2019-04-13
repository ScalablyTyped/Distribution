package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var chart: js.UndefOr[ChartOptions] = js.undefined
  var colorAxis: js.UndefOr[ColorAxis] = js.undefined
  var legend: js.UndefOr[LegendOptions] = js.undefined
  var mapNavigation: js.UndefOr[Navigation] = js.undefined
  var plotOptions: js.UndefOr[PlotOptions] = js.undefined
  var series: js.UndefOr[js.Array[MapSeriesOptions]] = js.undefined
  var title: js.UndefOr[TitleOptions] = js.undefined
  var tooltip: js.UndefOr[TooltipOptions] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    chart: ChartOptions = null,
    colorAxis: ColorAxis = null,
    legend: LegendOptions = null,
    mapNavigation: Navigation = null,
    plotOptions: PlotOptions = null,
    series: js.Array[MapSeriesOptions] = null,
    title: TitleOptions = null,
    tooltip: TooltipOptions = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (chart != null) __obj.updateDynamic("chart")(chart)
    if (colorAxis != null) __obj.updateDynamic("colorAxis")(colorAxis)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (mapNavigation != null) __obj.updateDynamic("mapNavigation")(mapNavigation)
    if (plotOptions != null) __obj.updateDynamic("plotOptions")(plotOptions)
    if (series != null) __obj.updateDynamic("series")(series)
    if (title != null) __obj.updateDynamic("title")(title)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[MapOptions]
  }
}

