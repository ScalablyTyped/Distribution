package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaCommentsFeedResponseMod {
  
  @js.native
  trait MediaCommentsFeedResponse extends StObject {
    
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
    implicit class MediaCommentsFeedResponseMutableBuilder[Self <: MediaCommentsFeedResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCan_view_more_preview_comments(value: Boolean): Self = StObject.set(x, "can_view_more_preview_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption(value: MediaCommentsFeedResponseCaption): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption_is_edited(value: Boolean): Self = StObject.set(x, "caption_is_edited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment_likes_enabled(value: Boolean): Self = StObject.set(x, "comment_likes_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComments(value: js.Array[MediaCommentsFeedResponseCommentsItem]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsVarargs(value: MediaCommentsFeedResponseCommentsItem*): Self = StObject.set(x, "comments", js.Array(value :_*))
      
      @scala.inline
      def setHas_more_comments(value: Boolean): Self = StObject.set(x, "has_more_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_more_headload_comments(value: Boolean): Self = StObject.set(x, "has_more_headload_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitiate_at_top(value: Boolean): Self = StObject.set(x, "initiate_at_top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsert_new_comment_to_top(value: Boolean): Self = StObject.set(x, "insert_new_comment_to_top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_header_display(value: String): Self = StObject.set(x, "media_header_display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_min_id(value: String): Self = StObject.set(x, "next_min_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreview_comments(value: js.Array[MediaCommentsFeedResponsePreviewCommentsItem]): Self = StObject.set(x, "preview_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreview_commentsVarargs(value: MediaCommentsFeedResponsePreviewCommentsItem*): Self = StObject.set(x, "preview_comments", js.Array(value :_*))
      
      @scala.inline
      def setQuick_response_emojis(value: js.Array[MediaCommentsFeedResponseQuickResponseEmojisItem]): Self = StObject.set(x, "quick_response_emojis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuick_response_emojisVarargs(value: MediaCommentsFeedResponseQuickResponseEmojisItem*): Self = StObject.set(x, "quick_response_emojis", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreading_enabled(value: Boolean): Self = StObject.set(x, "threading_enabled", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaCommentsFeedResponseCaption extends StObject {
    
    var bit_flags: Double = js.native
    
    var content_type: String = js.native
    
    var created_at: Double = js.native
    
    var created_at_utc: Double = js.native
    
    var did_report_as_spam: Boolean = js.native
    
    var has_translation: Boolean = js.native
    
    var pk: String = js.native
    
    var share_enabled: Boolean = js.native
    
    var status: String = js.native
    
    var text: String = js.native
    
    var `type`: Double = js.native
    
    var user: MediaCommentsFeedResponseUser = js.native
    
    var user_id: Double = js.native
  }
  object MediaCommentsFeedResponseCaption {
    
    @scala.inline
    def apply(
      bit_flags: Double,
      content_type: String,
      created_at: Double,
      created_at_utc: Double,
      did_report_as_spam: Boolean,
      has_translation: Boolean,
      pk: String,
      share_enabled: Boolean,
      status: String,
      text: String,
      `type`: Double,
      user: MediaCommentsFeedResponseUser,
      user_id: Double
    ): MediaCommentsFeedResponseCaption = {
      val __obj = js.Dynamic.literal(bit_flags = bit_flags.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], did_report_as_spam = did_report_as_spam.asInstanceOf[js.Any], has_translation = has_translation.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaCommentsFeedResponseCaption]
    }
    
    @scala.inline
    implicit class MediaCommentsFeedResponseCaptionMutableBuilder[Self <: MediaCommentsFeedResponseCaption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBit_flags(value: Double): Self = StObject.set(x, "bit_flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at_utc(value: Double): Self = StObject.set(x, "created_at_utc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDid_report_as_spam(value: Boolean): Self = StObject.set(x, "did_report_as_spam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_translation(value: Boolean): Self = StObject.set(x, "has_translation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShare_enabled(value: Boolean): Self = StObject.set(x, "share_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: MediaCommentsFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaCommentsFeedResponseCommentsItem extends StObject {
    
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
    implicit class MediaCommentsFeedResponseCommentsItemMutableBuilder[Self <: MediaCommentsFeedResponseCommentsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBit_flags(value: Double): Self = StObject.set(x, "bit_flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChild_comment_count(value: Double): Self = StObject.set(x, "child_comment_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment_index(value: Double): Self = StObject.set(x, "comment_index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment_like_count(value: Double): Self = StObject.set(x, "comment_like_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at_utc(value: Double): Self = StObject.set(x, "created_at_utc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDid_report_as_spam(value: Boolean): Self = StObject.set(x, "did_report_as_spam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_liked_comment(value: Boolean): Self = StObject.set(x, "has_liked_comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_more_head_child_comments(value: Boolean): Self = StObject.set(x, "has_more_head_child_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_more_head_child_commentsUndefined: Self = StObject.set(x, "has_more_head_child_comments", js.undefined)
      
      @scala.inline
      def setHas_more_tail_child_comments(value: Boolean): Self = StObject.set(x, "has_more_tail_child_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_more_tail_child_commentsUndefined: Self = StObject.set(x, "has_more_tail_child_comments", js.undefined)
      
      @scala.inline
      def setHas_translation(value: Boolean): Self = StObject.set(x, "has_translation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_translationUndefined: Self = StObject.set(x, "has_translation", js.undefined)
      
      @scala.inline
      def setInline_composer_display_condition(value: String): Self = StObject.set(x, "inline_composer_display_condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_min_child_cursor(value: String): Self = StObject.set(x, "next_min_child_cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_min_child_cursorUndefined: Self = StObject.set(x, "next_min_child_cursor", js.undefined)
      
      @scala.inline
      def setNum_head_child_comments(value: Double): Self = StObject.set(x, "num_head_child_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_head_child_commentsUndefined: Self = StObject.set(x, "num_head_child_comments", js.undefined)
      
      @scala.inline
      def setNum_tail_child_comments(value: Double): Self = StObject.set(x, "num_tail_child_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_tail_child_commentsUndefined: Self = StObject.set(x, "num_tail_child_comments", js.undefined)
      
      @scala.inline
      def setOther_preview_users(value: js.Array[MediaCommentsFeedResponseOtherPreviewUsersItem]): Self = StObject.set(x, "other_preview_users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOther_preview_usersVarargs(value: MediaCommentsFeedResponseOtherPreviewUsersItem*): Self = StObject.set(x, "other_preview_users", js.Array(value :_*))
      
      @scala.inline
      def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreview_child_comments(value: js.Array[MediaCommentsFeedResponsePreviewChildCommentsItem]): Self = StObject.set(x, "preview_child_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreview_child_commentsVarargs(value: MediaCommentsFeedResponsePreviewChildCommentsItem*): Self = StObject.set(x, "preview_child_comments", js.Array(value :_*))
      
      @scala.inline
      def setShare_enabled(value: Boolean): Self = StObject.set(x, "share_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: MediaCommentsFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaCommentsFeedResponseOtherPreviewUsersItem extends StObject {
    
    var id: Double = js.native
    
    var profile_pic_url: String = js.native
  }
  object MediaCommentsFeedResponseOtherPreviewUsersItem {
    
    @scala.inline
    def apply(id: Double, profile_pic_url: String): MediaCommentsFeedResponseOtherPreviewUsersItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaCommentsFeedResponseOtherPreviewUsersItem]
    }
    
    @scala.inline
    implicit class MediaCommentsFeedResponseOtherPreviewUsersItemMutableBuilder[Self <: MediaCommentsFeedResponseOtherPreviewUsersItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaCommentsFeedResponsePreviewChildCommentsItem extends StObject {
    
    var comment_like_count: Double = js.native
    
    var content_type: String = js.native
    
    var created_at: Double = js.native
    
    var created_at_utc: Double = js.native
    
    var has_liked_comment: Boolean = js.native
    
    var media_id: String = js.native
    
    var parent_comment_id: String = js.native
    
    var pk: String = js.native
    
    var share_enabled: Boolean = js.native
    
    var status: String = js.native
    
    var text: String = js.native
    
    var `type`: Double = js.native
    
    var user: MediaCommentsFeedResponseUser = js.native
  }
  object MediaCommentsFeedResponsePreviewChildCommentsItem {
    
    @scala.inline
    def apply(
      comment_like_count: Double,
      content_type: String,
      created_at: Double,
      created_at_utc: Double,
      has_liked_comment: Boolean,
      media_id: String,
      parent_comment_id: String,
      pk: String,
      share_enabled: Boolean,
      status: String,
      text: String,
      `type`: Double,
      user: MediaCommentsFeedResponseUser
    ): MediaCommentsFeedResponsePreviewChildCommentsItem = {
      val __obj = js.Dynamic.literal(comment_like_count = comment_like_count.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], has_liked_comment = has_liked_comment.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], parent_comment_id = parent_comment_id.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaCommentsFeedResponsePreviewChildCommentsItem]
    }
    
    @scala.inline
    implicit class MediaCommentsFeedResponsePreviewChildCommentsItemMutableBuilder[Self <: MediaCommentsFeedResponsePreviewChildCommentsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment_like_count(value: Double): Self = StObject.set(x, "comment_like_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at_utc(value: Double): Self = StObject.set(x, "created_at_utc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_liked_comment(value: Boolean): Self = StObject.set(x, "has_liked_comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent_comment_id(value: String): Self = StObject.set(x, "parent_comment_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShare_enabled(value: Boolean): Self = StObject.set(x, "share_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: MediaCommentsFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaCommentsFeedResponsePreviewCommentsItem extends StObject {
    
    var bit_flags: Double = js.native
    
    var comment_like_count: Double = js.native
    
    var content_type: String = js.native
    
    var created_at: Double = js.native
    
    var created_at_utc: Double = js.native
    
    var did_report_as_spam: Boolean = js.native
    
    var has_liked_comment: Boolean = js.native
    
    var has_translation: Boolean = js.native
    
    var parent_comment_id: js.UndefOr[String] = js.native
    
    var pk: String = js.native
    
    var share_enabled: Boolean = js.native
    
    var status: String = js.native
    
    var text: String = js.native
    
    var `type`: Double = js.native
    
    var user: MediaCommentsFeedResponseUser = js.native
    
    var user_id: Double = js.native
  }
  object MediaCommentsFeedResponsePreviewCommentsItem {
    
    @scala.inline
    def apply(
      bit_flags: Double,
      comment_like_count: Double,
      content_type: String,
      created_at: Double,
      created_at_utc: Double,
      did_report_as_spam: Boolean,
      has_liked_comment: Boolean,
      has_translation: Boolean,
      pk: String,
      share_enabled: Boolean,
      status: String,
      text: String,
      `type`: Double,
      user: MediaCommentsFeedResponseUser,
      user_id: Double
    ): MediaCommentsFeedResponsePreviewCommentsItem = {
      val __obj = js.Dynamic.literal(bit_flags = bit_flags.asInstanceOf[js.Any], comment_like_count = comment_like_count.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], did_report_as_spam = did_report_as_spam.asInstanceOf[js.Any], has_liked_comment = has_liked_comment.asInstanceOf[js.Any], has_translation = has_translation.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaCommentsFeedResponsePreviewCommentsItem]
    }
    
    @scala.inline
    implicit class MediaCommentsFeedResponsePreviewCommentsItemMutableBuilder[Self <: MediaCommentsFeedResponsePreviewCommentsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBit_flags(value: Double): Self = StObject.set(x, "bit_flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment_like_count(value: Double): Self = StObject.set(x, "comment_like_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at_utc(value: Double): Self = StObject.set(x, "created_at_utc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDid_report_as_spam(value: Boolean): Self = StObject.set(x, "did_report_as_spam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_liked_comment(value: Boolean): Self = StObject.set(x, "has_liked_comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_translation(value: Boolean): Self = StObject.set(x, "has_translation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent_comment_id(value: String): Self = StObject.set(x, "parent_comment_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent_comment_idUndefined: Self = StObject.set(x, "parent_comment_id", js.undefined)
      
      @scala.inline
      def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShare_enabled(value: Boolean): Self = StObject.set(x, "share_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: MediaCommentsFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaCommentsFeedResponseQuickResponseEmojisItem extends StObject {
    
    var unicode: String = js.native
  }
  object MediaCommentsFeedResponseQuickResponseEmojisItem {
    
    @scala.inline
    def apply(unicode: String): MediaCommentsFeedResponseQuickResponseEmojisItem = {
      val __obj = js.Dynamic.literal(unicode = unicode.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaCommentsFeedResponseQuickResponseEmojisItem]
    }
    
    @scala.inline
    implicit class MediaCommentsFeedResponseQuickResponseEmojisItemMutableBuilder[Self <: MediaCommentsFeedResponseQuickResponseEmojisItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnicode(value: String): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaCommentsFeedResponseUser extends StObject {
    
    var full_name: String = js.native
    
    var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.native
    
    var is_private: Boolean = js.native
    
    var is_verified: Boolean = js.native
    
    var latest_reel_media: js.UndefOr[Double] = js.native
    
    var pk: Double = js.native
    
    var profile_pic_id: js.UndefOr[String] = js.native
    
    var profile_pic_url: String = js.native
    
    var username: String = js.native
  }
  object MediaCommentsFeedResponseUser {
    
    @scala.inline
    def apply(
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_url: String,
      username: String
    ): MediaCommentsFeedResponseUser = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaCommentsFeedResponseUser]
    }
    
    @scala.inline
    implicit class MediaCommentsFeedResponseUserMutableBuilder[Self <: MediaCommentsFeedResponseUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_pictureUndefined: Self = StObject.set(x, "has_anonymous_profile_picture", js.undefined)
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatest_reel_media(value: Double): Self = StObject.set(x, "latest_reel_media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatest_reel_mediaUndefined: Self = StObject.set(x, "latest_reel_media", js.undefined)
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_idUndefined: Self = StObject.set(x, "profile_pic_id", js.undefined)
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
