package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ClusterUpdate describes an update to the cluster. Exactly one update can be
  * applied to a cluster with each request, so at most one field can be
  * provided.
  */
@js.native
trait SchemaClusterUpdate extends js.Object {
  /**
    * Configurations for the various addons available to run in the cluster.
    */
  var desiredAddonsConfig: js.UndefOr[SchemaAddonsConfig] = js.native
  /**
    * The desired image type for the node pool. NOTE: Set the
    * &quot;desired_node_pool&quot; field as well.
    */
  var desiredImageType: js.UndefOr[String] = js.native
  /**
    * The desired list of Google Compute Engine
    * [zones](/compute/docs/zones#available) in which the cluster&#39;s nodes
    * should be located. Changing the locations a cluster is in will result in
    * nodes being either created or removed from the cluster, depending on
    * whether locations are being added or removed.  This list must always
    * include the cluster&#39;s primary zone.
    */
  var desiredLocations: js.UndefOr[js.Array[String]] = js.native
  /**
    * The desired configuration options for master authorized networks feature.
    */
  var desiredMasterAuthorizedNetworksConfig: js.UndefOr[SchemaMasterAuthorizedNetworksConfig] = js.native
  /**
    * The Kubernetes version to change the master to.  Users may specify either
    * explicit versions offered by Kubernetes Engine or version aliases, which
    * have the following behavior:  - &quot;latest&quot;: picks the highest
    * valid Kubernetes version - &quot;1.X&quot;: picks the highest valid
    * patch+gke.N patch in the 1.X version - &quot;1.X.Y&quot;: picks the
    * highest valid gke.N patch in the 1.X.Y version - &quot;1.X.Y-gke.N&quot;:
    * picks an explicit Kubernetes version - &quot;-&quot;: picks the default
    * Kubernetes version
    */
  var desiredMasterVersion: js.UndefOr[String] = js.native
  /**
    * The monitoring service the cluster should use to write metrics. Currently
    * available options:  * &quot;monitoring.googleapis.com&quot; - the Google
    * Cloud Monitoring service * &quot;none&quot; - no metrics will be exported
    * from the cluster
    */
  var desiredMonitoringService: js.UndefOr[String] = js.native
  /**
    * Autoscaler configuration for the node pool specified in
    * desired_node_pool_id. If there is only one pool in the cluster and
    * desired_node_pool_id is not provided then the change applies to that
    * single node pool.
    */
  var desiredNodePoolAutoscaling: js.UndefOr[SchemaNodePoolAutoscaling] = js.native
  /**
    * The node pool to be upgraded. This field is mandatory if
    * &quot;desired_node_version&quot;, &quot;desired_image_family&quot; or
    * &quot;desired_node_pool_autoscaling&quot; is specified and there is more
    * than one node pool on the cluster.
    */
  var desiredNodePoolId: js.UndefOr[String] = js.native
  /**
    * The Kubernetes version to change the nodes to (typically an upgrade).
    * Users may specify either explicit versions offered by Kubernetes Engine
    * or version aliases, which have the following behavior:  -
    * &quot;latest&quot;: picks the highest valid Kubernetes version -
    * &quot;1.X&quot;: picks the highest valid patch+gke.N patch in the 1.X
    * version - &quot;1.X.Y&quot;: picks the highest valid gke.N patch in
    * the 1.X.Y version - &quot;1.X.Y-gke.N&quot;: picks an explicit Kubernetes
    * version - &quot;-&quot;: picks the Kubernetes master version
    */
  var desiredNodeVersion: js.UndefOr[String] = js.native
}

object SchemaClusterUpdate {
  @scala.inline
  def apply(): SchemaClusterUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterUpdate]
  }
  @scala.inline
  implicit class SchemaClusterUpdateOps[Self <: SchemaClusterUpdate] (val x: Self) extends AnyVal {
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
    def setDesiredAddonsConfig(value: SchemaAddonsConfig): Self = this.set("desiredAddonsConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredAddonsConfig: Self = this.set("desiredAddonsConfig", js.undefined)
    @scala.inline
    def setDesiredImageType(value: String): Self = this.set("desiredImageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredImageType: Self = this.set("desiredImageType", js.undefined)
    @scala.inline
    def setDesiredLocationsVarargs(value: String*): Self = this.set("desiredLocations", js.Array(value :_*))
    @scala.inline
    def setDesiredLocations(value: js.Array[String]): Self = this.set("desiredLocations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredLocations: Self = this.set("desiredLocations", js.undefined)
    @scala.inline
    def setDesiredMasterAuthorizedNetworksConfig(value: SchemaMasterAuthorizedNetworksConfig): Self = this.set("desiredMasterAuthorizedNetworksConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredMasterAuthorizedNetworksConfig: Self = this.set("desiredMasterAuthorizedNetworksConfig", js.undefined)
    @scala.inline
    def setDesiredMasterVersion(value: String): Self = this.set("desiredMasterVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredMasterVersion: Self = this.set("desiredMasterVersion", js.undefined)
    @scala.inline
    def setDesiredMonitoringService(value: String): Self = this.set("desiredMonitoringService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredMonitoringService: Self = this.set("desiredMonitoringService", js.undefined)
    @scala.inline
    def setDesiredNodePoolAutoscaling(value: SchemaNodePoolAutoscaling): Self = this.set("desiredNodePoolAutoscaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredNodePoolAutoscaling: Self = this.set("desiredNodePoolAutoscaling", js.undefined)
    @scala.inline
    def setDesiredNodePoolId(value: String): Self = this.set("desiredNodePoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredNodePoolId: Self = this.set("desiredNodePoolId", js.undefined)
    @scala.inline
    def setDesiredNodeVersion(value: String): Self = this.set("desiredNodeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredNodeVersion: Self = this.set("desiredNodeVersion", js.undefined)
  }
  
}

