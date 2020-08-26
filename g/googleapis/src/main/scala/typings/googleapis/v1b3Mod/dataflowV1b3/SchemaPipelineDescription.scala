package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A descriptive representation of submitted pipeline as well as the executed
  * form.  This data is provided by the Dataflow service for ease of
  * visualizing the pipeline and interpreting Dataflow provided metrics.
  */
@js.native
trait SchemaPipelineDescription extends js.Object {
  /**
    * Pipeline level display data.
    */
  var displayData: js.UndefOr[js.Array[SchemaDisplayData]] = js.native
  /**
    * Description of each stage of execution of the pipeline.
    */
  var executionPipelineStage: js.UndefOr[js.Array[SchemaExecutionStageSummary]] = js.native
  /**
    * Description of each transform in the pipeline and collections between
    * them.
    */
  var originalPipelineTransform: js.UndefOr[js.Array[SchemaTransformSummary]] = js.native
}

object SchemaPipelineDescription {
  @scala.inline
  def apply(): SchemaPipelineDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPipelineDescription]
  }
  @scala.inline
  implicit class SchemaPipelineDescriptionOps[Self <: SchemaPipelineDescription] (val x: Self) extends AnyVal {
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
    def setDisplayDataVarargs(value: SchemaDisplayData*): Self = this.set("displayData", js.Array(value :_*))
    @scala.inline
    def setDisplayData(value: js.Array[SchemaDisplayData]): Self = this.set("displayData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayData: Self = this.set("displayData", js.undefined)
    @scala.inline
    def setExecutionPipelineStageVarargs(value: SchemaExecutionStageSummary*): Self = this.set("executionPipelineStage", js.Array(value :_*))
    @scala.inline
    def setExecutionPipelineStage(value: js.Array[SchemaExecutionStageSummary]): Self = this.set("executionPipelineStage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionPipelineStage: Self = this.set("executionPipelineStage", js.undefined)
    @scala.inline
    def setOriginalPipelineTransformVarargs(value: SchemaTransformSummary*): Self = this.set("originalPipelineTransform", js.Array(value :_*))
    @scala.inline
    def setOriginalPipelineTransform(value: js.Array[SchemaTransformSummary]): Self = this.set("originalPipelineTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalPipelineTransform: Self = this.set("originalPipelineTransform", js.undefined)
  }
  
}

