package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.PartialInstaSticker
import typings.instagramPrivateApi.anon.PartialStickerOptionsAtta
import typings.instagramPrivateApi.anon.PartialStickerOptionsMent
import typings.instagramPrivateApi.anon.StickerOptionsAttachmentS
import typings.instagramPrivateApi.anon.StickerOptionsChatSticker
import typings.instagramPrivateApi.anon.StickerOptionsCountdownSt
import typings.instagramPrivateApi.anon.StickerOptionsHashtagStic
import typings.instagramPrivateApi.anon.StickerOptionsLocationSti
import typings.instagramPrivateApi.anon.StickerOptionsMentionStic
import typings.instagramPrivateApi.anon.StickerOptionsPollSticker
import typings.instagramPrivateApi.anon.StickerOptionsQuestionSti
import typings.instagramPrivateApi.anon.StickerOptionsQuizSticker
import typings.instagramPrivateApi.anon.StickerOptionsSliderStick
import typings.instagramPrivateApi.anon.Storystickerids
import typings.instagramPrivateApi.anon.User
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
import typings.utilityTypes.mappedTypesMod.Diff
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
    def attachment(options: StickerOptionsAttachmentS): AttachmentSticker = js.native
    def attachmentFromMedia(mediaInfo: User): AttachmentSticker = js.native
    def attachmentFromMedia(mediaInfo: User, additional: PartialStickerOptionsAtta): AttachmentSticker = js.native
    def chat(options: StickerOptionsChatSticker): ChatSticker = js.native
    def countdown(options: StickerOptionsCountdownSt): CountdownSticker = js.native
    def hashtag(options: StickerOptionsHashtagStic): HashtagSticker = js.native
    def location(options: StickerOptionsLocationSti): LocationSticker = js.native
    def mention(options: StickerOptionsMentionStic): MentionSticker = js.native
    def mentionReel(mediaInfo: User): MentionSticker = js.native
    def mentionReel(mediaInfo: User, additional: PartialStickerOptionsMent): MentionSticker = js.native
    def poll(options: StickerOptionsPollSticker): PollSticker = js.native
    def question(options: StickerOptionsQuestionSti): QuestionSticker = js.native
    def quiz(options: StickerOptionsQuizSticker): QuizSticker = js.native
    def slider(options: StickerOptionsSliderStick): SliderSticker = js.native
  }
  
  type StickerConfig = js.Any with Storystickerids
  type StickerOptions[T /* <: InstaSticker */] = (Diff[T, InstaSticker]) with PartialInstaSticker
}

