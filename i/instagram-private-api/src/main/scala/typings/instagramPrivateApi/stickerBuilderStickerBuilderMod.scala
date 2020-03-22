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
    def attachment(options: DiffAttachmentStickerInst): AttachmentSticker = js.native
    def attachmentFromMedia(mediaInfo: AnonUser): AttachmentSticker = js.native
    def attachmentFromMedia(mediaInfo: AnonUser, additional: PartialAttachmentSticker): AttachmentSticker = js.native
    def chat(options: DiffChatStickerInstaStick): ChatSticker = js.native
    def countdown(options: DiffCountdownStickerInsta): CountdownSticker = js.native
    def hashtag(options: DiffHashtagStickerInstaSt): HashtagSticker = js.native
    def location(options: DiffLocationStickerInstaS): LocationSticker = js.native
    def mention(options: DiffMentionStickerInstaSt): MentionSticker = js.native
    def mentionReel(mediaInfo: AnonUser): MentionSticker = js.native
    def mentionReel(mediaInfo: AnonUser, additional: PartialMentionSticker): MentionSticker = js.native
    def poll(options: DiffPollStickerInstaStick): PollSticker = js.native
    def question(options: DiffQuestionStickerInstaS): QuestionSticker = js.native
    def quiz(options: DiffQuizStickerInstaStick): QuizSticker = js.native
    def slider(options: DiffSliderStickerInstaSti): SliderSticker = js.native
  }
  
  type StickerConfig = js.Any with AnonStorystickerids
}

