package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Status of the task.
  */
@js.native
trait SchemaTaskStatus extends js.Object {
  /**
    * Output only. The number of attempts dispatched.  This count includes
    * attempts which have been dispatched but haven&#39;t received a response.
    */
  var attemptDispatchCount: js.UndefOr[Double] = js.native
  /**
    * Output only. The number of attempts which have received a response.  This
    * field is not calculated for pull tasks.
    */
  var attemptResponseCount: js.UndefOr[Double] = js.native
  /**
    * Output only. The status of the task&#39;s first attempt.  Only
    * dispatch_time will be set. The other AttemptStatus information is not
    * retained by Cloud Tasks.  This field is not calculated for pull tasks.
    */
  var firstAttemptStatus: js.UndefOr[SchemaAttemptStatus] = js.native
  /**
    * Output only. The status of the task&#39;s last attempt.  This field is
    * not calculated for pull tasks.
    */
  var lastAttemptStatus: js.UndefOr[SchemaAttemptStatus] = js.native
}

object SchemaTaskStatus {
  @scala.inline
  def apply(): SchemaTaskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTaskStatus]
  }
  @scala.inline
  implicit class SchemaTaskStatusOps[Self <: SchemaTaskStatus] (val x: Self) extends AnyVal {
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
    def setAttemptDispatchCount(value: Double): Self = this.set("attemptDispatchCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttemptDispatchCount: Self = this.set("attemptDispatchCount", js.undefined)
    @scala.inline
    def setAttemptResponseCount(value: Double): Self = this.set("attemptResponseCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttemptResponseCount: Self = this.set("attemptResponseCount", js.undefined)
    @scala.inline
    def setFirstAttemptStatus(value: SchemaAttemptStatus): Self = this.set("firstAttemptStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstAttemptStatus: Self = this.set("firstAttemptStatus", js.undefined)
    @scala.inline
    def setLastAttemptStatus(value: SchemaAttemptStatus): Self = this.set("lastAttemptStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastAttemptStatus: Self = this.set("lastAttemptStatus", js.undefined)
  }
  
}

