package typings.instagramPrivateApi

import typings.instagramPrivateApi.stickersMod.AttachmentSticker
import typings.instagramPrivateApi.stickersMod.ChatSticker
import typings.instagramPrivateApi.stickersMod.CountdownSticker
import typings.instagramPrivateApi.stickersMod.HashtagSticker
import typings.instagramPrivateApi.stickersMod.InstaSticker
import typings.instagramPrivateApi.stickersMod.LocationSticker
import typings.instagramPrivateApi.stickersMod.MentionSticker
import typings.instagramPrivateApi.stickersMod.PollSticker
import typings.instagramPrivateApi.stickersMod.QuestionSticker
import typings.instagramPrivateApi.stickersMod.QuizSticker
import typings.instagramPrivateApi.stickersMod.SliderSticker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", JSImport.Namespace)
@js.native
object stickerBuilderStickerBuilderMod extends js.Object {
  @js.native
  class StickerBuilder () extends js.Object {
    var stickers: js.Any = js.native
    def add(sticker: InstaSticker): this.type = js.native
    def build(): StickerConfig = js.native
  }
  
  /* static members */
  @js.native
  object StickerBuilder extends js.Object {
    def attachment(options: DiffAttachmentStickerInstaSticker): AttachmentSticker = js.native
    def attachmentFromMedia(mediaInfo: AnonPkUser): AttachmentSticker = js.native
    def attachmentFromMedia(mediaInfo: AnonPkUser, additional: PartialAttachmentSticker): AttachmentSticker = js.native
    def chat(options: DiffChatStickerInstaSticker): ChatSticker = js.native
    def countdown(options: DiffCountdownStickerInstaSticker): CountdownSticker = js.native
    def hashtag(options: DiffHashtagStickerInstaSticker): HashtagSticker = js.native
    def location(options: DiffLocationStickerInstaSticker): LocationSticker = js.native
    def mention(options: DiffMentionStickerInstaSticker): MentionSticker = js.native
    def mentionReel(mediaInfo: AnonPkUser): MentionSticker = js.native
    def mentionReel(mediaInfo: AnonPkUser, additional: PartialMentionSticker): MentionSticker = js.native
    def poll(options: DiffPollStickerInstaSticker): PollSticker = js.native
    def question(options: DiffQuestionStickerInstaSticker): QuestionSticker = js.native
    def quiz(options: DiffQuizStickerInstaSticker): QuizSticker = js.native
    def slider(options: DiffSliderStickerInstaSticker): SliderSticker = js.native
  }
  
  type StickerConfig = js.Any with AnonStorystickerids
}

