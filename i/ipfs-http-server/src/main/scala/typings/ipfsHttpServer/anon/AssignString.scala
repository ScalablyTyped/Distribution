package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignString extends StObject {
  
  var assign: String
  
  def method(request: js.Any, _h: js.Any): js.Promise[Format]
}
object AssignString {
  
  inline def apply(assign: String, method: (js.Any, js.Any) => js.Promise[Format]): AssignString = {
    val __obj = js.Dynamic.literal(assign = assign.asInstanceOf[js.Any], method = js.Any.fromFunction2(method))
    __obj.asInstanceOf[AssignString]
  }
  
  extension [Self <: AssignString](x: Self) {
    
    inline def setAssign(value: String): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: (js.Any, js.Any) => js.Promise[Format]): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
  }
}
