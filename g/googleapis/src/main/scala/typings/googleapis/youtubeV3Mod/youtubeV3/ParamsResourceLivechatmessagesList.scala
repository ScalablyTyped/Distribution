package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLivechatmessagesList
  extends StObject
     with StandardParameters {
  
  /**
    * Specifies the localization language in which the system messages should be returned.
    */
  var hl: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the live chat for which comments should be returned.
    */
  var liveChatId: js.UndefOr[String] = js.undefined
  
  /**
    * The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken property identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The *part* parameter specifies the liveChatComment resource parts that the API response will include. Supported values are id and snippet.
    */
  var part: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Specifies the size of the profile image that should be returned for each user.
    */
  var profileImageSize: js.UndefOr[Double] = js.undefined
}
object ParamsResourceLivechatmessagesList {
  
  inline def apply(): ParamsResourceLivechatmessagesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLivechatmessagesList]
  }
  
  extension [Self <: ParamsResourceLivechatmessagesList](x: Self) {
    
    inline def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    inline def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
    
    inline def setLiveChatId(value: String): Self = StObject.set(x, "liveChatId", value.asInstanceOf[js.Any])
    
    inline def setLiveChatIdUndefined: Self = StObject.set(x, "liveChatId", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPart(value: js.Array[String]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setPartVarargs(value: String*): Self = StObject.set(x, "part", js.Array(value*))
    
    inline def setProfileImageSize(value: Double): Self = StObject.set(x, "profileImageSize", value.asInstanceOf[js.Any])
    
    inline def setProfileImageSizeUndefined: Self = StObject.set(x, "profileImageSize", js.undefined)
  }
}
