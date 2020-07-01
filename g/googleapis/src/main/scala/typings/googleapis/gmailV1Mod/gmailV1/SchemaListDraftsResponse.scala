package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListDraftsResponse extends js.Object {
  /**
    * List of drafts.
    */
  var drafts: js.UndefOr[js.Array[SchemaDraft]] = js.native
  /**
    * Token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Estimated total number of results.
    */
  var resultSizeEstimate: js.UndefOr[Double] = js.native
}

object SchemaListDraftsResponse {
  @scala.inline
  def apply(
    drafts: js.Array[SchemaDraft] = null,
    nextPageToken: String = null,
    resultSizeEstimate: js.UndefOr[Double] = js.undefined
  ): SchemaListDraftsResponse = {
    val __obj = js.Dynamic.literal()
    if (drafts != null) __obj.updateDynamic("drafts")(drafts.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(resultSizeEstimate)) __obj.updateDynamic("resultSizeEstimate")(resultSizeEstimate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListDraftsResponse]
  }
}

