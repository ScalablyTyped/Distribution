package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response from a request to report the status of WorkItems.
  */
trait SchemaReportWorkItemStatusResponse extends StObject {
  
  /**
    * Untranslated bag-of-bytes WorkProgressUpdateResponse for UnifiedWorker.
    */
  var unifiedWorkerResponse: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * A set of messages indicating the service-side state for each WorkItem
    * whose status was reported, in the same order as the WorkItemStatus
    * messages in the ReportWorkItemStatusRequest which resulting in this
    * response.
    */
  var workItemServiceStates: js.UndefOr[js.Array[SchemaWorkItemServiceState]] = js.undefined
}
object SchemaReportWorkItemStatusResponse {
  
  @scala.inline
  def apply(): SchemaReportWorkItemStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportWorkItemStatusResponse]
  }
  
  @scala.inline
  implicit class SchemaReportWorkItemStatusResponseMutableBuilder[Self <: SchemaReportWorkItemStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnifiedWorkerResponse(value: StringDictionary[js.Any]): Self = StObject.set(x, "unifiedWorkerResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnifiedWorkerResponseUndefined: Self = StObject.set(x, "unifiedWorkerResponse", js.undefined)
    
    @scala.inline
    def setWorkItemServiceStates(value: js.Array[SchemaWorkItemServiceState]): Self = StObject.set(x, "workItemServiceStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemServiceStatesUndefined: Self = StObject.set(x, "workItemServiceStates", js.undefined)
    
    @scala.inline
    def setWorkItemServiceStatesVarargs(value: SchemaWorkItemServiceState*): Self = StObject.set(x, "workItemServiceStates", js.Array(value :_*))
  }
}
