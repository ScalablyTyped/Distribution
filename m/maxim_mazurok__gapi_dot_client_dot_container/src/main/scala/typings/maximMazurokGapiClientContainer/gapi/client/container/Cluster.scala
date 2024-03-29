package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  /** Configurations for the various addons available to run in the cluster. */
  var addonsConfig: js.UndefOr[AddonsConfig] = js.undefined
  
  /** Configuration controlling RBAC group membership information. */
  var authenticatorGroupsConfig: js.UndefOr[AuthenticatorGroupsConfig] = js.undefined
  
  /** Autopilot configuration for the cluster. */
  var autopilot: js.UndefOr[Autopilot] = js.undefined
  
  /** Cluster-level autoscaling configuration. */
  var autoscaling: js.UndefOr[ClusterAutoscaling] = js.undefined
  
  /** Configuration for Binary Authorization. */
  var binaryAuthorization: js.UndefOr[BinaryAuthorization] = js.undefined
  
  /**
    * The IP address range of the container pods in this cluster, in [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`). Leave blank to
    * have one automatically chosen or specify a `/14` block in `10.0.0.0/8`.
    */
  var clusterIpv4Cidr: js.UndefOr[String] = js.undefined
  
  /** Which conditions caused the current cluster state. */
  var conditions: js.UndefOr[js.Array[StatusCondition]] = js.undefined
  
  /** Configuration of Confidential Nodes. All the nodes in the cluster will be Confidential VM once enabled. */
  var confidentialNodes: js.UndefOr[ConfidentialNodes] = js.undefined
  
  /** [Output only] The time the cluster was created, in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** [Output only] The current software version of the master endpoint. */
  var currentMasterVersion: js.UndefOr[String] = js.undefined
  
  /** [Output only] The number of nodes currently in the cluster. Deprecated. Call Kubernetes API directly to retrieve node information. */
  var currentNodeCount: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output only] Deprecated, use [NodePools.version](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters.nodePools) instead. The current
    * version of the node software components. If they are currently at multiple versions because they're in the process of being upgraded, this reflects the minimum version of all nodes.
    */
  var currentNodeVersion: js.UndefOr[String] = js.undefined
  
  /** Configuration of etcd encryption. */
  var databaseEncryption: js.UndefOr[DatabaseEncryption] = js.undefined
  
  /**
    * The default constraint on the maximum number of pods that can be run simultaneously on a node in the node pool of this cluster. Only honored if cluster created with IP Alias
    * support.
    */
  var defaultMaxPodsConstraint: js.UndefOr[MaxPodsConstraint] = js.undefined
  
  /** An optional description of this cluster. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Kubernetes alpha features are enabled on this cluster. This includes alpha API groups (e.g. v1alpha1) and features that may not be production ready in the kubernetes version of the
    * master and nodes. The cluster has no SLA for uptime and master/node upgrades are disabled. Alpha enabled clusters are automatically deleted thirty days after creation.
    */
  var enableKubernetesAlpha: js.UndefOr[Boolean] = js.undefined
  
  /** Enable the ability to use Cloud TPUs in this cluster. */
  var enableTpu: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [Output only] The IP address of this cluster's master endpoint. The endpoint can be accessed from the internet at `https://username:password@endpoint/`. See the `masterAuth`
    * property of this resource for username and password information.
    */
  var endpoint: js.UndefOr[String] = js.undefined
  
  /** [Output only] The time the cluster will be automatically deleted in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format. */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /** Output only. Unique id for the cluster. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Configuration for Identity Service component. */
  var identityServiceConfig: js.UndefOr[IdentityServiceConfig] = js.undefined
  
  /**
    * The initial Kubernetes version for this cluster. Valid versions are those found in validMasterVersions returned by getServerConfig. The version can be upgraded over time; such
    * upgrades are reflected in currentMasterVersion and currentNodeVersion. Users may specify either explicit versions offered by Kubernetes Engine or version aliases, which have the
    * following behavior: - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid
    * gke.N patch in the 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "","-": picks the default Kubernetes version
    */
  var initialClusterVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The number of nodes to create in this cluster. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of
    * instances. You must also have available firewall and routes quota. For requests, this field should only be used in lieu of a "node_pool" object, since this configuration (along with
    * the "node_config") will be used to create a "NodePool" object with an auto-generated name. Do not use this and a node_pool at the same time. This field is deprecated, use
    * node_pool.initial_node_count instead.
    */
  var initialNodeCount: js.UndefOr[Double] = js.undefined
  
  /** Deprecated. Use node_pools.instance_group_urls. */
  var instanceGroupUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Configuration for cluster IP allocation. */
  var ipAllocationPolicy: js.UndefOr[IPAllocationPolicy] = js.undefined
  
  /** The fingerprint of the set of labels for this cluster. */
  var labelFingerprint: js.UndefOr[String] = js.undefined
  
  /** Configuration for the legacy ABAC authorization mode. */
  var legacyAbac: js.UndefOr[LegacyAbac] = js.undefined
  
  /**
    * [Output only] The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones#available) or
    * [region](https://cloud.google.com/compute/docs/regions-zones/regions-zones#available) in which the cluster resides.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the cluster's nodes should be located. This field provides a default value
    * if [NodePool.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters.nodePools#NodePool.FIELDS.locations) are not specified during
    * node pool creation. Warning: changing cluster locations will update the
    * [NodePool.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters.nodePools#NodePool.FIELDS.locations) of all node pools and will
    * result in nodes being added and/or removed.
    */
  var locations: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Logging configuration for the cluster. */
  var loggingConfig: js.UndefOr[LoggingConfig] = js.undefined
  
  /**
    * The logging service the cluster should use to write logs. Currently available options: * `logging.googleapis.com/kubernetes` - The Cloud Logging service with a Kubernetes-native
    * resource model * `logging.googleapis.com` - The legacy Cloud Logging service (no longer available as of GKE 1.15). * `none` - no logs will be exported from the cluster. If left as
    * an empty string,`logging.googleapis.com/kubernetes` will be used for GKE 1.14+ or `logging.googleapis.com` for earlier versions.
    */
  var loggingService: js.UndefOr[String] = js.undefined
  
  /** Configure the maintenance policy for this cluster. */
  var maintenancePolicy: js.UndefOr[MaintenancePolicy] = js.undefined
  
  /**
    * The authentication information for accessing the master endpoint. If unspecified, the defaults are used: For clusters before v1.12, if master_auth is unspecified, `username` will be
    * set to "admin", a random password will be generated, and a client certificate will be issued.
    */
  var masterAuth: js.UndefOr[MasterAuth] = js.undefined
  
  /** The configuration options for master authorized networks feature. */
  var masterAuthorizedNetworksConfig: js.UndefOr[MasterAuthorizedNetworksConfig] = js.undefined
  
  /** Configuration for issuance of mTLS keys and certificates to Kubernetes pods. */
  var meshCertificates: js.UndefOr[MeshCertificates] = js.undefined
  
  /** Monitoring configuration for the cluster. */
  var monitoringConfig: js.UndefOr[MonitoringConfig] = js.undefined
  
  /**
    * The monitoring service the cluster should use to write metrics. Currently available options: * "monitoring.googleapis.com/kubernetes" - The Cloud Monitoring service with a
    * Kubernetes-native resource model * `monitoring.googleapis.com` - The legacy Cloud Monitoring service (no longer available as of GKE 1.15). * `none` - No metrics will be exported
    * from the cluster. If left as an empty string,`monitoring.googleapis.com/kubernetes` will be used for GKE 1.14+ or `monitoring.googleapis.com` for earlier versions.
    */
  var monitoringService: js.UndefOr[String] = js.undefined
  
  /**
    * The name of this cluster. The name must be unique within this project and location (e.g. zone or region), and can be up to 40 characters with the following restrictions: * Lowercase
    * letters, numbers, and hyphens only. * Must start with a letter. * Must end with a number or a letter.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Google Compute Engine [network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks) to which the cluster is connected. If left unspecified, the
    * `default` network will be used.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /** Configuration for cluster networking. */
  var networkConfig: js.UndefOr[NetworkConfig] = js.undefined
  
  /** Configuration options for the NetworkPolicy feature. */
  var networkPolicy: js.UndefOr[NetworkPolicy] = js.undefined
  
  /**
    * Parameters used in creating the cluster's nodes. For requests, this field should only be used in lieu of a "node_pool" object, since this configuration (along with the
    * "initial_node_count") will be used to create a "NodePool" object with an auto-generated name. Do not use this and a node_pool at the same time. For responses, this field will be
    * populated with the node configuration of the first node pool. (For configuration of each node pool, see `node_pool.config`) If unspecified, the defaults are used. This field is
    * deprecated, use node_pool.config instead.
    */
  var nodeConfig: js.UndefOr[NodeConfig] = js.undefined
  
  /**
    * [Output only] The size of the address space on each node for hosting containers. This is provisioned from within the `container_ipv4_cidr` range. This field will only be set when
    * cluster is in route-based network mode.
    */
  var nodeIpv4CidrSize: js.UndefOr[Double] = js.undefined
  
  /** Node pool configs that apply to all auto-provisioned node pools in autopilot clusters and node auto-provisioning enabled clusters. */
  var nodePoolAutoConfig: js.UndefOr[NodePoolAutoConfig] = js.undefined
  
  /** Default NodePool settings for the entire cluster. These settings are overridden if specified on the specific NodePool object. */
  var nodePoolDefaults: js.UndefOr[NodePoolDefaults] = js.undefined
  
  /** The node pools associated with this cluster. This field should not be set if "node_config" or "initial_node_count" are specified. */
  var nodePools: js.UndefOr[js.Array[NodePool]] = js.undefined
  
  /** Notification configuration of the cluster. */
  var notificationConfig: js.UndefOr[NotificationConfig] = js.undefined
  
  /** Configuration for private cluster. */
  var privateClusterConfig: js.UndefOr[PrivateClusterConfig] = js.undefined
  
  /** Release channel configuration. */
  var releaseChannel: js.UndefOr[ReleaseChannel] = js.undefined
  
  /** The resource labels for the cluster to use to annotate any related Google Compute Engine resources. */
  var resourceLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Configuration for exporting resource usages. Resource usage export is disabled when this config is unspecified. */
  var resourceUsageExportConfig: js.UndefOr[ResourceUsageExportConfig] = js.undefined
  
  /** [Output only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * [Output only] The IP address range of the Kubernetes services in this cluster, in [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `1.2.3.4/29`).
    * Service addresses are typically put in the last `/16` from the container CIDR.
    */
  var servicesIpv4Cidr: js.UndefOr[String] = js.undefined
  
  /** Shielded Nodes configuration. */
  var shieldedNodes: js.UndefOr[ShieldedNodes] = js.undefined
  
  /** [Output only] The current status of this cluster. */
  var status: js.UndefOr[String] = js.undefined
  
  /** [Output only] Deprecated. Use conditions instead. Additional information about the current status of this cluster, if available. */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /** The name of the Google Compute Engine [subnetwork](https://cloud.google.com/compute/docs/subnetworks) to which the cluster is connected. */
  var subnetwork: js.UndefOr[String] = js.undefined
  
  /** [Output only] The IP address range of the Cloud TPUs in this cluster, in [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `1.2.3.4/29`). */
  var tpuIpv4CidrBlock: js.UndefOr[String] = js.undefined
  
  /** Cluster-level Vertical Pod Autoscaling configuration. */
  var verticalPodAutoscaling: js.UndefOr[VerticalPodAutoscaling] = js.undefined
  
  /** Configuration for the use of Kubernetes Service Accounts in GCP IAM policies. */
  var workloadIdentityConfig: js.UndefOr[WorkloadIdentityConfig] = js.undefined
  
  /**
    * [Output only] The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field is deprecated, use
    * location instead.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object Cluster {
  
  inline def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cluster] (val x: Self) extends AnyVal {
    
    inline def setAddonsConfig(value: AddonsConfig): Self = StObject.set(x, "addonsConfig", value.asInstanceOf[js.Any])
    
    inline def setAddonsConfigUndefined: Self = StObject.set(x, "addonsConfig", js.undefined)
    
    inline def setAuthenticatorGroupsConfig(value: AuthenticatorGroupsConfig): Self = StObject.set(x, "authenticatorGroupsConfig", value.asInstanceOf[js.Any])
    
    inline def setAuthenticatorGroupsConfigUndefined: Self = StObject.set(x, "authenticatorGroupsConfig", js.undefined)
    
    inline def setAutopilot(value: Autopilot): Self = StObject.set(x, "autopilot", value.asInstanceOf[js.Any])
    
    inline def setAutopilotUndefined: Self = StObject.set(x, "autopilot", js.undefined)
    
    inline def setAutoscaling(value: ClusterAutoscaling): Self = StObject.set(x, "autoscaling", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingUndefined: Self = StObject.set(x, "autoscaling", js.undefined)
    
    inline def setBinaryAuthorization(value: BinaryAuthorization): Self = StObject.set(x, "binaryAuthorization", value.asInstanceOf[js.Any])
    
    inline def setBinaryAuthorizationUndefined: Self = StObject.set(x, "binaryAuthorization", js.undefined)
    
    inline def setClusterIpv4Cidr(value: String): Self = StObject.set(x, "clusterIpv4Cidr", value.asInstanceOf[js.Any])
    
    inline def setClusterIpv4CidrUndefined: Self = StObject.set(x, "clusterIpv4Cidr", js.undefined)
    
    inline def setConditions(value: js.Array[StatusCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: StatusCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setConfidentialNodes(value: ConfidentialNodes): Self = StObject.set(x, "confidentialNodes", value.asInstanceOf[js.Any])
    
    inline def setConfidentialNodesUndefined: Self = StObject.set(x, "confidentialNodes", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCurrentMasterVersion(value: String): Self = StObject.set(x, "currentMasterVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentMasterVersionUndefined: Self = StObject.set(x, "currentMasterVersion", js.undefined)
    
    inline def setCurrentNodeCount(value: Double): Self = StObject.set(x, "currentNodeCount", value.asInstanceOf[js.Any])
    
    inline def setCurrentNodeCountUndefined: Self = StObject.set(x, "currentNodeCount", js.undefined)
    
    inline def setCurrentNodeVersion(value: String): Self = StObject.set(x, "currentNodeVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentNodeVersionUndefined: Self = StObject.set(x, "currentNodeVersion", js.undefined)
    
    inline def setDatabaseEncryption(value: DatabaseEncryption): Self = StObject.set(x, "databaseEncryption", value.asInstanceOf[js.Any])
    
    inline def setDatabaseEncryptionUndefined: Self = StObject.set(x, "databaseEncryption", js.undefined)
    
    inline def setDefaultMaxPodsConstraint(value: MaxPodsConstraint): Self = StObject.set(x, "defaultMaxPodsConstraint", value.asInstanceOf[js.Any])
    
    inline def setDefaultMaxPodsConstraintUndefined: Self = StObject.set(x, "defaultMaxPodsConstraint", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnableKubernetesAlpha(value: Boolean): Self = StObject.set(x, "enableKubernetesAlpha", value.asInstanceOf[js.Any])
    
    inline def setEnableKubernetesAlphaUndefined: Self = StObject.set(x, "enableKubernetesAlpha", js.undefined)
    
    inline def setEnableTpu(value: Boolean): Self = StObject.set(x, "enableTpu", value.asInstanceOf[js.Any])
    
    inline def setEnableTpuUndefined: Self = StObject.set(x, "enableTpu", js.undefined)
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdentityServiceConfig(value: IdentityServiceConfig): Self = StObject.set(x, "identityServiceConfig", value.asInstanceOf[js.Any])
    
    inline def setIdentityServiceConfigUndefined: Self = StObject.set(x, "identityServiceConfig", js.undefined)
    
    inline def setInitialClusterVersion(value: String): Self = StObject.set(x, "initialClusterVersion", value.asInstanceOf[js.Any])
    
    inline def setInitialClusterVersionUndefined: Self = StObject.set(x, "initialClusterVersion", js.undefined)
    
    inline def setInitialNodeCount(value: Double): Self = StObject.set(x, "initialNodeCount", value.asInstanceOf[js.Any])
    
    inline def setInitialNodeCountUndefined: Self = StObject.set(x, "initialNodeCount", js.undefined)
    
    inline def setInstanceGroupUrls(value: js.Array[String]): Self = StObject.set(x, "instanceGroupUrls", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupUrlsUndefined: Self = StObject.set(x, "instanceGroupUrls", js.undefined)
    
    inline def setInstanceGroupUrlsVarargs(value: String*): Self = StObject.set(x, "instanceGroupUrls", js.Array(value*))
    
    inline def setIpAllocationPolicy(value: IPAllocationPolicy): Self = StObject.set(x, "ipAllocationPolicy", value.asInstanceOf[js.Any])
    
    inline def setIpAllocationPolicyUndefined: Self = StObject.set(x, "ipAllocationPolicy", js.undefined)
    
    inline def setLabelFingerprint(value: String): Self = StObject.set(x, "labelFingerprint", value.asInstanceOf[js.Any])
    
    inline def setLabelFingerprintUndefined: Self = StObject.set(x, "labelFingerprint", js.undefined)
    
    inline def setLegacyAbac(value: LegacyAbac): Self = StObject.set(x, "legacyAbac", value.asInstanceOf[js.Any])
    
    inline def setLegacyAbacUndefined: Self = StObject.set(x, "legacyAbac", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocations(value: js.Array[String]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: String*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setLoggingConfig(value: LoggingConfig): Self = StObject.set(x, "loggingConfig", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigUndefined: Self = StObject.set(x, "loggingConfig", js.undefined)
    
    inline def setLoggingService(value: String): Self = StObject.set(x, "loggingService", value.asInstanceOf[js.Any])
    
    inline def setLoggingServiceUndefined: Self = StObject.set(x, "loggingService", js.undefined)
    
    inline def setMaintenancePolicy(value: MaintenancePolicy): Self = StObject.set(x, "maintenancePolicy", value.asInstanceOf[js.Any])
    
    inline def setMaintenancePolicyUndefined: Self = StObject.set(x, "maintenancePolicy", js.undefined)
    
    inline def setMasterAuth(value: MasterAuth): Self = StObject.set(x, "masterAuth", value.asInstanceOf[js.Any])
    
    inline def setMasterAuthUndefined: Self = StObject.set(x, "masterAuth", js.undefined)
    
    inline def setMasterAuthorizedNetworksConfig(value: MasterAuthorizedNetworksConfig): Self = StObject.set(x, "masterAuthorizedNetworksConfig", value.asInstanceOf[js.Any])
    
    inline def setMasterAuthorizedNetworksConfigUndefined: Self = StObject.set(x, "masterAuthorizedNetworksConfig", js.undefined)
    
    inline def setMeshCertificates(value: MeshCertificates): Self = StObject.set(x, "meshCertificates", value.asInstanceOf[js.Any])
    
    inline def setMeshCertificatesUndefined: Self = StObject.set(x, "meshCertificates", js.undefined)
    
    inline def setMonitoringConfig(value: MonitoringConfig): Self = StObject.set(x, "monitoringConfig", value.asInstanceOf[js.Any])
    
    inline def setMonitoringConfigUndefined: Self = StObject.set(x, "monitoringConfig", js.undefined)
    
    inline def setMonitoringService(value: String): Self = StObject.set(x, "monitoringService", value.asInstanceOf[js.Any])
    
    inline def setMonitoringServiceUndefined: Self = StObject.set(x, "monitoringService", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfig(value: NetworkConfig): Self = StObject.set(x, "networkConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigUndefined: Self = StObject.set(x, "networkConfig", js.undefined)
    
    inline def setNetworkPolicy(value: NetworkPolicy): Self = StObject.set(x, "networkPolicy", value.asInstanceOf[js.Any])
    
    inline def setNetworkPolicyUndefined: Self = StObject.set(x, "networkPolicy", js.undefined)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setNodeConfig(value: NodeConfig): Self = StObject.set(x, "nodeConfig", value.asInstanceOf[js.Any])
    
    inline def setNodeConfigUndefined: Self = StObject.set(x, "nodeConfig", js.undefined)
    
    inline def setNodeIpv4CidrSize(value: Double): Self = StObject.set(x, "nodeIpv4CidrSize", value.asInstanceOf[js.Any])
    
    inline def setNodeIpv4CidrSizeUndefined: Self = StObject.set(x, "nodeIpv4CidrSize", js.undefined)
    
    inline def setNodePoolAutoConfig(value: NodePoolAutoConfig): Self = StObject.set(x, "nodePoolAutoConfig", value.asInstanceOf[js.Any])
    
    inline def setNodePoolAutoConfigUndefined: Self = StObject.set(x, "nodePoolAutoConfig", js.undefined)
    
    inline def setNodePoolDefaults(value: NodePoolDefaults): Self = StObject.set(x, "nodePoolDefaults", value.asInstanceOf[js.Any])
    
    inline def setNodePoolDefaultsUndefined: Self = StObject.set(x, "nodePoolDefaults", js.undefined)
    
    inline def setNodePools(value: js.Array[NodePool]): Self = StObject.set(x, "nodePools", value.asInstanceOf[js.Any])
    
    inline def setNodePoolsUndefined: Self = StObject.set(x, "nodePools", js.undefined)
    
    inline def setNodePoolsVarargs(value: NodePool*): Self = StObject.set(x, "nodePools", js.Array(value*))
    
    inline def setNotificationConfig(value: NotificationConfig): Self = StObject.set(x, "notificationConfig", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigUndefined: Self = StObject.set(x, "notificationConfig", js.undefined)
    
    inline def setPrivateClusterConfig(value: PrivateClusterConfig): Self = StObject.set(x, "privateClusterConfig", value.asInstanceOf[js.Any])
    
    inline def setPrivateClusterConfigUndefined: Self = StObject.set(x, "privateClusterConfig", js.undefined)
    
    inline def setReleaseChannel(value: ReleaseChannel): Self = StObject.set(x, "releaseChannel", value.asInstanceOf[js.Any])
    
    inline def setReleaseChannelUndefined: Self = StObject.set(x, "releaseChannel", js.undefined)
    
    inline def setResourceLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "resourceLabels", value.asInstanceOf[js.Any])
    
    inline def setResourceLabelsUndefined: Self = StObject.set(x, "resourceLabels", js.undefined)
    
    inline def setResourceUsageExportConfig(value: ResourceUsageExportConfig): Self = StObject.set(x, "resourceUsageExportConfig", value.asInstanceOf[js.Any])
    
    inline def setResourceUsageExportConfigUndefined: Self = StObject.set(x, "resourceUsageExportConfig", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setServicesIpv4Cidr(value: String): Self = StObject.set(x, "servicesIpv4Cidr", value.asInstanceOf[js.Any])
    
    inline def setServicesIpv4CidrUndefined: Self = StObject.set(x, "servicesIpv4Cidr", js.undefined)
    
    inline def setShieldedNodes(value: ShieldedNodes): Self = StObject.set(x, "shieldedNodes", value.asInstanceOf[js.Any])
    
    inline def setShieldedNodesUndefined: Self = StObject.set(x, "shieldedNodes", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
    
    inline def setTpuIpv4CidrBlock(value: String): Self = StObject.set(x, "tpuIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setTpuIpv4CidrBlockUndefined: Self = StObject.set(x, "tpuIpv4CidrBlock", js.undefined)
    
    inline def setVerticalPodAutoscaling(value: VerticalPodAutoscaling): Self = StObject.set(x, "verticalPodAutoscaling", value.asInstanceOf[js.Any])
    
    inline def setVerticalPodAutoscalingUndefined: Self = StObject.set(x, "verticalPodAutoscaling", js.undefined)
    
    inline def setWorkloadIdentityConfig(value: WorkloadIdentityConfig): Self = StObject.set(x, "workloadIdentityConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdentityConfigUndefined: Self = StObject.set(x, "workloadIdentityConfig", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
