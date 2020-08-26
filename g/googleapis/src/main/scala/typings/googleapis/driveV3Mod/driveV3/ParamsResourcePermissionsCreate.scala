package typings.googleapis.driveV3Mod.driveV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePermissionsCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A plain text custom message to include in the notification email.
    */
  var emailMessage: js.UndefOr[String] = js.native
  /**
    * The ID of the file or Team Drive.
    */
  var fileId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPermission] = js.native
  /**
    * Whether to send a notification email when sharing to users or groups.
    * This defaults to true for users and groups, and is not allowed for other
    * requests. It must not be disabled for ownership transfers.
    */
  var sendNotificationEmail: js.UndefOr[Boolean] = js.native
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  /**
    * Whether to transfer ownership to the specified user and downgrade the
    * current owner to a writer. This parameter is required as an
    * acknowledgement of the side effect.
    */
  var transferOwnership: js.UndefOr[Boolean] = js.native
  /**
    * Issue the request as a domain administrator; if set to true, then the
    * requester will be granted access if they are an administrator of the
    * domain to which the item belongs.
    */
  var useDomainAdminAccess: js.UndefOr[Boolean] = js.native
}

object ParamsResourcePermissionsCreate {
  @scala.inline
  def apply(): ParamsResourcePermissionsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePermissionsCreate]
  }
  @scala.inline
  implicit class ParamsResourcePermissionsCreateOps[Self <: ParamsResourcePermissionsCreate] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setEmailMessage(value: String): Self = this.set("emailMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailMessage: Self = this.set("emailMessage", js.undefined)
    @scala.inline
    def setFileId(value: String): Self = this.set("fileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileId: Self = this.set("fileId", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaPermission): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setSendNotificationEmail(value: Boolean): Self = this.set("sendNotificationEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendNotificationEmail: Self = this.set("sendNotificationEmail", js.undefined)
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = this.set("supportsTeamDrives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsTeamDrives: Self = this.set("supportsTeamDrives", js.undefined)
    @scala.inline
    def setTransferOwnership(value: Boolean): Self = this.set("transferOwnership", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferOwnership: Self = this.set("transferOwnership", js.undefined)
    @scala.inline
    def setUseDomainAdminAccess(value: Boolean): Self = this.set("useDomainAdminAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseDomainAdminAccess: Self = this.set("useDomainAdminAccess", js.undefined)
  }
  
}

