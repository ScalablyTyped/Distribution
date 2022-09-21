package typings.googleapis.networkmanagementV1beta1Mod.networkmanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVpnTunnelInfo extends StObject {
  
  /**
    * Name of a VPN tunnel.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI of a Compute Engine network where the VPN tunnel is configured.
    */
  var networkUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of a Google Cloud region where this VPN tunnel is configured.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI of a VPN gateway at remote end of the tunnel.
    */
  var remoteGateway: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Remote VPN gateway's IP address.
    */
  var remoteGatewayIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the routing policy.
    */
  var routingType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI of the VPN gateway at local end of the tunnel.
    */
  var sourceGateway: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Local VPN gateway's IP address.
    */
  var sourceGatewayIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI of a VPN tunnel.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaVpnTunnelInfo {
  
  inline def apply(): SchemaVpnTunnelInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnTunnelInfo]
  }
  
  extension [Self <: SchemaVpnTunnelInfo](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setNetworkUri(value: String): Self = StObject.set(x, "networkUri", value.asInstanceOf[js.Any])
    
    inline def setNetworkUriNull: Self = StObject.set(x, "networkUri", null)
    
    inline def setNetworkUriUndefined: Self = StObject.set(x, "networkUri", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRemoteGateway(value: String): Self = StObject.set(x, "remoteGateway", value.asInstanceOf[js.Any])
    
    inline def setRemoteGatewayIp(value: String): Self = StObject.set(x, "remoteGatewayIp", value.asInstanceOf[js.Any])
    
    inline def setRemoteGatewayIpNull: Self = StObject.set(x, "remoteGatewayIp", null)
    
    inline def setRemoteGatewayIpUndefined: Self = StObject.set(x, "remoteGatewayIp", js.undefined)
    
    inline def setRemoteGatewayNull: Self = StObject.set(x, "remoteGateway", null)
    
    inline def setRemoteGatewayUndefined: Self = StObject.set(x, "remoteGateway", js.undefined)
    
    inline def setRoutingType(value: String): Self = StObject.set(x, "routingType", value.asInstanceOf[js.Any])
    
    inline def setRoutingTypeNull: Self = StObject.set(x, "routingType", null)
    
    inline def setRoutingTypeUndefined: Self = StObject.set(x, "routingType", js.undefined)
    
    inline def setSourceGateway(value: String): Self = StObject.set(x, "sourceGateway", value.asInstanceOf[js.Any])
    
    inline def setSourceGatewayIp(value: String): Self = StObject.set(x, "sourceGatewayIp", value.asInstanceOf[js.Any])
    
    inline def setSourceGatewayIpNull: Self = StObject.set(x, "sourceGatewayIp", null)
    
    inline def setSourceGatewayIpUndefined: Self = StObject.set(x, "sourceGatewayIp", js.undefined)
    
    inline def setSourceGatewayNull: Self = StObject.set(x, "sourceGateway", null)
    
    inline def setSourceGatewayUndefined: Self = StObject.set(x, "sourceGateway", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
