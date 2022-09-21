package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesConfigsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The id of the service configuration resource. This field must be specified for the server to return all fields, including `SourceInfo`.
    */
  var configId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the service. See the [overview](https://cloud.google.com/service-management/overview) for naming requirements. For example: `example.googleapis.com`.
    */
  var serviceName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies which parts of the Service Config should be returned in the response.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesConfigsGet {
  
  inline def apply(): ParamsResourceServicesConfigsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesConfigsGet]
  }
  
  extension [Self <: ParamsResourceServicesConfigsGet](x: Self) {
    
    inline def setConfigId(value: String): Self = StObject.set(x, "configId", value.asInstanceOf[js.Any])
    
    inline def setConfigIdUndefined: Self = StObject.set(x, "configId", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
