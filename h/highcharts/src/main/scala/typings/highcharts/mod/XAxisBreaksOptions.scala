package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxisBreaksOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) A number indicating how much space should
    * be left between the start and the end of the break. The break size is
    * given in axis units, so for instance on a `datetime` axis, a break size
    * of 3600000 would indicate the equivalent of an hour.
    */
  var breakSize: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The point where the break starts.
    */
  var from: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Defines an interval after which the break
    * appears again. By default the breaks do not repeat.
    */
  var repeat: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The point where the break ends.
    */
  var to: js.UndefOr[Double] = js.undefined
}

object XAxisBreaksOptions {
  @scala.inline
  def apply(
    breakSize: Int | Double = null,
    from: Int | Double = null,
    repeat: Int | Double = null,
    to: Int | Double = null
  ): XAxisBreaksOptions = {
    val __obj = js.Dynamic.literal()
    if (breakSize != null) __obj.updateDynamic("breakSize")(breakSize.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAxisBreaksOptions]
  }
}

