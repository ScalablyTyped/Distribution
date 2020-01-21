package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request to run a pipeline. If `pipelineId` is specified, it refers to a
  * saved pipeline created with CreatePipeline and set as the `pipelineId` of
  * the returned Pipeline object. If `ephemeralPipeline` is specified, that
  * pipeline is run once with the given args and not saved. It is an error to
  * specify both `pipelineId` and `ephemeralPipeline`. `pipelineArgs` must be
  * specified.
  */
@js.native
trait SchemaRunPipelineRequest extends js.Object {
  /**
    * A new pipeline object to run once and then delete.
    */
  var ephemeralPipeline: js.UndefOr[SchemaPipeline] = js.native
  /**
    * The arguments to use when running this pipeline.
    */
  var pipelineArgs: js.UndefOr[SchemaRunPipelineArgs] = js.native
  /**
    * The already created pipeline to run.
    */
  var pipelineId: js.UndefOr[String] = js.native
}

object SchemaRunPipelineRequest {
  @scala.inline
  def apply(
    ephemeralPipeline: SchemaPipeline = null,
    pipelineArgs: SchemaRunPipelineArgs = null,
    pipelineId: String = null
  ): SchemaRunPipelineRequest = {
    val __obj = js.Dynamic.literal()
    if (ephemeralPipeline != null) __obj.updateDynamic("ephemeralPipeline")(ephemeralPipeline.asInstanceOf[js.Any])
    if (pipelineArgs != null) __obj.updateDynamic("pipelineArgs")(pipelineArgs.asInstanceOf[js.Any])
    if (pipelineId != null) __obj.updateDynamic("pipelineId")(pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRunPipelineRequest]
  }
}

