package typings.kahootJsUpdated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuestionStart
  extends StObject
     with QuestionReady {
  
  /** @inheritdoc */
  def answer(choice: Double): js.Promise[LiveEventTimetrack]
  /** @inheritdoc */
  @JSName("answer")
  var answer_Original: js.Function1[/* choice */ Double, js.Promise[LiveEventTimetrack]]
}
object QuestionStart {
  
  inline def apply(
    answer: /* choice */ Double => js.Promise[LiveEventTimetrack],
    currentQuestionAnswerCount: Double,
    gameBlockIndex: Double,
    gameBlockLayout: GameBlockLayout,
    gameBlockType: GameBlockType,
    getReadyTimeAvailable: Double,
    getReadyTimeRemaining: Double,
    index: Double,
    layout: String,
    numberOfAnswersAllowed: Double,
    numberOfChoices: Double,
    questionIndex: Double,
    questionRestricted: Boolean,
    timeAvailable: Double,
    timeLeft: Double,
    timeRemaining: Double,
    `type`: String,
    video: QuizVideo
  ): QuestionStart = {
    val __obj = js.Dynamic.literal(answer = js.Any.fromFunction1(answer), currentQuestionAnswerCount = currentQuestionAnswerCount.asInstanceOf[js.Any], gameBlockIndex = gameBlockIndex.asInstanceOf[js.Any], gameBlockLayout = gameBlockLayout.asInstanceOf[js.Any], gameBlockType = gameBlockType.asInstanceOf[js.Any], getReadyTimeAvailable = getReadyTimeAvailable.asInstanceOf[js.Any], getReadyTimeRemaining = getReadyTimeRemaining.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], numberOfAnswersAllowed = numberOfAnswersAllowed.asInstanceOf[js.Any], numberOfChoices = numberOfChoices.asInstanceOf[js.Any], questionIndex = questionIndex.asInstanceOf[js.Any], questionRestricted = questionRestricted.asInstanceOf[js.Any], timeAvailable = timeAvailable.asInstanceOf[js.Any], timeLeft = timeLeft.asInstanceOf[js.Any], timeRemaining = timeRemaining.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionStart]
  }
  
  extension [Self <: QuestionStart](x: Self) {
    
    inline def setAnswer(value: /* choice */ Double => js.Promise[LiveEventTimetrack]): Self = StObject.set(x, "answer", js.Any.fromFunction1(value))
  }
}
