package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkPeering extends js.Object {
  
  /**
    * This field will be deprecated soon. Use the exchange_subnet_routes field instead. Indicates whether full mesh connectivity is created and managed automatically between peered
    * networks. Currently this field should always be true since Google Compute Engine will automatically create and manage subnetwork routes between two networks when peering state is
    * ACTIVE.
    */
  var autoCreateRoutes: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether full mesh connectivity is created and managed automatically between peered networks. Currently this field should always be true since Google Compute Engine will
    * automatically create and manage subnetwork routes between two networks when peering state is ACTIVE.
    */
  var exchangeSubnetRoutes: js.UndefOr[Boolean] = js.native
  
  /** Whether to export the custom routes to peer network. */
  var exportCustomRoutes: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether subnet routes with public IP range are exported. The default value is true, all subnet routes are exported. The IPv4 special-use ranges
    * (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always exported to peers and are not controlled by this field.
    */
  var exportSubnetRoutesWithPublicIp: js.UndefOr[Boolean] = js.native
  
  /** Whether to import the custom routes from peer network. */
  var importCustomRoutes: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether subnet routes with public IP range are imported. The default value is false. The IPv4 special-use ranges (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always
    * imported from peers and are not controlled by this field.
    */
  var importSubnetRoutesWithPublicIp: js.UndefOr[Boolean] = js.native
  
  /**
    * Name of this peering. Provided by the client when the peering is created. The name must comply with RFC1035. Specifically, the name must be 1-63 characters long and match regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all the following characters must be a dash, lowercase letter, or digit, except the last
    * character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The URL of the peer network. It can be either full URL or partial URL. The peer network may belong to a different project. If the partial URL does not contain project, it is assumed
    * that the peer network is in the same project as the current network.
    */
  var network: js.UndefOr[String] = js.native
  
  /** Maximum Transmission Unit in bytes. */
  var peerMtu: js.UndefOr[Double] = js.native
  
  /** [Output Only] State for the peering, either `ACTIVE` or `INACTIVE`. The peering is `ACTIVE` when there's a matching configuration in the peer network. */
  var state: js.UndefOr[String] = js.native
  
  /** [Output Only] Details about the current state of the peering. */
  var stateDetails: js.UndefOr[String] = js.native
}
object NetworkPeering {
  
  @scala.inline
  def apply(): NetworkPeering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPeering]
  }
  
  @scala.inline
  implicit class NetworkPeeringOps[Self <: NetworkPeering] (val x: Self) extends AnyVal {
    
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
    def setAutoCreateRoutes(value: Boolean): Self = this.set("autoCreateRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCreateRoutes: Self = this.set("autoCreateRoutes", js.undefined)
    
    @scala.inline
    def setExchangeSubnetRoutes(value: Boolean): Self = this.set("exchangeSubnetRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExchangeSubnetRoutes: Self = this.set("exchangeSubnetRoutes", js.undefined)
    
    @scala.inline
    def setExportCustomRoutes(value: Boolean): Self = this.set("exportCustomRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportCustomRoutes: Self = this.set("exportCustomRoutes", js.undefined)
    
    @scala.inline
    def setExportSubnetRoutesWithPublicIp(value: Boolean): Self = this.set("exportSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportSubnetRoutesWithPublicIp: Self = this.set("exportSubnetRoutesWithPublicIp", js.undefined)
    
    @scala.inline
    def setImportCustomRoutes(value: Boolean): Self = this.set("importCustomRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportCustomRoutes: Self = this.set("importCustomRoutes", js.undefined)
    
    @scala.inline
    def setImportSubnetRoutesWithPublicIp(value: Boolean): Self = this.set("importSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportSubnetRoutesWithPublicIp: Self = this.set("importSubnetRoutesWithPublicIp", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    
    @scala.inline
    def setPeerMtu(value: Double): Self = this.set("peerMtu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerMtu: Self = this.set("peerMtu", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStateDetails(value: String): Self = this.set("stateDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateDetails: Self = this.set("stateDetails", js.undefined)
  }
}
