package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic details about a comment thread.
  */
trait SchemaCommentThreadSnippet extends StObject {
  
  /**
    * Whether the current viewer of the thread can reply to it. This is viewer
    * specific - other viewers may see a different value for this field.
    */
  var canReply: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The YouTube channel the comments in the thread refer to or the channel
    * with the video the comments refer to. If video_id isn&#39;t set the
    * comments refer to the channel itself.
    */
  var channelId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the thread (and therefore all its comments) is visible to all
    * YouTube users.
    */
  var isPublic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The top level comment of this thread.
    */
  var topLevelComment: js.UndefOr[SchemaComment] = js.undefined
  
  /**
    * The total number of replies (not including the top level comment).
    */
  var totalReplyCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID of the video the comments refer to, if any. No video_id implies a
    * channel discussion comment.
    */
  var videoId: js.UndefOr[String] = js.undefined
}
object SchemaCommentThreadSnippet {
  
  @scala.inline
  def apply(): SchemaCommentThreadSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommentThreadSnippet]
  }
  
  @scala.inline
  implicit class SchemaCommentThreadSnippetMutableBuilder[Self <: SchemaCommentThreadSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanReply(value: Boolean): Self = StObject.set(x, "canReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanReplyUndefined: Self = StObject.set(x, "canReply", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setIsPublic(value: Boolean): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPublicUndefined: Self = StObject.set(x, "isPublic", js.undefined)
    
    @scala.inline
    def setTopLevelComment(value: SchemaComment): Self = StObject.set(x, "topLevelComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopLevelCommentUndefined: Self = StObject.set(x, "topLevelComment", js.undefined)
    
    @scala.inline
    def setTotalReplyCount(value: Double): Self = StObject.set(x, "totalReplyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalReplyCountUndefined: Self = StObject.set(x, "totalReplyCount", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
  }
}
