package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Network resource. Read Virtual Private Cloud (VPC) Network
  * Overview for more information. (== resource_for v1.networks ==) (==
  * resource_for beta.networks ==)
  */
@js.native
trait SchemaNetwork extends js.Object {
  
  /**
    * Deprecated in favor of subnet mode networks. The range of internal
    * addresses that are legal on this network. This range is a CIDR
    * specification, for example: 192.168.0.0/16. Provided by the client when
    * the network is created.
    */
  var IPv4Range: js.UndefOr[String] = js.native
  
  /**
    * When set to true, the VPC network is created in &quot;auto&quot; mode.
    * When set to false, the VPC network is created in &quot;custom&quot; mode.
    * An auto mode VPC network starts with one subnet per region. Each subnet
    * has a predetermined range as described in Auto mode VPC network IP
    * ranges.
    */
  var autoCreateSubnetworks: js.UndefOr[Boolean] = js.native
  
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
    * [Output Only] The gateway address for default routing out of the network.
    * This value is read only and is selected by GCP.
    */
  var gatewayIPv4: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Type of the resource. Always compute#network for networks.
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
    * [Output Only] A list of network peerings for the resource.
    */
  var peerings: js.UndefOr[js.Array[SchemaNetworkPeering]] = js.native
  
  /**
    * The network-level routing configuration for this network. Used by Cloud
    * Router to determine what type of network-wide routing behavior to
    * enforce.
    */
  var routingConfig: js.UndefOr[SchemaNetworkRoutingConfig] = js.native
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Server-defined fully-qualified URLs for all subnetworks in
    * this VPC network.
    */
  var subnetworks: js.UndefOr[js.Array[String]] = js.native
}
object SchemaNetwork {
  
  @scala.inline
  def apply(): SchemaNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetwork]
  }
  
  @scala.inline
  implicit class SchemaNetworkOps[Self <: SchemaNetwork] (val x: Self) extends AnyVal {
    
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
    def setIPv4Range(value: String): Self = this.set("IPv4Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPv4Range: Self = this.set("IPv4Range", js.undefined)
    
    @scala.inline
    def setAutoCreateSubnetworks(value: Boolean): Self = this.set("autoCreateSubnetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCreateSubnetworks: Self = this.set("autoCreateSubnetworks", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setGatewayIPv4(value: String): Self = this.set("gatewayIPv4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayIPv4: Self = this.set("gatewayIPv4", js.undefined)
    
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
    def setPeeringsVarargs(value: SchemaNetworkPeering*): Self = this.set("peerings", js.Array(value :_*))
    
    @scala.inline
    def setPeerings(value: js.Array[SchemaNetworkPeering]): Self = this.set("peerings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerings: Self = this.set("peerings", js.undefined)
    
    @scala.inline
    def setRoutingConfig(value: SchemaNetworkRoutingConfig): Self = this.set("routingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingConfig: Self = this.set("routingConfig", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setSubnetworksVarargs(value: String*): Self = this.set("subnetworks", js.Array(value :_*))
    
    @scala.inline
    def setSubnetworks(value: js.Array[String]): Self = this.set("subnetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetworks: Self = this.set("subnetworks", js.undefined)
  }
}
