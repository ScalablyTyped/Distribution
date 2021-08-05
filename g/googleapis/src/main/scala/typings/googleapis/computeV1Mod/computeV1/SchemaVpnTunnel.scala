package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VPN tunnel resource. (== resource_for beta.vpnTunnels ==) (== resource_for
  * v1.vpnTunnels ==)
  */
trait SchemaVpnTunnel extends StObject {
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Detailed status message for the VPN tunnel.
    */
  var detailedStatus: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * IKE protocol version to use when establishing the VPN tunnel with the
    * peer VPN gateway. Acceptable IKE versions are 1 or 2. The default version
    * is 2.
    */
  var ikeVersion: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output Only] Type of resource. Always compute#vpnTunnel for VPN tunnels.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Local traffic selector to use when establishing the VPN tunnel with the
    * peer VPN gateway. The value should be a CIDR formatted string, for
    * example: 192.168.0.0/16. The ranges must be disjoint. Only IPv4 is
    * supported.
    */
  var localTrafficSelector: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * IP address of the peer VPN gateway. Only IPv4 is supported.
    */
  var peerIp: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] URL of the region where the VPN tunnel resides. You must
    * specify this field as part of the HTTP request URL. It is not settable as
    * a field in the request body.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Remote traffic selectors to use when establishing the VPN tunnel with the
    * peer VPN gateway. The value should be a CIDR formatted string, for
    * example: 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is
    * supported.
    */
  var remoteTrafficSelector: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * URL of the router resource to be used for dynamic routing.
    */
  var router: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * Shared secret used to set the secure session between the Cloud VPN
    * gateway and the peer VPN gateway.
    */
  var sharedSecret: js.UndefOr[String] = js.undefined
  
  /**
    * Hash of the shared secret.
    */
  var sharedSecretHash: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The status of the VPN tunnel, which can be one of the
    * following:  - PROVISIONING: Resource is being allocated for the VPN
    * tunnel.  - WAITING_FOR_FULL_CONFIG: Waiting to receive all VPN-related
    * configs from the user. Network, TargetVpnGateway, VpnTunnel,
    * ForwardingRule, and Route resources are needed to setup the VPN tunnel.
    * - FIRST_HANDSHAKE: Successful first handshake with the peer VPN.  -
    * ESTABLISHED: Secure session is successfully established with the peer
    * VPN.  - NETWORK_ERROR: Deprecated, replaced by NO_INCOMING_PACKETS  -
    * AUTHORIZATION_ERROR: Auth error (for example, bad shared secret).  -
    * NEGOTIATION_FAILURE: Handshake failed.  - DEPROVISIONING: Resources are
    * being deallocated for the VPN tunnel.  - FAILED: Tunnel creation has
    * failed and the tunnel is not ready to be used.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * URL of the Target VPN gateway with which this VPN tunnel is associated.
    * Provided by the client when the VPN tunnel is created.
    */
  var targetVpnGateway: js.UndefOr[String] = js.undefined
}
object SchemaVpnTunnel {
  
  inline def apply(): SchemaVpnTunnel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnTunnel]
  }
  
  extension [Self <: SchemaVpnTunnel](x: Self) {
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetailedStatus(value: String): Self = StObject.set(x, "detailedStatus", value.asInstanceOf[js.Any])
    
    inline def setDetailedStatusUndefined: Self = StObject.set(x, "detailedStatus", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIkeVersion(value: Double): Self = StObject.set(x, "ikeVersion", value.asInstanceOf[js.Any])
    
    inline def setIkeVersionUndefined: Self = StObject.set(x, "ikeVersion", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocalTrafficSelector(value: js.Array[String]): Self = StObject.set(x, "localTrafficSelector", value.asInstanceOf[js.Any])
    
    inline def setLocalTrafficSelectorUndefined: Self = StObject.set(x, "localTrafficSelector", js.undefined)
    
    inline def setLocalTrafficSelectorVarargs(value: String*): Self = StObject.set(x, "localTrafficSelector", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPeerIp(value: String): Self = StObject.set(x, "peerIp", value.asInstanceOf[js.Any])
    
    inline def setPeerIpUndefined: Self = StObject.set(x, "peerIp", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRemoteTrafficSelector(value: js.Array[String]): Self = StObject.set(x, "remoteTrafficSelector", value.asInstanceOf[js.Any])
    
    inline def setRemoteTrafficSelectorUndefined: Self = StObject.set(x, "remoteTrafficSelector", js.undefined)
    
    inline def setRemoteTrafficSelectorVarargs(value: String*): Self = StObject.set(x, "remoteTrafficSelector", js.Array(value :_*))
    
    inline def setRouter(value: String): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    
    inline def setRouterUndefined: Self = StObject.set(x, "router", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSharedSecret(value: String): Self = StObject.set(x, "sharedSecret", value.asInstanceOf[js.Any])
    
    inline def setSharedSecretHash(value: String): Self = StObject.set(x, "sharedSecretHash", value.asInstanceOf[js.Any])
    
    inline def setSharedSecretHashUndefined: Self = StObject.set(x, "sharedSecretHash", js.undefined)
    
    inline def setSharedSecretUndefined: Self = StObject.set(x, "sharedSecret", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTargetVpnGateway(value: String): Self = StObject.set(x, "targetVpnGateway", value.asInstanceOf[js.Any])
    
    inline def setTargetVpnGatewayUndefined: Self = StObject.set(x, "targetVpnGateway", js.undefined)
  }
}
