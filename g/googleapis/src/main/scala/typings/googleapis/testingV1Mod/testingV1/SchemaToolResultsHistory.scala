package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a tool results history resource.
  */
@js.native
trait SchemaToolResultsHistory extends js.Object {
  /**
    * Required. A tool results history ID.
    */
  var historyId: js.UndefOr[String] = js.native
  /**
    * Required. The cloud project that owns the tool results history.
    */
  var projectId: js.UndefOr[String] = js.native
}

object SchemaToolResultsHistory {
  @scala.inline
  def apply(historyId: String = null, projectId: String = null): SchemaToolResultsHistory = {
    val __obj = js.Dynamic.literal()
    if (historyId != null) __obj.updateDynamic("historyId")(historyId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaToolResultsHistory]
  }
}

