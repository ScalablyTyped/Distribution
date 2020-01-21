package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to batch delete of one or more Photos.
  */
@js.native
trait SchemaBatchDeletePhotosResponse extends js.Object {
  /**
    * The status for the operation to delete a single Photo in the batch
    * request.
    */
  var status: js.UndefOr[js.Array[SchemaStatus]] = js.native
}

object SchemaBatchDeletePhotosResponse {
  @scala.inline
  def apply(status: js.Array[SchemaStatus] = null): SchemaBatchDeletePhotosResponse = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchDeletePhotosResponse]
  }
}

