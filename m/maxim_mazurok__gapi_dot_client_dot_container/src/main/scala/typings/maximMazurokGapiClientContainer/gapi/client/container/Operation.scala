package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operation extends StObject {
  
  /** Which conditions caused the current cluster state. Deprecated. Use field error instead. */
  var clusterConditions: js.UndefOr[js.Array[StatusCondition]] = js.undefined
  
  /** Detailed operation progress, if available. */
  var detail: js.UndefOr[String] = js.undefined
  
  /** [Output only] The time the operation completed, in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The error result of the operation in case of failure. */
  var error: js.UndefOr[Status] = js.undefined
  
  /**
    * [Output only] The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones#available) or
    * [region](https://cloud.google.com/compute/docs/regions-zones/regions-zones#available) in which the cluster resides.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /** The server-assigned ID for the operation. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Which conditions caused the current node pool state. Deprecated. Use field error instead. */
  var nodepoolConditions: js.UndefOr[js.Array[StatusCondition]] = js.undefined
  
  /** The operation type. */
  var operationType: js.UndefOr[String] = js.undefined
  
  /** Output only. [Output only] Progress information for an operation. */
  var progress: js.UndefOr[OperationProgress] = js.undefined
  
  /** Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** [Output only] The time the operation started, in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** The current status of the operation. */
  var status: js.UndefOr[String] = js.undefined
  
  /** Output only. If an error has occurred, a textual description of the error. Deprecated. Use the field error instead. */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /** Server-defined URL for the target of the operation. */
  var targetLink: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the operation is taking place. This field is deprecated, use location
    * instead.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object Operation {
  
  inline def apply(): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
    
    inline def setClusterConditions(value: js.Array[StatusCondition]): Self = StObject.set(x, "clusterConditions", value.asInstanceOf[js.Any])
    
    inline def setClusterConditionsUndefined: Self = StObject.set(x, "clusterConditions", js.undefined)
    
    inline def setClusterConditionsVarargs(value: StatusCondition*): Self = StObject.set(x, "clusterConditions", js.Array(value*))
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodepoolConditions(value: js.Array[StatusCondition]): Self = StObject.set(x, "nodepoolConditions", value.asInstanceOf[js.Any])
    
    inline def setNodepoolConditionsUndefined: Self = StObject.set(x, "nodepoolConditions", js.undefined)
    
    inline def setNodepoolConditionsVarargs(value: StatusCondition*): Self = StObject.set(x, "nodepoolConditions", js.Array(value*))
    
    inline def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setProgress(value: OperationProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTargetLink(value: String): Self = StObject.set(x, "targetLink", value.asInstanceOf[js.Any])
    
    inline def setTargetLinkUndefined: Self = StObject.set(x, "targetLink", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
