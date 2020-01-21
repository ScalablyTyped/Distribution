package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instances list response.
  */
@js.native
trait SchemaInstancesListResponse extends js.Object {
  /**
    * List of database instance resources.
    */
  var items: js.UndefOr[js.Array[SchemaDatabaseInstance]] = js.native
  /**
    * This is always sql#instancesList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The continuation token, used to page through large result sets. Provide
    * this value in a subsequent request to return the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of warnings that ocurred while handling the request.
    */
  var warnings: js.UndefOr[js.Array[SchemaApiWarning]] = js.native
}

object SchemaInstancesListResponse {
  @scala.inline
  def apply(
    items: js.Array[SchemaDatabaseInstance] = null,
    kind: String = null,
    nextPageToken: String = null,
    warnings: js.Array[SchemaApiWarning] = null
  ): SchemaInstancesListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstancesListResponse]
  }
}

