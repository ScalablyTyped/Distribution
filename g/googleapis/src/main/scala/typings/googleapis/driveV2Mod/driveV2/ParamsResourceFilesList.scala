package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceFilesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Comma-separated list of bodies of items (files/documents) to which the
    * query applies. Supported bodies are 'default', 'domain', 'teamDrive' and
    * 'allTeamDrives'. 'allTeamDrives' must be combined with 'default'; all
    * other values must be used in isolation. Prefer 'default' or 'teamDrive'
    * to 'allTeamDrives' for efficiency.
    */
  var corpora: js.UndefOr[String] = js.native
  /**
    * The body of items (files/documents) to which the query applies.
    * Deprecated: use 'corpora' instead.
    */
  var corpus: js.UndefOr[String] = js.native
  /**
    * Whether Team Drive items should be included in results.
    */
  var includeTeamDriveItems: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of files to return per page. Partial or empty result
    * pages are possible even before the end of the files list has been
    * reached.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * A comma-separated list of sort keys. Valid keys are 'createdDate',
    * 'folder', 'lastViewedByMeDate', 'modifiedByMeDate', 'modifiedDate',
    * 'quotaBytesUsed', 'recency', 'sharedWithMeDate', 'starred', 'title', and
    * 'title_natural'. Each key sorts ascending by default, but may be reversed
    * with the 'desc' modifier. Example usage: ?orderBy=folder,modifiedDate
    * desc,title. Please note that there is a current limitation for users with
    * approximately one million files in which the requested sort order is
    * ignored.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Page token for files.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * This parameter is deprecated and has no function.
    */
  var projection: js.UndefOr[String] = js.native
  /**
    * Query string for searching files.
    */
  var q: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of spaces to query. Supported values are 'drive',
    * 'appDataFolder' and 'photos'.
    */
  var spaces: js.UndefOr[String] = js.native
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  /**
    * ID of Team Drive to search.
    */
  var teamDriveId: js.UndefOr[String] = js.native
}

object ParamsResourceFilesList {
  @scala.inline
  def apply(): ParamsResourceFilesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFilesList]
  }
  @scala.inline
  implicit class ParamsResourceFilesListOps[Self <: ParamsResourceFilesList] (val x: Self) extends AnyVal {
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
    def setCorpora(value: String): Self = this.set("corpora", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorpora: Self = this.set("corpora", js.undefined)
    @scala.inline
    def setCorpus(value: String): Self = this.set("corpus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorpus: Self = this.set("corpus", js.undefined)
    @scala.inline
    def setIncludeTeamDriveItems(value: Boolean): Self = this.set("includeTeamDriveItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeTeamDriveItems: Self = this.set("includeTeamDriveItems", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
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

