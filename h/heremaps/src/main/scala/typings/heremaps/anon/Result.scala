package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result extends StObject {
  
  var Result: js.Array[Location]
}
object Result {
  
  inline def apply(Result: js.Array[Location]): Result = {
    val __obj = js.Dynamic.literal(Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  extension [Self <: Result](x: Self) {
    
    inline def setResult(value: js.Array[Location]): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: Location*): Self = StObject.set(x, "Result", js.Array(value*))
  }
}
