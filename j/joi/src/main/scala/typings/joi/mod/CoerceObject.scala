package typings.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoerceObject extends StObject {
  
  var from: js.UndefOr[String | js.Array[String]] = js.undefined
  
  def method(value: Any, helpers: CustomHelpers[Any]): CoerceResult
  @JSName("method")
  var method_Original: CoerceFunction
}
object CoerceObject {
  
  inline def apply(method: (/* value */ Any, /* helpers */ CustomHelpers[Any]) => CoerceResult): CoerceObject = {
    val __obj = js.Dynamic.literal(method = js.Any.fromFunction2(method))
    __obj.asInstanceOf[CoerceObject]
  }
  
  extension [Self <: CoerceObject](x: Self) {
    
    inline def setFrom(value: String | js.Array[String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setFromVarargs(value: String*): Self = StObject.set(x, "from", js.Array(value*))
    
    inline def setMethod(value: (/* value */ Any, /* helpers */ CustomHelpers[Any]) => CoerceResult): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
  }
}
