package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaRepositoryCommentResponseMod {
  
  trait MediaRepositoryCommentResponse extends StObject {
    
    var comment: MediaRepositoryCommentResponseComment
    
    var status: String
  }
  object MediaRepositoryCommentResponse {
    
    @scala.inline
    def apply(comment: MediaRepositoryCommentResponseComment, status: String): MediaRepositoryCommentResponse = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryCommentResponse]
    }
    
    @scala.inline
    implicit class MediaRepositoryCommentResponseMutableBuilder[Self <: MediaRepositoryCommentResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: MediaRepositoryCommentResponseComment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaRepositoryCommentResponseComment extends StObject {
    
    var content_type: String
    
    var created_at: Double
    
    var created_at_utc: Double
    
    var media_id: String
    
    var pk: String
    
    var share_enabled: Boolean
    
    var status: String
    
    var text: String
    
    var `type`: Double
    
    var user: MediaRepositoryCommentResponseUser
  }
  object MediaRepositoryCommentResponseComment {
    
    @scala.inline
    def apply(
      content_type: String,
      created_at: Double,
      created_at_utc: Double,
      media_id: String,
      pk: String,
      share_enabled: Boolean,
      status: String,
      text: String,
      `type`: Double,
      user: MediaRepositoryCommentResponseUser
    ): MediaRepositoryCommentResponseComment = {
      val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryCommentResponseComment]
    }
    
    @scala.inline
    implicit class MediaRepositoryCommentResponseCommentMutableBuilder[Self <: MediaRepositoryCommentResponseComment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at_utc(value: Double): Self = StObject.set(x, "created_at_utc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
      
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
      def setUser(value: MediaRepositoryCommentResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaRepositoryCommentResponseUser extends StObject {
    
    var allowed_commenter_type: String
    
    var full_name: String
    
    var has_anonymous_profile_picture: Boolean
    
    var is_private: Boolean
    
    var is_verified: Boolean
    
    var pk: Double
    
    var profile_pic_id: String
    
    var profile_pic_url: String
    
    var reel_auto_archive: String
    
    var username: String
  }
  object MediaRepositoryCommentResponseUser {
    
    @scala.inline
    def apply(
      allowed_commenter_type: String,
      full_name: String,
      has_anonymous_profile_picture: Boolean,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      reel_auto_archive: String,
      username: String
    ): MediaRepositoryCommentResponseUser = {
      val __obj = js.Dynamic.literal(allowed_commenter_type = allowed_commenter_type.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], reel_auto_archive = reel_auto_archive.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryCommentResponseUser]
    }
    
    @scala.inline
    implicit class MediaRepositoryCommentResponseUserMutableBuilder[Self <: MediaRepositoryCommentResponseUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowed_commenter_type(value: String): Self = StObject.set(x, "allowed_commenter_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReel_auto_archive(value: String): Self = StObject.set(x, "reel_auto_archive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
