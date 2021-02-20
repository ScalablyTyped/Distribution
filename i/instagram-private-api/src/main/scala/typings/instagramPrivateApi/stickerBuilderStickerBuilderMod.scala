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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stickerBuilderStickerBuilderMod {
  
  @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder")
  @js.native
  class StickerBuilder () extends StObject {
    
    def add(sticker: InstaSticker): this.type = js.native
    
    def build(): StickerConfig = js.native
    
    var stickers: js.Any = js.native
  }
  /* static members */
  object StickerBuilder {
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.attachment")
    @js.native
    def attachment(options: StickerOptionsAttachmentS): AttachmentSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.attachmentFromMedia")
    @js.native
    def attachmentFromMedia(mediaInfo: User): AttachmentSticker = js.native
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.attachmentFromMedia")
    @js.native
    def attachmentFromMedia(mediaInfo: User, additional: PartialStickerOptionsAtta): AttachmentSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.chat")
    @js.native
    def chat(options: StickerOptionsChatSticker): ChatSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.countdown")
    @js.native
    def countdown(options: StickerOptionsCountdownSt): CountdownSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.hashtag")
    @js.native
    def hashtag(options: StickerOptionsHashtagStic): HashtagSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.location")
    @js.native
    def location(options: StickerOptionsLocationSti): LocationSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.mention")
    @js.native
    def mention(options: StickerOptionsMentionStic): MentionSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.mentionReel")
    @js.native
    def mentionReel(mediaInfo: User): MentionSticker = js.native
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.mentionReel")
    @js.native
    def mentionReel(mediaInfo: User, additional: PartialStickerOptionsMent): MentionSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.poll")
    @js.native
    def poll(options: StickerOptionsPollSticker): PollSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.question")
    @js.native
    def question(options: StickerOptionsQuestionSti): QuestionSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.quiz")
    @js.native
    def quiz(options: StickerOptionsQuizSticker): QuizSticker = js.native
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder.slider")
    @js.native
    def slider(options: StickerOptionsSliderStick): SliderSticker = js.native
  }
  
  type StickerConfig = js.Any with Storystickerids
  
  type StickerOptions[T /* <: InstaSticker */] = (Diff[T, InstaSticker]) with PartialInstaSticker
}
