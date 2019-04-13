package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendObject extends js.Object {
  /**
    * Update the legend with new options.
    * @param options New options that will be merged into the legend's existing options.
    * @param [boolean] redraw - Whether to redraw the chart. Defaults to true.
    * @since 5.0.0
    */
  def update(options: LegendOptions): scala.Unit = js.native
  def update(options: LegendOptions, redraw: scala.Boolean): scala.Unit = js.native
}

