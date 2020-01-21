package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single data point in a time series.
  */
@js.native
trait SchemaPoint extends js.Object {
  /**
    * The time interval to which the data point applies. For GAUGE metrics,
    * only the end time of the interval is used. For DELTA metrics, the start
    * and end time should specify a non-zero interval, with subsequent points
    * specifying contiguous and non-overlapping intervals. For CUMULATIVE
    * metrics, the start and end time should specify a non-zero interval, with
    * subsequent points specifying the same start time and increasing end
    * times, until an event resets the cumulative value to zero and sets a new
    * start time for the following points.
    */
  var interval: js.UndefOr[SchemaTimeInterval] = js.native
  /**
    * The value of the data point.
    */
  var value: js.UndefOr[SchemaTypedValue] = js.native
}

object SchemaPoint {
  @scala.inline
  def apply(interval: SchemaTimeInterval = null, value: SchemaTypedValue = null): SchemaPoint = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPoint]
  }
}

