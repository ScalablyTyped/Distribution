package typings.googleapis.driveV3Mod.driveV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePermissionsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID of the file or Team Drive.
    */
  var fileId: js.UndefOr[String] = js.native
  /**
    * The maximum number of permissions to return per page. When not set for
    * files in a Team Drive, at most 100 results will be returned. When not set
    * for files that are not in a Team Drive, the entire list will be returned.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The token for continuing a previous list request on the next page. This
    * should be set to the value of 'nextPageToken' from the previous response.
    */
  var pageToken: js.UndefOr[String] = js.native
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

object ParamsResourcePermissionsList {
  @scala.inline
  def apply(): ParamsResourcePermissionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePermissionsList]
  }
  @scala.inline
  implicit class ParamsResourcePermissionsListOps[Self <: ParamsResourcePermissionsList] (val x: Self) extends AnyVal {
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
    def setFileId(value: String): Self = this.set("fileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileId: Self = this.set("fileId", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
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

