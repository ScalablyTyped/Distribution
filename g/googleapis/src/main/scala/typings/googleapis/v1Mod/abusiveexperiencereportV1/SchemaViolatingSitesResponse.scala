package typings.googleapis.v1Mod.abusiveexperiencereportV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListViolatingSites.
  */
@js.native
trait SchemaViolatingSitesResponse extends js.Object {
  /**
    * A list of summaries of violating sites.
    */
  var violatingSites: js.UndefOr[js.Array[SchemaSiteSummaryResponse]] = js.native
}

object SchemaViolatingSitesResponse {
  @scala.inline
  def apply(violatingSites: js.Array[SchemaSiteSummaryResponse] = null): SchemaViolatingSitesResponse = {
    val __obj = js.Dynamic.literal()
    if (violatingSites != null) __obj.updateDynamic("violatingSites")(violatingSites.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaViolatingSitesResponse]
  }
}

