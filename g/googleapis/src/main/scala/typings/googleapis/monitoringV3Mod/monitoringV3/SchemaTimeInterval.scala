package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A time interval extending just after a start time through an end time. The
  * start time must not be later than the end time. The default start time is
  * the end time, making the startTime value technically optional. Whether this
  * is useful depends on the MetricKind. If the start and end times are the
  * same, the interval represents a point in time. This is appropriate for
  * GAUGE metrics, but not for DELTA and CUMULATIVE metrics, which cover a span
  * of time.
  */
@js.native
trait SchemaTimeInterval extends js.Object {
  /**
    * Required. The end of the time interval.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Optional. The beginning of the time interval. The default value for the
    * start time is the end time. The start time must not be later than the end
    * time.
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaTimeInterval {
  @scala.inline
  def apply(endTime: String = null, startTime: String = null): SchemaTimeInterval = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTimeInterval]
  }
}

