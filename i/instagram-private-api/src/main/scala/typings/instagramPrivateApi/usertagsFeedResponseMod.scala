package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usertagsFeedResponseMod {
  
  trait UsertagsFeedResponseCandidatesItem extends StObject {
    
    var estimated_scans_sizes: js.Array[Double]
    
    var height: Double
    
    var url: String
    
    var width: Double
  }
  object UsertagsFeedResponseCandidatesItem {
    
    @scala.inline
    def apply(estimated_scans_sizes: js.Array[Double], height: Double, url: String, width: Double): UsertagsFeedResponseCandidatesItem = {
      val __obj = js.Dynamic.literal(estimated_scans_sizes = estimated_scans_sizes.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsertagsFeedResponseCandidatesItem]
    }
    
    @scala.inline
    implicit class UsertagsFeedResponseCandidatesItemMutableBuilder[Self <: UsertagsFeedResponseCandidatesItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEstimated_scans_sizes(value: js.Array[Double]): Self = StObject.set(x, "estimated_scans_sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEstimated_scans_sizesVarargs(value: Double*): Self = StObject.set(x, "estimated_scans_sizes", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsertagsFeedResponseCaption extends StObject {
    
    var bit_flags: Double
    
    var content_type: String
    
    var created_at: Double
    
    var created_at_utc: Double
    
    var did_report_as_spam: Boolean
    
    var has_translation: js.UndefOr[Boolean] = js.undefined
    
    var media_id: String
    
    var pk: String
    
    var share_enabled: Boolean
    
    var status: String
    
    var text: String
    
    var `type`: Double
    
    var user: UsertagsFeedResponseUser
    
    var user_id: Double
  }
  object UsertagsFeedResponseCaption {
    
    @scala.inline
    def apply(
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
      user: UsertagsFeedResponseUser,
      user_id: Double
    ): UsertagsFeedResponseCaption = {
      val __obj = js.Dynamic.literal(bit_flags = bit_flags.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], did_report_as_spam = did_report_as_spam.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsertagsFeedResponseCaption]
    }
    
    @scala.inline
    implicit class UsertagsFeedResponseCaptionMutableBuilder[Self <: UsertagsFeedResponseCaption] (val x: Self) extends AnyVal {
      
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
      def setHas_translationUndefined: Self = StObject.set(x, "has_translation", js.undefined)
      
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
      def setUser(value: UsertagsFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsertagsFeedResponseFriendshipStatus extends StObject {
    
    var following: Boolean
    
    var is_bestie: Boolean
    
    var is_restricted: Boolean
    
    var outgoing_request: Boolean
  }
  object UsertagsFeedResponseFriendshipStatus {
    
    @scala.inline
    def apply(following: Boolean, is_bestie: Boolean, is_restricted: Boolean, outgoing_request: Boolean): UsertagsFeedResponseFriendshipStatus = {
      val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsertagsFeedResponseFriendshipStatus]
    }
    
    @scala.inline
    implicit class UsertagsFeedResponseFriendshipStatusMutableBuilder[Self <: UsertagsFeedResponseFriendshipStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_bestie(value: Boolean): Self = StObject.set(x, "is_bestie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_restricted(value: Boolean): Self = StObject.set(x, "is_restricted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsertagsFeedResponseImageVersions2 extends StObject {
    
    var candidates: js.Array[UsertagsFeedResponseCandidatesItem]
  }
  object UsertagsFeedResponseImageVersions2 {
    
    @scala.inline
    def apply(candidates: js.Array[UsertagsFeedResponseCandidatesItem]): UsertagsFeedResponseImageVersions2 = {
      val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsertagsFeedResponseImageVersions2]
    }
    
    @scala.inline
    implicit class UsertagsFeedResponseImageVersions2MutableBuilder[Self <: UsertagsFeedResponseImageVersions2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCandidates(value: js.Array[UsertagsFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCandidatesVarargs(value: UsertagsFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
    }
  }
  
  trait UsertagsFeedResponseInItem extends StObject {
    
    var duration_in_video_in_sec: Null
    
    var position: js.Array[Double | String]
    
    var start_time_in_video_in_sec: Null
    
    var user: UsertagsFeedResponseUser
  }
  object UsertagsFeedResponseInItem {
    
    @scala.inline
    def apply(
      duration_in_video_in_sec: Null,
      position: js.Array[Double | String],
      start_time_in_video_in_sec: Null,
      user: UsertagsFeedResponseUser
    ): UsertagsFeedResponseInItem = {
      val __obj = js.Dynamic.literal(duration_in_video_in_sec = duration_in_video_in_sec.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], start_time_in_video_in_sec = start_time_in_video_in_sec.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsertagsFeedResponseInItem]
    }
    
    @scala.inline
    implicit class UsertagsFeedResponseInItemMutableBuilder[Self <: UsertagsFeedResponseInItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration_in_video_in_sec(value: Null): Self = StObject.set(x, "duration_in_video_in_sec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: js.Array[Double | String]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionVarargs(value: (Double | String)*): Self = StObject.set(x, "position", js.Array(value :_*))
      
      @scala.inline
      def setStart_time_in_video_in_sec(value: Null): Self = StObject.set(x, "start_time_in_video_in_sec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: UsertagsFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsertagsFeedResponseItemsItem extends StObject {
    
    var can_view_more_preview_comments: Boolean
    
    var can_viewer_reshare: Boolean
    
    var can_viewer_save: Boolean
    
    var caption: UsertagsFeedResponseCaption
    
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
    
    var image_versions2: UsertagsFeedResponseImageVersions2
    
    var inline_composer_display_condition: String
    
    var inline_composer_imp_trigger_time: Double
    
    var lat: js.UndefOr[Double] = js.undefined
    
    var like_count: Double
    
    var lng: js.UndefOr[String] = js.undefined
    
    var location: js.UndefOr[UsertagsFeedResponseLocation] = js.undefined
    
    var max_num_visible_preview_comments: Double
    
    var media_type: Double
    
    var next_max_id: String
    
    var organic_tracking_token: String
    
    var original_height: Double
    
    var original_width: Double
    
    var photo_of_you: Boolean
    
    var pk: String
    
    var preview_comments: js.Array[UsertagsFeedResponsePreviewCommentsItem]
    
    var taken_at: Double
    
    var user: UsertagsFeedResponseUser
    
    var usertags: UsertagsFeedResponseUsertags
  }
  object UsertagsFeedResponseItemsItem {
    
    @scala.inline
    def apply(
      can_view_more_preview_comments: Boolean,
      can_viewer_reshare: Boolean,
      can_viewer_save: Boolean,
      caption: UsertagsFeedResponseCaption,
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
      image_versions2: UsertagsFeedResponseImageVersions2,
      inline_composer_display_condition: String,
      inline_composer_imp_trigger_time: Double,
      like_count: Double,
      max_num_visible_preview_comments: Double,
      media_type: Double,
      next_max_id: String,
      organic_tracking_token: String,
      original_height: Double,
      original_width: Double,
      photo_of_you: Boolean,
      pk: String,
      preview_comments: js.Array[UsertagsFeedResponsePreviewCommentsItem],
      taken_at: Double,
      user: UsertagsFeedResponseUser,
      usertags: UsertagsFeedResponseUsertags
    ): UsertagsFeedResponseItemsItem = {
      val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_reshare = can_viewer_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], inline_composer_display_condition = inline_composer_display_condition.asInstanceOf[js.Any], inline_composer_imp_trigger_time = inline_composer_imp_trigger_time.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], usertags = usertags.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsertagsFeedResponseItemsItem]
    }
    
    @scala.inline
    implicit class UsertagsFeedResponseItemsItemMutableBuilder[Self <: UsertagsFeedResponseItemsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCan_view_more_preview_comments(value: Boolean): Self = StObject.set(x, "can_view_more_preview_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_viewer_reshare(value: Boolean): Self = StObject.set(x, "can_viewer_reshare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_viewer_save(value: Boolean): Self = StObject.set(x, "can_viewer_save", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption(value: UsertagsFeedResponseCaption): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption_is_edited(value: Boolean): Self = StObject.set(x, "caption_is_edited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_cache_key(value: String): Self = StObject.set(x, "client_cache_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment_likes_enabled(value: Boolean): Self = StObject.set(x, "comment_likes_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment_threading_enabled(value: Boolean): Self = StObject.set(x, "comment_threading_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevice_timestamp(value: Double): Self = StObject.set(x, "device_timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_type(value: Double): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_liked(value: Boolean): Self = StObject.set(x, "has_liked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_more_comments(value: Boolean): Self = StObject.set(x, "has_more_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage_versions2(value: UsertagsFeedResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInline_composer_display_condition(value: String): Self = StObject.set(x, "inline_composer_display_condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInline_composer_imp_trigger_time(value: Double): Self = StObject.set(x, "inline_composer_imp_trigger_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatUndefined: Self = StObject.set(x, "lat", js.undefined)
      
      @scala.inline
      def setLike_count(value: Double): Self = StObject.set(x, "like_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLng(value: String): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLngUndefined: Self = StObject.set(x, "lng", js.undefined)
      
      @scala.inline
      def setLocation(value: UsertagsFeedResponseLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setMax_num_visible_preview_comments(value: Double): Self = StObject.set(x, "max_num_visible_preview_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_type(value: Double): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganic_tracking_token(value: String): Self = StObject.set(x, "organic_tracking_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginal_height(value: Double): Self = StObject.set(x, "original_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginal_width(value: Double): Self = StObject.set(x, "original_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoto_of_you(value: Boolean): Self = StObject.set(x, "photo_of_you", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreview_comments(value: js.Array[UsertagsFeedResponsePreviewCommentsItem]): Self = StObject.set(x, "preview_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreview_commentsVarargs(value: UsertagsFeedResponsePreviewCommentsItem*): Self = StObject.set(x, "preview_comments", js.Array(value :_*))
      
      @scala.inline
      def setTaken_at(value: Double): Self = StObject.set(x, "taken_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: UsertagsFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsertags(value: UsertagsFeedResponseUsertags): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsertagsFeedResponseLocation extends StObject {
    
    var address: String
    
    var city: String
    
    var external_source: String
    
    var facebook_places_id: Double | String
    
    var lat: Double | String
    
    var lng: Double
    
    var name: String
    
    var pk: Double
    
    var short_name: String
  }
  object UsertagsFeedResponseLocation {
    
    @scala.inline
    def apply(
      address: String,
      city: String,
      external_source: String,
      facebook_places_id: Double | String,
      lat: Double | String,
      lng: Double,
      name: String,
      pk: Double,
      short_name: String
    ): UsertagsFeedResponseLocation = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], external_source = external_source.asInstanceOf[js.Any], facebook_places_id = facebook_places_id.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsertagsFeedResponseLocation]
    }
    
    @scala.inline
    implicit class UsertagsFeedResponseLocationMutableBuilder[Self <: UsertagsFeedResponseLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_source(value: String): Self = StObject.set(x, "external_source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacebook_places_id(value: Double | String): Self = StObject.set(x, "facebook_places_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLat(value: Double | String): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsertagsFeedResponsePreviewCommentsItem extends StObject {
    
    var bit_flags: Double
    
    var comment_like_count: Double
    
    var content_type: String
    
    var created_at: Double
    
    var created_at_utc: Double
    
    var did_report_as_spam: Boolean
    
    var has_liked_comment: Boolean
    
    var has_translation: js.UndefOr[Boolean] = js.undefined
    
    var media_id: String
    
    var parent_comment_id: js.UndefOr[String] = js.undefined
    
    var pk: String
    
    var share_enabled: Boolean
    
    var status: String
    
    var text: String
    
    var `type`: Double
    
    var user: UsertagsFeedResponseUser
    
    var user_id: Double
  }
  object UsertagsFeedResponsePreviewCommentsItem {
    
    @scala.inline
    def apply(
      bit_flags: Double,
      comment_like_count: Double,
      content_type: String,
      created_at: Double,
      created_at_utc: Double,
      did_report_as_spam: Boolean,
      has_liked_comment: Boolean,
      media_id: String,
      pk: String,
      share_enabled: Boolean,
      status: String,
      text: String,
      `type`: Double,
      user: UsertagsFeedResponseUser,
      user_id: Double
    ): UsertagsFeedResponsePreviewCommentsItem = {
      val __obj = js.Dynamic.literal(bit_flags = bit_flags.asInstanceOf[js.Any], comment_like_count = comment_like_count.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], did_report_as_spam = did_report_as_spam.asInstanceOf[js.Any], has_liked_comment = has_liked_comment.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsertagsFeedResponsePreviewCommentsItem]
    }
    
    @scala.inline
    implicit class UsertagsFeedResponsePreviewCommentsItemMutableBuilder[Self <: UsertagsFeedResponsePreviewCommentsItem] (val x: Self) extends AnyVal {
      
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
      def setHas_translationUndefined: Self = StObject.set(x, "has_translation", js.undefined)
      
      @scala.inline
      def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
      
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
      def setUser(value: UsertagsFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsertagsFeedResponseRootObject extends StObject {
    
    var auto_load_more_enabled: Boolean
    
    var items: js.Array[UsertagsFeedResponseItemsItem]
    
    var more_available: Boolean
    
    var new_photos: js.Array[js.Any]
    
    var next_max_id: String
    
    var num_results: Double
    
    var requires_review: Boolean
    
    var status: String
    
    var total_count: Double
  }
  object UsertagsFeedResponseRootObject {
    
    @scala.inline
    def apply(
      auto_load_more_enabled: Boolean,
      items: js.Array[UsertagsFeedResponseItemsItem],
      more_available: Boolean,
      new_photos: js.Array[js.Any],
      next_max_id: String,
      num_results: Double,
      requires_review: Boolean,
      status: String,
      total_count: Double
    ): UsertagsFeedResponseRootObject = {
      val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], new_photos = new_photos.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], requires_review = requires_review.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsertagsFeedResponseRootObject]
    }
    
    @scala.inline
    implicit class UsertagsFeedResponseRootObjectMutableBuilder[Self <: UsertagsFeedResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuto_load_more_enabled(value: Boolean): Self = StObject.set(x, "auto_load_more_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[UsertagsFeedResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: UsertagsFeedResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNew_photos(value: js.Array[js.Any]): Self = StObject.set(x, "new_photos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNew_photosVarargs(value: js.Any*): Self = StObject.set(x, "new_photos", js.Array(value :_*))
      
      @scala.inline
      def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_results(value: Double): Self = StObject.set(x, "num_results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequires_review(value: Boolean): Self = StObject.set(x, "requires_review", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsertagsFeedResponseUser extends StObject {
    
    var friendship_status: js.UndefOr[UsertagsFeedResponseFriendshipStatus] = js.undefined
    
    var full_name: String
    
    var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.undefined
    
    var is_favorite: js.UndefOr[Boolean] = js.undefined
    
    var is_private: Boolean
    
    var is_unpublished: js.UndefOr[Boolean] = js.undefined
    
    var is_verified: Boolean
    
    var pk: Double
    
    var profile_pic_id: js.UndefOr[String] = js.undefined
    
    var profile_pic_url: String
    
    var username: String
  }
  object UsertagsFeedResponseUser {
    
    @scala.inline
    def apply(
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_url: String,
      username: String
    ): UsertagsFeedResponseUser = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsertagsFeedResponseUser]
    }
    
    @scala.inline
    implicit class UsertagsFeedResponseUserMutableBuilder[Self <: UsertagsFeedResponseUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFriendship_status(value: UsertagsFeedResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFriendship_statusUndefined: Self = StObject.set(x, "friendship_status", js.undefined)
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_pictureUndefined: Self = StObject.set(x, "has_anonymous_profile_picture", js.undefined)
      
      @scala.inline
      def setIs_favorite(value: Boolean): Self = StObject.set(x, "is_favorite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_favoriteUndefined: Self = StObject.set(x, "is_favorite", js.undefined)
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_unpublished(value: Boolean): Self = StObject.set(x, "is_unpublished", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_unpublishedUndefined: Self = StObject.set(x, "is_unpublished", js.undefined)
      
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
  
  trait UsertagsFeedResponseUsertags extends StObject {
    
    var in: js.Array[UsertagsFeedResponseInItem]
  }
  object UsertagsFeedResponseUsertags {
    
    @scala.inline
    def apply(in: js.Array[UsertagsFeedResponseInItem]): UsertagsFeedResponseUsertags = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsertagsFeedResponseUsertags]
    }
    
    @scala.inline
    implicit class UsertagsFeedResponseUsertagsMutableBuilder[Self <: UsertagsFeedResponseUsertags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIn(value: js.Array[UsertagsFeedResponseInItem]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInVarargs(value: UsertagsFeedResponseInItem*): Self = StObject.set(x, "in", js.Array(value :_*))
    }
  }
}
