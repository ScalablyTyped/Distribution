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
  def apply(
    attemptDispatchCount: Int | Double = null,
    attemptResponseCount: Int | Double = null,
    firstAttemptStatus: SchemaAttemptStatus = null,
    lastAttemptStatus: SchemaAttemptStatus = null
  ): SchemaTaskStatus = {
    val __obj = js.Dynamic.literal()
    if (attemptDispatchCount != null) __obj.updateDynamic("attemptDispatchCount")(attemptDispatchCount.asInstanceOf[js.Any])
    if (attemptResponseCount != null) __obj.updateDynamic("attemptResponseCount")(attemptResponseCount.asInstanceOf[js.Any])
    if (firstAttemptStatus != null) __obj.updateDynamic("firstAttemptStatus")(firstAttemptStatus.asInstanceOf[js.Any])
    if (lastAttemptStatus != null) __obj.updateDynamic("lastAttemptStatus")(lastAttemptStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTaskStatus]
  }
}

