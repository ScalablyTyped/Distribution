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
  def apply(): SchemaWorkflowTemplatePlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkflowTemplatePlacement]
  }
  @scala.inline
  implicit class SchemaWorkflowTemplatePlacementOps[Self <: SchemaWorkflowTemplatePlacement] (val x: Self) extends AnyVal {
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
    def setClusterSelector(value: SchemaClusterSelector): Self = this.set("clusterSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterSelector: Self = this.set("clusterSelector", js.undefined)
    @scala.inline
    def setManagedCluster(value: SchemaManagedCluster): Self = this.set("managedCluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedCluster: Self = this.set("managedCluster", js.undefined)
  }
  
}

