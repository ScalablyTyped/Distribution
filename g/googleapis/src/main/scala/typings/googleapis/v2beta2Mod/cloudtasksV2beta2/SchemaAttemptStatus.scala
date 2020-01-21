package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of a task attempt.
  */
@js.native
trait SchemaAttemptStatus extends js.Object {
  /**
    * Output only. The time that this attempt was dispatched.  `dispatch_time`
    * will be truncated to the nearest microsecond.
    */
  var dispatchTime: js.UndefOr[String] = js.native
  /**
    * Output only. The response from the target for this attempt.  If the task
    * has not been attempted or the task is currently running then the response
    * status is unset.
    */
  var responseStatus: js.UndefOr[SchemaStatus] = js.native
  /**
    * Output only. The time that this attempt response was received.
    * `response_time` will be truncated to the nearest microsecond.
    */
  var responseTime: js.UndefOr[String] = js.native
  /**
    * Output only. The time that this attempt was scheduled.  `schedule_time`
    * will be truncated to the nearest microsecond.
    */
  var scheduleTime: js.UndefOr[String] = js.native
}

object SchemaAttemptStatus {
  @scala.inline
  def apply(
    dispatchTime: String = null,
    responseStatus: SchemaStatus = null,
    responseTime: String = null,
    scheduleTime: String = null
  ): SchemaAttemptStatus = {
    val __obj = js.Dynamic.literal()
    if (dispatchTime != null) __obj.updateDynamic("dispatchTime")(dispatchTime.asInstanceOf[js.Any])
    if (responseStatus != null) __obj.updateDynamic("responseStatus")(responseStatus.asInstanceOf[js.Any])
    if (responseTime != null) __obj.updateDynamic("responseTime")(responseTime.asInstanceOf[js.Any])
    if (scheduleTime != null) __obj.updateDynamic("scheduleTime")(scheduleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAttemptStatus]
  }
}

