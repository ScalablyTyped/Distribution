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
import typings.instagramPrivateApi.mediaConfigureOptionsMod.MediaConfigureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.MediaConfigureStoryBaseOptions because var conflicts: geotag_enabled, media_latitude, media_longitude, posting_latitude, posting_longitude. Inlined story_media_creation_date, client_shared_at, audience, configure_mode, camera_position, allow_multi_configures, thread_ids, recipient_users, client_context, view_mode, reply_type, caption, mas_opt_in, story_sticker_ids, story_hashtags, story_locations, reel_mentions, story_polls, internal_features, story_sliders, story_questions, story_countdowns, attached_media, story_chats, story_quizs, story_cta */ @js.native
trait MediaConfigureStoryPhotoOptions extends MediaConfigureOptions {
  
  var allow_multi_configures: js.UndefOr[`0` | `1`] = js.native
  
  var attached_media: js.UndefOr[js.Array[StoryAttachedMedia] | String] = js.native
  
  var audience: js.UndefOr[besties] = js.native
  
  var camera_position: js.UndefOr[String] = js.native
  
  var caption: js.UndefOr[String] = js.native
  
  var client_context: js.UndefOr[String] = js.native
  
  var client_shared_at: js.UndefOr[String] = js.native
  
  var configure_mode: `1` | `2` = js.native
  
  var internal_features: js.UndefOr[polling_sticker] = js.native
  
  var mas_opt_in: js.UndefOr[NOT_PROMPTED] = js.native
  
  var recipient_users: js.UndefOr[js.Array[String] | String] = js.native
  
  var reel_mentions: js.UndefOr[js.Array[StoryMention] | String] = js.native
  
  var reply_type: js.UndefOr[story | String] = js.native
  
  var story_chats: js.UndefOr[js.Array[StoryChat] | String] = js.native
  
  var story_countdowns: js.UndefOr[js.Array[StoryCountdown] | String] = js.native
  
  var story_cta: js.UndefOr[js.Array[StoryCta] | String] = js.native
  
  var story_hashtags: js.UndefOr[js.Array[StoryHashtag] | String] = js.native
  
  var story_locations: js.UndefOr[js.Array[StoryLocation] | String] = js.native
  
  var story_media_creation_date: js.UndefOr[String] = js.native
  
  var story_polls: js.UndefOr[js.Array[StoryPoll] | String] = js.native
  
  var story_questions: js.UndefOr[js.Array[StoryQuestion] | String] = js.native
  
  var story_quizs: js.UndefOr[js.Array[StoryQuiz] | String] = js.native
  
  var story_sliders: js.UndefOr[js.Array[StorySlider] | String] = js.native
  
  var story_sticker_ids: js.UndefOr[String | question_sticker_ma | countdown_sticker_time | chat_sticker_id] = js.native
  
  var thread_ids: js.UndefOr[js.Array[String] | String] = js.native
  
  var view_mode: js.UndefOr[replayable | once | String] = js.native
}
object MediaConfigureStoryPhotoOptions {
  
  @scala.inline
  def apply(configure_mode: `1` | `2`, upload_id: String): MediaConfigureStoryPhotoOptions = {
    val __obj = js.Dynamic.literal(configure_mode = configure_mode.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureStoryPhotoOptions]
  }
  
