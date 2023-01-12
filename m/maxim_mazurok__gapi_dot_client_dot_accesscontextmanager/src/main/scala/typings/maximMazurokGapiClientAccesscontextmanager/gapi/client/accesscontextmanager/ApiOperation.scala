package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiOperation extends StObject {
  
  /**
    * API methods or permissions to allow. Method or permission must belong to the service specified by `service_name` field. A single MethodSelector entry with `*` specified for the
    * `method` field will allow all methods AND permissions for the service specified in `service_name`.
    */
  var methodSelectors: js.UndefOr[js.Array[MethodSelector]] = js.undefined
  
  /**
    * The name of the API whose methods or permissions the IngressPolicy or EgressPolicy want to allow. A single ApiOperation with `service_name` field set to `*` will allow all methods
    * AND permissions for all services.
    */
  var serviceName: js.UndefOr[String] = js.undefined
}
object ApiOperation {
  
  inline def apply(): ApiOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApiOperation] (val x: Self) extends AnyVal {
    
    inline def setMethodSelectors(value: js.Array[MethodSelector]): Self = StObject.set(x, "methodSelectors", value.asInstanceOf[js.Any])
    
    inline def setMethodSelectorsUndefined: Self = StObject.set(x, "methodSelectors", js.undefined)
    
    inline def setMethodSelectorsVarargs(value: MethodSelector*): Self = StObject.set(x, "methodSelectors", js.Array(value*))
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
