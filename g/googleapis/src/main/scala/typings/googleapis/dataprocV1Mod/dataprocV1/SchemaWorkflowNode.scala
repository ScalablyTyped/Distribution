package typings.googleapis.dataprocV1Mod.dataprocV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The workflow node.
  */
@js.native
trait SchemaWorkflowNode extends js.Object {
  /**
    * Output only. The error detail.
    */
  var error: js.UndefOr[String] = js.native
  /**
    * Output only. The job id; populated after the node enters RUNNING state.
    */
  var jobId: js.UndefOr[String] = js.native
  /**
    * Output only. Node&#39;s prerequisite nodes.
    */
  var prerequisiteStepIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Output only. The node state.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. The name of the node.
    */
  var stepId: js.UndefOr[String] = js.native
}

object SchemaWorkflowNode {
  @scala.inline
  def apply(
    error: String = null,
    jobId: String = null,
    prerequisiteStepIds: js.Array[String] = null,
    state: String = null,
    stepId: String = null
  ): SchemaWorkflowNode = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (prerequisiteStepIds != null) __obj.updateDynamic("prerequisiteStepIds")(prerequisiteStepIds.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (stepId != null) __obj.updateDynamic("stepId")(stepId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWorkflowNode]
  }
}

