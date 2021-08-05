package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ForwardingRule resource. A ForwardingRule resource specifies which pool
  * of target virtual machines to forward a packet to if it matches the given
  * [IPAddress, IPProtocol, ports] tuple. (== resource_for beta.forwardingRules
  * ==) (== resource_for v1.forwardingRules ==) (== resource_for
  * beta.globalForwardingRules ==) (== resource_for v1.globalForwardingRules
  * ==) (== resource_for beta.regionForwardingRules ==) (== resource_for
  * v1.regionForwardingRules ==)
  */
trait SchemaForwardingRule extends StObject {
  
  /**
    * The IP address that this forwarding rule is serving on behalf of.
    * Addresses are restricted based on the forwarding rule&#39;s load
    * balancing scheme (EXTERNAL or INTERNAL) and scope (global or regional).
    * When the load balancing scheme is EXTERNAL, for global forwarding rules,
    * the address must be a global IP, and for regional forwarding rules, the
    * address must live in the same region as the forwarding rule. If this
    * field is empty, an ephemeral IPv4 address from the same scope (global or
    * regional) will be assigned. A regional forwarding rule supports IPv4
    * only. A global forwarding rule supports either IPv4 or IPv6.  When the
    * load balancing scheme is INTERNAL_SELF_MANAGED, this must be a URL
    * reference to an existing Address resource ( internal regional static IP
    * address), with a purpose of GCE_END_POINT and address_type of INTERNAL.
    * When the load balancing scheme is INTERNAL, this can only be an RFC 1918
    * IP address belonging to the network/subnet configured for the forwarding
    * rule. By default, if this field is empty, an ephemeral internal IP
    * address will be automatically allocated from the IP range of the subnet
    * or network configured for this forwarding rule.  An address can be
    * specified either by a literal IP address or a URL reference to an
    * existing Address resource. The following examples are all valid:   -
    * 100.1.2.3  -
    * https://www.googleapis.com/compute/v1/projects/project/regions/region/addresses/address
    * - projects/project/regions/region/addresses/address  -
    * regions/region/addresses/address  - global/addresses/address  - address
    */
  var IPAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The IP protocol to which this rule applies. Valid options are TCP, UDP,
    * ESP, AH, SCTP or ICMP.  When the load balancing scheme is INTERNAL, only
    * TCP and UDP are valid. When the load balancing scheme is
    * INTERNAL_SELF_MANAGED, only TCPis valid.
    */
  var IPProtocol: js.UndefOr[String] = js.undefined
  
  /**
    * This field is used along with the backend_service field for internal load
    * balancing or with the target field for internal TargetInstance. This
    * field cannot be used with port or portRange fields.  When the load
    * balancing scheme is INTERNAL and protocol is TCP/UDP, specify this field
    * to allow packets addressed to any ports will be forwarded to the backends
    * configured with this forwarding rule.
    */
  var allPorts: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This field is only used for INTERNAL load balancing.  For internal load
    * balancing, this field identifies the BackendService resource to receive
    * the matched traffic.
    */
  var backendService: js.UndefOr[String] = js.undefined
  
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
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The IP Version that will be used by this forwarding rule. Valid options
    * are IPV4 or IPV6. This can only be specified for an external global
    * forwarding rule.
    */
  var ipVersion: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#forwardingRule for
    * Forwarding Rule resources.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * This signifies what the ForwardingRule will be used for and can only take
    * the following values: INTERNAL, INTERNAL_SELF_MANAGED, EXTERNAL. The
    * value of INTERNAL means that this will be used for Internal Network Load
    * Balancing (TCP, UDP). The value of INTERNAL_SELF_MANAGED means that this
    * will be used for Internal Global HTTP(S) LB. The value of EXTERNAL means
    * that this will be used for External Load Balancing (HTTP(S) LB, External
    * TCP/UDP LB, SSL Proxy)
    */
  var loadBalancingScheme: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the resource; provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * This field is not used for external load balancing.  For INTERNAL and
    * INTERNAL_SELF_MANAGED load balancing, this field identifies the network
    * that the load balanced IP should belong to for this Forwarding Rule. If
    * this field is not specified, the default network will be used.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * This signifies the networking tier used for configuring this load
    * balancer and can only take the following values: PREMIUM , STANDARD.  For
    * regional ForwardingRule, the valid values are PREMIUM and STANDARD. For
    * GlobalForwardingRule, the valid value is PREMIUM.  If this field is not
    * specified, it is assumed to be PREMIUM. If IPAddress is specified, this
    * value must be equal to the networkTier of the Address.
    */
  var networkTier: js.UndefOr[String] = js.undefined
  
