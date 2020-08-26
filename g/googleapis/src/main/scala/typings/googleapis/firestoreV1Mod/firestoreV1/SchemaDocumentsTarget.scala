package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A target specified by a set of documents names.
  */
@js.native
trait SchemaDocumentsTarget extends js.Object {
  /**
    * The names of the documents to retrieve. In the format:
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    * The request will fail if any of the document is not a child resource of
    * the given `database`. Duplicate names will be elided.
    */
  var documents: js.UndefOr[js.Array[String]] = js.native
}

object SchemaDocumentsTarget {
  @scala.inline
  def apply(): SchemaDocumentsTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentsTarget]
  }
  @scala.inline
  implicit class SchemaDocumentsTargetOps[Self <: SchemaDocumentsTarget] (val x: Self) extends AnyVal {
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
    def setDocumentsVarargs(value: String*): Self = this.set("documents", js.Array(value :_*))
    @scala.inline
    def setDocuments(value: js.Array[String]): Self = this.set("documents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocuments: Self = this.set("documents", js.undefined)
  }
  
}

