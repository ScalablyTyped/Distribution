package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message describing the state of a particular execution stage.
  */
@js.native
trait SchemaExecutionStageState extends js.Object {
  /**
    * The time at which the stage transitioned to this state.
    */
  var currentStateTime: js.UndefOr[String] = js.native
  /**
    * The name of the execution stage.
    */
  var executionStageName: js.UndefOr[String] = js.native
  /**
    * Executions stage states allow the same set of values as JobState.
    */
  var executionStageState: js.UndefOr[String] = js.native
}

object SchemaExecutionStageState {
  @scala.inline
  def apply(
    currentStateTime: String = null,
    executionStageName: String = null,
    executionStageState: String = null
  ): SchemaExecutionStageState = {
    val __obj = js.Dynamic.literal()
    if (currentStateTime != null) __obj.updateDynamic("currentStateTime")(currentStateTime.asInstanceOf[js.Any])
    if (executionStageName != null) __obj.updateDynamic("executionStageName")(executionStageName.asInstanceOf[js.Any])
    if (executionStageState != null) __obj.updateDynamic("executionStageState")(executionStageState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExecutionStageState]
  }
}

