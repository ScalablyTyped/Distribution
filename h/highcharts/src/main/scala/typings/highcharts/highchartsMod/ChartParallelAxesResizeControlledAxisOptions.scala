package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartParallelAxesResizeControlledAxisOptions extends js.Object {
  /**
    * (Highstock) Array of axes that should move out of the way of resizing
    * being done for the current axis. If not set, the next axis will be used.
    */
  var next: js.UndefOr[js.Array[Double | String]] = js.undefined
  /**
    * (Highstock) Array of axes that should move with the current axis while
    * resizing.
    */
  var prev: js.UndefOr[js.Array[Double | String]] = js.undefined
}

object ChartParallelAxesResizeControlledAxisOptions {
  @scala.inline
  def apply(next: js.Array[Double | String] = null, prev: js.Array[Double | String] = null): ChartParallelAxesResizeControlledAxisOptions = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartParallelAxesResizeControlledAxisOptions]
  }
}

