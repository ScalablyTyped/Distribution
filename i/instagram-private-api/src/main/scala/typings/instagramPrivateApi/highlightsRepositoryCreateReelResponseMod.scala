package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlightsRepositoryCreateReelResponseMod {
  
  trait HighlightsRepositoryCreateReelResponseCandidatesItem extends StObject {
    
    var estimated_scans_sizes: js.Array[Double]
    
    var height: Double
    
    var url: String
    
    var width: Double
  }
  object HighlightsRepositoryCreateReelResponseCandidatesItem {
    
    @scala.inline
    def apply(estimated_scans_sizes: js.Array[Double], height: Double, url: String, width: Double): HighlightsRepositoryCreateReelResponseCandidatesItem = {
      val __obj = js.Dynamic.literal(estimated_scans_sizes = estimated_scans_sizes.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightsRepositoryCreateReelResponseCandidatesItem]
    }
    
    @scala.inline
    implicit class HighlightsRepositoryCreateReelResponseCandidatesItemMutableBuilder[Self <: HighlightsRepositoryCreateReelResponseCandidatesItem] (val x: Self) extends AnyVal {
      
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
  
  trait HighlightsRepositoryCreateReelResponseCoverMedia extends StObject {
    
    var crop_rect: Null
    
    var cropped_image_version: HighlightsRepositoryCreateReelResponseCroppedImageVersion
    
    var full_image_version: HighlightsRepositoryCreateReelResponseFullImageVersion
    
    var media_id: String
  }
  object HighlightsRepositoryCreateReelResponseCoverMedia {
    
    @scala.inline
    def apply(
      crop_rect: Null,
      cropped_image_version: HighlightsRepositoryCreateReelResponseCroppedImageVersion,
      full_image_version: HighlightsRepositoryCreateReelResponseFullImageVersion,
      media_id: String
    ): HighlightsRepositoryCreateReelResponseCoverMedia = {
      val __obj = js.Dynamic.literal(crop_rect = crop_rect.asInstanceOf[js.Any], cropped_image_version = cropped_image_version.asInstanceOf[js.Any], full_image_version = full_image_version.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightsRepositoryCreateReelResponseCoverMedia]
    }
    
    @scala.inline
    implicit class HighlightsRepositoryCreateReelResponseCoverMediaMutableBuilder[Self <: HighlightsRepositoryCreateReelResponseCoverMedia] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrop_rect(value: Null): Self = StObject.set(x, "crop_rect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropped_image_version(value: HighlightsRepositoryCreateReelResponseCroppedImageVersion): Self = StObject.set(x, "cropped_image_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_image_version(value: HighlightsRepositoryCreateReelResponseFullImageVersion): Self = StObject.set(x, "full_image_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait HighlightsRepositoryCreateReelResponseCroppedImageVersion extends StObject {
    
    var estimated_scans_sizes: js.Array[Double]
    
    var height: Double
    
    var url: String
    
    var width: Double
  }
  object HighlightsRepositoryCreateReelResponseCroppedImageVersion {
    
    @scala.inline
    def apply(estimated_scans_sizes: js.Array[Double], height: Double, url: String, width: Double): HighlightsRepositoryCreateReelResponseCroppedImageVersion = {
      val __obj = js.Dynamic.literal(estimated_scans_sizes = estimated_scans_sizes.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightsRepositoryCreateReelResponseCroppedImageVersion]
    }
    
    @scala.inline
    implicit class HighlightsRepositoryCreateReelResponseCroppedImageVersionMutableBuilder[Self <: HighlightsRepositoryCreateReelResponseCroppedImageVersion] (val x: Self) extends AnyVal {
      
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
  
  trait HighlightsRepositoryCreateReelResponseFullImageVersion extends StObject {
    
    var estimated_scans_sizes: js.Array[Double]
    
    var height: Double
    
    var url: String
    
    var width: Double
  }
  object HighlightsRepositoryCreateReelResponseFullImageVersion {
    
    @scala.inline
    def apply(estimated_scans_sizes: js.Array[Double], height: Double, url: String, width: Double): HighlightsRepositoryCreateReelResponseFullImageVersion = {
      val __obj = js.Dynamic.literal(estimated_scans_sizes = estimated_scans_sizes.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightsRepositoryCreateReelResponseFullImageVersion]
    }
    
    @scala.inline
    implicit class HighlightsRepositoryCreateReelResponseFullImageVersionMutableBuilder[Self <: HighlightsRepositoryCreateReelResponseFullImageVersion] (val x: Self) extends AnyVal {
      
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
  
  trait HighlightsRepositoryCreateReelResponseImageVersions2 extends StObject {
    
    var candidates: js.Array[HighlightsRepositoryCreateReelResponseCandidatesItem]
  }
  object HighlightsRepositoryCreateReelResponseImageVersions2 {
    
    @scala.inline
    def apply(candidates: js.Array[HighlightsRepositoryCreateReelResponseCandidatesItem]): HighlightsRepositoryCreateReelResponseImageVersions2 = {
      val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightsRepositoryCreateReelResponseImageVersions2]
    }
    
    @scala.inline
    implicit class HighlightsRepositoryCreateReelResponseImageVersions2MutableBuilder[Self <: HighlightsRepositoryCreateReelResponseImageVersions2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCandidates(value: js.Array[HighlightsRepositoryCreateReelResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCandidatesVarargs(value: HighlightsRepositoryCreateReelResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
    }
  }
  
  trait HighlightsRepositoryCreateReelResponseItemsItem extends StObject {
    
    var boost_unavailable_reason: String
    
    var boosted_status: String
    
    var can_reply: Boolean
    
    var can_reshare: Boolean
    
    var can_viewer_save: Boolean
    
    var caption: Null
    
    var caption_is_edited: Boolean
    
    var caption_position: Double
    
    var client_cache_key: String
    
    var code: String
    
    var device_timestamp: Double
    
    var filter_type: Double
    
    var has_audio: Boolean
    
    var has_shared_to_fb: Double
    
    var highlight_reel_ids: js.Array[String]
    
    var id: String
    
    var image_versions2: HighlightsRepositoryCreateReelResponseImageVersions2
    
    var imported_taken_at: Double
    
    var is_dash_eligible: Double
    
    var is_pride_media: Boolean
    
    var is_reel_media: Boolean
    
    var media_type: Double
    
    var multi_author_reel_names: js.Array[js.Any]
    
    var number_of_qualities: Double
    
    var organic_tracking_token: String
    
    var original_height: Double
    
    var original_width: Double
    
    var photo_of_you: Boolean
    
    var pk: String
    
    var show_one_tap_fb_share_tooltip: Boolean
    
    var story_is_saved_to_archive: Boolean
    
    var supports_reel_reactions: Boolean
    
    var taken_at: Double
    
    var timezone_offset: Double
    
    var total_viewer_count: Double
    
    var user: HighlightsRepositoryCreateReelResponseUser
    
    var video_codec: String
    
    var video_dash_manifest: String
    
    var video_duration: Double
    
    var video_versions: js.Array[HighlightsRepositoryCreateReelResponseVideoVersionsItem]
    
    var viewer_count: Double
    
    var viewer_cursor: Null
    
    var viewers: js.Array[js.Any]
  }
  object HighlightsRepositoryCreateReelResponseItemsItem {
    
    @scala.inline
    def apply(
      boost_unavailable_reason: String,
      boosted_status: String,
      can_reply: Boolean,
      can_reshare: Boolean,
      can_viewer_save: Boolean,
      caption: Null,
      caption_is_edited: Boolean,
      caption_position: Double,
      client_cache_key: String,
      code: String,
      device_timestamp: Double,
      filter_type: Double,
      has_audio: Boolean,
      has_shared_to_fb: Double,
      highlight_reel_ids: js.Array[String],
      id: String,
      image_versions2: HighlightsRepositoryCreateReelResponseImageVersions2,
      imported_taken_at: Double,
      is_dash_eligible: Double,
      is_pride_media: Boolean,
      is_reel_media: Boolean,
      media_type: Double,
      multi_author_reel_names: js.Array[js.Any],
      number_of_qualities: Double,
      organic_tracking_token: String,
      original_height: Double,
      original_width: Double,
      photo_of_you: Boolean,
      pk: String,
      show_one_tap_fb_share_tooltip: Boolean,
      story_is_saved_to_archive: Boolean,
      supports_reel_reactions: Boolean,
      taken_at: Double,
      timezone_offset: Double,
      total_viewer_count: Double,
      user: HighlightsRepositoryCreateReelResponseUser,
      video_codec: String,
      video_dash_manifest: String,
      video_duration: Double,
      video_versions: js.Array[HighlightsRepositoryCreateReelResponseVideoVersionsItem],
      viewer_count: Double,
      viewer_cursor: Null,
      viewers: js.Array[js.Any]
    ): HighlightsRepositoryCreateReelResponseItemsItem = {
      val __obj = js.Dynamic.literal(boost_unavailable_reason = boost_unavailable_reason.asInstanceOf[js.Any], boosted_status = boosted_status.asInstanceOf[js.Any], can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], caption_position = caption_position.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_audio = has_audio.asInstanceOf[js.Any], has_shared_to_fb = has_shared_to_fb.asInstanceOf[js.Any], highlight_reel_ids = highlight_reel_ids.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], imported_taken_at = imported_taken_at.asInstanceOf[js.Any], is_dash_eligible = is_dash_eligible.asInstanceOf[js.Any], is_pride_media = is_pride_media.asInstanceOf[js.Any], is_reel_media = is_reel_media.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], multi_author_reel_names = multi_author_reel_names.asInstanceOf[js.Any], number_of_qualities = number_of_qualities.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], show_one_tap_fb_share_tooltip = show_one_tap_fb_share_tooltip.asInstanceOf[js.Any], story_is_saved_to_archive = story_is_saved_to_archive.asInstanceOf[js.Any], supports_reel_reactions = supports_reel_reactions.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], timezone_offset = timezone_offset.asInstanceOf[js.Any], total_viewer_count = total_viewer_count.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], video_codec = video_codec.asInstanceOf[js.Any], video_dash_manifest = video_dash_manifest.asInstanceOf[js.Any], video_duration = video_duration.asInstanceOf[js.Any], video_versions = video_versions.asInstanceOf[js.Any], viewer_count = viewer_count.asInstanceOf[js.Any], viewer_cursor = viewer_cursor.asInstanceOf[js.Any], viewers = viewers.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightsRepositoryCreateReelResponseItemsItem]
    }
    
    @scala.inline
    implicit class HighlightsRepositoryCreateReelResponseItemsItemMutableBuilder[Self <: HighlightsRepositoryCreateReelResponseItemsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoost_unavailable_reason(value: String): Self = StObject.set(x, "boost_unavailable_reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoosted_status(value: String): Self = StObject.set(x, "boosted_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_reply(value: Boolean): Self = StObject.set(x, "can_reply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_reshare(value: Boolean): Self = StObject.set(x, "can_reshare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_viewer_save(value: Boolean): Self = StObject.set(x, "can_viewer_save", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption(value: Null): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption_is_edited(value: Boolean): Self = StObject.set(x, "caption_is_edited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption_position(value: Double): Self = StObject.set(x, "caption_position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_cache_key(value: String): Self = StObject.set(x, "client_cache_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevice_timestamp(value: Double): Self = StObject.set(x, "device_timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_type(value: Double): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_audio(value: Boolean): Self = StObject.set(x, "has_audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_shared_to_fb(value: Double): Self = StObject.set(x, "has_shared_to_fb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlight_reel_ids(value: js.Array[String]): Self = StObject.set(x, "highlight_reel_ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlight_reel_idsVarargs(value: String*): Self = StObject.set(x, "highlight_reel_ids", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage_versions2(value: HighlightsRepositoryCreateReelResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImported_taken_at(value: Double): Self = StObject.set(x, "imported_taken_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_dash_eligible(value: Double): Self = StObject.set(x, "is_dash_eligible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_pride_media(value: Boolean): Self = StObject.set(x, "is_pride_media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_reel_media(value: Boolean): Self = StObject.set(x, "is_reel_media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_type(value: Double): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMulti_author_reel_names(value: js.Array[js.Any]): Self = StObject.set(x, "multi_author_reel_names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMulti_author_reel_namesVarargs(value: js.Any*): Self = StObject.set(x, "multi_author_reel_names", js.Array(value :_*))
      
      @scala.inline
      def setNumber_of_qualities(value: Double): Self = StObject.set(x, "number_of_qualities", value.asInstanceOf[js.Any])
      
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
      def setShow_one_tap_fb_share_tooltip(value: Boolean): Self = StObject.set(x, "show_one_tap_fb_share_tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStory_is_saved_to_archive(value: Boolean): Self = StObject.set(x, "story_is_saved_to_archive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupports_reel_reactions(value: Boolean): Self = StObject.set(x, "supports_reel_reactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaken_at(value: Double): Self = StObject.set(x, "taken_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezone_offset(value: Double): Self = StObject.set(x, "timezone_offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_viewer_count(value: Double): Self = StObject.set(x, "total_viewer_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: HighlightsRepositoryCreateReelResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo_codec(value: String): Self = StObject.set(x, "video_codec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo_dash_manifest(value: String): Self = StObject.set(x, "video_dash_manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo_duration(value: Double): Self = StObject.set(x, "video_duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo_versions(value: js.Array[HighlightsRepositoryCreateReelResponseVideoVersionsItem]): Self = StObject.set(x, "video_versions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo_versionsVarargs(value: HighlightsRepositoryCreateReelResponseVideoVersionsItem*): Self = StObject.set(x, "video_versions", js.Array(value :_*))
      
      @scala.inline
      def setViewer_count(value: Double): Self = StObject.set(x, "viewer_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewer_cursor(value: Null): Self = StObject.set(x, "viewer_cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewers(value: js.Array[js.Any]): Self = StObject.set(x, "viewers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewersVarargs(value: js.Any*): Self = StObject.set(x, "viewers", js.Array(value :_*))
    }
  }
  
  trait HighlightsRepositoryCreateReelResponseReel extends StObject {
    
    var can_reply: Boolean
    
    var can_reshare: Boolean
    
    var contains_stitched_media_blocked_by_rm: Boolean
    
    var cover_media: HighlightsRepositoryCreateReelResponseCoverMedia
    
    var created_at: Double
    
    var has_pride_media: Boolean
    
    var id: String
    
    var items: js.Array[HighlightsRepositoryCreateReelResponseItemsItem]
    
    var latest_reel_media: Double
    
    var media_count: Double
    
    var prefetch_count: Double
    
    var ranked_position: Double
    
    var reel_type: String
    
    var seen: Null
    
    var seen_ranked_position: Double
    
    var title: String
    
    var user: HighlightsRepositoryCreateReelResponseUser
  }
  object HighlightsRepositoryCreateReelResponseReel {
    
    @scala.inline
    def apply(
      can_reply: Boolean,
      can_reshare: Boolean,
      contains_stitched_media_blocked_by_rm: Boolean,
      cover_media: HighlightsRepositoryCreateReelResponseCoverMedia,
      created_at: Double,
      has_pride_media: Boolean,
      id: String,
      items: js.Array[HighlightsRepositoryCreateReelResponseItemsItem],
      latest_reel_media: Double,
      media_count: Double,
      prefetch_count: Double,
      ranked_position: Double,
      reel_type: String,
      seen: Null,
      seen_ranked_position: Double,
      title: String,
      user: HighlightsRepositoryCreateReelResponseUser
    ): HighlightsRepositoryCreateReelResponseReel = {
      val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], contains_stitched_media_blocked_by_rm = contains_stitched_media_blocked_by_rm.asInstanceOf[js.Any], cover_media = cover_media.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], has_pride_media = has_pride_media.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], latest_reel_media = latest_reel_media.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], prefetch_count = prefetch_count.asInstanceOf[js.Any], ranked_position = ranked_position.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], seen = seen.asInstanceOf[js.Any], seen_ranked_position = seen_ranked_position.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightsRepositoryCreateReelResponseReel]
    }
    
    @scala.inline
    implicit class HighlightsRepositoryCreateReelResponseReelMutableBuilder[Self <: HighlightsRepositoryCreateReelResponseReel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCan_reply(value: Boolean): Self = StObject.set(x, "can_reply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_reshare(value: Boolean): Self = StObject.set(x, "can_reshare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContains_stitched_media_blocked_by_rm(value: Boolean): Self = StObject.set(x, "contains_stitched_media_blocked_by_rm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCover_media(value: HighlightsRepositoryCreateReelResponseCoverMedia): Self = StObject.set(x, "cover_media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_pride_media(value: Boolean): Self = StObject.set(x, "has_pride_media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[HighlightsRepositoryCreateReelResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: HighlightsRepositoryCreateReelResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLatest_reel_media(value: Double): Self = StObject.set(x, "latest_reel_media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_count(value: Double): Self = StObject.set(x, "media_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefetch_count(value: Double): Self = StObject.set(x, "prefetch_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRanked_position(value: Double): Self = StObject.set(x, "ranked_position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReel_type(value: String): Self = StObject.set(x, "reel_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeen(value: Null): Self = StObject.set(x, "seen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeen_ranked_position(value: Double): Self = StObject.set(x, "seen_ranked_position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: HighlightsRepositoryCreateReelResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait HighlightsRepositoryCreateReelResponseRootObject extends StObject {
    
    var reel: HighlightsRepositoryCreateReelResponseReel
    
    var status: String
  }
  object HighlightsRepositoryCreateReelResponseRootObject {
    
    @scala.inline
    def apply(reel: HighlightsRepositoryCreateReelResponseReel, status: String): HighlightsRepositoryCreateReelResponseRootObject = {
      val __obj = js.Dynamic.literal(reel = reel.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightsRepositoryCreateReelResponseRootObject]
    }
    
    @scala.inline
    implicit class HighlightsRepositoryCreateReelResponseRootObjectMutableBuilder[Self <: HighlightsRepositoryCreateReelResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReel(value: HighlightsRepositoryCreateReelResponseReel): Self = StObject.set(x, "reel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait HighlightsRepositoryCreateReelResponseUser extends StObject {
    
    var allowed_commenter_type: js.UndefOr[String] = js.undefined
    
    var can_boost_post: js.UndefOr[Boolean] = js.undefined
    
    var can_see_organic_insights: js.UndefOr[Boolean] = js.undefined
    
    var full_name: String
    
    var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.undefined
    
    var is_private: Boolean
    
    var is_unpublished: js.UndefOr[Boolean] = js.undefined
    
    var is_verified: Boolean
    
    var pk: Double
    
    var profile_pic_id: String
    
    var profile_pic_url: String
    
    var reel_auto_archive: js.UndefOr[String] = js.undefined
    
    var show_insights_terms: js.UndefOr[Boolean] = js.undefined
    
    var username: String
  }
  object HighlightsRepositoryCreateReelResponseUser {
    
    @scala.inline
    def apply(
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      username: String
    ): HighlightsRepositoryCreateReelResponseUser = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightsRepositoryCreateReelResponseUser]
    }
    
    @scala.inline
    implicit class HighlightsRepositoryCreateReelResponseUserMutableBuilder[Self <: HighlightsRepositoryCreateReelResponseUser] (val x: Self) extends AnyVal {
      
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
  
  trait HighlightsRepositoryCreateReelResponseVideoVersionsItem extends StObject {
    
    var height: Double
    
    var id: String
    
    var `type`: Double
    
    var url: String
    
    var width: Double
  }
  object HighlightsRepositoryCreateReelResponseVideoVersionsItem {
    
    @scala.inline
    def apply(height: Double, id: String, `type`: Double, url: String, width: Double): HighlightsRepositoryCreateReelResponseVideoVersionsItem = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightsRepositoryCreateReelResponseVideoVersionsItem]
    }
    
    @scala.inline
    implicit class HighlightsRepositoryCreateReelResponseVideoVersionsItemMutableBuilder[Self <: HighlightsRepositoryCreateReelResponseVideoVersionsItem] (val x: Self) extends AnyVal {
      
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
