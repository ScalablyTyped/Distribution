package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for controlling how IPs are allocated in the cluster.
  */
@js.native
trait SchemaIPAllocationPolicy extends js.Object {
  
  /**
    * This field is deprecated, use cluster_ipv4_cidr_block.
    */
  var clusterIpv4Cidr: js.UndefOr[String] = js.native
  
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
  var clusterIpv4CidrBlock: js.UndefOr[String] = js.native
  
  /**
    * The name of the secondary range to be used for the cluster CIDR block.
    * The secondary range will be used for pod IP addresses. This must be an
    * existing secondary range associated with the cluster subnetwork.  This
    * field is only applicable with use_ip_aliases is true and
    * create_subnetwork is false.
    */
  var clusterSecondaryRangeName: js.UndefOr[String] = js.native
  
  /**
    * Whether a new subnetwork will be created automatically for the cluster.
    * This field is only applicable when `use_ip_aliases` is true.
    */
  var createSubnetwork: js.UndefOr[Boolean] = js.native
  
  /**
    * This field is deprecated, use node_ipv4_cidr_block.
    */
  var nodeIpv4Cidr: js.UndefOr[String] = js.native
  
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
  var nodeIpv4CidrBlock: js.UndefOr[String] = js.native
  
  /**
    * This field is deprecated, use services_ipv4_cidr_block.
    */
  var servicesIpv4Cidr: js.UndefOr[String] = js.native
  
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
  var servicesIpv4CidrBlock: js.UndefOr[String] = js.native
  
  /**
    * The name of the secondary range to be used as for the services CIDR
    * block.  The secondary range will be used for service ClusterIPs. This
    * must be an existing secondary range associated with the cluster
    * subnetwork.  This field is only applicable with use_ip_aliases is true
    * and create_subnetwork is false.
    */
  var servicesSecondaryRangeName: js.UndefOr[String] = js.native
  
  /**
    * A custom subnetwork name to be used if `create_subnetwork` is true.  If
    * this field is empty, then an automatic name will be chosen for the new
    * subnetwork.
    */
  var subnetworkName: js.UndefOr[String] = js.native
  
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
  var tpuIpv4CidrBlock: js.UndefOr[String] = js.native
  
  /**
    * Whether alias IPs will be used for pod IPs in the cluster.
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
    def setClusterIpv4Cidr(value: String): Self = this.set("clusterIpv4Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterIpv4Cidr: Self = this.set("clusterIpv4Cidr", js.undefined)
    
    @scala.inline
    def setClusterIpv4CidrBlock(value: String): Self = this.set("clusterIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterIpv4CidrBlock: Self = this.set("clusterIpv4CidrBlock", js.undefined)
    
    @scala.inline
    def setClusterSecondaryRangeName(value: String): Self = this.set("clusterSecondaryRangeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterSecondaryRangeName: Self = this.set("clusterSecondaryRangeName", js.undefined)
    
    @scala.inline
    def setCreateSubnetwork(value: Boolean): Self = this.set("createSubnetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateSubnetwork: Self = this.set("createSubnetwork", js.undefined)
    
    @scala.inline
    def setNodeIpv4Cidr(value: String): Self = this.set("nodeIpv4Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeIpv4Cidr: Self = this.set("nodeIpv4Cidr", js.undefined)
    
    @scala.inline
    def setNodeIpv4CidrBlock(value: String): Self = this.set("nodeIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeIpv4CidrBlock: Self = this.set("nodeIpv4CidrBlock", js.undefined)
    
    @scala.inline
    def setServicesIpv4Cidr(value: String): Self = this.set("servicesIpv4Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicesIpv4Cidr: Self = this.set("servicesIpv4Cidr", js.undefined)
    
    @scala.inline
    def setServicesIpv4CidrBlock(value: String): Self = this.set("servicesIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicesIpv4CidrBlock: Self = this.set("servicesIpv4CidrBlock", js.undefined)
    
    @scala.inline
    def setServicesSecondaryRangeName(value: String): Self = this.set("servicesSecondaryRangeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicesSecondaryRangeName: Self = this.set("servicesSecondaryRangeName", js.undefined)
    
    @scala.inline
    def setSubnetworkName(value: String): Self = this.set("subnetworkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetworkName: Self = this.set("subnetworkName", js.undefined)
    
    @scala.inline
    def setTpuIpv4CidrBlock(value: String): Self = this.set("tpuIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTpuIpv4CidrBlock: Self = this.set("tpuIpv4CidrBlock", js.undefined)
    
    @scala.inline
    def setUseIpAliases(value: Boolean): Self = this.set("useIpAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseIpAliases: Self = this.set("useIpAliases", js.undefined)
  }
}
