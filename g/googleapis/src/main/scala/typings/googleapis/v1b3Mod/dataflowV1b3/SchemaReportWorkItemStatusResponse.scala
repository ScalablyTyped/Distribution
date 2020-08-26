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
  def apply(): SchemaReportWorkItemStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportWorkItemStatusResponse]
  }
  @scala.inline
  implicit class SchemaReportWorkItemStatusResponseOps[Self <: SchemaReportWorkItemStatusResponse] (val x: Self) extends AnyVal {
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
    def setUnifiedWorkerResponse(value: StringDictionary[js.Any]): Self = this.set("unifiedWorkerResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnifiedWorkerResponse: Self = this.set("unifiedWorkerResponse", js.undefined)
    @scala.inline
    def setWorkItemServiceStatesVarargs(value: SchemaWorkItemServiceState*): Self = this.set("workItemServiceStates", js.Array(value :_*))
    @scala.inline
    def setWorkItemServiceStates(value: js.Array[SchemaWorkItemServiceState]): Self = this.set("workItemServiceStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkItemServiceStates: Self = this.set("workItemServiceStates", js.undefined)
  }
  
}

