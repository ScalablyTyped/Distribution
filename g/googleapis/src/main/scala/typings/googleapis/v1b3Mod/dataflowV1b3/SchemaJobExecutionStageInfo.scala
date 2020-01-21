package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about how a particular google.dataflow.v1beta3.Step
  * will be executed.
  */
@js.native
trait SchemaJobExecutionStageInfo extends js.Object {
  /**
    * The steps associated with the execution stage. Note that stages may have
    * several steps, and that a given step might be run by more than one stage.
    */
  var stepName: js.UndefOr[js.Array[String]] = js.native
}

object SchemaJobExecutionStageInfo {
  @scala.inline
  def apply(stepName: js.Array[String] = null): SchemaJobExecutionStageInfo = {
    val __obj = js.Dynamic.literal()
    if (stepName != null) __obj.updateDynamic("stepName")(stepName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaJobExecutionStageInfo]
  }
}

