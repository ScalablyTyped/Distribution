package typings.instagramPrivateApi.mediaCommentsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaCommentsFeedResponse extends js.Object {
  
  var can_view_more_preview_comments: Boolean = js.native
  
  var caption: MediaCommentsFeedResponseCaption = js.native
  
  var caption_is_edited: Boolean = js.native
  
  var comment_count: Double = js.native
  
  var comment_likes_enabled: Boolean = js.native
  
  var comments: js.Array[MediaCommentsFeedResponseCommentsItem] = js.native
  
  var has_more_comments: Boolean = js.native
  
  var has_more_headload_comments: Boolean = js.native
  
  var initiate_at_top: Boolean = js.native
  
  var insert_new_comment_to_top: Boolean = js.native
  
  var media_header_display: String = js.native
  
  var next_max_id: String = js.native
  
  var next_min_id: String = js.native
  
  var preview_comments: js.Array[MediaCommentsFeedResponsePreviewCommentsItem] = js.native
  
  var quick_response_emojis: js.Array[MediaCommentsFeedResponseQuickResponseEmojisItem] = js.native
  
  var status: String = js.native
  
  var threading_enabled: Boolean = js.native
}
object MediaCommentsFeedResponse {
  
  @scala.inline
  def apply(
    can_view_more_preview_comments: Boolean,
    caption: MediaCommentsFeedResponseCaption,
    caption_is_edited: Boolean,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comments: js.Array[MediaCommentsFeedResponseCommentsItem],
    has_more_comments: Boolean,
    has_more_headload_comments: Boolean,
    initiate_at_top: Boolean,
    insert_new_comment_to_top: Boolean,
    media_header_display: String,
    next_max_id: String,
    next_min_id: String,
    preview_comments: js.Array[MediaCommentsFeedResponsePreviewCommentsItem],
    quick_response_emojis: js.Array[MediaCommentsFeedResponseQuickResponseEmojisItem],
    status: String,
    threading_enabled: Boolean
  ): MediaCommentsFeedResponse = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], has_more_headload_comments = has_more_headload_comments.asInstanceOf[js.Any], initiate_at_top = initiate_at_top.asInstanceOf[js.Any], insert_new_comment_to_top = insert_new_comment_to_top.asInstanceOf[js.Any], media_header_display = media_header_display.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], next_min_id = next_min_id.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], quick_response_emojis = quick_response_emojis.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], threading_enabled = threading_enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCommentsFeedResponse]
  }
  
  @scala.inline
  implicit class MediaCommentsFeedResponseOps[Self <: MediaCommentsFeedResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCan_view_more_preview_comments(value: Boolean): Self = this.set("can_view_more_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: MediaCommentsFeedResponseCaption): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption_is_edited(value: Boolean): Self = this.set("caption_is_edited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_count(value: Double): Self = this.set("comment_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_likes_enabled(value: Boolean): Self = this.set("comment_likes_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsVarargs(value: MediaCommentsFeedResponseCommentsItem*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[MediaCommentsFeedResponseCommentsItem]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_more_comments(value: Boolean): Self = this.set("has_more_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_more_headload_comments(value: Boolean): Self = this.set("has_more_headload_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiate_at_top(value: Boolean): Self = this.set("initiate_at_top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsert_new_comment_to_top(value: Boolean): Self = this.set("insert_new_comment_to_top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_header_display(value: String): Self = this.set("media_header_display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_max_id(value: String): Self = this.set("next_max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_min_id(value: String): Self = this.set("next_min_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview_commentsVarargs(value: MediaCommentsFeedResponsePreviewCommentsItem*): Self = this.set("preview_comments", js.Array(value :_*))
    
    @scala.inline
    def setPreview_comments(value: js.Array[MediaCommentsFeedResponsePreviewCommentsItem]): Self = this.set("preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuick_response_emojisVarargs(value: MediaCommentsFeedResponseQuickResponseEmojisItem*): Self = this.set("quick_response_emojis", js.Array(value :_*))
    
    @scala.inline
    def setQuick_response_emojis(value: js.Array[MediaCommentsFeedResponseQuickResponseEmojisItem]): Self = this.set("quick_response_emojis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreading_enabled(value: Boolean): Self = this.set("threading_enabled", value.asInstanceOf[js.Any])
  }
}
