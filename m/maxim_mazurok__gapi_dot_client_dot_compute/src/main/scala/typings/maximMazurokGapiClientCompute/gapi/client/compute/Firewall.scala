package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.IPProtocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Firewall extends StObject {
  
  /** The list of ALLOW rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a permitted connection. */
  var allowed: js.UndefOr[js.Array[IPProtocol]] = js.undefined
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /** The list of DENY rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a denied connection. */
  var denied: js.UndefOr[js.Array[IPProtocol]] = js.undefined
  
  /** An optional description of this resource. Provide this field when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * If destination ranges are specified, the firewall rule applies only to traffic that has destination IP address in these ranges. These ranges must be expressed in CIDR format. Only
    * IPv4 is supported.
    */
  var destinationRanges: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Direction of traffic to which this firewall applies, either `INGRESS` or `EGRESS`. The default is `INGRESS`. For `INGRESS` traffic, you cannot specify the destinationRanges field,
    * and for `EGRESS` traffic, you cannot specify the sourceRanges or sourceTags fields.
    */
  var direction: js.UndefOr[String] = js.undefined
  
  /**
    * Denotes whether the firewall rule is disabled. When set to true, the firewall rule is not enforced and the network behaves as if it did not exist. If this is unspecified, the
    * firewall rule will be enabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Type of the resource. Always compute#firewall for firewall rules. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** This field denotes the logging options for a particular firewall rule. If logging is enabled, logs will be exported to Cloud Logging. */
  var logConfig: js.UndefOr[FirewallLogConfig] = js.undefined
  
  /**
    * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?. The first character must be a lowercase letter, and all following characters (except for the last
    * character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * URL of the network resource for this firewall rule. If not specified when creating a firewall rule, the default network is used:
    * global/networks/default
    * If you choose to specify this field, you can specify the network as a full or partial URL. For example, the following are all valid URLs:
    * - https://www.googleapis.com/compute/v1/projects/myproject/global/networks/my-network
    * - projects/myproject/global/networks/my-network
    * - global/networks/default
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * Priority for this rule. This is an integer between `0` and `65535`, both inclusive. The default value is `1000`. Relative priorities determine which rule takes effect if multiple
    * rules apply. Lower values indicate higher priority. For example, a rule with priority `0` has higher precedence than a rule with priority `1`. DENY rules take precedence over ALLOW
    * rules if they have equal priority. Note that VPC networks have implied rules with a priority of `65535`. To avoid conflicts with the implied rules, use a priority number less than
    * `65535`.
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * If source ranges are specified, the firewall rule applies only to traffic that has a source IP address in these ranges. These ranges must be expressed in CIDR format. One or both of
    * sourceRanges and sourceTags may be set. If both fields are set, the rule applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a
    * matching tag listed in the sourceTags field. The connection does not need to match both fields for the rule to apply. Only IPv4 is supported.
    */
  var sourceRanges: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If source service accounts are specified, the firewall rules apply only to traffic originating from an instance with a service account in this list. Source service accounts cannot
    * be used to control traffic to an instance's external IP address because service accounts are associated with an instance, not an IP address. sourceRanges can be set at the same time
    * as sourceServiceAccounts. If both are set, the firewall applies to traffic that has a source IP address within the sourceRanges OR a source IP that belongs to an instance with
    * service account listed in sourceServiceAccount. The connection does not need to match both fields for the firewall to apply. sourceServiceAccounts cannot be used at the same time as
    * sourceTags or targetTags.
    */
  var sourceServiceAccounts: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If source tags are specified, the firewall rule applies only to traffic with source IPs that match the primary network interfaces of VM instances that have the tag and are in the
    * same VPC network. Source tags cannot be used to control traffic to an instance's external IP address, it only applies to traffic between instances in the same virtual network.
    * Because tags are associated with instances, not IP addresses. One or both of sourceRanges and sourceTags may be set. If both fields are set, the firewall applies to traffic that has
    * a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the
    * firewall to apply.
    */
  var sourceTags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of service accounts indicating sets of instances located in the network that may make network connections as specified in allowed[]. targetServiceAccounts cannot be used at
    * the same time as targetTags or sourceTags. If neither targetServiceAccounts nor targetTags are specified, the firewall rule applies to all instances on the specified network.
    */
  var targetServiceAccounts: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of tags that controls which instances the firewall rule applies to. If targetTags are specified, then the firewall rule applies only to instances in the VPC network that have
    * one of those tags. If no targetTags are specified, the firewall rule applies to all instances on the specified network.
    */
  var targetTags: js.UndefOr[js.Array[String]] = js.undefined
}
object Firewall {
  
  @scala.inline
  def apply(): Firewall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Firewall]
  }
  
  @scala.inline
  implicit class FirewallMutableBuilder[Self <: Firewall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowed(value: js.Array[IPProtocol]): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
    
    @scala.inline
    def setAllowedVarargs(value: IPProtocol*): Self = StObject.set(x, "allowed", js.Array(value :_*))
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDenied(value: js.Array[IPProtocol]): Self = StObject.set(x, "denied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeniedUndefined: Self = StObject.set(x, "denied", js.undefined)
    
    @scala.inline
    def setDeniedVarargs(value: IPProtocol*): Self = StObject.set(x, "denied", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDestinationRanges(value: js.Array[String]): Self = StObject.set(x, "destinationRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationRangesUndefined: Self = StObject.set(x, "destinationRanges", js.undefined)
    
    @scala.inline
    def setDestinationRangesVarargs(value: String*): Self = StObject.set(x, "destinationRanges", js.Array(value :_*))
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLogConfig(value: FirewallLogConfig): Self = StObject.set(x, "logConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogConfigUndefined: Self = StObject.set(x, "logConfig", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setSourceRanges(value: js.Array[String]): Self = StObject.set(x, "sourceRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRangesUndefined: Self = StObject.set(x, "sourceRanges", js.undefined)
    
    @scala.inline
    def setSourceRangesVarargs(value: String*): Self = StObject.set(x, "sourceRanges", js.Array(value :_*))
    
    @scala.inline
    def setSourceServiceAccounts(value: js.Array[String]): Self = StObject.set(x, "sourceServiceAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceServiceAccountsUndefined: Self = StObject.set(x, "sourceServiceAccounts", js.undefined)
    
    @scala.inline
    def setSourceServiceAccountsVarargs(value: String*): Self = StObject.set(x, "sourceServiceAccounts", js.Array(value :_*))
    
    @scala.inline
    def setSourceTags(value: js.Array[String]): Self = StObject.set(x, "sourceTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTagsUndefined: Self = StObject.set(x, "sourceTags", js.undefined)
    
    @scala.inline
    def setSourceTagsVarargs(value: String*): Self = StObject.set(x, "sourceTags", js.Array(value :_*))
    
    @scala.inline
    def setTargetServiceAccounts(value: js.Array[String]): Self = StObject.set(x, "targetServiceAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetServiceAccountsUndefined: Self = StObject.set(x, "targetServiceAccounts", js.undefined)
    
    @scala.inline
    def setTargetServiceAccountsVarargs(value: String*): Self = StObject.set(x, "targetServiceAccounts", js.Array(value :_*))
    
    @scala.inline
    def setTargetTags(value: js.Array[String]): Self = StObject.set(x, "targetTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTagsUndefined: Self = StObject.set(x, "targetTags", js.undefined)
    
    @scala.inline
    def setTargetTagsVarargs(value: String*): Self = StObject.set(x, "targetTags", js.Array(value :_*))
  }
}
