package typings
package highchartsDashNgLib.highchartsDashNgMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighChartsNGConfig extends js.Object {
  //function (optional) - setup some logic for the chart
  var func: js.UndefOr[js.Function1[/* chart */ highchartsLib.highchartsMod.ChartObject, scala.Unit]] = js.undefined
  //Boolean to control showng loading status on chart (optional)
  //Could be a string if you want to show specific loading text.
  var loading: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  //no data text (optional) to show if all series are empty
  var noData: js.UndefOr[java.lang.String] = js.undefined
  var options: highchartsLib.highchartsMod.Options
  //The below properties are watched separately for changes.
  //Series object (optional) - a list of series using normal highcharts series options.
  var series: js.UndefOr[js.Array[highchartsLib.highchartsMod.IndividualSeriesOptions]] = js.undefined
  //size (optional) if left out the chart will default to size of the div or something sensible.
  var size: js.UndefOr[highchartsDashNgLib.Anon_Height] = js.undefined
  //Title configuration (optional)
  var title: js.UndefOr[highchartsDashNgLib.Anon_Text] = js.undefined
  //Whether to use HighStocks instead of HighCharts (optional). Defaults to false.
  var useHighStocks: js.UndefOr[scala.Boolean] = js.undefined
  //Configuration for the xAxis (optional). Currently only one x axis can be dynamically controlled.
  //properties currentMin and currentMax provied 2-way binding to the chart's maximimum and minimum
  var xAxis: js.UndefOr[highchartsDashNgLib.Anon_CurrentMax] = js.undefined
}

object HighChartsNGConfig {
  @scala.inline
  def apply(
    options: highchartsLib.highchartsMod.Options,
    func: /* chart */ highchartsLib.highchartsMod.ChartObject => scala.Unit = null,
    loading: scala.Boolean | java.lang.String = null,
    noData: java.lang.String = null,
    series: js.Array[highchartsLib.highchartsMod.IndividualSeriesOptions] = null,
    size: highchartsDashNgLib.Anon_Height = null,
    title: highchartsDashNgLib.Anon_Text = null,
    useHighStocks: js.UndefOr[scala.Boolean] = js.undefined,
    xAxis: highchartsDashNgLib.Anon_CurrentMax = null
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

