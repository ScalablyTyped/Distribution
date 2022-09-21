package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardingRule extends StObject {
  
  /**
    * IP address that this forwarding rule serves. When a client sends traffic to this IP address, the forwarding rule directs the traffic to the target that you specify in the forwarding
    * rule. If you don't specify a reserved IP address, an ephemeral IP address is assigned. Methods for specifying an IP address: * IPv4 dotted decimal, as in `100.1.2.3` * Full URL, as
    * in https://www.googleapis.com/compute/v1/projects/project_id/regions/region /addresses/address-name * Partial URL or by name, as in: -
    * projects/project_id/regions/region/addresses/address-name - regions/region/addresses/address-name - global/addresses/address-name - address-name The loadBalancingScheme and the
    * forwarding rule's target determine the type of IP address that you can use. For detailed information, refer to [IP address
    * specifications](/load-balancing/docs/forwarding-rule-concepts#ip_address_specifications). Must be set to `0.0.0.0` when the target is targetGrpcProxy that has validateForProxyless
    * field set to true. For Private Service Connect forwarding rules that forward traffic to Google APIs, IP address must be provided.
    */
  var IPAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The IP protocol to which this rule applies. For protocol forwarding, valid options are TCP, UDP, ESP, AH, SCTP, ICMP and L3_DEFAULT. The valid IP protocols are different for
    * different load balancing products: - Internal TCP/UDP Load Balancing: The load balancing scheme is INTERNAL, and one of TCP, UDP or L3_DEFAULT is valid. - Traffic Director: The load
    * balancing scheme is INTERNAL_SELF_MANAGED, and only TCP is valid. - Internal HTTP(S) Load Balancing: The load balancing scheme is INTERNAL_MANAGED, and only TCP is valid. - HTTP(S),
    * SSL Proxy, and TCP Proxy Load Balancing: The load balancing scheme is EXTERNAL and only TCP is valid. - Network Load Balancing: The load balancing scheme is EXTERNAL, and one of
    * TCP, UDP or L3_DEFAULT is valid.
    */
  var IPProtocol: js.UndefOr[String] = js.undefined
  
  /**
    * This field is used along with the backend_service field for Internal TCP/UDP Load Balancing or Network Load Balancing, or with the target field for internal and external
    * TargetInstance. You can only use one of ports and port_range, or allPorts. The three are mutually exclusive. For TCP, UDP and SCTP traffic, packets addressed to any ports will be
    * forwarded to the target or backendService.
    */
  var allPorts: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This field is used along with the backend_service field for internal load balancing or with the target field for internal TargetInstance. If the field is set to TRUE, clients can
    * access ILB from all regions. Otherwise only allows access from clients in the same region as the internal load balancer.
    */
  var allowGlobalAccess: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifies the backend service to which the forwarding rule sends traffic. Required for Internal TCP/UDP Load Balancing and Network Load Balancing; must be omitted for all other
    * load balancer types.
    */
  var backendService: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a ForwardingRule.
    * Include the fingerprint in patch request to ensure that you do not overwrite changes that were applied from another concurrent request. To see the latest fingerprint, make a get()
    * request to retrieve a ForwardingRule.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The IP Version that will be used by this forwarding rule. Valid options are IPV4 or IPV6. This can only be specified for an external global forwarding rule. */
  var ipVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether or not this load balancer can be used as a collector for packet mirroring. To prevent mirroring loops, instances behind this load balancer will not have their
    * traffic mirrored even if a PacketMirroring rule applies to them. This can only be set to true for load balancers that have their loadBalancingScheme set to INTERNAL.
    */
  var isMirroringCollector: js.UndefOr[Boolean] = js.undefined
  
  /** [Output Only] Type of the resource. Always compute#forwardingRule for Forwarding Rule resources. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A fingerprint for the labels being applied to this resource, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by
    * Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the
    * request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a ForwardingRule.
    */
  var labelFingerprint: js.UndefOr[String] = js.undefined
  
  /** Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.ForwardingRule & TopLevel[Any]
  ] = js.undefined
  
  /**
    * Specifies the forwarding rule type. - EXTERNAL is used for: - Classic Cloud VPN gateways - Protocol forwarding to VMs from an external IP address - HTTP(S), SSL Proxy, TCP Proxy,
    * and Network Load Balancing - INTERNAL is used for: - Protocol forwarding to VMs from an internal IP address - Internal TCP/UDP Load Balancing - INTERNAL_MANAGED is used for: -
    * Internal HTTP(S) Load Balancing - INTERNAL_SELF_MANAGED is used for: - Traffic Director For more information about forwarding rules, refer to Forwarding rule concepts.
    */
  var loadBalancingScheme: js.UndefOr[String] = js.undefined
  
  /**
    * Opaque filter criteria used by Loadbalancer to restrict routing configuration to a limited set of xDS compliant clients. In their xDS requests to Loadbalancer, xDS clients present
    * node metadata. When there is a match, the relevant configuration is made available to those proxies. Otherwise, all the resources (e.g. TargetHttpProxy, UrlMap) referenced by the
    * ForwardingRule will not be visible to those proxies. For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must
    * match the corresponding label provided in the metadata. If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in
    * the metadata. If multiple metadataFilters are specified, all of them need to be satisfied in order to be considered a match. metadataFilters specified here will be applifed before
    * those specified in the UrlMap that this ForwardingRule references. metadataFilters only applies to Loadbalancers that have their loadBalancingScheme set to INTERNAL_SELF_MANAGED.
    */
  var metadataFilters: js.UndefOr[js.Array[MetadataFilter]] = js.undefined
  
  /**
    * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash. For Private Service Connect forwarding rules that forward traffic to Google APIs, the forwarding
    * rule name must be a 1-20 characters string with lowercase letters and numbers and must start with a letter.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * This field is not used for external load balancing. For Internal TCP/UDP Load Balancing, this field identifies the network that the load balanced IP should belong to for this
    * Forwarding Rule. If this field is not specified, the default network will be used. For Private Service Connect forwarding rules that forward traffic to Google APIs, a network must
    * be provided.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * This signifies the networking tier used for configuring this load balancer and can only take the following values: PREMIUM, STANDARD. For regional ForwardingRule, the valid values
    * are PREMIUM and STANDARD. For GlobalForwardingRule, the valid value is PREMIUM. If this field is not specified, it is assumed to be PREMIUM. If IPAddress is specified, this value
    * must be equal to the networkTier of the Address.
    */
  var networkTier: js.UndefOr[String] = js.undefined
  
  /**
    * This field can be used only if: - Load balancing scheme is one of EXTERNAL, INTERNAL_SELF_MANAGED or INTERNAL_MANAGED - IPProtocol is one of TCP, UDP, or SCTP. Packets addressed to
    * ports in the specified range will be forwarded to target or backend_service. You can only use one of ports, port_range, or allPorts. The three are mutually exclusive. Forwarding
    * rules with the same [IPAddress, IPProtocol] pair must have disjoint ports. Some types of forwarding target have constraints on the acceptable ports: - TargetHttpProxy: 80, 8080 -
    * TargetHttpsProxy: 443 - TargetGrpcProxy: no constraints - TargetTcpProxy: 25, 43, 110, 143, 195, 443, 465, 587, 700, 993, 995, 1688, 1883, 5222 - TargetSslProxy: 25, 43, 110, 143,
    * 195, 443, 465, 587, 700, 993, 995, 1688, 1883, 5222 - TargetVpnGateway: 500, 4500 @pattern: \\d+(?:-\\d+)?
    */
  var portRange: js.UndefOr[String] = js.undefined
  
  /**
    * The ports field is only supported when the forwarding rule references a backend_service directly. Supported load balancing products are Internal TCP/UDP Load Balancing and Network
    * Load Balancing. Only packets addressed to the specified list of ports are forwarded to backends. You can only use one of ports and port_range, or allPorts. The three are mutually
    * exclusive. You can specify a list of up to five ports, which can be non-contiguous. Forwarding rules with the same [IPAddress, IPProtocol] pair must have disjoint ports. For more
    * information, see [Port specifications](/load-balancing/docs/forwarding-rule-concepts#port_specifications). @pattern: \\d+(?:-\\d+)?
    */
  var ports: js.UndefOr[js.Array[String]] = js.undefined
  
  /** [Output Only] The PSC connection id of the PSC Forwarding Rule. */
  var pscConnectionId: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] URL of the region where the regional forwarding rule resides. This field is not applicable to global forwarding rules. You must specify this field as part of the HTTP
    * request URL. It is not settable as a field in the request body.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * Service Directory resources to register this forwarding rule with. Currently, only supports a single Service Directory resource. It is only supported for Internal TCP/UDP Load
    * Balancing and Internal HTTP(S) Load Balancing.
    */
  var serviceDirectoryRegistrations: js.UndefOr[js.Array[ForwardingRuleServiceDirectoryRegistration]] = js.undefined
  
  /**
    * An optional prefix to the service name for this Forwarding Rule. If specified, the prefix is the first label of the fully qualified service name. The label must be 1-63 characters
    * long, and comply with RFC1035. Specifically, the label must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. This field is only used for
    * internal load balancing.
    */
  var serviceLabel: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The internal fully qualified service name for this Forwarding Rule. This field is only used for internal load balancing. */
  var serviceName: js.UndefOr[String] = js.undefined
  
  /**
    * This field is only used for internal load balancing. For internal load balancing, this field identifies the subnetwork that the load balanced IP should belong to for this Forwarding
    * Rule. If the network specified is in auto subnet mode, this field is optional. However, if the network is in custom subnet mode, a subnetwork must be specified.
    */
  var subnetwork: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object ForwardingRule {
  
  inline def apply(): ForwardingRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardingRule]
  }
  
  extension [Self <: ForwardingRule](x: Self) {
    
    inline def setAllPorts(value: Boolean): Self = StObject.set(x, "allPorts", value.asInstanceOf[js.Any])
    
    inline def setAllPortsUndefined: Self = StObject.set(x, "allPorts", js.undefined)
    
    inline def setAllowGlobalAccess(value: Boolean): Self = StObject.set(x, "allowGlobalAccess", value.asInstanceOf[js.Any])
    
    inline def setAllowGlobalAccessUndefined: Self = StObject.set(x, "allowGlobalAccess", js.undefined)
    
    inline def setBackendService(value: String): Self = StObject.set(x, "backendService", value.asInstanceOf[js.Any])
    
    inline def setBackendServiceUndefined: Self = StObject.set(x, "backendService", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setIPAddress(value: String): Self = StObject.set(x, "IPAddress", value.asInstanceOf[js.Any])
    
    inline def setIPAddressUndefined: Self = StObject.set(x, "IPAddress", js.undefined)
    
    inline def setIPProtocol(value: String): Self = StObject.set(x, "IPProtocol", value.asInstanceOf[js.Any])
    
    inline def setIPProtocolUndefined: Self = StObject.set(x, "IPProtocol", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIpVersion(value: String): Self = StObject.set(x, "ipVersion", value.asInstanceOf[js.Any])
    
    inline def setIpVersionUndefined: Self = StObject.set(x, "ipVersion", js.undefined)
    
    inline def setIsMirroringCollector(value: Boolean): Self = StObject.set(x, "isMirroringCollector", value.asInstanceOf[js.Any])
    
    inline def setIsMirroringCollectorUndefined: Self = StObject.set(x, "isMirroringCollector", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabelFingerprint(value: String): Self = StObject.set(x, "labelFingerprint", value.asInstanceOf[js.Any])
    
    inline def setLabelFingerprintUndefined: Self = StObject.set(x, "labelFingerprint", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.ForwardingRule & TopLevel[Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLoadBalancingScheme(value: String): Self = StObject.set(x, "loadBalancingScheme", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancingSchemeUndefined: Self = StObject.set(x, "loadBalancingScheme", js.undefined)
    
    inline def setMetadataFilters(value: js.Array[MetadataFilter]): Self = StObject.set(x, "metadataFilters", value.asInstanceOf[js.Any])
    
    inline def setMetadataFiltersUndefined: Self = StObject.set(x, "metadataFilters", js.undefined)
    
    inline def setMetadataFiltersVarargs(value: MetadataFilter*): Self = StObject.set(x, "metadataFilters", js.Array(value*))
    
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
    
    inline def setPortsVarargs(value: String*): Self = StObject.set(x, "ports", js.Array(value*))
    
    inline def setPscConnectionId(value: String): Self = StObject.set(x, "pscConnectionId", value.asInstanceOf[js.Any])
    
    inline def setPscConnectionIdUndefined: Self = StObject.set(x, "pscConnectionId", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setServiceDirectoryRegistrations(value: js.Array[ForwardingRuleServiceDirectoryRegistration]): Self = StObject.set(x, "serviceDirectoryRegistrations", value.asInstanceOf[js.Any])
    
    inline def setServiceDirectoryRegistrationsUndefined: Self = StObject.set(x, "serviceDirectoryRegistrations", js.undefined)
    
    inline def setServiceDirectoryRegistrationsVarargs(value: ForwardingRuleServiceDirectoryRegistration*): Self = StObject.set(x, "serviceDirectoryRegistrations", js.Array(value*))
    
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
