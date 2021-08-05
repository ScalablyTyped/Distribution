package typings.mathjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parser extends StObject {
  
  def clear(): scala.Unit
  
  def evaluate(expr: String): js.Any
  
  def get(variable: String): js.Any
  
  def getAll(): StringDictionary[js.Any]
  
  def set(variable: String, value: js.Any): scala.Unit
}
object Parser {
  
  inline def apply(
    clear: () => scala.Unit,
    evaluate: String => js.Any,
    get: String => js.Any,
    getAll: () => StringDictionary[js.Any],
    set: (String, js.Any) => scala.Unit
  ): Parser = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), evaluate = js.Any.fromFunction1(evaluate), get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction0(getAll), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Parser]
  }
  
  extension [Self <: Parser](x: Self) {
    
    inline def setClear(value: () => scala.Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setEvaluate(value: String => js.Any): Self = StObject.set(x, "evaluate", js.Any.fromFunction1(value))
    
    inline def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetAll(value: () => StringDictionary[js.Any]): Self = StObject.set(x, "getAll", js.Any.fromFunction0(value))
    
    inline def setSet(value: (String, js.Any) => scala.Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
