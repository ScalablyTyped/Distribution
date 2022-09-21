package typings.googleapis.networkmanagementV1Mod.networkmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVpnGatewayInfo extends StObject {
  
  /**
    * Name of a VPN gateway.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * IP address of the VPN gateway.
    */
  var ipAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI of a Compute Engine network where the VPN gateway is configured.
    */
  var networkUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of a Google Cloud region where this VPN gateway is configured.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI of a VPN gateway.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A VPN tunnel that is associated with this VPN gateway. There may be multiple VPN tunnels configured on a VPN gateway, and only the one relevant to the test is displayed.
    */
  var vpnTunnelUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaVpnGatewayInfo {
  
  inline def apply(): SchemaVpnGatewayInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnGatewayInfo]
  }
  
  extension [Self <: SchemaVpnGatewayInfo](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setNetworkUri(value: String): Self = StObject.set(x, "networkUri", value.asInstanceOf[js.Any])
    
    inline def setNetworkUriNull: Self = StObject.set(x, "networkUri", null)
    
    inline def setNetworkUriUndefined: Self = StObject.set(x, "networkUri", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setVpnTunnelUri(value: String): Self = StObject.set(x, "vpnTunnelUri", value.asInstanceOf[js.Any])
    
    inline def setVpnTunnelUriNull: Self = StObject.set(x, "vpnTunnelUri", null)
    
    inline def setVpnTunnelUriUndefined: Self = StObject.set(x, "vpnTunnelUri", js.undefined)
  }
}
