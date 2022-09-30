package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsTradeAMLQuestion extends StObject {
  
  var answerOptions: js.Array[String]
  
  var key: String
  
  var label: String
}
object SavingsTradeAMLQuestion {
  
  inline def apply(answerOptions: js.Array[String], key: String, label: String): SavingsTradeAMLQuestion = {
    val __obj = js.Dynamic.literal(answerOptions = answerOptions.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsTradeAMLQuestion]
  }
  
  extension [Self <: SavingsTradeAMLQuestion](x: Self) {
    
    inline def setAnswerOptions(value: js.Array[String]): Self = StObject.set(x, "answerOptions", value.asInstanceOf[js.Any])
    
    inline def setAnswerOptionsVarargs(value: String*): Self = StObject.set(x, "answerOptions", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
