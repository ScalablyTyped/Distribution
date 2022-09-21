package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTextAnswers extends StObject {
  
  /**
    * Output only. Answers to a question. For multiple-value ChoiceQuestions, each answer is a separate value.
    */
  var answers: js.UndefOr[js.Array[SchemaTextAnswer]] = js.undefined
}
object SchemaTextAnswers {
  
  inline def apply(): SchemaTextAnswers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextAnswers]
  }
  
  extension [Self <: SchemaTextAnswers](x: Self) {
    
    inline def setAnswers(value: js.Array[SchemaTextAnswer]): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
    
    inline def setAnswersUndefined: Self = StObject.set(x, "answers", js.undefined)
    
    inline def setAnswersVarargs(value: SchemaTextAnswer*): Self = StObject.set(x, "answers", js.Array(value*))
  }
}
