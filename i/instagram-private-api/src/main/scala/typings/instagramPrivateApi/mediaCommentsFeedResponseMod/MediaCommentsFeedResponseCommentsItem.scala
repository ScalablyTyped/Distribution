package typings.instagramPrivateApi.mediaCommentsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaCommentsFeedResponseCommentsItem extends js.Object {
  
  var bit_flags: Double = js.native
  
  var child_comment_count: Double = js.native
  
  var comment_index: Double = js.native
  
  var comment_like_count: Double = js.native
  
  var content_type: String = js.native
  
  var created_at: Double = js.native
  
  var created_at_utc: Double = js.native
  
  var did_report_as_spam: Boolean = js.native
  
  var has_liked_comment: Boolean = js.native
  
  var has_more_head_child_comments: js.UndefOr[Boolean] = js.native
  
  var has_more_tail_child_comments: js.UndefOr[Boolean] = js.native
  
  var has_translation: js.UndefOr[Boolean] = js.native
  
  var inline_composer_display_condition: String = js.native
  
  var next_min_child_cursor: js.UndefOr[String] = js.native
  
  var num_head_child_comments: js.UndefOr[Double] = js.native
  
  var num_tail_child_comments: js.UndefOr[Double] = js.native
  
  var other_preview_users: js.Array[MediaCommentsFeedResponseOtherPreviewUsersItem] = js.native
  
  var pk: String = js.native
  
  var preview_child_comments: js.Array[MediaCommentsFeedResponsePreviewChildCommentsItem] = js.native
  
  var share_enabled: Boolean = js.native
  
  var status: String = js.native
  
  var text: String = js.native
  
  var `type`: Double = js.native
  
  var user: MediaCommentsFeedResponseUser = js.native
  
  var user_id: Double = js.native
}
object MediaCommentsFeedResponseCommentsItem {
  
  @scala.inline
  def apply(
    bit_flags: Double,
    child_comment_count: Double,
    comment_index: Double,
    comment_like_count: Double,
    content_type: String,
    created_at: Double,
    created_at_utc: Double,
    did_report_as_spam: Boolean,
    has_liked_comment: Boolean,
    inline_composer_display_condition: String,
    other_preview_users: js.Array[MediaCommentsFeedResponseOtherPreviewUsersItem],
    pk: String,
    preview_child_comments: js.Array[MediaCommentsFeedResponsePreviewChildCommentsItem],
    share_enabled: Boolean,
    status: String,
    text: String,
    `type`: Double,
    user: MediaCommentsFeedResponseUser,
    user_id: Double
  ): MediaCommentsFeedResponseCommentsItem = {
    val __obj = js.Dynamic.literal(bit_flags = bit_flags.asInstanceOf[js.Any], child_comment_count = child_comment_count.asInstanceOf[js.Any], comment_index = comment_index.asInstanceOf[js.Any], comment_like_count = comment_like_count.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], did_report_as_spam = did_report_as_spam.asInstanceOf[js.Any], has_liked_comment = has_liked_comment.asInstanceOf[js.Any], inline_composer_display_condition = inline_composer_display_condition.asInstanceOf[js.Any], other_preview_users = other_preview_users.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_child_comments = preview_child_comments.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCommentsFeedResponseCommentsItem]
  }
  
  @scala.inline
  implicit class MediaCommentsFeedResponseCommentsItemOps[Self <: MediaCommentsFeedResponseCommentsItem] (val x: Self) extends AnyVal {
    
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
    def setBit_flags(value: Double): Self = this.set("bit_flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChild_comment_count(value: Double): Self = this.set("child_comment_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_index(value: Double): Self = this.set("comment_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_like_count(value: Double): Self = this.set("comment_like_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_type(value: String): Self = this.set("content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: Double): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at_utc(value: Double): Self = this.set("created_at_utc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDid_report_as_spam(value: Boolean): Self = this.set("did_report_as_spam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_liked_comment(value: Boolean): Self = this.set("has_liked_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline_composer_display_condition(value: String): Self = this.set("inline_composer_display_condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOther_preview_usersVarargs(value: MediaCommentsFeedResponseOtherPreviewUsersItem*): Self = this.set("other_preview_users", js.Array(value :_*))
    
    @scala.inline
    def setOther_preview_users(value: js.Array[MediaCommentsFeedResponseOtherPreviewUsersItem]): Self = this.set("other_preview_users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: String): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview_child_commentsVarargs(value: MediaCommentsFeedResponsePreviewChildCommentsItem*): Self = this.set("preview_child_comments", js.Array(value :_*))
    
    @scala.inline
    def setPreview_child_comments(value: js.Array[MediaCommentsFeedResponsePreviewChildCommentsItem]): Self = this.set("preview_child_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShare_enabled(value: Boolean): Self = this.set("share_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: MediaCommentsFeedResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_id(value: Double): Self = this.set("user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_more_head_child_comments(value: Boolean): Self = this.set("has_more_head_child_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_more_head_child_comments: Self = this.set("has_more_head_child_comments", js.undefined)
    
    @scala.inline
    def setHas_more_tail_child_comments(value: Boolean): Self = this.set("has_more_tail_child_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_more_tail_child_comments: Self = this.set("has_more_tail_child_comments", js.undefined)
    
    @scala.inline
    def setHas_translation(value: Boolean): Self = this.set("has_translation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_translation: Self = this.set("has_translation", js.undefined)
    
    @scala.inline
    def setNext_min_child_cursor(value: String): Self = this.set("next_min_child_cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext_min_child_cursor: Self = this.set("next_min_child_cursor", js.undefined)
    
    @scala.inline
    def setNum_head_child_comments(value: Double): Self = this.set("num_head_child_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNum_head_child_comments: Self = this.set("num_head_child_comments", js.undefined)
    
    @scala.inline
    def setNum_tail_child_comments(value: Double): Self = this.set("num_tail_child_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNum_tail_child_comments: Self = this.set("num_tail_child_comments", js.undefined)
  }
}
