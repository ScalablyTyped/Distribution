package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHTTPGetAction extends StObject {
  
  /**
    * (Optional) Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
    */
  var host: js.UndefOr[String | Null] = js.undefined
  
  /**
    * (Optional) Custom headers to set in the request. HTTP allows repeated headers.
    */
  var httpHeaders: js.UndefOr[js.Array[SchemaHTTPHeader]] = js.undefined
  
  /**
    * (Optional) Path to access on the HTTP server.
    */
  var path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * (Optional) Scheme to use for connecting to the host. Defaults to HTTP.
    */
  var scheme: js.UndefOr[String | Null] = js.undefined
}
object SchemaHTTPGetAction {
  
  inline def apply(): SchemaHTTPGetAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHTTPGetAction]
  }
  
  extension [Self <: SchemaHTTPGetAction](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostNull: Self = StObject.set(x, "host", null)
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHttpHeaders(value: js.Array[SchemaHTTPHeader]): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
    
    inline def setHttpHeadersUndefined: Self = StObject.set(x, "httpHeaders", js.undefined)
    
    inline def setHttpHeadersVarargs(value: SchemaHTTPHeader*): Self = StObject.set(x, "httpHeaders", js.Array(value*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeNull: Self = StObject.set(x, "scheme", null)
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
