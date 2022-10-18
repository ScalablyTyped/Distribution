package typings.ipfsHttpServer.anon

import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Handler extends StObject {
  
  def handler(request: Request, h: ResponseToolkit): js.Promise[ResponseObject]
  
  var method: String
  
  var options: Validate
  
  var path: String
}
object Handler {
  
  inline def apply(
    handler: (Request, ResponseToolkit) => js.Promise[ResponseObject],
    method: String,
    options: Validate,
    path: String
  ): Handler = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
  
  extension [Self <: Handler](x: Self) {
    
    inline def setHandler(value: (Request, ResponseToolkit) => js.Promise[ResponseObject]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Validate): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
