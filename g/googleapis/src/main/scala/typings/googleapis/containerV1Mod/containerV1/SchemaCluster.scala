package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Google Kubernetes Engine cluster.
  */
@js.native
trait SchemaCluster extends js.Object {
  /**
    * Configurations for the various addons available to run in the cluster.
    */
  var addonsConfig: js.UndefOr[SchemaAddonsConfig] = js.native
  /**
    * The IP address range of the container pods in this cluster, in
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `10.96.0.0/14`). Leave blank to have one automatically
    * chosen or specify a `/14` block in `10.0.0.0/8`.
    */
  var clusterIpv4Cidr: js.UndefOr[String] = js.native
  /**
    * Which conditions caused the current cluster state.
    */
  var conditions: js.UndefOr[js.Array[SchemaStatusCondition]] = js.native
  /**
    * [Output only] The time the cluster was created, in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * [Output only] The current software version of the master endpoint.
    */
  var currentMasterVersion: js.UndefOr[String] = js.native
  /**
    * [Output only]  The number of nodes currently in the cluster. Deprecated.
    * Call Kubernetes API directly to retrieve node information.
    */
  var currentNodeCount: js.UndefOr[Double] = js.native
  /**
    * [Output only] Deprecated, use
    * [NodePool.version](/kubernetes-engine/docs/reference/rest/v1/projects.zones.clusters.nodePool)
    * instead. The current version of the node software components. If they are
    * currently at multiple versions because they&#39;re in the process of
    * being upgraded, this reflects the minimum version of all nodes.
    */
  var currentNodeVersion: js.UndefOr[String] = js.native
  /**
    * An optional description of this cluster.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Kubernetes alpha features are enabled on this cluster. This includes
    * alpha API groups (e.g. v1alpha1) and features that may not be production
    * ready in the kubernetes version of the master and nodes. The cluster has
    * no SLA for uptime and master/node upgrades are disabled. Alpha enabled
    * clusters are automatically deleted thirty days after creation.
    */
  var enableKubernetesAlpha: js.UndefOr[Boolean] = js.native
  /**
    * Enable the ability to use Cloud TPUs in this cluster.
    */
  var enableTpu: js.UndefOr[Boolean] = js.native
  /**
    * [Output only] The IP address of this cluster&#39;s master endpoint. The
    * endpoint can be accessed from the internet at
    * `https://username:password@endpoint/`.  See the `masterAuth` property of
    * this resource for username and password information.
    */
  var endpoint: js.UndefOr[String] = js.native
  /**
    * [Output only] The time the cluster will be automatically deleted in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var expireTime: js.UndefOr[String] = js.native
  /**
    * The initial Kubernetes version for this cluster.  Valid versions are
    * those found in validMasterVersions returned by getServerConfig.  The
    * version can be upgraded over time; such upgrades are reflected in
    * currentMasterVersion and currentNodeVersion.  Users may specify either
    * explicit versions offered by Kubernetes Engine or version aliases, which
    * have the following behavior:  - &quot;latest&quot;: picks the highest
    * valid Kubernetes version - &quot;1.X&quot;: picks the highest valid
    * patch+gke.N patch in the 1.X version - &quot;1.X.Y&quot;: picks the
    * highest valid gke.N patch in the 1.X.Y version - &quot;1.X.Y-gke.N&quot;:
    * picks an explicit Kubernetes version - &quot;&quot;,&quot;-&quot;: picks
    * the default Kubernetes version
    */
  var initialClusterVersion: js.UndefOr[String] = js.native
  /**
    * The number of nodes to create in this cluster. You must ensure that your
    * Compute Engine &lt;a
    * href=&quot;/compute/docs/resource-quotas&quot;&gt;resource
    * quota&lt;/a&gt; is sufficient for this number of instances. You must also
    * have available firewall and routes quota. For requests, this field should
    * only be used in lieu of a &quot;node_pool&quot; object, since this
    * configuration (along with the &quot;node_config&quot;) will be used to
    * create a &quot;NodePool&quot; object with an auto-generated name. Do not
    * use this and a node_pool at the same time.
    */
  var initialNodeCount: js.UndefOr[Double] = js.native
  /**
    * Deprecated. Use node_pools.instance_group_urls.
    */
  var instanceGroupUrls: js.UndefOr[js.Array[String]] = js.native
  /**
    * Configuration for cluster IP allocation.
    */
  var ipAllocationPolicy: js.UndefOr[SchemaIPAllocationPolicy] = js.native
  /**
    * The fingerprint of the set of labels for this cluster.
    */
  var labelFingerprint: js.UndefOr[String] = js.native
  /**
    * Configuration for the legacy ABAC authorization mode.
    */
  var legacyAbac: js.UndefOr[SchemaLegacyAbac] = js.native
  /**
    * [Output only] The name of the Google Compute Engine
    * [zone](/compute/docs/regions-zones/regions-zones#available) or
    * [region](/compute/docs/regions-zones/regions-zones#available) in which
    * the cluster resides.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The list of Google Compute Engine [zones](/compute/docs/zones#available)
    * in which the cluster&#39;s nodes should be located.
    */
  var locations: js.UndefOr[js.Array[String]] = js.native
  /**
    * The logging service the cluster should use to write logs. Currently
    * available options:  * `logging.googleapis.com` - the Google Cloud Logging
    * service. * `none` - no logs will be exported from the cluster. * if left
    * as an empty string,`logging.googleapis.com` will be used.
    */
  var loggingService: js.UndefOr[String] = js.native
  /**
    * Configure the maintenance policy for this cluster.
    */
  var maintenancePolicy: js.UndefOr[SchemaMaintenancePolicy] = js.native
  /**
    * The authentication information for accessing the master endpoint. If
    * unspecified, the defaults are used: For clusters before v1.12, if
    * master_auth is unspecified, `username` will be set to &quot;admin&quot;,
    * a random password will be generated, and a client certificate will be
    * issued.
    */
  var masterAuth: js.UndefOr[SchemaMasterAuth] = js.native
  /**
    * The configuration options for master authorized networks feature.
    */
  var masterAuthorizedNetworksConfig: js.UndefOr[SchemaMasterAuthorizedNetworksConfig] = js.native
  /**
    * The monitoring service the cluster should use to write metrics. Currently
    * available options:  * `monitoring.googleapis.com` - the Google Cloud
    * Monitoring service. * `none` - no metrics will be exported from the
    * cluster. * if left as an empty string, `monitoring.googleapis.com` will
    * be used.
    */
  var monitoringService: js.UndefOr[String] = js.native
  /**
    * The name of this cluster. The name must be unique within this project and
    * zone, and can be up to 40 characters with the following restrictions:  *
    * Lowercase letters, numbers, and hyphens only. * Must start with a letter.
    * * Must end with a number or a letter.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The name of the Google Compute Engine
    * [network](/compute/docs/networks-and-firewalls#networks) to which the
    * cluster is connected. If left unspecified, the `default` network will be
    * used.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Configuration for cluster networking.
    */
  var networkConfig: js.UndefOr[SchemaNetworkConfig] = js.native
  /**
    * Configuration options for the NetworkPolicy feature.
    */
  var networkPolicy: js.UndefOr[SchemaNetworkPolicy] = js.native
  /**
    * Parameters used in creating the cluster&#39;s nodes. See `nodeConfig` for
    * the description of its properties. For requests, this field should only
    * be used in lieu of a &quot;node_pool&quot; object, since this
    * configuration (along with the &quot;initial_node_count&quot;) will be
    * used to create a &quot;NodePool&quot; object with an auto-generated name.
    * Do not use this and a node_pool at the same time. For responses, this
    * field will be populated with the node configuration of the first node
    * pool.  If unspecified, the defaults are used.
    */
  var nodeConfig: js.UndefOr[SchemaNodeConfig] = js.native
  /**
    * [Output only] The size of the address space on each node for hosting
    * containers. This is provisioned from within the `container_ipv4_cidr`
    * range.
    */
  var nodeIpv4CidrSize: js.UndefOr[Double] = js.native
  /**
    * The node pools associated with this cluster. This field should not be set
    * if &quot;node_config&quot; or &quot;initial_node_count&quot; are
    * specified.
    */
  var nodePools: js.UndefOr[js.Array[SchemaNodePool]] = js.native
  /**
    * Configuration for private cluster.
    */
  var privateClusterConfig: js.UndefOr[SchemaPrivateClusterConfig] = js.native
  /**
    * The resource labels for the cluster to use to annotate any related Google
    * Compute Engine resources.
    */
  var resourceLabels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * [Output only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output only] The IP address range of the Kubernetes services in this
    * cluster, in
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `1.2.3.4/29`). Service addresses are typically put in the
    * last `/16` from the container CIDR.
    */
  var servicesIpv4Cidr: js.UndefOr[String] = js.native
  /**
    * [Output only] The current status of this cluster.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * [Output only] Additional information about the current status of this
    * cluster, if available.
    */
  var statusMessage: js.UndefOr[String] = js.native
  /**
    * The name of the Google Compute Engine
    * [subnetwork](/compute/docs/subnetworks) to which the cluster is
    * connected.
    */
  var subnetwork: js.UndefOr[String] = js.native
  /**
    * [Output only] The IP address range of the Cloud TPUs in this cluster, in
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `1.2.3.4/29`).
    */
  var tpuIpv4CidrBlock: js.UndefOr[String] = js.native
  /**
    * [Output only] The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides. This
    * field is deprecated, use location instead.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaCluster {
  @scala.inline
  def apply(): SchemaCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCluster]
  }
  @scala.inline
  implicit class SchemaClusterOps[Self <: SchemaCluster] (val x: Self) extends AnyVal {
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
    def setAddonsConfig(value: SchemaAddonsConfig): Self = this.set("addonsConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddonsConfig: Self = this.set("addonsConfig", js.undefined)
    @scala.inline
    def setClusterIpv4Cidr(value: String): Self = this.set("clusterIpv4Cidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterIpv4Cidr: Self = this.set("clusterIpv4Cidr", js.undefined)
    @scala.inline
    def setConditionsVarargs(value: SchemaStatusCondition*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[SchemaStatusCondition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setCurrentMasterVersion(value: String): Self = this.set("currentMasterVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentMasterVersion: Self = this.set("currentMasterVersion", js.undefined)
    @scala.inline
    def setCurrentNodeCount(value: Double): Self = this.set("currentNodeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentNodeCount: Self = this.set("currentNodeCount", js.undefined)
    @scala.inline
    def setCurrentNodeVersion(value: String): Self = this.set("currentNodeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentNodeVersion: Self = this.set("currentNodeVersion", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnableKubernetesAlpha(value: Boolean): Self = this.set("enableKubernetesAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableKubernetesAlpha: Self = this.set("enableKubernetesAlpha", js.undefined)
    @scala.inline
    def setEnableTpu(value: Boolean): Self = this.set("enableTpu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTpu: Self = this.set("enableTpu", js.undefined)
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setExpireTime(value: String): Self = this.set("expireTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpireTime: Self = this.set("expireTime", js.undefined)
    @scala.inline
    def setInitialClusterVersion(value: String): Self = this.set("initialClusterVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialClusterVersion: Self = this.set("initialClusterVersion", js.undefined)
    @scala.inline
    def setInitialNodeCount(value: Double): Self = this.set("initialNodeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialNodeCount: Self = this.set("initialNodeCount", js.undefined)
    @scala.inline
    def setInstanceGroupUrlsVarargs(value: String*): Self = this.set("instanceGroupUrls", js.Array(value :_*))
    @scala.inline
    def setInstanceGroupUrls(value: js.Array[String]): Self = this.set("instanceGroupUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceGroupUrls: Self = this.set("instanceGroupUrls", js.undefined)
    @scala.inline
    def setIpAllocationPolicy(value: SchemaIPAllocationPolicy): Self = this.set("ipAllocationPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAllocationPolicy: Self = this.set("ipAllocationPolicy", js.undefined)
    @scala.inline
    def setLabelFingerprint(value: String): Self = this.set("labelFingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFingerprint: Self = this.set("labelFingerprint", js.undefined)
    @scala.inline
    def setLegacyAbac(value: SchemaLegacyAbac): Self = this.set("legacyAbac", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegacyAbac: Self = this.set("legacyAbac", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setLocationsVarargs(value: String*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[String]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    @scala.inline
    def setLoggingService(value: String): Self = this.set("loggingService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingService: Self = this.set("loggingService", js.undefined)
    @scala.inline
    def setMaintenancePolicy(value: SchemaMaintenancePolicy): Self = this.set("maintenancePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintenancePolicy: Self = this.set("maintenancePolicy", js.undefined)
    @scala.inline
    def setMasterAuth(value: SchemaMasterAuth): Self = this.set("masterAuth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterAuth: Self = this.set("masterAuth", js.undefined)
    @scala.inline
    def setMasterAuthorizedNetworksConfig(value: SchemaMasterAuthorizedNetworksConfig): Self = this.set("masterAuthorizedNetworksConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterAuthorizedNetworksConfig: Self = this.set("masterAuthorizedNetworksConfig", js.undefined)
    @scala.inline
    def setMonitoringService(value: String): Self = this.set("monitoringService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoringService: Self = this.set("monitoringService", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    @scala.inline
    def setNetworkConfig(value: SchemaNetworkConfig): Self = this.set("networkConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkConfig: Self = this.set("networkConfig", js.undefined)
    @scala.inline
    def setNetworkPolicy(value: SchemaNetworkPolicy): Self = this.set("networkPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkPolicy: Self = this.set("networkPolicy", js.undefined)
    @scala.inline
    def setNodeConfig(value: SchemaNodeConfig): Self = this.set("nodeConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeConfig: Self = this.set("nodeConfig", js.undefined)
    @scala.inline
    def setNodeIpv4CidrSize(value: Double): Self = this.set("nodeIpv4CidrSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeIpv4CidrSize: Self = this.set("nodeIpv4CidrSize", js.undefined)
    @scala.inline
    def setNodePoolsVarargs(value: SchemaNodePool*): Self = this.set("nodePools", js.Array(value :_*))
    @scala.inline
    def setNodePools(value: js.Array[SchemaNodePool]): Self = this.set("nodePools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodePools: Self = this.set("nodePools", js.undefined)
    @scala.inline
    def setPrivateClusterConfig(value: SchemaPrivateClusterConfig): Self = this.set("privateClusterConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateClusterConfig: Self = this.set("privateClusterConfig", js.undefined)
    @scala.inline
    def setResourceLabels(value: StringDictionary[String]): Self = this.set("resourceLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceLabels: Self = this.set("resourceLabels", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setServicesIpv4Cidr(value: String): Self = this.set("servicesIpv4Cidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServicesIpv4Cidr: Self = this.set("servicesIpv4Cidr", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    @scala.inline
    def setSubnetwork(value: String): Self = this.set("subnetwork", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetwork: Self = this.set("subnetwork", js.undefined)
    @scala.inline
    def setTpuIpv4CidrBlock(value: String): Self = this.set("tpuIpv4CidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTpuIpv4CidrBlock: Self = this.set("tpuIpv4CidrBlock", js.undefined)
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
  
}

