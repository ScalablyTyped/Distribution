package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCluster extends StObject {
  
  /**
    * Configurations for the various addons available to run in the cluster.
    */
  var addonsConfig: js.UndefOr[SchemaAddonsConfig] = js.undefined
  
  /**
    * Configuration controlling RBAC group membership information.
    */
  var authenticatorGroupsConfig: js.UndefOr[SchemaAuthenticatorGroupsConfig] = js.undefined
  
  /**
    * Autopilot configuration for the cluster.
    */
  var autopilot: js.UndefOr[SchemaAutopilot] = js.undefined
  
  /**
    * Cluster-level autoscaling configuration.
    */
  var autoscaling: js.UndefOr[SchemaClusterAutoscaling] = js.undefined
  
  /**
    * Configuration for Binary Authorization.
    */
  var binaryAuthorization: js.UndefOr[SchemaBinaryAuthorization] = js.undefined
  
  /**
    * The IP address range of the container pods in this cluster, in [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`). Leave blank to have one automatically chosen or specify a `/14` block in `10.0.0.0/8`.
    */
  var clusterIpv4Cidr: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Telemetry integration for the cluster.
    */
  var clusterTelemetry: js.UndefOr[SchemaClusterTelemetry] = js.undefined
  
  /**
    * Which conditions caused the current cluster state.
    */
  var conditions: js.UndefOr[js.Array[SchemaStatusCondition]] = js.undefined
  
  /**
    * Configuration of Confidential Nodes. All the nodes in the cluster will be Confidential VM once enabled.
    */
  var confidentialNodes: js.UndefOr[SchemaConfidentialNodes] = js.undefined
  
  /**
    * Configuration for the fine-grained cost management feature.
    */
  var costManagementConfig: js.UndefOr[SchemaCostManagementConfig] = js.undefined
  
  /**
    * [Output only] The time the cluster was created, in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output only] The current software version of the master endpoint.
    */
  var currentMasterVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output only] The number of nodes currently in the cluster. Deprecated. Call Kubernetes API directly to retrieve node information.
    */
  var currentNodeCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output only] Deprecated, use [NodePool.version](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1beta1/projects.locations.clusters.nodePools) instead. The current version of the node software components. If they are currently at multiple versions because they're in the process of being upgraded, this reflects the minimum version of all nodes.
    */
  var currentNodeVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration of etcd encryption.
    */
  var databaseEncryption: js.UndefOr[SchemaDatabaseEncryption] = js.undefined
  
  /**
    * The default constraint on the maximum number of pods that can be run simultaneously on a node in the node pool of this cluster. Only honored if cluster created with IP Alias support.
    */
  var defaultMaxPodsConstraint: js.UndefOr[SchemaMaxPodsConstraint] = js.undefined
  
  /**
    * An optional description of this cluster.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kubernetes alpha features are enabled on this cluster. This includes alpha API groups (e.g. v1beta1) and features that may not be production ready in the kubernetes version of the master and nodes. The cluster has no SLA for uptime and master/node upgrades are disabled. Alpha enabled clusters are automatically deleted thirty days after creation.
    */
  var enableKubernetesAlpha: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Enable the ability to use Cloud TPUs in this cluster. This field is deprecated, use tpu_config.enabled instead.
    */
  var enableTpu: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Output only] The IP address of this cluster's master endpoint. The endpoint can be accessed from the internet at `https://username:password@endpoint/`. See the `masterAuth` property of this resource for username and password information.
    */
  var endpoint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output only] The time the cluster will be automatically deleted in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Unique id for the cluster.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration for Identity Service component.
    */
  var identityServiceConfig: js.UndefOr[SchemaIdentityServiceConfig] = js.undefined
  
  /**
    * The initial Kubernetes version for this cluster. Valid versions are those found in validMasterVersions returned by getServerConfig. The version can be upgraded over time; such upgrades are reflected in currentMasterVersion and currentNodeVersion. Users may specify either explicit versions offered by Kubernetes Engine or version aliases, which have the following behavior: - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N patch in the 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "","-": picks the default Kubernetes version
    */
  var initialClusterVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of nodes to create in this cluster. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of instances. You must also have available firewall and routes quota. For requests, this field should only be used in lieu of a "node_pool" object, since this configuration (along with the "node_config") will be used to create a "NodePool" object with an auto-generated name. Do not use this and a node_pool at the same time. This field is deprecated, use node_pool.initial_node_count instead.
    */
  var initialNodeCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Deprecated. Use node_pools.instance_group_urls.
    */
  var instanceGroupUrls: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Configuration for cluster IP allocation.
    */
  var ipAllocationPolicy: js.UndefOr[SchemaIPAllocationPolicy] = js.undefined
  
  /**
    * The fingerprint of the set of labels for this cluster.
    */
  var labelFingerprint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration for the legacy ABAC authorization mode.
    */
  var legacyAbac: js.UndefOr[SchemaLegacyAbac] = js.undefined
  
  /**
    * [Output only] The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones#available) or [region](https://cloud.google.com/compute/docs/regions-zones/regions-zones#available) in which the cluster resides.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the cluster's nodes should be located. This field provides a default value if [NodePool.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters.nodePools#NodePool.FIELDS.locations) are not specified during node pool creation. Warning: changing cluster locations will update the [NodePool.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters.nodePools#NodePool.FIELDS.locations) of all node pools and will result in nodes being added and/or removed.
    */
  var locations: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Logging configuration for the cluster.
    */
  var loggingConfig: js.UndefOr[SchemaLoggingConfig] = js.undefined
  
  /**
    * The logging service the cluster should use to write logs. Currently available options: * `logging.googleapis.com/kubernetes` - The Cloud Logging service with a Kubernetes-native resource model * `logging.googleapis.com` - The legacy Cloud Logging service (no longer available as of GKE 1.15). * `none` - no logs will be exported from the cluster. If left as an empty string,`logging.googleapis.com/kubernetes` will be used for GKE 1.14+ or `logging.googleapis.com` for earlier versions.
    */
  var loggingService: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configure the maintenance policy for this cluster.
    */
  var maintenancePolicy: js.UndefOr[SchemaMaintenancePolicy] = js.undefined
  
  /**
    * Configuration for master components.
    */
  var master: js.UndefOr[SchemaMaster] = js.undefined
  
  /**
    * The authentication information for accessing the master endpoint. If unspecified, the defaults are used: For clusters before v1.12, if master_auth is unspecified, `username` will be set to "admin", a random password will be generated, and a client certificate will be issued.
    */
  var masterAuth: js.UndefOr[SchemaMasterAuth] = js.undefined
  
  /**
    * The configuration options for master authorized networks feature.
    */
  var masterAuthorizedNetworksConfig: js.UndefOr[SchemaMasterAuthorizedNetworksConfig] = js.undefined
  
  /**
    * The IP prefix in CIDR notation to use for the hosted master network. This prefix will be used for assigning private IP addresses to the master or set of masters, as well as the ILB VIP. This field is deprecated, use private_cluster_config.master_ipv4_cidr_block instead.
    */
  var masterIpv4CidrBlock: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration for issuance of mTLS keys and certificates to Kubernetes pods.
    */
  var meshCertificates: js.UndefOr[SchemaMeshCertificates] = js.undefined
  
  /**
    * Monitoring configuration for the cluster.
    */
  var monitoringConfig: js.UndefOr[SchemaMonitoringConfig] = js.undefined
  
  /**
    * The monitoring service the cluster should use to write metrics. Currently available options: * "monitoring.googleapis.com/kubernetes" - The Cloud Monitoring service with a Kubernetes-native resource model * `monitoring.googleapis.com` - The legacy Cloud Monitoring service (no longer available as of GKE 1.15). * `none` - No metrics will be exported from the cluster. If left as an empty string,`monitoring.googleapis.com/kubernetes` will be used for GKE 1.14+ or `monitoring.googleapis.com` for earlier versions.
    */
  var monitoringService: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of this cluster. The name must be unique within this project and location (e.g. zone or region), and can be up to 40 characters with the following restrictions: * Lowercase letters, numbers, and hyphens only. * Must start with a letter. * Must end with a number or a letter.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the Google Compute Engine [network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks) to which the cluster is connected. If left unspecified, the `default` network will be used. On output this shows the network ID instead of the name.
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration for cluster networking.
    */
  var networkConfig: js.UndefOr[SchemaNetworkConfig] = js.undefined
  
  /**
    * Configuration options for the NetworkPolicy feature.
    */
  var networkPolicy: js.UndefOr[SchemaNetworkPolicy] = js.undefined
  
  /**
    * Parameters used in creating the cluster's nodes. For requests, this field should only be used in lieu of a "node_pool" object, since this configuration (along with the "initial_node_count") will be used to create a "NodePool" object with an auto-generated name. Do not use this and a node_pool at the same time. For responses, this field will be populated with the node configuration of the first node pool. (For configuration of each node pool, see `node_pool.config`) If unspecified, the defaults are used. This field is deprecated, use node_pool.config instead.
    */
  var nodeConfig: js.UndefOr[SchemaNodeConfig] = js.undefined
  
  /**
    * [Output only] The size of the address space on each node for hosting containers. This is provisioned from within the `container_ipv4_cidr` range. This field will only be set when cluster is in route-based network mode.
    */
  var nodeIpv4CidrSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Node pool configs that apply to all auto-provisioned node pools in autopilot clusters and node auto-provisioning enabled clusters.
    */
  var nodePoolAutoConfig: js.UndefOr[SchemaNodePoolAutoConfig] = js.undefined
  
  /**
    * Default NodePool settings for the entire cluster. These settings are overridden if specified on the specific NodePool object.
    */
  var nodePoolDefaults: js.UndefOr[SchemaNodePoolDefaults] = js.undefined
  
  /**
    * The node pools associated with this cluster. This field should not be set if "node_config" or "initial_node_count" are specified.
    */
  var nodePools: js.UndefOr[js.Array[SchemaNodePool]] = js.undefined
  
  /**
    * Notification configuration of the cluster.
    */
  var notificationConfig: js.UndefOr[SchemaNotificationConfig] = js.undefined
  
  /**
    * Configuration for the PodSecurityPolicy feature.
    */
  var podSecurityPolicyConfig: js.UndefOr[SchemaPodSecurityPolicyConfig] = js.undefined
  
  /**
    * If this is a private cluster setup. Private clusters are clusters that, by default have no external IP addresses on the nodes and where nodes and the master communicate over private IP addresses. This field is deprecated, use private_cluster_config.enable_private_nodes instead.
    */
  var privateCluster: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Configuration for private cluster.
    */
  var privateClusterConfig: js.UndefOr[SchemaPrivateClusterConfig] = js.undefined
  
  /**
    * Enable/Disable Protect API features for the cluster.
    */
  var protectConfig: js.UndefOr[SchemaProtectConfig] = js.undefined
  
  /**
    * Release channel configuration.
    */
  var releaseChannel: js.UndefOr[SchemaReleaseChannel] = js.undefined
  
  /**
    * The resource labels for the cluster to use to annotate any related Google Compute Engine resources.
    */
  var resourceLabels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Configuration for exporting resource usages. Resource usage export is disabled when this config unspecified.
    */
  var resourceUsageExportConfig: js.UndefOr[SchemaResourceUsageExportConfig] = js.undefined
  
  /**
    * [Output only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output only] The IP address range of the Kubernetes services in this cluster, in [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `1.2.3.4/29`). Service addresses are typically put in the last `/16` from the container CIDR.
    */
  var servicesIpv4Cidr: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Shielded Nodes configuration.
    */
  var shieldedNodes: js.UndefOr[SchemaShieldedNodes] = js.undefined
  
  /**
    * [Output only] The current status of this cluster.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output only] Deprecated. Use conditions instead. Additional information about the current status of this cluster, if available.
    */
  var statusMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the Google Compute Engine [subnetwork](https://cloud.google.com/compute/docs/subnetworks) to which the cluster is connected. On output this shows the subnetwork ID instead of the name.
    */
  var subnetwork: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration for Cloud TPU support;
    */
  var tpuConfig: js.UndefOr[SchemaTpuConfig] = js.undefined
  
  /**
    * [Output only] The IP address range of the Cloud TPUs in this cluster, in [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `1.2.3.4/29`).
    */
  var tpuIpv4CidrBlock: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Cluster-level Vertical Pod Autoscaling configuration.
    */
  var verticalPodAutoscaling: js.UndefOr[SchemaVerticalPodAutoscaling] = js.undefined
  
  /**
    * Configuration for direct-path (via ALTS) with workload identity.
    */
  var workloadAltsConfig: js.UndefOr[SchemaWorkloadALTSConfig] = js.undefined
  
  /**
    * Configuration for issuance of mTLS keys and certificates to Kubernetes pods.
    */
  var workloadCertificates: js.UndefOr[SchemaWorkloadCertificates] = js.undefined
  
  /**
    * Configuration for the use of Kubernetes Service Accounts in GCP IAM policies.
    */
  var workloadIdentityConfig: js.UndefOr[SchemaWorkloadIdentityConfig] = js.undefined
  
  /**
    * [Output only] The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field is deprecated, use location instead.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaCluster {
  
  inline def apply(): SchemaCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCluster]
  }
  
  extension [Self <: SchemaCluster](x: Self) {
    
    inline def setAddonsConfig(value: SchemaAddonsConfig): Self = StObject.set(x, "addonsConfig", value.asInstanceOf[js.Any])
    
    inline def setAddonsConfigUndefined: Self = StObject.set(x, "addonsConfig", js.undefined)
    
    inline def setAuthenticatorGroupsConfig(value: SchemaAuthenticatorGroupsConfig): Self = StObject.set(x, "authenticatorGroupsConfig", value.asInstanceOf[js.Any])
    
    inline def setAuthenticatorGroupsConfigUndefined: Self = StObject.set(x, "authenticatorGroupsConfig", js.undefined)
    
    inline def setAutopilot(value: SchemaAutopilot): Self = StObject.set(x, "autopilot", value.asInstanceOf[js.Any])
    
    inline def setAutopilotUndefined: Self = StObject.set(x, "autopilot", js.undefined)
    
    inline def setAutoscaling(value: SchemaClusterAutoscaling): Self = StObject.set(x, "autoscaling", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingUndefined: Self = StObject.set(x, "autoscaling", js.undefined)
    
    inline def setBinaryAuthorization(value: SchemaBinaryAuthorization): Self = StObject.set(x, "binaryAuthorization", value.asInstanceOf[js.Any])
    
    inline def setBinaryAuthorizationUndefined: Self = StObject.set(x, "binaryAuthorization", js.undefined)
    
    inline def setClusterIpv4Cidr(value: String): Self = StObject.set(x, "clusterIpv4Cidr", value.asInstanceOf[js.Any])
    
    inline def setClusterIpv4CidrNull: Self = StObject.set(x, "clusterIpv4Cidr", null)
    
    inline def setClusterIpv4CidrUndefined: Self = StObject.set(x, "clusterIpv4Cidr", js.undefined)
    
    inline def setClusterTelemetry(value: SchemaClusterTelemetry): Self = StObject.set(x, "clusterTelemetry", value.asInstanceOf[js.Any])
    
    inline def setClusterTelemetryUndefined: Self = StObject.set(x, "clusterTelemetry", js.undefined)
    
    inline def setConditions(value: js.Array[SchemaStatusCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: SchemaStatusCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setConfidentialNodes(value: SchemaConfidentialNodes): Self = StObject.set(x, "confidentialNodes", value.asInstanceOf[js.Any])
    
    inline def setConfidentialNodesUndefined: Self = StObject.set(x, "confidentialNodes", js.undefined)
    
    inline def setCostManagementConfig(value: SchemaCostManagementConfig): Self = StObject.set(x, "costManagementConfig", value.asInstanceOf[js.Any])
    
    inline def setCostManagementConfigUndefined: Self = StObject.set(x, "costManagementConfig", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCurrentMasterVersion(value: String): Self = StObject.set(x, "currentMasterVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentMasterVersionNull: Self = StObject.set(x, "currentMasterVersion", null)
    
    inline def setCurrentMasterVersionUndefined: Self = StObject.set(x, "currentMasterVersion", js.undefined)
    
    inline def setCurrentNodeCount(value: Double): Self = StObject.set(x, "currentNodeCount", value.asInstanceOf[js.Any])
    
    inline def setCurrentNodeCountNull: Self = StObject.set(x, "currentNodeCount", null)
    
    inline def setCurrentNodeCountUndefined: Self = StObject.set(x, "currentNodeCount", js.undefined)
    
    inline def setCurrentNodeVersion(value: String): Self = StObject.set(x, "currentNodeVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentNodeVersionNull: Self = StObject.set(x, "currentNodeVersion", null)
    
    inline def setCurrentNodeVersionUndefined: Self = StObject.set(x, "currentNodeVersion", js.undefined)
    
    inline def setDatabaseEncryption(value: SchemaDatabaseEncryption): Self = StObject.set(x, "databaseEncryption", value.asInstanceOf[js.Any])
    
    inline def setDatabaseEncryptionUndefined: Self = StObject.set(x, "databaseEncryption", js.undefined)
    
    inline def setDefaultMaxPodsConstraint(value: SchemaMaxPodsConstraint): Self = StObject.set(x, "defaultMaxPodsConstraint", value.asInstanceOf[js.Any])
    
    inline def setDefaultMaxPodsConstraintUndefined: Self = StObject.set(x, "defaultMaxPodsConstraint", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnableKubernetesAlpha(value: Boolean): Self = StObject.set(x, "enableKubernetesAlpha", value.asInstanceOf[js.Any])
    
    inline def setEnableKubernetesAlphaNull: Self = StObject.set(x, "enableKubernetesAlpha", null)
    
    inline def setEnableKubernetesAlphaUndefined: Self = StObject.set(x, "enableKubernetesAlpha", js.undefined)
    
    inline def setEnableTpu(value: Boolean): Self = StObject.set(x, "enableTpu", value.asInstanceOf[js.Any])
    
    inline def setEnableTpuNull: Self = StObject.set(x, "enableTpu", null)
    
    inline def setEnableTpuUndefined: Self = StObject.set(x, "enableTpu", js.undefined)
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointNull: Self = StObject.set(x, "endpoint", null)
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdentityServiceConfig(value: SchemaIdentityServiceConfig): Self = StObject.set(x, "identityServiceConfig", value.asInstanceOf[js.Any])
    
    inline def setIdentityServiceConfigUndefined: Self = StObject.set(x, "identityServiceConfig", js.undefined)
    
    inline def setInitialClusterVersion(value: String): Self = StObject.set(x, "initialClusterVersion", value.asInstanceOf[js.Any])
    
    inline def setInitialClusterVersionNull: Self = StObject.set(x, "initialClusterVersion", null)
    
    inline def setInitialClusterVersionUndefined: Self = StObject.set(x, "initialClusterVersion", js.undefined)
    
    inline def setInitialNodeCount(value: Double): Self = StObject.set(x, "initialNodeCount", value.asInstanceOf[js.Any])
    
    inline def setInitialNodeCountNull: Self = StObject.set(x, "initialNodeCount", null)
    
    inline def setInitialNodeCountUndefined: Self = StObject.set(x, "initialNodeCount", js.undefined)
    
    inline def setInstanceGroupUrls(value: js.Array[String]): Self = StObject.set(x, "instanceGroupUrls", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupUrlsNull: Self = StObject.set(x, "instanceGroupUrls", null)
    
    inline def setInstanceGroupUrlsUndefined: Self = StObject.set(x, "instanceGroupUrls", js.undefined)
    
    inline def setInstanceGroupUrlsVarargs(value: String*): Self = StObject.set(x, "instanceGroupUrls", js.Array(value*))
    
    inline def setIpAllocationPolicy(value: SchemaIPAllocationPolicy): Self = StObject.set(x, "ipAllocationPolicy", value.asInstanceOf[js.Any])
    
    inline def setIpAllocationPolicyUndefined: Self = StObject.set(x, "ipAllocationPolicy", js.undefined)
    
    inline def setLabelFingerprint(value: String): Self = StObject.set(x, "labelFingerprint", value.asInstanceOf[js.Any])
    
    inline def setLabelFingerprintNull: Self = StObject.set(x, "labelFingerprint", null)
    
    inline def setLabelFingerprintUndefined: Self = StObject.set(x, "labelFingerprint", js.undefined)
    
    inline def setLegacyAbac(value: SchemaLegacyAbac): Self = StObject.set(x, "legacyAbac", value.asInstanceOf[js.Any])
    
    inline def setLegacyAbacUndefined: Self = StObject.set(x, "legacyAbac", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocations(value: js.Array[String]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsNull: Self = StObject.set(x, "locations", null)
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: String*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setLoggingConfig(value: SchemaLoggingConfig): Self = StObject.set(x, "loggingConfig", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigUndefined: Self = StObject.set(x, "loggingConfig", js.undefined)
    
    inline def setLoggingService(value: String): Self = StObject.set(x, "loggingService", value.asInstanceOf[js.Any])
    
    inline def setLoggingServiceNull: Self = StObject.set(x, "loggingService", null)
    
    inline def setLoggingServiceUndefined: Self = StObject.set(x, "loggingService", js.undefined)
    
    inline def setMaintenancePolicy(value: SchemaMaintenancePolicy): Self = StObject.set(x, "maintenancePolicy", value.asInstanceOf[js.Any])
    
    inline def setMaintenancePolicyUndefined: Self = StObject.set(x, "maintenancePolicy", js.undefined)
    
    inline def setMaster(value: SchemaMaster): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    inline def setMasterAuth(value: SchemaMasterAuth): Self = StObject.set(x, "masterAuth", value.asInstanceOf[js.Any])
    
    inline def setMasterAuthUndefined: Self = StObject.set(x, "masterAuth", js.undefined)
    
    inline def setMasterAuthorizedNetworksConfig(value: SchemaMasterAuthorizedNetworksConfig): Self = StObject.set(x, "masterAuthorizedNetworksConfig", value.asInstanceOf[js.Any])
    
    inline def setMasterAuthorizedNetworksConfigUndefined: Self = StObject.set(x, "masterAuthorizedNetworksConfig", js.undefined)
    
    inline def setMasterIpv4CidrBlock(value: String): Self = StObject.set(x, "masterIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setMasterIpv4CidrBlockNull: Self = StObject.set(x, "masterIpv4CidrBlock", null)
    
    inline def setMasterIpv4CidrBlockUndefined: Self = StObject.set(x, "masterIpv4CidrBlock", js.undefined)
    
    inline def setMasterUndefined: Self = StObject.set(x, "master", js.undefined)
    
    inline def setMeshCertificates(value: SchemaMeshCertificates): Self = StObject.set(x, "meshCertificates", value.asInstanceOf[js.Any])
    
    inline def setMeshCertificatesUndefined: Self = StObject.set(x, "meshCertificates", js.undefined)
    
    inline def setMonitoringConfig(value: SchemaMonitoringConfig): Self = StObject.set(x, "monitoringConfig", value.asInstanceOf[js.Any])
    
    inline def setMonitoringConfigUndefined: Self = StObject.set(x, "monitoringConfig", js.undefined)
    
    inline def setMonitoringService(value: String): Self = StObject.set(x, "monitoringService", value.asInstanceOf[js.Any])
    
    inline def setMonitoringServiceNull: Self = StObject.set(x, "monitoringService", null)
    
    inline def setMonitoringServiceUndefined: Self = StObject.set(x, "monitoringService", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfig(value: SchemaNetworkConfig): Self = StObject.set(x, "networkConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigUndefined: Self = StObject.set(x, "networkConfig", js.undefined)
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkPolicy(value: SchemaNetworkPolicy): Self = StObject.set(x, "networkPolicy", value.asInstanceOf[js.Any])
    
    inline def setNetworkPolicyUndefined: Self = StObject.set(x, "networkPolicy", js.undefined)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setNodeConfig(value: SchemaNodeConfig): Self = StObject.set(x, "nodeConfig", value.asInstanceOf[js.Any])
    
    inline def setNodeConfigUndefined: Self = StObject.set(x, "nodeConfig", js.undefined)
    
    inline def setNodeIpv4CidrSize(value: Double): Self = StObject.set(x, "nodeIpv4CidrSize", value.asInstanceOf[js.Any])
    
    inline def setNodeIpv4CidrSizeNull: Self = StObject.set(x, "nodeIpv4CidrSize", null)
    
    inline def setNodeIpv4CidrSizeUndefined: Self = StObject.set(x, "nodeIpv4CidrSize", js.undefined)
    
    inline def setNodePoolAutoConfig(value: SchemaNodePoolAutoConfig): Self = StObject.set(x, "nodePoolAutoConfig", value.asInstanceOf[js.Any])
    
    inline def setNodePoolAutoConfigUndefined: Self = StObject.set(x, "nodePoolAutoConfig", js.undefined)
    
    inline def setNodePoolDefaults(value: SchemaNodePoolDefaults): Self = StObject.set(x, "nodePoolDefaults", value.asInstanceOf[js.Any])
    
    inline def setNodePoolDefaultsUndefined: Self = StObject.set(x, "nodePoolDefaults", js.undefined)
    
    inline def setNodePools(value: js.Array[SchemaNodePool]): Self = StObject.set(x, "nodePools", value.asInstanceOf[js.Any])
    
    inline def setNodePoolsUndefined: Self = StObject.set(x, "nodePools", js.undefined)
    
    inline def setNodePoolsVarargs(value: SchemaNodePool*): Self = StObject.set(x, "nodePools", js.Array(value*))
    
    inline def setNotificationConfig(value: SchemaNotificationConfig): Self = StObject.set(x, "notificationConfig", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigUndefined: Self = StObject.set(x, "notificationConfig", js.undefined)
    
    inline def setPodSecurityPolicyConfig(value: SchemaPodSecurityPolicyConfig): Self = StObject.set(x, "podSecurityPolicyConfig", value.asInstanceOf[js.Any])
    
    inline def setPodSecurityPolicyConfigUndefined: Self = StObject.set(x, "podSecurityPolicyConfig", js.undefined)
    
    inline def setPrivateCluster(value: Boolean): Self = StObject.set(x, "privateCluster", value.asInstanceOf[js.Any])
    
    inline def setPrivateClusterConfig(value: SchemaPrivateClusterConfig): Self = StObject.set(x, "privateClusterConfig", value.asInstanceOf[js.Any])
    
    inline def setPrivateClusterConfigUndefined: Self = StObject.set(x, "privateClusterConfig", js.undefined)
    
    inline def setPrivateClusterNull: Self = StObject.set(x, "privateCluster", null)
    
    inline def setPrivateClusterUndefined: Self = StObject.set(x, "privateCluster", js.undefined)
    
    inline def setProtectConfig(value: SchemaProtectConfig): Self = StObject.set(x, "protectConfig", value.asInstanceOf[js.Any])
    
    inline def setProtectConfigUndefined: Self = StObject.set(x, "protectConfig", js.undefined)
    
    inline def setReleaseChannel(value: SchemaReleaseChannel): Self = StObject.set(x, "releaseChannel", value.asInstanceOf[js.Any])
    
    inline def setReleaseChannelUndefined: Self = StObject.set(x, "releaseChannel", js.undefined)
    
    inline def setResourceLabels(value: StringDictionary[String]): Self = StObject.set(x, "resourceLabels", value.asInstanceOf[js.Any])
    
    inline def setResourceLabelsNull: Self = StObject.set(x, "resourceLabels", null)
    
    inline def setResourceLabelsUndefined: Self = StObject.set(x, "resourceLabels", js.undefined)
    
    inline def setResourceUsageExportConfig(value: SchemaResourceUsageExportConfig): Self = StObject.set(x, "resourceUsageExportConfig", value.asInstanceOf[js.Any])
    
    inline def setResourceUsageExportConfigUndefined: Self = StObject.set(x, "resourceUsageExportConfig", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setServicesIpv4Cidr(value: String): Self = StObject.set(x, "servicesIpv4Cidr", value.asInstanceOf[js.Any])
    
    inline def setServicesIpv4CidrNull: Self = StObject.set(x, "servicesIpv4Cidr", null)
    
    inline def setServicesIpv4CidrUndefined: Self = StObject.set(x, "servicesIpv4Cidr", js.undefined)
    
    inline def setShieldedNodes(value: SchemaShieldedNodes): Self = StObject.set(x, "shieldedNodes", value.asInstanceOf[js.Any])
    
    inline def setShieldedNodesUndefined: Self = StObject.set(x, "shieldedNodes", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageNull: Self = StObject.set(x, "statusMessage", null)
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkNull: Self = StObject.set(x, "subnetwork", null)
    
    inline def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
    
    inline def setTpuConfig(value: SchemaTpuConfig): Self = StObject.set(x, "tpuConfig", value.asInstanceOf[js.Any])
    
    inline def setTpuConfigUndefined: Self = StObject.set(x, "tpuConfig", js.undefined)
    
    inline def setTpuIpv4CidrBlock(value: String): Self = StObject.set(x, "tpuIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setTpuIpv4CidrBlockNull: Self = StObject.set(x, "tpuIpv4CidrBlock", null)
    
    inline def setTpuIpv4CidrBlockUndefined: Self = StObject.set(x, "tpuIpv4CidrBlock", js.undefined)
    
    inline def setVerticalPodAutoscaling(value: SchemaVerticalPodAutoscaling): Self = StObject.set(x, "verticalPodAutoscaling", value.asInstanceOf[js.Any])
    
    inline def setVerticalPodAutoscalingUndefined: Self = StObject.set(x, "verticalPodAutoscaling", js.undefined)
    
    inline def setWorkloadAltsConfig(value: SchemaWorkloadALTSConfig): Self = StObject.set(x, "workloadAltsConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkloadAltsConfigUndefined: Self = StObject.set(x, "workloadAltsConfig", js.undefined)
    
    inline def setWorkloadCertificates(value: SchemaWorkloadCertificates): Self = StObject.set(x, "workloadCertificates", value.asInstanceOf[js.Any])
    
    inline def setWorkloadCertificatesUndefined: Self = StObject.set(x, "workloadCertificates", js.undefined)
    
    inline def setWorkloadIdentityConfig(value: SchemaWorkloadIdentityConfig): Self = StObject.set(x, "workloadIdentityConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdentityConfigUndefined: Self = StObject.set(x, "workloadIdentityConfig", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
