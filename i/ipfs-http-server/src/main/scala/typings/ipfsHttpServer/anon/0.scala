package typings.ipfsHttpServer.anon

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var assign: String
  
  def method(request: js.Any, _h: js.Any): js.Promise[Buffer]
}
object `0` {
  
  inline def apply(assign: String, method: (js.Any, js.Any) => js.Promise[Buffer]): `0` = {
    val __obj = js.Dynamic.literal(assign = assign.asInstanceOf[js.Any], method = js.Any.fromFunction2(method))
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setAssign(value: String): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: (js.Any, js.Any) => js.Promise[Buffer]): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
  }
}
