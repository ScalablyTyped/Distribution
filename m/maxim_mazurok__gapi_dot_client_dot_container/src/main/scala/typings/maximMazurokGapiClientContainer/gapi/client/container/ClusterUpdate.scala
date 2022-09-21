package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterUpdate extends StObject {
  
  /** Configurations for the various addons available to run in the cluster. */
  var desiredAddonsConfig: js.UndefOr[AddonsConfig] = js.undefined
  
  /** The desired authenticator groups config for the cluster. */
  var desiredAuthenticatorGroupsConfig: js.UndefOr[AuthenticatorGroupsConfig] = js.undefined
  
  /** The desired configuration options for the Binary Authorization feature. */
  var desiredBinaryAuthorization: js.UndefOr[BinaryAuthorization] = js.undefined
  
  /** Cluster-level autoscaling configuration. */
  var desiredClusterAutoscaling: js.UndefOr[ClusterAutoscaling] = js.undefined
  
  /** Configuration of etcd encryption. */
  var desiredDatabaseEncryption: js.UndefOr[DatabaseEncryption] = js.undefined
  
  /** The desired datapath provider for the cluster. */
  var desiredDatapathProvider: js.UndefOr[String] = js.undefined
  
  /** The desired status of whether to disable default sNAT for this cluster. */
  var desiredDefaultSnatStatus: js.UndefOr[DefaultSnatStatus] = js.undefined
  
  /** DNSConfig contains clusterDNS config for this cluster. */
  var desiredDnsConfig: js.UndefOr[DNSConfig] = js.undefined
  
  /** The desired GCFS config for the cluster */
  var desiredGcfsConfig: js.UndefOr[GcfsConfig] = js.undefined
  
  /** The desired Identity Service component configuration. */
  var desiredIdentityServiceConfig: js.UndefOr[IdentityServiceConfig] = js.undefined
  
  /** The desired image type for the node pool. NOTE: Set the "desired_node_pool" field as well. */
  var desiredImageType: js.UndefOr[String] = js.undefined
  
  /** The desired config of Intra-node visibility. */
  var desiredIntraNodeVisibilityConfig: js.UndefOr[IntraNodeVisibilityConfig] = js.undefined
  
  /** The desired L4 Internal Load Balancer Subsetting configuration. */
  var desiredL4ilbSubsettingConfig: js.UndefOr[ILBSubsettingConfig] = js.undefined
  
  /**
    * The desired list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the cluster's nodes should be located. This list must always
    * include the cluster's primary zone. Warning: changing cluster locations will update the locations of all node pools and will result in nodes being added and/or removed.
    */
  var desiredLocations: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The desired logging configuration. */
  var desiredLoggingConfig: js.UndefOr[LoggingConfig] = js.undefined
  
  /**
    * The logging service the cluster should use to write logs. Currently available options: * `logging.googleapis.com/kubernetes` - The Cloud Logging service with a Kubernetes-native
    * resource model * `logging.googleapis.com` - The legacy Cloud Logging service (no longer available as of GKE 1.15). * `none` - no logs will be exported from the cluster. If left as
    * an empty string,`logging.googleapis.com/kubernetes` will be used for GKE 1.14+ or `logging.googleapis.com` for earlier versions.
    */
  var desiredLoggingService: js.UndefOr[String] = js.undefined
  
  /** The desired configuration options for master authorized networks feature. */
  var desiredMasterAuthorizedNetworksConfig: js.UndefOr[MasterAuthorizedNetworksConfig] = js.undefined
  
  /**
    * The Kubernetes version to change the master to. Users may specify either explicit versions offered by Kubernetes Engine or version aliases, which have the following behavior: -
    * "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N patch in the
    * 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the default Kubernetes version
    */
  var desiredMasterVersion: js.UndefOr[String] = js.undefined
  
  /** Configuration for issuance of mTLS keys and certificates to Kubernetes pods. */
  var desiredMeshCertificates: js.UndefOr[MeshCertificates] = js.undefined
  
  /** The desired monitoring configuration. */
  var desiredMonitoringConfig: js.UndefOr[MonitoringConfig] = js.undefined
  
  /**
    * The monitoring service the cluster should use to write metrics. Currently available options: * "monitoring.googleapis.com/kubernetes" - The Cloud Monitoring service with a
    * Kubernetes-native resource model * `monitoring.googleapis.com` - The legacy Cloud Monitoring service (no longer available as of GKE 1.15). * `none` - No metrics will be exported
    * from the cluster. If left as an empty string,`monitoring.googleapis.com/kubernetes` will be used for GKE 1.14+ or `monitoring.googleapis.com` for earlier versions.
    */
  var desiredMonitoringService: js.UndefOr[String] = js.undefined
  
  /** The desired network tags that apply to all auto-provisioned node pools in autopilot clusters and node auto-provisioning enabled clusters. */
  var desiredNodePoolAutoConfigNetworkTags: js.UndefOr[NetworkTags] = js.undefined
  
  /**
    * Autoscaler configuration for the node pool specified in desired_node_pool_id. If there is only one pool in the cluster and desired_node_pool_id is not provided then the change
    * applies to that single node pool.
    */
  var desiredNodePoolAutoscaling: js.UndefOr[NodePoolAutoscaling] = js.undefined
  
  /**
    * The node pool to be upgraded. This field is mandatory if "desired_node_version", "desired_image_family" or "desired_node_pool_autoscaling" is specified and there is more than one
    * node pool on the cluster.
    */
  var desiredNodePoolId: js.UndefOr[String] = js.undefined
  
  /**
    * The Kubernetes version to change the nodes to (typically an upgrade). Users may specify either explicit versions offered by Kubernetes Engine or version aliases, which have the
    * following behavior: - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid
    * gke.N patch in the 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the Kubernetes master version
    */
  var desiredNodeVersion: js.UndefOr[String] = js.undefined
  
  /** The desired notification configuration. */
  var desiredNotificationConfig: js.UndefOr[NotificationConfig] = js.undefined
  
  /** The desired private cluster configuration. */
  var desiredPrivateClusterConfig: js.UndefOr[PrivateClusterConfig] = js.undefined
  
  /** The desired state of IPv6 connectivity to Google Services. */
  var desiredPrivateIpv6GoogleAccess: js.UndefOr[String] = js.undefined
  
  /** The desired release channel configuration. */
  var desiredReleaseChannel: js.UndefOr[ReleaseChannel] = js.undefined
  
  /** The desired configuration for exporting resource usage. */
  var desiredResourceUsageExportConfig: js.UndefOr[ResourceUsageExportConfig] = js.undefined
  
  /** ServiceExternalIPsConfig specifies the config for the use of Services with ExternalIPs field. */
  var desiredServiceExternalIpsConfig: js.UndefOr[ServiceExternalIPsConfig] = js.undefined
  
  /** Configuration for Shielded Nodes. */
  var desiredShieldedNodes: js.UndefOr[ShieldedNodes] = js.undefined
  
  /** Cluster-level Vertical Pod Autoscaling configuration. */
  var desiredVerticalPodAutoscaling: js.UndefOr[VerticalPodAutoscaling] = js.undefined
  
  /** Configuration for Workload Identity. */
  var desiredWorkloadIdentityConfig: js.UndefOr[WorkloadIdentityConfig] = js.undefined
}
object ClusterUpdate {
  
