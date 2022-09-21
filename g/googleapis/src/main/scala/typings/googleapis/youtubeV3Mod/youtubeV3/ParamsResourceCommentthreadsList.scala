package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCommentthreadsList
  extends StObject
     with StandardParameters {
  
  /**
    * Returns the comment threads of all videos of the channel and the channel comments as well.
    */
  var allThreadsRelatedToChannelId: js.UndefOr[String] = js.undefined
  
  /**
    * Returns the comment threads for all the channel comments (ie does not include comments left on videos).
    */
  var channelId: js.UndefOr[String] = js.undefined
  
  /**
    * Returns the comment threads with the given IDs for Stubby or Apiary.
    */
  var id: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Limits the returned comment threads to those with the specified moderation status. Not compatible with the 'id' filter. Valid values: published, heldForReview, likelySpam.
    */
  var moderationStatus: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var order: js.UndefOr[String] = js.undefined
  
  /**
    * The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The *part* parameter specifies a comma-separated list of one or more commentThread resource properties that the API response will include.
    */
  var part: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Limits the returned comment threads to those matching the specified key words. Not compatible with the 'id' filter.
    */
  var searchTerms: js.UndefOr[String] = js.undefined
  
  /**
    * The requested text format for the returned comments.
    */
  var textFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Returns the comment threads of the specified video.
    */
  var videoId: js.UndefOr[String] = js.undefined
}
object ParamsResourceCommentthreadsList {
  
  inline def apply(): ParamsResourceCommentthreadsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCommentthreadsList]
  }
  
  extension [Self <: ParamsResourceCommentthreadsList](x: Self) {
    
    inline def setAllThreadsRelatedToChannelId(value: String): Self = StObject.set(x, "allThreadsRelatedToChannelId", value.asInstanceOf[js.Any])
    
    inline def setAllThreadsRelatedToChannelIdUndefined: Self = StObject.set(x, "allThreadsRelatedToChannelId", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setId(value: js.Array[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdVarargs(value: String*): Self = StObject.set(x, "id", js.Array(value*))
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setModerationStatus(value: String): Self = StObject.set(x, "moderationStatus", value.asInstanceOf[js.Any])
    
    inline def setModerationStatusUndefined: Self = StObject.set(x, "moderationStatus", js.undefined)
    
    inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPart(value: js.Array[String]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setPartVarargs(value: String*): Self = StObject.set(x, "part", js.Array(value*))
    
    inline def setSearchTerms(value: String): Self = StObject.set(x, "searchTerms", value.asInstanceOf[js.Any])
    
    inline def setSearchTermsUndefined: Self = StObject.set(x, "searchTerms", js.undefined)
    
    inline def setTextFormat(value: String): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    inline def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
  }
}
