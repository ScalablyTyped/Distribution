package typings.ipfsHttpServer.anon

import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Method extends StObject {
  
  var assign: String
  
  /**
    * @param {import('../../types').Request} request
    * @param {import('@hapi/hapi').ResponseToolkit} _h
    */
  def method(request: Request, _h: ResponseToolkit): Key | KeyAny
}
object Method {
  
  inline def apply(assign: String, method: (Request, ResponseToolkit) => Key | KeyAny): Method = {
    val __obj = js.Dynamic.literal(assign = assign.asInstanceOf[js.Any], method = js.Any.fromFunction2(method))
    __obj.asInstanceOf[Method]
  }
  
  extension [Self <: Method](x: Self) {
    
    inline def setAssign(value: String): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: (Request, ResponseToolkit) => Key | KeyAny): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
  }
}