  @scala.inline
  implicit class MediaConfigureStoryPhotoOptionsOps[Self <: MediaConfigureStoryPhotoOptions] (val x: Self) extends AnyVal {
    
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
    def setConfigure_mode(value: `1` | `2`): Self = this.set("configure_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_multi_configures(value: `0` | `1`): Self = this.set("allow_multi_configures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_multi_configures: Self = this.set("allow_multi_configures", js.undefined)
    
    @scala.inline
    def setAttached_mediaVarargs(value: StoryAttachedMedia*): Self = this.set("attached_media", js.Array(value :_*))
    
    @scala.inline
    def setAttached_media(value: js.Array[StoryAttachedMedia] | String): Self = this.set("attached_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttached_media: Self = this.set("attached_media", js.undefined)
    
    @scala.inline
    def setAudience(value: besties): Self = this.set("audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    
    @scala.inline
    def setCamera_position(value: String): Self = this.set("camera_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCamera_position: Self = this.set("camera_position", js.undefined)
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setClient_context(value: String): Self = this.set("client_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient_context: Self = this.set("client_context", js.undefined)
    
    @scala.inline
    def setClient_shared_at(value: String): Self = this.set("client_shared_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient_shared_at: Self = this.set("client_shared_at", js.undefined)
    
    @scala.inline
    def setInternal_features(value: polling_sticker): Self = this.set("internal_features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternal_features: Self = this.set("internal_features", js.undefined)
    
    @scala.inline
    def setMas_opt_in(value: NOT_PROMPTED): Self = this.set("mas_opt_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMas_opt_in: Self = this.set("mas_opt_in", js.undefined)
    
    @scala.inline
    def setRecipient_usersVarargs(value: String*): Self = this.set("recipient_users", js.Array(value :_*))
    
    @scala.inline
    def setRecipient_users(value: js.Array[String] | String): Self = this.set("recipient_users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipient_users: Self = this.set("recipient_users", js.undefined)
    
    @scala.inline
    def setReel_mentionsVarargs(value: StoryMention*): Self = this.set("reel_mentions", js.Array(value :_*))
    
    @scala.inline
    def setReel_mentions(value: js.Array[StoryMention] | String): Self = this.set("reel_mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReel_mentions: Self = this.set("reel_mentions", js.undefined)
    
    @scala.inline
    def setReply_type(value: story | String): Self = this.set("reply_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReply_type: Self = this.set("reply_type", js.undefined)
    
    @scala.inline
    def setStory_chatsVarargs(value: StoryChat*): Self = this.set("story_chats", js.Array(value :_*))
    
    @scala.inline
    def setStory_chats(value: js.Array[StoryChat] | String): Self = this.set("story_chats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStory_chats: Self = this.set("story_chats", js.undefined)
    
    @scala.inline
    def setStory_countdownsVarargs(value: StoryCountdown*): Self = this.set("story_countdowns", js.Array(value :_*))
    
    @scala.inline
    def setStory_countdowns(value: js.Array[StoryCountdown] | String): Self = this.set("story_countdowns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStory_countdowns: Self = this.set("story_countdowns", js.undefined)
    
    @scala.inline
    def setStory_ctaVarargs(value: StoryCta*): Self = this.set("story_cta", js.Array(value :_*))
    
    @scala.inline
    def setStory_cta(value: js.Array[StoryCta] | String): Self = this.set("story_cta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStory_cta: Self = this.set("story_cta", js.undefined)
    
    @scala.inline
    def setStory_hashtagsVarargs(value: StoryHashtag*): Self = this.set("story_hashtags", js.Array(value :_*))
    
    @scala.inline
    def setStory_hashtags(value: js.Array[StoryHashtag] | String): Self = this.set("story_hashtags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStory_hashtags: Self = this.set("story_hashtags", js.undefined)
    
    @scala.inline
    def setStory_locationsVarargs(value: StoryLocation*): Self = this.set("story_locations", js.Array(value :_*))
    
    @scala.inline
    def setStory_locations(value: js.Array[StoryLocation] | String): Self = this.set("story_locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStory_locations: Self = this.set("story_locations", js.undefined)
    
    @scala.inline
    def setStory_media_creation_date(value: String): Self = this.set("story_media_creation_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStory_media_creation_date: Self = this.set("story_media_creation_date", js.undefined)
    
    @scala.inline
    def setStory_pollsVarargs(value: StoryPoll*): Self = this.set("story_polls", js.Array(value :_*))
    
    @scala.inline
    def setStory_polls(value: js.Array[StoryPoll] | String): Self = this.set("story_polls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStory_polls: Self = this.set("story_polls", js.undefined)
    
    @scala.inline
    def setStory_questionsVarargs(value: StoryQuestion*): Self = this.set("story_questions", js.Array(value :_*))
    
    @scala.inline
    def setStory_questions(value: js.Array[StoryQuestion] | String): Self = this.set("story_questions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStory_questions: Self = this.set("story_questions", js.undefined)
    
    @scala.inline
    def setStory_quizsVarargs(value: StoryQuiz*): Self = this.set("story_quizs", js.Array(value :_*))
    
    @scala.inline
    def setStory_quizs(value: js.Array[StoryQuiz] | String): Self = this.set("story_quizs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStory_quizs: Self = this.set("story_quizs", js.undefined)
    
    @scala.inline
    def setStory_slidersVarargs(value: StorySlider*): Self = this.set("story_sliders", js.Array(value :_*))
    
    @scala.inline
    def setStory_sliders(value: js.Array[StorySlider] | String): Self = this.set("story_sliders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStory_sliders: Self = this.set("story_sliders", js.undefined)
    
    @scala.inline
    def setStory_sticker_ids(value: String | question_sticker_ma | countdown_sticker_time | chat_sticker_id): Self = this.set("story_sticker_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStory_sticker_ids: Self = this.set("story_sticker_ids", js.undefined)
    
    @scala.inline
    def setThread_idsVarargs(value: String*): Self = this.set("thread_ids", js.Array(value :_*))
    
    @scala.inline
    def setThread_ids(value: js.Array[String] | String): Self = this.set("thread_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThread_ids: Self = this.set("thread_ids", js.undefined)
    
    @scala.inline
    def setView_mode(value: replayable | once | String): Self = this.set("view_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView_mode: Self = this.set("view_mode", js.undefined)
  }
}
