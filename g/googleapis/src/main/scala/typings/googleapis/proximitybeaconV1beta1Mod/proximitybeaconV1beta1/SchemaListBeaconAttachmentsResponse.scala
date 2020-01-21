package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to `ListBeaconAttachments` that contains the requested
  * attachments.
  */
@js.native
trait SchemaListBeaconAttachmentsResponse extends js.Object {
  /**
    * The attachments that corresponded to the request params.
    */
  var attachments: js.UndefOr[js.Array[SchemaBeaconAttachment]] = js.native
}

object SchemaListBeaconAttachmentsResponse {
  @scala.inline
  def apply(attachments: js.Array[SchemaBeaconAttachment] = null): SchemaListBeaconAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListBeaconAttachmentsResponse]
  }
}

