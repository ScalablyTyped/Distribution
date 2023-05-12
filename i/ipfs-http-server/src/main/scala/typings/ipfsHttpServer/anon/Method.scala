package typings.ipfsHttpServer.anon

import typings.hapiHapi.libTypesRequestMod.ReqRefDefaults
import typings.hapiHapi.libTypesRequestMod.Request
import typings.hapiHapi.libTypesResponseMod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Method extends StObject {
  
  var assign: String
  
  /**
    * @param {import('../../types').Request} request
    * @param {import('@hapi/hapi').ResponseToolkit} _h
    */
  def method(request: Request[ReqRefDefaults], _h: ResponseToolkit[ReqRefDefaults]): Key | KeyAny
}
object Method {
  
  inline def apply(assign: String, method: (Request[ReqRefDefaults], ResponseToolkit[ReqRefDefaults]) => Key | KeyAny): Method = {
    val __obj = js.Dynamic.literal(assign = assign.asInstanceOf[js.Any], method = js.Any.fromFunction2(method))
    __obj.asInstanceOf[Method]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
    
    inline def setAssign(value: String): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: (Request[ReqRefDefaults], ResponseToolkit[ReqRefDefaults]) => Key | KeyAny): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
  }
}
