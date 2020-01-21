package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CreateNodePoolRequest creates a node pool for a cluster.
  */
@js.native
trait SchemaCreateNodePoolRequest extends js.Object {
  /**
    * Deprecated. The name of the cluster. This field has been deprecated and
    * replaced by the parent field.
    */
  var clusterId: js.UndefOr[String] = js.native
  /**
    * The node pool to create.
    */
  var nodePool: js.UndefOr[SchemaNodePool] = js.native
  /**
    * The parent (project, location, cluster id) where the node pool will be
    * created. Specified in the format
    * &#39;projects/x/locations/x/clusters/ *&#39;.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Deprecated. The Google Developers Console [project ID or project
    * number](https://developers.google.com/console/help/new/#projectnumber).
    * This field has been deprecated and replaced by the parent field.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Deprecated. The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides. This
    * field has been deprecated and replaced by the parent field.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaCreateNodePoolRequest {
  @scala.inline
  def apply(
    clusterId: String = null,
    nodePool: SchemaNodePool = null,
    parent: String = null,
    projectId: String = null,
    zone: String = null
  ): SchemaCreateNodePoolRequest = {
    val __obj = js.Dynamic.literal()
    if (clusterId != null) __obj.updateDynamic("clusterId")(clusterId.asInstanceOf[js.Any])
    if (nodePool != null) __obj.updateDynamic("nodePool")(nodePool.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateNodePoolRequest]
  }
}

