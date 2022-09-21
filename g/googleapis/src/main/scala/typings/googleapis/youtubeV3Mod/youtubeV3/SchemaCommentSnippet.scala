package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCommentSnippet extends StObject {
  
  var authorChannelId: js.UndefOr[SchemaCommentSnippetAuthorChannelId] = js.undefined
  
  /**
    * Link to the author's YouTube channel, if any.
    */
  var authorChannelUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the user who posted the comment.
    */
  var authorDisplayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL for the avatar of the user who posted the comment.
    */
  var authorProfileImageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the current viewer can rate this comment.
    */
  var canRate: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The id of the corresponding YouTube channel. In case of a channel comment this is the channel the comment refers to. In case of a video comment it's the video's channel.
    */
  var channelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total number of likes this comment has received.
    */
  var likeCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The comment's moderation status. Will not be set if the comments were requested through the id filter.
    */
  var moderationStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique id of the parent comment, only set for replies.
    */
  var parentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date and time when the comment was originally published.
    */
  var publishedAt: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The comment's text. The format is either plain text or HTML dependent on what has been requested. Even the plain text representation may differ from the text originally posted in that it may replace video links with video titles etc.
    */
  var textDisplay: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The comment's original raw text as initially posted or last updated. The original text will only be returned if it is accessible to the viewer, which is only guaranteed if the viewer is the comment's author.
    */
  var textOriginal: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date and time when the comment was last updated.
    */
  var updatedAt: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the video the comment refers to, if any.
    */
  var videoId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The rating the viewer has given to this comment. For the time being this will never return RATE_TYPE_DISLIKE and instead return RATE_TYPE_NONE. This may change in the future.
    */
  var viewerRating: js.UndefOr[String | Null] = js.undefined
}
object SchemaCommentSnippet {
  
  inline def apply(): SchemaCommentSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommentSnippet]
  }
  
  extension [Self <: SchemaCommentSnippet](x: Self) {
    
    inline def setAuthorChannelId(value: SchemaCommentSnippetAuthorChannelId): Self = StObject.set(x, "authorChannelId", value.asInstanceOf[js.Any])
    
    inline def setAuthorChannelIdUndefined: Self = StObject.set(x, "authorChannelId", js.undefined)
    
    inline def setAuthorChannelUrl(value: String): Self = StObject.set(x, "authorChannelUrl", value.asInstanceOf[js.Any])
    
    inline def setAuthorChannelUrlNull: Self = StObject.set(x, "authorChannelUrl", null)
    
    inline def setAuthorChannelUrlUndefined: Self = StObject.set(x, "authorChannelUrl", js.undefined)
    
    inline def setAuthorDisplayName(value: String): Self = StObject.set(x, "authorDisplayName", value.asInstanceOf[js.Any])
    
    inline def setAuthorDisplayNameNull: Self = StObject.set(x, "authorDisplayName", null)
    
    inline def setAuthorDisplayNameUndefined: Self = StObject.set(x, "authorDisplayName", js.undefined)
    
    inline def setAuthorProfileImageUrl(value: String): Self = StObject.set(x, "authorProfileImageUrl", value.asInstanceOf[js.Any])
    
    inline def setAuthorProfileImageUrlNull: Self = StObject.set(x, "authorProfileImageUrl", null)
    
    inline def setAuthorProfileImageUrlUndefined: Self = StObject.set(x, "authorProfileImageUrl", js.undefined)
    
    inline def setCanRate(value: Boolean): Self = StObject.set(x, "canRate", value.asInstanceOf[js.Any])
    
    inline def setCanRateNull: Self = StObject.set(x, "canRate", null)
    
    inline def setCanRateUndefined: Self = StObject.set(x, "canRate", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdNull: Self = StObject.set(x, "channelId", null)
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setLikeCount(value: Double): Self = StObject.set(x, "likeCount", value.asInstanceOf[js.Any])
    
    inline def setLikeCountNull: Self = StObject.set(x, "likeCount", null)
    
    inline def setLikeCountUndefined: Self = StObject.set(x, "likeCount", js.undefined)
    
    inline def setModerationStatus(value: String): Self = StObject.set(x, "moderationStatus", value.asInstanceOf[js.Any])
    
    inline def setModerationStatusNull: Self = StObject.set(x, "moderationStatus", null)
    
    inline def setModerationStatusUndefined: Self = StObject.set(x, "moderationStatus", js.undefined)
    
    inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdNull: Self = StObject.set(x, "parentId", null)
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    inline def setPublishedAtNull: Self = StObject.set(x, "publishedAt", null)
    
    inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    inline def setTextDisplay(value: String): Self = StObject.set(x, "textDisplay", value.asInstanceOf[js.Any])
    
    inline def setTextDisplayNull: Self = StObject.set(x, "textDisplay", null)
    
    inline def setTextDisplayUndefined: Self = StObject.set(x, "textDisplay", js.undefined)
    
    inline def setTextOriginal(value: String): Self = StObject.set(x, "textOriginal", value.asInstanceOf[js.Any])
    
    inline def setTextOriginalNull: Self = StObject.set(x, "textOriginal", null)
    
    inline def setTextOriginalUndefined: Self = StObject.set(x, "textOriginal", js.undefined)
    
    inline def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtNull: Self = StObject.set(x, "updatedAt", null)
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    inline def setVideoIdNull: Self = StObject.set(x, "videoId", null)
    
    inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
    
    inline def setViewerRating(value: String): Self = StObject.set(x, "viewerRating", value.asInstanceOf[js.Any])
    
    inline def setViewerRatingNull: Self = StObject.set(x, "viewerRating", null)
    
    inline def setViewerRatingUndefined: Self = StObject.set(x, "viewerRating", js.undefined)
  }
}
