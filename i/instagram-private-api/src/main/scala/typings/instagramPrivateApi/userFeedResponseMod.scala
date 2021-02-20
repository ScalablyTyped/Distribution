package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userFeedResponseMod {
  
  @js.native
  trait UserFeedResponse extends StObject {
    
    var auto_load_more_enabled: Boolean = js.native
    
    var items: js.Array[UserFeedResponseItemsItem] = js.native
    
    var more_available: Boolean = js.native
    
    var next_max_id: String = js.native
    
    var num_results: Double = js.native
    
    var status: String = js.native
  }
  object UserFeedResponse {
    
    @scala.inline
    def apply(
      auto_load_more_enabled: Boolean,
      items: js.Array[UserFeedResponseItemsItem],
      more_available: Boolean,
      next_max_id: String,
      num_results: Double,
      status: String
    ): UserFeedResponse = {
      val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserFeedResponse]
    }
    
    @scala.inline
    implicit class UserFeedResponseMutableBuilder[Self <: UserFeedResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuto_load_more_enabled(value: Boolean): Self = StObject.set(x, "auto_load_more_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[UserFeedResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: UserFeedResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_results(value: Double): Self = StObject.set(x, "num_results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserFeedResponseCandidatesItem extends StObject {
    
    var height: Double = js.native
    
    var url: String = js.native
    
    var width: Double = js.native
  }
  object UserFeedResponseCandidatesItem {
    
    @scala.inline
    def apply(height: Double, url: String, width: Double): UserFeedResponseCandidatesItem = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserFeedResponseCandidatesItem]
    }
    
    @scala.inline
    implicit class UserFeedResponseCandidatesItemMutableBuilder[Self <: UserFeedResponseCandidatesItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserFeedResponseCaption extends StObject {
    
    var bit_flags: Double = js.native
    
    var content_type: String = js.native
    
    var created_at: Double = js.native
    
    var created_at_utc: Double = js.native
    
    var did_report_as_spam: Boolean = js.native
    
    var has_translation: Boolean = js.native
    
    var media_id: String = js.native
    
    var pk: String = js.native
    
    var share_enabled: Boolean = js.native
    
    var status: String = js.native
    
    var text: String = js.native
    
    var `type`: Double = js.native
    
    var user: UserFeedResponseUser = js.native
    
    var user_id: Double = js.native
  }
  object UserFeedResponseCaption {
    
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
      user: UserFeedResponseUser,
      user_id: Double
    ): UserFeedResponseCaption = {
      val __obj = js.Dynamic.literal(bit_flags = bit_flags.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], did_report_as_spam = did_report_as_spam.asInstanceOf[js.Any], has_translation = has_translation.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserFeedResponseCaption]
    }
    
    @scala.inline
    implicit class UserFeedResponseCaptionMutableBuilder[Self <: UserFeedResponseCaption] (val x: Self) extends AnyVal {
      
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
      def setUser(value: UserFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserFeedResponseCarouselMediaItem extends StObject {
    
    var carousel_parent_id: String = js.native
    
    var fb_user_tags: UserFeedResponseFbUserTags = js.native
    
    var id: String = js.native
    
    var image_versions2: UserFeedResponseImageVersions2 = js.native
    
    var media_type: Double = js.native
    
    var original_height: Double = js.native
    
    var original_width: Double = js.native
    
    var pk: String = js.native
  }
  object UserFeedResponseCarouselMediaItem {
    
    @scala.inline
    def apply(
      carousel_parent_id: String,
      fb_user_tags: UserFeedResponseFbUserTags,
      id: String,
      image_versions2: UserFeedResponseImageVersions2,
      media_type: Double,
      original_height: Double,
      original_width: Double,
      pk: String
    ): UserFeedResponseCarouselMediaItem = {
      val __obj = js.Dynamic.literal(carousel_parent_id = carousel_parent_id.asInstanceOf[js.Any], fb_user_tags = fb_user_tags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserFeedResponseCarouselMediaItem]
    }
    
    @scala.inline
    implicit class UserFeedResponseCarouselMediaItemMutableBuilder[Self <: UserFeedResponseCarouselMediaItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCarousel_parent_id(value: String): Self = StObject.set(x, "carousel_parent_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFb_user_tags(value: UserFeedResponseFbUserTags): Self = StObject.set(x, "fb_user_tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage_versions2(value: UserFeedResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_type(value: Double): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginal_height(value: Double): Self = StObject.set(x, "original_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginal_width(value: Double): Self = StObject.set(x, "original_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserFeedResponseFacepileTopLikersItem extends StObject {
    
    var full_name: String = js.native
    
    var is_private: Boolean = js.native
    
    var is_verified: Boolean = js.native
    
    var pk: Double = js.native
    
    var profile_pic_id: js.UndefOr[String] = js.native
    
    var profile_pic_url: String = js.native
    
    var username: String = js.native
  }
  object UserFeedResponseFacepileTopLikersItem {
    
    @scala.inline
    def apply(
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_url: String,
      username: String
    ): UserFeedResponseFacepileTopLikersItem = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserFeedResponseFacepileTopLikersItem]
    }
    
    @scala.inline
    implicit class UserFeedResponseFacepileTopLikersItemMutableBuilder[Self <: UserFeedResponseFacepileTopLikersItem] (val x: Self) extends AnyVal {
      
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
  
  @js.native
  trait UserFeedResponseFbUserTags extends StObject {
    
    var in: js.Array[_] = js.native
  }
  object UserFeedResponseFbUserTags {
    
    @scala.inline
    def apply(in: js.Array[_]): UserFeedResponseFbUserTags = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserFeedResponseFbUserTags]
    }
    
    @scala.inline
    implicit class UserFeedResponseFbUserTagsMutableBuilder[Self <: UserFeedResponseFbUserTags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIn(value: js.Array[_]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInVarargs(value: js.Any*): Self = StObject.set(x, "in", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UserFeedResponseImageVersions2 extends StObject {
    
    var candidates: js.Array[UserFeedResponseCandidatesItem] = js.native
  }
  object UserFeedResponseImageVersions2 {
    
    @scala.inline
    def apply(candidates: js.Array[UserFeedResponseCandidatesItem]): UserFeedResponseImageVersions2 = {
      val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserFeedResponseImageVersions2]
    }
    
    @scala.inline
    implicit class UserFeedResponseImageVersions2MutableBuilder[Self <: UserFeedResponseImageVersions2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCandidates(value: js.Array[UserFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCandidatesVarargs(value: UserFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UserFeedResponseItemsItem extends StObject {
    
    var can_see_insights_as_brand: js.UndefOr[Boolean] = js.native
    
    var can_view_more_preview_comments: Boolean = js.native
    
    var can_viewer_reshare: Boolean = js.native
    
    var can_viewer_save: Boolean = js.native
    
    var caption: Null | UserFeedResponseCaption = js.native
    
    var caption_is_edited: Boolean = js.native
    
    var carousel_media: js.UndefOr[js.Array[UserFeedResponseCarouselMediaItem]] = js.native
    
    var carousel_media_count: js.UndefOr[Double] = js.native
    
    var client_cache_key: String = js.native
    
    var code: String = js.native
    
    var comment_count: Double = js.native
    
    var comment_likes_enabled: Boolean = js.native
    
    var comment_threading_enabled: Boolean = js.native
    
    var device_timestamp: String | Double = js.native
    
    var direct_reply_to_author_enabled: Boolean = js.native
    
    var facepile_top_likers: js.UndefOr[js.Array[UserFeedResponseFacepileTopLikersItem]] = js.native
    
    var fb_user_tags: js.UndefOr[UserFeedResponseFbUserTags] = js.native
    
    var filter_type: Double = js.native
    
    var has_audio: js.UndefOr[Boolean] = js.native
    
    var has_liked: Boolean = js.native
    
    var has_more_comments: Boolean = js.native
    
    var id: String = js.native
    
    var image_versions2: UserFeedResponseImageVersions2 = js.native
    
    var inline_composer_display_condition: String = js.native
    
    var inline_composer_imp_trigger_time: Double = js.native
    
    var is_dash_eligible: js.UndefOr[Double] = js.native
    
    var like_count: Double = js.native
    
    var max_num_visible_preview_comments: Double = js.native
    
    var media_type: Double = js.native
    
    var next_max_id: js.UndefOr[String] = js.native
    
    var number_of_qualities: js.UndefOr[Double] = js.native
    
    var organic_tracking_token: String = js.native
    
    var original_height: Double = js.native
    
    var original_width: Double = js.native
    
    var photo_of_you: Boolean = js.native
    
    var pk: String = js.native
    
    var preview_comments: js.Array[UserFeedResponsePreviewCommentsItem] = js.native
    
    var taken_at: Double = js.native
    
    var top_likers: js.Array[String] = js.native
    
    var user: UserFeedResponseUser = js.native
    
    var video_codec: js.UndefOr[String] = js.native
    
    var video_dash_manifest: js.UndefOr[String] = js.native
    
    var video_duration: js.UndefOr[Double] = js.native
    
    var video_versions: js.UndefOr[js.Array[UserFeedResponseVideoVersionsItem]] = js.native
    
    var view_count: js.UndefOr[Double] = js.native
  }
  object UserFeedResponseItemsItem {
    
    @scala.inline
    def apply(
      can_view_more_preview_comments: Boolean,
      can_viewer_reshare: Boolean,
      can_viewer_save: Boolean,
      caption_is_edited: Boolean,
      client_cache_key: String,
      code: String,
      comment_count: Double,
      comment_likes_enabled: Boolean,
      comment_threading_enabled: Boolean,
      device_timestamp: String | Double,
      direct_reply_to_author_enabled: Boolean,
      filter_type: Double,
      has_liked: Boolean,
      has_more_comments: Boolean,
      id: String,
      image_versions2: UserFeedResponseImageVersions2,
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
      preview_comments: js.Array[UserFeedResponsePreviewCommentsItem],
      taken_at: Double,
      top_likers: js.Array[String],
      user: UserFeedResponseUser
    ): UserFeedResponseItemsItem = {
      val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_reshare = can_viewer_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], direct_reply_to_author_enabled = direct_reply_to_author_enabled.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], inline_composer_display_condition = inline_composer_display_condition.asInstanceOf[js.Any], inline_composer_imp_trigger_time = inline_composer_imp_trigger_time.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], top_likers = top_likers.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserFeedResponseItemsItem]
    }
    
    @scala.inline
    implicit class UserFeedResponseItemsItemMutableBuilder[Self <: UserFeedResponseItemsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCan_see_insights_as_brand(value: Boolean): Self = StObject.set(x, "can_see_insights_as_brand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_see_insights_as_brandUndefined: Self = StObject.set(x, "can_see_insights_as_brand", js.undefined)
      
      @scala.inline
      def setCan_view_more_preview_comments(value: Boolean): Self = StObject.set(x, "can_view_more_preview_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_viewer_reshare(value: Boolean): Self = StObject.set(x, "can_viewer_reshare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_viewer_save(value: Boolean): Self = StObject.set(x, "can_viewer_save", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption(value: UserFeedResponseCaption): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionNull: Self = StObject.set(x, "caption", null)
      
      @scala.inline
      def setCaption_is_edited(value: Boolean): Self = StObject.set(x, "caption_is_edited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarousel_media(value: js.Array[UserFeedResponseCarouselMediaItem]): Self = StObject.set(x, "carousel_media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarousel_mediaUndefined: Self = StObject.set(x, "carousel_media", js.undefined)
      
      @scala.inline
      def setCarousel_mediaVarargs(value: UserFeedResponseCarouselMediaItem*): Self = StObject.set(x, "carousel_media", js.Array(value :_*))
      
      @scala.inline
      def setCarousel_media_count(value: Double): Self = StObject.set(x, "carousel_media_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarousel_media_countUndefined: Self = StObject.set(x, "carousel_media_count", js.undefined)
      
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
      def setDevice_timestamp(value: String | Double): Self = StObject.set(x, "device_timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirect_reply_to_author_enabled(value: Boolean): Self = StObject.set(x, "direct_reply_to_author_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacepile_top_likers(value: js.Array[UserFeedResponseFacepileTopLikersItem]): Self = StObject.set(x, "facepile_top_likers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacepile_top_likersUndefined: Self = StObject.set(x, "facepile_top_likers", js.undefined)
      
      @scala.inline
      def setFacepile_top_likersVarargs(value: UserFeedResponseFacepileTopLikersItem*): Self = StObject.set(x, "facepile_top_likers", js.Array(value :_*))
      
      @scala.inline
      def setFb_user_tags(value: UserFeedResponseFbUserTags): Self = StObject.set(x, "fb_user_tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFb_user_tagsUndefined: Self = StObject.set(x, "fb_user_tags", js.undefined)
      
      @scala.inline
      def setFilter_type(value: Double): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_audio(value: Boolean): Self = StObject.set(x, "has_audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_audioUndefined: Self = StObject.set(x, "has_audio", js.undefined)
      
      @scala.inline
      def setHas_liked(value: Boolean): Self = StObject.set(x, "has_liked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_more_comments(value: Boolean): Self = StObject.set(x, "has_more_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage_versions2(value: UserFeedResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInline_composer_display_condition(value: String): Self = StObject.set(x, "inline_composer_display_condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInline_composer_imp_trigger_time(value: Double): Self = StObject.set(x, "inline_composer_imp_trigger_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_dash_eligible(value: Double): Self = StObject.set(x, "is_dash_eligible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_dash_eligibleUndefined: Self = StObject.set(x, "is_dash_eligible", js.undefined)
      
      @scala.inline
      def setLike_count(value: Double): Self = StObject.set(x, "like_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_num_visible_preview_comments(value: Double): Self = StObject.set(x, "max_num_visible_preview_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_type(value: Double): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_max_idUndefined: Self = StObject.set(x, "next_max_id", js.undefined)
      
      @scala.inline
      def setNumber_of_qualities(value: Double): Self = StObject.set(x, "number_of_qualities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber_of_qualitiesUndefined: Self = StObject.set(x, "number_of_qualities", js.undefined)
      
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
      def setPreview_comments(value: js.Array[UserFeedResponsePreviewCommentsItem]): Self = StObject.set(x, "preview_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreview_commentsVarargs(value: UserFeedResponsePreviewCommentsItem*): Self = StObject.set(x, "preview_comments", js.Array(value :_*))
      
      @scala.inline
      def setTaken_at(value: Double): Self = StObject.set(x, "taken_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop_likers(value: js.Array[String]): Self = StObject.set(x, "top_likers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop_likersVarargs(value: String*): Self = StObject.set(x, "top_likers", js.Array(value :_*))
      
      @scala.inline
      def setUser(value: UserFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo_codec(value: String): Self = StObject.set(x, "video_codec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo_codecUndefined: Self = StObject.set(x, "video_codec", js.undefined)
      
      @scala.inline
      def setVideo_dash_manifest(value: String): Self = StObject.set(x, "video_dash_manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo_dash_manifestUndefined: Self = StObject.set(x, "video_dash_manifest", js.undefined)
      
      @scala.inline
      def setVideo_duration(value: Double): Self = StObject.set(x, "video_duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo_durationUndefined: Self = StObject.set(x, "video_duration", js.undefined)
      
      @scala.inline
      def setVideo_versions(value: js.Array[UserFeedResponseVideoVersionsItem]): Self = StObject.set(x, "video_versions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo_versionsUndefined: Self = StObject.set(x, "video_versions", js.undefined)
      
      @scala.inline
      def setVideo_versionsVarargs(value: UserFeedResponseVideoVersionsItem*): Self = StObject.set(x, "video_versions", js.Array(value :_*))
      
      @scala.inline
      def setView_count(value: Double): Self = StObject.set(x, "view_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView_countUndefined: Self = StObject.set(x, "view_count", js.undefined)
    }
  }
  
  @js.native
  trait UserFeedResponsePreviewCommentsItem extends StObject {
    
    var bit_flags: Double = js.native
    
    var comment_like_count: Double = js.native
    
    var content_type: String = js.native
    
    var created_at: Double = js.native
    
    var created_at_utc: Double = js.native
    
    var did_report_as_spam: Boolean = js.native
    
    var has_liked_comment: Boolean = js.native
    
    var has_translation: js.UndefOr[Boolean] = js.native
    
    var media_id: String = js.native
    
    var pk: String = js.native
    
    var share_enabled: Boolean = js.native
    
    var status: String = js.native
    
    var text: String = js.native
    
    var `type`: Double = js.native
    
    var user: UserFeedResponseUser = js.native
    
    var user_id: Double = js.native
  }
  object UserFeedResponsePreviewCommentsItem {
    
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
      user: UserFeedResponseUser,
      user_id: Double
    ): UserFeedResponsePreviewCommentsItem = {
      val __obj = js.Dynamic.literal(bit_flags = bit_flags.asInstanceOf[js.Any], comment_like_count = comment_like_count.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], did_report_as_spam = did_report_as_spam.asInstanceOf[js.Any], has_liked_comment = has_liked_comment.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserFeedResponsePreviewCommentsItem]
    }
    
    @scala.inline
    implicit class UserFeedResponsePreviewCommentsItemMutableBuilder[Self <: UserFeedResponsePreviewCommentsItem] (val x: Self) extends AnyVal {
      
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
      def setUser(value: UserFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserFeedResponseUser extends StObject {
    
    var allowed_commenter_type: js.UndefOr[String] = js.native
    
    var can_boost_post: js.UndefOr[Boolean] = js.native
    
    var can_see_organic_insights: js.UndefOr[Boolean] = js.native
    
    var full_name: String = js.native
    
    var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.native
    
    var is_private: Boolean = js.native
    
    var is_unpublished: js.UndefOr[Boolean] = js.native
    
    var is_verified: Boolean = js.native
    
    var pk: Double = js.native
    
    var profile_pic_id: js.UndefOr[String] = js.native
    
    var profile_pic_url: String = js.native
    
    var reel_auto_archive: js.UndefOr[String] = js.native
    
    var show_insights_terms: js.UndefOr[Boolean] = js.native
    
    var username: String = js.native
  }
  object UserFeedResponseUser {
    
    @scala.inline
    def apply(
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_url: String,
      username: String
    ): UserFeedResponseUser = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserFeedResponseUser]
    }
    
    @scala.inline
    implicit class UserFeedResponseUserMutableBuilder[Self <: UserFeedResponseUser] (val x: Self) extends AnyVal {
      
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
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_idUndefined: Self = StObject.set(x, "profile_pic_id", js.undefined)
      
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
  
  @js.native
  trait UserFeedResponseVideoVersionsItem extends StObject {
    
    var height: Double = js.native
    
    var id: String = js.native
    
    var `type`: Double = js.native
    
    var url: String = js.native
    
    var width: Double = js.native
  }
  object UserFeedResponseVideoVersionsItem {
    
    @scala.inline
    def apply(height: Double, id: String, `type`: Double, url: String, width: Double): UserFeedResponseVideoVersionsItem = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserFeedResponseVideoVersionsItem]
    }
    
    @scala.inline
    implicit class UserFeedResponseVideoVersionsItemMutableBuilder[Self <: UserFeedResponseVideoVersionsItem] (val x: Self) extends AnyVal {
      
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
