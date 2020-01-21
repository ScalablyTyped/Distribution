package typings.highcharts.highmapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts/highmaps", "Tick")
@js.native
class Tick protected ()
  extends typings.highcharts.mod.Tick {
  /**
    * The Tick class.
    *
    * @param axis
    *        The axis of the tick.
    *
    * @param pos
    *        The position of the tick on the axis in terms of axis values.
    *
    * @param type
    *        The type of tick, either 'minor' or an empty string
    *
    * @param noLabel
    *        Whether to disable the label or not. Defaults to false.
    *
    * @param parameters
    *        Optional parameters for the tick.
    */
  def this(axis: typings.highcharts.mod.Axis, pos: Double) = this()
  def this(axis: typings.highcharts.mod.Axis, pos: Double, `type`: String) = this()
  def this(axis: typings.highcharts.mod.Axis, pos: Double, `type`: String, noLabel: Boolean) = this()
  def this(
    axis: typings.highcharts.mod.Axis,
    pos: Double,
    `type`: String,
    noLabel: Boolean,
    parameters: js.Object
  ) = this()
}

