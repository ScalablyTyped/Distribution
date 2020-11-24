package typings.instagramPrivateApi.liveCommentsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveCommentsResponseRootObject extends js.Object {
  
  var can_view_more_preview_comments: Boolean = js.native
  
  var caption: Null = js.native
  
  var caption_is_edited: Boolean = js.native
  
  var comment_count: Double = js.native
  
  var comment_likes_enabled: Boolean = js.native
  
  var comment_muted: Double = js.native
  
  var comments: js.Array[LiveCommentsResponseCommentsItem] = js.native
  
  var has_more_comments: Boolean = js.native
  
  var has_more_headload_comments: Boolean = js.native
  
  var is_first_fetch: String = js.native
  
  var live_seconds_per_comment: Double = js.native
  
  var media_header_display: String = js.native
  
  var status: String = js.native
  
  var system_comments: js.Array[LiveCommentsResponseSystemCommentsItem] = js.native
}
object LiveCommentsResponseRootObject {
  
  @scala.inline
  def apply(
    can_view_more_preview_comments: Boolean,
    caption: Null,
    caption_is_edited: Boolean,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comment_muted: Double,
    comments: js.Array[LiveCommentsResponseCommentsItem],
    has_more_comments: Boolean,
    has_more_headload_comments: Boolean,
    is_first_fetch: String,
    live_seconds_per_comment: Double,
    media_header_display: String,
    status: String,
    system_comments: js.Array[LiveCommentsResponseSystemCommentsItem]
  ): LiveCommentsResponseRootObject = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_muted = comment_muted.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], has_more_headload_comments = has_more_headload_comments.asInstanceOf[js.Any], is_first_fetch = is_first_fetch.asInstanceOf[js.Any], live_seconds_per_comment = live_seconds_per_comment.asInstanceOf[js.Any], media_header_display = media_header_display.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], system_comments = system_comments.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveCommentsResponseRootObject]
  }
  
  @scala.inline
  implicit class LiveCommentsResponseRootObjectOps[Self <: LiveCommentsResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setCaption(value: Null): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption_is_edited(value: Boolean): Self = this.set("caption_is_edited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_count(value: Double): Self = this.set("comment_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_likes_enabled(value: Boolean): Self = this.set("comment_likes_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_muted(value: Double): Self = this.set("comment_muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsVarargs(value: LiveCommentsResponseCommentsItem*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[LiveCommentsResponseCommentsItem]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_more_comments(value: Boolean): Self = this.set("has_more_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_more_headload_comments(value: Boolean): Self = this.set("has_more_headload_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_first_fetch(value: String): Self = this.set("is_first_fetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLive_seconds_per_comment(value: Double): Self = this.set("live_seconds_per_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_header_display(value: String): Self = this.set("media_header_display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem_commentsVarargs(value: LiveCommentsResponseSystemCommentsItem*): Self = this.set("system_comments", js.Array(value :_*))
    
    @scala.inline
    def setSystem_comments(value: js.Array[LiveCommentsResponseSystemCommentsItem]): Self = this.set("system_comments", value.asInstanceOf[js.Any])
  }
}
