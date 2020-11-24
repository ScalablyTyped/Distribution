package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaTargetVpnGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetVpnGateway]
  }
  
  @scala.inline
  implicit class SchemaTargetVpnGatewayOps[Self <: SchemaTargetVpnGateway] (val x: Self) extends AnyVal {
    
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
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setForwardingRulesVarargs(value: String*): Self = this.set("forwardingRules", js.Array(value :_*))
    
    @scala.inline
    def setForwardingRules(value: js.Array[String]): Self = this.set("forwardingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardingRules: Self = this.set("forwardingRules", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTunnelsVarargs(value: String*): Self = this.set("tunnels", js.Array(value :_*))
    
    @scala.inline
    def setTunnels(value: js.Array[String]): Self = this.set("tunnels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunnels: Self = this.set("tunnels", js.undefined)
  }
}
