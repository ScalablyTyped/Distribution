package typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersQuizDotStickerMod

import typings.instagramDashPrivateDashApi.Anon_Count
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersInstaDashStickerMod.InstaSticker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder/stickers/quiz.sticker", "QuizSticker")
@js.native
class QuizSticker ()
  extends InstaSticker
     with QuizStickerOptions {
  /* CompleteClass */
  override var correctAnswer: Double = js.native
  @JSName("endBackgroundColor")
  var endBackgroundColor_QuizSticker: String = js.native
  /* CompleteClass */
  override var options: js.Array[Anon_Count | String] = js.native
  @JSName("options")
  var options_QuizSticker: js.Array[Anon_Count] = js.native
  /* CompleteClass */
  override var question: String = js.native
  @JSName("startBackgroundColor")
  var startBackgroundColor_QuizSticker: String = js.native
  @JSName("textColor")
  var textColor_QuizSticker: String = js.native
  var viewerAnswer: Double = js.native
  var viewerCanAnswer: Boolean = js.native
}

