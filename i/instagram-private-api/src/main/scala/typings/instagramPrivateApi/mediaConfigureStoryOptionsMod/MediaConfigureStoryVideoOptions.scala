package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiStrings.NOT_PROMPTED
import typings.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`1`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`2`
import typings.instagramPrivateApi.instagramPrivateApiStrings.besties
import typings.instagramPrivateApi.instagramPrivateApiStrings.chat_sticker_id
import typings.instagramPrivateApi.instagramPrivateApiStrings.countdown_sticker_time
import typings.instagramPrivateApi.instagramPrivateApiStrings.once
import typings.instagramPrivateApi.instagramPrivateApiStrings.polling_sticker
import typings.instagramPrivateApi.instagramPrivateApiStrings.question_sticker_ma
import typings.instagramPrivateApi.instagramPrivateApiStrings.replayable
import typings.instagramPrivateApi.instagramPrivateApiStrings.story
import typings.instagramPrivateApi.mediaConfigureVideoOptionsMod.MediaConfigureVideoOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.MediaConfigureStoryBaseOptions because var conflicts: geotag_enabled, media_latitude, media_longitude, posting_latitude, posting_longitude. Inlined story_media_creation_date, client_shared_at, audience, configure_mode, camera_position, allow_multi_configures, thread_ids, recipient_users, client_context, view_mode, reply_type, caption, mas_opt_in, story_sticker_ids, story_hashtags, story_locations, reel_mentions, story_polls, internal_features, story_sliders, story_questions, story_countdowns, attached_media, story_chats, story_quizs, story_cta */ trait MediaConfigureStoryVideoOptions
  extends StObject
     with MediaConfigureVideoOptions {
  
  var allow_multi_configures: js.UndefOr[`0` | `1`] = js.undefined
  
  var attached_media: js.UndefOr[js.Array[StoryAttachedMedia] | String] = js.undefined
  
  var audience: js.UndefOr[besties] = js.undefined
  
  var camera_position: js.UndefOr[String] = js.undefined
  
  var caption: js.UndefOr[String] = js.undefined
  
  var client_context: js.UndefOr[String] = js.undefined
  
  var client_shared_at: js.UndefOr[String] = js.undefined
  
  var configure_mode: `1` | `2`
  
  var internal_features: js.UndefOr[polling_sticker] = js.undefined
  
  var mas_opt_in: js.UndefOr[NOT_PROMPTED] = js.undefined
  
  var recipient_users: js.UndefOr[js.Array[String] | String] = js.undefined
  
  var reel_mentions: js.UndefOr[js.Array[StoryMention] | String] = js.undefined
  
  var reply_type: js.UndefOr[story | String] = js.undefined
  
  var story_chats: js.UndefOr[js.Array[StoryChat] | String] = js.undefined
  
  var story_countdowns: js.UndefOr[js.Array[StoryCountdown] | String] = js.undefined
  
  var story_cta: js.UndefOr[js.Array[StoryCta] | String] = js.undefined
  
  var story_hashtags: js.UndefOr[js.Array[StoryHashtag] | String] = js.undefined
  
  var story_locations: js.UndefOr[js.Array[StoryLocation] | String] = js.undefined
  
  var story_media_creation_date: js.UndefOr[String] = js.undefined
  
  var story_polls: js.UndefOr[js.Array[StoryPoll] | String] = js.undefined
  
  var story_questions: js.UndefOr[js.Array[StoryQuestion] | String] = js.undefined
  
  var story_quizs: js.UndefOr[js.Array[StoryQuiz] | String] = js.undefined
  
  var story_sliders: js.UndefOr[js.Array[StorySlider] | String] = js.undefined
  
  var story_sticker_ids: js.UndefOr[String | question_sticker_ma | countdown_sticker_time | chat_sticker_id] = js.undefined
  
  var thread_ids: js.UndefOr[js.Array[String] | String] = js.undefined
  
  var view_mode: js.UndefOr[replayable | once | String] = js.undefined
}
object MediaConfigureStoryVideoOptions {
  
  @scala.inline
  def apply(configure_mode: `1` | `2`, height: Double, length: Double, upload_id: String, width: Double): MediaConfigureStoryVideoOptions = {
    val __obj = js.Dynamic.literal(configure_mode = configure_mode.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureStoryVideoOptions]
  }
  
