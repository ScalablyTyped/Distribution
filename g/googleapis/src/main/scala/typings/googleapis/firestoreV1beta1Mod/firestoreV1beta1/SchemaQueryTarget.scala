package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A target specified by a query.
  */
@js.native
trait SchemaQueryTarget extends js.Object {
  /**
    * The parent resource name. In the format:
    * `projects/{project_id}/databases/{database_id}/documents` or
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    * For example: `projects/my-project/databases/my-database/documents` or
    * `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * A structured query.
    */
  var structuredQuery: js.UndefOr[SchemaStructuredQuery] = js.native
}

object SchemaQueryTarget {
  @scala.inline
  def apply(): SchemaQueryTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryTarget]
  }
  @scala.inline
  implicit class SchemaQueryTargetOps[Self <: SchemaQueryTarget] (val x: Self) extends AnyVal {
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
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setStructuredQuery(value: SchemaStructuredQuery): Self = this.set("structuredQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStructuredQuery: Self = this.set("structuredQuery", js.undefined)
  }
  
}

