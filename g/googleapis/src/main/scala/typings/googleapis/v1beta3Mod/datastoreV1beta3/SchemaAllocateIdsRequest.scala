package typings.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Datastore.AllocateIds.
  */
@js.native
trait SchemaAllocateIdsRequest extends js.Object {
  /**
    * A list of keys with incomplete key paths for which to allocate IDs. No
    * key may be reserved/read-only.
    */
  var keys: js.UndefOr[js.Array[SchemaKey]] = js.native
}

object SchemaAllocateIdsRequest {
  @scala.inline
  def apply(keys: js.Array[SchemaKey] = null): SchemaAllocateIdsRequest = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAllocateIdsRequest]
  }
}

