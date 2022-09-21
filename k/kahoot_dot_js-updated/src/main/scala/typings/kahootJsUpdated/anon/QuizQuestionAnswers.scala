package typings.kahootJsUpdated.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuizQuestionAnswers extends StObject {
  
  var quizQuestionAnswers: js.Array[Double]
}
object QuizQuestionAnswers {
  
  inline def apply(quizQuestionAnswers: js.Array[Double]): QuizQuestionAnswers = {
    val __obj = js.Dynamic.literal(quizQuestionAnswers = quizQuestionAnswers.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuizQuestionAnswers]
  }
  
  extension [Self <: QuizQuestionAnswers](x: Self) {
    
    inline def setQuizQuestionAnswers(value: js.Array[Double]): Self = StObject.set(x, "quizQuestionAnswers", value.asInstanceOf[js.Any])
    
    inline def setQuizQuestionAnswersVarargs(value: Double*): Self = StObject.set(x, "quizQuestionAnswers", js.Array(value*))
  }
}
