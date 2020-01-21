package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Removes the named range with the given ID from the spreadsheet.
  */
@js.native
trait SchemaDeleteNamedRangeRequest extends js.Object {
  /**
    * The ID of the named range to delete.
    */
  var namedRangeId: js.UndefOr[String] = js.native
}

object SchemaDeleteNamedRangeRequest {
  @scala.inline
  def apply(namedRangeId: String = null): SchemaDeleteNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteNamedRangeRequest]
  }
}

