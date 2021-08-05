package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import typings.maximMazurokGapiClientDeploymentmanager.anon.Data
import typings.maximMazurokGapiClientDeploymentmanager.anon.Errors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operation extends StObject {
  
  /** [Output Only] The value of `requestId` if you provided it in the request. Not present otherwise. */
  var clientOperationId: js.UndefOr[String] = js.undefined
  
  /** [Deprecated] This field is deprecated. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /** [Output Only] A textual description of the operation, which is set when the operation is created. */
  var description: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The time that this operation was completed. This value is in RFC3339 text format. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** [Output Only] If errors are generated during processing of the operation, this field will be populated. */
  var error: js.UndefOr[Errors] = js.undefined
  
  /** [Output Only] If the operation fails, this field contains the HTTP error message that was returned, such as `NOT FOUND`. */
  var httpErrorMessage: js.UndefOr[String] = js.undefined
  
  /** [Output Only] If the operation fails, this field contains the HTTP error status code that was returned. For example, a `404` means the resource was not found. */
  var httpErrorStatusCode: js.UndefOr[Double] = js.undefined
  
  /** [Output Only] The unique identifier for the operation. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The time that this operation was requested. This value is in RFC3339 text format. */
  var insertTime: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Type of the resource. Always `compute#operation` for Operation resources. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Name of the operation. */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The type of operation, such as `insert`, `update`, or `delete`, and so on. */
  var operationType: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] An optional progress indicator that ranges from 0 to 100. There is no requirement that this be linear or support any granularity of operations. This should not be used
    * to guess when the operation will be complete. This number should monotonically increase as the operation progresses.
    */
  var progress: js.UndefOr[Double] = js.undefined
  
  /** [Output Only] The URL of the region where the operation resides. Only applicable when performing regional operations. */
  var region: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The time that this operation was started by the server. This value is in RFC3339 text format. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The status of the operation, which can be one of the following: `PENDING`, `RUNNING`, or `DONE`. */
  var status: js.UndefOr[String] = js.undefined
  
  /** [Output Only] An optional textual description of the current status of the operation. */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The unique target ID, which identifies a specific incarnation of the target resource. */
  var targetId: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The URL of the resource that the operation modifies. For operations related to creating a snapshot, this points to the persistent disk that the snapshot was created
    * from.
    */
  var targetLink: js.UndefOr[String] = js.undefined
  
  /** [Output Only] User who requested the operation, for example: `user@example.com`. */
  var user: js.UndefOr[String] = js.undefined
  
  /** [Output Only] If warning messages are generated during processing of the operation, this field will be populated. */
  var warnings: js.UndefOr[js.Array[Data]] = js.undefined
  
  /** [Output Only] The URL of the zone where the operation resides. Only applicable when performing per-zone operations. */
  var zone: js.UndefOr[String] = js.undefined
}
object Operation {
  
  inline def apply(): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Operation]
  }
  
  extension [Self <: Operation](x: Self) {
    
    inline def setClientOperationId(value: String): Self = StObject.set(x, "clientOperationId", value.asInstanceOf[js.Any])
    
    inline def setClientOperationIdUndefined: Self = StObject.set(x, "clientOperationId", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setError(value: Errors): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setHttpErrorMessage(value: String): Self = StObject.set(x, "httpErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setHttpErrorMessageUndefined: Self = StObject.set(x, "httpErrorMessage", js.undefined)
    
    inline def setHttpErrorStatusCode(value: Double): Self = StObject.set(x, "httpErrorStatusCode", value.asInstanceOf[js.Any])
    
    inline def setHttpErrorStatusCodeUndefined: Self = StObject.set(x, "httpErrorStatusCode", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInsertTime(value: String): Self = StObject.set(x, "insertTime", value.asInstanceOf[js.Any])
    
    inline def setInsertTimeUndefined: Self = StObject.set(x, "insertTime", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    
    inline def setTargetLink(value: String): Self = StObject.set(x, "targetLink", value.asInstanceOf[js.Any])
    
    inline def setTargetLinkUndefined: Self = StObject.set(x, "targetLink", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setWarnings(value: js.Array[Data]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: Data*): Self = StObject.set(x, "warnings", js.Array(value :_*))
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
