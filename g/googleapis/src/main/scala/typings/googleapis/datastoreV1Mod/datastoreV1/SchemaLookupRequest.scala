package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Datastore.Lookup.
  */
@js.native
trait SchemaLookupRequest extends js.Object {
  /**
    * Keys of entities to look up.
    */
  var keys: js.UndefOr[js.Array[SchemaKey]] = js.native
  /**
    * The options for this lookup request.
    */
  var readOptions: js.UndefOr[SchemaReadOptions] = js.native
}

object SchemaLookupRequest {
  @scala.inline
  def apply(keys: js.Array[SchemaKey] = null, readOptions: SchemaReadOptions = null): SchemaLookupRequest = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (readOptions != null) __obj.updateDynamic("readOptions")(readOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLookupRequest]
  }
}

