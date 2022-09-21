package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesEnablevpcservicecontrols
  extends StObject
     with StandardParameters {
  
  /**
    * The service that is managing peering connectivity for a service producer's organization. For Google services that support this functionality, this value is `services/servicenetworking.googleapis.com`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEnableVpcServiceControlsRequest] = js.undefined
}
object ParamsResourceServicesEnablevpcservicecontrols {
  
  inline def apply(): ParamsResourceServicesEnablevpcservicecontrols = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesEnablevpcservicecontrols]
  }
  
  extension [Self <: ParamsResourceServicesEnablevpcservicecontrols](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaEnableVpcServiceControlsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
