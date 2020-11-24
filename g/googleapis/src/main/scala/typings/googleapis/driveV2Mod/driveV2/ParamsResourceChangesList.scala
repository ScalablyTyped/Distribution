package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceChangesList extends StandardParameters {
  
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
  var includeDeleted: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to include changes outside the My Drive hierarchy in the result.
    * When set to false, changes to files such as those in the Application Data
    * folder or shared files which have not been added to My Drive will be
    * omitted from the result.
    */
  var includeSubscribed: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether Team Drive files or changes should be included in results.
    */
  var includeTeamDriveItems: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum number of changes to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * The token for continuing a previous list request on the next page. This
    * should be set to the value of 'nextPageToken' from the previous response
    * or to the response from the getStartPageToken method.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * A comma-separated list of spaces to query. Supported values are 'drive',
    * 'appDataFolder' and 'photos'.
    */
  var spaces: js.UndefOr[String] = js.native
  
  /**
    * Deprecated - use pageToken instead.
    */
  var startChangeId: js.UndefOr[String] = js.native
  
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
object ParamsResourceChangesList {
  
  @scala.inline
  def apply(): ParamsResourceChangesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChangesList]
  }
  
  @scala.inline
  implicit class ParamsResourceChangesListOps[Self <: ParamsResourceChangesList] (val x: Self) extends AnyVal {
    
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
    def setIncludeDeleted(value: Boolean): Self = this.set("includeDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDeleted: Self = this.set("includeDeleted", js.undefined)
    
    @scala.inline
    def setIncludeSubscribed(value: Boolean): Self = this.set("includeSubscribed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeSubscribed: Self = this.set("includeSubscribed", js.undefined)
    
    @scala.inline
    def setIncludeTeamDriveItems(value: Boolean): Self = this.set("includeTeamDriveItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeTeamDriveItems: Self = this.set("includeTeamDriveItems", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setSpaces(value: String): Self = this.set("spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaces: Self = this.set("spaces", js.undefined)
    
    @scala.inline
    def setStartChangeId(value: String): Self = this.set("startChangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartChangeId: Self = this.set("startChangeId", js.undefined)
    
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
