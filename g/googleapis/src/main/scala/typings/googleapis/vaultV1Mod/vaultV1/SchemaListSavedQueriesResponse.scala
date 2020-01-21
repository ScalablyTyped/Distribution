package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of the response for method ListSaveQuery.
  */
@js.native
trait SchemaListSavedQueriesResponse extends js.Object {
  /**
    * Page token to retrieve the next page of results in the list. If this is
    * empty, then there are no more saved queries to list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of output saved queries.
    */
  var savedQueries: js.UndefOr[js.Array[SchemaSavedQuery]] = js.native
}

object SchemaListSavedQueriesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, savedQueries: js.Array[SchemaSavedQuery] = null): SchemaListSavedQueriesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (savedQueries != null) __obj.updateDynamic("savedQueries")(savedQueries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListSavedQueriesResponse]
  }
}

