package typings.googleapis.composerV1beta1Mod.composerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for controlling how IPs are allocated in the GKE cluster.
  */
trait SchemaIPAllocationPolicy extends StObject {
  
  /**
    * Optional. The IP address range used to allocate IP addresses to pods in
    * the cluster.  This field is applicable only when `use_ip_aliases` is
    * true.  Set to blank to have GKE choose a range with the default size. Set
    * to /netmask (e.g. `/14`) to have GKE choose a range with a specific
    * netmask.  Set to a
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
    * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
    * to use. Specify `cluster_secondary_range_name` or
    * `cluster_ipv4_cidr_block` but not both.
    */
  var clusterIpv4CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The name of the cluster&#39;s secondary range used to allocate
    * IP addresses to pods. Specify either `cluster_secondary_range_name` or
    * `cluster_ipv4_cidr_block` but not both.  This field is applicable only
    * when `use_ip_aliases` is true.
    */
  var clusterSecondaryRangeName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The IP address range of the services IP addresses in this
    * cluster.  This field is applicable only when `use_ip_aliases` is true.
    * Set to blank to have GKE choose a range with the default size.  Set to
    * /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask.
    * Set to a
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
    * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
    * to use. Specify `services_secondary_range_name` or
    * `services_ipv4_cidr_block` but not both.
    */
  var servicesIpv4CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The name of the services&#39; secondary range used to allocate
    * IP addresses to the cluster. Specify either
    * `services_secondary_range_name` or `services_ipv4_cidr_block` but not
    * both.  This field is applicable only when `use_ip_aliases` is true.
    */
  var servicesSecondaryRangeName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Whether or not to enable Alias IPs in the GKE cluster. If
    * `true`, a VPC-native cluster is created.
    */
  var useIpAliases: js.UndefOr[Boolean] = js.undefined
}
object SchemaIPAllocationPolicy {
  
  @scala.inline
  def apply(): SchemaIPAllocationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIPAllocationPolicy]
  }
  
  @scala.inline
  implicit class SchemaIPAllocationPolicyMutableBuilder[Self <: SchemaIPAllocationPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterIpv4CidrBlock(value: String): Self = StObject.set(x, "clusterIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIpv4CidrBlockUndefined: Self = StObject.set(x, "clusterIpv4CidrBlock", js.undefined)
    
    @scala.inline
    def setClusterSecondaryRangeName(value: String): Self = StObject.set(x, "clusterSecondaryRangeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterSecondaryRangeNameUndefined: Self = StObject.set(x, "clusterSecondaryRangeName", js.undefined)
    
    @scala.inline
    def setServicesIpv4CidrBlock(value: String): Self = StObject.set(x, "servicesIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesIpv4CidrBlockUndefined: Self = StObject.set(x, "servicesIpv4CidrBlock", js.undefined)
    
    @scala.inline
    def setServicesSecondaryRangeName(value: String): Self = StObject.set(x, "servicesSecondaryRangeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesSecondaryRangeNameUndefined: Self = StObject.set(x, "servicesSecondaryRangeName", js.undefined)
    
    @scala.inline
    def setUseIpAliases(value: Boolean): Self = StObject.set(x, "useIpAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseIpAliasesUndefined: Self = StObject.set(x, "useIpAliases", js.undefined)
  }
}
