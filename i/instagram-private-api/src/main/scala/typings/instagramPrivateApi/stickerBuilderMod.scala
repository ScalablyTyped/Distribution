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
    def attachment(options: StickerOptionsAttachmentS): typings.instagramPrivateApi.stickersMod.AttachmentSticker = js.native
    def attachmentFromMedia(mediaInfo: AnonUser): typings.instagramPrivateApi.stickersMod.AttachmentSticker = js.native
    def attachmentFromMedia(mediaInfo: AnonUser, additional: PartialStickerOptionsAtta): typings.instagramPrivateApi.stickersMod.AttachmentSticker = js.native
    def chat(options: StickerOptionsChatSticker): typings.instagramPrivateApi.stickersMod.ChatSticker = js.native
    def countdown(options: StickerOptionsCountdownSt): typings.instagramPrivateApi.stickersMod.CountdownSticker = js.native
    def hashtag(options: StickerOptionsHashtagStic): typings.instagramPrivateApi.stickersMod.HashtagSticker = js.native
    def location(options: StickerOptionsLocationSti): typings.instagramPrivateApi.stickersMod.LocationSticker = js.native
    def mention(options: StickerOptionsMentionStic): typings.instagramPrivateApi.stickersMod.MentionSticker = js.native
    def mentionReel(mediaInfo: AnonUser): typings.instagramPrivateApi.stickersMod.MentionSticker = js.native
    def mentionReel(mediaInfo: AnonUser, additional: PartialStickerOptionsMent): typings.instagramPrivateApi.stickersMod.MentionSticker = js.native
    def poll(options: StickerOptionsPollSticker): typings.instagramPrivateApi.stickersMod.PollSticker = js.native
    def question(options: StickerOptionsQuestionSti): typings.instagramPrivateApi.stickersMod.QuestionSticker = js.native
    def quiz(options: StickerOptionsQuizSticker): typings.instagramPrivateApi.stickersMod.QuizSticker = js.native
    def slider(options: StickerOptionsSliderStick): typings.instagramPrivateApi.stickersMod.SliderSticker = js.native
  }
  
}

