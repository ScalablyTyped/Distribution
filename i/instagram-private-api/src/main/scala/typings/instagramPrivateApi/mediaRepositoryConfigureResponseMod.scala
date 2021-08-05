package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaRepositoryConfigureResponseMod {
  
  trait MediaRepositoryConfigureResponseCandidatesItem extends StObject {
    
    var height: Double
    
    var url: String
    
    var width: Double
  }
  object MediaRepositoryConfigureResponseCandidatesItem {
    
    inline def apply(height: Double, url: String, width: Double): MediaRepositoryConfigureResponseCandidatesItem = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryConfigureResponseCandidatesItem]
    }
    
    extension [Self <: MediaRepositoryConfigureResponseCandidatesItem](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaRepositoryConfigureResponseFbUserTags extends StObject {
    
    var in: js.Array[js.Any]
  }
  object MediaRepositoryConfigureResponseFbUserTags {
    
    inline def apply(in: js.Array[js.Any]): MediaRepositoryConfigureResponseFbUserTags = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryConfigureResponseFbUserTags]
    }
    
    extension [Self <: MediaRepositoryConfigureResponseFbUserTags](x: Self) {
      
      inline def setIn(value: js.Array[js.Any]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInVarargs(value: js.Any*): Self = StObject.set(x, "in", js.Array(value :_*))
    }
  }
  
  trait MediaRepositoryConfigureResponseImageVersions2 extends StObject {
    
    var candidates: js.Array[MediaRepositoryConfigureResponseCandidatesItem]
  }
  object MediaRepositoryConfigureResponseImageVersions2 {
    
    inline def apply(candidates: js.Array[MediaRepositoryConfigureResponseCandidatesItem]): MediaRepositoryConfigureResponseImageVersions2 = {
      val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryConfigureResponseImageVersions2]
    }
    
    extension [Self <: MediaRepositoryConfigureResponseImageVersions2](x: Self) {
      
      inline def setCandidates(value: js.Array[MediaRepositoryConfigureResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
      
      inline def setCandidatesVarargs(value: MediaRepositoryConfigureResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
    }
  }
  
  trait MediaRepositoryConfigureResponseMedia extends StObject {
    
    var can_view_more_preview_comments: Boolean
    
    var can_viewer_reshare: Boolean
    
    var can_viewer_save: Boolean
    
    var caption: Null
    
    var caption_is_edited: Boolean
    
    var client_cache_key: String
    
    var code: String
    
    var comment_count: Double
    
    var comment_likes_enabled: Boolean
    
    var comment_threading_enabled: Boolean
    
    var device_timestamp: Double
    
    var fb_user_tags: MediaRepositoryConfigureResponseFbUserTags
    
    var filter_type: Double
    
    var has_more_comments: Boolean
    
    var id: String
    
    var image_versions2: MediaRepositoryConfigureResponseImageVersions2
    
    var max_num_visible_preview_comments: Double
    
    var media_type: Double
    
    var organic_tracking_token: String
    
    var original_height: Double
    
    var original_width: Double
    
    var photo_of_you: Boolean
    
    var pk: String
    
    var preview_comments: js.Array[js.Any]
    
    var taken_at: Double
    
    var user: MediaRepositoryConfigureResponseUser
  }
  object MediaRepositoryConfigureResponseMedia {
    
    inline def apply(
      can_view_more_preview_comments: Boolean,
      can_viewer_reshare: Boolean,
      can_viewer_save: Boolean,
      caption: Null,
      caption_is_edited: Boolean,
      client_cache_key: String,
      code: String,
      comment_count: Double,
      comment_likes_enabled: Boolean,
      comment_threading_enabled: Boolean,
      device_timestamp: Double,
      fb_user_tags: MediaRepositoryConfigureResponseFbUserTags,
      filter_type: Double,
      has_more_comments: Boolean,
      id: String,
      image_versions2: MediaRepositoryConfigureResponseImageVersions2,
      max_num_visible_preview_comments: Double,
      media_type: Double,
      organic_tracking_token: String,
      original_height: Double,
      original_width: Double,
      photo_of_you: Boolean,
      pk: String,
      preview_comments: js.Array[js.Any],
      taken_at: Double,
      user: MediaRepositoryConfigureResponseUser
    ): MediaRepositoryConfigureResponseMedia = {
      val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_reshare = can_viewer_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], fb_user_tags = fb_user_tags.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryConfigureResponseMedia]
    }
    
    extension [Self <: MediaRepositoryConfigureResponseMedia](x: Self) {
      
      inline def setCan_view_more_preview_comments(value: Boolean): Self = StObject.set(x, "can_view_more_preview_comments", value.asInstanceOf[js.Any])
      
      inline def setCan_viewer_reshare(value: Boolean): Self = StObject.set(x, "can_viewer_reshare", value.asInstanceOf[js.Any])
      
      inline def setCan_viewer_save(value: Boolean): Self = StObject.set(x, "can_viewer_save", value.asInstanceOf[js.Any])
      
      inline def setCaption(value: Null): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaption_is_edited(value: Boolean): Self = StObject.set(x, "caption_is_edited", value.asInstanceOf[js.Any])
      
      inline def setClient_cache_key(value: String): Self = StObject.set(x, "client_cache_key", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
      
      inline def setComment_likes_enabled(value: Boolean): Self = StObject.set(x, "comment_likes_enabled", value.asInstanceOf[js.Any])
      
      inline def setComment_threading_enabled(value: Boolean): Self = StObject.set(x, "comment_threading_enabled", value.asInstanceOf[js.Any])
      
      inline def setDevice_timestamp(value: Double): Self = StObject.set(x, "device_timestamp", value.asInstanceOf[js.Any])
      
      inline def setFb_user_tags(value: MediaRepositoryConfigureResponseFbUserTags): Self = StObject.set(x, "fb_user_tags", value.asInstanceOf[js.Any])
      
      inline def setFilter_type(value: Double): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
      
      inline def setHas_more_comments(value: Boolean): Self = StObject.set(x, "has_more_comments", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImage_versions2(value: MediaRepositoryConfigureResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
      
      inline def setMax_num_visible_preview_comments(value: Double): Self = StObject.set(x, "max_num_visible_preview_comments", value.asInstanceOf[js.Any])
      
      inline def setMedia_type(value: Double): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
      
      inline def setOrganic_tracking_token(value: String): Self = StObject.set(x, "organic_tracking_token", value.asInstanceOf[js.Any])
      
      inline def setOriginal_height(value: Double): Self = StObject.set(x, "original_height", value.asInstanceOf[js.Any])
      
      inline def setOriginal_width(value: Double): Self = StObject.set(x, "original_width", value.asInstanceOf[js.Any])
      
      inline def setPhoto_of_you(value: Boolean): Self = StObject.set(x, "photo_of_you", value.asInstanceOf[js.Any])
      
      inline def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      inline def setPreview_comments(value: js.Array[js.Any]): Self = StObject.set(x, "preview_comments", value.asInstanceOf[js.Any])
      
      inline def setPreview_commentsVarargs(value: js.Any*): Self = StObject.set(x, "preview_comments", js.Array(value :_*))
      
      inline def setTaken_at(value: Double): Self = StObject.set(x, "taken_at", value.asInstanceOf[js.Any])
      
      inline def setUser(value: MediaRepositoryConfigureResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaRepositoryConfigureResponseRootObject extends StObject {
    
    var media: MediaRepositoryConfigureResponseMedia
    
    var status: String
    
    var upload_id: String
  }
  object MediaRepositoryConfigureResponseRootObject {
    
    inline def apply(media: MediaRepositoryConfigureResponseMedia, status: String, upload_id: String): MediaRepositoryConfigureResponseRootObject = {
      val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryConfigureResponseRootObject]
    }
    
    extension [Self <: MediaRepositoryConfigureResponseRootObject](x: Self) {
      
      inline def setMedia(value: MediaRepositoryConfigureResponseMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUpload_id(value: String): Self = StObject.set(x, "upload_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaRepositoryConfigureResponseUser extends StObject {
    
    var allowed_commenter_type: String
    
    var can_boost_post: Boolean
    
    var can_see_organic_insights: Boolean
    
    var full_name: String
    
    var has_anonymous_profile_picture: Boolean
    
    var is_private: Boolean
    
    var is_unpublished: Boolean
    
    var pk: Double
    
    var profile_pic_id: String
    
    var profile_pic_url: String
    
    var reel_auto_archive: String
    
    var show_insights_terms: Boolean
    
    var username: String
  }
  object MediaRepositoryConfigureResponseUser {
    
    inline def apply(
      allowed_commenter_type: String,
      can_boost_post: Boolean,
      can_see_organic_insights: Boolean,
      full_name: String,
      has_anonymous_profile_picture: Boolean,
      is_private: Boolean,
      is_unpublished: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      reel_auto_archive: String,
      show_insights_terms: Boolean,
      username: String
    ): MediaRepositoryConfigureResponseUser = {
      val __obj = js.Dynamic.literal(allowed_commenter_type = allowed_commenter_type.asInstanceOf[js.Any], can_boost_post = can_boost_post.asInstanceOf[js.Any], can_see_organic_insights = can_see_organic_insights.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_unpublished = is_unpublished.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], reel_auto_archive = reel_auto_archive.asInstanceOf[js.Any], show_insights_terms = show_insights_terms.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryConfigureResponseUser]
    }
    
    extension [Self <: MediaRepositoryConfigureResponseUser](x: Self) {
      
      inline def setAllowed_commenter_type(value: String): Self = StObject.set(x, "allowed_commenter_type", value.asInstanceOf[js.Any])
      
      inline def setCan_boost_post(value: Boolean): Self = StObject.set(x, "can_boost_post", value.asInstanceOf[js.Any])
      
      inline def setCan_see_organic_insights(value: Boolean): Self = StObject.set(x, "can_see_organic_insights", value.asInstanceOf[js.Any])
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      inline def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      inline def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      inline def setIs_unpublished(value: Boolean): Self = StObject.set(x, "is_unpublished", value.asInstanceOf[js.Any])
      
      inline def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      inline def setReel_auto_archive(value: String): Self = StObject.set(x, "reel_auto_archive", value.asInstanceOf[js.Any])
      
      inline def setShow_insights_terms(value: Boolean): Self = StObject.set(x, "show_insights_terms", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
