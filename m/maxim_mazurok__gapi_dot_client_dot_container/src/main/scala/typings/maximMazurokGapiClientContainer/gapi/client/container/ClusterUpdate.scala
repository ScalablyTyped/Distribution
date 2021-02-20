package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterUpdate extends StObject {
  
  /** Configurations for the various addons available to run in the cluster. */
  var desiredAddonsConfig: js.UndefOr[AddonsConfig] = js.native
  
  /** The desired configuration options for the Binary Authorization feature. */
  var desiredBinaryAuthorization: js.UndefOr[BinaryAuthorization] = js.native
  
  /** Cluster-level autoscaling configuration. */
  var desiredClusterAutoscaling: js.UndefOr[ClusterAutoscaling] = js.native
  
  /** Configuration of etcd encryption. */
  var desiredDatabaseEncryption: js.UndefOr[DatabaseEncryption] = js.native
  
  /** The desired status of whether to disable default sNAT for this cluster. */
  var desiredDefaultSnatStatus: js.UndefOr[DefaultSnatStatus] = js.native
  
  /** The desired image type for the node pool. NOTE: Set the "desired_node_pool" field as well. */
  var desiredImageType: js.UndefOr[String] = js.native
  
  /** The desired config of Intra-node visibility. */
  var desiredIntraNodeVisibilityConfig: js.UndefOr[IntraNodeVisibilityConfig] = js.native
  
  /**
    * The desired list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the cluster's nodes should be located. This list must always
    * include the cluster's primary zone. Warning: changing cluster locations will update the locations of all node pools and will result in nodes being added and/or removed.
    */
  var desiredLocations: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The logging service the cluster should use to write logs. Currently available options: * `logging.googleapis.com/kubernetes` - The Cloud Logging service with a Kubernetes-native
    * resource model * `logging.googleapis.com` - The legacy Cloud Logging service (no longer available as of GKE 1.15). * `none` - no logs will be exported from the cluster. If left as
    * an empty string,`logging.googleapis.com/kubernetes` will be used for GKE 1.14+ or `logging.googleapis.com` for earlier versions.
    */
  var desiredLoggingService: js.UndefOr[String] = js.native
  
  /** The desired configuration options for master authorized networks feature. */
  var desiredMasterAuthorizedNetworksConfig: js.UndefOr[MasterAuthorizedNetworksConfig] = js.native
  
  /**
    * The Kubernetes version to change the master to. Users may specify either explicit versions offered by Kubernetes Engine or version aliases, which have the following behavior: -
    * "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N patch in the
    * 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the default Kubernetes version
    */
  var desiredMasterVersion: js.UndefOr[String] = js.native
  
  /**
    * The monitoring service the cluster should use to write metrics. Currently available options: * "monitoring.googleapis.com/kubernetes" - The Cloud Monitoring service with a
    * Kubernetes-native resource model * `monitoring.googleapis.com` - The legacy Cloud Monitoring service (no longer available as of GKE 1.15). * `none` - No metrics will be exported
    * from the cluster. If left as an empty string,`monitoring.googleapis.com/kubernetes` will be used for GKE 1.14+ or `monitoring.googleapis.com` for earlier versions.
    */
  var desiredMonitoringService: js.UndefOr[String] = js.native
  
  /**
    * Autoscaler configuration for the node pool specified in desired_node_pool_id. If there is only one pool in the cluster and desired_node_pool_id is not provided then the change
    * applies to that single node pool.
    */
  var desiredNodePoolAutoscaling: js.UndefOr[NodePoolAutoscaling] = js.native
  
  /**
    * The node pool to be upgraded. This field is mandatory if "desired_node_version", "desired_image_family" or "desired_node_pool_autoscaling" is specified and there is more than one
    * node pool on the cluster.
    */
  var desiredNodePoolId: js.UndefOr[String] = js.native
  
  /**
    * The Kubernetes version to change the nodes to (typically an upgrade). Users may specify either explicit versions offered by Kubernetes Engine or version aliases, which have the
    * following behavior: - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid
    * gke.N patch in the 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the Kubernetes master version
    */
  var desiredNodeVersion: js.UndefOr[String] = js.native
  
  /** The desired private cluster configuration. */
  var desiredPrivateClusterConfig: js.UndefOr[PrivateClusterConfig] = js.native
  
  /** The desired release channel configuration. */
  var desiredReleaseChannel: js.UndefOr[ReleaseChannel] = js.native
  
  /** The desired configuration for exporting resource usage. */
  var desiredResourceUsageExportConfig: js.UndefOr[ResourceUsageExportConfig] = js.native
  
  /** Configuration for Shielded Nodes. */
  var desiredShieldedNodes: js.UndefOr[ShieldedNodes] = js.native
  
  /** Cluster-level Vertical Pod Autoscaling configuration. */
  var desiredVerticalPodAutoscaling: js.UndefOr[VerticalPodAutoscaling] = js.native
  
  /** Configuration for Workload Identity. */
  var desiredWorkloadIdentityConfig: js.UndefOr[WorkloadIdentityConfig] = js.native
}
object ClusterUpdate {
  
