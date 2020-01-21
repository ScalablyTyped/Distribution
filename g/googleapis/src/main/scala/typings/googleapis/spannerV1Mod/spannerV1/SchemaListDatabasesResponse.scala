package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for ListDatabases.
  */
@js.native
trait SchemaListDatabasesResponse extends js.Object {
  /**
    * Databases that matched the request.
    */
  var databases: js.UndefOr[js.Array[SchemaDatabase]] = js.native
  /**
    * `next_page_token` can be sent in a subsequent ListDatabases call to fetch
    * more of the matching databases.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDatabasesResponse {
  @scala.inline
  def apply(databases: js.Array[SchemaDatabase] = null, nextPageToken: String = null): SchemaListDatabasesResponse = {
    val __obj = js.Dynamic.literal()
    if (databases != null) __obj.updateDynamic("databases")(databases.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListDatabasesResponse]
  }
}

