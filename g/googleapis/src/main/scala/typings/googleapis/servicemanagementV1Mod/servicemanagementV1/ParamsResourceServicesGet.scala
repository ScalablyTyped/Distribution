package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the service. See the `ServiceManager` overview for naming requirements. For example: `example.googleapis.com`.
    */
  var serviceName: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesGet {
  
  inline def apply(): ParamsResourceServicesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesGet]
  }
  
  extension [Self <: ParamsResourceServicesGet](x: Self) {
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
