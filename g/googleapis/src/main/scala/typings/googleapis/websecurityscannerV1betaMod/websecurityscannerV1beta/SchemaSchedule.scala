package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Scan schedule configuration.
  */
@js.native
trait SchemaSchedule extends js.Object {
  /**
    * Required. The duration of time between executions in days.
    */
  var intervalDurationDays: js.UndefOr[Double] = js.native
  /**
    * A timestamp indicates when the next run will be scheduled. The value is
    * refreshed by the server after each run. If unspecified, it will default
    * to current server time, which means the scan will be scheduled to start
    * immediately.
    */
  var scheduleTime: js.UndefOr[String] = js.native
}

object SchemaSchedule {
  @scala.inline
  def apply(intervalDurationDays: Int | Double = null, scheduleTime: String = null): SchemaSchedule = {
    val __obj = js.Dynamic.literal()
    if (intervalDurationDays != null) __obj.updateDynamic("intervalDurationDays")(intervalDurationDays.asInstanceOf[js.Any])
    if (scheduleTime != null) __obj.updateDynamic("scheduleTime")(scheduleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSchedule]
  }
}

