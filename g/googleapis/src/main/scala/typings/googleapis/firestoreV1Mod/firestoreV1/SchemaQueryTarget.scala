package typings.googleapis.firestoreV1Mod.firestoreV1

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
  def apply(parent: String = null, structuredQuery: SchemaStructuredQuery = null): SchemaQueryTarget = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (structuredQuery != null) __obj.updateDynamic("structuredQuery")(structuredQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQueryTarget]
  }
}

