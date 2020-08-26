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
  def apply(): SchemaListBeaconAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBeaconAttachmentsResponse]
  }
  @scala.inline
  implicit class SchemaListBeaconAttachmentsResponseOps[Self <: SchemaListBeaconAttachmentsResponse] (val x: Self) extends AnyVal {
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
    def setAttachmentsVarargs(value: SchemaBeaconAttachment*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[SchemaBeaconAttachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
  }
  
}

