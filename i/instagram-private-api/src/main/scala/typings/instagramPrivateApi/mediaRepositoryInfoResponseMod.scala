package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaRepositoryInfoResponseMod {
  
  trait MediaEditResponseRootObject extends StObject {
    
    var media: MediaInfoResponseItemsItem
    
    var status: String
  }
  object MediaEditResponseRootObject {
    
    inline def apply(media: MediaInfoResponseItemsItem, status: String): MediaEditResponseRootObject = {
      val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaEditResponseRootObject]
    }
    
    extension [Self <: MediaEditResponseRootObject](x: Self) {
      
      inline def setMedia(value: MediaInfoResponseItemsItem): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaInfoResponseCandidatesItem extends StObject {
    
    var height: Double
    
    var url: String
    
    var width: Double
  }
  object MediaInfoResponseCandidatesItem {
    
    inline def apply(height: Double, url: String, width: Double): MediaInfoResponseCandidatesItem = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaInfoResponseCandidatesItem]
    }
    
    extension [Self <: MediaInfoResponseCandidatesItem](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaInfoResponseCaption extends StObject {
    
    var bit_flags: Double
    
    var content_type: String
    
    var created_at: Double
    
    var created_at_utc: Double
    
    var did_report_as_spam: Boolean
    
    var media_id: String
    
    var pk: String
    
    var share_enabled: Boolean
    
    var status: String
    
    var text: String
    
    var `type`: Double
    
    var user: MediaInfoResponseUser
    
    var user_id: Double
  }
  object MediaInfoResponseCaption {
    
    inline def apply(
      bit_flags: Double,
      content_type: String,
      created_at: Double,
      created_at_utc: Double,
      did_report_as_spam: Boolean,
      media_id: String,
      pk: String,
      share_enabled: Boolean,
      status: String,
      text: String,
      `type`: Double,
      user: MediaInfoResponseUser,
      user_id: Double
    ): MediaInfoResponseCaption = {
      val __obj = js.Dynamic.literal(bit_flags = bit_flags.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], did_report_as_spam = did_report_as_spam.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaInfoResponseCaption]
    }
    
    extension [Self <: MediaInfoResponseCaption](x: Self) {
      
      inline def setBit_flags(value: Double): Self = StObject.set(x, "bit_flags", value.asInstanceOf[js.Any])
      
      inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      inline def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setCreated_at_utc(value: Double): Self = StObject.set(x, "created_at_utc", value.asInstanceOf[js.Any])
      
      inline def setDid_report_as_spam(value: Boolean): Self = StObject.set(x, "did_report_as_spam", value.asInstanceOf[js.Any])
      
      inline def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
      
      inline def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      inline def setShare_enabled(value: Boolean): Self = StObject.set(x, "share_enabled", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUser(value: MediaInfoResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaInfoResponseFriendshipStatus extends StObject {
    
    var following: Boolean
    
    var is_bestie: Boolean
    
    var is_restricted: Boolean
    
    var outgoing_request: Boolean
  }
  object MediaInfoResponseFriendshipStatus {
    
    inline def apply(following: Boolean, is_bestie: Boolean, is_restricted: Boolean, outgoing_request: Boolean): MediaInfoResponseFriendshipStatus = {
      val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaInfoResponseFriendshipStatus]
    }
    
    extension [Self <: MediaInfoResponseFriendshipStatus](x: Self) {
      
      inline def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      inline def setIs_bestie(value: Boolean): Self = StObject.set(x, "is_bestie", value.asInstanceOf[js.Any])
      
      inline def setIs_restricted(value: Boolean): Self = StObject.set(x, "is_restricted", value.asInstanceOf[js.Any])
      
      inline def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaInfoResponseImageVersions2 extends StObject {
    
    var candidates: js.Array[MediaInfoResponseCandidatesItem]
  }
  object MediaInfoResponseImageVersions2 {
    
    inline def apply(candidates: js.Array[MediaInfoResponseCandidatesItem]): MediaInfoResponseImageVersions2 = {
      val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaInfoResponseImageVersions2]
    }
    
    extension [Self <: MediaInfoResponseImageVersions2](x: Self) {
      
      inline def setCandidates(value: js.Array[MediaInfoResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
      
      inline def setCandidatesVarargs(value: MediaInfoResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
    }
  }
  
  trait MediaInfoResponseItemsItem extends StObject {
    
    var can_view_more_preview_comments: Boolean
    
    var can_viewer_reshare: Boolean
    
    var can_viewer_save: Boolean
    
    var caption: MediaInfoResponseCaption
    
    var caption_is_edited: Boolean
    
    var client_cache_key: String
    
    var code: String
    
    var comment_count: Double
    
    var comment_likes_enabled: Boolean
    
    var comment_threading_enabled: Boolean
    
    var device_timestamp: Double
    
    var filter_type: Double
    
    var has_liked: Boolean
    
    var has_more_comments: Boolean
    
    var id: String
    
    var image_versions2: MediaInfoResponseImageVersions2
    
    var inline_composer_display_condition: String
    
    var inline_composer_imp_trigger_time: Double
    
    var like_count: Double
    
    var max_num_visible_preview_comments: Double
    
    var media_type: Double
    
    var organic_tracking_token: String
    
    var original_height: Double
    
    var original_width: Double
    
    var photo_of_you: Boolean
    
    var pk: String
    
    var preview_comments: js.Array[js.Any]
    
    var taken_at: Double
    
    var top_likers: js.Array[js.Any]
    
    var user: MediaInfoResponseUser
  }
  object MediaInfoResponseItemsItem {
    
    inline def apply(
      can_view_more_preview_comments: Boolean,
      can_viewer_reshare: Boolean,
      can_viewer_save: Boolean,
      caption: MediaInfoResponseCaption,
      caption_is_edited: Boolean,
      client_cache_key: String,
      code: String,
      comment_count: Double,
      comment_likes_enabled: Boolean,
      comment_threading_enabled: Boolean,
      device_timestamp: Double,
      filter_type: Double,
      has_liked: Boolean,
      has_more_comments: Boolean,
      id: String,
      image_versions2: MediaInfoResponseImageVersions2,
      inline_composer_display_condition: String,
      inline_composer_imp_trigger_time: Double,
      like_count: Double,
      max_num_visible_preview_comments: Double,
      media_type: Double,
      organic_tracking_token: String,
      original_height: Double,
      original_width: Double,
      photo_of_you: Boolean,
      pk: String,
      preview_comments: js.Array[js.Any],
      taken_at: Double,
      top_likers: js.Array[js.Any],
      user: MediaInfoResponseUser
    ): MediaInfoResponseItemsItem = {
      val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_reshare = can_viewer_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], inline_composer_display_condition = inline_composer_display_condition.asInstanceOf[js.Any], inline_composer_imp_trigger_time = inline_composer_imp_trigger_time.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], top_likers = top_likers.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaInfoResponseItemsItem]
    }
    
    extension [Self <: MediaInfoResponseItemsItem](x: Self) {
      
      inline def setCan_view_more_preview_comments(value: Boolean): Self = StObject.set(x, "can_view_more_preview_comments", value.asInstanceOf[js.Any])
      
      inline def setCan_viewer_reshare(value: Boolean): Self = StObject.set(x, "can_viewer_reshare", value.asInstanceOf[js.Any])
      
      inline def setCan_viewer_save(value: Boolean): Self = StObject.set(x, "can_viewer_save", value.asInstanceOf[js.Any])
      
      inline def setCaption(value: MediaInfoResponseCaption): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaption_is_edited(value: Boolean): Self = StObject.set(x, "caption_is_edited", value.asInstanceOf[js.Any])
      
      inline def setClient_cache_key(value: String): Self = StObject.set(x, "client_cache_key", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
      
      inline def setComment_likes_enabled(value: Boolean): Self = StObject.set(x, "comment_likes_enabled", value.asInstanceOf[js.Any])
      
      inline def setComment_threading_enabled(value: Boolean): Self = StObject.set(x, "comment_threading_enabled", value.asInstanceOf[js.Any])
      
      inline def setDevice_timestamp(value: Double): Self = StObject.set(x, "device_timestamp", value.asInstanceOf[js.Any])
      
      inline def setFilter_type(value: Double): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
      
      inline def setHas_liked(value: Boolean): Self = StObject.set(x, "has_liked", value.asInstanceOf[js.Any])
      
      inline def setHas_more_comments(value: Boolean): Self = StObject.set(x, "has_more_comments", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImage_versions2(value: MediaInfoResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
      
      inline def setInline_composer_display_condition(value: String): Self = StObject.set(x, "inline_composer_display_condition", value.asInstanceOf[js.Any])
      
      inline def setInline_composer_imp_trigger_time(value: Double): Self = StObject.set(x, "inline_composer_imp_trigger_time", value.asInstanceOf[js.Any])
      
      inline def setLike_count(value: Double): Self = StObject.set(x, "like_count", value.asInstanceOf[js.Any])
      
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
      
      inline def setTop_likers(value: js.Array[js.Any]): Self = StObject.set(x, "top_likers", value.asInstanceOf[js.Any])
      
      inline def setTop_likersVarargs(value: js.Any*): Self = StObject.set(x, "top_likers", js.Array(value :_*))
      
      inline def setUser(value: MediaInfoResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaInfoResponseRootObject extends StObject {
    
    var auto_load_more_enabled: Boolean
    
    var items: js.Array[MediaInfoResponseItemsItem]
    
    var more_available: Boolean
    
    var num_results: Double
    
    var status: String
  }
  object MediaInfoResponseRootObject {
    
    inline def apply(
      auto_load_more_enabled: Boolean,
      items: js.Array[MediaInfoResponseItemsItem],
      more_available: Boolean,
      num_results: Double,
      status: String
    ): MediaInfoResponseRootObject = {
      val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaInfoResponseRootObject]
    }
    
    extension [Self <: MediaInfoResponseRootObject](x: Self) {
      
      inline def setAuto_load_more_enabled(value: Boolean): Self = StObject.set(x, "auto_load_more_enabled", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[MediaInfoResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: MediaInfoResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
      
      inline def setNum_results(value: Double): Self = StObject.set(x, "num_results", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaInfoResponseUser extends StObject {
    
    var friendship_status: MediaInfoResponseFriendshipStatus
    
    var full_name: String
    
    var has_anonymous_profile_picture: Boolean
    
    var is_favorite: Boolean
    
    var is_private: Boolean
    
    var is_unpublished: Boolean
    
    var is_verified: Boolean
    
    var pk: Double
    
    var profile_pic_id: String
    
    var profile_pic_url: String
    
    var username: String
  }
  object MediaInfoResponseUser {
    
    inline def apply(
      friendship_status: MediaInfoResponseFriendshipStatus,
      full_name: String,
      has_anonymous_profile_picture: Boolean,
      is_favorite: Boolean,
      is_private: Boolean,
      is_unpublished: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      username: String
    ): MediaInfoResponseUser = {
      val __obj = js.Dynamic.literal(friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_favorite = is_favorite.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_unpublished = is_unpublished.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaInfoResponseUser]
    }
    
    extension [Self <: MediaInfoResponseUser](x: Self) {
      
      inline def setFriendship_status(value: MediaInfoResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      inline def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      inline def setIs_favorite(value: Boolean): Self = StObject.set(x, "is_favorite", value.asInstanceOf[js.Any])
      
      inline def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      inline def setIs_unpublished(value: Boolean): Self = StObject.set(x, "is_unpublished", value.asInstanceOf[js.Any])
      
      inline def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      inline def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
