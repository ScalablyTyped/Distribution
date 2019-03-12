package typings
package highchartsDashNgLib.highchartsDashNgMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//Instantiated Chart
trait HighChartsNGChart extends HighChartsNGConfig {
  //This is a simple way to access all the Highcharts API that is not currently managed by this directive.
  def getHighcharts(): highchartsLib.highchartsMod.HighchartsNs.ChartObject
}

object HighChartsNGChart {
  @scala.inline
  def apply(
    getHighcharts: () => highchartsLib.highchartsMod.HighchartsNs.ChartObject,
    options: highchartsLib.highchartsMod.HighchartsNs.Options,
    func: /* chart */ highchartsLib.highchartsMod.HighchartsNs.ChartObject => scala.Unit = null,
    loading: scala.Boolean | java.lang.String = null,
    noData: java.lang.String = null,
    series: js.Array[highchartsLib.highchartsMod.HighchartsNs.IndividualSeriesOptions] = null,
    size: highchartsDashNgLib.Anon_Height = null,
    title: highchartsDashNgLib.Anon_Text = null,
    useHighStocks: js.UndefOr[scala.Boolean] = js.undefined,
    xAxis: highchartsDashNgLib.Anon_CurrentMax = null
  ): HighChartsNGChart = {
    val __obj = js.Dynamic.literal(getHighcharts = js.Any.fromFunction0(getHighcharts), options = options)
    if (func != null) __obj.updateDynamic("func")(js.Any.fromFunction1(func))
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (noData != null) __obj.updateDynamic("noData")(noData)
    if (series != null) __obj.updateDynamic("series")(series)
    if (size != null) __obj.updateDynamic("size")(size)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(useHighStocks)) __obj.updateDynamic("useHighStocks")(useHighStocks)
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis)
    __obj.asInstanceOf[HighChartsNGChart]
  }
}

