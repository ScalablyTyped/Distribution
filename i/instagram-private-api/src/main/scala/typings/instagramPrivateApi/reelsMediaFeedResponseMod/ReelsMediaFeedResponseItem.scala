package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsMediaFeedResponseItem extends StObject {
  
  var ad_action: js.UndefOr[String] = js.undefined
  
  var can_reply: Boolean
  
  var can_reshare: Boolean
  
  var can_viewer_save: Boolean
  
  var caption: Null
  
  var caption_is_edited: Boolean
  
  var caption_position: Double
  
  var client_cache_key: String
  
  var code: String
  
  var device_timestamp: String
  
  var expiring_at: Double
  
  var filter_type: Double
  
  var has_audio: Boolean
  
  var has_shared_to_fb: Double
  
  var id: String
  
  var image_versions2: ReelsMediaFeedResponseImageVersions2
  
  var imported_taken_at: js.UndefOr[Double] = js.undefined
  
  var is_dash_eligible: Double
  
  var is_reel_media: Boolean
  
  var link_text: js.UndefOr[String] = js.undefined
  
  var media_type: Double
  
  var number_of_qualities: Double
  
  var organic_tracking_token: String
  
  var original_height: Double
  
  var original_width: Double
  
  var photo_of_you: Boolean
  
  var pk: String
  
  var reel_mentions: js.UndefOr[js.Array[ReelsMediaFeedResponseReelMentionsItem]] = js.undefined
  
  var show_one_tap_fb_share_tooltip: Boolean
  
  var story_countdowns: js.UndefOr[js.Array[ReelsMediaFeedResponseStoryCountdownsItem]] = js.undefined
  
  var story_cta: js.UndefOr[js.Array[ReelsMediaFeedResponseStoryCtaItem]] = js.undefined
  
  var story_polls: js.UndefOr[js.Array[ReelsMediaFeedResponseStoryPollsItem]] = js.undefined
  
  var story_questions: js.UndefOr[js.Array[ReelsMediaFeedResponseStoryQuestionsItem]] = js.undefined
  
  var story_quizs: js.UndefOr[js.Array[ReelsMediaFeedResponseStoryQuizsItem]] = js.undefined
  
  var story_sliders: js.UndefOr[js.Array[ReelsMediaFeedResponseStorySlidersItem]] = js.undefined
  
  var supports_reel_reactions: Boolean
  
  var taken_at: Double
  
  var user: ReelsMediaFeedResponseUser
  
  var video_codec: String
  
  var video_dash_manifest: String
  
  var video_duration: Double
  
  var video_versions: js.Array[ReelsMediaFeedResponseVideoVersionsItem]
}
object ReelsMediaFeedResponseItem {
  
