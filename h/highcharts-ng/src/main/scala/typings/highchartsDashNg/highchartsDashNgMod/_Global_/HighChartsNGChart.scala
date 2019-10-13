package typings.highchartsDashNg.highchartsDashNgMod._Global_

import typings.highcharts.highchartsMod.Options
import typings.highchartsDashNg.Anon_CurrentMax
import typings.highchartsDashNg.Anon_Height
import typings.highchartsDashNg.Anon_Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//Instantiated Chart
trait HighChartsNGChart extends HighChartsNGConfig {
  //This is a simple way to access all the Highcharts API that is not currently managed by this directive.
  def getHighcharts(): js.Any
}

object HighChartsNGChart {
  @scala.inline
  def apply(
    getHighcharts: () => js.Any,
    options: Options,
    func: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ChartObject */ /* chart */ js.Any => Unit = null,
    loading: Boolean | String = null,
    noData: String = null,
    series: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IndividualSeriesOptions */ _
    ] = null,
    size: Anon_Height = null,
    title: Anon_Text = null,
    useHighStocks: js.UndefOr[Boolean] = js.undefined,
    xAxis: Anon_CurrentMax = null
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

