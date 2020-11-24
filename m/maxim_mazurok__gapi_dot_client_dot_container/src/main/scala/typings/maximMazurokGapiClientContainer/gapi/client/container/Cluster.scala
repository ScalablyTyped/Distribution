package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cluster extends js.Object {
  
  /** Configurations for the various addons available to run in the cluster. */
  var addonsConfig: js.UndefOr[AddonsConfig] = js.native
  
  /** Configuration controlling RBAC group membership information. */
  var authenticatorGroupsConfig: js.UndefOr[AuthenticatorGroupsConfig] = js.native
  
  /** Cluster-level autoscaling configuration. */
  var autoscaling: js.UndefOr[ClusterAutoscaling] = js.native
  
  /** Configuration for Binary Authorization. */
  var binaryAuthorization: js.UndefOr[BinaryAuthorization] = js.native
  
  /**
    * The IP address range of the container pods in this cluster, in [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`). Leave blank to
    * have one automatically chosen or specify a `/14` block in `10.0.0.0/8`.
    */
  var clusterIpv4Cidr: js.UndefOr[String] = js.native
  
  /** Which conditions caused the current cluster state. */
  var conditions: js.UndefOr[js.Array[StatusCondition]] = js.native
  
  /** [Output only] The time the cluster was created, in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format. */
  var createTime: js.UndefOr[String] = js.native
  
  /** [Output only] The current software version of the master endpoint. */
  var currentMasterVersion: js.UndefOr[String] = js.native
  
  /** [Output only] The number of nodes currently in the cluster. Deprecated. Call Kubernetes API directly to retrieve node information. */
  var currentNodeCount: js.UndefOr[Double] = js.native
  
  /**
    * [Output only] Deprecated, use [NodePools.version](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters.nodePools) instead. The current
    * version of the node software components. If they are currently at multiple versions because they're in the process of being upgraded, this reflects the minimum version of all nodes.
    */
  var currentNodeVersion: js.UndefOr[String] = js.native
  
  /** Configuration of etcd encryption. */
  var databaseEncryption: js.UndefOr[DatabaseEncryption] = js.native
  
  /**
    * The default constraint on the maximum number of pods that can be run simultaneously on a node in the node pool of this cluster. Only honored if cluster created with IP Alias
    * support.
    */
  var defaultMaxPodsConstraint: js.UndefOr[MaxPodsConstraint] = js.native
  
  /** An optional description of this cluster. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Kubernetes alpha features are enabled on this cluster. This includes alpha API groups (e.g. v1alpha1) and features that may not be production ready in the kubernetes version of the
    * master and nodes. The cluster has no SLA for uptime and master/node upgrades are disabled. Alpha enabled clusters are automatically deleted thirty days after creation.
    */
  var enableKubernetesAlpha: js.UndefOr[Boolean] = js.native
  
  /** Enable the ability to use Cloud TPUs in this cluster. */
  var enableTpu: js.UndefOr[Boolean] = js.native
  
  /**
    * [Output only] The IP address of this cluster's master endpoint. The endpoint can be accessed from the internet at `https://username:password@endpoint/`. See the `masterAuth`
    * property of this resource for username and password information.
    */
  var endpoint: js.UndefOr[String] = js.native
  
  /** [Output only] The time the cluster will be automatically deleted in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format. */
  var expireTime: js.UndefOr[String] = js.native
  
  /**
    * The initial Kubernetes version for this cluster. Valid versions are those found in validMasterVersions returned by getServerConfig. The version can be upgraded over time; such
    * upgrades are reflected in currentMasterVersion and currentNodeVersion. Users may specify either explicit versions offered by Kubernetes Engine or version aliases, which have the
    * following behavior: - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid
    * gke.N patch in the 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "","-": picks the default Kubernetes version
    */
  var initialClusterVersion: js.UndefOr[String] = js.native
  
  /**
    * The number of nodes to create in this cluster. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of
    * instances. You must also have available firewall and routes quota. For requests, this field should only be used in lieu of a "node_pool" object, since this configuration (along with
    * the "node_config") will be used to create a "NodePool" object with an auto-generated name. Do not use this and a node_pool at the same time. This field is deprecated, use
    * node_pool.initial_node_count instead.
    */
  var initialNodeCount: js.UndefOr[Double] = js.native
  
  /** Deprecated. Use node_pools.instance_group_urls. */
  var instanceGroupUrls: js.UndefOr[js.Array[String]] = js.native
  
  /** Configuration for cluster IP allocation. */
  var ipAllocationPolicy: js.UndefOr[IPAllocationPolicy] = js.native
  
  /** The fingerprint of the set of labels for this cluster. */
  var labelFingerprint: js.UndefOr[String] = js.native
  
  /** Configuration for the legacy ABAC authorization mode. */
  var legacyAbac: js.UndefOr[LegacyAbac] = js.native
  
  /**
    * [Output only] The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones#available) or
    * [region](https://cloud.google.com/compute/docs/regions-zones/regions-zones#available) in which the cluster resides.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the cluster's nodes should be located. This field provides a default value
    * if [NodePool.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters.nodePools#NodePool.FIELDS.locations) are not specified during
    * node pool creation. Warning: changing cluster locations will update the
    * [NodePool.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters.nodePools#NodePool.FIELDS.locations) of all node pools and will
    * result in nodes being added and/or removed.
    */
  var locations: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The logging service the cluster should use to write logs. Currently available options: * `logging.googleapis.com/kubernetes` - The Cloud Logging service with a Kubernetes-native
    * resource model * `logging.googleapis.com` - The legacy Cloud Logging service (no longer available as of GKE 1.15). * `none` - no logs will be exported from the cluster. If left as
    * an empty string,`logging.googleapis.com/kubernetes` will be used for GKE 1.14+ or `logging.googleapis.com` for earlier versions.
    */
  var loggingService: js.UndefOr[String] = js.native
  
  /** Configure the maintenance policy for this cluster. */
  var maintenancePolicy: js.UndefOr[MaintenancePolicy] = js.native
  
  /**
    * The authentication information for accessing the master endpoint. If unspecified, the defaults are used: For clusters before v1.12, if master_auth is unspecified, `username` will be
    * set to "admin", a random password will be generated, and a client certificate will be issued.
    */
  var masterAuth: js.UndefOr[MasterAuth] = js.native
  
  /** The configuration options for master authorized networks feature. */
  var masterAuthorizedNetworksConfig: js.UndefOr[MasterAuthorizedNetworksConfig] = js.native
  
  /**
    * The monitoring service the cluster should use to write metrics. Currently available options: * "monitoring.googleapis.com/kubernetes" - The Cloud Monitoring service with a
    * Kubernetes-native resource model * `monitoring.googleapis.com` - The legacy Cloud Monitoring service (no longer available as of GKE 1.15). * `none` - No metrics will be exported
    * from the cluster. If left as an empty string,`monitoring.googleapis.com/kubernetes` will be used for GKE 1.14+ or `monitoring.googleapis.com` for earlier versions.
    */
  var monitoringService: js.UndefOr[String] = js.native
  
  /**
    * The name of this cluster. The name must be unique within this project and location (e.g. zone or region), and can be up to 40 characters with the following restrictions: * Lowercase
    * letters, numbers, and hyphens only. * Must start with a letter. * Must end with a number or a letter.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The name of the Google Compute Engine [network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks) to which the cluster is connected. If left unspecified, the
    * `default` network will be used.
    */
  var network: js.UndefOr[String] = js.native
  
  /** Configuration for cluster networking. */
  var networkConfig: js.UndefOr[NetworkConfig] = js.native
  
  /** Configuration options for the NetworkPolicy feature. */
  var networkPolicy: js.UndefOr[NetworkPolicy] = js.native
  
  /**
    * Parameters used in creating the cluster's nodes. For requests, this field should only be used in lieu of a "node_pool" object, since this configuration (along with the
    * "initial_node_count") will be used to create a "NodePool" object with an auto-generated name. Do not use this and a node_pool at the same time. For responses, this field will be
    * populated with the node configuration of the first node pool. (For configuration of each node pool, see `node_pool.config`) If unspecified, the defaults are used. This field is
    * deprecated, use node_pool.config instead.
    */
  var nodeConfig: js.UndefOr[NodeConfig] = js.native
  
  /**
    * [Output only] The size of the address space on each node for hosting containers. This is provisioned from within the `container_ipv4_cidr` range. This field will only be set when
    * cluster is in route-based network mode.
    */
  var nodeIpv4CidrSize: js.UndefOr[Double] = js.native
  
  /** The node pools associated with this cluster. This field should not be set if "node_config" or "initial_node_count" are specified. */
  var nodePools: js.UndefOr[js.Array[NodePool]] = js.native
  
  /** Configuration for private cluster. */
  var privateClusterConfig: js.UndefOr[PrivateClusterConfig] = js.native
  
  /** Release channel configuration. */
  var releaseChannel: js.UndefOr[ReleaseChannel] = js.native
  
  /** The resource labels for the cluster to use to annotate any related Google Compute Engine resources. */
  var resourceLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.Cluster with TopLevel[js.Any]
  ] = js.native
  
  /** Configuration for exporting resource usages. Resource usage export is disabled when this config is unspecified. */
  var resourceUsageExportConfig: js.UndefOr[ResourceUsageExportConfig] = js.native
  
  /** [Output only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output only] The IP address range of the Kubernetes services in this cluster, in [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `1.2.3.4/29`).
    * Service addresses are typically put in the last `/16` from the container CIDR.
    */
  var servicesIpv4Cidr: js.UndefOr[String] = js.native
  
  /** Shielded Nodes configuration. */
  var shieldedNodes: js.UndefOr[ShieldedNodes] = js.native
  
  /** [Output only] The current status of this cluster. */
  var status: js.UndefOr[String] = js.native
  
  /** [Output only] Additional information about the current status of this cluster, if available. */
  var statusMessage: js.UndefOr[String] = js.native
  
  /** The name of the Google Compute Engine [subnetwork](https://cloud.google.com/compute/docs/subnetworks) to which the cluster is connected. */
  var subnetwork: js.UndefOr[String] = js.native
  
  /** [Output only] The IP address range of the Cloud TPUs in this cluster, in [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `1.2.3.4/29`). */
  var tpuIpv4CidrBlock: js.UndefOr[String] = js.native
  
  /** Cluster-level Vertical Pod Autoscaling configuration. */
  var verticalPodAutoscaling: js.UndefOr[VerticalPodAutoscaling] = js.native
  
  /** Configuration for the use of Kubernetes Service Accounts in GCP IAM policies. */
  var workloadIdentityConfig: js.UndefOr[WorkloadIdentityConfig] = js.native
  
  /**
    * [Output only] The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field is deprecated, use
    * location instead.
    */
  var zone: js.UndefOr[String] = js.native
}
object Cluster {
  
