package typings
package highchartsDashNgLib.highchartsDashNgMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighChartsNGConfig extends js.Object {
  //function (optional) - setup some logic for the chart
  var func: js.UndefOr[
    js.Function1[/* chart */ highchartsLib.highchartsMod.HighchartsNs.ChartObject, scala.Unit]
  ] = js.undefined
  //Boolean to control showng loading status on chart (optional)
  //Could be a string if you want to show specific loading text.
  var loading: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  //no data text (optional) to show if all series are empty
  var noData: js.UndefOr[java.lang.String] = js.undefined
  var options: highchartsLib.highchartsMod.HighchartsNs.Options
  //The below properties are watched separately for changes.
  //Series object (optional) - a list of series using normal highcharts series options.
  var series: js.UndefOr[js.Array[highchartsLib.highchartsMod.HighchartsNs.IndividualSeriesOptions]] = js.undefined
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

