package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaRepositoryConfigureSidecarResponseMod {
  
  trait MediaRepositoryConfigureSidecarResponseCandidatesItem extends StObject {
    
    var estimated_scans_sizes: js.Array[Double]
    
    var height: Double
    
    var url: String
    
    var width: Double
  }
  object MediaRepositoryConfigureSidecarResponseCandidatesItem {
    
    @scala.inline
    def apply(estimated_scans_sizes: js.Array[Double], height: Double, url: String, width: Double): MediaRepositoryConfigureSidecarResponseCandidatesItem = {
      val __obj = js.Dynamic.literal(estimated_scans_sizes = estimated_scans_sizes.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseCandidatesItem]
    }
    
    @scala.inline
    implicit class MediaRepositoryConfigureSidecarResponseCandidatesItemMutableBuilder[Self <: MediaRepositoryConfigureSidecarResponseCandidatesItem] (val x: Self) extends AnyVal {
      
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
  
  trait MediaRepositoryConfigureSidecarResponseCaption extends StObject {
    
    var bit_flags: Double
    
    var content_type: String
    
    var created_at: Double
    
    var created_at_utc: Double
    
    var did_report_as_spam: Boolean
    
    var has_translation: Boolean
    
    var media_id: String
    
    var pk: String
    
    var share_enabled: Boolean
    
    var status: String
    
    var text: String
    
    var `type`: Double
    
    var user: MediaRepositoryConfigureSidecarResponseUser
    
    var user_id: Double
  }
  object MediaRepositoryConfigureSidecarResponseCaption {
    
    @scala.inline
    def apply(
      bit_flags: Double,
      content_type: String,
      created_at: Double,
      created_at_utc: Double,
      did_report_as_spam: Boolean,
      has_translation: Boolean,
      media_id: String,
      pk: String,
      share_enabled: Boolean,
      status: String,
      text: String,
      `type`: Double,
      user: MediaRepositoryConfigureSidecarResponseUser,
      user_id: Double
    ): MediaRepositoryConfigureSidecarResponseCaption = {
      val __obj = js.Dynamic.literal(bit_flags = bit_flags.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], did_report_as_spam = did_report_as_spam.asInstanceOf[js.Any], has_translation = has_translation.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseCaption]
    }
    
    @scala.inline
    implicit class MediaRepositoryConfigureSidecarResponseCaptionMutableBuilder[Self <: MediaRepositoryConfigureSidecarResponseCaption] (val x: Self) extends AnyVal {
      
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
      def setUser(value: MediaRepositoryConfigureSidecarResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaRepositoryConfigureSidecarResponseCarouselMediaItem extends StObject {
    
    var carousel_parent_id: String
    
    var fb_user_tags: js.UndefOr[MediaRepositoryConfigureSidecarResponseFbUserTags] = js.undefined
    
    var id: String
    
    var image_versions2: MediaRepositoryConfigureSidecarResponseImageVersions2
    
    var media_type: Double
    
    var original_height: Double
    
    var original_width: Double
    
    var pk: String
    
    var usertags: js.UndefOr[MediaRepositoryConfigureSidecarResponseUsertags] = js.undefined
    
    var video_duration: js.UndefOr[Double] = js.undefined
    
    var video_versions: js.UndefOr[js.Array[MediaRepositoryConfigureSidecarResponseVideoVersionsItem]] = js.undefined
  }
  object MediaRepositoryConfigureSidecarResponseCarouselMediaItem {
    
    @scala.inline
    def apply(
      carousel_parent_id: String,
      id: String,
      image_versions2: MediaRepositoryConfigureSidecarResponseImageVersions2,
      media_type: Double,
      original_height: Double,
      original_width: Double,
      pk: String
    ): MediaRepositoryConfigureSidecarResponseCarouselMediaItem = {
      val __obj = js.Dynamic.literal(carousel_parent_id = carousel_parent_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseCarouselMediaItem]
    }
    
    @scala.inline
    implicit class MediaRepositoryConfigureSidecarResponseCarouselMediaItemMutableBuilder[Self <: MediaRepositoryConfigureSidecarResponseCarouselMediaItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCarousel_parent_id(value: String): Self = StObject.set(x, "carousel_parent_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFb_user_tags(value: MediaRepositoryConfigureSidecarResponseFbUserTags): Self = StObject.set(x, "fb_user_tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFb_user_tagsUndefined: Self = StObject.set(x, "fb_user_tags", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage_versions2(value: MediaRepositoryConfigureSidecarResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_type(value: Double): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginal_height(value: Double): Self = StObject.set(x, "original_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginal_width(value: Double): Self = StObject.set(x, "original_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsertags(value: MediaRepositoryConfigureSidecarResponseUsertags): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsertagsUndefined: Self = StObject.set(x, "usertags", js.undefined)
      
      @scala.inline
      def setVideo_duration(value: Double): Self = StObject.set(x, "video_duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo_durationUndefined: Self = StObject.set(x, "video_duration", js.undefined)
      
      @scala.inline
      def setVideo_versions(value: js.Array[MediaRepositoryConfigureSidecarResponseVideoVersionsItem]): Self = StObject.set(x, "video_versions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo_versionsUndefined: Self = StObject.set(x, "video_versions", js.undefined)
      
      @scala.inline
      def setVideo_versionsVarargs(value: MediaRepositoryConfigureSidecarResponseVideoVersionsItem*): Self = StObject.set(x, "video_versions", js.Array(value :_*))
    }
  }
  
  trait MediaRepositoryConfigureSidecarResponseFbUserTags extends StObject {
    
    var in: js.Array[js.Any]
  }
  object MediaRepositoryConfigureSidecarResponseFbUserTags {
    
    @scala.inline
    def apply(in: js.Array[js.Any]): MediaRepositoryConfigureSidecarResponseFbUserTags = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseFbUserTags]
    }
    
    @scala.inline
    implicit class MediaRepositoryConfigureSidecarResponseFbUserTagsMutableBuilder[Self <: MediaRepositoryConfigureSidecarResponseFbUserTags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIn(value: js.Array[js.Any]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInVarargs(value: js.Any*): Self = StObject.set(x, "in", js.Array(value :_*))
    }
  }
  
  trait MediaRepositoryConfigureSidecarResponseImageVersions2 extends StObject {
    
    var candidates: js.Array[MediaRepositoryConfigureSidecarResponseCandidatesItem]
  }
  object MediaRepositoryConfigureSidecarResponseImageVersions2 {
    
    @scala.inline
    def apply(candidates: js.Array[MediaRepositoryConfigureSidecarResponseCandidatesItem]): MediaRepositoryConfigureSidecarResponseImageVersions2 = {
      val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseImageVersions2]
    }
    
    @scala.inline
    implicit class MediaRepositoryConfigureSidecarResponseImageVersions2MutableBuilder[Self <: MediaRepositoryConfigureSidecarResponseImageVersions2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCandidates(value: js.Array[MediaRepositoryConfigureSidecarResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCandidatesVarargs(value: MediaRepositoryConfigureSidecarResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
    }
  }
  
  trait MediaRepositoryConfigureSidecarResponseInItem extends StObject {
    
    var duration_in_video_in_sec: Null
    
    var position: js.Array[Double]
    
    var start_time_in_video_in_sec: Null
    
    var user: MediaRepositoryConfigureSidecarResponseUser
  }
  object MediaRepositoryConfigureSidecarResponseInItem {
    
    @scala.inline
    def apply(
      duration_in_video_in_sec: Null,
      position: js.Array[Double],
      start_time_in_video_in_sec: Null,
      user: MediaRepositoryConfigureSidecarResponseUser
    ): MediaRepositoryConfigureSidecarResponseInItem = {
      val __obj = js.Dynamic.literal(duration_in_video_in_sec = duration_in_video_in_sec.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], start_time_in_video_in_sec = start_time_in_video_in_sec.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseInItem]
    }
    
    @scala.inline
    implicit class MediaRepositoryConfigureSidecarResponseInItemMutableBuilder[Self <: MediaRepositoryConfigureSidecarResponseInItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration_in_video_in_sec(value: Null): Self = StObject.set(x, "duration_in_video_in_sec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: js.Array[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionVarargs(value: Double*): Self = StObject.set(x, "position", js.Array(value :_*))
      
      @scala.inline
      def setStart_time_in_video_in_sec(value: Null): Self = StObject.set(x, "start_time_in_video_in_sec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: MediaRepositoryConfigureSidecarResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaRepositoryConfigureSidecarResponseMedia extends StObject {
    
    var can_see_insights_as_brand: Boolean
    
    var can_view_more_preview_comments: Boolean
    
    var can_viewer_reshare: Boolean
    
    var can_viewer_save: Boolean
    
    var caption: MediaRepositoryConfigureSidecarResponseCaption
    
    var caption_is_edited: Boolean
    
    var carousel_media: js.Array[MediaRepositoryConfigureSidecarResponseCarouselMediaItem]
    
    var carousel_media_count: Double
    
    var client_cache_key: String
    
    var code: String
    
    var comment_count: Double
    
    var comment_likes_enabled: Boolean
    
    var comment_threading_enabled: Boolean
    
    var device_timestamp: Double
    
    var fb_user_tags: MediaRepositoryConfigureSidecarResponseFbUserTags
    
    var filter_type: Double
    
    var has_more_comments: Boolean
    
    var id: String
    
    var max_num_visible_preview_comments: Double
    
    var media_type: Double
    
    var organic_tracking_token: String
    
    var photo_of_you: Boolean
    
    var pk: String
    
    var preview_comments: js.Array[js.Any]
    
    var taken_at: Double
    
    var user: MediaRepositoryConfigureSidecarResponseUser
    
    var usertags: MediaRepositoryConfigureSidecarResponseUsertags
  }
  object MediaRepositoryConfigureSidecarResponseMedia {
    
    @scala.inline
    def apply(
      can_see_insights_as_brand: Boolean,
      can_view_more_preview_comments: Boolean,
      can_viewer_reshare: Boolean,
      can_viewer_save: Boolean,
      caption: MediaRepositoryConfigureSidecarResponseCaption,
      caption_is_edited: Boolean,
      carousel_media: js.Array[MediaRepositoryConfigureSidecarResponseCarouselMediaItem],
      carousel_media_count: Double,
      client_cache_key: String,
      code: String,
      comment_count: Double,
      comment_likes_enabled: Boolean,
      comment_threading_enabled: Boolean,
      device_timestamp: Double,
      fb_user_tags: MediaRepositoryConfigureSidecarResponseFbUserTags,
      filter_type: Double,
      has_more_comments: Boolean,
      id: String,
      max_num_visible_preview_comments: Double,
      media_type: Double,
      organic_tracking_token: String,
      photo_of_you: Boolean,
      pk: String,
      preview_comments: js.Array[js.Any],
      taken_at: Double,
      user: MediaRepositoryConfigureSidecarResponseUser,
      usertags: MediaRepositoryConfigureSidecarResponseUsertags
    ): MediaRepositoryConfigureSidecarResponseMedia = {
      val __obj = js.Dynamic.literal(can_see_insights_as_brand = can_see_insights_as_brand.asInstanceOf[js.Any], can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_reshare = can_viewer_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], carousel_media = carousel_media.asInstanceOf[js.Any], carousel_media_count = carousel_media_count.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], fb_user_tags = fb_user_tags.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], usertags = usertags.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseMedia]
    }
    
    @scala.inline
    implicit class MediaRepositoryConfigureSidecarResponseMediaMutableBuilder[Self <: MediaRepositoryConfigureSidecarResponseMedia] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCan_see_insights_as_brand(value: Boolean): Self = StObject.set(x, "can_see_insights_as_brand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_view_more_preview_comments(value: Boolean): Self = StObject.set(x, "can_view_more_preview_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_viewer_reshare(value: Boolean): Self = StObject.set(x, "can_viewer_reshare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_viewer_save(value: Boolean): Self = StObject.set(x, "can_viewer_save", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption(value: MediaRepositoryConfigureSidecarResponseCaption): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption_is_edited(value: Boolean): Self = StObject.set(x, "caption_is_edited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarousel_media(value: js.Array[MediaRepositoryConfigureSidecarResponseCarouselMediaItem]): Self = StObject.set(x, "carousel_media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarousel_mediaVarargs(value: MediaRepositoryConfigureSidecarResponseCarouselMediaItem*): Self = StObject.set(x, "carousel_media", js.Array(value :_*))
      
      @scala.inline
      def setCarousel_media_count(value: Double): Self = StObject.set(x, "carousel_media_count", value.asInstanceOf[js.Any])
      
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
      def setFb_user_tags(value: MediaRepositoryConfigureSidecarResponseFbUserTags): Self = StObject.set(x, "fb_user_tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_type(value: Double): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_more_comments(value: Boolean): Self = StObject.set(x, "has_more_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_num_visible_preview_comments(value: Double): Self = StObject.set(x, "max_num_visible_preview_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_type(value: Double): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganic_tracking_token(value: String): Self = StObject.set(x, "organic_tracking_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoto_of_you(value: Boolean): Self = StObject.set(x, "photo_of_you", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreview_comments(value: js.Array[js.Any]): Self = StObject.set(x, "preview_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreview_commentsVarargs(value: js.Any*): Self = StObject.set(x, "preview_comments", js.Array(value :_*))
      
      @scala.inline
      def setTaken_at(value: Double): Self = StObject.set(x, "taken_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: MediaRepositoryConfigureSidecarResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsertags(value: MediaRepositoryConfigureSidecarResponseUsertags): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaRepositoryConfigureSidecarResponseRootObject extends StObject {
    
    var client_sidecar_id: String
    
    var media: MediaRepositoryConfigureSidecarResponseMedia
    
    var status: String
  }
  object MediaRepositoryConfigureSidecarResponseRootObject {
    
    @scala.inline
    def apply(client_sidecar_id: String, media: MediaRepositoryConfigureSidecarResponseMedia, status: String): MediaRepositoryConfigureSidecarResponseRootObject = {
      val __obj = js.Dynamic.literal(client_sidecar_id = client_sidecar_id.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseRootObject]
    }
    
    @scala.inline
    implicit class MediaRepositoryConfigureSidecarResponseRootObjectMutableBuilder[Self <: MediaRepositoryConfigureSidecarResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient_sidecar_id(value: String): Self = StObject.set(x, "client_sidecar_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia(value: MediaRepositoryConfigureSidecarResponseMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaRepositoryConfigureSidecarResponseUser extends StObject {
    
    var allowed_commenter_type: js.UndefOr[String] = js.undefined
    
    var can_boost_post: js.UndefOr[Boolean] = js.undefined
    
    var can_see_organic_insights: js.UndefOr[Boolean] = js.undefined
    
    var full_name: String
    
    var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.undefined
    
    var is_private: Boolean
    
    var is_unpublished: js.UndefOr[Boolean] = js.undefined
    
    var is_verified: js.UndefOr[Boolean] = js.undefined
    
    var latest_reel_media: js.UndefOr[Null] = js.undefined
    
    var pk: Double
    
    var profile_pic_id: String
    
    var profile_pic_url: String
    
    var reel_auto_archive: js.UndefOr[String] = js.undefined
    
    var show_insights_terms: js.UndefOr[Boolean] = js.undefined
    
    var username: String
  }
  object MediaRepositoryConfigureSidecarResponseUser {
    
    @scala.inline
    def apply(
      full_name: String,
      is_private: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      username: String
    ): MediaRepositoryConfigureSidecarResponseUser = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseUser]
    }
    
    @scala.inline
    implicit class MediaRepositoryConfigureSidecarResponseUserMutableBuilder[Self <: MediaRepositoryConfigureSidecarResponseUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowed_commenter_type(value: String): Self = StObject.set(x, "allowed_commenter_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowed_commenter_typeUndefined: Self = StObject.set(x, "allowed_commenter_type", js.undefined)
      
      @scala.inline
      def setCan_boost_post(value: Boolean): Self = StObject.set(x, "can_boost_post", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_boost_postUndefined: Self = StObject.set(x, "can_boost_post", js.undefined)
      
      @scala.inline
      def setCan_see_organic_insights(value: Boolean): Self = StObject.set(x, "can_see_organic_insights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_see_organic_insightsUndefined: Self = StObject.set(x, "can_see_organic_insights", js.undefined)
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_pictureUndefined: Self = StObject.set(x, "has_anonymous_profile_picture", js.undefined)
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_unpublished(value: Boolean): Self = StObject.set(x, "is_unpublished", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_unpublishedUndefined: Self = StObject.set(x, "is_unpublished", js.undefined)
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verifiedUndefined: Self = StObject.set(x, "is_verified", js.undefined)
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReel_auto_archive(value: String): Self = StObject.set(x, "reel_auto_archive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReel_auto_archiveUndefined: Self = StObject.set(x, "reel_auto_archive", js.undefined)
      
      @scala.inline
      def setShow_insights_terms(value: Boolean): Self = StObject.set(x, "show_insights_terms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow_insights_termsUndefined: Self = StObject.set(x, "show_insights_terms", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaRepositoryConfigureSidecarResponseUsertags extends StObject {
    
    var in: js.Array[MediaRepositoryConfigureSidecarResponseInItem]
  }
  object MediaRepositoryConfigureSidecarResponseUsertags {
    
    @scala.inline
    def apply(in: js.Array[MediaRepositoryConfigureSidecarResponseInItem]): MediaRepositoryConfigureSidecarResponseUsertags = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseUsertags]
    }
    
    @scala.inline
    implicit class MediaRepositoryConfigureSidecarResponseUsertagsMutableBuilder[Self <: MediaRepositoryConfigureSidecarResponseUsertags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIn(value: js.Array[MediaRepositoryConfigureSidecarResponseInItem]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInVarargs(value: MediaRepositoryConfigureSidecarResponseInItem*): Self = StObject.set(x, "in", js.Array(value :_*))
    }
  }
  
  trait MediaRepositoryConfigureSidecarResponseVideoVersionsItem extends StObject {
    
    var height: Double
    
    var id: String
    
    var `type`: Double
    
    var url: String
    
    var width: Double
  }
  object MediaRepositoryConfigureSidecarResponseVideoVersionsItem {
    
    @scala.inline
    def apply(height: Double, id: String, `type`: Double, url: String, width: Double): MediaRepositoryConfigureSidecarResponseVideoVersionsItem = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseVideoVersionsItem]
    }
    
    @scala.inline
    implicit class MediaRepositoryConfigureSidecarResponseVideoVersionsItemMutableBuilder[Self <: MediaRepositoryConfigureSidecarResponseVideoVersionsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
