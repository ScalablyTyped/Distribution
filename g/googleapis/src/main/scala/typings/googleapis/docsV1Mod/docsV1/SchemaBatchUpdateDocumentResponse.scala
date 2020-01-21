package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message from a BatchUpdateDocument request.
  */
@js.native
trait SchemaBatchUpdateDocumentResponse extends js.Object {
  /**
    * The ID of the document to which the updates were applied to.
    */
  var documentId: js.UndefOr[String] = js.native
  /**
    * The reply of the updates. This maps 1:1 with the updates, although
    * replies to some requests may be empty.
    */
  var replies: js.UndefOr[js.Array[SchemaResponse]] = js.native
  /**
    * The updated write control after applying the request.
    */
  var writeControl: js.UndefOr[SchemaWriteControl] = js.native
}

object SchemaBatchUpdateDocumentResponse {
  @scala.inline
  def apply(
    documentId: String = null,
    replies: js.Array[SchemaResponse] = null,
    writeControl: SchemaWriteControl = null
  ): SchemaBatchUpdateDocumentResponse = {
    val __obj = js.Dynamic.literal()
    if (documentId != null) __obj.updateDynamic("documentId")(documentId.asInstanceOf[js.Any])
    if (replies != null) __obj.updateDynamic("replies")(replies.asInstanceOf[js.Any])
    if (writeControl != null) __obj.updateDynamic("writeControl")(writeControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchUpdateDocumentResponse]
  }
}

