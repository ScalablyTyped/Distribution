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
  def apply(): SchemaGetVulnzOccurrencesSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetVulnzOccurrencesSummaryResponse]
  }
  @scala.inline
  implicit class SchemaGetVulnzOccurrencesSummaryResponseOps[Self <: SchemaGetVulnzOccurrencesSummaryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCountsVarargs(value: SchemaSeverityCount*): Self = this.set("counts", js.Array(value :_*))
    @scala.inline
    def setCounts(value: js.Array[SchemaSeverityCount]): Self = this.set("counts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounts: Self = this.set("counts", js.undefined)
  }
  
}

