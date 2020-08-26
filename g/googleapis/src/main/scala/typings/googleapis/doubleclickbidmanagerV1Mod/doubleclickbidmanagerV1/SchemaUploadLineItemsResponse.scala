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
  def apply(): SchemaUploadLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadLineItemsResponse]
  }
  @scala.inline
  implicit class SchemaUploadLineItemsResponseOps[Self <: SchemaUploadLineItemsResponse] (val x: Self) extends AnyVal {
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
    def setUploadStatus(value: SchemaUploadStatus): Self = this.set("uploadStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadStatus: Self = this.set("uploadStatus", js.undefined)
  }
  
}

