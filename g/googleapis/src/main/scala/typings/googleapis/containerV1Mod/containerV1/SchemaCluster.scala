package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Google Kubernetes Engine cluster.
  */
@js.native
trait SchemaCluster extends StObject {
  
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
  implicit class SchemaClusterMutableBuilder[Self <: SchemaCluster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddonsConfig(value: SchemaAddonsConfig): Self = StObject.set(x, "addonsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddonsConfigUndefined: Self = StObject.set(x, "addonsConfig", js.undefined)
    
    @scala.inline
    def setClusterIpv4Cidr(value: String): Self = StObject.set(x, "clusterIpv4Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIpv4CidrUndefined: Self = StObject.set(x, "clusterIpv4Cidr", js.undefined)
    
    @scala.inline
    def setConditions(value: js.Array[SchemaStatusCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: SchemaStatusCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setCurrentMasterVersion(value: String): Self = StObject.set(x, "currentMasterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentMasterVersionUndefined: Self = StObject.set(x, "currentMasterVersion", js.undefined)
    
    @scala.inline
    def setCurrentNodeCount(value: Double): Self = StObject.set(x, "currentNodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentNodeCountUndefined: Self = StObject.set(x, "currentNodeCount", js.undefined)
    
    @scala.inline
    def setCurrentNodeVersion(value: String): Self = StObject.set(x, "currentNodeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentNodeVersionUndefined: Self = StObject.set(x, "currentNodeVersion", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnableKubernetesAlpha(value: Boolean): Self = StObject.set(x, "enableKubernetesAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableKubernetesAlphaUndefined: Self = StObject.set(x, "enableKubernetesAlpha", js.undefined)
    
    @scala.inline
    def setEnableTpu(value: Boolean): Self = StObject.set(x, "enableTpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableTpuUndefined: Self = StObject.set(x, "enableTpu", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    @scala.inline
    def setInitialClusterVersion(value: String): Self = StObject.set(x, "initialClusterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialClusterVersionUndefined: Self = StObject.set(x, "initialClusterVersion", js.undefined)
    
    @scala.inline
    def setInitialNodeCount(value: Double): Self = StObject.set(x, "initialNodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialNodeCountUndefined: Self = StObject.set(x, "initialNodeCount", js.undefined)
    
    @scala.inline
    def setInstanceGroupUrls(value: js.Array[String]): Self = StObject.set(x, "instanceGroupUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceGroupUrlsUndefined: Self = StObject.set(x, "instanceGroupUrls", js.undefined)
    
    @scala.inline
    def setInstanceGroupUrlsVarargs(value: String*): Self = StObject.set(x, "instanceGroupUrls", js.Array(value :_*))
    
    @scala.inline
    def setIpAllocationPolicy(value: SchemaIPAllocationPolicy): Self = StObject.set(x, "ipAllocationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAllocationPolicyUndefined: Self = StObject.set(x, "ipAllocationPolicy", js.undefined)
    
    @scala.inline
    def setLabelFingerprint(value: String): Self = StObject.set(x, "labelFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFingerprintUndefined: Self = StObject.set(x, "labelFingerprint", js.undefined)
    
    @scala.inline
    def setLegacyAbac(value: SchemaLegacyAbac): Self = StObject.set(x, "legacyAbac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegacyAbacUndefined: Self = StObject.set(x, "legacyAbac", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setLocations(value: js.Array[String]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: String*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setLoggingService(value: String): Self = StObject.set(x, "loggingService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingServiceUndefined: Self = StObject.set(x, "loggingService", js.undefined)
    
    @scala.inline
    def setMaintenancePolicy(value: SchemaMaintenancePolicy): Self = StObject.set(x, "maintenancePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenancePolicyUndefined: Self = StObject.set(x, "maintenancePolicy", js.undefined)
    
    @scala.inline
    def setMasterAuth(value: SchemaMasterAuth): Self = StObject.set(x, "masterAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterAuthUndefined: Self = StObject.set(x, "masterAuth", js.undefined)
    
    @scala.inline
    def setMasterAuthorizedNetworksConfig(value: SchemaMasterAuthorizedNetworksConfig): Self = StObject.set(x, "masterAuthorizedNetworksConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterAuthorizedNetworksConfigUndefined: Self = StObject.set(x, "masterAuthorizedNetworksConfig", js.undefined)
    
    @scala.inline
    def setMonitoringService(value: String): Self = StObject.set(x, "monitoringService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringServiceUndefined: Self = StObject.set(x, "monitoringService", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkConfig(value: SchemaNetworkConfig): Self = StObject.set(x, "networkConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkConfigUndefined: Self = StObject.set(x, "networkConfig", js.undefined)
    
    @scala.inline
    def setNetworkPolicy(value: SchemaNetworkPolicy): Self = StObject.set(x, "networkPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkPolicyUndefined: Self = StObject.set(x, "networkPolicy", js.undefined)
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setNodeConfig(value: SchemaNodeConfig): Self = StObject.set(x, "nodeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeConfigUndefined: Self = StObject.set(x, "nodeConfig", js.undefined)
    
    @scala.inline
    def setNodeIpv4CidrSize(value: Double): Self = StObject.set(x, "nodeIpv4CidrSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIpv4CidrSizeUndefined: Self = StObject.set(x, "nodeIpv4CidrSize", js.undefined)
    
    @scala.inline
    def setNodePools(value: js.Array[SchemaNodePool]): Self = StObject.set(x, "nodePools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodePoolsUndefined: Self = StObject.set(x, "nodePools", js.undefined)
    
    @scala.inline
    def setNodePoolsVarargs(value: SchemaNodePool*): Self = StObject.set(x, "nodePools", js.Array(value :_*))
    
    @scala.inline
    def setPrivateClusterConfig(value: SchemaPrivateClusterConfig): Self = StObject.set(x, "privateClusterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateClusterConfigUndefined: Self = StObject.set(x, "privateClusterConfig", js.undefined)
    
    @scala.inline
    def setResourceLabels(value: StringDictionary[String]): Self = StObject.set(x, "resourceLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLabelsUndefined: Self = StObject.set(x, "resourceLabels", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setServicesIpv4Cidr(value: String): Self = StObject.set(x, "servicesIpv4Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesIpv4CidrUndefined: Self = StObject.set(x, "servicesIpv4Cidr", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
    
    @scala.inline
    def setTpuIpv4CidrBlock(value: String): Self = StObject.set(x, "tpuIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTpuIpv4CidrBlockUndefined: Self = StObject.set(x, "tpuIpv4CidrBlock", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
