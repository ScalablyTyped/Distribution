package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportWorkItemStatusResponse extends StObject {
  
  /** Untranslated bag-of-bytes WorkProgressUpdateResponse for UnifiedWorker. */
  var unifiedWorkerResponse: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /**
    * A set of messages indicating the service-side state for each WorkItem whose status was reported, in the same order as the WorkItemStatus messages in the ReportWorkItemStatusRequest
    * which resulting in this response.
    */
  var workItemServiceStates: js.UndefOr[js.Array[WorkItemServiceState]] = js.undefined
}
object ReportWorkItemStatusResponse {
  
  inline def apply(): ReportWorkItemStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportWorkItemStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportWorkItemStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setUnifiedWorkerResponse(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "unifiedWorkerResponse", value.asInstanceOf[js.Any])
    
    inline def setUnifiedWorkerResponseUndefined: Self = StObject.set(x, "unifiedWorkerResponse", js.undefined)
    
    inline def setWorkItemServiceStates(value: js.Array[WorkItemServiceState]): Self = StObject.set(x, "workItemServiceStates", value.asInstanceOf[js.Any])
    
    inline def setWorkItemServiceStatesUndefined: Self = StObject.set(x, "workItemServiceStates", js.undefined)
    
    inline def setWorkItemServiceStatesVarargs(value: WorkItemServiceState*): Self = StObject.set(x, "workItemServiceStates", js.Array(value*))
  }
}
