package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRoute extends StObject {
  
  /**
    * Destination CIDR range that this route applies to.
    */
  var destRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Route name. See https://cloud.google.com/vpc/docs/routes
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Fully-qualified URL of the VPC network in the producer host tenant project that this route applies to. For example: `projects/123456/global/networks/host-network`
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Fully-qualified URL of the gateway that should handle matching packets that this route applies to. For example: `projects/123456/global/gateways/default-internet-gateway`
    */
  var nextHopGateway: js.UndefOr[String | Null] = js.undefined
}
object SchemaRoute {
  
  inline def apply(): SchemaRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoute]
  }
  
  extension [Self <: SchemaRoute](x: Self) {
    
    inline def setDestRange(value: String): Self = StObject.set(x, "destRange", value.asInstanceOf[js.Any])
    
    inline def setDestRangeNull: Self = StObject.set(x, "destRange", null)
    
    inline def setDestRangeUndefined: Self = StObject.set(x, "destRange", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setNextHopGateway(value: String): Self = StObject.set(x, "nextHopGateway", value.asInstanceOf[js.Any])
    
    inline def setNextHopGatewayNull: Self = StObject.set(x, "nextHopGateway", null)
    
    inline def setNextHopGatewayUndefined: Self = StObject.set(x, "nextHopGateway", js.undefined)
  }
}
