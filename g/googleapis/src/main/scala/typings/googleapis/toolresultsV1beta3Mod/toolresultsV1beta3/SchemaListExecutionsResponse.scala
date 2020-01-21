package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListExecutionsResponse extends js.Object {
  /**
    * Executions.  Always set.
    */
  var executions: js.UndefOr[js.Array[SchemaExecution]] = js.native
  /**
    * A continuation token to resume the query at the next item.  Will only be
    * set if there are more Executions to fetch.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListExecutionsResponse {
  @scala.inline
  def apply(executions: js.Array[SchemaExecution] = null, nextPageToken: String = null): SchemaListExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    if (executions != null) __obj.updateDynamic("executions")(executions.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListExecutionsResponse]
  }
}

