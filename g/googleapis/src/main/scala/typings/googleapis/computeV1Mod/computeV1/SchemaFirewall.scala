package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.AnonIPProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Firewall resource.
  */
@js.native
trait SchemaFirewall extends js.Object {
  /**
    * The list of ALLOW rules specified by this firewall. Each rule specifies a
    * protocol and port-range tuple that describes a permitted connection.
    */
  var allowed: js.UndefOr[js.Array[AnonIPProtocol]] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * The list of DENY rules specified by this firewall. Each rule specifies a
    * protocol and port-range tuple that describes a denied connection.
    */
  var denied: js.UndefOr[js.Array[AnonIPProtocol]] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * If destination ranges are specified, the firewall will apply only to
    * traffic that has destination IP address in these ranges. These ranges
    * must be expressed in CIDR format. Only IPv4 is supported.
    */
  var destinationRanges: js.UndefOr[js.Array[String]] = js.native
  /**
    * Direction of traffic to which this firewall applies; default is INGRESS.
    * Note: For INGRESS traffic, it is NOT supported to specify
    * destinationRanges; For EGRESS traffic, it is NOT supported to specify
    * sourceRanges OR sourceTags.
    */
  var direction: js.UndefOr[String] = js.native
  /**
    * Denotes whether the firewall rule is disabled, i.e not applied to the
    * network it is associated with. When set to true, the firewall rule is not
    * enforced and the network behaves as if it did not exist. If this is
    * unspecified, the firewall rule will be enabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#firewall for firewall
    * rules.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * This field denotes the logging options for a particular firewall rule. If
    * logging is enabled, logs will be exported to Stackdriver.
    */
  var logConfig: js.UndefOr[SchemaFirewallLogConfig] = js.native
  /**
    * Name of the resource; provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * URL of the network resource for this firewall rule. If not specified when
    * creating a firewall rule, the default network is used:
    * global/networks/default If you choose to specify this property, you can
    * specify the network as a full or partial URL. For example, the following
    * are all valid URLs:   -
    * https://www.googleapis.com/compute/v1/projects/myproject/global/networks/my-network
    * - projects/myproject/global/networks/my-network  -
    * global/networks/default
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Priority for this rule. This is an integer between 0 and 65535, both
    * inclusive. When not specified, the value assumed is 1000. Relative
    * priorities determine precedence of conflicting rules. Lower value of
    * priority implies higher precedence (eg, a rule with priority 0 has higher
    * precedence than a rule with priority 1). DENY rules take precedence over
    * ALLOW rules having equal priority.
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * If source ranges are specified, the firewall will apply only to traffic
    * that has source IP address in these ranges. These ranges must be
    * expressed in CIDR format. One or both of sourceRanges and sourceTags may
    * be set. If both properties are set, the firewall will apply to traffic
    * that has source IP address within sourceRanges OR the source IP that
    * belongs to a tag listed in the sourceTags property. The connection does
    * not need to match both properties for the firewall to apply. Only IPv4 is
    * supported.
    */
  var sourceRanges: js.UndefOr[js.Array[String]] = js.native
  /**
    * If source service accounts are specified, the firewall will apply only to
    * traffic originating from an instance with a service account in this list.
    * Source service accounts cannot be used to control traffic to an
    * instance&#39;s external IP address because service accounts are
    * associated with an instance, not an IP address. sourceRanges can be set
    * at the same time as sourceServiceAccounts. If both are set, the firewall
    * will apply to traffic that has source IP address within sourceRanges OR
    * the source IP belongs to an instance with service account listed in
    * sourceServiceAccount. The connection does not need to match both
    * properties for the firewall to apply. sourceServiceAccounts cannot be
    * used at the same time as sourceTags or targetTags.
    */
  var sourceServiceAccounts: js.UndefOr[js.Array[String]] = js.native
  /**
    * If source tags are specified, the firewall rule applies only to traffic
    * with source IPs that match the primary network interfaces of VM instances
    * that have the tag and are in the same VPC network. Source tags cannot be
    * used to control traffic to an instance&#39;s external IP address, it only
    * applies to traffic between instances in the same virtual network. Because
    * tags are associated with instances, not IP addresses. One or both of
    * sourceRanges and sourceTags may be set. If both properties are set, the
    * firewall will apply to traffic that has source IP address within
    * sourceRanges OR the source IP that belongs to a tag listed in the
    * sourceTags property. The connection does not need to match both
    * properties for the firewall to apply.
    */
  var sourceTags: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of service accounts indicating sets of instances located in the
    * network that may make network connections as specified in allowed[].
    * targetServiceAccounts cannot be used at the same time as targetTags or
    * sourceTags. If neither targetServiceAccounts nor targetTags are
    * specified, the firewall rule applies to all instances on the specified
    * network.
    */
  var targetServiceAccounts: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of tags that controls which instances the firewall rule applies
    * to. If targetTags are specified, then the firewall rule applies only to
    * instances in the VPC network that have one of those tags. If no
    * targetTags are specified, the firewall rule applies to all instances on
    * the specified network.
    */
  var targetTags: js.UndefOr[js.Array[String]] = js.native
}

object SchemaFirewall {
  @scala.inline
  def apply(
    allowed: js.Array[AnonIPProtocol] = null,
    creationTimestamp: String = null,
    denied: js.Array[AnonIPProtocol] = null,
    description: String = null,
    destinationRanges: js.Array[String] = null,
    direction: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    logConfig: SchemaFirewallLogConfig = null,
    name: String = null,
    network: String = null,
    priority: Int | Double = null,
    selfLink: String = null,
    sourceRanges: js.Array[String] = null,
    sourceServiceAccounts: js.Array[String] = null,
    sourceTags: js.Array[String] = null,
    targetServiceAccounts: js.Array[String] = null,
    targetTags: js.Array[String] = null
  ): SchemaFirewall = {
    val __obj = js.Dynamic.literal()
    if (allowed != null) __obj.updateDynamic("allowed")(allowed.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (denied != null) __obj.updateDynamic("denied")(denied.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (destinationRanges != null) __obj.updateDynamic("destinationRanges")(destinationRanges.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (logConfig != null) __obj.updateDynamic("logConfig")(logConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (sourceRanges != null) __obj.updateDynamic("sourceRanges")(sourceRanges.asInstanceOf[js.Any])
    if (sourceServiceAccounts != null) __obj.updateDynamic("sourceServiceAccounts")(sourceServiceAccounts.asInstanceOf[js.Any])
    if (sourceTags != null) __obj.updateDynamic("sourceTags")(sourceTags.asInstanceOf[js.Any])
    if (targetServiceAccounts != null) __obj.updateDynamic("targetServiceAccounts")(targetServiceAccounts.asInstanceOf[js.Any])
    if (targetTags != null) __obj.updateDynamic("targetTags")(targetTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFirewall]
  }
}

