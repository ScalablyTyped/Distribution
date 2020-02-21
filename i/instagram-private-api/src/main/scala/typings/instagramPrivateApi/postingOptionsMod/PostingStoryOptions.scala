package typings.instagramPrivateApi.postingOptionsMod

import typings.instagramPrivateApi.AnonStorystickerids
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
import scala.scalajs.js.annotation._

trait PostingStoryOptions extends js.Object {
  var caption: js.UndefOr[String] = js.undefined
  var chat: js.UndefOr[StoryChat] = js.undefined
  var countdown: js.UndefOr[StoryCountdown] = js.undefined
  var hashtags: js.UndefOr[js.Array[StoryHashtag]] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[PostingStoryLocationSticker] = js.undefined
  var media: js.UndefOr[StoryAttachedMedia] = js.undefined
  var mentions: js.UndefOr[js.Array[StoryMention]] = js.undefined
  var poll: js.UndefOr[StoryPoll] = js.undefined
  var question: js.UndefOr[StoryQuestion] = js.undefined
  var quiz: js.UndefOr[StoryQuiz] = js.undefined
  var recipientUsers: js.UndefOr[js.Array[String]] = js.undefined
  var replyType: js.UndefOr[story | String] = js.undefined
  var slider: js.UndefOr[StorySlider] = js.undefined
  var stickerConfig: js.UndefOr[(js.Any with AnonStorystickerids) | StickerBuilder] = js.undefined
  var threadIds: js.UndefOr[js.Array[String]] = js.undefined
  var toBesties: js.UndefOr[Boolean] = js.undefined
  var viewMode: js.UndefOr[replayable | once | String] = js.undefined
}

object PostingStoryOptions {
  @scala.inline
  def apply(
    caption: String = null,
    chat: StoryChat = null,
    countdown: StoryCountdown = null,
    hashtags: js.Array[StoryHashtag] = null,
    link: String = null,
    location: PostingStoryLocationSticker = null,
    media: StoryAttachedMedia = null,
    mentions: js.Array[StoryMention] = null,
    poll: StoryPoll = null,
    question: StoryQuestion = null,
    quiz: StoryQuiz = null,
    recipientUsers: js.Array[String] = null,
    replyType: story | String = null,
    slider: StorySlider = null,
    stickerConfig: (js.Any with AnonStorystickerids) | StickerBuilder = null,
    threadIds: js.Array[String] = null,
    toBesties: js.UndefOr[Boolean] = js.undefined,
    viewMode: replayable | once | String = null
  ): PostingStoryOptions = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (chat != null) __obj.updateDynamic("chat")(chat.asInstanceOf[js.Any])
    if (countdown != null) __obj.updateDynamic("countdown")(countdown.asInstanceOf[js.Any])
    if (hashtags != null) __obj.updateDynamic("hashtags")(hashtags.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (mentions != null) __obj.updateDynamic("mentions")(mentions.asInstanceOf[js.Any])
    if (poll != null) __obj.updateDynamic("poll")(poll.asInstanceOf[js.Any])
    if (question != null) __obj.updateDynamic("question")(question.asInstanceOf[js.Any])
    if (quiz != null) __obj.updateDynamic("quiz")(quiz.asInstanceOf[js.Any])
    if (recipientUsers != null) __obj.updateDynamic("recipientUsers")(recipientUsers.asInstanceOf[js.Any])
    if (replyType != null) __obj.updateDynamic("replyType")(replyType.asInstanceOf[js.Any])
    if (slider != null) __obj.updateDynamic("slider")(slider.asInstanceOf[js.Any])
    if (stickerConfig != null) __obj.updateDynamic("stickerConfig")(stickerConfig.asInstanceOf[js.Any])
    if (threadIds != null) __obj.updateDynamic("threadIds")(threadIds.asInstanceOf[js.Any])
    if (!js.isUndefined(toBesties)) __obj.updateDynamic("toBesties")(toBesties.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingStoryOptions]
  }
}

