package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardingRule extends js.Object {
  
  /**
    * IP address that this forwarding rule serves. When a client sends traffic to this IP address, the forwarding rule directs the traffic to the target that you specify in the forwarding
    * rule.
    *
    * If you don't specify a reserved IP address, an ephemeral IP address is assigned. Methods for specifying an IP address:
    *
    * * IPv4 dotted decimal, as in `100.1.2.3` * Full URL, as in https://www.googleapis.com/compute/v1/projects/project_id/regions/region/addresses/address-name * Partial URL or by name,
    * as in: * projects/project_id/regions/region/addresses/address-name * regions/region/addresses/address-name * global/addresses/address-name * address-name
    *
    * The loadBalancingScheme and the forwarding rule's target determine the type of IP address that you can use. For detailed information, refer to [IP address
    * specifications](/load-balancing/docs/forwarding-rule-concepts#ip_address_specifications).
    *
    * Must be set to `0.0.0.0` when the target is targetGrpcProxy that has validateForProxyless field set to true.
    *
    * For Private Service Connect forwarding rules that forward traffic to Google APIs, IP address must be provided.
    */
  var IPAddress: js.UndefOr[String] = js.native
  
  /**
    * The IP protocol to which this rule applies. For protocol forwarding, valid options are TCP, UDP, ESP, AH, SCTP or ICMP.
    *
    * For Internal TCP/UDP Load Balancing, the load balancing scheme is INTERNAL, and one of TCP or UDP are valid. For Traffic Director, the load balancing scheme is
    * INTERNAL_SELF_MANAGED, and only TCPis valid. For Internal HTTP(S) Load Balancing, the load balancing scheme is INTERNAL_MANAGED, and only TCP is valid. For HTTP(S), SSL Proxy, and
    * TCP Proxy Load Balancing, the load balancing scheme is EXTERNAL and only TCP is valid. For Network TCP/UDP Load Balancing, the load balancing scheme is EXTERNAL, and one of TCP or
    * UDP is valid.
    */
  var IPProtocol: js.UndefOr[String] = js.native
  
  /**
    * This field is used along with the backend_service field for internal load balancing or with the target field for internal TargetInstance. This field cannot be used with port or
    * portRange fields.
    *
    * When the load balancing scheme is INTERNAL and protocol is TCP/UDP, specify this field to allow packets addressed to any ports will be forwarded to the backends configured with this
    * forwarding rule.
    */
  var allPorts: js.UndefOr[Boolean] = js.native
  
  /**
    * This field is used along with the backend_service field for internal load balancing or with the target field for internal TargetInstance. If the field is set to TRUE, clients can
    * access ILB from all regions. Otherwise only allows access from clients in the same region as the internal load balancer.
    */
  var allowGlobalAccess: js.UndefOr[Boolean] = js.native
  
  /**
    * This field is only used for INTERNAL load balancing.
    *
    * For internal load balancing, this field identifies the BackendService resource to receive the matched traffic.
    */
  var backendService: js.UndefOr[String] = js.native
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a ForwardingRule.
    * Include the fingerprint in patch request to ensure that you do not overwrite changes that were applied from another concurrent request.
    *
    * To see the latest fingerprint, make a get() request to retrieve a ForwardingRule.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  
  /** The IP Version that will be used by this forwarding rule. Valid options are IPV4 or IPV6. This can only be specified for an external global forwarding rule. */
  var ipVersion: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether or not this load balancer can be used as a collector for packet mirroring. To prevent mirroring loops, instances behind this load balancer will not have their
    * traffic mirrored even if a PacketMirroring rule applies to them. This can only be set to true for load balancers that have their loadBalancingScheme set to INTERNAL.
    */
  var isMirroringCollector: js.UndefOr[Boolean] = js.native
  
  /** [Output Only] Type of the resource. Always compute#forwardingRule for Forwarding Rule resources. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Specifies the forwarding rule type.
    *
    *
    * - EXTERNAL is used for:
    * - Classic Cloud VPN gateways
    * - Protocol forwarding to VMs from an external IP address
    * - The following load balancers: HTTP(S), SSL Proxy, TCP Proxy, and Network TCP/UDP
    * - INTERNAL is used for:
    * - Protocol forwarding to VMs from an internal IP address
    * - Internal TCP/UDP load balancers
    * - INTERNAL_MANAGED is used for:
    * - Internal HTTP(S) load balancers
    * - INTERNAL_SELF_MANAGED is used for:
    * - Traffic Director
    *
    * For more information about forwarding rules, refer to Forwarding rule concepts.
    */
  var loadBalancingScheme: js.UndefOr[String] = js.native
  
  /**
    * Opaque filter criteria used by Loadbalancer to restrict routing configuration to a limited set of xDS compliant clients. In their xDS requests to Loadbalancer, xDS clients present
    * node metadata. When there is a match, the relevant configuration is made available to those proxies. Otherwise, all the resources (e.g. TargetHttpProxy, UrlMap) referenced by the
    * ForwardingRule will not be visible to those proxies.
    * For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must match the corresponding label provided in the metadata.
    * If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in the metadata. If multiple metadataFilters are
    * specified, all of them need to be satisfied in order to be considered a match.
    * metadataFilters specified here will be applifed before those specified in the UrlMap that this ForwardingRule references.
    * metadataFilters only applies to Loadbalancers that have their loadBalancingScheme set to INTERNAL_SELF_MANAGED.
    */
  var metadataFilters: js.UndefOr[js.Array[MetadataFilter]] = js.native
  
  /**
    * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * This field is not used for external load balancing.
    *
    * For internal load balancing, this field identifies the network that the load balanced IP should belong to for this Forwarding Rule. If this field is not specified, the default
    * network will be used.
    *
    * For Private Service Connect forwarding rules that forward traffic to Google APIs, a network must be provided.
    */
  var network: js.UndefOr[String] = js.native
  
  /**
    * This signifies the networking tier used for configuring this load balancer and can only take the following values: PREMIUM, STANDARD.
    *
    * For regional ForwardingRule, the valid values are PREMIUM and STANDARD. For GlobalForwardingRule, the valid value is PREMIUM.
    *
    * If this field is not specified, it is assumed to be PREMIUM. If IPAddress is specified, this value must be equal to the networkTier of the Address.
    */
  var networkTier: js.UndefOr[String] = js.native
  
  /**
    * When the load balancing scheme is EXTERNAL, INTERNAL_SELF_MANAGED and INTERNAL_MANAGED, you can specify a port_range. Use with a forwarding rule that points to a target proxy or a
    * target pool. Do not use with a forwarding rule that points to a backend service. This field is used along with the target field for TargetHttpProxy, TargetHttpsProxy,
    * TargetSslProxy, TargetTcpProxy, TargetGrpcProxy, TargetVpnGateway, TargetPool, TargetInstance.
    *
    * Applicable only when IPProtocol is TCP, UDP, or SCTP, only packets addressed to ports in the specified range will be forwarded to target. Forwarding rules with the same [IPAddress,
    * IPProtocol] pair must have disjoint port ranges.
    *
    * Some types of forwarding target have constraints on the acceptable ports:
    * - TargetHttpProxy: 80, 8080
    * - TargetHttpsProxy: 443
    * - TargetGrpcProxy: Any ports
    * - TargetTcpProxy: 25, 43, 110, 143, 195, 443, 465, 587, 700, 993, 995, 1688, 1883, 5222
    * - TargetSslProxy: 25, 43, 110, 143, 195, 443, 465, 587, 700, 993, 995, 1688, 1883, 5222
    * - TargetVpnGateway: 500, 4500
    */
  var portRange: js.UndefOr[String] = js.native
  
  /**
    * This field is used along with the backend_service field for internal load balancing.
    *
    * When the load balancing scheme is INTERNAL, a list of ports can be configured, for example, ['80'], ['8000','9000']. Only packets addressed to these ports are forwarded to the
    * backends configured with the forwarding rule.
    *
    * If the forwarding rule's loadBalancingScheme is INTERNAL, you can specify ports in one of the following ways:
    *
    * * A list of up to five ports, which can be non-contiguous * Keyword ALL, which causes the forwarding rule to forward traffic on any port of the forwarding rule's protocol.
    */
  var ports: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * [Output Only] URL of the region where the regional forwarding rule resides. This field is not applicable to global forwarding rules. You must specify this field as part of the HTTP
    * request URL. It is not settable as a field in the request body.
    */
  var region: js.UndefOr[String] = js.native
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * An optional prefix to the service name for this Forwarding Rule. If specified, the prefix is the first label of the fully qualified service name.
    *
    * The label must be 1-63 characters long, and comply with RFC1035. Specifically, the label must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
    * which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    *
    * This field is only used for internal load balancing.
    */
  var serviceLabel: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The internal fully qualified service name for this Forwarding Rule.
    *
    * This field is only used for internal load balancing.
    */
  var serviceName: js.UndefOr[String] = js.native
  
  /**
    * This field is only used for internal load balancing.
    *
    * For internal load balancing, this field identifies the subnetwork that the load balanced IP should belong to for this Forwarding Rule.
    *
    * If the network specified is in auto subnet mode, this field is optional. However, if the network is in custom subnet mode, a subnetwork must be specified.
    */
  var subnetwork: js.UndefOr[String] = js.native
  
  /**
    * The URL of the target resource to receive the matched traffic. For regional forwarding rules, this target must be in the same region as the forwarding rule. For global forwarding
    * rules, this target must be a global load balancing resource. The forwarded traffic must be of a type appropriate to the target object. For more information, see the "Target" column
    * in [Port specifications](/load-balancing/docs/forwarding-rule-concepts#ip_address_specifications).
    *
    * For Private Service Connect forwarding rules that forward traffic to Google APIs, provide the name of a supported Google API bundle. Currently, the supported Google API bundles
    * include:
    *
    *
    * - vpc-sc - GCP APIs that support VPC Service Controls. For more information about which APIs support VPC Service Controls, refer to VPC-SC supported products and limitations.
    * - all-apis - All GCP APIs. For more information about which APIs are supported with this bundle, refer to Private Google Access-specific domains and VIPs.
    */
  var target: js.UndefOr[String] = js.native
}
object ForwardingRule {
  
