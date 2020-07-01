package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Removes the banded range with the given ID from the spreadsheet.
  */
@js.native
trait SchemaDeleteBandingRequest extends js.Object {
  /**
    * The ID of the banded range to delete.
    */
  var bandedRangeId: js.UndefOr[Double] = js.native
}

object SchemaDeleteBandingRequest {
  @scala.inline
  def apply(bandedRangeId: js.UndefOr[Double] = js.undefined): SchemaDeleteBandingRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bandedRangeId)) __obj.updateDynamic("bandedRangeId")(bandedRangeId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteBandingRequest]
  }
}

