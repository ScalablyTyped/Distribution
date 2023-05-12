package typings.ipfsHttpServer.anon

import typings.hapiHapi.libTypesRequestMod.ReqRefDefaults
import typings.hapiHapi.libTypesRequestMod.Request
import typings.hapiHapi.libTypesResponseMod.ResponseObject
import typings.hapiHapi.libTypesResponseMod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandlerMethod extends StObject {
  
  def handler(_request: Request[ReqRefDefaults], h: ResponseToolkit[ReqRefDefaults]): ResponseObject
  
  var method: String
  
  var path: String
}
object HandlerMethod {
  
  inline def apply(
    handler: (Request[ReqRefDefaults], ResponseToolkit[ReqRefDefaults]) => ResponseObject,
    method: String,
    path: String
  ): HandlerMethod = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HandlerMethod] (val x: Self) extends AnyVal {
    
    inline def setHandler(value: (Request[ReqRefDefaults], ResponseToolkit[ReqRefDefaults]) => ResponseObject): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
