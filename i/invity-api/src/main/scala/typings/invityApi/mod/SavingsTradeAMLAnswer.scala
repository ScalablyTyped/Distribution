package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsTradeAMLAnswer extends StObject {
  
  var answer: String
  
  var key: String
}
object SavingsTradeAMLAnswer {
  
  inline def apply(answer: String, key: String): SavingsTradeAMLAnswer = {
    val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsTradeAMLAnswer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingsTradeAMLAnswer] (val x: Self) extends AnyVal {
    
    inline def setAnswer(value: String): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
