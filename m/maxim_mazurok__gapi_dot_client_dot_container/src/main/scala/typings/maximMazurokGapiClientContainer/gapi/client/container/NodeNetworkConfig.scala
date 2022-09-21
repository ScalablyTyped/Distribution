package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeNetworkConfig extends StObject {
  
  /**
    * Input only. Whether to create a new range for pod IPs in this node pool. Defaults are provided for `pod_range` and `pod_ipv4_cidr_block` if they are not specified. If neither
    * `create_pod_range` or `pod_range` are specified, the cluster-level default (`ip_allocation_policy.cluster_ipv4_cidr_block`) is used. Only applicable if
    * `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
    */
  var createPodRange: js.UndefOr[Boolean] = js.undefined
  
  /** Network bandwidth tier configuration. */
  var networkPerformanceConfig: js.UndefOr[NetworkPerformanceConfig] = js.undefined
  
  /**
    * The IP address range for pod IPs in this node pool. Only applicable if `create_pod_range` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g.
    * `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) to pick a
    * specific range to use. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
    */
  var podIpv4CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the secondary range for pod IPs. If `create_pod_range` is true, this ID is used for the new range. If `create_pod_range` is false, uses an existing secondary range with
    * this ID. Only applicable if `ip_allocation_policy.use_ip_aliases` is true. This field cannot be changed after the node pool has been created.
    */
  var podRange: js.UndefOr[String] = js.undefined
}
object NodeNetworkConfig {
  
  inline def apply(): NodeNetworkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeNetworkConfig]
  }
  
  extension [Self <: NodeNetworkConfig](x: Self) {
    
    inline def setCreatePodRange(value: Boolean): Self = StObject.set(x, "createPodRange", value.asInstanceOf[js.Any])
    
    inline def setCreatePodRangeUndefined: Self = StObject.set(x, "createPodRange", js.undefined)
    
    inline def setNetworkPerformanceConfig(value: NetworkPerformanceConfig): Self = StObject.set(x, "networkPerformanceConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkPerformanceConfigUndefined: Self = StObject.set(x, "networkPerformanceConfig", js.undefined)
    
    inline def setPodIpv4CidrBlock(value: String): Self = StObject.set(x, "podIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setPodIpv4CidrBlockUndefined: Self = StObject.set(x, "podIpv4CidrBlock", js.undefined)
    
    inline def setPodRange(value: String): Self = StObject.set(x, "podRange", value.asInstanceOf[js.Any])
    
    inline def setPodRangeUndefined: Self = StObject.set(x, "podRange", js.undefined)
  }
}
