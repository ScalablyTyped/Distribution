package typings
package highchartsLib.highstockMod.HighstockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static
  extends highchartsLib.highchartsMod.HighchartsNs.Static {
  var StockChart: Chart = js.native
  def stockChart(renderTo: java.lang.String, options: Options): ChartObject = js.native
  def stockChart(
    renderTo: java.lang.String,
    options: Options,
    callback: js.Function1[/* chart */ ChartObject, scala.Unit]
  ): ChartObject = js.native
  def stockChart(renderTo: stdLib.HTMLElement, options: Options): ChartObject = js.native
  def stockChart(
    renderTo: stdLib.HTMLElement,
    options: Options,
    callback: js.Function1[/* chart */ ChartObject, scala.Unit]
  ): ChartObject = js.native
}

