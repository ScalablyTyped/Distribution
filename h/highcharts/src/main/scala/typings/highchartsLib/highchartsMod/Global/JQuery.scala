package typings
package highchartsLib.highchartsMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def highcharts(): highchartsLib.highchartsMod.HighchartsNs.ChartObject = js.native
  /**
           * Creates a new Highcharts.Chart for the current JQuery selector; usually
           * a div selected by $('#container')
           * @param options Options for this chart
           * @return current {JQuery} selector the current JQuery selector
           */
  def highcharts(options: highchartsLib.highchartsMod.HighchartsNs.Options): JQuery = js.native
  /**
           * Creates a new Highcharts.Chart for the current JQuery selector; usually
           * a div selected by $('#container')
           * @param options Options for this chart
           * @param callback Callback function used to manipulate the constructed chart instance
           * @return current {JQuery} selector the current JQuery selector
           */
  def highcharts(
    options: highchartsLib.highchartsMod.HighchartsNs.Options,
    callback: js.Function1[/* chart */ highchartsLib.highchartsMod.HighchartsNs.ChartObject, scala.Unit]
  ): JQuery = js.native
}

