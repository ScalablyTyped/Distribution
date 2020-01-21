package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A summary of how many vulnz occurrences there are per severity type. counts
  * by groups, or if we should have different summary messages like this.
  */
@js.native
trait SchemaGetVulnzOccurrencesSummaryResponse extends js.Object {
  /**
    * A map of how many occurrences were found for each severity.
    */
  var counts: js.UndefOr[js.Array[SchemaSeverityCount]] = js.native
}

object SchemaGetVulnzOccurrencesSummaryResponse {
  @scala.inline
  def apply(counts: js.Array[SchemaSeverityCount] = null): SchemaGetVulnzOccurrencesSummaryResponse = {
    val __obj = js.Dynamic.literal()
    if (counts != null) __obj.updateDynamic("counts")(counts.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetVulnzOccurrencesSummaryResponse]
  }
}

