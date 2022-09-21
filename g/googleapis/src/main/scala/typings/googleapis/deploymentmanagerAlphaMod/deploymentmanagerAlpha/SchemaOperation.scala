package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import typings.googleapis.anon.Code
import typings.googleapis.anon.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOperation extends StObject {
  
  /**
    * [Output Only] The value of `requestId` if you provided it in the request. Not present otherwise.
    */
  var clientOperationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Deprecated] This field is deprecated.
    */
  var creationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] A textual description of the operation, which is set when the operation is created.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The time that this operation was completed. This value is in RFC3339 text format.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] If errors are generated during processing of the operation, this field will be populated.
    */
  var error: js.UndefOr[`6` | Null] = js.undefined
  
  /**
    * [Output Only] If the operation fails, this field contains the HTTP error message that was returned, such as `NOT FOUND`.
    */
  var httpErrorMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] If the operation fails, this field contains the HTTP error status code that was returned. For example, a `404` means the resource was not found.
    */
  var httpErrorStatusCode: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the operation. This identifier is defined by the server.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The time that this operation was requested. This value is in RFC3339 text format.
    */
  var insertTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always `compute#operation` for Operation resources.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Name of the operation.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] An ID that represents a group of operations, such as when a group of operations results from a `bulkInsert` API request.
    */
  var operationGroupId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The type of operation, such as `insert`, `update`, or `delete`, and so on.
    */
  var operationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] An optional progress indicator that ranges from 0 to 100. There is no requirement that this be linear or support any granularity of operations. This should not be used to guess when the operation will be complete. This number should monotonically increase as the operation progresses.
    */
  var progress: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] The URL of the region where the operation resides. Only applicable when performing regional operations.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The time that this operation was started by the server. This value is in RFC3339 text format.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The status of the operation, which can be one of the following: `PENDING`, `RUNNING`, or `DONE`.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] An optional textual description of the current status of the operation.
    */
  var statusMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The unique target ID, which identifies a specific incarnation of the target resource.
    */
  var targetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The URL of the resource that the operation modifies. For operations related to creating a snapshot, this points to the persistent disk that the snapshot was created from.
    */
  var targetLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] User who requested the operation, for example: `user@example.com`.
    */
  var user: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] If warning messages are generated during processing of the operation, this field will be populated.
    */
  var warnings: js.UndefOr[js.Array[Code] | Null] = js.undefined
  
  /**
    * [Output Only] The URL of the zone where the operation resides. Only applicable when performing per-zone operations.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaOperation {
  
  inline def apply(): SchemaOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperation]
  }
  
  extension [Self <: SchemaOperation](x: Self) {
    
    inline def setClientOperationId(value: String): Self = StObject.set(x, "clientOperationId", value.asInstanceOf[js.Any])
    
    inline def setClientOperationIdNull: Self = StObject.set(x, "clientOperationId", null)
    
    inline def setClientOperationIdUndefined: Self = StObject.set(x, "clientOperationId", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampNull: Self = StObject.set(x, "creationTimestamp", null)
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setError(value: `6`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setHttpErrorMessage(value: String): Self = StObject.set(x, "httpErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setHttpErrorMessageNull: Self = StObject.set(x, "httpErrorMessage", null)
    
    inline def setHttpErrorMessageUndefined: Self = StObject.set(x, "httpErrorMessage", js.undefined)
    
    inline def setHttpErrorStatusCode(value: Double): Self = StObject.set(x, "httpErrorStatusCode", value.asInstanceOf[js.Any])
    
    inline def setHttpErrorStatusCodeNull: Self = StObject.set(x, "httpErrorStatusCode", null)
    
    inline def setHttpErrorStatusCodeUndefined: Self = StObject.set(x, "httpErrorStatusCode", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInsertTime(value: String): Self = StObject.set(x, "insertTime", value.asInstanceOf[js.Any])
    
    inline def setInsertTimeNull: Self = StObject.set(x, "insertTime", null)
    
    inline def setInsertTimeUndefined: Self = StObject.set(x, "insertTime", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperationGroupId(value: String): Self = StObject.set(x, "operationGroupId", value.asInstanceOf[js.Any])
    
    inline def setOperationGroupIdNull: Self = StObject.set(x, "operationGroupId", null)
    
    inline def setOperationGroupIdUndefined: Self = StObject.set(x, "operationGroupId", js.undefined)
    
    inline def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeNull: Self = StObject.set(x, "operationType", null)
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressNull: Self = StObject.set(x, "progress", null)
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageNull: Self = StObject.set(x, "statusMessage", null)
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdNull: Self = StObject.set(x, "targetId", null)
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    
    inline def setTargetLink(value: String): Self = StObject.set(x, "targetLink", value.asInstanceOf[js.Any])
    
    inline def setTargetLinkNull: Self = StObject.set(x, "targetLink", null)
    
    inline def setTargetLinkUndefined: Self = StObject.set(x, "targetLink", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setWarnings(value: js.Array[Code]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsNull: Self = StObject.set(x, "warnings", null)
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: Code*): Self = StObject.set(x, "warnings", js.Array(value*))
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
