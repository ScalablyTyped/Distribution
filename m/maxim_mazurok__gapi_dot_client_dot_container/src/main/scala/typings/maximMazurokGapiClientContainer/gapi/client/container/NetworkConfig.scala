package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkConfig extends StObject {
  
  /** The desired datapath provider for this cluster. By default, uses the IPTables-based kube-proxy implementation. */
  var datapathProvider: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the cluster disables default in-node sNAT rules. In-node sNAT rules will be disabled when default_snat_status is disabled. When disabled is set to false, default IP
    * masquerade rules will be applied to the nodes to prevent sNAT on cluster internal traffic.
    */
  var defaultSnatStatus: js.UndefOr[DefaultSnatStatus] = js.undefined
  
  /** DNSConfig contains clusterDNS config for this cluster. */
  var dnsConfig: js.UndefOr[DNSConfig] = js.undefined
  
  /** Whether Intra-node visibility is enabled for this cluster. This makes same node pod to pod traffic visible for VPC network. */
  var enableIntraNodeVisibility: js.UndefOr[Boolean] = js.undefined
  
  /** Whether L4ILB Subsetting is enabled for this cluster. */
  var enableL4ilbSubsetting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output only. The relative name of the Google Compute Engine network(https://cloud.google.com/compute/docs/networks-and-firewalls#networks) to which the cluster is connected.
    * Example: projects/my-project/global/networks/my-network
    */
  var network: js.UndefOr[String] = js.undefined
  
  /** The desired state of IPv6 connectivity to Google Services. By default, no private IPv6 access to or from Google Services (all access will be via IPv4) */
  var privateIpv6GoogleAccess: js.UndefOr[String] = js.undefined
  
  /** ServiceExternalIPsConfig specifies if services with externalIPs field are blocked or not. */
  var serviceExternalIpsConfig: js.UndefOr[ServiceExternalIPsConfig] = js.undefined
  
  /**
    * Output only. The relative name of the Google Compute Engine [subnetwork](https://cloud.google.com/compute/docs/vpc) to which the cluster is connected. Example:
    * projects/my-project/regions/us-central1/subnetworks/my-subnet
    */
  var subnetwork: js.UndefOr[String] = js.undefined
}
object NetworkConfig {
  
  inline def apply(): NetworkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfig]
  }
  
  extension [Self <: NetworkConfig](x: Self) {
    
    inline def setDatapathProvider(value: String): Self = StObject.set(x, "datapathProvider", value.asInstanceOf[js.Any])
    
    inline def setDatapathProviderUndefined: Self = StObject.set(x, "datapathProvider", js.undefined)
    
    inline def setDefaultSnatStatus(value: DefaultSnatStatus): Self = StObject.set(x, "defaultSnatStatus", value.asInstanceOf[js.Any])
    
    inline def setDefaultSnatStatusUndefined: Self = StObject.set(x, "defaultSnatStatus", js.undefined)
    
    inline def setDnsConfig(value: DNSConfig): Self = StObject.set(x, "dnsConfig", value.asInstanceOf[js.Any])
    
    inline def setDnsConfigUndefined: Self = StObject.set(x, "dnsConfig", js.undefined)
    
    inline def setEnableIntraNodeVisibility(value: Boolean): Self = StObject.set(x, "enableIntraNodeVisibility", value.asInstanceOf[js.Any])
    
    inline def setEnableIntraNodeVisibilityUndefined: Self = StObject.set(x, "enableIntraNodeVisibility", js.undefined)
    
    inline def setEnableL4ilbSubsetting(value: Boolean): Self = StObject.set(x, "enableL4ilbSubsetting", value.asInstanceOf[js.Any])
    
    inline def setEnableL4ilbSubsettingUndefined: Self = StObject.set(x, "enableL4ilbSubsetting", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setPrivateIpv6GoogleAccess(value: String): Self = StObject.set(x, "privateIpv6GoogleAccess", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpv6GoogleAccessUndefined: Self = StObject.set(x, "privateIpv6GoogleAccess", js.undefined)
    
    inline def setServiceExternalIpsConfig(value: ServiceExternalIPsConfig): Self = StObject.set(x, "serviceExternalIpsConfig", value.asInstanceOf[js.Any])
    
    inline def setServiceExternalIpsConfigUndefined: Self = StObject.set(x, "serviceExternalIpsConfig", js.undefined)
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
  }
}
