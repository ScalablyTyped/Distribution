package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import typings.googleapis.anon.Code
import typings.googleapis.anon.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Operation resource, used to manage asynchronous API requests. (==
  * resource_for v1.globalOperations ==) (== resource_for beta.globalOperations
  * ==) (== resource_for v1.regionOperations ==) (== resource_for
  * beta.regionOperations ==) (== resource_for v1.zoneOperations ==) (==
  * resource_for beta.zoneOperations ==)
  */
@js.native
trait SchemaOperation extends js.Object {
  
  /**
    * [Output Only] The value of `requestId` if you provided it in the request.
    * Not present otherwise.
    */
  var clientOperationId: js.UndefOr[String] = js.native
  
  /**
    * [Deprecated] This field is deprecated.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] A textual description of the operation, which is set when
    * the operation is created.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The time that this operation was completed. This value is
    * in RFC3339 text format.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] If errors are generated during processing of the operation,
    * this field will be populated.
    */
  var error: js.UndefOr[`3`] = js.native
  
  /**
    * [Output Only] If the operation fails, this field contains the HTTP error
    * message that was returned, such as NOT FOUND.
    */
  var httpErrorMessage: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] If the operation fails, this field contains the HTTP error
    * status code that was returned. For example, a 404 means the resource was
    * not found.
    */
  var httpErrorStatusCode: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The time that this operation was requested. This value is
    * in RFC3339 text format.
    */
  var insertTime: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Type of the resource. Always compute#operation for
    * Operation resources.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Name of the resource.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The type of operation, such as insert, update, or delete,
    * and so on.
    */
  var operationType: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] An optional progress indicator that ranges from 0 to 100.
    * There is no requirement that this be linear or support any granularity of
    * operations. This should not be used to guess when the operation will be
    * complete. This number should monotonically increase as the operation
    * progresses.
    */
  var progress: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The URL of the region where the operation resides. Only
    * available when performing regional operations. You must specify this
    * field as part of the HTTP request URL. It is not settable as a field in
    * the request body.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The time that this operation was started by the server.
    * This value is in RFC3339 text format.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The status of the operation, which can be one of the
    * following: PENDING, RUNNING, or DONE.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] An optional textual description of the current status of
    * the operation.
    */
  var statusMessage: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The unique target ID, which identifies a specific
    * incarnation of the target resource.
    */
  var targetId: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The URL of the resource that the operation modifies. For
    * operations related to creating a snapshot, this points to the persistent
    * disk that the snapshot was created from.
    */
  var targetLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] User who requested the operation, for example:
    * user@example.com.
    */
  var user: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] If warning messages are generated during processing of the
    * operation, this field will be populated.
    */
  var warnings: js.UndefOr[js.Array[Code]] = js.native
  
  /**
    * [Output Only] The URL of the zone where the operation resides. Only
    * available when performing per-zone operations. You must specify this
    * field as part of the HTTP request URL. It is not settable as a field in
    * the request body.
    */
  var zone: js.UndefOr[String] = js.native
}
object SchemaOperation {
  
  @scala.inline
  def apply(): SchemaOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperation]
  }
  
  @scala.inline
  implicit class SchemaOperationOps[Self <: SchemaOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientOperationId(value: String): Self = this.set("clientOperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientOperationId: Self = this.set("clientOperationId", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setError(value: `3`): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setHttpErrorMessage(value: String): Self = this.set("httpErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpErrorMessage: Self = this.set("httpErrorMessage", js.undefined)
    
    @scala.inline
    def setHttpErrorStatusCode(value: Double): Self = this.set("httpErrorStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpErrorStatusCode: Self = this.set("httpErrorStatusCode", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInsertTime(value: String): Self = this.set("insertTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertTime: Self = this.set("insertTime", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOperationType(value: String): Self = this.set("operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    
    @scala.inline
    def setTargetId(value: String): Self = this.set("targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetId: Self = this.set("targetId", js.undefined)
    
    @scala.inline
    def setTargetLink(value: String): Self = this.set("targetLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetLink: Self = this.set("targetLink", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: Code*): Self = this.set("warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[Code]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
