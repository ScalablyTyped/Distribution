package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceChannelsList
  extends StObject
     with StandardParameters {
  
  /**
    * Return the channels within the specified guide category ID.
    */
  var categoryId: js.UndefOr[String] = js.undefined
  
  /**
    * Return the channel associated with a YouTube username.
    */
  var forUsername: js.UndefOr[String] = js.undefined
  
  /**
    * Stands for "host language". Specifies the localization language of the metadata to be filled into snippet.localized. The field is filled with the default metadata if there is no localization in the specified language. The parameter value must be a language code included in the list returned by the i18nLanguages.list method (e.g. en_US, es_MX).
    */
  var hl: js.UndefOr[String] = js.undefined
  
  /**
    * Return the channels with the specified IDs.
    */
  var id: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Return the channels managed by the authenticated user.
    */
  var managedByMe: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Return the ids of channels owned by the authenticated user.
    */
  var mine: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Return the channels subscribed to the authenticated user
    */
  var mySubscribers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.undefined
  
  /**
    * The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The *part* parameter specifies a comma-separated list of one or more channel resource properties that the API response will include. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a channel resource, the contentDetails property contains other properties, such as the uploads properties. As such, if you set *part=contentDetails*, the API response will also contain all of those nested properties.
    */
  var part: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceChannelsList {
  
  inline def apply(): ParamsResourceChannelsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChannelsList]
  }
  
  extension [Self <: ParamsResourceChannelsList](x: Self) {
    
    inline def setCategoryId(value: String): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
    
    inline def setCategoryIdUndefined: Self = StObject.set(x, "categoryId", js.undefined)
    
    inline def setForUsername(value: String): Self = StObject.set(x, "forUsername", value.asInstanceOf[js.Any])
    
    inline def setForUsernameUndefined: Self = StObject.set(x, "forUsername", js.undefined)
    
    inline def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    inline def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
    
    inline def setId(value: js.Array[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdVarargs(value: String*): Self = StObject.set(x, "id", js.Array(value*))
    
    inline def setManagedByMe(value: Boolean): Self = StObject.set(x, "managedByMe", value.asInstanceOf[js.Any])
    
    inline def setManagedByMeUndefined: Self = StObject.set(x, "managedByMe", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMine(value: Boolean): Self = StObject.set(x, "mine", value.asInstanceOf[js.Any])
    
    inline def setMineUndefined: Self = StObject.set(x, "mine", js.undefined)
    
    inline def setMySubscribers(value: Boolean): Self = StObject.set(x, "mySubscribers", value.asInstanceOf[js.Any])
    
    inline def setMySubscribersUndefined: Self = StObject.set(x, "mySubscribers", js.undefined)
    
    inline def setOnBehalfOfContentOwner(value: String): Self = StObject.set(x, "onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfContentOwnerUndefined: Self = StObject.set(x, "onBehalfOfContentOwner", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPart(value: js.Array[String]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setPartVarargs(value: String*): Self = StObject.set(x, "part", js.Array(value*))
  }
}
