package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder", JSImport.Namespace)
@js.native
object stickerBuilderMod extends js.Object {
  @js.native
  class AttachmentSticker ()
    extends typings.instagramPrivateApi.attachmentStickerMod.AttachmentSticker
  
  @js.native
  class ChatSticker ()
    extends typings.instagramPrivateApi.chatStickerMod.ChatSticker
  
  @js.native
  class CountdownSticker ()
    extends typings.instagramPrivateApi.countdownStickerMod.CountdownSticker
  
  @js.native
  class HashtagSticker ()
    extends typings.instagramPrivateApi.hashtagStickerMod.HashtagSticker
  
  @js.native
  abstract class InstaSticker ()
    extends typings.instagramPrivateApi.instaStickerMod.InstaSticker
  
  @js.native
  class LocationSticker ()
    extends typings.instagramPrivateApi.locationStickerMod.LocationSticker
  
  @js.native
  class MentionSticker ()
    extends typings.instagramPrivateApi.mentionStickerMod.MentionSticker
  
  @js.native
  class PollSticker ()
    extends typings.instagramPrivateApi.pollStickerMod.PollSticker
  
  @js.native
  class QuestionSticker ()
    extends typings.instagramPrivateApi.questionStickerMod.QuestionSticker
  
  @js.native
  class QuizSticker ()
    extends typings.instagramPrivateApi.quizStickerMod.QuizSticker
  
  @js.native
  class SliderSticker ()
    extends typings.instagramPrivateApi.sliderStickerMod.SliderSticker
  
  @js.native
  class StickerBuilder ()
    extends typings.instagramPrivateApi.stickerBuilderStickerBuilderMod.StickerBuilder
  
  /* static members */
  @js.native
  object StickerBuilder extends js.Object {
    def attachment(options: DiffAttachmentStickerInstaSticker): typings.instagramPrivateApi.stickersMod.AttachmentSticker = js.native
    def attachmentFromMedia(mediaInfo: AnonPkUser): typings.instagramPrivateApi.stickersMod.AttachmentSticker = js.native
    def attachmentFromMedia(mediaInfo: AnonPkUser, additional: PartialAttachmentSticker): typings.instagramPrivateApi.stickersMod.AttachmentSticker = js.native
    def chat(options: DiffChatStickerInstaSticker): typings.instagramPrivateApi.stickersMod.ChatSticker = js.native
    def countdown(options: DiffCountdownStickerInstaSticker): typings.instagramPrivateApi.stickersMod.CountdownSticker = js.native
    def hashtag(options: DiffHashtagStickerInstaSticker): typings.instagramPrivateApi.stickersMod.HashtagSticker = js.native
    def location(options: DiffLocationStickerInstaSticker): typings.instagramPrivateApi.stickersMod.LocationSticker = js.native
    def mention(options: DiffMentionStickerInstaSticker): typings.instagramPrivateApi.stickersMod.MentionSticker = js.native
    def mentionReel(mediaInfo: AnonPkUser): typings.instagramPrivateApi.stickersMod.MentionSticker = js.native
    def mentionReel(mediaInfo: AnonPkUser, additional: PartialMentionSticker): typings.instagramPrivateApi.stickersMod.MentionSticker = js.native
    def poll(options: DiffPollStickerInstaSticker): typings.instagramPrivateApi.stickersMod.PollSticker = js.native
    def question(options: DiffQuestionStickerInstaSticker): typings.instagramPrivateApi.stickersMod.QuestionSticker = js.native
    def quiz(options: DiffQuizStickerInstaSticker): typings.instagramPrivateApi.stickersMod.QuizSticker = js.native
    def slider(options: DiffSliderStickerInstaSticker): typings.instagramPrivateApi.stickersMod.SliderSticker = js.native
  }
  
}

