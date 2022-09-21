package typings.kahootJsUpdated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuizStart extends StObject {
  
  var gameBlockCount: Double
  
  var kahootLangIsRTL: Boolean
  
  var questionCount: Double
  
  var quizQuestionAnswers: js.Array[Double]
  
  var shouldRemoveSeasonalTheme: Boolean
}
object QuizStart {
  
  inline def apply(
    gameBlockCount: Double,
    kahootLangIsRTL: Boolean,
    questionCount: Double,
    quizQuestionAnswers: js.Array[Double],
    shouldRemoveSeasonalTheme: Boolean
  ): QuizStart = {
    val __obj = js.Dynamic.literal(gameBlockCount = gameBlockCount.asInstanceOf[js.Any], kahootLangIsRTL = kahootLangIsRTL.asInstanceOf[js.Any], questionCount = questionCount.asInstanceOf[js.Any], quizQuestionAnswers = quizQuestionAnswers.asInstanceOf[js.Any], shouldRemoveSeasonalTheme = shouldRemoveSeasonalTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuizStart]
  }
  
  extension [Self <: QuizStart](x: Self) {
    
    inline def setGameBlockCount(value: Double): Self = StObject.set(x, "gameBlockCount", value.asInstanceOf[js.Any])
    
    inline def setKahootLangIsRTL(value: Boolean): Self = StObject.set(x, "kahootLangIsRTL", value.asInstanceOf[js.Any])
    
    inline def setQuestionCount(value: Double): Self = StObject.set(x, "questionCount", value.asInstanceOf[js.Any])
    
    inline def setQuizQuestionAnswers(value: js.Array[Double]): Self = StObject.set(x, "quizQuestionAnswers", value.asInstanceOf[js.Any])
    
    inline def setQuizQuestionAnswersVarargs(value: Double*): Self = StObject.set(x, "quizQuestionAnswers", js.Array(value*))
    
    inline def setShouldRemoveSeasonalTheme(value: Boolean): Self = StObject.set(x, "shouldRemoveSeasonalTheme", value.asInstanceOf[js.Any])
  }
}
