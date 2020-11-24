package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for index operations. This metadata populates the metadata field
  * of google.longrunning.Operation.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1beta1IndexOperationMetadata extends js.Object {
  
  /**
    * True if the [google.longrunning.Operation] was cancelled. If the
    * cancellation is in progress, cancelled will be true but
    * google.longrunning.Operation.done will be false.
    */
  var cancelled: js.UndefOr[Boolean] = js.native
  
  /**
    * Progress of the existing operation, measured in number of documents.
    */
  var documentProgress: js.UndefOr[SchemaGoogleFirestoreAdminV1beta1Progress] = js.native
  
  /**
    * The time the operation ended, either successfully or otherwise. Unset if
    * the operation is still active.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * The index resource that this operation is acting on. For example:
    * `projects/{project_id}/databases/{database_id}/indexes/{index_id}`
    */
  var index: js.UndefOr[String] = js.native
  
  /**
    * The type of index operation.
    */
  var operationType: js.UndefOr[String] = js.native
  
  /**
    * The time that work began on the operation.
    */
  var startTime: js.UndefOr[String] = js.native
}
object SchemaGoogleFirestoreAdminV1beta1IndexOperationMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta1IndexOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta1IndexOperationMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta1IndexOperationMetadataOps[Self <: SchemaGoogleFirestoreAdminV1beta1IndexOperationMetadata] (val x: Self) extends AnyVal {
    
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
    def setCancelled(value: Boolean): Self = this.set("cancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelled: Self = this.set("cancelled", js.undefined)
    
    @scala.inline
    def setDocumentProgress(value: SchemaGoogleFirestoreAdminV1beta1Progress): Self = this.set("documentProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentProgress: Self = this.set("documentProgress", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setOperationType(value: String): Self = this.set("operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
