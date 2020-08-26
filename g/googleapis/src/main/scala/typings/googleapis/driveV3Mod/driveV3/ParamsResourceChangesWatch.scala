package typings.googleapis.driveV3Mod.driveV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceChangesWatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Whether changes should include the file resource if the file is still
    * accessible by the user at the time of the request, even when a file was
    * removed from the list of changes and there will be no further change
    * entries for this file.
    */
  var includeCorpusRemovals: js.UndefOr[Boolean] = js.native
  /**
    * Whether to include changes indicating that items have been removed from
    * the list of changes, for example by deletion or loss of access.
    */
  var includeRemoved: js.UndefOr[Boolean] = js.native
  /**
    * Whether Team Drive files or changes should be included in results.
    */
  var includeTeamDriveItems: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of changes to return per page.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The token for continuing a previous list request on the next page. This
    * should be set to the value of 'nextPageToken' from the previous response
    * or to the response from the getStartPageToken method.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaChannel] = js.native
  /**
    * Whether to restrict the results to changes inside the My Drive hierarchy.
    * This omits changes to files such as those in the Application Data folder
    * or shared files which have not been added to My Drive.
    */
  var restrictToMyDrive: js.UndefOr[Boolean] = js.native
  /**
    * A comma-separated list of spaces to query within the user corpus.
    * Supported values are 'drive', 'appDataFolder' and 'photos'.
    */
  var spaces: js.UndefOr[String] = js.native
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  /**
    * The Team Drive from which changes will be returned. If specified the
    * change IDs will be reflective of the Team Drive; use the combined Team
    * Drive ID and change ID as an identifier.
    */
  var teamDriveId: js.UndefOr[String] = js.native
}

object ParamsResourceChangesWatch {
  @scala.inline
  def apply(): ParamsResourceChangesWatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChangesWatch]
  }
  @scala.inline
  implicit class ParamsResourceChangesWatchOps[Self <: ParamsResourceChangesWatch] (val x: Self) extends AnyVal {
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
    def setIncludeCorpusRemovals(value: Boolean): Self = this.set("includeCorpusRemovals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeCorpusRemovals: Self = this.set("includeCorpusRemovals", js.undefined)
    @scala.inline
    def setIncludeRemoved(value: Boolean): Self = this.set("includeRemoved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeRemoved: Self = this.set("includeRemoved", js.undefined)
    @scala.inline
    def setIncludeTeamDriveItems(value: Boolean): Self = this.set("includeTeamDriveItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeTeamDriveItems: Self = this.set("includeTeamDriveItems", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaChannel): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setRestrictToMyDrive(value: Boolean): Self = this.set("restrictToMyDrive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrictToMyDrive: Self = this.set("restrictToMyDrive", js.undefined)
    @scala.inline
    def setSpaces(value: String): Self = this.set("spaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaces: Self = this.set("spaces", js.undefined)
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = this.set("supportsTeamDrives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsTeamDrives: Self = this.set("supportsTeamDrives", js.undefined)
    @scala.inline
    def setTeamDriveId(value: String): Self = this.set("teamDriveId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeamDriveId: Self = this.set("teamDriveId", js.undefined)
  }
  
}

