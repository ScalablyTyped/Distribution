package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworksAddPeeringRequest extends js.Object {
  
  /**
    * This field will be deprecated soon. Use exchange_subnet_routes in network_peering instead. Indicates whether full mesh connectivity is created and managed automatically between
    * peered networks. Currently this field should always be true since Google Compute Engine will automatically create and manage subnetwork routes between two networks when peering
    * state is ACTIVE.
    */
  var autoCreateRoutes: js.UndefOr[Boolean] = js.native
  
  /** Name of the peering, which should conform to RFC1035. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Network peering parameters. In order to specify route policies for peering using import and export custom routes, you must specify all peering related parameters (name, peer
    * network, exchange_subnet_routes) in the network_peering field. The corresponding fields in NetworksAddPeeringRequest will be deprecated soon.
    */
  var networkPeering: js.UndefOr[NetworkPeering] = js.native
  
  /**
    * URL of the peer network. It can be either full URL or partial URL. The peer network may belong to a different project. If the partial URL does not contain project, it is assumed
    * that the peer network is in the same project as the current network.
    */
  var peerNetwork: js.UndefOr[String] = js.native
}
object NetworksAddPeeringRequest {
  
  @scala.inline
  def apply(): NetworksAddPeeringRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworksAddPeeringRequest]
  }
  
  @scala.inline
  implicit class NetworksAddPeeringRequestOps[Self <: NetworksAddPeeringRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetworkPeering(value: NetworkPeering): Self = this.set("networkPeering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkPeering: Self = this.set("networkPeering", js.undefined)
    
    @scala.inline
    def setPeerNetwork(value: String): Self = this.set("peerNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerNetwork: Self = this.set("peerNetwork", js.undefined)
  }
}
