package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Response of auto-complete query.
  */
@js.native
trait SchemaCompleteQueryResponse extends js.Object {
  /**
    * Results of the matching job/company candidates.
    */
  var completionResults: js.UndefOr[js.Array[SchemaCompletionResult]] = js.native
  /**
    * Additional information for the API invocation, such as the request
    * tracking id.
    */
  var metadata: js.UndefOr[SchemaResponseMetadata] = js.native
}

object SchemaCompleteQueryResponse {
  @scala.inline
  def apply(
    completionResults: js.Array[SchemaCompletionResult] = null,
    metadata: SchemaResponseMetadata = null
  ): SchemaCompleteQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (completionResults != null) __obj.updateDynamic("completionResults")(completionResults.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCompleteQueryResponse]
  }
}

