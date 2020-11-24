package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReelsMediaFeedResponseItem extends js.Object {
  
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
  implicit class ReelsMediaFeedResponseItemOps[Self <: ReelsMediaFeedResponseItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCan_reply(value: Boolean): Self = this.set("can_reply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_reshare(value: Boolean): Self = this.set("can_reshare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_viewer_save(value: Boolean): Self = this.set("can_viewer_save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: Null): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption_is_edited(value: Boolean): Self = this.set("caption_is_edited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption_position(value: Double): Self = this.set("caption_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_cache_key(value: String): Self = this.set("client_cache_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice_timestamp(value: String): Self = this.set("device_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiring_at(value: Double): Self = this.set("expiring_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_type(value: Double): Self = this.set("filter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_audio(value: Boolean): Self = this.set("has_audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_shared_to_fb(value: Double): Self = this.set("has_shared_to_fb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_versions2(value: ReelsMediaFeedResponseImageVersions2): Self = this.set("image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_dash_eligible(value: Double): Self = this.set("is_dash_eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_reel_media(value: Boolean): Self = this.set("is_reel_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_type(value: Double): Self = this.set("media_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber_of_qualities(value: Double): Self = this.set("number_of_qualities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganic_tracking_token(value: String): Self = this.set("organic_tracking_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_height(value: Double): Self = this.set("original_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_width(value: Double): Self = this.set("original_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoto_of_you(value: Boolean): Self = this.set("photo_of_you", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: String): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_one_tap_fb_share_tooltip(value: Boolean): Self = this.set("show_one_tap_fb_share_tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupports_reel_reactions(value: Boolean): Self = this.set("supports_reel_reactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaken_at(value: Double): Self = this.set("taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: ReelsMediaFeedResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_codec(value: String): Self = this.set("video_codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_dash_manifest(value: String): Self = this.set("video_dash_manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_duration(value: Double): Self = this.set("video_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_versionsVarargs(value: ReelsMediaFeedResponseVideoVersionsItem*): Self = this.set("video_versions", js.Array(value :_*))
    
    @scala.inline
    def setVideo_versions(value: js.Array[ReelsMediaFeedResponseVideoVersionsItem]): Self = this.set("video_versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAd_action(value: String): Self = this.set("ad_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAd_action: Self = this.set("ad_action", js.undefined)
    
    @scala.inline
    def setImported_taken_at(value: Double): Self = this.set("imported_taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImported_taken_at: Self = this.set("imported_taken_at", js.undefined)
    
    @scala.inline
    def setLink_text(value: String): Self = this.set("link_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink_text: Self = this.set("link_text", js.undefined)
    
    @scala.inline
    def setReel_mentionsVarargs(value: ReelsMediaFeedResponseReelMentionsItem*): Self = this.set("reel_mentions", js.Array(value :_*))
    
    @scala.inline
    def setReel_mentions(value: js.Array[ReelsMediaFeedResponseReelMentionsItem]): Self = this.set("reel_mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReel_mentions: Self = this.set("reel_mentions", js.undefined)
    
    @scala.inline
    def setStory_countdownsVarargs(value: ReelsMediaFeedResponseStoryCountdownsItem*): Self = this.set("story_countdowns", js.Array(value :_*))
    
    @scala.inline
    def setStory_countdowns(value: js.Array[ReelsMediaFeedResponseStoryCountdownsItem]): Self = this.set("story_countdowns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStory_countdowns: Self = this.set("story_countdowns", js.undefined)
    
    @scala.inline
    def setStory_ctaVarargs(value: ReelsMediaFeedResponseStoryCtaItem*): Self = this.set("story_cta", js.Array(value :_*))
    
    @scala.inline
    def setStory_cta(value: js.Array[ReelsMediaFeedResponseStoryCtaItem]): Self = this.set("story_cta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStory_cta: Self = this.set("story_cta", js.undefined)
    
    @scala.inline
    def setStory_pollsVarargs(value: ReelsMediaFeedResponseStoryPollsItem*): Self = this.set("story_polls", js.Array(value :_*))
    
    @scala.inline
    def setStory_polls(value: js.Array[ReelsMediaFeedResponseStoryPollsItem]): Self = this.set("story_polls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStory_polls: Self = this.set("story_polls", js.undefined)
    
    @scala.inline
    def setStory_questionsVarargs(value: ReelsMediaFeedResponseStoryQuestionsItem*): Self = this.set("story_questions", js.Array(value :_*))
    
    @scala.inline
    def setStory_questions(value: js.Array[ReelsMediaFeedResponseStoryQuestionsItem]): Self = this.set("story_questions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStory_questions: Self = this.set("story_questions", js.undefined)
    
    @scala.inline
    def setStory_quizsVarargs(value: ReelsMediaFeedResponseStoryQuizsItem*): Self = this.set("story_quizs", js.Array(value :_*))
    
    @scala.inline
    def setStory_quizs(value: js.Array[ReelsMediaFeedResponseStoryQuizsItem]): Self = this.set("story_quizs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStory_quizs: Self = this.set("story_quizs", js.undefined)
    
    @scala.inline
    def setStory_slidersVarargs(value: ReelsMediaFeedResponseStorySlidersItem*): Self = this.set("story_sliders", js.Array(value :_*))
    
    @scala.inline
    def setStory_sliders(value: js.Array[ReelsMediaFeedResponseStorySlidersItem]): Self = this.set("story_sliders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStory_sliders: Self = this.set("story_sliders", js.undefined)
  }
}
