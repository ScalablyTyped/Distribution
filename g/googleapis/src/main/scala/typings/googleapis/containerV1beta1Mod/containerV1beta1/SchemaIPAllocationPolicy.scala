package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for controlling how IPs are allocated in the cluster.
  */
trait SchemaIPAllocationPolicy extends StObject {
  
  /**
    * If true, allow allocation of cluster CIDR ranges that overlap with
    * certain kinds of network routes. By default we do not allow cluster CIDR
    * ranges to intersect with any user declared routes. With
    * allow_route_overlap == true, we allow overlapping with CIDR ranges that
    * are larger than the cluster CIDR range.  If this field is set to true,
    * then cluster and services CIDRs must be fully-specified (e.g.
    * `10.96.0.0/14`, but not `/14`), which means: 1) When `use_ip_aliases` is
    * true, `cluster_ipv4_cidr_block` and    `services_ipv4_cidr_block` must be
    * fully-specified. 2) When `use_ip_aliases` is false,
    * `cluster.cluster_ipv4_cidr` muse be    fully-specified.
    */
  var allowRouteOverlap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This field is deprecated, use cluster_ipv4_cidr_block.
    */
  var clusterIpv4Cidr: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address range for the cluster pod IPs. If this field is set, then
    * `cluster.cluster_ipv4_cidr` must be left blank.  This field is only
    * applicable when `use_ip_aliases` is true.  Set to blank to have a range
    * chosen with the default size.  Set to /netmask (e.g. `/14`) to have a
    * range chosen with a specific netmask.  Set to a
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
    * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
    * to use.
    */
  var clusterIpv4CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the secondary range to be used for the cluster CIDR block.
    * The secondary range will be used for pod IP addresses. This must be an
    * existing secondary range associated with the cluster subnetwork.  This
    * field is only applicable with use_ip_aliases and create_subnetwork is
    * false.
    */
  var clusterSecondaryRangeName: js.UndefOr[String] = js.undefined
  
  /**
    * Whether a new subnetwork will be created automatically for the cluster.
    * This field is only applicable when `use_ip_aliases` is true.
    */
  var createSubnetwork: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This field is deprecated, use node_ipv4_cidr_block.
    */
  var nodeIpv4Cidr: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address range of the instance IPs in this cluster.  This is
    * applicable only if `create_subnetwork` is true.  Set to blank to have a
    * range chosen with the default size.  Set to /netmask (e.g. `/14`) to have
    * a range chosen with a specific netmask.  Set to a
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
    * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
    * to use.
    */
  var nodeIpv4CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * This field is deprecated, use services_ipv4_cidr_block.
    */
  var servicesIpv4Cidr: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address range of the services IPs in this cluster. If blank, a
    * range will be automatically chosen with the default size.  This field is
    * only applicable when `use_ip_aliases` is true.  Set to blank to have a
    * range chosen with the default size.  Set to /netmask (e.g. `/14`) to have
    * a range chosen with a specific netmask.  Set to a
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
    * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
    * to use.
    */
  var servicesIpv4CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the secondary range to be used as for the services CIDR
    * block.  The secondary range will be used for service ClusterIPs. This
    * must be an existing secondary range associated with the cluster
    * subnetwork.  This field is only applicable with use_ip_aliases and
    * create_subnetwork is false.
    */
  var servicesSecondaryRangeName: js.UndefOr[String] = js.undefined
  
  /**
    * A custom subnetwork name to be used if `create_subnetwork` is true.  If
    * this field is empty, then an automatic name will be chosen for the new
    * subnetwork.
    */
  var subnetworkName: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address range of the Cloud TPUs in this cluster. If unspecified, a
    * range will be automatically chosen with the default size.  This field is
    * only applicable when `use_ip_aliases` is true.  If unspecified, the range
    * will use the default size.  Set to /netmask (e.g. `/14`) to have a range
    * chosen with a specific netmask.  Set to a
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
    * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
    * to use.
    */
  var tpuIpv4CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * Whether alias IPs will be used for pod IPs in the cluster.
    */
  var useIpAliases: js.UndefOr[Boolean] = js.undefined
}
object SchemaIPAllocationPolicy {
  
