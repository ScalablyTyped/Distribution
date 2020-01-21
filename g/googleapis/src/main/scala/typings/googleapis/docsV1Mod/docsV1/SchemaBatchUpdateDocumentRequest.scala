package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for BatchUpdateDocument.
  */
@js.native
trait SchemaBatchUpdateDocumentRequest extends js.Object {
  /**
    * A list of updates to apply to the document.
    */
  var requests: js.UndefOr[js.Array[SchemaRequest]] = js.native
  /**
    * Provides control over how write requests are executed.
    */
  var writeControl: js.UndefOr[SchemaWriteControl] = js.native
}

object SchemaBatchUpdateDocumentRequest {
  @scala.inline
  def apply(requests: js.Array[SchemaRequest] = null, writeControl: SchemaWriteControl = null): SchemaBatchUpdateDocumentRequest = {
    val __obj = js.Dynamic.literal()
    if (requests != null) __obj.updateDynamic("requests")(requests.asInstanceOf[js.Any])
    if (writeControl != null) __obj.updateDynamic("writeControl")(writeControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchUpdateDocumentRequest]
  }
}

