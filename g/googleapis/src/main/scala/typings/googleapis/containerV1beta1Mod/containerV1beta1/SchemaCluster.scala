package typings.googleapis.containerV1beta1Mod.containerV1beta1

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
    * Configuration controlling RBAC group membership information.
    */
  var authenticatorGroupsConfig: js.UndefOr[SchemaAuthenticatorGroupsConfig] = js.native
  /**
    * Cluster-level autoscaling configuration.
    */
  var autoscaling: js.UndefOr[SchemaClusterAutoscaling] = js.native
  /**
    * Configuration for Binary Authorization.
    */
  var binaryAuthorization: js.UndefOr[SchemaBinaryAuthorization] = js.native
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
    * [NodePool.version](/kubernetes-engine/docs/reference/rest/v1beta1/projects.zones.clusters.nodePool)
    * instead. The current version of the node software components. If they are
    * currently at multiple versions because they&#39;re in the process of
    * being upgraded, this reflects the minimum version of all nodes.
    */
  var currentNodeVersion: js.UndefOr[String] = js.native
  /**
    * Configuration of etcd encryption.
    */
  var databaseEncryption: js.UndefOr[SchemaDatabaseEncryption] = js.native
  /**
    * The default constraint on the maximum number of pods that can be run
    * simultaneously on a node in the node pool of this cluster. Only honored
    * if cluster created with IP Alias support.
    */
  var defaultMaxPodsConstraint: js.UndefOr[SchemaMaxPodsConstraint] = js.native
  /**
    * An optional description of this cluster.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Kubernetes alpha features are enabled on this cluster. This includes
    * alpha API groups (e.g. v1beta1) and features that may not be production
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
    * The IP prefix in CIDR notation to use for the hosted master network. This
    * prefix will be used for assigning private IP addresses to the master or
    * set of masters, as well as the ILB VIP. This field is deprecated, use
    * private_cluster_config.master_ipv4_cidr_block instead.
    */
  var masterIpv4CidrBlock: js.UndefOr[String] = js.native
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
    * used. On output this shows the network ID instead of the name.
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
    * Configuration for the PodSecurityPolicy feature.
    */
  var podSecurityPolicyConfig: js.UndefOr[SchemaPodSecurityPolicyConfig] = js.native
  /**
    * If this is a private cluster setup. Private clusters are clusters that,
    * by default have no external IP addresses on the nodes and where nodes and
    * the master communicate over private IP addresses. This field is
    * deprecated, use private_cluster_config.enable_private_nodes instead.
    */
  var privateCluster: js.UndefOr[Boolean] = js.native
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
    * Configuration for exporting resource usages. Resource usage export is
    * disabled when this config unspecified.
    */
  var resourceUsageExportConfig: js.UndefOr[SchemaResourceUsageExportConfig] = js.native
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
    * connected. On output this shows the subnetwork ID instead of the name.
    */
  var subnetwork: js.UndefOr[String] = js.native
  /**
    * [Output only] The IP address range of the Cloud TPUs in this cluster, in
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `1.2.3.4/29`).
    */
  var tpuIpv4CidrBlock: js.UndefOr[String] = js.native
  /**
    * Cluster-level Vertical Pod Autoscaling configuration.
    */
  var verticalPodAutoscaling: js.UndefOr[SchemaVerticalPodAutoscaling] = js.native
  /**
    * [Output only] The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides. This
    * field is deprecated, use location instead.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaCluster {
  @scala.inline
  def apply(
    addonsConfig: SchemaAddonsConfig = null,
    authenticatorGroupsConfig: SchemaAuthenticatorGroupsConfig = null,
    autoscaling: SchemaClusterAutoscaling = null,
    binaryAuthorization: SchemaBinaryAuthorization = null,
    clusterIpv4Cidr: String = null,
    conditions: js.Array[SchemaStatusCondition] = null,
    createTime: String = null,
    currentMasterVersion: String = null,
    currentNodeCount: Int | Double = null,
    currentNodeVersion: String = null,
    databaseEncryption: SchemaDatabaseEncryption = null,
    defaultMaxPodsConstraint: SchemaMaxPodsConstraint = null,
    description: String = null,
    enableKubernetesAlpha: js.UndefOr[Boolean] = js.undefined,
    enableTpu: js.UndefOr[Boolean] = js.undefined,
    endpoint: String = null,
    expireTime: String = null,
    initialClusterVersion: String = null,
    initialNodeCount: Int | Double = null,
    instanceGroupUrls: js.Array[String] = null,
    ipAllocationPolicy: SchemaIPAllocationPolicy = null,
    labelFingerprint: String = null,
    legacyAbac: SchemaLegacyAbac = null,
    location: String = null,
    locations: js.Array[String] = null,
    loggingService: String = null,
    maintenancePolicy: SchemaMaintenancePolicy = null,
    masterAuth: SchemaMasterAuth = null,
    masterAuthorizedNetworksConfig: SchemaMasterAuthorizedNetworksConfig = null,
    masterIpv4CidrBlock: String = null,
    monitoringService: String = null,
    name: String = null,
    network: String = null,
    networkConfig: SchemaNetworkConfig = null,
    networkPolicy: SchemaNetworkPolicy = null,
    nodeConfig: SchemaNodeConfig = null,
    nodeIpv4CidrSize: Int | Double = null,
    nodePools: js.Array[SchemaNodePool] = null,
    podSecurityPolicyConfig: SchemaPodSecurityPolicyConfig = null,
    privateCluster: js.UndefOr[Boolean] = js.undefined,
    privateClusterConfig: SchemaPrivateClusterConfig = null,
    resourceLabels: StringDictionary[String] = null,
    resourceUsageExportConfig: SchemaResourceUsageExportConfig = null,
    selfLink: String = null,
    servicesIpv4Cidr: String = null,
    status: String = null,
    statusMessage: String = null,
    subnetwork: String = null,
    tpuIpv4CidrBlock: String = null,
    verticalPodAutoscaling: SchemaVerticalPodAutoscaling = null,
    zone: String = null
  ): SchemaCluster = {
    val __obj = js.Dynamic.literal()
    if (addonsConfig != null) __obj.updateDynamic("addonsConfig")(addonsConfig.asInstanceOf[js.Any])
    if (authenticatorGroupsConfig != null) __obj.updateDynamic("authenticatorGroupsConfig")(authenticatorGroupsConfig.asInstanceOf[js.Any])
    if (autoscaling != null) __obj.updateDynamic("autoscaling")(autoscaling.asInstanceOf[js.Any])
    if (binaryAuthorization != null) __obj.updateDynamic("binaryAuthorization")(binaryAuthorization.asInstanceOf[js.Any])
    if (clusterIpv4Cidr != null) __obj.updateDynamic("clusterIpv4Cidr")(clusterIpv4Cidr.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (currentMasterVersion != null) __obj.updateDynamic("currentMasterVersion")(currentMasterVersion.asInstanceOf[js.Any])
    if (currentNodeCount != null) __obj.updateDynamic("currentNodeCount")(currentNodeCount.asInstanceOf[js.Any])
    if (currentNodeVersion != null) __obj.updateDynamic("currentNodeVersion")(currentNodeVersion.asInstanceOf[js.Any])
    if (databaseEncryption != null) __obj.updateDynamic("databaseEncryption")(databaseEncryption.asInstanceOf[js.Any])
    if (defaultMaxPodsConstraint != null) __obj.updateDynamic("defaultMaxPodsConstraint")(defaultMaxPodsConstraint.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enableKubernetesAlpha)) __obj.updateDynamic("enableKubernetesAlpha")(enableKubernetesAlpha.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTpu)) __obj.updateDynamic("enableTpu")(enableTpu.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (expireTime != null) __obj.updateDynamic("expireTime")(expireTime.asInstanceOf[js.Any])
    if (initialClusterVersion != null) __obj.updateDynamic("initialClusterVersion")(initialClusterVersion.asInstanceOf[js.Any])
    if (initialNodeCount != null) __obj.updateDynamic("initialNodeCount")(initialNodeCount.asInstanceOf[js.Any])
    if (instanceGroupUrls != null) __obj.updateDynamic("instanceGroupUrls")(instanceGroupUrls.asInstanceOf[js.Any])
    if (ipAllocationPolicy != null) __obj.updateDynamic("ipAllocationPolicy")(ipAllocationPolicy.asInstanceOf[js.Any])
    if (labelFingerprint != null) __obj.updateDynamic("labelFingerprint")(labelFingerprint.asInstanceOf[js.Any])
    if (legacyAbac != null) __obj.updateDynamic("legacyAbac")(legacyAbac.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (loggingService != null) __obj.updateDynamic("loggingService")(loggingService.asInstanceOf[js.Any])
    if (maintenancePolicy != null) __obj.updateDynamic("maintenancePolicy")(maintenancePolicy.asInstanceOf[js.Any])
    if (masterAuth != null) __obj.updateDynamic("masterAuth")(masterAuth.asInstanceOf[js.Any])
    if (masterAuthorizedNetworksConfig != null) __obj.updateDynamic("masterAuthorizedNetworksConfig")(masterAuthorizedNetworksConfig.asInstanceOf[js.Any])
    if (masterIpv4CidrBlock != null) __obj.updateDynamic("masterIpv4CidrBlock")(masterIpv4CidrBlock.asInstanceOf[js.Any])
    if (monitoringService != null) __obj.updateDynamic("monitoringService")(monitoringService.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (networkConfig != null) __obj.updateDynamic("networkConfig")(networkConfig.asInstanceOf[js.Any])
    if (networkPolicy != null) __obj.updateDynamic("networkPolicy")(networkPolicy.asInstanceOf[js.Any])
    if (nodeConfig != null) __obj.updateDynamic("nodeConfig")(nodeConfig.asInstanceOf[js.Any])
    if (nodeIpv4CidrSize != null) __obj.updateDynamic("nodeIpv4CidrSize")(nodeIpv4CidrSize.asInstanceOf[js.Any])
    if (nodePools != null) __obj.updateDynamic("nodePools")(nodePools.asInstanceOf[js.Any])
    if (podSecurityPolicyConfig != null) __obj.updateDynamic("podSecurityPolicyConfig")(podSecurityPolicyConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(privateCluster)) __obj.updateDynamic("privateCluster")(privateCluster.asInstanceOf[js.Any])
    if (privateClusterConfig != null) __obj.updateDynamic("privateClusterConfig")(privateClusterConfig.asInstanceOf[js.Any])
    if (resourceLabels != null) __obj.updateDynamic("resourceLabels")(resourceLabels.asInstanceOf[js.Any])
    if (resourceUsageExportConfig != null) __obj.updateDynamic("resourceUsageExportConfig")(resourceUsageExportConfig.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (servicesIpv4Cidr != null) __obj.updateDynamic("servicesIpv4Cidr")(servicesIpv4Cidr.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    if (subnetwork != null) __obj.updateDynamic("subnetwork")(subnetwork.asInstanceOf[js.Any])
    if (tpuIpv4CidrBlock != null) __obj.updateDynamic("tpuIpv4CidrBlock")(tpuIpv4CidrBlock.asInstanceOf[js.Any])
    if (verticalPodAutoscaling != null) __obj.updateDynamic("verticalPodAutoscaling")(verticalPodAutoscaling.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCluster]
  }
}

