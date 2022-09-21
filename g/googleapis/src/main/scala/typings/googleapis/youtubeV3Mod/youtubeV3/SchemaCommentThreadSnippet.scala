package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCommentThreadSnippet extends StObject {
  
  /**
    * Whether the current viewer of the thread can reply to it. This is viewer specific - other viewers may see a different value for this field.
    */
  var canReply: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The YouTube channel the comments in the thread refer to or the channel with the video the comments refer to. If video_id isn't set the comments refer to the channel itself.
    */
  var channelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the thread (and therefore all its comments) is visible to all YouTube users.
    */
  var isPublic: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The top level comment of this thread.
    */
  var topLevelComment: js.UndefOr[SchemaComment] = js.undefined
  
  /**
    * The total number of replies (not including the top level comment).
    */
  var totalReplyCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The ID of the video the comments refer to, if any. No video_id implies a channel discussion comment.
    */
  var videoId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCommentThreadSnippet {
  
  inline def apply(): SchemaCommentThreadSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommentThreadSnippet]
  }
  
  extension [Self <: SchemaCommentThreadSnippet](x: Self) {
    
    inline def setCanReply(value: Boolean): Self = StObject.set(x, "canReply", value.asInstanceOf[js.Any])
    
    inline def setCanReplyNull: Self = StObject.set(x, "canReply", null)
    
    inline def setCanReplyUndefined: Self = StObject.set(x, "canReply", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdNull: Self = StObject.set(x, "channelId", null)
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setIsPublic(value: Boolean): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
    
    inline def setIsPublicNull: Self = StObject.set(x, "isPublic", null)
    
    inline def setIsPublicUndefined: Self = StObject.set(x, "isPublic", js.undefined)
    
    inline def setTopLevelComment(value: SchemaComment): Self = StObject.set(x, "topLevelComment", value.asInstanceOf[js.Any])
    
    inline def setTopLevelCommentUndefined: Self = StObject.set(x, "topLevelComment", js.undefined)
    
    inline def setTotalReplyCount(value: Double): Self = StObject.set(x, "totalReplyCount", value.asInstanceOf[js.Any])
    
    inline def setTotalReplyCountNull: Self = StObject.set(x, "totalReplyCount", null)
    
    inline def setTotalReplyCountUndefined: Self = StObject.set(x, "totalReplyCount", js.undefined)
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    inline def setVideoIdNull: Self = StObject.set(x, "videoId", null)
    
    inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
  }
}
