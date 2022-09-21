package typings.kahootJsUpdated.anon

import typings.kahootJsUpdated.mod.QuestionEnd
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultQuizData extends StObject {
  
  var defaultQuizData: QuizQuestionAnswers & (Record[String, Any])
  
  var getReady: js.UndefOr[Any] = js.undefined
  
  var revealAnswer: js.UndefOr[QuestionEnd] = js.undefined
}
object DefaultQuizData {
  
  inline def apply(defaultQuizData: QuizQuestionAnswers & (Record[String, Any])): DefaultQuizData = {
    val __obj = js.Dynamic.literal(defaultQuizData = defaultQuizData.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultQuizData]
  }
  
  extension [Self <: DefaultQuizData](x: Self) {
    
    inline def setDefaultQuizData(value: QuizQuestionAnswers & (Record[String, Any])): Self = StObject.set(x, "defaultQuizData", value.asInstanceOf[js.Any])
    
    inline def setGetReady(value: Any): Self = StObject.set(x, "getReady", value.asInstanceOf[js.Any])
    
    inline def setGetReadyUndefined: Self = StObject.set(x, "getReady", js.undefined)
    
    inline def setRevealAnswer(value: QuestionEnd): Self = StObject.set(x, "revealAnswer", value.asInstanceOf[js.Any])
    
    inline def setRevealAnswerUndefined: Self = StObject.set(x, "revealAnswer", js.undefined)
  }
}
