package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Datastore.ReserveIds.
  */
@js.native
trait SchemaReserveIdsRequest extends js.Object {
  /**
    * If not empty, the ID of the database against which to make the request.
    */
  var databaseId: js.UndefOr[String] = js.native
  /**
    * A list of keys with complete key paths whose numeric IDs should not be
    * auto-allocated.
    */
  var keys: js.UndefOr[js.Array[SchemaKey]] = js.native
}

object SchemaReserveIdsRequest {
  @scala.inline
  def apply(databaseId: String = null, keys: js.Array[SchemaKey] = null): SchemaReserveIdsRequest = {
    val __obj = js.Dynamic.literal()
    if (databaseId != null) __obj.updateDynamic("databaseId")(databaseId.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReserveIdsRequest]
  }
}