  @scala.inline
  def apply(): ForwardingRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardingRule]
  }
  
  @scala.inline
  implicit class ForwardingRuleOps[Self <: ForwardingRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIPAddress(value: String): Self = this.set("IPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPAddress: Self = this.set("IPAddress", js.undefined)
    
    @scala.inline
    def setIPProtocol(value: String): Self = this.set("IPProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPProtocol: Self = this.set("IPProtocol", js.undefined)
    
    @scala.inline
    def setAllPorts(value: Boolean): Self = this.set("allPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllPorts: Self = this.set("allPorts", js.undefined)
    
    @scala.inline
    def setAllowGlobalAccess(value: Boolean): Self = this.set("allowGlobalAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowGlobalAccess: Self = this.set("allowGlobalAccess", js.undefined)
    
    @scala.inline
    def setBackendService(value: String): Self = this.set("backendService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendService: Self = this.set("backendService", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIpVersion(value: String): Self = this.set("ipVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpVersion: Self = this.set("ipVersion", js.undefined)
    
    @scala.inline
    def setIsMirroringCollector(value: Boolean): Self = this.set("isMirroringCollector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMirroringCollector: Self = this.set("isMirroringCollector", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLoadBalancingScheme(value: String): Self = this.set("loadBalancingScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancingScheme: Self = this.set("loadBalancingScheme", js.undefined)
    
    @scala.inline
    def setMetadataFiltersVarargs(value: MetadataFilter*): Self = this.set("metadataFilters", js.Array(value :_*))
    
    @scala.inline
    def setMetadataFilters(value: js.Array[MetadataFilter]): Self = this.set("metadataFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataFilters: Self = this.set("metadataFilters", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    
    @scala.inline
    def setNetworkTier(value: String): Self = this.set("networkTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkTier: Self = this.set("networkTier", js.undefined)
    
    @scala.inline
    def setPortRange(value: String): Self = this.set("portRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortRange: Self = this.set("portRange", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: String*): Self = this.set("ports", js.Array(value :_*))
    
    @scala.inline
    def setPorts(value: js.Array[String]): Self = this.set("ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePorts: Self = this.set("ports", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setServiceLabel(value: String): Self = this.set("serviceLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceLabel: Self = this.set("serviceLabel", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
    
    @scala.inline
    def setSubnetwork(value: String): Self = this.set("subnetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetwork: Self = this.set("subnetwork", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
