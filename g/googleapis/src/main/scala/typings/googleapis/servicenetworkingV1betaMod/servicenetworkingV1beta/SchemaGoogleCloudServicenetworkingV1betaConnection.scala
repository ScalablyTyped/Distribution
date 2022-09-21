package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudServicenetworkingV1betaConnection extends StObject {
  
  /**
    * The name of service consumer's VPC network that's connected with service producer network, in the following format: `projects/{project\}/global/networks/{network\}`. `{project\}` is a project number, such as in `12345` that includes the VPC service consumer's VPC network. `{network\}` is the name of the service consumer's VPC network.
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of the VPC Network Peering connection that was created by the service producer.
    */
  var peering: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of one or more allocated IP address ranges for this service producer of type `PEERING`. Note that invoking this method with a different range when connection is already established will not modify already provisioned service producer subnetworks.
    */
  var reservedPeeringRanges: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. The name of the peering service that's associated with this connection, in the following format: `services/{service name\}`.
    */
  var service: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudServicenetworkingV1betaConnection {
  
  inline def apply(): SchemaGoogleCloudServicenetworkingV1betaConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicenetworkingV1betaConnection]
  }
  
  extension [Self <: SchemaGoogleCloudServicenetworkingV1betaConnection](x: Self) {
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setPeering(value: String): Self = StObject.set(x, "peering", value.asInstanceOf[js.Any])
    
    inline def setPeeringNull: Self = StObject.set(x, "peering", null)
    
    inline def setPeeringUndefined: Self = StObject.set(x, "peering", js.undefined)
    
    inline def setReservedPeeringRanges(value: js.Array[String]): Self = StObject.set(x, "reservedPeeringRanges", value.asInstanceOf[js.Any])
    
    inline def setReservedPeeringRangesNull: Self = StObject.set(x, "reservedPeeringRanges", null)
    
    inline def setReservedPeeringRangesUndefined: Self = StObject.set(x, "reservedPeeringRanges", js.undefined)
    
    inline def setReservedPeeringRangesVarargs(value: String*): Self = StObject.set(x, "reservedPeeringRanges", js.Array(value*))
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
