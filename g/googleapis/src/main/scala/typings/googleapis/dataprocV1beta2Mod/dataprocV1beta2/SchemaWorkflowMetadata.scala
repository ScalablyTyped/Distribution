package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Dataproc workflow template resource.
  */
@js.native
trait SchemaWorkflowMetadata extends js.Object {
  /**
    * Output only. The name of the target cluster.
    */
  var clusterName: js.UndefOr[String] = js.native
  /**
    * Output only. The UUID of target cluster.
    */
  var clusterUuid: js.UndefOr[String] = js.native
  /**
    * Output only. The create cluster operation metadata.
    */
  var createCluster: js.UndefOr[SchemaClusterOperation] = js.native
  /**
    * Output only. The delete cluster operation metadata.
    */
  var deleteCluster: js.UndefOr[SchemaClusterOperation] = js.native
  /**
    * Output only. Workflow end time.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Output only. The workflow graph.
    */
  var graph: js.UndefOr[SchemaWorkflowGraph] = js.native
  /**
    * Map from parameter names to values that were used for those parameters.
    */
  var parameters: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Output only. Workflow start time.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Output only. The workflow state.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. The &quot;resource name&quot; of the template.
    */
  var template: js.UndefOr[String] = js.native
  /**
    * Output only. The version of template at the time of workflow
    * instantiation.
    */
  var version: js.UndefOr[Double] = js.native
}

object SchemaWorkflowMetadata {
  @scala.inline
  def apply(): SchemaWorkflowMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkflowMetadata]
  }
  @scala.inline
  implicit class SchemaWorkflowMetadataOps[Self <: SchemaWorkflowMetadata] (val x: Self) extends AnyVal {
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
    def setClusterName(value: String): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterName: Self = this.set("clusterName", js.undefined)
    @scala.inline
    def setClusterUuid(value: String): Self = this.set("clusterUuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterUuid: Self = this.set("clusterUuid", js.undefined)
    @scala.inline
    def setCreateCluster(value: SchemaClusterOperation): Self = this.set("createCluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateCluster: Self = this.set("createCluster", js.undefined)
    @scala.inline
    def setDeleteCluster(value: SchemaClusterOperation): Self = this.set("deleteCluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteCluster: Self = this.set("deleteCluster", js.undefined)
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setGraph(value: SchemaWorkflowGraph): Self = this.set("graph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraph: Self = this.set("graph", js.undefined)
    @scala.inline
    def setParameters(value: StringDictionary[String]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

