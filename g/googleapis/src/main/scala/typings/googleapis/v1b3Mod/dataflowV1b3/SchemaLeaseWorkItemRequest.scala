package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to lease WorkItems.
  */
trait SchemaLeaseWorkItemRequest extends StObject {
  
  /**
    * The current timestamp at the worker.
    */
  var currentWorkerTime: js.UndefOr[String] = js.undefined
  
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * contains the WorkItem&#39;s job.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The initial lease period.
    */
  var requestedLeaseDuration: js.UndefOr[String] = js.undefined
  
  /**
    * Untranslated bag-of-bytes WorkRequest from UnifiedWorker.
    */
  var unifiedWorkerRequest: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Filter for WorkItem type.
    */
  var workItemTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Worker capabilities. WorkItems might be limited to workers with specific
    * capabilities.
    */
  var workerCapabilities: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Identifies the worker leasing work -- typically the ID of the virtual
    * machine running the worker.
    */
  var workerId: js.UndefOr[String] = js.undefined
}
object SchemaLeaseWorkItemRequest {
  
  @scala.inline
  def apply(): SchemaLeaseWorkItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaseWorkItemRequest]
  }
  
  @scala.inline
  implicit class SchemaLeaseWorkItemRequestMutableBuilder[Self <: SchemaLeaseWorkItemRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentWorkerTime(value: String): Self = StObject.set(x, "currentWorkerTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentWorkerTimeUndefined: Self = StObject.set(x, "currentWorkerTime", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setRequestedLeaseDuration(value: String): Self = StObject.set(x, "requestedLeaseDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedLeaseDurationUndefined: Self = StObject.set(x, "requestedLeaseDuration", js.undefined)
    
    @scala.inline
    def setUnifiedWorkerRequest(value: StringDictionary[js.Any]): Self = StObject.set(x, "unifiedWorkerRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnifiedWorkerRequestUndefined: Self = StObject.set(x, "unifiedWorkerRequest", js.undefined)
    
    @scala.inline
    def setWorkItemTypes(value: js.Array[String]): Self = StObject.set(x, "workItemTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemTypesUndefined: Self = StObject.set(x, "workItemTypes", js.undefined)
    
    @scala.inline
    def setWorkItemTypesVarargs(value: String*): Self = StObject.set(x, "workItemTypes", js.Array(value :_*))
    
    @scala.inline
    def setWorkerCapabilities(value: js.Array[String]): Self = StObject.set(x, "workerCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerCapabilitiesUndefined: Self = StObject.set(x, "workerCapabilities", js.undefined)
    
    @scala.inline
    def setWorkerCapabilitiesVarargs(value: String*): Self = StObject.set(x, "workerCapabilities", js.Array(value :_*))
    
    @scala.inline
    def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
  }
}
