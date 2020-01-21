package typings.instagramPrivateApi.quizStickerMod

import typings.instagramPrivateApi.AnonCount
import typings.instagramPrivateApi.instaStickerMod.InstaSticker
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
  override var options: js.Array[AnonCount | String] = js.native
  @JSName("options")
  var options_QuizSticker: js.Array[AnonCount] = js.native
  /* CompleteClass */
  override var question: String = js.native
  @JSName("startBackgroundColor")
  var startBackgroundColor_QuizSticker: String = js.native
  @JSName("textColor")
  var textColor_QuizSticker: String = js.native
  var viewerAnswer: Double = js.native
  var viewerCanAnswer: Boolean = js.native
}

