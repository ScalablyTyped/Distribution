package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for StepService.List.
  */
@js.native
trait SchemaListStepsResponse extends js.Object {
  /**
    * A continuation token to resume the query at the next item.  If set,
    * indicates that there are more steps to read, by calling list again with
    * this value in the page_token field.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Steps.
    */
  var steps: js.UndefOr[js.Array[SchemaStep]] = js.native
}

object SchemaListStepsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, steps: js.Array[SchemaStep] = null): SchemaListStepsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListStepsResponse]
  }
}

