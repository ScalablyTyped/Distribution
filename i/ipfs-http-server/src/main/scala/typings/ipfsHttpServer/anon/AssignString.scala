package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignString extends StObject {
  
  var assign: String = js.native
  
  def method(request: js.Any, _h: js.Any): js.Promise[Format] = js.native
}
object AssignString {
  
  @scala.inline
  def apply(assign: String, method: (js.Any, js.Any) => js.Promise[Format]): AssignString = {
    val __obj = js.Dynamic.literal(assign = assign.asInstanceOf[js.Any], method = js.Any.fromFunction2(method))
    __obj.asInstanceOf[AssignString]
  }
  
  @scala.inline
  implicit class AssignStringMutableBuilder[Self <: AssignString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssign(value: String): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: (js.Any, js.Any) => js.Promise[Format]): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
  }
}