  inline def apply(): SchemaIPAllocationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIPAllocationPolicy]
  }
  
  extension [Self <: SchemaIPAllocationPolicy](x: Self) {
    
    inline def setAllowRouteOverlap(value: Boolean): Self = StObject.set(x, "allowRouteOverlap", value.asInstanceOf[js.Any])
    
    inline def setAllowRouteOverlapUndefined: Self = StObject.set(x, "allowRouteOverlap", js.undefined)
    
    inline def setClusterIpv4Cidr(value: String): Self = StObject.set(x, "clusterIpv4Cidr", value.asInstanceOf[js.Any])
    
    inline def setClusterIpv4CidrBlock(value: String): Self = StObject.set(x, "clusterIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setClusterIpv4CidrBlockUndefined: Self = StObject.set(x, "clusterIpv4CidrBlock", js.undefined)
    
    inline def setClusterIpv4CidrUndefined: Self = StObject.set(x, "clusterIpv4Cidr", js.undefined)
    
    inline def setClusterSecondaryRangeName(value: String): Self = StObject.set(x, "clusterSecondaryRangeName", value.asInstanceOf[js.Any])
    
    inline def setClusterSecondaryRangeNameUndefined: Self = StObject.set(x, "clusterSecondaryRangeName", js.undefined)
    
    inline def setCreateSubnetwork(value: Boolean): Self = StObject.set(x, "createSubnetwork", value.asInstanceOf[js.Any])
    
    inline def setCreateSubnetworkUndefined: Self = StObject.set(x, "createSubnetwork", js.undefined)
    
    inline def setNodeIpv4Cidr(value: String): Self = StObject.set(x, "nodeIpv4Cidr", value.asInstanceOf[js.Any])
    
    inline def setNodeIpv4CidrBlock(value: String): Self = StObject.set(x, "nodeIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setNodeIpv4CidrBlockUndefined: Self = StObject.set(x, "nodeIpv4CidrBlock", js.undefined)
    
    inline def setNodeIpv4CidrUndefined: Self = StObject.set(x, "nodeIpv4Cidr", js.undefined)
    
    inline def setServicesIpv4Cidr(value: String): Self = StObject.set(x, "servicesIpv4Cidr", value.asInstanceOf[js.Any])
    
    inline def setServicesIpv4CidrBlock(value: String): Self = StObject.set(x, "servicesIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setServicesIpv4CidrBlockUndefined: Self = StObject.set(x, "servicesIpv4CidrBlock", js.undefined)
    
    inline def setServicesIpv4CidrUndefined: Self = StObject.set(x, "servicesIpv4Cidr", js.undefined)
    
    inline def setServicesSecondaryRangeName(value: String): Self = StObject.set(x, "servicesSecondaryRangeName", value.asInstanceOf[js.Any])
    
    inline def setServicesSecondaryRangeNameUndefined: Self = StObject.set(x, "servicesSecondaryRangeName", js.undefined)
    
    inline def setSubnetworkName(value: String): Self = StObject.set(x, "subnetworkName", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkNameUndefined: Self = StObject.set(x, "subnetworkName", js.undefined)
    
    inline def setTpuIpv4CidrBlock(value: String): Self = StObject.set(x, "tpuIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setTpuIpv4CidrBlockUndefined: Self = StObject.set(x, "tpuIpv4CidrBlock", js.undefined)
    
    inline def setUseIpAliases(value: Boolean): Self = StObject.set(x, "useIpAliases", value.asInstanceOf[js.Any])
    
    inline def setUseIpAliasesUndefined: Self = StObject.set(x, "useIpAliases", js.undefined)
  }
}
