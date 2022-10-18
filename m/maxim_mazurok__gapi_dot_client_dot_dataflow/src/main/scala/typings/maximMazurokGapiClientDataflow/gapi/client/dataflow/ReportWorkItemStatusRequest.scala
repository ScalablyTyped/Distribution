package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportWorkItemStatusRequest extends StObject {
  
  /** The current timestamp at the worker. */
  var currentWorkerTime: js.UndefOr[String] = js.undefined
  
  /** The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the WorkItem's job. */
  var location: js.UndefOr[String] = js.undefined
  
  /** Untranslated bag-of-bytes WorkProgressUpdateRequest from UnifiedWorker. */
  var unifiedWorkerRequest: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** The order is unimportant, except that the order of the WorkItemServiceState messages in the ReportWorkItemStatusResponse corresponds to the order of WorkItemStatus messages here. */
  var workItemStatuses: js.UndefOr[js.Array[WorkItemStatus]] = js.undefined
  
  /**
    * The ID of the worker reporting the WorkItem status. If this does not match the ID of the worker which the Dataflow service believes currently has the lease on the WorkItem, the
    * report will be dropped (with an error response).
    */
  var workerId: js.UndefOr[String] = js.undefined
}
object ReportWorkItemStatusRequest {
  
  inline def apply(): ReportWorkItemStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportWorkItemStatusRequest]
  }
  
  extension [Self <: ReportWorkItemStatusRequest](x: Self) {
    
    inline def setCurrentWorkerTime(value: String): Self = StObject.set(x, "currentWorkerTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentWorkerTimeUndefined: Self = StObject.set(x, "currentWorkerTime", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setUnifiedWorkerRequest(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "unifiedWorkerRequest", value.asInstanceOf[js.Any])
    
    inline def setUnifiedWorkerRequestUndefined: Self = StObject.set(x, "unifiedWorkerRequest", js.undefined)
    
    inline def setWorkItemStatuses(value: js.Array[WorkItemStatus]): Self = StObject.set(x, "workItemStatuses", value.asInstanceOf[js.Any])
    
    inline def setWorkItemStatusesUndefined: Self = StObject.set(x, "workItemStatuses", js.undefined)
    
    inline def setWorkItemStatusesVarargs(value: WorkItemStatus*): Self = StObject.set(x, "workItemStatuses", js.Array(value*))
    
    inline def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    
    inline def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
  }
}
