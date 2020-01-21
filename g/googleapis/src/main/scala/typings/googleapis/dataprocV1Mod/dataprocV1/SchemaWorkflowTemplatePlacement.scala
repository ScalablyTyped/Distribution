package typings.googleapis.dataprocV1Mod.dataprocV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies workflow execution target.Either managed_cluster or
  * cluster_selector is required.
  */
@js.native
trait SchemaWorkflowTemplatePlacement extends js.Object {
  /**
    * Optional. A selector that chooses target cluster for jobs based on
    * metadata.The selector is evaluated at the time each job is submitted.
    */
  var clusterSelector: js.UndefOr[SchemaClusterSelector] = js.native
  /**
    * Optional. A cluster that is managed by the workflow.
    */
  var managedCluster: js.UndefOr[SchemaManagedCluster] = js.native
}

object SchemaWorkflowTemplatePlacement {
  @scala.inline
  def apply(clusterSelector: SchemaClusterSelector = null, managedCluster: SchemaManagedCluster = null): SchemaWorkflowTemplatePlacement = {
    val __obj = js.Dynamic.literal()
    if (clusterSelector != null) __obj.updateDynamic("clusterSelector")(clusterSelector.asInstanceOf[js.Any])
    if (managedCluster != null) __obj.updateDynamic("managedCluster")(managedCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWorkflowTemplatePlacement]
  }
}

