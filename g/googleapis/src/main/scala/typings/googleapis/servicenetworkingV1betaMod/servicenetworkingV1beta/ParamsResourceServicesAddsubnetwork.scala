package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesAddsubnetwork
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A tenant project in the service producer organization, in the following format: services/{service\}/{collection-id\}/{resource-id\}. {collection-id\} is the cloud resource collection type that represents the tenant project. Only `projects` are supported. {resource-id\} is the tenant project numeric id, such as `123456`. {service\} the name of the peering service, such as `service-peering.example.com`. This service must already be enabled in the service consumer's project.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAddSubnetworkRequest] = js.undefined
}
object ParamsResourceServicesAddsubnetwork {
  
  inline def apply(): ParamsResourceServicesAddsubnetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesAddsubnetwork]
  }
  
  extension [Self <: ParamsResourceServicesAddsubnetwork](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaAddSubnetworkRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
