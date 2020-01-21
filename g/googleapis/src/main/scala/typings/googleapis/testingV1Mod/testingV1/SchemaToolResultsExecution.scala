package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a tool results execution resource.  This has the results of a
  * TestMatrix.
  */
@js.native
trait SchemaToolResultsExecution extends js.Object {
  /**
    * Output only. A tool results execution ID.
    */
  var executionId: js.UndefOr[String] = js.native
  /**
    * Output only. A tool results history ID.
    */
  var historyId: js.UndefOr[String] = js.native
  /**
    * Output only. The cloud project that owns the tool results execution.
    */
  var projectId: js.UndefOr[String] = js.native
}

object SchemaToolResultsExecution {
  @scala.inline
  def apply(executionId: String = null, historyId: String = null, projectId: String = null): SchemaToolResultsExecution = {
    val __obj = js.Dynamic.literal()
    if (executionId != null) __obj.updateDynamic("executionId")(executionId.asInstanceOf[js.Any])
    if (historyId != null) __obj.updateDynamic("historyId")(historyId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaToolResultsExecution]
  }
}

