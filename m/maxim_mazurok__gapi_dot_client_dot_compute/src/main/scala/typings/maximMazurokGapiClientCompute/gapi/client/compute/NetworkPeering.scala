package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkPeering extends StObject {
  
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
  implicit class NetworkPeeringMutableBuilder[Self <: NetworkPeering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoCreateRoutes(value: Boolean): Self = StObject.set(x, "autoCreateRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCreateRoutesUndefined: Self = StObject.set(x, "autoCreateRoutes", js.undefined)
    
    @scala.inline
    def setExchangeSubnetRoutes(value: Boolean): Self = StObject.set(x, "exchangeSubnetRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeSubnetRoutesUndefined: Self = StObject.set(x, "exchangeSubnetRoutes", js.undefined)
    
    @scala.inline
    def setExportCustomRoutes(value: Boolean): Self = StObject.set(x, "exportCustomRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportCustomRoutesUndefined: Self = StObject.set(x, "exportCustomRoutes", js.undefined)
    
    @scala.inline
    def setExportSubnetRoutesWithPublicIp(value: Boolean): Self = StObject.set(x, "exportSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportSubnetRoutesWithPublicIpUndefined: Self = StObject.set(x, "exportSubnetRoutesWithPublicIp", js.undefined)
    
    @scala.inline
    def setImportCustomRoutes(value: Boolean): Self = StObject.set(x, "importCustomRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportCustomRoutesUndefined: Self = StObject.set(x, "importCustomRoutes", js.undefined)
    
    @scala.inline
    def setImportSubnetRoutesWithPublicIp(value: Boolean): Self = StObject.set(x, "importSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportSubnetRoutesWithPublicIpUndefined: Self = StObject.set(x, "importSubnetRoutesWithPublicIp", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setPeerMtu(value: Double): Self = StObject.set(x, "peerMtu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerMtuUndefined: Self = StObject.set(x, "peerMtu", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateDetails(value: String): Self = StObject.set(x, "stateDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateDetailsUndefined: Self = StObject.set(x, "stateDetails", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
