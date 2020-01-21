package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response from a request to report the status of WorkItems.
  */
@js.native
trait SchemaReportWorkItemStatusResponse extends js.Object {
  /**
    * Untranslated bag-of-bytes WorkProgressUpdateResponse for UnifiedWorker.
    */
  var unifiedWorkerResponse: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * A set of messages indicating the service-side state for each WorkItem
    * whose status was reported, in the same order as the WorkItemStatus
    * messages in the ReportWorkItemStatusRequest which resulting in this
    * response.
    */
  var workItemServiceStates: js.UndefOr[js.Array[SchemaWorkItemServiceState]] = js.native
}

object SchemaReportWorkItemStatusResponse {
  @scala.inline
  def apply(
    unifiedWorkerResponse: StringDictionary[js.Any] = null,
    workItemServiceStates: js.Array[SchemaWorkItemServiceState] = null
  ): SchemaReportWorkItemStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (unifiedWorkerResponse != null) __obj.updateDynamic("unifiedWorkerResponse")(unifiedWorkerResponse.asInstanceOf[js.Any])
    if (workItemServiceStates != null) __obj.updateDynamic("workItemServiceStates")(workItemServiceStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReportWorkItemStatusResponse]
  }
}

