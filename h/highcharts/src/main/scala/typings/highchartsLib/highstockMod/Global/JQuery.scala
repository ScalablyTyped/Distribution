package typings
package highchartsLib.highstockMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def highcharts(`type`: java.lang.String): highchartsLib.highchartsMod.ChartObject = js.native
  def highcharts(`type`: java.lang.String, options: highchartsLib.highchartsMod.Options): JQuery = js.native
  def highcharts(
    `type`: java.lang.String,
    options: highchartsLib.highchartsMod.Options,
    callback: js.Function1[/* chart */ highchartsLib.highchartsMod.ChartObject, scala.Unit]
  ): JQuery = js.native
  @JSName("highcharts")
  def highcharts_StockChart(`type`: highchartsLib.highchartsLibStrings.StockChart): highchartsLib.highstockMod.ChartObject = js.native
  /**
    * Creates a new Highcharts.Chart for the current JQuery selector; usually
    * a div selected by $('#container')
    * @param options Options for this chart
    * @param callback Callback function used to manipulate the constructed chart instance
    * @return current selector the current JQuery selector
    */
  @JSName("highcharts")
  def highcharts_StockChart(`type`: highchartsLib.highchartsLibStrings.StockChart, options: highchartsLib.highstockMod.Options): JQuery = js.native
  @JSName("highcharts")
  def highcharts_StockChart(
    `type`: highchartsLib.highchartsLibStrings.StockChart,
    options: highchartsLib.highstockMod.Options,
    callback: js.Function1[/* chart */ highchartsLib.highstockMod.ChartObject, scala.Unit]
  ): JQuery = js.native
}