  @scala.inline
  def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  
  @scala.inline
  implicit class ClusterOps[Self <: Cluster] (val x: Self) extends AnyVal {
    
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
    def setAddonsConfig(value: AddonsConfig): Self = this.set("addonsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddonsConfig: Self = this.set("addonsConfig", js.undefined)
    
    @scala.inline
    def setAuthenticatorGroupsConfig(value: AuthenticatorGroupsConfig): Self = this.set("authenticatorGroupsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticatorGroupsConfig: Self = this.set("authenticatorGroupsConfig", js.undefined)
    
    @scala.inline
    def setAutoscaling(value: ClusterAutoscaling): Self = this.set("autoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoscaling: Self = this.set("autoscaling", js.undefined)
    
    @scala.inline
    def setBinaryAuthorization(value: BinaryAuthorization): Self = this.set("binaryAuthorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryAuthorization: Self = this.set("binaryAuthorization", js.undefined)
    
    @scala.inline
    def setClusterIpv4Cidr(value: String): Self = this.set("clusterIpv4Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterIpv4Cidr: Self = this.set("clusterIpv4Cidr", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: StatusCondition*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[StatusCondition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
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
    def setDatabaseEncryption(value: DatabaseEncryption): Self = this.set("databaseEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseEncryption: Self = this.set("databaseEncryption", js.undefined)
    
    @scala.inline
    def setDefaultMaxPodsConstraint(value: MaxPodsConstraint): Self = this.set("defaultMaxPodsConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMaxPodsConstraint: Self = this.set("defaultMaxPodsConstraint", js.undefined)
    
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
    def setIpAllocationPolicy(value: IPAllocationPolicy): Self = this.set("ipAllocationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAllocationPolicy: Self = this.set("ipAllocationPolicy", js.undefined)
    
    @scala.inline
    def setLabelFingerprint(value: String): Self = this.set("labelFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFingerprint: Self = this.set("labelFingerprint", js.undefined)
    
    @scala.inline
    def setLegacyAbac(value: LegacyAbac): Self = this.set("legacyAbac", value.asInstanceOf[js.Any])
    
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
    def setMaintenancePolicy(value: MaintenancePolicy): Self = this.set("maintenancePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintenancePolicy: Self = this.set("maintenancePolicy", js.undefined)
    
    @scala.inline
    def setMasterAuth(value: MasterAuth): Self = this.set("masterAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterAuth: Self = this.set("masterAuth", js.undefined)
    
    @scala.inline
    def setMasterAuthorizedNetworksConfig(value: MasterAuthorizedNetworksConfig): Self = this.set("masterAuthorizedNetworksConfig", value.asInstanceOf[js.Any])
    
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
    def setNetworkConfig(value: NetworkConfig): Self = this.set("networkConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkConfig: Self = this.set("networkConfig", js.undefined)
    
    @scala.inline
    def setNetworkPolicy(value: NetworkPolicy): Self = this.set("networkPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkPolicy: Self = this.set("networkPolicy", js.undefined)
    
    @scala.inline
    def setNodeConfig(value: NodeConfig): Self = this.set("nodeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeConfig: Self = this.set("nodeConfig", js.undefined)
    
    @scala.inline
    def setNodeIpv4CidrSize(value: Double): Self = this.set("nodeIpv4CidrSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeIpv4CidrSize: Self = this.set("nodeIpv4CidrSize", js.undefined)
    
    @scala.inline
    def setNodePoolsVarargs(value: NodePool*): Self = this.set("nodePools", js.Array(value :_*))
    
    @scala.inline
    def setNodePools(value: js.Array[NodePool]): Self = this.set("nodePools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodePools: Self = this.set("nodePools", js.undefined)
    
    @scala.inline
    def setPrivateClusterConfig(value: PrivateClusterConfig): Self = this.set("privateClusterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateClusterConfig: Self = this.set("privateClusterConfig", js.undefined)
    
    @scala.inline
    def setReleaseChannel(value: ReleaseChannel): Self = this.set("releaseChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseChannel: Self = this.set("releaseChannel", js.undefined)
    
    @scala.inline
    def setResourceLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.Cluster with TopLevel[js.Any]
    ): Self = this.set("resourceLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceLabels: Self = this.set("resourceLabels", js.undefined)
    
    @scala.inline
    def setResourceUsageExportConfig(value: ResourceUsageExportConfig): Self = this.set("resourceUsageExportConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceUsageExportConfig: Self = this.set("resourceUsageExportConfig", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setServicesIpv4Cidr(value: String): Self = this.set("servicesIpv4Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicesIpv4Cidr: Self = this.set("servicesIpv4Cidr", js.undefined)
    
    @scala.inline
    def setShieldedNodes(value: ShieldedNodes): Self = this.set("shieldedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShieldedNodes: Self = this.set("shieldedNodes", js.undefined)
    
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
    def setVerticalPodAutoscaling(value: VerticalPodAutoscaling): Self = this.set("verticalPodAutoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalPodAutoscaling: Self = this.set("verticalPodAutoscaling", js.undefined)
    
    @scala.inline
    def setWorkloadIdentityConfig(value: WorkloadIdentityConfig): Self = this.set("workloadIdentityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkloadIdentityConfig: Self = this.set("workloadIdentityConfig", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
