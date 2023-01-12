package typings.kahootJsUpdated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuizInfo
  extends StObject
     with QuizStart {
  
  var currentQuestion: QuestionReady
}
object QuizInfo {
  
  inline def apply(
    currentQuestion: QuestionReady,
    gameBlockCount: Double,
    kahootLangIsRTL: Boolean,
    questionCount: Double,
    quizQuestionAnswers: js.Array[Double],
    shouldRemoveSeasonalTheme: Boolean
  ): QuizInfo = {
    val __obj = js.Dynamic.literal(currentQuestion = currentQuestion.asInstanceOf[js.Any], gameBlockCount = gameBlockCount.asInstanceOf[js.Any], kahootLangIsRTL = kahootLangIsRTL.asInstanceOf[js.Any], questionCount = questionCount.asInstanceOf[js.Any], quizQuestionAnswers = quizQuestionAnswers.asInstanceOf[js.Any], shouldRemoveSeasonalTheme = shouldRemoveSeasonalTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuizInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuizInfo] (val x: Self) extends AnyVal {
    
    inline def setCurrentQuestion(value: QuestionReady): Self = StObject.set(x, "currentQuestion", value.asInstanceOf[js.Any])
  }
}
