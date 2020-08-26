package typings.googleapis.cloudtasksV2Mod.cloudtasksV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of a task attempt.
  */
@js.native
trait SchemaAttempt extends js.Object {
  /**
    * Output only. The time that this attempt was dispatched.  `dispatch_time`
    * will be truncated to the nearest microsecond.
    */
  var dispatchTime: js.UndefOr[String] = js.native
  /**
    * Output only. The response from the worker for this attempt.  If
    * `response_time` is unset, then the task has not been attempted or is
    * currently running and the `response_status` field is meaningless.
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

object SchemaAttempt {
  @scala.inline
  def apply(): SchemaAttempt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttempt]
  }
  @scala.inline
  implicit class SchemaAttemptOps[Self <: SchemaAttempt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDispatchTime(value: String): Self = this.set("dispatchTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDispatchTime: Self = this.set("dispatchTime", js.undefined)
    @scala.inline
    def setResponseStatus(value: SchemaStatus): Self = this.set("responseStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseStatus: Self = this.set("responseStatus", js.undefined)
    @scala.inline
    def setResponseTime(value: String): Self = this.set("responseTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseTime: Self = this.set("responseTime", js.undefined)
    @scala.inline
    def setScheduleTime(value: String): Self = this.set("scheduleTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleTime: Self = this.set("scheduleTime", js.undefined)
  }
  
}

