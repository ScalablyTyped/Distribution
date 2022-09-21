package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportWorkItemStatusRequest extends StObject {
  
  /**
    * The current timestamp at the worker.
    */
  var currentWorkerTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the WorkItem's job.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Untranslated bag-of-bytes WorkProgressUpdateRequest from UnifiedWorker.
    */
  var unifiedWorkerRequest: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The order is unimportant, except that the order of the WorkItemServiceState messages in the ReportWorkItemStatusResponse corresponds to the order of WorkItemStatus messages here.
    */
  var workItemStatuses: js.UndefOr[js.Array[SchemaWorkItemStatus]] = js.undefined
  
  /**
    * The ID of the worker reporting the WorkItem status. If this does not match the ID of the worker which the Dataflow service believes currently has the lease on the WorkItem, the report will be dropped (with an error response).
    */
  var workerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaReportWorkItemStatusRequest {
  
  inline def apply(): SchemaReportWorkItemStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportWorkItemStatusRequest]
  }
  
  extension [Self <: SchemaReportWorkItemStatusRequest](x: Self) {
    
    inline def setCurrentWorkerTime(value: String): Self = StObject.set(x, "currentWorkerTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentWorkerTimeNull: Self = StObject.set(x, "currentWorkerTime", null)
    
    inline def setCurrentWorkerTimeUndefined: Self = StObject.set(x, "currentWorkerTime", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setUnifiedWorkerRequest(value: StringDictionary[Any]): Self = StObject.set(x, "unifiedWorkerRequest", value.asInstanceOf[js.Any])
    
    inline def setUnifiedWorkerRequestNull: Self = StObject.set(x, "unifiedWorkerRequest", null)
    
    inline def setUnifiedWorkerRequestUndefined: Self = StObject.set(x, "unifiedWorkerRequest", js.undefined)
    
    inline def setWorkItemStatuses(value: js.Array[SchemaWorkItemStatus]): Self = StObject.set(x, "workItemStatuses", value.asInstanceOf[js.Any])
    
    inline def setWorkItemStatusesUndefined: Self = StObject.set(x, "workItemStatuses", js.undefined)
    
    inline def setWorkItemStatusesVarargs(value: SchemaWorkItemStatus*): Self = StObject.set(x, "workItemStatuses", js.Array(value*))
    
    inline def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    
    inline def setWorkerIdNull: Self = StObject.set(x, "workerId", null)
    
    inline def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
  }
}
