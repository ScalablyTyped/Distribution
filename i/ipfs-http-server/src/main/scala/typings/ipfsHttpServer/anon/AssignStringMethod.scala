package typings.ipfsHttpServer.anon

import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignStringMethod extends StObject {
  
  var assign: String
  
  /**
    * @param {import('../../types').Request} request
    * @param {import('@hapi/hapi').ResponseToolkit} _h
    */
  def method(request: Request, _h: ResponseToolkit): js.Promise[Value]
}
object AssignStringMethod {
  
  inline def apply(assign: String, method: (Request, ResponseToolkit) => js.Promise[Value]): AssignStringMethod = {
    val __obj = js.Dynamic.literal(assign = assign.asInstanceOf[js.Any], method = js.Any.fromFunction2(method))
    __obj.asInstanceOf[AssignStringMethod]
  }
  
  extension [Self <: AssignStringMethod](x: Self) {
    
    inline def setAssign(value: String): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: (Request, ResponseToolkit) => js.Promise[Value]): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
  }
}
