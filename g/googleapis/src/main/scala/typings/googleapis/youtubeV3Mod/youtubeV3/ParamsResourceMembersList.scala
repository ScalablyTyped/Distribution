package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMembersList
  extends StObject
     with StandardParameters {
  
  /**
    * Comma separated list of channel IDs. Only data about members that are part of this list will be included in the response.
    */
  var filterByMemberChannelId: js.UndefOr[String] = js.undefined
  
  /**
    * Filter members in the results set to the ones that have access to a level.
    */
  var hasAccessToLevel: js.UndefOr[String] = js.undefined
  
  /**
    * The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Parameter that specifies which channel members to return.
    */
  var mode: js.UndefOr[String] = js.undefined
  
  /**
    * The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The *part* parameter specifies the member resource parts that the API response will include. Set the parameter value to snippet.
    */
  var part: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceMembersList {
  
  inline def apply(): ParamsResourceMembersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMembersList]
  }
  
  extension [Self <: ParamsResourceMembersList](x: Self) {
    
    inline def setFilterByMemberChannelId(value: String): Self = StObject.set(x, "filterByMemberChannelId", value.asInstanceOf[js.Any])
    
    inline def setFilterByMemberChannelIdUndefined: Self = StObject.set(x, "filterByMemberChannelId", js.undefined)
    
    inline def setHasAccessToLevel(value: String): Self = StObject.set(x, "hasAccessToLevel", value.asInstanceOf[js.Any])
    
    inline def setHasAccessToLevelUndefined: Self = StObject.set(x, "hasAccessToLevel", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPart(value: js.Array[String]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setPartVarargs(value: String*): Self = StObject.set(x, "part", js.Array(value*))
  }
}