  @scala.inline
  implicit class MediaConfigureStoryVideoOptionsMutableBuilder[Self <: MediaConfigureStoryVideoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_multi_configures(value: `0` | `1`): Self = StObject.set(x, "allow_multi_configures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_multi_configuresUndefined: Self = StObject.set(x, "allow_multi_configures", js.undefined)
    
    @scala.inline
    def setAttached_media(value: js.Array[StoryAttachedMedia] | String): Self = StObject.set(x, "attached_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttached_mediaUndefined: Self = StObject.set(x, "attached_media", js.undefined)
    
    @scala.inline
    def setAttached_mediaVarargs(value: StoryAttachedMedia*): Self = StObject.set(x, "attached_media", js.Array(value :_*))
    
    @scala.inline
    def setAudience(value: besties): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    @scala.inline
    def setCamera_position(value: String): Self = StObject.set(x, "camera_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamera_positionUndefined: Self = StObject.set(x, "camera_position", js.undefined)
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setClient_context(value: String): Self = StObject.set(x, "client_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_contextUndefined: Self = StObject.set(x, "client_context", js.undefined)
    
    @scala.inline
    def setClient_shared_at(value: String): Self = StObject.set(x, "client_shared_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_shared_atUndefined: Self = StObject.set(x, "client_shared_at", js.undefined)
    
    @scala.inline
    def setConfigure_mode(value: `1` | `2`): Self = StObject.set(x, "configure_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternal_features(value: polling_sticker): Self = StObject.set(x, "internal_features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternal_featuresUndefined: Self = StObject.set(x, "internal_features", js.undefined)
    
    @scala.inline
    def setMas_opt_in(value: NOT_PROMPTED): Self = StObject.set(x, "mas_opt_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMas_opt_inUndefined: Self = StObject.set(x, "mas_opt_in", js.undefined)
    
    @scala.inline
    def setRecipient_users(value: js.Array[String] | String): Self = StObject.set(x, "recipient_users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient_usersUndefined: Self = StObject.set(x, "recipient_users", js.undefined)
    
    @scala.inline
    def setRecipient_usersVarargs(value: String*): Self = StObject.set(x, "recipient_users", js.Array(value :_*))
    
    @scala.inline
    def setReel_mentions(value: js.Array[StoryMention] | String): Self = StObject.set(x, "reel_mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReel_mentionsUndefined: Self = StObject.set(x, "reel_mentions", js.undefined)
    
    @scala.inline
    def setReel_mentionsVarargs(value: StoryMention*): Self = StObject.set(x, "reel_mentions", js.Array(value :_*))
    
    @scala.inline
    def setReply_type(value: story | String): Self = StObject.set(x, "reply_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReply_typeUndefined: Self = StObject.set(x, "reply_type", js.undefined)
    
    @scala.inline
    def setStory_chats(value: js.Array[StoryChat] | String): Self = StObject.set(x, "story_chats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_chatsUndefined: Self = StObject.set(x, "story_chats", js.undefined)
    
    @scala.inline
    def setStory_chatsVarargs(value: StoryChat*): Self = StObject.set(x, "story_chats", js.Array(value :_*))
    
    @scala.inline
    def setStory_countdowns(value: js.Array[StoryCountdown] | String): Self = StObject.set(x, "story_countdowns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_countdownsUndefined: Self = StObject.set(x, "story_countdowns", js.undefined)
    
    @scala.inline
    def setStory_countdownsVarargs(value: StoryCountdown*): Self = StObject.set(x, "story_countdowns", js.Array(value :_*))
    
    @scala.inline
    def setStory_cta(value: js.Array[StoryCta] | String): Self = StObject.set(x, "story_cta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_ctaUndefined: Self = StObject.set(x, "story_cta", js.undefined)
    
    @scala.inline
    def setStory_ctaVarargs(value: StoryCta*): Self = StObject.set(x, "story_cta", js.Array(value :_*))
    
    @scala.inline
    def setStory_hashtags(value: js.Array[StoryHashtag] | String): Self = StObject.set(x, "story_hashtags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_hashtagsUndefined: Self = StObject.set(x, "story_hashtags", js.undefined)
    
    @scala.inline
    def setStory_hashtagsVarargs(value: StoryHashtag*): Self = StObject.set(x, "story_hashtags", js.Array(value :_*))
    
    @scala.inline
    def setStory_locations(value: js.Array[StoryLocation] | String): Self = StObject.set(x, "story_locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_locationsUndefined: Self = StObject.set(x, "story_locations", js.undefined)
    
    @scala.inline
    def setStory_locationsVarargs(value: StoryLocation*): Self = StObject.set(x, "story_locations", js.Array(value :_*))
    
    @scala.inline
    def setStory_media_creation_date(value: String): Self = StObject.set(x, "story_media_creation_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_media_creation_dateUndefined: Self = StObject.set(x, "story_media_creation_date", js.undefined)
    
    @scala.inline
    def setStory_polls(value: js.Array[StoryPoll] | String): Self = StObject.set(x, "story_polls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_pollsUndefined: Self = StObject.set(x, "story_polls", js.undefined)
    
    @scala.inline
    def setStory_pollsVarargs(value: StoryPoll*): Self = StObject.set(x, "story_polls", js.Array(value :_*))
    
    @scala.inline
    def setStory_questions(value: js.Array[StoryQuestion] | String): Self = StObject.set(x, "story_questions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_questionsUndefined: Self = StObject.set(x, "story_questions", js.undefined)
    
    @scala.inline
    def setStory_questionsVarargs(value: StoryQuestion*): Self = StObject.set(x, "story_questions", js.Array(value :_*))
    
    @scala.inline
    def setStory_quizs(value: js.Array[StoryQuiz] | String): Self = StObject.set(x, "story_quizs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_quizsUndefined: Self = StObject.set(x, "story_quizs", js.undefined)
    
    @scala.inline
    def setStory_quizsVarargs(value: StoryQuiz*): Self = StObject.set(x, "story_quizs", js.Array(value :_*))
    
    @scala.inline
    def setStory_sliders(value: js.Array[StorySlider] | String): Self = StObject.set(x, "story_sliders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_slidersUndefined: Self = StObject.set(x, "story_sliders", js.undefined)
    
    @scala.inline
    def setStory_slidersVarargs(value: StorySlider*): Self = StObject.set(x, "story_sliders", js.Array(value :_*))
    
    @scala.inline
    def setStory_sticker_ids(value: String | question_sticker_ma | countdown_sticker_time | chat_sticker_id): Self = StObject.set(x, "story_sticker_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_sticker_idsUndefined: Self = StObject.set(x, "story_sticker_ids", js.undefined)
    
    @scala.inline
    def setThread_ids(value: js.Array[String] | String): Self = StObject.set(x, "thread_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThread_idsUndefined: Self = StObject.set(x, "thread_ids", js.undefined)
    
    @scala.inline
    def setThread_idsVarargs(value: String*): Self = StObject.set(x, "thread_ids", js.Array(value :_*))
    
    @scala.inline
    def setView_mode(value: replayable | once | String): Self = StObject.set(x, "view_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView_modeUndefined: Self = StObject.set(x, "view_mode", js.undefined)
  }
}
