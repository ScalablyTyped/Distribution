package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Upload line items response.
  */
@js.native
trait SchemaUploadLineItemsResponse extends js.Object {
  /**
    * Status of upload.
    */
  var uploadStatus: js.UndefOr[SchemaUploadStatus] = js.native
}

object SchemaUploadLineItemsResponse {
  @scala.inline
  def apply(uploadStatus: SchemaUploadStatus = null): SchemaUploadLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    if (uploadStatus != null) __obj.updateDynamic("uploadStatus")(uploadStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUploadLineItemsResponse]
  }
}

