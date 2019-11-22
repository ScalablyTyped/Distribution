package typings.instagramDashPrivateDashApi.distTypesPostingDotVideoDotOptionsMod

import typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod.StoryAttachedMedia
import typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod.StoryChat
import typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod.StoryCountdown
import typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod.StoryHashtag
import typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod.StoryMention
import typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod.StoryPoll
import typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod.StoryQuestion
import typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod.StoryQuiz
import typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod.StorySlider
import typings.instagramDashPrivateDashApi.distTypesPostingDotOptionsMod.PostingStoryLocationSticker
import typings.instagramDashPrivateDashApi.distTypesPostingDotOptionsMod.PostingStoryOptions
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.once
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.replayable
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.story
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostingStoryVideoOptions extends PostingStoryOptions {
  var coverImage: Buffer
  var transcodeDelay: js.UndefOr[Double] = js.undefined
  var video: Buffer
}

object PostingStoryVideoOptions {
  @scala.inline
  def apply(
    coverImage: Buffer,
    video: Buffer,
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
    threadIds: js.Array[String] = null,
    toBesties: js.UndefOr[Boolean] = js.undefined,
    transcodeDelay: Int | Double = null,
    viewMode: replayable | once | String = null
  ): PostingStoryVideoOptions = {
    val __obj = js.Dynamic.literal(coverImage = coverImage, video = video)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (chat != null) __obj.updateDynamic("chat")(chat)
    if (countdown != null) __obj.updateDynamic("countdown")(countdown)
    if (hashtags != null) __obj.updateDynamic("hashtags")(hashtags)
    if (link != null) __obj.updateDynamic("link")(link)
    if (location != null) __obj.updateDynamic("location")(location)
    if (media != null) __obj.updateDynamic("media")(media)
    if (mentions != null) __obj.updateDynamic("mentions")(mentions)
    if (poll != null) __obj.updateDynamic("poll")(poll)
    if (question != null) __obj.updateDynamic("question")(question)
    if (quiz != null) __obj.updateDynamic("quiz")(quiz)
    if (recipientUsers != null) __obj.updateDynamic("recipientUsers")(recipientUsers)
    if (replyType != null) __obj.updateDynamic("replyType")(replyType.asInstanceOf[js.Any])
    if (slider != null) __obj.updateDynamic("slider")(slider)
    if (threadIds != null) __obj.updateDynamic("threadIds")(threadIds)
    if (!js.isUndefined(toBesties)) __obj.updateDynamic("toBesties")(toBesties)
    if (transcodeDelay != null) __obj.updateDynamic("transcodeDelay")(transcodeDelay.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingStoryVideoOptions]
  }
}

