package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for renewing a lease using RenewLease.
  */
@js.native
trait SchemaRenewLeaseRequest extends js.Object {
  /**
    * Required.  The desired new lease duration, starting from now.   The
    * maximum lease duration is 1 week. `lease_duration` will be truncated to
    * the nearest second.
    */
  var leaseDuration: js.UndefOr[String] = js.native
  /**
    * The response_view specifies which subset of the Task will be returned. By
    * default response_view is BASIC; not all information is retrieved by
    * default because some data, such as payloads, might be desirable to return
    * only when needed because of its large size or because of the sensitivity
    * of data that it contains.  Authorization for FULL requires
    * `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    * permission on the Task resource.
    */
  var responseView: js.UndefOr[String] = js.native
  /**
    * Required.  The task&#39;s current schedule time, available in the
    * schedule_time returned by LeaseTasks response or RenewLease response.
    * This restriction is to ensure that your worker currently holds the lease.
    */
  var scheduleTime: js.UndefOr[String] = js.native
}

object SchemaRenewLeaseRequest {
  @scala.inline
  def apply(): SchemaRenewLeaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRenewLeaseRequest]
  }
  @scala.inline
  implicit class SchemaRenewLeaseRequestOps[Self <: SchemaRenewLeaseRequest] (val x: Self) extends AnyVal {
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
    def setLeaseDuration(value: String): Self = this.set("leaseDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaseDuration: Self = this.set("leaseDuration", js.undefined)
    @scala.inline
    def setResponseView(value: String): Self = this.set("responseView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseView: Self = this.set("responseView", js.undefined)
    @scala.inline
    def setScheduleTime(value: String): Self = this.set("scheduleTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleTime: Self = this.set("scheduleTime", js.undefined)
  }
  
}

