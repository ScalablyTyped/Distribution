package typings.ipfsHttpServer.anon

import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path extends StObject {
  
  /**
    * @param {import('../../types').Request} request
    * @param {import('@hapi/hapi').ResponseToolkit} h
    */
  def handler(request: Request, h: ResponseToolkit): js.Promise[ResponseObject]
  
  var method: String
  
  var path: String
}
object Path {
  
  inline def apply(handler: (Request, ResponseToolkit) => js.Promise[ResponseObject], method: String, path: String): Path = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  extension [Self <: Path](x: Self) {
    
    inline def setHandler(value: (Request, ResponseToolkit) => js.Promise[ResponseObject]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
