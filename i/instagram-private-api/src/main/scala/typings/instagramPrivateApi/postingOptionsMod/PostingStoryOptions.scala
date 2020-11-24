package typings.instagramPrivateApi.postingOptionsMod

import typings.instagramPrivateApi.anon.StorystickeridsAny
import typings.instagramPrivateApi.instagramPrivateApiStrings.once
import typings.instagramPrivateApi.instagramPrivateApiStrings.replayable
import typings.instagramPrivateApi.instagramPrivateApiStrings.story
import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryAttachedMedia
import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryChat
import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryCountdown
import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryHashtag
import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryMention
import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryPoll
import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryQuestion
import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryQuiz
import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.StorySlider
import typings.instagramPrivateApi.stickerBuilderMod.StickerBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostingStoryOptions extends js.Object {
  
  var caption: js.UndefOr[String] = js.native
  
  var chat: js.UndefOr[StoryChat] = js.native
  
  var countdown: js.UndefOr[StoryCountdown] = js.native
  
  var hashtags: js.UndefOr[js.Array[StoryHashtag]] = js.native
  
  var link: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[PostingStoryLocationSticker] = js.native
  
  var media: js.UndefOr[StoryAttachedMedia] = js.native
  
  var mentions: js.UndefOr[js.Array[StoryMention]] = js.native
  
  var poll: js.UndefOr[StoryPoll] = js.native
  
  var question: js.UndefOr[StoryQuestion] = js.native
  
  var quiz: js.UndefOr[StoryQuiz] = js.native
  
  var recipientUsers: js.UndefOr[js.Array[String]] = js.native
  
  var replyType: js.UndefOr[story | String] = js.native
  
  var slider: js.UndefOr[StorySlider] = js.native
  
  var stickerConfig: js.UndefOr[(js.Any with StorystickeridsAny) | StickerBuilder] = js.native
  
  var threadIds: js.UndefOr[js.Array[String]] = js.native
  
  var toBesties: js.UndefOr[Boolean] = js.native
  
  var viewMode: js.UndefOr[replayable | once | String] = js.native
}
object PostingStoryOptions {
  
  @scala.inline
  def apply(): PostingStoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostingStoryOptions]
  }
  
  @scala.inline
  implicit class PostingStoryOptionsOps[Self <: PostingStoryOptions] (val x: Self) extends AnyVal {
    
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setChat(value: StoryChat): Self = this.set("chat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChat: Self = this.set("chat", js.undefined)
    
    @scala.inline
    def setCountdown(value: StoryCountdown): Self = this.set("countdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountdown: Self = this.set("countdown", js.undefined)
    
    @scala.inline
    def setHashtagsVarargs(value: StoryHashtag*): Self = this.set("hashtags", js.Array(value :_*))
    
    @scala.inline
    def setHashtags(value: js.Array[StoryHashtag]): Self = this.set("hashtags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashtags: Self = this.set("hashtags", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setLocation(value: PostingStoryLocationSticker): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMedia(value: StoryAttachedMedia): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setMentionsVarargs(value: StoryMention*): Self = this.set("mentions", js.Array(value :_*))
    
    @scala.inline
    def setMentions(value: js.Array[StoryMention]): Self = this.set("mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMentions: Self = this.set("mentions", js.undefined)
    
    @scala.inline
    def setPoll(value: StoryPoll): Self = this.set("poll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoll: Self = this.set("poll", js.undefined)
    
    @scala.inline
    def setQuestion(value: StoryQuestion): Self = this.set("question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuestion: Self = this.set("question", js.undefined)
    
    @scala.inline
    def setQuiz(value: StoryQuiz): Self = this.set("quiz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuiz: Self = this.set("quiz", js.undefined)
    
    @scala.inline
    def setRecipientUsersVarargs(value: String*): Self = this.set("recipientUsers", js.Array(value :_*))
    
    @scala.inline
    def setRecipientUsers(value: js.Array[String]): Self = this.set("recipientUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientUsers: Self = this.set("recipientUsers", js.undefined)
    
    @scala.inline
    def setReplyType(value: story | String): Self = this.set("replyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplyType: Self = this.set("replyType", js.undefined)
    
    @scala.inline
    def setSlider(value: StorySlider): Self = this.set("slider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlider: Self = this.set("slider", js.undefined)
    
    @scala.inline
    def setStickerConfig(value: (js.Any with StorystickeridsAny) | StickerBuilder): Self = this.set("stickerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStickerConfig: Self = this.set("stickerConfig", js.undefined)
    
    @scala.inline
    def setThreadIdsVarargs(value: String*): Self = this.set("threadIds", js.Array(value :_*))
    
    @scala.inline
    def setThreadIds(value: js.Array[String]): Self = this.set("threadIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreadIds: Self = this.set("threadIds", js.undefined)
    
    @scala.inline
    def setToBesties(value: Boolean): Self = this.set("toBesties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToBesties: Self = this.set("toBesties", js.undefined)
    
    @scala.inline
    def setViewMode(value: replayable | once | String): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
  }
}
