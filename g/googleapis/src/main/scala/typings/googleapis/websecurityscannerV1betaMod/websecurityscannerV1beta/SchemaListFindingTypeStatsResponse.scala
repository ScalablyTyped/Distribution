package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListFindingTypeStats` method.
  */
@js.native
trait SchemaListFindingTypeStatsResponse extends js.Object {
  /**
    * The list of FindingTypeStats returned.
    */
  var findingTypeStats: js.UndefOr[js.Array[SchemaFindingTypeStats]] = js.native
}

object SchemaListFindingTypeStatsResponse {
  @scala.inline
  def apply(findingTypeStats: js.Array[SchemaFindingTypeStats] = null): SchemaListFindingTypeStatsResponse = {
    val __obj = js.Dynamic.literal()
    if (findingTypeStats != null) __obj.updateDynamic("findingTypeStats")(findingTypeStats.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListFindingTypeStatsResponse]
  }
}

