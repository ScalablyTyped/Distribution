package typings.instagramPrivateApi

import typings.instagramPrivateApi.chatStickerMod.ChatStickerOptions
import typings.instagramPrivateApi.countdownStickerMod.CountdownStickerOptions
import typings.instagramPrivateApi.hashtagStickerMod.HashtagStickerOptions
import typings.instagramPrivateApi.locationStickerMod.LocationStickerOptions
import typings.instagramPrivateApi.mentionStickerMod.MentionStickerOptions
import typings.instagramPrivateApi.pollStickerMod.PollStickerOptions
import typings.instagramPrivateApi.questionStickerMod.QuestionStickerOptions
import typings.instagramPrivateApi.quizStickerMod.QuizStickerOptions
import typings.instagramPrivateApi.sliderStickerMod.SliderStickerOptions
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
    def chat(options: ChatStickerOptions): ChatSticker = js.native
    def countdown(options: CountdownStickerOptions): CountdownSticker = js.native
    def hashtag(options: HashtagStickerOptions): HashtagSticker = js.native
    def location(options: LocationStickerOptions): LocationSticker = js.native
    def mention(options: MentionStickerOptions): MentionSticker = js.native
    def poll(options: PollStickerOptions): PollSticker = js.native
    def question(options: QuestionStickerOptions): QuestionSticker = js.native
    def quiz(options: QuizStickerOptions): QuizSticker = js.native
    def slider(options: SliderStickerOptions): SliderSticker = js.native
  }
  
  type StickerConfig = js.Any with AnonStorystickerids
}

