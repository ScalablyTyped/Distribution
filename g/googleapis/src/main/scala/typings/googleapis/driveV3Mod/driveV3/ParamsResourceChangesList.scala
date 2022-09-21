package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceChangesList
  extends StObject
     with StandardParameters {
  
  /**
    * The shared drive from which changes are returned. If specified the change IDs will be reflective of the shared drive; use the combined drive ID and change ID as an identifier.
    */
  var driveId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether changes should include the file resource if the file is still accessible by the user at the time of the request, even when a file was removed from the list of changes and there will be no further change entries for this file.
    */
  var includeCorpusRemovals: js.UndefOr[Boolean] = js.undefined
  
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
    * Whether to include changes indicating that items have been removed from the list of changes, for example by deletion or loss of access.
    */
  var includeRemoved: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Deprecated use includeItemsFromAllDrives instead.
    */
  var includeTeamDriveItems: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of changes to return per page.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response or to the response from the getStartPageToken method.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to restrict the results to changes inside the My Drive hierarchy. This omits changes to files such as those in the Application Data folder or shared files which have not been added to My Drive.
    */
  var restrictToMyDrive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A comma-separated list of spaces to query within the user corpus. Supported values are 'drive', 'appDataFolder' and 'photos'.
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
object ParamsResourceChangesList {
  
  inline def apply(): ParamsResourceChangesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChangesList]
  }
  
  extension [Self <: ParamsResourceChangesList](x: Self) {
    
    inline def setDriveId(value: String): Self = StObject.set(x, "driveId", value.asInstanceOf[js.Any])
    
    inline def setDriveIdUndefined: Self = StObject.set(x, "driveId", js.undefined)
    
    inline def setIncludeCorpusRemovals(value: Boolean): Self = StObject.set(x, "includeCorpusRemovals", value.asInstanceOf[js.Any])
    
    inline def setIncludeCorpusRemovalsUndefined: Self = StObject.set(x, "includeCorpusRemovals", js.undefined)
    
    inline def setIncludeItemsFromAllDrives(value: Boolean): Self = StObject.set(x, "includeItemsFromAllDrives", value.asInstanceOf[js.Any])
    
    inline def setIncludeItemsFromAllDrivesUndefined: Self = StObject.set(x, "includeItemsFromAllDrives", js.undefined)
    
    inline def setIncludeLabels(value: String): Self = StObject.set(x, "includeLabels", value.asInstanceOf[js.Any])
    
    inline def setIncludeLabelsUndefined: Self = StObject.set(x, "includeLabels", js.undefined)
    
    inline def setIncludePermissionsForView(value: String): Self = StObject.set(x, "includePermissionsForView", value.asInstanceOf[js.Any])
    
    inline def setIncludePermissionsForViewUndefined: Self = StObject.set(x, "includePermissionsForView", js.undefined)
    
    inline def setIncludeRemoved(value: Boolean): Self = StObject.set(x, "includeRemoved", value.asInstanceOf[js.Any])
    
    inline def setIncludeRemovedUndefined: Self = StObject.set(x, "includeRemoved", js.undefined)
    
    inline def setIncludeTeamDriveItems(value: Boolean): Self = StObject.set(x, "includeTeamDriveItems", value.asInstanceOf[js.Any])
    
    inline def setIncludeTeamDriveItemsUndefined: Self = StObject.set(x, "includeTeamDriveItems", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setRestrictToMyDrive(value: Boolean): Self = StObject.set(x, "restrictToMyDrive", value.asInstanceOf[js.Any])
    
    inline def setRestrictToMyDriveUndefined: Self = StObject.set(x, "restrictToMyDrive", js.undefined)
    
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
