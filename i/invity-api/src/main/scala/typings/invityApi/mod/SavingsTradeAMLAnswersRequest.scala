package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsTradeAMLAnswersRequest extends StObject {
  
  var answers: js.Array[SavingsTradeAMLAnswer]
}
object SavingsTradeAMLAnswersRequest {
  
  inline def apply(answers: js.Array[SavingsTradeAMLAnswer]): SavingsTradeAMLAnswersRequest = {
    val __obj = js.Dynamic.literal(answers = answers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsTradeAMLAnswersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingsTradeAMLAnswersRequest] (val x: Self) extends AnyVal {
    
    inline def setAnswers(value: js.Array[SavingsTradeAMLAnswer]): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
    
    inline def setAnswersVarargs(value: SavingsTradeAMLAnswer*): Self = StObject.set(x, "answers", js.Array(value*))
  }
}
