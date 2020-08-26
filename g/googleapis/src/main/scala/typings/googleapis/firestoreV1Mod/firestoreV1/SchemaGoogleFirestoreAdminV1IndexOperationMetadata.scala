package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for google.longrunning.Operation results from
  * FirestoreAdmin.CreateIndex.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1IndexOperationMetadata extends js.Object {
  /**
    * The time this operation completed. Will be unset if operation still in
    * progress.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The index resource that this operation is acting on. For example:
    * `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/indexes/{index_id}`
    */
  var index: js.UndefOr[String] = js.native
  /**
    * The progress, in bytes, of this operation.
    */
  var progressBytes: js.UndefOr[SchemaGoogleFirestoreAdminV1Progress] = js.native
  /**
    * The progress, in documents, of this operation.
    */
  var progressDocuments: js.UndefOr[SchemaGoogleFirestoreAdminV1Progress] = js.native
  /**
    * The time this operation started.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * The state of the operation.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaGoogleFirestoreAdminV1IndexOperationMetadata {
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1IndexOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1IndexOperationMetadata]
  }
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1IndexOperationMetadataOps[Self <: SchemaGoogleFirestoreAdminV1IndexOperationMetadata] (val x: Self) extends AnyVal {
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setProgressBytes(value: SchemaGoogleFirestoreAdminV1Progress): Self = this.set("progressBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressBytes: Self = this.set("progressBytes", js.undefined)
    @scala.inline
    def setProgressDocuments(value: SchemaGoogleFirestoreAdminV1Progress): Self = this.set("progressDocuments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressDocuments: Self = this.set("progressDocuments", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

