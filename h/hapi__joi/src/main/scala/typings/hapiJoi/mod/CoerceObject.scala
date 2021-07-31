package typings.hapiJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoerceObject extends StObject {
  
  var from: js.UndefOr[String | js.Array[String]] = js.undefined
  
  def method(value: js.Any, helpers: CustomHelpers[js.Any]): CoerceResult
  @JSName("method")
  var method_Original: CoerceFunction
}
object CoerceObject {
  
  @scala.inline
  def apply(method: (/* value */ js.Any, /* helpers */ CustomHelpers[js.Any]) => CoerceResult): CoerceObject = {
    val __obj = js.Dynamic.literal(method = js.Any.fromFunction2(method))
    __obj.asInstanceOf[CoerceObject]
  }
  
  @scala.inline
  implicit class CoerceObjectMutableBuilder[Self <: CoerceObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: String | js.Array[String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setFromVarargs(value: String*): Self = StObject.set(x, "from", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: (/* value */ js.Any, /* helpers */ CustomHelpers[js.Any]) => CoerceResult): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
  }
}
