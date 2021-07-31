package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveCommentsResponseMod {
  
  trait LiveCommentsResponseCommentsItem extends StObject {
    
    var bit_flags: Double
    
    var content_type: String
    
    var created_at: Double
    
    var created_at_utc: Double
    
    var did_report_as_spam: Boolean
    
    var inline_composer_display_condition: String
    
    var pk: String
    
    var share_enabled: Boolean
    
    var status: String
    
    var text: String
    
    var `type`: Double
    
    var user: LiveCommentsResponseUser
    
    var user_id: Double
  }
  object LiveCommentsResponseCommentsItem {
    
    @scala.inline
    def apply(
      bit_flags: Double,
      content_type: String,
      created_at: Double,
      created_at_utc: Double,
      did_report_as_spam: Boolean,
      inline_composer_display_condition: String,
      pk: String,
      share_enabled: Boolean,
      status: String,
      text: String,
      `type`: Double,
      user: LiveCommentsResponseUser,
      user_id: Double
    ): LiveCommentsResponseCommentsItem = {
      val __obj = js.Dynamic.literal(bit_flags = bit_flags.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], did_report_as_spam = did_report_as_spam.asInstanceOf[js.Any], inline_composer_display_condition = inline_composer_display_condition.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveCommentsResponseCommentsItem]
    }
    
    @scala.inline
    implicit class LiveCommentsResponseCommentsItemMutableBuilder[Self <: LiveCommentsResponseCommentsItem] (val x: Self) extends AnyVal {
      
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
      def setInline_composer_display_condition(value: String): Self = StObject.set(x, "inline_composer_display_condition", value.asInstanceOf[js.Any])
      
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
      def setUser(value: LiveCommentsResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait LiveCommentsResponseRootObject extends StObject {
    
    var can_view_more_preview_comments: Boolean
    
    var caption: Null
    
    var caption_is_edited: Boolean
    
    var comment_count: Double
    
    var comment_likes_enabled: Boolean
    
    var comment_muted: Double
    
    var comments: js.Array[LiveCommentsResponseCommentsItem]
    
    var has_more_comments: Boolean
    
    var has_more_headload_comments: Boolean
    
    var is_first_fetch: String
    
    var live_seconds_per_comment: Double
    
    var media_header_display: String
    
    var status: String
    
    var system_comments: js.Array[LiveCommentsResponseSystemCommentsItem]
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
    implicit class LiveCommentsResponseRootObjectMutableBuilder[Self <: LiveCommentsResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCan_view_more_preview_comments(value: Boolean): Self = StObject.set(x, "can_view_more_preview_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption(value: Null): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption_is_edited(value: Boolean): Self = StObject.set(x, "caption_is_edited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment_likes_enabled(value: Boolean): Self = StObject.set(x, "comment_likes_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment_muted(value: Double): Self = StObject.set(x, "comment_muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComments(value: js.Array[LiveCommentsResponseCommentsItem]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsVarargs(value: LiveCommentsResponseCommentsItem*): Self = StObject.set(x, "comments", js.Array(value :_*))
      
      @scala.inline
      def setHas_more_comments(value: Boolean): Self = StObject.set(x, "has_more_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_more_headload_comments(value: Boolean): Self = StObject.set(x, "has_more_headload_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_first_fetch(value: String): Self = StObject.set(x, "is_first_fetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLive_seconds_per_comment(value: Double): Self = StObject.set(x, "live_seconds_per_comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_header_display(value: String): Self = StObject.set(x, "media_header_display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystem_comments(value: js.Array[LiveCommentsResponseSystemCommentsItem]): Self = StObject.set(x, "system_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystem_commentsVarargs(value: LiveCommentsResponseSystemCommentsItem*): Self = StObject.set(x, "system_comments", js.Array(value :_*))
    }
  }
  
  trait LiveCommentsResponseSystemCommentsItem extends StObject {
    
    var created_at: Double
    
    var pk: String
    
    var text: String
    
    var user: LiveCommentsResponseUser
    
    var user_count: Double
  }
  object LiveCommentsResponseSystemCommentsItem {
    
    @scala.inline
    def apply(created_at: Double, pk: String, text: String, user: LiveCommentsResponseUser, user_count: Double): LiveCommentsResponseSystemCommentsItem = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_count = user_count.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveCommentsResponseSystemCommentsItem]
    }
    
    @scala.inline
    implicit class LiveCommentsResponseSystemCommentsItemMutableBuilder[Self <: LiveCommentsResponseSystemCommentsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: LiveCommentsResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_count(value: Double): Self = StObject.set(x, "user_count", value.asInstanceOf[js.Any])
    }
  }
  
  trait LiveCommentsResponseUser extends StObject {
    
    var full_name: String
    
    var is_private: Boolean
    
    var is_verified: Boolean
    
    var live_with_eligibility: js.UndefOr[String] = js.undefined
    
    var pk: Double
    
    var profile_pic_id: String
    
    var profile_pic_url: String
    
    var username: String
  }
  object LiveCommentsResponseUser {
    
    @scala.inline
    def apply(
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      username: String
    ): LiveCommentsResponseUser = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveCommentsResponseUser]
    }
    
    @scala.inline
    implicit class LiveCommentsResponseUserMutableBuilder[Self <: LiveCommentsResponseUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLive_with_eligibility(value: String): Self = StObject.set(x, "live_with_eligibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLive_with_eligibilityUndefined: Self = StObject.set(x, "live_with_eligibility", js.undefined)
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
