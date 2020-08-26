package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceBeaconsAttachmentsDelete extends StandardParameters {
  /**
    * The attachment name (`attachmentName`) of the attachment to remove. For
    * example:
    * `beacons/3!893737abc9/attachments/c5e937-af0-494-959-ec49d12738`. For
    * Eddystone-EID beacons, the beacon ID portion (`3!893737abc9`) may be the
    * beacon's current EID, or its "stable" Eddystone-UID. Required.
    */
  var attachmentName: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The project id of the attachment to delete. If not provided, the project
    * that is making the request is used. Optional.
    */
  var projectId: js.UndefOr[String] = js.native
}

object ParamsResourceBeaconsAttachmentsDelete {
  @scala.inline
  def apply(): ParamsResourceBeaconsAttachmentsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBeaconsAttachmentsDelete]
  }
  @scala.inline
  implicit class ParamsResourceBeaconsAttachmentsDeleteOps[Self <: ParamsResourceBeaconsAttachmentsDelete] (val x: Self) extends AnyVal {
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
    def setAttachmentName(value: String): Self = this.set("attachmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachmentName: Self = this.set("attachmentName", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
  }
  
}

