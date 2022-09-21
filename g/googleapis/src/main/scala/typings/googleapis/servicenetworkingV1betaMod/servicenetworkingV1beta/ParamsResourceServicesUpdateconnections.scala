package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesUpdateconnections
  extends StObject
     with StandardParameters {
  
  /**
    * If a previously defined allocated range is removed, force flag must be set to true.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The service producer peering service that is managing peering connectivity for a service producer organization. For Google services that support this functionality, this is `services/servicenetworking.googleapis.com`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudServicenetworkingV1betaConnection] = js.undefined
  
  /**
    * The update mask. If this is omitted, it defaults to "*". You can only update the listed peering ranges.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesUpdateconnections {
  
  inline def apply(): ParamsResourceServicesUpdateconnections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesUpdateconnections]
  }
  
  extension [Self <: ParamsResourceServicesUpdateconnections](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudServicenetworkingV1betaConnection): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
