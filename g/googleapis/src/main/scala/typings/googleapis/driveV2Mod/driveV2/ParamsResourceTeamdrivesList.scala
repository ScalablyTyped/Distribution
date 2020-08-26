package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceTeamdrivesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Maximum number of Team Drives to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Page token for Team Drives.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Query string for searching Team Drives.
    */
  var q: js.UndefOr[String] = js.native
  /**
    * Issue the request as a domain administrator; if set to true, then all
    * Team Drives of the domain in which the requester is an administrator are
    * returned.
    */
  var useDomainAdminAccess: js.UndefOr[Boolean] = js.native
}

object ParamsResourceTeamdrivesList {
  @scala.inline
  def apply(): ParamsResourceTeamdrivesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTeamdrivesList]
  }
  @scala.inline
  implicit class ParamsResourceTeamdrivesListOps[Self <: ParamsResourceTeamdrivesList] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    @scala.inline
    def setUseDomainAdminAccess(value: Boolean): Self = this.set("useDomainAdminAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseDomainAdminAccess: Self = this.set("useDomainAdminAccess", js.undefined)
  }
  
}

