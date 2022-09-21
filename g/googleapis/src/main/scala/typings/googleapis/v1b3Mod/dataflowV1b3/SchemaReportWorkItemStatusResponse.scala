package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportWorkItemStatusResponse extends StObject {
  
  /**
    * Untranslated bag-of-bytes WorkProgressUpdateResponse for UnifiedWorker.
    */
  var unifiedWorkerResponse: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * A set of messages indicating the service-side state for each WorkItem whose status was reported, in the same order as the WorkItemStatus messages in the ReportWorkItemStatusRequest which resulting in this response.
    */
  var workItemServiceStates: js.UndefOr[js.Array[SchemaWorkItemServiceState]] = js.undefined
}
object SchemaReportWorkItemStatusResponse {
  
  inline def apply(): SchemaReportWorkItemStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportWorkItemStatusResponse]
  }
  
  extension [Self <: SchemaReportWorkItemStatusResponse](x: Self) {
    
    inline def setUnifiedWorkerResponse(value: StringDictionary[Any]): Self = StObject.set(x, "unifiedWorkerResponse", value.asInstanceOf[js.Any])
    
    inline def setUnifiedWorkerResponseNull: Self = StObject.set(x, "unifiedWorkerResponse", null)
    
    inline def setUnifiedWorkerResponseUndefined: Self = StObject.set(x, "unifiedWorkerResponse", js.undefined)
    
    inline def setWorkItemServiceStates(value: js.Array[SchemaWorkItemServiceState]): Self = StObject.set(x, "workItemServiceStates", value.asInstanceOf[js.Any])
    
    inline def setWorkItemServiceStatesUndefined: Self = StObject.set(x, "workItemServiceStates", js.undefined)
    
    inline def setWorkItemServiceStatesVarargs(value: SchemaWorkItemServiceState*): Self = StObject.set(x, "workItemServiceStates", js.Array(value*))
  }
}
