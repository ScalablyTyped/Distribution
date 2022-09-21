package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLeaseWorkItemRequest extends StObject {
  
  /**
    * The current timestamp at the worker.
    */
  var currentWorkerTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the WorkItem's job.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The initial lease period.
    */
  var requestedLeaseDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Untranslated bag-of-bytes WorkRequest from UnifiedWorker.
    */
  var unifiedWorkerRequest: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Filter for WorkItem type.
    */
  var workItemTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Worker capabilities. WorkItems might be limited to workers with specific capabilities.
    */
  var workerCapabilities: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Identifies the worker leasing work -- typically the ID of the virtual machine running the worker.
    */
  var workerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaLeaseWorkItemRequest {
  
  inline def apply(): SchemaLeaseWorkItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaseWorkItemRequest]
  }
  
  extension [Self <: SchemaLeaseWorkItemRequest](x: Self) {
    
    inline def setCurrentWorkerTime(value: String): Self = StObject.set(x, "currentWorkerTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentWorkerTimeNull: Self = StObject.set(x, "currentWorkerTime", null)
    
    inline def setCurrentWorkerTimeUndefined: Self = StObject.set(x, "currentWorkerTime", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRequestedLeaseDuration(value: String): Self = StObject.set(x, "requestedLeaseDuration", value.asInstanceOf[js.Any])
    
    inline def setRequestedLeaseDurationNull: Self = StObject.set(x, "requestedLeaseDuration", null)
    
    inline def setRequestedLeaseDurationUndefined: Self = StObject.set(x, "requestedLeaseDuration", js.undefined)
    
    inline def setUnifiedWorkerRequest(value: StringDictionary[Any]): Self = StObject.set(x, "unifiedWorkerRequest", value.asInstanceOf[js.Any])
    
    inline def setUnifiedWorkerRequestNull: Self = StObject.set(x, "unifiedWorkerRequest", null)
    
    inline def setUnifiedWorkerRequestUndefined: Self = StObject.set(x, "unifiedWorkerRequest", js.undefined)
    
    inline def setWorkItemTypes(value: js.Array[String]): Self = StObject.set(x, "workItemTypes", value.asInstanceOf[js.Any])
    
    inline def setWorkItemTypesNull: Self = StObject.set(x, "workItemTypes", null)
    
    inline def setWorkItemTypesUndefined: Self = StObject.set(x, "workItemTypes", js.undefined)
    
    inline def setWorkItemTypesVarargs(value: String*): Self = StObject.set(x, "workItemTypes", js.Array(value*))
    
    inline def setWorkerCapabilities(value: js.Array[String]): Self = StObject.set(x, "workerCapabilities", value.asInstanceOf[js.Any])
    
    inline def setWorkerCapabilitiesNull: Self = StObject.set(x, "workerCapabilities", null)
    
    inline def setWorkerCapabilitiesUndefined: Self = StObject.set(x, "workerCapabilities", js.undefined)
    
    inline def setWorkerCapabilitiesVarargs(value: String*): Self = StObject.set(x, "workerCapabilities", js.Array(value*))
    
    inline def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    
    inline def setWorkerIdNull: Self = StObject.set(x, "workerId", null)
    
    inline def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
  }
}
