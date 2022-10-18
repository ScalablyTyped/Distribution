package typings.ipfsHttpServer.anon

import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var assign: String
  
  def method(request: Request, _h: ResponseToolkit): js.Promise[DataAny]
}
object `0` {
  
  inline def apply(assign: String, method: (Request, ResponseToolkit) => js.Promise[DataAny]): `0` = {
    val __obj = js.Dynamic.literal(assign = assign.asInstanceOf[js.Any], method = js.Any.fromFunction2(method))
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setAssign(value: String): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: (Request, ResponseToolkit) => js.Promise[DataAny]): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
  }
}
