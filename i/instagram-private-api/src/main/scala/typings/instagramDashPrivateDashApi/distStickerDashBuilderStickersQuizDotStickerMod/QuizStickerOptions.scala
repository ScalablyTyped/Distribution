package typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersQuizDotStickerMod

import typings.instagramDashPrivateDashApi.Anon_Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuizStickerOptions extends js.Object {
  var correctAnswer: Double
  var endBackgroundColor: js.UndefOr[String] = js.undefined
  var options: js.Array[Anon_Count | String]
  var question: String
  var startBackgroundColor: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object QuizStickerOptions {
  @scala.inline
  def apply(
    correctAnswer: Double,
    options: js.Array[Anon_Count | String],
    question: String,
    endBackgroundColor: String = null,
    startBackgroundColor: String = null,
    textColor: String = null
  ): QuizStickerOptions = {
    val __obj = js.Dynamic.literal(correctAnswer = correctAnswer.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any])
    if (endBackgroundColor != null) __obj.updateDynamic("endBackgroundColor")(endBackgroundColor.asInstanceOf[js.Any])
    if (startBackgroundColor != null) __obj.updateDynamic("startBackgroundColor")(startBackgroundColor.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuizStickerOptions]
  }
}

