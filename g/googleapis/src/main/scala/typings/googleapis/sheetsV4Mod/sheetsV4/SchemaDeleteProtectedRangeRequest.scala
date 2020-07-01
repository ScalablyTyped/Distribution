package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes the protected range with the given ID.
  */
@js.native
trait SchemaDeleteProtectedRangeRequest extends js.Object {
  /**
    * The ID of the protected range to delete.
    */
  var protectedRangeId: js.UndefOr[Double] = js.native
}

object SchemaDeleteProtectedRangeRequest {
  @scala.inline
  def apply(protectedRangeId: js.UndefOr[Double] = js.undefined): SchemaDeleteProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(protectedRangeId)) __obj.updateDynamic("protectedRangeId")(protectedRangeId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteProtectedRangeRequest]
  }
}

