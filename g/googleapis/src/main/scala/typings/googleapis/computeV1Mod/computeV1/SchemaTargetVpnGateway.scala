package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Target VPN gateway resource. (== resource_for
  * beta.targetVpnGateways ==) (== resource_for v1.targetVpnGateways ==)
  */
@js.native
trait SchemaTargetVpnGateway extends js.Object {
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] A list of URLs to the ForwardingRule resources.
    * ForwardingRules are created using compute.forwardingRules.insert and
    * associated with a VPN gateway.
    */
  var forwardingRules: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of resource. Always compute#targetVpnGateway for
    * target VPN gateways.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * URL of the network to which this VPN gateway is attached. Provided by the
    * client when the VPN gateway is created.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * [Output Only] URL of the region where the target VPN gateway resides. You
    * must specify this field as part of the HTTP request URL. It is not
    * settable as a field in the request body.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] The status of the VPN gateway, which can be one of the
    * following: CREATING, READY, FAILED, or DELETING.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * [Output Only] A list of URLs to VpnTunnel resources. VpnTunnels are
    * created using the compute.vpntunnels.insert method and associated with a
    * VPN gateway.
    */
  var tunnels: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTargetVpnGateway {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    description: String = null,
    forwardingRules: js.Array[String] = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    network: String = null,
    region: String = null,
    selfLink: String = null,
    status: String = null,
    tunnels: js.Array[String] = null
  ): SchemaTargetVpnGateway = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (forwardingRules != null) __obj.updateDynamic("forwardingRules")(forwardingRules.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tunnels != null) __obj.updateDynamic("tunnels")(tunnels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetVpnGateway]
  }
}

