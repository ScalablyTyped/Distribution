package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCorrectAnswers extends StObject {
  
  /**
    * A list of correct answers. A quiz response can be automatically graded based on these answers. For single-valued questions, a response is marked correct if it matches any value in this list (in other words, multiple correct answers are possible). For multiple-valued (`CHECKBOX`) questions, a response is marked correct if it contains exactly the values in this list.
    */
  var answers: js.UndefOr[js.Array[SchemaCorrectAnswer]] = js.undefined
}
object SchemaCorrectAnswers {
  
  inline def apply(): SchemaCorrectAnswers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCorrectAnswers]
  }
  
  extension [Self <: SchemaCorrectAnswers](x: Self) {
    
    inline def setAnswers(value: js.Array[SchemaCorrectAnswer]): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
    
    inline def setAnswersUndefined: Self = StObject.set(x, "answers", js.undefined)
    
    inline def setAnswersVarargs(value: SchemaCorrectAnswer*): Self = StObject.set(x, "answers", js.Array(value*))
  }
}
