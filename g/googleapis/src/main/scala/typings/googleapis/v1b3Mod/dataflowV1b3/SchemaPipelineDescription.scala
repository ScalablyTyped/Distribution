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
  def apply(
    displayData: js.Array[SchemaDisplayData] = null,
    executionPipelineStage: js.Array[SchemaExecutionStageSummary] = null,
    originalPipelineTransform: js.Array[SchemaTransformSummary] = null
  ): SchemaPipelineDescription = {
    val __obj = js.Dynamic.literal()
    if (displayData != null) __obj.updateDynamic("displayData")(displayData.asInstanceOf[js.Any])
    if (executionPipelineStage != null) __obj.updateDynamic("executionPipelineStage")(executionPipelineStage.asInstanceOf[js.Any])
    if (originalPipelineTransform != null) __obj.updateDynamic("originalPipelineTransform")(originalPipelineTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPipelineDescription]
  }
}

