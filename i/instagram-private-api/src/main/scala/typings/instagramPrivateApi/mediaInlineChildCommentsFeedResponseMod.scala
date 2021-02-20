package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaInlineChildCommentsFeedResponseMod {
  
  @js.native
  trait MediaInlineChildCommentsFeedResponseChildCommentsItem extends StObject {
    
    var bit_flags: Double = js.native
    
    var comment_like_count: Double = js.native
    
    var content_type: String = js.native
    
    var created_at: Double = js.native
    
    var created_at_utc: Double = js.native
    
    var did_report_as_spam: Boolean = js.native
    
    var has_liked_comment: Boolean = js.native
    
    var parent_comment_id: String = js.native
    
    var pk: String = js.native
    
    var share_enabled: Boolean = js.native
    
    var status: String = js.native
    
    var text: String = js.native
    
    var `type`: Double = js.native
    
    var user: MediaInlineChildCommentsFeedResponseUser = js.native
    
    var user_id: Double = js.native
  }
  object MediaInlineChildCommentsFeedResponseChildCommentsItem {
    
    @scala.inline
    def apply(
      bit_flags: Double,
      comment_like_count: Double,
      content_type: String,
      created_at: Double,
      created_at_utc: Double,
      did_report_as_spam: Boolean,
      has_liked_comment: Boolean,
      parent_comment_id: String,
      pk: String,
      share_enabled: Boolean,
      status: String,
      text: String,
      `type`: Double,
      user: MediaInlineChildCommentsFeedResponseUser,
      user_id: Double
    ): MediaInlineChildCommentsFeedResponseChildCommentsItem = {
      val __obj = js.Dynamic.literal(bit_flags = bit_flags.asInstanceOf[js.Any], comment_like_count = comment_like_count.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], did_report_as_spam = did_report_as_spam.asInstanceOf[js.Any], has_liked_comment = has_liked_comment.asInstanceOf[js.Any], parent_comment_id = parent_comment_id.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaInlineChildCommentsFeedResponseChildCommentsItem]
    }
    
    @scala.inline
    implicit class MediaInlineChildCommentsFeedResponseChildCommentsItemMutableBuilder[Self <: MediaInlineChildCommentsFeedResponseChildCommentsItem] (val x: Self) extends AnyVal {
      
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
      def setUser(value: MediaInlineChildCommentsFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaInlineChildCommentsFeedResponseParentComment extends StObject {
    
    var bit_flags: Double = js.native
    
    var comment_like_count: Double = js.native
    
    var content_type: String = js.native
    
    var created_at: Double = js.native
    
    var created_at_utc: Double = js.native
    
    var did_report_as_spam: Boolean = js.native
    
    var has_liked_comment: Boolean = js.native
    
    var pk: String = js.native
    
    var share_enabled: Boolean = js.native
    
    var status: String = js.native
    
    var text: String = js.native
    
    var `type`: Double = js.native
    
    var user: MediaInlineChildCommentsFeedResponseUser = js.native
    
    var user_id: Double = js.native
  }
  object MediaInlineChildCommentsFeedResponseParentComment {
    
    @scala.inline
    def apply(
      bit_flags: Double,
      comment_like_count: Double,
      content_type: String,
      created_at: Double,
      created_at_utc: Double,
      did_report_as_spam: Boolean,
      has_liked_comment: Boolean,
      pk: String,
      share_enabled: Boolean,
      status: String,
      text: String,
      `type`: Double,
      user: MediaInlineChildCommentsFeedResponseUser,
      user_id: Double
    ): MediaInlineChildCommentsFeedResponseParentComment = {
      val __obj = js.Dynamic.literal(bit_flags = bit_flags.asInstanceOf[js.Any], comment_like_count = comment_like_count.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], did_report_as_spam = did_report_as_spam.asInstanceOf[js.Any], has_liked_comment = has_liked_comment.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaInlineChildCommentsFeedResponseParentComment]
    }
    
    @scala.inline
    implicit class MediaInlineChildCommentsFeedResponseParentCommentMutableBuilder[Self <: MediaInlineChildCommentsFeedResponseParentComment] (val x: Self) extends AnyVal {
      
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
      def setUser(value: MediaInlineChildCommentsFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaInlineChildCommentsFeedResponseRootObject extends StObject {
    
    var child_comment_count: Double = js.native
    
    var child_comments: js.Array[MediaInlineChildCommentsFeedResponseChildCommentsItem] = js.native
    
    var has_more_head_child_comments: Boolean = js.native
    
    var has_more_tail_child_comments: Boolean = js.native
    
    var next_max_child_cursor: String = js.native
    
    var num_tail_child_comments: Double = js.native
    
    var parent_comment: MediaInlineChildCommentsFeedResponseParentComment = js.native
    
    var status: String = js.native
  }
  object MediaInlineChildCommentsFeedResponseRootObject {
    
    @scala.inline
    def apply(
      child_comment_count: Double,
      child_comments: js.Array[MediaInlineChildCommentsFeedResponseChildCommentsItem],
      has_more_head_child_comments: Boolean,
      has_more_tail_child_comments: Boolean,
      next_max_child_cursor: String,
      num_tail_child_comments: Double,
      parent_comment: MediaInlineChildCommentsFeedResponseParentComment,
      status: String
    ): MediaInlineChildCommentsFeedResponseRootObject = {
      val __obj = js.Dynamic.literal(child_comment_count = child_comment_count.asInstanceOf[js.Any], child_comments = child_comments.asInstanceOf[js.Any], has_more_head_child_comments = has_more_head_child_comments.asInstanceOf[js.Any], has_more_tail_child_comments = has_more_tail_child_comments.asInstanceOf[js.Any], next_max_child_cursor = next_max_child_cursor.asInstanceOf[js.Any], num_tail_child_comments = num_tail_child_comments.asInstanceOf[js.Any], parent_comment = parent_comment.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaInlineChildCommentsFeedResponseRootObject]
    }
    
    @scala.inline
    implicit class MediaInlineChildCommentsFeedResponseRootObjectMutableBuilder[Self <: MediaInlineChildCommentsFeedResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChild_comment_count(value: Double): Self = StObject.set(x, "child_comment_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChild_comments(value: js.Array[MediaInlineChildCommentsFeedResponseChildCommentsItem]): Self = StObject.set(x, "child_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChild_commentsVarargs(value: MediaInlineChildCommentsFeedResponseChildCommentsItem*): Self = StObject.set(x, "child_comments", js.Array(value :_*))
      
      @scala.inline
      def setHas_more_head_child_comments(value: Boolean): Self = StObject.set(x, "has_more_head_child_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_more_tail_child_comments(value: Boolean): Self = StObject.set(x, "has_more_tail_child_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_max_child_cursor(value: String): Self = StObject.set(x, "next_max_child_cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_tail_child_comments(value: Double): Self = StObject.set(x, "num_tail_child_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent_comment(value: MediaInlineChildCommentsFeedResponseParentComment): Self = StObject.set(x, "parent_comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaInlineChildCommentsFeedResponseUser extends StObject {
    
    var full_name: String = js.native
    
    var is_private: Boolean = js.native
    
    var is_verified: Boolean = js.native
    
    var pk: Double = js.native
    
    var profile_pic_id: js.UndefOr[String] = js.native
    
    var profile_pic_url: String = js.native
    
    var username: String = js.native
  }
  object MediaInlineChildCommentsFeedResponseUser {
    
    @scala.inline
    def apply(
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_url: String,
      username: String
    ): MediaInlineChildCommentsFeedResponseUser = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaInlineChildCommentsFeedResponseUser]
    }
    
    @scala.inline
    implicit class MediaInlineChildCommentsFeedResponseUserMutableBuilder[Self <: MediaInlineChildCommentsFeedResponseUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
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
