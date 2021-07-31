package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworksAddPeeringRequest extends StObject {
  
  /**
    * This field will be deprecated soon. Use exchange_subnet_routes in network_peering instead. Indicates whether full mesh connectivity is created and managed automatically between
    * peered networks. Currently this field should always be true since Google Compute Engine will automatically create and manage subnetwork routes between two networks when peering
    * state is ACTIVE.
    */
  var autoCreateRoutes: js.UndefOr[Boolean] = js.undefined
  
  /** Name of the peering, which should conform to RFC1035. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Network peering parameters. In order to specify route policies for peering using import and export custom routes, you must specify all peering related parameters (name, peer
    * network, exchange_subnet_routes) in the network_peering field. The corresponding fields in NetworksAddPeeringRequest will be deprecated soon.
    */
  var networkPeering: js.UndefOr[NetworkPeering] = js.undefined
  
  /**
    * URL of the peer network. It can be either full URL or partial URL. The peer network may belong to a different project. If the partial URL does not contain project, it is assumed
    * that the peer network is in the same project as the current network.
    */
  var peerNetwork: js.UndefOr[String] = js.undefined
}
object NetworksAddPeeringRequest {
  
  @scala.inline
  def apply(): NetworksAddPeeringRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworksAddPeeringRequest]
  }
  
  @scala.inline
  implicit class NetworksAddPeeringRequestMutableBuilder[Self <: NetworksAddPeeringRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoCreateRoutes(value: Boolean): Self = StObject.set(x, "autoCreateRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCreateRoutesUndefined: Self = StObject.set(x, "autoCreateRoutes", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetworkPeering(value: NetworkPeering): Self = StObject.set(x, "networkPeering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkPeeringUndefined: Self = StObject.set(x, "networkPeering", js.undefined)
    
    @scala.inline
    def setPeerNetwork(value: String): Self = StObject.set(x, "peerNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerNetworkUndefined: Self = StObject.set(x, "peerNetwork", js.undefined)
  }
}
