package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    clusterIpv4Cidr: String = null,
    clusterIpv4CidrBlock: String = null,
    clusterSecondaryRangeName: String = null,
    createSubnetwork: js.UndefOr[Boolean] = js.undefined,
    nodeIpv4Cidr: String = null,
    nodeIpv4CidrBlock: String = null,
    servicesIpv4Cidr: String = null,
    servicesIpv4CidrBlock: String = null,
    servicesSecondaryRangeName: String = null,
    subnetworkName: String = null,
    tpuIpv4CidrBlock: String = null,
    useIpAliases: js.UndefOr[Boolean] = js.undefined
  ): SchemaIPAllocationPolicy = {
    val __obj = js.Dynamic.literal()
    if (clusterIpv4Cidr != null) __obj.updateDynamic("clusterIpv4Cidr")(clusterIpv4Cidr.asInstanceOf[js.Any])
    if (clusterIpv4CidrBlock != null) __obj.updateDynamic("clusterIpv4CidrBlock")(clusterIpv4CidrBlock.asInstanceOf[js.Any])
    if (clusterSecondaryRangeName != null) __obj.updateDynamic("clusterSecondaryRangeName")(clusterSecondaryRangeName.asInstanceOf[js.Any])
    if (!js.isUndefined(createSubnetwork)) __obj.updateDynamic("createSubnetwork")(createSubnetwork.asInstanceOf[js.Any])
    if (nodeIpv4Cidr != null) __obj.updateDynamic("nodeIpv4Cidr")(nodeIpv4Cidr.asInstanceOf[js.Any])
    if (nodeIpv4CidrBlock != null) __obj.updateDynamic("nodeIpv4CidrBlock")(nodeIpv4CidrBlock.asInstanceOf[js.Any])
    if (servicesIpv4Cidr != null) __obj.updateDynamic("servicesIpv4Cidr")(servicesIpv4Cidr.asInstanceOf[js.Any])
    if (servicesIpv4CidrBlock != null) __obj.updateDynamic("servicesIpv4CidrBlock")(servicesIpv4CidrBlock.asInstanceOf[js.Any])
    if (servicesSecondaryRangeName != null) __obj.updateDynamic("servicesSecondaryRangeName")(servicesSecondaryRangeName.asInstanceOf[js.Any])
    if (subnetworkName != null) __obj.updateDynamic("subnetworkName")(subnetworkName.asInstanceOf[js.Any])
    if (tpuIpv4CidrBlock != null) __obj.updateDynamic("tpuIpv4CidrBlock")(tpuIpv4CidrBlock.asInstanceOf[js.Any])
    if (!js.isUndefined(useIpAliases)) __obj.updateDynamic("useIpAliases")(useIpAliases.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIPAllocationPolicy]
  }
}

