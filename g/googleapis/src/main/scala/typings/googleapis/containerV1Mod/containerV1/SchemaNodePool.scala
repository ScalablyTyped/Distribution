package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodePool contains the name and configuration for a cluster&#39;s node pool.
  * Node pools are a set of nodes (i.e. VM&#39;s), with a common configuration
  * and specification, under the control of the cluster master. They may have a
  * set of Kubernetes labels applied to them, which may be used to reference
  * them during pod scheduling. They may also be resized up or down, to
  * accommodate the workload.
  */
@js.native
trait SchemaNodePool extends js.Object {
  /**
    * Autoscaler configuration for this NodePool. Autoscaler is enabled only if
    * a valid configuration is present.
    */
  var autoscaling: js.UndefOr[SchemaNodePoolAutoscaling] = js.native
  /**
    * Which conditions caused the current node pool state.
    */
  var conditions: js.UndefOr[js.Array[SchemaStatusCondition]] = js.native
  /**
    * The node configuration of the pool.
    */
  var config: js.UndefOr[SchemaNodeConfig] = js.native
  /**
    * The initial node count for the pool. You must ensure that your Compute
    * Engine &lt;a href=&quot;/compute/docs/resource-quotas&quot;&gt;resource
    * quota&lt;/a&gt; is sufficient for this number of instances. You must also
    * have available firewall and routes quota.
    */
  var initialNodeCount: js.UndefOr[Double] = js.native
  /**
    * [Output only] The resource URLs of the [managed instance
    * groups](/compute/docs/instance-groups/creating-groups-of-managed-instances)
    * associated with this node pool.
    */
  var instanceGroupUrls: js.UndefOr[js.Array[String]] = js.native
  /**
    * NodeManagement configuration for this NodePool.
    */
  var management: js.UndefOr[SchemaNodeManagement] = js.native
  /**
    * The name of the node pool.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output only] The status of the nodes in this pool instance.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * [Output only] Additional information about the current status of this
    * node pool instance, if available.
    */
  var statusMessage: js.UndefOr[String] = js.native
  /**
    * The version of the Kubernetes of this node.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaNodePool {
  @scala.inline
  def apply(
    autoscaling: SchemaNodePoolAutoscaling = null,
    conditions: js.Array[SchemaStatusCondition] = null,
    config: SchemaNodeConfig = null,
    initialNodeCount: Int | Double = null,
    instanceGroupUrls: js.Array[String] = null,
    management: SchemaNodeManagement = null,
    name: String = null,
    selfLink: String = null,
    status: String = null,
    statusMessage: String = null,
    version: String = null
  ): SchemaNodePool = {
    val __obj = js.Dynamic.literal()
    if (autoscaling != null) __obj.updateDynamic("autoscaling")(autoscaling.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (initialNodeCount != null) __obj.updateDynamic("initialNodeCount")(initialNodeCount.asInstanceOf[js.Any])
    if (instanceGroupUrls != null) __obj.updateDynamic("instanceGroupUrls")(instanceGroupUrls.asInstanceOf[js.Any])
    if (management != null) __obj.updateDynamic("management")(management.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNodePool]
  }
}

