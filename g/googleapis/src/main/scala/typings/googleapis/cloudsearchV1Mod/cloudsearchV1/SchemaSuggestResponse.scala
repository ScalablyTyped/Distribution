package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of the suggest API.
  */
@js.native
trait SchemaSuggestResponse extends js.Object {
  /**
    * List of suggestion results.
    */
  var suggestResults: js.UndefOr[js.Array[SchemaSuggestResult]] = js.native
}

object SchemaSuggestResponse {
  @scala.inline
  def apply(suggestResults: js.Array[SchemaSuggestResult] = null): SchemaSuggestResponse = {
    val __obj = js.Dynamic.literal()
    if (suggestResults != null) __obj.updateDynamic("suggestResults")(suggestResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSuggestResponse]
  }
}

