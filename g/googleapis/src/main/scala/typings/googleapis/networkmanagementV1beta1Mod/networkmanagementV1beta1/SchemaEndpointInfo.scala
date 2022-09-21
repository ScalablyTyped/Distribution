package typings.googleapis.networkmanagementV1beta1Mod.networkmanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEndpointInfo extends StObject {
  
  /**
    * Destination IP address.
    */
  var destinationIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI of the network where this packet is sent to.
    */
  var destinationNetworkUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Destination port. Only valid when protocol is TCP or UDP.
    */
  var destinationPort: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * IP protocol in string format, for example: "TCP", "UDP", "ICMP".
    */
  var protocol: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI of the source telemetry agent this packet originates from.
    */
  var sourceAgentUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Source IP address.
    */
  var sourceIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI of the network where this packet originates from.
    */
  var sourceNetworkUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Source port. Only valid when protocol is TCP or UDP.
    */
  var sourcePort: js.UndefOr[Double | Null] = js.undefined
}
object SchemaEndpointInfo {
  
  inline def apply(): SchemaEndpointInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEndpointInfo]
  }
  
  extension [Self <: SchemaEndpointInfo](x: Self) {
    
    inline def setDestinationIp(value: String): Self = StObject.set(x, "destinationIp", value.asInstanceOf[js.Any])
    
    inline def setDestinationIpNull: Self = StObject.set(x, "destinationIp", null)
    
    inline def setDestinationIpUndefined: Self = StObject.set(x, "destinationIp", js.undefined)
    
    inline def setDestinationNetworkUri(value: String): Self = StObject.set(x, "destinationNetworkUri", value.asInstanceOf[js.Any])
    
    inline def setDestinationNetworkUriNull: Self = StObject.set(x, "destinationNetworkUri", null)
    
    inline def setDestinationNetworkUriUndefined: Self = StObject.set(x, "destinationNetworkUri", js.undefined)
    
    inline def setDestinationPort(value: Double): Self = StObject.set(x, "destinationPort", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortNull: Self = StObject.set(x, "destinationPort", null)
    
    inline def setDestinationPortUndefined: Self = StObject.set(x, "destinationPort", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setSourceAgentUri(value: String): Self = StObject.set(x, "sourceAgentUri", value.asInstanceOf[js.Any])
    
    inline def setSourceAgentUriNull: Self = StObject.set(x, "sourceAgentUri", null)
    
    inline def setSourceAgentUriUndefined: Self = StObject.set(x, "sourceAgentUri", js.undefined)
    
    inline def setSourceIp(value: String): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
    
    inline def setSourceIpNull: Self = StObject.set(x, "sourceIp", null)
    
    inline def setSourceIpUndefined: Self = StObject.set(x, "sourceIp", js.undefined)
    
    inline def setSourceNetworkUri(value: String): Self = StObject.set(x, "sourceNetworkUri", value.asInstanceOf[js.Any])
    
    inline def setSourceNetworkUriNull: Self = StObject.set(x, "sourceNetworkUri", null)
    
    inline def setSourceNetworkUriUndefined: Self = StObject.set(x, "sourceNetworkUri", js.undefined)
    
    inline def setSourcePort(value: Double): Self = StObject.set(x, "sourcePort", value.asInstanceOf[js.Any])
    
    inline def setSourcePortNull: Self = StObject.set(x, "sourcePort", null)
    
    inline def setSourcePortUndefined: Self = StObject.set(x, "sourcePort", js.undefined)
  }
}
