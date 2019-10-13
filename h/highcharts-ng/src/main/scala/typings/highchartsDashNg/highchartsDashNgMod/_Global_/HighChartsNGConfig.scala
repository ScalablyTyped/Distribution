package typings.highchartsDashNg.highchartsDashNgMod._Global_

import typings.highcharts.highchartsMod.Options
import typings.highchartsDashNg.Anon_CurrentMax
import typings.highchartsDashNg.Anon_Height
import typings.highchartsDashNg.Anon_Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighChartsNGConfig extends js.Object {
  //function (optional) - setup some logic for the chart
  var func: js.UndefOr[
    js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ChartObject */ /* chart */ js.Any, 
      Unit
    ]
  ] = js.undefined
  //Boolean to control showng loading status on chart (optional)
  //Could be a string if you want to show specific loading text.
  var loading: js.UndefOr[Boolean | String] = js.undefined
  //no data text (optional) to show if all series are empty
  var noData: js.UndefOr[String] = js.undefined
  var options: Options
  //The below properties are watched separately for changes.
  //Series object (optional) - a list of series using normal highcharts series options.
  var series: js.UndefOr[
    js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IndividualSeriesOptions */ _
    ]
  ] = js.undefined
  //size (optional) if left out the chart will default to size of the div or something sensible.
  var size: js.UndefOr[Anon_Height] = js.undefined
  //Title configuration (optional)
  var title: js.UndefOr[Anon_Text] = js.undefined
  //Whether to use HighStocks instead of HighCharts (optional). Defaults to false.
  var useHighStocks: js.UndefOr[Boolean] = js.undefined
  //Configuration for the xAxis (optional). Currently only one x axis can be dynamically controlled.
  //properties currentMin and currentMax provied 2-way binding to the chart's maximimum and minimum
  var xAxis: js.UndefOr[Anon_CurrentMax] = js.undefined
}

object HighChartsNGConfig {
  @scala.inline
  def apply(
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
  ): HighChartsNGConfig = {
    val __obj = js.Dynamic.literal(options = options)
    if (func != null) __obj.updateDynamic("func")(js.Any.fromFunction1(func))
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (noData != null) __obj.updateDynamic("noData")(noData)
    if (series != null) __obj.updateDynamic("series")(series)
    if (size != null) __obj.updateDynamic("size")(size)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(useHighStocks)) __obj.updateDynamic("useHighStocks")(useHighStocks)
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis)
    __obj.asInstanceOf[HighChartsNGConfig]
  }
}

