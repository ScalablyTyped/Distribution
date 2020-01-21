package typings.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of the execution of a transfer.
  */
@js.native
trait SchemaTransferOperation extends js.Object {
  /**
    * Information about the progress of the transfer operation.
    */
  var counters: js.UndefOr[SchemaTransferCounters] = js.native
  /**
    * End time of this transfer execution.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Summarizes errors encountered with sample error log entries.
    */
  var errorBreakdowns: js.UndefOr[js.Array[SchemaErrorSummary]] = js.native
  /**
    * A globally unique ID assigned by the system.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID of the Google Cloud Platform Project that owns the operation.
    * Required.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Start time of this transfer execution.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Status of the transfer operation.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The name of the transfer job that triggers this transfer operation.
    */
  var transferJobName: js.UndefOr[String] = js.native
  /**
    * Transfer specification. Required.
    */
  var transferSpec: js.UndefOr[SchemaTransferSpec] = js.native
}

object SchemaTransferOperation {
  @scala.inline
  def apply(
    counters: SchemaTransferCounters = null,
    endTime: String = null,
    errorBreakdowns: js.Array[SchemaErrorSummary] = null,
    name: String = null,
    projectId: String = null,
    startTime: String = null,
    status: String = null,
    transferJobName: String = null,
    transferSpec: SchemaTransferSpec = null
  ): SchemaTransferOperation = {
    val __obj = js.Dynamic.literal()
    if (counters != null) __obj.updateDynamic("counters")(counters.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (errorBreakdowns != null) __obj.updateDynamic("errorBreakdowns")(errorBreakdowns.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (transferJobName != null) __obj.updateDynamic("transferJobName")(transferJobName.asInstanceOf[js.Any])
    if (transferSpec != null) __obj.updateDynamic("transferSpec")(transferSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTransferOperation]
  }
}

