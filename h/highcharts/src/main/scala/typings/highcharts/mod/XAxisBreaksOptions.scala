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
    breakSize: js.UndefOr[Double] = js.undefined,
    from: js.UndefOr[Double] = js.undefined,
    repeat: js.UndefOr[Double] = js.undefined,
    to: js.UndefOr[Double] = js.undefined
  ): XAxisBreaksOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(breakSize)) __obj.updateDynamic("breakSize")(breakSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(repeat)) __obj.updateDynamic("repeat")(repeat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAxisBreaksOptions]
  }
}

