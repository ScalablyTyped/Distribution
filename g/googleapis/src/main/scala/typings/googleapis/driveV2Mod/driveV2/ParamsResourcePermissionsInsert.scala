package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePermissionsInsert extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A plain text custom message to include in notification emails.
    */
  var emailMessage: js.UndefOr[String] = js.native
  /**
    * The ID for the file or Team Drive.
    */
  var fileId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPermission] = js.native
  /**
    * Whether to send notification emails when sharing to users or groups. This
    * parameter is ignored and an email is sent if the role is owner.
    */
  var sendNotificationEmails: js.UndefOr[Boolean] = js.native
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  /**
    * Issue the request as a domain administrator; if set to true, then the
    * requester will be granted access if they are an administrator of the
    * domain to which the item belongs.
    */
  var useDomainAdminAccess: js.UndefOr[Boolean] = js.native
}

object ParamsResourcePermissionsInsert {
  @scala.inline
  def apply(): ParamsResourcePermissionsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePermissionsInsert]
  }
  @scala.inline
  implicit class ParamsResourcePermissionsInsertOps[Self <: ParamsResourcePermissionsInsert] (val x: Self) extends AnyVal {
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
    def setSendNotificationEmails(value: Boolean): Self = this.set("sendNotificationEmails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendNotificationEmails: Self = this.set("sendNotificationEmails", js.undefined)
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = this.set("supportsTeamDrives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsTeamDrives: Self = this.set("supportsTeamDrives", js.undefined)
    @scala.inline
    def setUseDomainAdminAccess(value: Boolean): Self = this.set("useDomainAdminAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseDomainAdminAccess: Self = this.set("useDomainAdminAccess", js.undefined)
  }
  
}

