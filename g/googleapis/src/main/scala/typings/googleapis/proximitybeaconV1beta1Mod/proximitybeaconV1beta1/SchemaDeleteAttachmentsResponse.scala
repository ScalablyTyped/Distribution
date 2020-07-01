package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for a request to delete attachments.
  */
@js.native
trait SchemaDeleteAttachmentsResponse extends js.Object {
  /**
    * The number of attachments that were deleted.
    */
  var numDeleted: js.UndefOr[Double] = js.native
}

object SchemaDeleteAttachmentsResponse {
  @scala.inline
  def apply(numDeleted: js.UndefOr[Double] = js.undefined): SchemaDeleteAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(numDeleted)) __obj.updateDynamic("numDeleted")(numDeleted.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteAttachmentsResponse]
  }
}

