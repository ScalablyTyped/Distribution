package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisBreak extends js.Object {
  /**
    * A number indicating how much space should be left between the start and the end of the break. The break size is
    * given in axis units, so for instance on a datetime axis, a break size of 3600000 would indicate the equivalent of
    * an hour.
    * @default 0
    * @since 4.1.0
    */
  var breakSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The point where the break starts.
    * @since 4.1.0
    */
  var from: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defines an interval after which the break appears again. By default the breaks do not repeat.
    * @default 0
    * @since 4.1.0
    */
  var repeat: js.UndefOr[scala.Double] = js.undefined
  /**
    * The point where the break ends.
    * @since 4.1.0
    */
  var to: js.UndefOr[scala.Double] = js.undefined
}

object AxisBreak {
  @scala.inline
  def apply(
    breakSize: scala.Int | scala.Double = null,
    from: scala.Int | scala.Double = null,
    repeat: scala.Int | scala.Double = null,
    to: scala.Int | scala.Double = null
  ): AxisBreak = {
    val __obj = js.Dynamic.literal()
    if (breakSize != null) __obj.updateDynamic("breakSize")(breakSize.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisBreak]
  }
}