  @scala.inline
  def apply(): ClusterUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterUpdate]
  }
  
  @scala.inline
  implicit class ClusterUpdateMutableBuilder[Self <: ClusterUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredAddonsConfig(value: AddonsConfig): Self = StObject.set(x, "desiredAddonsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredAddonsConfigUndefined: Self = StObject.set(x, "desiredAddonsConfig", js.undefined)
    
    @scala.inline
    def setDesiredBinaryAuthorization(value: BinaryAuthorization): Self = StObject.set(x, "desiredBinaryAuthorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredBinaryAuthorizationUndefined: Self = StObject.set(x, "desiredBinaryAuthorization", js.undefined)
    
    @scala.inline
    def setDesiredClusterAutoscaling(value: ClusterAutoscaling): Self = StObject.set(x, "desiredClusterAutoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredClusterAutoscalingUndefined: Self = StObject.set(x, "desiredClusterAutoscaling", js.undefined)
    
    @scala.inline
    def setDesiredDatabaseEncryption(value: DatabaseEncryption): Self = StObject.set(x, "desiredDatabaseEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredDatabaseEncryptionUndefined: Self = StObject.set(x, "desiredDatabaseEncryption", js.undefined)
    
    @scala.inline
    def setDesiredDefaultSnatStatus(value: DefaultSnatStatus): Self = StObject.set(x, "desiredDefaultSnatStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredDefaultSnatStatusUndefined: Self = StObject.set(x, "desiredDefaultSnatStatus", js.undefined)
    
    @scala.inline
    def setDesiredImageType(value: String): Self = StObject.set(x, "desiredImageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredImageTypeUndefined: Self = StObject.set(x, "desiredImageType", js.undefined)
    
    @scala.inline
    def setDesiredIntraNodeVisibilityConfig(value: IntraNodeVisibilityConfig): Self = StObject.set(x, "desiredIntraNodeVisibilityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredIntraNodeVisibilityConfigUndefined: Self = StObject.set(x, "desiredIntraNodeVisibilityConfig", js.undefined)
    
    @scala.inline
    def setDesiredLocations(value: js.Array[String]): Self = StObject.set(x, "desiredLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredLocationsUndefined: Self = StObject.set(x, "desiredLocations", js.undefined)
    
    @scala.inline
    def setDesiredLocationsVarargs(value: String*): Self = StObject.set(x, "desiredLocations", js.Array(value :_*))
    
    @scala.inline
    def setDesiredLoggingService(value: String): Self = StObject.set(x, "desiredLoggingService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredLoggingServiceUndefined: Self = StObject.set(x, "desiredLoggingService", js.undefined)
    
    @scala.inline
    def setDesiredMasterAuthorizedNetworksConfig(value: MasterAuthorizedNetworksConfig): Self = StObject.set(x, "desiredMasterAuthorizedNetworksConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredMasterAuthorizedNetworksConfigUndefined: Self = StObject.set(x, "desiredMasterAuthorizedNetworksConfig", js.undefined)
    
    @scala.inline
    def setDesiredMasterVersion(value: String): Self = StObject.set(x, "desiredMasterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredMasterVersionUndefined: Self = StObject.set(x, "desiredMasterVersion", js.undefined)
    
    @scala.inline
    def setDesiredMonitoringService(value: String): Self = StObject.set(x, "desiredMonitoringService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredMonitoringServiceUndefined: Self = StObject.set(x, "desiredMonitoringService", js.undefined)
    
    @scala.inline
    def setDesiredNodePoolAutoscaling(value: NodePoolAutoscaling): Self = StObject.set(x, "desiredNodePoolAutoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredNodePoolAutoscalingUndefined: Self = StObject.set(x, "desiredNodePoolAutoscaling", js.undefined)
    
    @scala.inline
    def setDesiredNodePoolId(value: String): Self = StObject.set(x, "desiredNodePoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredNodePoolIdUndefined: Self = StObject.set(x, "desiredNodePoolId", js.undefined)
    
    @scala.inline
    def setDesiredNodeVersion(value: String): Self = StObject.set(x, "desiredNodeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredNodeVersionUndefined: Self = StObject.set(x, "desiredNodeVersion", js.undefined)
    
    @scala.inline
    def setDesiredPrivateClusterConfig(value: PrivateClusterConfig): Self = StObject.set(x, "desiredPrivateClusterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredPrivateClusterConfigUndefined: Self = StObject.set(x, "desiredPrivateClusterConfig", js.undefined)
    
    @scala.inline
    def setDesiredReleaseChannel(value: ReleaseChannel): Self = StObject.set(x, "desiredReleaseChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredReleaseChannelUndefined: Self = StObject.set(x, "desiredReleaseChannel", js.undefined)
    
    @scala.inline
    def setDesiredResourceUsageExportConfig(value: ResourceUsageExportConfig): Self = StObject.set(x, "desiredResourceUsageExportConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredResourceUsageExportConfigUndefined: Self = StObject.set(x, "desiredResourceUsageExportConfig", js.undefined)
    
    @scala.inline
    def setDesiredShieldedNodes(value: ShieldedNodes): Self = StObject.set(x, "desiredShieldedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredShieldedNodesUndefined: Self = StObject.set(x, "desiredShieldedNodes", js.undefined)
    
    @scala.inline
    def setDesiredVerticalPodAutoscaling(value: VerticalPodAutoscaling): Self = StObject.set(x, "desiredVerticalPodAutoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredVerticalPodAutoscalingUndefined: Self = StObject.set(x, "desiredVerticalPodAutoscaling", js.undefined)
    
    @scala.inline
    def setDesiredWorkloadIdentityConfig(value: WorkloadIdentityConfig): Self = StObject.set(x, "desiredWorkloadIdentityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredWorkloadIdentityConfigUndefined: Self = StObject.set(x, "desiredWorkloadIdentityConfig", js.undefined)
  }
}
