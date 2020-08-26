package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for google.longrunning.Operation results from
  * FirestoreAdmin.UpdateField.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1FieldOperationMetadata extends js.Object {
  /**
    * The time this operation completed. Will be unset if operation still in
    * progress.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The field resource that this operation is acting on. For example:
    * `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/fields/{field_path}`
    */
  var field: js.UndefOr[String] = js.native
  /**
    * A list of IndexConfigDelta, which describe the intent of this operation.
    */
  var indexConfigDeltas: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1IndexConfigDelta]] = js.native
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

object SchemaGoogleFirestoreAdminV1FieldOperationMetadata {
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1FieldOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1FieldOperationMetadata]
  }
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1FieldOperationMetadataOps[Self <: SchemaGoogleFirestoreAdminV1FieldOperationMetadata] (val x: Self) extends AnyVal {
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setIndexConfigDeltasVarargs(value: SchemaGoogleFirestoreAdminV1IndexConfigDelta*): Self = this.set("indexConfigDeltas", js.Array(value :_*))
    @scala.inline
    def setIndexConfigDeltas(value: js.Array[SchemaGoogleFirestoreAdminV1IndexConfigDelta]): Self = this.set("indexConfigDeltas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexConfigDeltas: Self = this.set("indexConfigDeltas", js.undefined)
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

