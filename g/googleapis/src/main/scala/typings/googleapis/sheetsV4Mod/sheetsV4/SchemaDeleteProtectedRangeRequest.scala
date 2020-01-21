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
  def apply(protectedRangeId: Int | Double = null): SchemaDeleteProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (protectedRangeId != null) __obj.updateDynamic("protectedRangeId")(protectedRangeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteProtectedRangeRequest]
  }
}

