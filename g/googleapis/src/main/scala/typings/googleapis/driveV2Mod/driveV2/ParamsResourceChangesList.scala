package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceChangesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Whether changes should include the file resource if the file is still
    * accessible by the user at the time of the request, even when a file was
    * removed from the list of changes and there will be no further change
    * entries for this file.
    */
  var includeCorpusRemovals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to include changes indicating that items have been removed from
    * the list of changes, for example by deletion or loss of access.
    */
  var includeDeleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to include changes outside the My Drive hierarchy in the result.
    * When set to false, changes to files such as those in the Application Data
    * folder or shared files which have not been added to My Drive will be
    * omitted from the result.
    */
  var includeSubscribed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether Team Drive files or changes should be included in results.
    */
  var includeTeamDriveItems: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of changes to return.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The token for continuing a previous list request on the next page. This
    * should be set to the value of 'nextPageToken' from the previous response
    * or to the response from the getStartPageToken method.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A comma-separated list of spaces to query. Supported values are 'drive',
    * 'appDataFolder' and 'photos'.
    */
  var spaces: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated - use pageToken instead.
    */
  var startChangeId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Team Drive from which changes will be returned. If specified the
    * change IDs will be reflective of the Team Drive; use the combined Team
    * Drive ID and change ID as an identifier.
    */
  var teamDriveId: js.UndefOr[String] = js.undefined
}
object ParamsResourceChangesList {
  
  inline def apply(): ParamsResourceChangesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChangesList]
  }
  
  extension [Self <: ParamsResourceChangesList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setIncludeCorpusRemovals(value: Boolean): Self = StObject.set(x, "includeCorpusRemovals", value.asInstanceOf[js.Any])
    
    inline def setIncludeCorpusRemovalsUndefined: Self = StObject.set(x, "includeCorpusRemovals", js.undefined)
    
    inline def setIncludeDeleted(value: Boolean): Self = StObject.set(x, "includeDeleted", value.asInstanceOf[js.Any])
    
    inline def setIncludeDeletedUndefined: Self = StObject.set(x, "includeDeleted", js.undefined)
    
    inline def setIncludeSubscribed(value: Boolean): Self = StObject.set(x, "includeSubscribed", value.asInstanceOf[js.Any])
    
    inline def setIncludeSubscribedUndefined: Self = StObject.set(x, "includeSubscribed", js.undefined)
    
    inline def setIncludeTeamDriveItems(value: Boolean): Self = StObject.set(x, "includeTeamDriveItems", value.asInstanceOf[js.Any])
    
    inline def setIncludeTeamDriveItemsUndefined: Self = StObject.set(x, "includeTeamDriveItems", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setSpaces(value: String): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
    
    inline def setStartChangeId(value: String): Self = StObject.set(x, "startChangeId", value.asInstanceOf[js.Any])
    
    inline def setStartChangeIdUndefined: Self = StObject.set(x, "startChangeId", js.undefined)
    
    inline def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    inline def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
    
    inline def setTeamDriveId(value: String): Self = StObject.set(x, "teamDriveId", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveIdUndefined: Self = StObject.set(x, "teamDriveId", js.undefined)
  }
}
