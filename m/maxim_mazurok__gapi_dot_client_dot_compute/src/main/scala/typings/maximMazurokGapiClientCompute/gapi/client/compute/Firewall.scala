package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.IPProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Firewall extends js.Object {
  
  /** The list of ALLOW rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a permitted connection. */
  var allowed: js.UndefOr[js.Array[IPProtocol]] = js.native
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /** The list of DENY rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a denied connection. */
  var denied: js.UndefOr[js.Array[IPProtocol]] = js.native
  
  /** An optional description of this resource. Provide this field when you create the resource. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * If destination ranges are specified, the firewall rule applies only to traffic that has destination IP address in these ranges. These ranges must be expressed in CIDR format. Only
    * IPv4 is supported.
    */
  var destinationRanges: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Direction of traffic to which this firewall applies, either `INGRESS` or `EGRESS`. The default is `INGRESS`. For `INGRESS` traffic, you cannot specify the destinationRanges field,
    * and for `EGRESS` traffic, you cannot specify the sourceRanges or sourceTags fields.
    */
  var direction: js.UndefOr[String] = js.native
  
  /**
    * Denotes whether the firewall rule is disabled. When set to true, the firewall rule is not enforced and the network behaves as if it did not exist. If this is unspecified, the
    * firewall rule will be enabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  
  /** [Output Only] Type of the resource. Always compute#firewall for firewall rules. */
  var kind: js.UndefOr[String] = js.native
  
  /** This field denotes the logging options for a particular firewall rule. If logging is enabled, logs will be exported to Cloud Logging. */
  var logConfig: js.UndefOr[FirewallLogConfig] = js.native
  
  /**
    * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?. The first character must be a lowercase letter, and all following characters (except for the last
    * character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * URL of the network resource for this firewall rule. If not specified when creating a firewall rule, the default network is used:
    * global/networks/default
    * If you choose to specify this field, you can specify the network as a full or partial URL. For example, the following are all valid URLs:
    * - https://www.googleapis.com/compute/v1/projects/myproject/global/networks/my-network
    * - projects/myproject/global/networks/my-network
    * - global/networks/default
    */
  var network: js.UndefOr[String] = js.native
  
  /**
    * Priority for this rule. This is an integer between `0` and `65535`, both inclusive. The default value is `1000`. Relative priorities determine which rule takes effect if multiple
    * rules apply. Lower values indicate higher priority. For example, a rule with priority `0` has higher precedence than a rule with priority `1`. DENY rules take precedence over ALLOW
    * rules if they have equal priority. Note that VPC networks have implied rules with a priority of `65535`. To avoid conflicts with the implied rules, use a priority number less than
    * `65535`.
    */
  var priority: js.UndefOr[Double] = js.native
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * If source ranges are specified, the firewall rule applies only to traffic that has a source IP address in these ranges. These ranges must be expressed in CIDR format. One or both of
    * sourceRanges and sourceTags may be set. If both fields are set, the rule applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a
    * matching tag listed in the sourceTags field. The connection does not need to match both fields for the rule to apply. Only IPv4 is supported.
    */
  var sourceRanges: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If source service accounts are specified, the firewall rules apply only to traffic originating from an instance with a service account in this list. Source service accounts cannot
    * be used to control traffic to an instance's external IP address because service accounts are associated with an instance, not an IP address. sourceRanges can be set at the same time
    * as sourceServiceAccounts. If both are set, the firewall applies to traffic that has a source IP address within the sourceRanges OR a source IP that belongs to an instance with
    * service account listed in sourceServiceAccount. The connection does not need to match both fields for the firewall to apply. sourceServiceAccounts cannot be used at the same time as
    * sourceTags or targetTags.
    */
  var sourceServiceAccounts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If source tags are specified, the firewall rule applies only to traffic with source IPs that match the primary network interfaces of VM instances that have the tag and are in the
    * same VPC network. Source tags cannot be used to control traffic to an instance's external IP address, it only applies to traffic between instances in the same virtual network.
    * Because tags are associated with instances, not IP addresses. One or both of sourceRanges and sourceTags may be set. If both fields are set, the firewall applies to traffic that has
    * a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the
    * firewall to apply.
    */
  var sourceTags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of service accounts indicating sets of instances located in the network that may make network connections as specified in allowed[]. targetServiceAccounts cannot be used at
    * the same time as targetTags or sourceTags. If neither targetServiceAccounts nor targetTags are specified, the firewall rule applies to all instances on the specified network.
    */
  var targetServiceAccounts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of tags that controls which instances the firewall rule applies to. If targetTags are specified, then the firewall rule applies only to instances in the VPC network that have
    * one of those tags. If no targetTags are specified, the firewall rule applies to all instances on the specified network.
    */
  var targetTags: js.UndefOr[js.Array[String]] = js.native
}
object Firewall {
  
  @scala.inline
  def apply(): Firewall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Firewall]
  }
  
  @scala.inline
  implicit class FirewallOps[Self <: Firewall] (val x: Self) extends AnyVal {
    
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
    def setAllowedVarargs(value: IPProtocol*): Self = this.set("allowed", js.Array(value :_*))
    
    @scala.inline
    def setAllowed(value: js.Array[IPProtocol]): Self = this.set("allowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowed: Self = this.set("allowed", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDeniedVarargs(value: IPProtocol*): Self = this.set("denied", js.Array(value :_*))
    
    @scala.inline
    def setDenied(value: js.Array[IPProtocol]): Self = this.set("denied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDenied: Self = this.set("denied", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDestinationRangesVarargs(value: String*): Self = this.set("destinationRanges", js.Array(value :_*))
    
    @scala.inline
    def setDestinationRanges(value: js.Array[String]): Self = this.set("destinationRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationRanges: Self = this.set("destinationRanges", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLogConfig(value: FirewallLogConfig): Self = this.set("logConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogConfig: Self = this.set("logConfig", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setSourceRangesVarargs(value: String*): Self = this.set("sourceRanges", js.Array(value :_*))
    
    @scala.inline
    def setSourceRanges(value: js.Array[String]): Self = this.set("sourceRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceRanges: Self = this.set("sourceRanges", js.undefined)
    
    @scala.inline
    def setSourceServiceAccountsVarargs(value: String*): Self = this.set("sourceServiceAccounts", js.Array(value :_*))
    
    @scala.inline
    def setSourceServiceAccounts(value: js.Array[String]): Self = this.set("sourceServiceAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceServiceAccounts: Self = this.set("sourceServiceAccounts", js.undefined)
    
    @scala.inline
    def setSourceTagsVarargs(value: String*): Self = this.set("sourceTags", js.Array(value :_*))
    
    @scala.inline
    def setSourceTags(value: js.Array[String]): Self = this.set("sourceTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTags: Self = this.set("sourceTags", js.undefined)
    
    @scala.inline
    def setTargetServiceAccountsVarargs(value: String*): Self = this.set("targetServiceAccounts", js.Array(value :_*))
    
    @scala.inline
    def setTargetServiceAccounts(value: js.Array[String]): Self = this.set("targetServiceAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetServiceAccounts: Self = this.set("targetServiceAccounts", js.undefined)
    
    @scala.inline
    def setTargetTagsVarargs(value: String*): Self = this.set("targetTags", js.Array(value :_*))
    
    @scala.inline
    def setTargetTags(value: js.Array[String]): Self = this.set("targetTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetTags: Self = this.set("targetTags", js.undefined)
  }
}
