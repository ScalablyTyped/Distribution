package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightsRepositoryEditReelResponseItemsItem extends StObject {
  
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
  
  var creative_config: js.UndefOr[HighlightsRepositoryEditReelResponseCreativeConfig] = js.undefined
  
  var device_timestamp: Double
  
  var fb_user_tags: js.UndefOr[HighlightsRepositoryEditReelResponseFbUserTags] = js.undefined
  
  var filter_type: Double
  
  var has_audio: js.UndefOr[Boolean] = js.undefined
  
  var has_shared_to_fb: Double
  
  var highlight_reel_ids: js.Array[String]
  
  var id: String
  
  var image_versions2: HighlightsRepositoryEditReelResponseImageVersions2
  
  var imported_taken_at: js.UndefOr[Double] = js.undefined
  
  var is_dash_eligible: js.UndefOr[Double] = js.undefined
  
  var is_pride_media: Boolean
  
  var is_reel_media: Boolean
  
  var media_type: Double
  
  var multi_author_reel_names: js.Array[js.Any]
  
  var number_of_qualities: js.UndefOr[Double] = js.undefined
  
  var organic_tracking_token: String
  
  var original_height: Double
  
  var original_width: Double
  
  var photo_of_you: Boolean
  
  var pk: String
  
  var show_one_tap_fb_share_tooltip: Boolean
  
  var story_is_saved_to_archive: Boolean
  
  var story_quiz_participant_infos: js.UndefOr[js.Array[HighlightsRepositoryEditReelResponseStoryQuizParticipantInfosItem]] = js.undefined
  
  var story_quizs: js.UndefOr[js.Array[HighlightsRepositoryEditReelResponseStoryQuizsItem]] = js.undefined
  
  var supports_reel_reactions: Boolean
  
  var taken_at: Double
  
  var timezone_offset: Double
  
  var total_viewer_count: Double
  
  var user: HighlightsRepositoryEditReelResponseUser
  
  var video_codec: js.UndefOr[String] = js.undefined
  
  var video_dash_manifest: js.UndefOr[String] = js.undefined
  
  var video_duration: js.UndefOr[Double] = js.undefined
  
  var video_versions: js.UndefOr[js.Array[HighlightsRepositoryEditReelResponseVideoVersionsItem]] = js.undefined
  
  var viewer_count: Double
  
  var viewer_cursor: Null
  
  var viewers: js.Array[js.Any]
}
object HighlightsRepositoryEditReelResponseItemsItem {
  
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
    has_shared_to_fb: Double,
    highlight_reel_ids: js.Array[String],
    id: String,
    image_versions2: HighlightsRepositoryEditReelResponseImageVersions2,
    is_pride_media: Boolean,
    is_reel_media: Boolean,
    media_type: Double,
    multi_author_reel_names: js.Array[js.Any],
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
    user: HighlightsRepositoryEditReelResponseUser,
    viewer_count: Double,
    viewer_cursor: Null,
    viewers: js.Array[js.Any]
  ): HighlightsRepositoryEditReelResponseItemsItem = {
    val __obj = js.Dynamic.literal(boost_unavailable_reason = boost_unavailable_reason.asInstanceOf[js.Any], boosted_status = boosted_status.asInstanceOf[js.Any], can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], caption_position = caption_position.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_shared_to_fb = has_shared_to_fb.asInstanceOf[js.Any], highlight_reel_ids = highlight_reel_ids.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], is_pride_media = is_pride_media.asInstanceOf[js.Any], is_reel_media = is_reel_media.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], multi_author_reel_names = multi_author_reel_names.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], show_one_tap_fb_share_tooltip = show_one_tap_fb_share_tooltip.asInstanceOf[js.Any], story_is_saved_to_archive = story_is_saved_to_archive.asInstanceOf[js.Any], supports_reel_reactions = supports_reel_reactions.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], timezone_offset = timezone_offset.asInstanceOf[js.Any], total_viewer_count = total_viewer_count.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], viewer_count = viewer_count.asInstanceOf[js.Any], viewer_cursor = viewer_cursor.asInstanceOf[js.Any], viewers = viewers.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseItemsItem]
  }
  
  @scala.inline
  implicit class HighlightsRepositoryEditReelResponseItemsItemMutableBuilder[Self <: HighlightsRepositoryEditReelResponseItemsItem] (val x: Self) extends AnyVal {
    
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
    def setCreative_config(value: HighlightsRepositoryEditReelResponseCreativeConfig): Self = StObject.set(x, "creative_config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreative_configUndefined: Self = StObject.set(x, "creative_config", js.undefined)
    
    @scala.inline
    def setDevice_timestamp(value: Double): Self = StObject.set(x, "device_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFb_user_tags(value: HighlightsRepositoryEditReelResponseFbUserTags): Self = StObject.set(x, "fb_user_tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFb_user_tagsUndefined: Self = StObject.set(x, "fb_user_tags", js.undefined)
    
    @scala.inline
    def setFilter_type(value: Double): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_audio(value: Boolean): Self = StObject.set(x, "has_audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_audioUndefined: Self = StObject.set(x, "has_audio", js.undefined)
    
    @scala.inline
    def setHas_shared_to_fb(value: Double): Self = StObject.set(x, "has_shared_to_fb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlight_reel_ids(value: js.Array[String]): Self = StObject.set(x, "highlight_reel_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlight_reel_idsVarargs(value: String*): Self = StObject.set(x, "highlight_reel_ids", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_versions2(value: HighlightsRepositoryEditReelResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImported_taken_at(value: Double): Self = StObject.set(x, "imported_taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImported_taken_atUndefined: Self = StObject.set(x, "imported_taken_at", js.undefined)
    
    @scala.inline
    def setIs_dash_eligible(value: Double): Self = StObject.set(x, "is_dash_eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_dash_eligibleUndefined: Self = StObject.set(x, "is_dash_eligible", js.undefined)
    
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
    def setShow_one_tap_fb_share_tooltip(value: Boolean): Self = StObject.set(x, "show_one_tap_fb_share_tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_is_saved_to_archive(value: Boolean): Self = StObject.set(x, "story_is_saved_to_archive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_quiz_participant_infos(value: js.Array[HighlightsRepositoryEditReelResponseStoryQuizParticipantInfosItem]): Self = StObject.set(x, "story_quiz_participant_infos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_quiz_participant_infosUndefined: Self = StObject.set(x, "story_quiz_participant_infos", js.undefined)
    
    @scala.inline
    def setStory_quiz_participant_infosVarargs(value: HighlightsRepositoryEditReelResponseStoryQuizParticipantInfosItem*): Self = StObject.set(x, "story_quiz_participant_infos", js.Array(value :_*))
    
    @scala.inline
    def setStory_quizs(value: js.Array[HighlightsRepositoryEditReelResponseStoryQuizsItem]): Self = StObject.set(x, "story_quizs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_quizsUndefined: Self = StObject.set(x, "story_quizs", js.undefined)
    
    @scala.inline
    def setStory_quizsVarargs(value: HighlightsRepositoryEditReelResponseStoryQuizsItem*): Self = StObject.set(x, "story_quizs", js.Array(value :_*))
    
    @scala.inline
    def setSupports_reel_reactions(value: Boolean): Self = StObject.set(x, "supports_reel_reactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaken_at(value: Double): Self = StObject.set(x, "taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezone_offset(value: Double): Self = StObject.set(x, "timezone_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_viewer_count(value: Double): Self = StObject.set(x, "total_viewer_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: HighlightsRepositoryEditReelResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
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
    def setVideo_versions(value: js.Array[HighlightsRepositoryEditReelResponseVideoVersionsItem]): Self = StObject.set(x, "video_versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_versionsUndefined: Self = StObject.set(x, "video_versions", js.undefined)
    
    @scala.inline
    def setVideo_versionsVarargs(value: HighlightsRepositoryEditReelResponseVideoVersionsItem*): Self = StObject.set(x, "video_versions", js.Array(value :_*))
    
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
