package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Operation extends StObject {
  
  /** Which conditions caused the current cluster state. */
  var clusterConditions: js.UndefOr[js.Array[StatusCondition]] = js.native
  
  /** Detailed operation progress, if available. */
  var detail: js.UndefOr[String] = js.native
  
  /** [Output only] The time the operation completed, in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format. */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * [Output only] The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones#available) or
    * [region](https://cloud.google.com/compute/docs/regions-zones/regions-zones#available) in which the cluster resides.
    */
  var location: js.UndefOr[String] = js.native
  
  /** The server-assigned ID for the operation. */
  var name: js.UndefOr[String] = js.native
  
  /** Which conditions caused the current node pool state. */
  var nodepoolConditions: js.UndefOr[js.Array[StatusCondition]] = js.native
  
  /** The operation type. */
  var operationType: js.UndefOr[String] = js.native
  
  /** Output only. [Output only] Progress information for an operation. */
  var progress: js.UndefOr[OperationProgress] = js.native
  
  /** Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** [Output only] The time the operation started, in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format. */
  var startTime: js.UndefOr[String] = js.native
  
  /** The current status of the operation. */
  var status: js.UndefOr[String] = js.native
  
  /** Output only. If an error has occurred, a textual description of the error. */
  var statusMessage: js.UndefOr[String] = js.native
  
  /** Server-defined URL for the target of the operation. */
  var targetLink: js.UndefOr[String] = js.native
  
  /**
    * The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the operation is taking place. This field is deprecated, use location
    * instead.
    */
  var zone: js.UndefOr[String] = js.native
}
object Operation {
  
  @scala.inline
  def apply(): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  implicit class OperationMutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterConditions(value: js.Array[StatusCondition]): Self = StObject.set(x, "clusterConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterConditionsUndefined: Self = StObject.set(x, "clusterConditions", js.undefined)
    
    @scala.inline
    def setClusterConditionsVarargs(value: StatusCondition*): Self = StObject.set(x, "clusterConditions", js.Array(value :_*))
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNodepoolConditions(value: js.Array[StatusCondition]): Self = StObject.set(x, "nodepoolConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodepoolConditionsUndefined: Self = StObject.set(x, "nodepoolConditions", js.undefined)
    
    @scala.inline
    def setNodepoolConditionsVarargs(value: StatusCondition*): Self = StObject.set(x, "nodepoolConditions", js.Array(value :_*))
    
    @scala.inline
    def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    @scala.inline
    def setProgress(value: OperationProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTargetLink(value: String): Self = StObject.set(x, "targetLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetLinkUndefined: Self = StObject.set(x, "targetLink", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