  inline def apply(
    can_reply: Boolean,
    can_reshare: Boolean,
    can_viewer_save: Boolean,
    caption: Null,
    caption_is_edited: Boolean,
    caption_position: Double,
    client_cache_key: String,
    code: String,
    device_timestamp: String,
    expiring_at: Double,
    filter_type: Double,
    has_audio: Boolean,
    has_shared_to_fb: Double,
    id: String,
    image_versions2: ReelsMediaFeedResponseImageVersions2,
    is_dash_eligible: Double,
    is_reel_media: Boolean,
    media_type: Double,
    number_of_qualities: Double,
    organic_tracking_token: String,
    original_height: Double,
    original_width: Double,
    photo_of_you: Boolean,
    pk: String,
    show_one_tap_fb_share_tooltip: Boolean,
    supports_reel_reactions: Boolean,
    taken_at: Double,
    user: ReelsMediaFeedResponseUser,
    video_codec: String,
    video_dash_manifest: String,
    video_duration: Double,
    video_versions: js.Array[ReelsMediaFeedResponseVideoVersionsItem]
  ): ReelsMediaFeedResponseItem = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], caption_position = caption_position.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], expiring_at = expiring_at.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_audio = has_audio.asInstanceOf[js.Any], has_shared_to_fb = has_shared_to_fb.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], is_dash_eligible = is_dash_eligible.asInstanceOf[js.Any], is_reel_media = is_reel_media.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], number_of_qualities = number_of_qualities.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], show_one_tap_fb_share_tooltip = show_one_tap_fb_share_tooltip.asInstanceOf[js.Any], supports_reel_reactions = supports_reel_reactions.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], video_codec = video_codec.asInstanceOf[js.Any], video_dash_manifest = video_dash_manifest.asInstanceOf[js.Any], video_duration = video_duration.asInstanceOf[js.Any], video_versions = video_versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseItem]
  }
  
  extension [Self <: ReelsMediaFeedResponseItem](x: Self) {
    
    inline def setAd_action(value: String): Self = StObject.set(x, "ad_action", value.asInstanceOf[js.Any])
    
    inline def setAd_actionUndefined: Self = StObject.set(x, "ad_action", js.undefined)
    
    inline def setCan_reply(value: Boolean): Self = StObject.set(x, "can_reply", value.asInstanceOf[js.Any])
    
    inline def setCan_reshare(value: Boolean): Self = StObject.set(x, "can_reshare", value.asInstanceOf[js.Any])
    
    inline def setCan_viewer_save(value: Boolean): Self = StObject.set(x, "can_viewer_save", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: Null): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaption_is_edited(value: Boolean): Self = StObject.set(x, "caption_is_edited", value.asInstanceOf[js.Any])
    
    inline def setCaption_position(value: Double): Self = StObject.set(x, "caption_position", value.asInstanceOf[js.Any])
    
    inline def setClient_cache_key(value: String): Self = StObject.set(x, "client_cache_key", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDevice_timestamp(value: String): Self = StObject.set(x, "device_timestamp", value.asInstanceOf[js.Any])
    
    inline def setExpiring_at(value: Double): Self = StObject.set(x, "expiring_at", value.asInstanceOf[js.Any])
    
    inline def setFilter_type(value: Double): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
    
    inline def setHas_audio(value: Boolean): Self = StObject.set(x, "has_audio", value.asInstanceOf[js.Any])
    
    inline def setHas_shared_to_fb(value: Double): Self = StObject.set(x, "has_shared_to_fb", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage_versions2(value: ReelsMediaFeedResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
    
    inline def setImported_taken_at(value: Double): Self = StObject.set(x, "imported_taken_at", value.asInstanceOf[js.Any])
    
    inline def setImported_taken_atUndefined: Self = StObject.set(x, "imported_taken_at", js.undefined)
    
    inline def setIs_dash_eligible(value: Double): Self = StObject.set(x, "is_dash_eligible", value.asInstanceOf[js.Any])
    
    inline def setIs_reel_media(value: Boolean): Self = StObject.set(x, "is_reel_media", value.asInstanceOf[js.Any])
    
    inline def setLink_text(value: String): Self = StObject.set(x, "link_text", value.asInstanceOf[js.Any])
    
    inline def setLink_textUndefined: Self = StObject.set(x, "link_text", js.undefined)
    
    inline def setMedia_type(value: Double): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_qualities(value: Double): Self = StObject.set(x, "number_of_qualities", value.asInstanceOf[js.Any])
    
    inline def setOrganic_tracking_token(value: String): Self = StObject.set(x, "organic_tracking_token", value.asInstanceOf[js.Any])
    
    inline def setOriginal_height(value: Double): Self = StObject.set(x, "original_height", value.asInstanceOf[js.Any])
    
    inline def setOriginal_width(value: Double): Self = StObject.set(x, "original_width", value.asInstanceOf[js.Any])
    
    inline def setPhoto_of_you(value: Boolean): Self = StObject.set(x, "photo_of_you", value.asInstanceOf[js.Any])
    
    inline def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    inline def setReel_mentions(value: js.Array[ReelsMediaFeedResponseReelMentionsItem]): Self = StObject.set(x, "reel_mentions", value.asInstanceOf[js.Any])
    
    inline def setReel_mentionsUndefined: Self = StObject.set(x, "reel_mentions", js.undefined)
    
    inline def setReel_mentionsVarargs(value: ReelsMediaFeedResponseReelMentionsItem*): Self = StObject.set(x, "reel_mentions", js.Array(value :_*))
    
    inline def setShow_one_tap_fb_share_tooltip(value: Boolean): Self = StObject.set(x, "show_one_tap_fb_share_tooltip", value.asInstanceOf[js.Any])
    
    inline def setStory_countdowns(value: js.Array[ReelsMediaFeedResponseStoryCountdownsItem]): Self = StObject.set(x, "story_countdowns", value.asInstanceOf[js.Any])
    
    inline def setStory_countdownsUndefined: Self = StObject.set(x, "story_countdowns", js.undefined)
    
    inline def setStory_countdownsVarargs(value: ReelsMediaFeedResponseStoryCountdownsItem*): Self = StObject.set(x, "story_countdowns", js.Array(value :_*))
    
    inline def setStory_cta(value: js.Array[ReelsMediaFeedResponseStoryCtaItem]): Self = StObject.set(x, "story_cta", value.asInstanceOf[js.Any])
    
    inline def setStory_ctaUndefined: Self = StObject.set(x, "story_cta", js.undefined)
    
    inline def setStory_ctaVarargs(value: ReelsMediaFeedResponseStoryCtaItem*): Self = StObject.set(x, "story_cta", js.Array(value :_*))
    
    inline def setStory_polls(value: js.Array[ReelsMediaFeedResponseStoryPollsItem]): Self = StObject.set(x, "story_polls", value.asInstanceOf[js.Any])
    
    inline def setStory_pollsUndefined: Self = StObject.set(x, "story_polls", js.undefined)
    
    inline def setStory_pollsVarargs(value: ReelsMediaFeedResponseStoryPollsItem*): Self = StObject.set(x, "story_polls", js.Array(value :_*))
    
    inline def setStory_questions(value: js.Array[ReelsMediaFeedResponseStoryQuestionsItem]): Self = StObject.set(x, "story_questions", value.asInstanceOf[js.Any])
    
    inline def setStory_questionsUndefined: Self = StObject.set(x, "story_questions", js.undefined)
    
    inline def setStory_questionsVarargs(value: ReelsMediaFeedResponseStoryQuestionsItem*): Self = StObject.set(x, "story_questions", js.Array(value :_*))
    
    inline def setStory_quizs(value: js.Array[ReelsMediaFeedResponseStoryQuizsItem]): Self = StObject.set(x, "story_quizs", value.asInstanceOf[js.Any])
    
    inline def setStory_quizsUndefined: Self = StObject.set(x, "story_quizs", js.undefined)
    
    inline def setStory_quizsVarargs(value: ReelsMediaFeedResponseStoryQuizsItem*): Self = StObject.set(x, "story_quizs", js.Array(value :_*))
    
    inline def setStory_sliders(value: js.Array[ReelsMediaFeedResponseStorySlidersItem]): Self = StObject.set(x, "story_sliders", value.asInstanceOf[js.Any])
    
    inline def setStory_slidersUndefined: Self = StObject.set(x, "story_sliders", js.undefined)
    
    inline def setStory_slidersVarargs(value: ReelsMediaFeedResponseStorySlidersItem*): Self = StObject.set(x, "story_sliders", js.Array(value :_*))
    
    inline def setSupports_reel_reactions(value: Boolean): Self = StObject.set(x, "supports_reel_reactions", value.asInstanceOf[js.Any])
    
    inline def setTaken_at(value: Double): Self = StObject.set(x, "taken_at", value.asInstanceOf[js.Any])
    
    inline def setUser(value: ReelsMediaFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setVideo_codec(value: String): Self = StObject.set(x, "video_codec", value.asInstanceOf[js.Any])
    
    inline def setVideo_dash_manifest(value: String): Self = StObject.set(x, "video_dash_manifest", value.asInstanceOf[js.Any])
    
    inline def setVideo_duration(value: Double): Self = StObject.set(x, "video_duration", value.asInstanceOf[js.Any])
    
    inline def setVideo_versions(value: js.Array[ReelsMediaFeedResponseVideoVersionsItem]): Self = StObject.set(x, "video_versions", value.asInstanceOf[js.Any])
    
    inline def setVideo_versionsVarargs(value: ReelsMediaFeedResponseVideoVersionsItem*): Self = StObject.set(x, "video_versions", js.Array(value :_*))
  }
}
