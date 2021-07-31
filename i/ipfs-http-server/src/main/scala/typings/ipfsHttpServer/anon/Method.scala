package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Method extends StObject {
  
  var assign: String
  
  def method(request: js.Any, _h: js.Any): js.Any
}
object Method {
  
  @scala.inline
  def apply(assign: String, method: (js.Any, js.Any) => js.Any): Method = {
    val __obj = js.Dynamic.literal(assign = assign.asInstanceOf[js.Any], method = js.Any.fromFunction2(method))
    __obj.asInstanceOf[Method]
  }
  
  @scala.inline
  implicit class MethodMutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssign(value: String): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
  }
}
