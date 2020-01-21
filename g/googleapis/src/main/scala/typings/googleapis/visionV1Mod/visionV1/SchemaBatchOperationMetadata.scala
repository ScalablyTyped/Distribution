package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for the batch operations such as the current state.  This is
  * included in the `metadata` field of the `Operation` returned by the
  * `GetOperation` call of the `google::longrunning::Operations` service.
  */
@js.native
trait SchemaBatchOperationMetadata extends js.Object {
  /**
    * The time when the batch request is finished and
    * google.longrunning.Operation.done is set to true.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The current state of the batch operation.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The time when the batch request was submitted to the server.
    */
  var submitTime: js.UndefOr[String] = js.native
}

object SchemaBatchOperationMetadata {
  @scala.inline
  def apply(endTime: String = null, state: String = null, submitTime: String = null): SchemaBatchOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (submitTime != null) __obj.updateDynamic("submitTime")(submitTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchOperationMetadata]
  }
}