  /**
    * This field is used along with the target field for TargetHttpProxy,
    * TargetHttpsProxy, TargetSslProxy, TargetTcpProxy, TargetVpnGateway,
    * TargetPool, TargetInstance.  Applicable only when IPProtocol is TCP, UDP,
    * or SCTP, only packets addressed to ports in the specified range will be
    * forwarded to target. Forwarding rules with the same [IPAddress,
    * IPProtocol] pair must have disjoint port ranges.  Some types of
    * forwarding target have constraints on the acceptable ports:   -
    * TargetHttpProxy: 80, 8080  - TargetHttpsProxy: 443  - TargetTcpProxy: 25,
    * 43, 110, 143, 195, 443, 465, 587, 700, 993, 995, 1688, 1883, 5222  -
    * TargetSslProxy: 25, 43, 110, 143, 195, 443, 465, 587, 700, 993, 995,
    * 1688, 1883, 5222  - TargetVpnGateway: 500, 4500
    */
  var portRange: js.UndefOr[String] = js.undefined
  
  /**
    * This field is used along with the backend_service field for internal load
    * balancing.  When the load balancing scheme is INTERNAL, a list of ports
    * can be configured, for example, [&#39;80&#39;],
    * [&#39;8000&#39;,&#39;9000&#39;] etc. Only packets addressed to these
    * ports will be forwarded to the backends configured with this forwarding
    * rule.  You may specify a maximum of up to 5 ports.
    */
  var ports: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * [Output Only] URL of the region where the regional forwarding rule
    * resides. This field is not applicable to global forwarding rules. You
    * must specify this field as part of the HTTP request URL. It is not
    * settable as a field in the request body.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * An optional prefix to the service name for this Forwarding Rule. If
    * specified, will be the first label of the fully qualified service name.
    * The label must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the label must be 1-63 characters long and match the
    * regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
    * character must be a lowercase letter, and all following characters must
    * be a dash, lowercase letter, or digit, except the last character, which
    * cannot be a dash.  This field is only used for internal load balancing.
    */
  var serviceLabel: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The internal fully qualified service name for this
    * Forwarding Rule.  This field is only used for internal load balancing.
    */
  var serviceName: js.UndefOr[String] = js.undefined
  
  /**
    * This field is only used for INTERNAL load balancing.  For internal load
    * balancing, this field identifies the subnetwork that the load balanced IP
    * should belong to for this Forwarding Rule.  If the network specified is
    * in auto subnet mode, this field is optional. However, if the network is
    * in custom subnet mode, a subnetwork must be specified.
    */
  var subnetwork: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the target resource to receive the matched traffic. For
    * regional forwarding rules, this target must live in the same region as
    * the forwarding rule. For global forwarding rules, this target must be a
    * global load balancing resource. The forwarded traffic must be of a type
    * appropriate to the target object. For INTERNAL_SELF_MANAGED load
    * balancing, only HTTP and HTTPS targets are valid.
    */
  var target: js.UndefOr[String] = js.undefined
}
object SchemaForwardingRule {
  
  inline def apply(): SchemaForwardingRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForwardingRule]
  }
  
  extension [Self <: SchemaForwardingRule](x: Self) {
    
    inline def setAllPorts(value: Boolean): Self = StObject.set(x, "allPorts", value.asInstanceOf[js.Any])
    
    inline def setAllPortsUndefined: Self = StObject.set(x, "allPorts", js.undefined)
    
    inline def setBackendService(value: String): Self = StObject.set(x, "backendService", value.asInstanceOf[js.Any])
    
    inline def setBackendServiceUndefined: Self = StObject.set(x, "backendService", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIPAddress(value: String): Self = StObject.set(x, "IPAddress", value.asInstanceOf[js.Any])
    
    inline def setIPAddressUndefined: Self = StObject.set(x, "IPAddress", js.undefined)
    
    inline def setIPProtocol(value: String): Self = StObject.set(x, "IPProtocol", value.asInstanceOf[js.Any])
    
    inline def setIPProtocolUndefined: Self = StObject.set(x, "IPProtocol", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIpVersion(value: String): Self = StObject.set(x, "ipVersion", value.asInstanceOf[js.Any])
    
    inline def setIpVersionUndefined: Self = StObject.set(x, "ipVersion", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLoadBalancingScheme(value: String): Self = StObject.set(x, "loadBalancingScheme", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancingSchemeUndefined: Self = StObject.set(x, "loadBalancingScheme", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkTier(value: String): Self = StObject.set(x, "networkTier", value.asInstanceOf[js.Any])
    
    inline def setNetworkTierUndefined: Self = StObject.set(x, "networkTier", js.undefined)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setPortRange(value: String): Self = StObject.set(x, "portRange", value.asInstanceOf[js.Any])
    
    inline def setPortRangeUndefined: Self = StObject.set(x, "portRange", js.undefined)
    
    inline def setPorts(value: js.Array[String]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setPortsVarargs(value: String*): Self = StObject.set(x, "ports", js.Array(value :_*))
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setServiceLabel(value: String): Self = StObject.set(x, "serviceLabel", value.asInstanceOf[js.Any])
    
    inline def setServiceLabelUndefined: Self = StObject.set(x, "serviceLabel", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
