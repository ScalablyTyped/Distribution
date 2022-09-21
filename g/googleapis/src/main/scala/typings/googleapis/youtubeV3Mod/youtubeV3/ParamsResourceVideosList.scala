package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVideosList
  extends StObject
     with StandardParameters {
  
  /**
    * Return the videos that are in the specified chart.
    */
  var chart: js.UndefOr[String] = js.undefined
  
  /**
    * Stands for "host language". Specifies the localization language of the metadata to be filled into snippet.localized. The field is filled with the default metadata if there is no localization in the specified language. The parameter value must be a language code included in the list returned by the i18nLanguages.list method (e.g. en_US, es_MX).
    */
  var hl: js.UndefOr[String] = js.undefined
  
  /**
    * Return videos with the given ids.
    */
  var id: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    *
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * The *maxResults* parameter specifies the maximum number of items that should be returned in the result set. *Note:* This parameter is supported for use in conjunction with the myRating and chart parameters, but it is not supported for use in conjunction with the id parameter.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Return the player with maximum height specified in
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Return videos liked/disliked by the authenticated user. Does not support RateType.RATED_TYPE_NONE.
    */
  var myRating: js.UndefOr[String] = js.undefined
  
  /**
    * *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.undefined
  
  /**
    * The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved. *Note:* This parameter is supported for use in conjunction with the myRating and chart parameters, but it is not supported for use in conjunction with the id parameter.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The *part* parameter specifies a comma-separated list of one or more video resource properties that the API response will include. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a video resource, the snippet property contains the channelId, title, description, tags, and categoryId properties. As such, if you set *part=snippet*, the API response will contain all of those properties.
    */
  var part: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Use a chart that is specific to the specified region
    */
  var regionCode: js.UndefOr[String] = js.undefined
  
  /**
    * Use chart that is specific to the specified video category
    */
  var videoCategoryId: js.UndefOr[String] = js.undefined
}
object ParamsResourceVideosList {
  
  inline def apply(): ParamsResourceVideosList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVideosList]
  }
  
  extension [Self <: ParamsResourceVideosList](x: Self) {
    
    inline def setChart(value: String): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
    
    inline def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    inline def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
    
    inline def setId(value: js.Array[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdVarargs(value: String*): Self = StObject.set(x, "id", js.Array(value*))
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMyRating(value: String): Self = StObject.set(x, "myRating", value.asInstanceOf[js.Any])
    
    inline def setMyRatingUndefined: Self = StObject.set(x, "myRating", js.undefined)
    
    inline def setOnBehalfOfContentOwner(value: String): Self = StObject.set(x, "onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfContentOwnerUndefined: Self = StObject.set(x, "onBehalfOfContentOwner", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPart(value: js.Array[String]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setPartVarargs(value: String*): Self = StObject.set(x, "part", js.Array(value*))
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    inline def setVideoCategoryId(value: String): Self = StObject.set(x, "videoCategoryId", value.asInstanceOf[js.Any])
    
    inline def setVideoCategoryIdUndefined: Self = StObject.set(x, "videoCategoryId", js.undefined)
  }
}
