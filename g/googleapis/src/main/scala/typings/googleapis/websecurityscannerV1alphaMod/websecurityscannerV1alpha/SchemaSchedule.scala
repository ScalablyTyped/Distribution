package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

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
  def apply(): SchemaSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchedule]
  }
  @scala.inline
  implicit class SchemaScheduleOps[Self <: SchemaSchedule] (val x: Self) extends AnyVal {
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
    def setIntervalDurationDays(value: Double): Self = this.set("intervalDurationDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntervalDurationDays: Self = this.set("intervalDurationDays", js.undefined)
    @scala.inline
    def setScheduleTime(value: String): Self = this.set("scheduleTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleTime: Self = this.set("scheduleTime", js.undefined)
  }
  
}

