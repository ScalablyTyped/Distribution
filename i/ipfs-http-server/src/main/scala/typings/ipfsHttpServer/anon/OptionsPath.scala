package typings.ipfsHttpServer.anon

import typings.hapiHapi.mod.ReqRefDefaults
import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsPath extends StObject {
  
  /**
    * @param {import('../../types').Request} _request
    * @param {import('@hapi/hapi').ResponseToolkit} h
    */
  def handler(_request: Request[ReqRefDefaults], h: ResponseToolkit[ReqRefDefaults]): ResponseObject
  
  var method: String
  
  var options: Unit
  
  var path: String
}
object OptionsPath {
  
  inline def apply(
    handler: (Request[ReqRefDefaults], ResponseToolkit[ReqRefDefaults]) => ResponseObject,
    method: String,
    options: Unit,
    path: String
  ): OptionsPath = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsPath]
  }
  
  extension [Self <: OptionsPath](x: Self) {
    
    inline def setHandler(value: (Request[ReqRefDefaults], ResponseToolkit[ReqRefDefaults]) => ResponseObject): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Unit): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
