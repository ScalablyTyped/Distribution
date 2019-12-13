package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickerDashBuilderMod.StickerConfig
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersChatDotStickerMod.ChatStickerOptions
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersCountdownDotStickerMod.CountdownStickerOptions
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersHashtagDotStickerMod.HashtagStickerOptions
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersLocationDotStickerMod.LocationStickerOptions
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMentionDotStickerMod.MentionStickerOptions
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.ChatSticker
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.CountdownSticker
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.HashtagSticker
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.InstaSticker
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.LocationSticker
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.MentionSticker
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.PollSticker
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.QuestionSticker
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.QuizSticker
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.SliderSticker
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersPollDotStickerMod.PollStickerOptions
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersQuestionDotStickerMod.QuestionStickerOptions
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersQuizDotStickerMod.QuizStickerOptions
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersSliderDotStickerMod.SliderStickerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", JSImport.Namespace)
@js.native
object distStickerDashBuilderStickerDashBuilderMod extends js.Object {
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
  
  type StickerConfig = js.Any with Anon_Storystickerids
}

