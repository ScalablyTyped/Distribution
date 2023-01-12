package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkPeering extends StObject {
  
  /**
    * This field will be deprecated soon. Use the exchange_subnet_routes field instead. Indicates whether full mesh connectivity is created and managed automatically between peered
    * networks. Currently this field should always be true since Google Compute Engine will automatically create and manage subnetwork routes between two networks when peering state is
    * ACTIVE.
    */
  var autoCreateRoutes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether full mesh connectivity is created and managed automatically between peered networks. Currently this field should always be true since Google Compute Engine will
    * automatically create and manage subnetwork routes between two networks when peering state is ACTIVE.
    */
  var exchangeSubnetRoutes: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to export the custom routes to peer network. */
  var exportCustomRoutes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether subnet routes with public IP range are exported. The default value is true, all subnet routes are exported. The IPv4 special-use ranges
    * (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always exported to peers and are not controlled by this field.
    */
  var exportSubnetRoutesWithPublicIp: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to import the custom routes from peer network. */
  var importCustomRoutes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether subnet routes with public IP range are imported. The default value is false. The IPv4 special-use ranges (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always
    * imported from peers and are not controlled by this field.
    */
  var importSubnetRoutesWithPublicIp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Name of this peering. Provided by the client when the peering is created. The name must comply with RFC1035. Specifically, the name must be 1-63 characters long and match regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all the following characters must be a dash, lowercase letter, or digit, except the last
    * character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the peer network. It can be either full URL or partial URL. The peer network may belong to a different project. If the partial URL does not contain project, it is assumed
    * that the peer network is in the same project as the current network.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /** Maximum Transmission Unit in bytes. */
  var peerMtu: js.UndefOr[Double] = js.undefined
  
  /** [Output Only] State for the peering, either `ACTIVE` or `INACTIVE`. The peering is `ACTIVE` when there's a matching configuration in the peer network. */
  var state: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Details about the current state of the peering. */
  var stateDetails: js.UndefOr[String] = js.undefined
}
object NetworkPeering {
  
  inline def apply(): NetworkPeering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPeering]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkPeering] (val x: Self) extends AnyVal {
    
    inline def setAutoCreateRoutes(value: Boolean): Self = StObject.set(x, "autoCreateRoutes", value.asInstanceOf[js.Any])
    
    inline def setAutoCreateRoutesUndefined: Self = StObject.set(x, "autoCreateRoutes", js.undefined)
    
    inline def setExchangeSubnetRoutes(value: Boolean): Self = StObject.set(x, "exchangeSubnetRoutes", value.asInstanceOf[js.Any])
    
    inline def setExchangeSubnetRoutesUndefined: Self = StObject.set(x, "exchangeSubnetRoutes", js.undefined)
    
    inline def setExportCustomRoutes(value: Boolean): Self = StObject.set(x, "exportCustomRoutes", value.asInstanceOf[js.Any])
    
    inline def setExportCustomRoutesUndefined: Self = StObject.set(x, "exportCustomRoutes", js.undefined)
    
    inline def setExportSubnetRoutesWithPublicIp(value: Boolean): Self = StObject.set(x, "exportSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    inline def setExportSubnetRoutesWithPublicIpUndefined: Self = StObject.set(x, "exportSubnetRoutesWithPublicIp", js.undefined)
    
    inline def setImportCustomRoutes(value: Boolean): Self = StObject.set(x, "importCustomRoutes", value.asInstanceOf[js.Any])
    
    inline def setImportCustomRoutesUndefined: Self = StObject.set(x, "importCustomRoutes", js.undefined)
    
    inline def setImportSubnetRoutesWithPublicIp(value: Boolean): Self = StObject.set(x, "importSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    inline def setImportSubnetRoutesWithPublicIpUndefined: Self = StObject.set(x, "importSubnetRoutesWithPublicIp", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setPeerMtu(value: Double): Self = StObject.set(x, "peerMtu", value.asInstanceOf[js.Any])
    
    inline def setPeerMtuUndefined: Self = StObject.set(x, "peerMtu", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateDetails(value: String): Self = StObject.set(x, "stateDetails", value.asInstanceOf[js.Any])
    
    inline def setStateDetailsUndefined: Self = StObject.set(x, "stateDetails", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
