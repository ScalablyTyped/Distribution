package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Job scheduling options.
  */
@js.native
trait SchemaJobScheduling extends js.Object {
  /**
    * Optional. Maximum number of times per hour a driver may be restarted as a
    * result of driver terminating with non-zero code before job is reported
    * failed.A job may be reported as thrashing if driver exits with non-zero
    * code 4 times within 10 minute window.Maximum value is 10.
    */
  var maxFailuresPerHour: js.UndefOr[Double] = js.native
}

object SchemaJobScheduling {
  @scala.inline
  def apply(): SchemaJobScheduling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobScheduling]
  }
  @scala.inline
  implicit class SchemaJobSchedulingOps[Self <: SchemaJobScheduling] (val x: Self) extends AnyVal {
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
    def setMaxFailuresPerHour(value: Double): Self = this.set("maxFailuresPerHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFailuresPerHour: Self = this.set("maxFailuresPerHour", js.undefined)
  }
  
}

