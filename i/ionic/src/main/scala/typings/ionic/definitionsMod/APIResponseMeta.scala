package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APIResponseMeta extends StObject {
  
  var request_id: String
  
  var status: Double
  
  var version: String
}
object APIResponseMeta {
  
  inline def apply(request_id: String, status: Double, version: String): APIResponseMeta = {
    val __obj = js.Dynamic.literal(request_id = request_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponseMeta]
  }
  
  extension [Self <: APIResponseMeta](x: Self) {
    
    inline def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
