package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesCheck
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCheckRequest] = js.undefined
  
  /**
    * The service name as specified in its service configuration. For example, `"pubsub.googleapis.com"`. See [google.api.Service](https://cloud.google.com/service-management/reference/rpc/google.api#google.api.Service) for the definition of a service name.
    */
  var serviceName: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesCheck {
  
  inline def apply(): ParamsResourceServicesCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesCheck]
  }
  
  extension [Self <: ParamsResourceServicesCheck](x: Self) {
    
    inline def setRequestBody(value: SchemaCheckRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