  inline def apply(): ClusterUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterUpdate]
  }
  
  extension [Self <: ClusterUpdate](x: Self) {
    
    inline def setDesiredAddonsConfig(value: AddonsConfig): Self = StObject.set(x, "desiredAddonsConfig", value.asInstanceOf[js.Any])
    
    inline def setDesiredAddonsConfigUndefined: Self = StObject.set(x, "desiredAddonsConfig", js.undefined)
    
    inline def setDesiredAuthenticatorGroupsConfig(value: AuthenticatorGroupsConfig): Self = StObject.set(x, "desiredAuthenticatorGroupsConfig", value.asInstanceOf[js.Any])
    
    inline def setDesiredAuthenticatorGroupsConfigUndefined: Self = StObject.set(x, "desiredAuthenticatorGroupsConfig", js.undefined)
    
    inline def setDesiredBinaryAuthorization(value: BinaryAuthorization): Self = StObject.set(x, "desiredBinaryAuthorization", value.asInstanceOf[js.Any])
    
    inline def setDesiredBinaryAuthorizationUndefined: Self = StObject.set(x, "desiredBinaryAuthorization", js.undefined)
    
    inline def setDesiredClusterAutoscaling(value: ClusterAutoscaling): Self = StObject.set(x, "desiredClusterAutoscaling", value.asInstanceOf[js.Any])
    
    inline def setDesiredClusterAutoscalingUndefined: Self = StObject.set(x, "desiredClusterAutoscaling", js.undefined)
    
    inline def setDesiredDatabaseEncryption(value: DatabaseEncryption): Self = StObject.set(x, "desiredDatabaseEncryption", value.asInstanceOf[js.Any])
    
    inline def setDesiredDatabaseEncryptionUndefined: Self = StObject.set(x, "desiredDatabaseEncryption", js.undefined)
    
    inline def setDesiredDatapathProvider(value: String): Self = StObject.set(x, "desiredDatapathProvider", value.asInstanceOf[js.Any])
    
    inline def setDesiredDatapathProviderUndefined: Self = StObject.set(x, "desiredDatapathProvider", js.undefined)
    
    inline def setDesiredDefaultSnatStatus(value: DefaultSnatStatus): Self = StObject.set(x, "desiredDefaultSnatStatus", value.asInstanceOf[js.Any])
    
    inline def setDesiredDefaultSnatStatusUndefined: Self = StObject.set(x, "desiredDefaultSnatStatus", js.undefined)
    
    inline def setDesiredDnsConfig(value: DNSConfig): Self = StObject.set(x, "desiredDnsConfig", value.asInstanceOf[js.Any])
    
    inline def setDesiredDnsConfigUndefined: Self = StObject.set(x, "desiredDnsConfig", js.undefined)
    
    inline def setDesiredGcfsConfig(value: GcfsConfig): Self = StObject.set(x, "desiredGcfsConfig", value.asInstanceOf[js.Any])
    
    inline def setDesiredGcfsConfigUndefined: Self = StObject.set(x, "desiredGcfsConfig", js.undefined)
    
    inline def setDesiredIdentityServiceConfig(value: IdentityServiceConfig): Self = StObject.set(x, "desiredIdentityServiceConfig", value.asInstanceOf[js.Any])
    
    inline def setDesiredIdentityServiceConfigUndefined: Self = StObject.set(x, "desiredIdentityServiceConfig", js.undefined)
    
    inline def setDesiredImageType(value: String): Self = StObject.set(x, "desiredImageType", value.asInstanceOf[js.Any])
    
    inline def setDesiredImageTypeUndefined: Self = StObject.set(x, "desiredImageType", js.undefined)
    
    inline def setDesiredIntraNodeVisibilityConfig(value: IntraNodeVisibilityConfig): Self = StObject.set(x, "desiredIntraNodeVisibilityConfig", value.asInstanceOf[js.Any])
    
    inline def setDesiredIntraNodeVisibilityConfigUndefined: Self = StObject.set(x, "desiredIntraNodeVisibilityConfig", js.undefined)
    
    inline def setDesiredL4ilbSubsettingConfig(value: ILBSubsettingConfig): Self = StObject.set(x, "desiredL4ilbSubsettingConfig", value.asInstanceOf[js.Any])
    
    inline def setDesiredL4ilbSubsettingConfigUndefined: Self = StObject.set(x, "desiredL4ilbSubsettingConfig", js.undefined)
    
    inline def setDesiredLocations(value: js.Array[String]): Self = StObject.set(x, "desiredLocations", value.asInstanceOf[js.Any])
    
    inline def setDesiredLocationsUndefined: Self = StObject.set(x, "desiredLocations", js.undefined)
    
    inline def setDesiredLocationsVarargs(value: String*): Self = StObject.set(x, "desiredLocations", js.Array(value*))
    
    inline def setDesiredLoggingConfig(value: LoggingConfig): Self = StObject.set(x, "desiredLoggingConfig", value.asInstanceOf[js.Any])
    
    inline def setDesiredLoggingConfigUndefined: Self = StObject.set(x, "desiredLoggingConfig", js.undefined)
    
    inline def setDesiredLoggingService(value: String): Self = StObject.set(x, "desiredLoggingService", value.asInstanceOf[js.Any])
    
    inline def setDesiredLoggingServiceUndefined: Self = StObject.set(x, "desiredLoggingService", js.undefined)
    
    inline def setDesiredMasterAuthorizedNetworksConfig(value: MasterAuthorizedNetworksConfig): Self = StObject.set(x, "desiredMasterAuthorizedNetworksConfig", value.asInstanceOf[js.Any])
    
    inline def setDesiredMasterAuthorizedNetworksConfigUndefined: Self = StObject.set(x, "desiredMasterAuthorizedNetworksConfig", js.undefined)
    
    inline def setDesiredMasterVersion(value: String): Self = StObject.set(x, "desiredMasterVersion", value.asInstanceOf[js.Any])
    
    inline def setDesiredMasterVersionUndefined: Self = StObject.set(x, "desiredMasterVersion", js.undefined)
    
    inline def setDesiredMeshCertificates(value: MeshCertificates): Self = StObject.set(x, "desiredMeshCertificates", value.asInstanceOf[js.Any])
    
    inline def setDesiredMeshCertificatesUndefined: Self = StObject.set(x, "desiredMeshCertificates", js.undefined)
    
    inline def setDesiredMonitoringConfig(value: MonitoringConfig): Self = StObject.set(x, "desiredMonitoringConfig", value.asInstanceOf[js.Any])
    
    inline def setDesiredMonitoringConfigUndefined: Self = StObject.set(x, "desiredMonitoringConfig", js.undefined)
    
    inline def setDesiredMonitoringService(value: String): Self = StObject.set(x, "desiredMonitoringService", value.asInstanceOf[js.Any])
    
    inline def setDesiredMonitoringServiceUndefined: Self = StObject.set(x, "desiredMonitoringService", js.undefined)
    
    inline def setDesiredNodePoolAutoConfigNetworkTags(value: NetworkTags): Self = StObject.set(x, "desiredNodePoolAutoConfigNetworkTags", value.asInstanceOf[js.Any])
    
    inline def setDesiredNodePoolAutoConfigNetworkTagsUndefined: Self = StObject.set(x, "desiredNodePoolAutoConfigNetworkTags", js.undefined)
    
    inline def setDesiredNodePoolAutoscaling(value: NodePoolAutoscaling): Self = StObject.set(x, "desiredNodePoolAutoscaling", value.asInstanceOf[js.Any])
    
    inline def setDesiredNodePoolAutoscalingUndefined: Self = StObject.set(x, "desiredNodePoolAutoscaling", js.undefined)
    
    inline def setDesiredNodePoolId(value: String): Self = StObject.set(x, "desiredNodePoolId", value.asInstanceOf[js.Any])
    
    inline def setDesiredNodePoolIdUndefined: Self = StObject.set(x, "desiredNodePoolId", js.undefined)
    
    inline def setDesiredNodeVersion(value: String): Self = StObject.set(x, "desiredNodeVersion", value.asInstanceOf[js.Any])
    
    inline def setDesiredNodeVersionUndefined: Self = StObject.set(x, "desiredNodeVersion", js.undefined)
    
    inline def setDesiredNotificationConfig(value: NotificationConfig): Self = StObject.set(x, "desiredNotificationConfig", value.asInstanceOf[js.Any])
    
    inline def setDesiredNotificationConfigUndefined: Self = StObject.set(x, "desiredNotificationConfig", js.undefined)
    
    inline def setDesiredPrivateClusterConfig(value: PrivateClusterConfig): Self = StObject.set(x, "desiredPrivateClusterConfig", value.asInstanceOf[js.Any])
    
    inline def setDesiredPrivateClusterConfigUndefined: Self = StObject.set(x, "desiredPrivateClusterConfig", js.undefined)
    
    inline def setDesiredPrivateIpv6GoogleAccess(value: String): Self = StObject.set(x, "desiredPrivateIpv6GoogleAccess", value.asInstanceOf[js.Any])
    
    inline def setDesiredPrivateIpv6GoogleAccessUndefined: Self = StObject.set(x, "desiredPrivateIpv6GoogleAccess", js.undefined)
    
    inline def setDesiredReleaseChannel(value: ReleaseChannel): Self = StObject.set(x, "desiredReleaseChannel", value.asInstanceOf[js.Any])
    
    inline def setDesiredReleaseChannelUndefined: Self = StObject.set(x, "desiredReleaseChannel", js.undefined)
    
    inline def setDesiredResourceUsageExportConfig(value: ResourceUsageExportConfig): Self = StObject.set(x, "desiredResourceUsageExportConfig", value.asInstanceOf[js.Any])
    
    inline def setDesiredResourceUsageExportConfigUndefined: Self = StObject.set(x, "desiredResourceUsageExportConfig", js.undefined)
    
    inline def setDesiredServiceExternalIpsConfig(value: ServiceExternalIPsConfig): Self = StObject.set(x, "desiredServiceExternalIpsConfig", value.asInstanceOf[js.Any])
    
    inline def setDesiredServiceExternalIpsConfigUndefined: Self = StObject.set(x, "desiredServiceExternalIpsConfig", js.undefined)
    
    inline def setDesiredShieldedNodes(value: ShieldedNodes): Self = StObject.set(x, "desiredShieldedNodes", value.asInstanceOf[js.Any])
    
    inline def setDesiredShieldedNodesUndefined: Self = StObject.set(x, "desiredShieldedNodes", js.undefined)
    
    inline def setDesiredVerticalPodAutoscaling(value: VerticalPodAutoscaling): Self = StObject.set(x, "desiredVerticalPodAutoscaling", value.asInstanceOf[js.Any])
    
    inline def setDesiredVerticalPodAutoscalingUndefined: Self = StObject.set(x, "desiredVerticalPodAutoscaling", js.undefined)
    
    inline def setDesiredWorkloadIdentityConfig(value: WorkloadIdentityConfig): Self = StObject.set(x, "desiredWorkloadIdentityConfig", value.asInstanceOf[js.Any])
    
    inline def setDesiredWorkloadIdentityConfigUndefined: Self = StObject.set(x, "desiredWorkloadIdentityConfig", js.undefined)
  }
}
