package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance list operations response.
  */
@js.native
trait SchemaOperationsListResponse extends js.Object {
  /**
    * List of operation resources.
    */
  var items: js.UndefOr[js.Array[SchemaOperation]] = js.native
  /**
    * This is always sql#operationsList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The continuation token, used to page through large result sets. Provide
    * this value in a subsequent request to return the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaOperationsListResponse {
  @scala.inline
  def apply(items: js.Array[SchemaOperation] = null, kind: String = null, nextPageToken: String = null): SchemaOperationsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOperationsListResponse]
  }
}

