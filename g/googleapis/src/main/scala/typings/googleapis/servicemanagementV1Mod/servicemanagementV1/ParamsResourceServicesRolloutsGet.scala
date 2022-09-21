package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesRolloutsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The id of the rollout resource.
    */
  var rolloutId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the service. See the [overview](https://cloud.google.com/service-management/overview) for naming requirements. For example: `example.googleapis.com`.
    */
  var serviceName: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesRolloutsGet {
  
  inline def apply(): ParamsResourceServicesRolloutsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesRolloutsGet]
  }
  
  extension [Self <: ParamsResourceServicesRolloutsGet](x: Self) {
    
    inline def setRolloutId(value: String): Self = StObject.set(x, "rolloutId", value.asInstanceOf[js.Any])
    
    inline def setRolloutIdUndefined: Self = StObject.set(x, "rolloutId", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
