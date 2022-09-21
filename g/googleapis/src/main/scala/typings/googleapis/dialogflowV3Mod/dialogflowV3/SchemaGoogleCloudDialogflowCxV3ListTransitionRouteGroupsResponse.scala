package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ListTransitionRouteGroupsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of transition route groups. There will be a maximum number of items returned based on the page_size field in the request. The list may in some cases be empty or contain fewer entries than page_size even if this isn't the last page.
    */
  var transitionRouteGroups: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ListTransitionRouteGroupsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ListTransitionRouteGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ListTransitionRouteGroupsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ListTransitionRouteGroupsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTransitionRouteGroups(value: js.Array[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup]): Self = StObject.set(x, "transitionRouteGroups", value.asInstanceOf[js.Any])
    
    inline def setTransitionRouteGroupsUndefined: Self = StObject.set(x, "transitionRouteGroups", js.undefined)
    
    inline def setTransitionRouteGroupsVarargs(value: SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup*): Self = StObject.set(x, "transitionRouteGroups", js.Array(value*))
  }
}
