package typings.ipfsHttpServer.anon

import typings.hapiHapi.mod.ReqRefDefaults
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
  def method(request: Request[ReqRefDefaults], _h: ResponseToolkit[ReqRefDefaults]): js.Promise[Value]
}
object AssignStringMethod {
  
  inline def apply(
    assign: String,
    method: (Request[ReqRefDefaults], ResponseToolkit[ReqRefDefaults]) => js.Promise[Value]
  ): AssignStringMethod = {
    val __obj = js.Dynamic.literal(assign = assign.asInstanceOf[js.Any], method = js.Any.fromFunction2(method))
    __obj.asInstanceOf[AssignStringMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssignStringMethod] (val x: Self) extends AnyVal {
    
    inline def setAssign(value: String): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: (Request[ReqRefDefaults], ResponseToolkit[ReqRefDefaults]) => js.Promise[Value]): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
  }
}
