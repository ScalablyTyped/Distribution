package typings.googleapis.composerV1beta1Mod.composerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for controlling how IPs are allocated in the GKE cluster.
  */
@js.native
trait SchemaIPAllocationPolicy extends js.Object {
  
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
  var clusterIpv4CidrBlock: js.UndefOr[String] = js.native
  
  /**
    * Optional. The name of the cluster&#39;s secondary range used to allocate
    * IP addresses to pods. Specify either `cluster_secondary_range_name` or
    * `cluster_ipv4_cidr_block` but not both.  This field is applicable only
    * when `use_ip_aliases` is true.
    */
  var clusterSecondaryRangeName: js.UndefOr[String] = js.native
  
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
  var servicesIpv4CidrBlock: js.UndefOr[String] = js.native
  
  /**
    * Optional. The name of the services&#39; secondary range used to allocate
    * IP addresses to the cluster. Specify either
    * `services_secondary_range_name` or `services_ipv4_cidr_block` but not
    * both.  This field is applicable only when `use_ip_aliases` is true.
    */
  var servicesSecondaryRangeName: js.UndefOr[String] = js.native
  
  /**
    * Optional. Whether or not to enable Alias IPs in the GKE cluster. If
    * `true`, a VPC-native cluster is created.
    */
  var useIpAliases: js.UndefOr[Boolean] = js.native
}
object SchemaIPAllocationPolicy {
  
  @scala.inline
  def apply(): SchemaIPAllocationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIPAllocationPolicy]
  }
  
  @scala.inline
  implicit class SchemaIPAllocationPolicyOps[Self <: SchemaIPAllocationPolicy] (val x: Self) extends AnyVal {
    
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
    def setClusterIpv4CidrBlock(value: String): Self = this.set("clusterIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterIpv4CidrBlock: Self = this.set("clusterIpv4CidrBlock", js.undefined)
    
    @scala.inline
    def setClusterSecondaryRangeName(value: String): Self = this.set("clusterSecondaryRangeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterSecondaryRangeName: Self = this.set("clusterSecondaryRangeName", js.undefined)
    
    @scala.inline
    def setServicesIpv4CidrBlock(value: String): Self = this.set("servicesIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicesIpv4CidrBlock: Self = this.set("servicesIpv4CidrBlock", js.undefined)
    
    @scala.inline
    def setServicesSecondaryRangeName(value: String): Self = this.set("servicesSecondaryRangeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicesSecondaryRangeName: Self = this.set("servicesSecondaryRangeName", js.undefined)
    
    @scala.inline
    def setUseIpAliases(value: Boolean): Self = this.set("useIpAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseIpAliases: Self = this.set("useIpAliases", js.undefined)
  }
}
