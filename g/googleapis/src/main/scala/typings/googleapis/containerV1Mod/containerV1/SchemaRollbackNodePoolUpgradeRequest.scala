package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RollbackNodePoolUpgradeRequest rollbacks the previously Aborted or Failed
  * NodePool upgrade. This will be an no-op if the last upgrade successfully
  * completed.
  */
@js.native
trait SchemaRollbackNodePoolUpgradeRequest extends js.Object {
  /**
    * Deprecated. The name of the cluster to rollback. This field has been
    * deprecated and replaced by the name field.
    */
  var clusterId: js.UndefOr[String] = js.native
  /**
    * The name (project, location, cluster, node pool id) of the node poll to
    * rollback upgrade. Specified in the format
    * &#39;projects/x/locations/x/clusters/x/nodePools/ *&#39;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Deprecated. The name of the node pool to rollback. This field has been
    * deprecated and replaced by the name field.
    */
  var nodePoolId: js.UndefOr[String] = js.native
  /**
    * Deprecated. The Google Developers Console [project ID or project
    * number](https://support.google.com/cloud/answer/6158840). This field has
    * been deprecated and replaced by the name field.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Deprecated. The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides. This
    * field has been deprecated and replaced by the name field.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaRollbackNodePoolUpgradeRequest {
  @scala.inline
  def apply(
    clusterId: String = null,
    name: String = null,
    nodePoolId: String = null,
    projectId: String = null,
    zone: String = null
  ): SchemaRollbackNodePoolUpgradeRequest = {
    val __obj = js.Dynamic.literal()
    if (clusterId != null) __obj.updateDynamic("clusterId")(clusterId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nodePoolId != null) __obj.updateDynamic("nodePoolId")(nodePoolId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRollbackNodePoolUpgradeRequest]
  }
}

