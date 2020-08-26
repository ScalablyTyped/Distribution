package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A write on a document.
  */
@js.native
trait SchemaWrite extends js.Object {
  /**
    * An optional precondition on the document.  The write will fail if this is
    * set and not met by the target document.
    */
  var currentDocument: js.UndefOr[SchemaPrecondition] = js.native
  /**
    * A document name to delete. In the format:
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    */
  var delete: js.UndefOr[String] = js.native
  /**
    * Applies a tranformation to a document. At most one `transform` per
    * document is allowed in a given request. An `update` cannot follow a
    * `transform` on the same document in a given request.
    */
  var transform: js.UndefOr[SchemaDocumentTransform] = js.native
  /**
    * A document to write.
    */
  var update: js.UndefOr[SchemaDocument] = js.native
  /**
    * The fields to update in this write.  This field can be set only when the
    * operation is `update`. If the mask is not set for an `update` and the
    * document exists, any existing data will be overwritten. If the mask is
    * set and the document on the server has fields not covered by the mask,
    * they are left unchanged. Fields referenced in the mask, but not present
    * in the input document, are deleted from the document on the server. The
    * field paths in this mask must not contain a reserved field name.
    */
  var updateMask: js.UndefOr[SchemaDocumentMask] = js.native
}

object SchemaWrite {
  @scala.inline
  def apply(): SchemaWrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWrite]
  }
  @scala.inline
  implicit class SchemaWriteOps[Self <: SchemaWrite] (val x: Self) extends AnyVal {
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
    def setCurrentDocument(value: SchemaPrecondition): Self = this.set("currentDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentDocument: Self = this.set("currentDocument", js.undefined)
    @scala.inline
    def setDelete(value: String): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    @scala.inline
    def setTransform(value: SchemaDocumentTransform): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setUpdate(value: SchemaDocument): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    @scala.inline
    def setUpdateMask(value: SchemaDocumentMask): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
  
}

