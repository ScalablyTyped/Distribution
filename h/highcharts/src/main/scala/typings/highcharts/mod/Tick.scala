package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts", "Tick")
@js.native
class Tick protected () extends js.Object {
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
  def this(axis: Axis, pos: Double) = this()
  def this(axis: Axis, pos: Double, `type`: String) = this()
  def this(axis: Axis, pos: Double, `type`: String, noLabel: Boolean) = this()
  def this(axis: Axis, pos: Double, `type`: String, noLabel: Boolean, parameters: js.Object) = this()
  /**
    * The related axis of the tick.
    */
  var axis: Axis = js.native
  /**
    * The rendered grid line of the tick.
    */
  var gridLine: js.UndefOr[SVGElement] = js.native
  /**
    * True if the tick is the first one on the axis.
    */
  val isFirst: js.UndefOr[Boolean] = js.native
  /**
    * True if the tick is the last one on the axis.
    */
  val isLast: js.UndefOr[Boolean] = js.native
  /**
    * The rendered label of the tick.
    */
  var label: js.UndefOr[SVGElement] = js.native
  /**
    * The rendered mark of the tick.
    */
  var mark: js.UndefOr[SVGElement] = js.native
  /**
    * The logical position of the tick on the axis in terms of axis values.
    */
  var pos: Double = js.native
  /**
    * The mark offset of the tick on the axis. Usually `undefined`, numeric for
    * grid axes.
    */
  var tickmarkOffset: js.UndefOr[Double] = js.native
  /**
    * The tick type, which can be `"minor"`, or an empty string.
    */
  var `type`: String = js.native
}

