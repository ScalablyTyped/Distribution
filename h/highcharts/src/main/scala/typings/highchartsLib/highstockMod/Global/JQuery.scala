package typings
package highchartsLib.highstockMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def highcharts(`type`: java.lang.String): highchartsLib.highchartsMod.HighchartsNs.ChartObject = js.native
  def highcharts(`type`: java.lang.String, options: highchartsLib.highchartsMod.HighchartsNs.Options): JQuery = js.native
  def highcharts(
    `type`: java.lang.String,
    options: highchartsLib.highchartsMod.HighchartsNs.Options,
    callback: js.Function1[/* chart */ highchartsLib.highchartsMod.HighchartsNs.ChartObject, scala.Unit]
  ): JQuery = js.native
  @JSName("highcharts")
  def highcharts_StockChart(`type`: highchartsLib.highchartsLibStrings.StockChart): highchartsLib.highstockMod.HighstockNs.ChartObject = js.native
  /**
           * Creates a new Highcharts.Chart for the current JQuery selector; usually
           * a div selected by $('#container')
           * @param options Options for this chart
           * @return current selector the current JQuery selector
           */
  @JSName("highcharts")
  def highcharts_StockChart(
    `type`: highchartsLib.highchartsLibStrings.StockChart,
    options: highchartsLib.highstockMod.HighstockNs.Options
  ): JQuery = js.native
  /**
           * Creates a new Highcharts.Chart for the current JQuery selector; usually
           * a div selected by $('#container')
           * @param options Options for this chart
           * @param callback Callback function used to manipulate the constructed chart instance
           * @return current selector the current JQuery selector
           */
  @JSName("highcharts")
  def highcharts_StockChart(
    `type`: highchartsLib.highchartsLibStrings.StockChart,
    options: highchartsLib.highstockMod.HighstockNs.Options,
    callback: js.Function1[/* chart */ highchartsLib.highstockMod.HighstockNs.ChartObject, scala.Unit]
  ): JQuery = js.native
}

