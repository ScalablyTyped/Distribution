package typings.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Datastore.AllocateIds.
  */
@js.native
trait SchemaAllocateIdsResponse extends js.Object {
  /**
    * The keys specified in the request (in the same order), each with its key
    * path completed with a newly allocated ID.
    */
  var keys: js.UndefOr[js.Array[SchemaKey]] = js.native
}

object SchemaAllocateIdsResponse {
  @scala.inline
  def apply(keys: js.Array[SchemaKey] = null): SchemaAllocateIdsResponse = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAllocateIdsResponse]
  }
}

