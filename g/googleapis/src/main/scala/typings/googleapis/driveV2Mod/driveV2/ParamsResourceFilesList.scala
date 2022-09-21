package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFilesList
  extends StObject
     with StandardParameters {
  
  /**
    * Groupings of files to which the query applies. Supported groupings are: 'user' (files created by, opened by, or shared directly with the user), 'drive' (files in the specified shared drive as indicated by the 'driveId'), 'domain' (files shared to the user's domain), and 'allDrives' (A combination of 'user' and 'drive' for all drives where the user is a member). When able, use 'user' or 'drive', instead of 'allDrives', for efficiency.
    */
  var corpora: js.UndefOr[String] = js.undefined
  
  /**
    * The body of items (files/documents) to which the query applies. Deprecated: use 'corpora' instead.
    */
  var corpus: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the shared drive to search.
    */
  var driveId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether both My Drive and shared drive items should be included in results.
    */
  var includeItemsFromAllDrives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A comma-separated list of IDs of labels to include in the labelInfo part of the response.
    */
  var includeLabels: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies which additional view's permissions to include in the response. Only 'published' is supported.
    */
  var includePermissionsForView: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated use includeItemsFromAllDrives instead.
    */
  var includeTeamDriveItems: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of files to return per page. Partial or empty result pages are possible even before the end of the files list has been reached.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * A comma-separated list of sort keys. Valid keys are 'createdDate', 'folder', 'lastViewedByMeDate', 'modifiedByMeDate', 'modifiedDate', 'quotaBytesUsed', 'recency', 'sharedWithMeDate', 'starred', 'title', and 'title_natural'. Each key sorts ascending by default, but may be reversed with the 'desc' modifier. Example usage: ?orderBy=folder,modifiedDate desc,title. Please note that there is a current limitation for users with approximately one million files in which the requested sort order is ignored.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Page token for files.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * This parameter is deprecated and has no function.
    */
  var projection: js.UndefOr[String] = js.undefined
  
  /**
    * Query string for searching files.
    */
  var q: js.UndefOr[String] = js.undefined
  
  /**
    * A comma-separated list of spaces to query. Supported values are 'drive' and 'appDataFolder'.
    */
  var spaces: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the requesting application supports both My Drives and shared drives.
    */
  var supportsAllDrives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Deprecated use supportsAllDrives instead.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Deprecated use driveId instead.
    */
  var teamDriveId: js.UndefOr[String] = js.undefined
}
object ParamsResourceFilesList {
  
  inline def apply(): ParamsResourceFilesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFilesList]
  }
  
  extension [Self <: ParamsResourceFilesList](x: Self) {
    
    inline def setCorpora(value: String): Self = StObject.set(x, "corpora", value.asInstanceOf[js.Any])
    
    inline def setCorporaUndefined: Self = StObject.set(x, "corpora", js.undefined)
    
    inline def setCorpus(value: String): Self = StObject.set(x, "corpus", value.asInstanceOf[js.Any])
    
    inline def setCorpusUndefined: Self = StObject.set(x, "corpus", js.undefined)
    
    inline def setDriveId(value: String): Self = StObject.set(x, "driveId", value.asInstanceOf[js.Any])
    
    inline def setDriveIdUndefined: Self = StObject.set(x, "driveId", js.undefined)
    
    inline def setIncludeItemsFromAllDrives(value: Boolean): Self = StObject.set(x, "includeItemsFromAllDrives", value.asInstanceOf[js.Any])
    
    inline def setIncludeItemsFromAllDrivesUndefined: Self = StObject.set(x, "includeItemsFromAllDrives", js.undefined)
    
    inline def setIncludeLabels(value: String): Self = StObject.set(x, "includeLabels", value.asInstanceOf[js.Any])
    
    inline def setIncludeLabelsUndefined: Self = StObject.set(x, "includeLabels", js.undefined)
    
    inline def setIncludePermissionsForView(value: String): Self = StObject.set(x, "includePermissionsForView", value.asInstanceOf[js.Any])
    
    inline def setIncludePermissionsForViewUndefined: Self = StObject.set(x, "includePermissionsForView", js.undefined)
    
    inline def setIncludeTeamDriveItems(value: Boolean): Self = StObject.set(x, "includeTeamDriveItems", value.asInstanceOf[js.Any])
    
    inline def setIncludeTeamDriveItemsUndefined: Self = StObject.set(x, "includeTeamDriveItems", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setSpaces(value: String): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
    
    inline def setSupportsAllDrives(value: Boolean): Self = StObject.set(x, "supportsAllDrives", value.asInstanceOf[js.Any])
    
    inline def setSupportsAllDrivesUndefined: Self = StObject.set(x, "supportsAllDrives", js.undefined)
    
    inline def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    inline def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
    
    inline def setTeamDriveId(value: String): Self = StObject.set(x, "teamDriveId", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveIdUndefined: Self = StObject.set(x, "teamDriveId", js.undefined)
  }
}
