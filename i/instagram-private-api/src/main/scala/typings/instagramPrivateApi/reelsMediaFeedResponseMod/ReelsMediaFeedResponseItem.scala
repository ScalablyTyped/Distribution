package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReelsMediaFeedResponseItem extends StObject {
  
  var ad_action: js.UndefOr[String] = js.native
  
  var can_reply: Boolean = js.native
  
  var can_reshare: Boolean = js.native
  
  var can_viewer_save: Boolean = js.native
  
  var caption: Null = js.native
  
  var caption_is_edited: Boolean = js.native
  
  var caption_position: Double = js.native
  
  var client_cache_key: String = js.native
  
  var code: String = js.native
  
  var device_timestamp: String = js.native
  
  var expiring_at: Double = js.native
  
  var filter_type: Double = js.native
  
  var has_audio: Boolean = js.native
  
  var has_shared_to_fb: Double = js.native
  
  var id: String = js.native
  
  var image_versions2: ReelsMediaFeedResponseImageVersions2 = js.native
  
  var imported_taken_at: js.UndefOr[Double] = js.native
  
  var is_dash_eligible: Double = js.native
  
  var is_reel_media: Boolean = js.native
  
  var link_text: js.UndefOr[String] = js.native
  
  var media_type: Double = js.native
  
  var number_of_qualities: Double = js.native
  
  var organic_tracking_token: String = js.native
  
  var original_height: Double = js.native
  
  var original_width: Double = js.native
  
  var photo_of_you: Boolean = js.native
  
  var pk: String = js.native
  
  var reel_mentions: js.UndefOr[js.Array[ReelsMediaFeedResponseReelMentionsItem]] = js.native
  
  var show_one_tap_fb_share_tooltip: Boolean = js.native
  
  var story_countdowns: js.UndefOr[js.Array[ReelsMediaFeedResponseStoryCountdownsItem]] = js.native
  
  var story_cta: js.UndefOr[js.Array[ReelsMediaFeedResponseStoryCtaItem]] = js.native
  
  var story_polls: js.UndefOr[js.Array[ReelsMediaFeedResponseStoryPollsItem]] = js.native
  
  var story_questions: js.UndefOr[js.Array[ReelsMediaFeedResponseStoryQuestionsItem]] = js.native
  
  var story_quizs: js.UndefOr[js.Array[ReelsMediaFeedResponseStoryQuizsItem]] = js.native
  
  var story_sliders: js.UndefOr[js.Array[ReelsMediaFeedResponseStorySlidersItem]] = js.native
  
  var supports_reel_reactions: Boolean = js.native
  
  var taken_at: Double = js.native
  
  var user: ReelsMediaFeedResponseUser = js.native
  
  var video_codec: String = js.native
  
  var video_dash_manifest: String = js.native
  
  var video_duration: Double = js.native
  
  var video_versions: js.Array[ReelsMediaFeedResponseVideoVersionsItem] = js.native
}
object ReelsMediaFeedResponseItem {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ReelsMediaFeedResponseItemMutableBuilder[Self <: ReelsMediaFeedResponseItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAd_action(value: String): Self = StObject.set(x, "ad_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAd_actionUndefined: Self = StObject.set(x, "ad_action", js.undefined)
    
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
    def setDevice_timestamp(value: String): Self = StObject.set(x, "device_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiring_at(value: Double): Self = StObject.set(x, "expiring_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_type(value: Double): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_audio(value: Boolean): Self = StObject.set(x, "has_audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_shared_to_fb(value: Double): Self = StObject.set(x, "has_shared_to_fb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_versions2(value: ReelsMediaFeedResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImported_taken_at(value: Double): Self = StObject.set(x, "imported_taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImported_taken_atUndefined: Self = StObject.set(x, "imported_taken_at", js.undefined)
    
    @scala.inline
    def setIs_dash_eligible(value: Double): Self = StObject.set(x, "is_dash_eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_reel_media(value: Boolean): Self = StObject.set(x, "is_reel_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink_text(value: String): Self = StObject.set(x, "link_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink_textUndefined: Self = StObject.set(x, "link_text", js.undefined)
    
    @scala.inline
    def setMedia_type(value: Double): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
    
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
    def setReel_mentions(value: js.Array[ReelsMediaFeedResponseReelMentionsItem]): Self = StObject.set(x, "reel_mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReel_mentionsUndefined: Self = StObject.set(x, "reel_mentions", js.undefined)
    
    @scala.inline
    def setReel_mentionsVarargs(value: ReelsMediaFeedResponseReelMentionsItem*): Self = StObject.set(x, "reel_mentions", js.Array(value :_*))
    
    @scala.inline
    def setShow_one_tap_fb_share_tooltip(value: Boolean): Self = StObject.set(x, "show_one_tap_fb_share_tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_countdowns(value: js.Array[ReelsMediaFeedResponseStoryCountdownsItem]): Self = StObject.set(x, "story_countdowns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_countdownsUndefined: Self = StObject.set(x, "story_countdowns", js.undefined)
    
    @scala.inline
    def setStory_countdownsVarargs(value: ReelsMediaFeedResponseStoryCountdownsItem*): Self = StObject.set(x, "story_countdowns", js.Array(value :_*))
    
    @scala.inline
    def setStory_cta(value: js.Array[ReelsMediaFeedResponseStoryCtaItem]): Self = StObject.set(x, "story_cta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_ctaUndefined: Self = StObject.set(x, "story_cta", js.undefined)
    
    @scala.inline
    def setStory_ctaVarargs(value: ReelsMediaFeedResponseStoryCtaItem*): Self = StObject.set(x, "story_cta", js.Array(value :_*))
    
    @scala.inline
    def setStory_polls(value: js.Array[ReelsMediaFeedResponseStoryPollsItem]): Self = StObject.set(x, "story_polls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_pollsUndefined: Self = StObject.set(x, "story_polls", js.undefined)
    
    @scala.inline
    def setStory_pollsVarargs(value: ReelsMediaFeedResponseStoryPollsItem*): Self = StObject.set(x, "story_polls", js.Array(value :_*))
    
    @scala.inline
    def setStory_questions(value: js.Array[ReelsMediaFeedResponseStoryQuestionsItem]): Self = StObject.set(x, "story_questions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_questionsUndefined: Self = StObject.set(x, "story_questions", js.undefined)
    
    @scala.inline
    def setStory_questionsVarargs(value: ReelsMediaFeedResponseStoryQuestionsItem*): Self = StObject.set(x, "story_questions", js.Array(value :_*))
    
    @scala.inline
    def setStory_quizs(value: js.Array[ReelsMediaFeedResponseStoryQuizsItem]): Self = StObject.set(x, "story_quizs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_quizsUndefined: Self = StObject.set(x, "story_quizs", js.undefined)
    
    @scala.inline
    def setStory_quizsVarargs(value: ReelsMediaFeedResponseStoryQuizsItem*): Self = StObject.set(x, "story_quizs", js.Array(value :_*))
    
    @scala.inline
    def setStory_sliders(value: js.Array[ReelsMediaFeedResponseStorySlidersItem]): Self = StObject.set(x, "story_sliders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_slidersUndefined: Self = StObject.set(x, "story_sliders", js.undefined)
    
    @scala.inline
    def setStory_slidersVarargs(value: ReelsMediaFeedResponseStorySlidersItem*): Self = StObject.set(x, "story_sliders", js.Array(value :_*))
    
    @scala.inline
    def setSupports_reel_reactions(value: Boolean): Self = StObject.set(x, "supports_reel_reactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaken_at(value: Double): Self = StObject.set(x, "taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: ReelsMediaFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_codec(value: String): Self = StObject.set(x, "video_codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_dash_manifest(value: String): Self = StObject.set(x, "video_dash_manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_duration(value: Double): Self = StObject.set(x, "video_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_versions(value: js.Array[ReelsMediaFeedResponseVideoVersionsItem]): Self = StObject.set(x, "video_versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_versionsVarargs(value: ReelsMediaFeedResponseVideoVersionsItem*): Self = StObject.set(x, "video_versions", js.Array(value :_*))
  }
}
