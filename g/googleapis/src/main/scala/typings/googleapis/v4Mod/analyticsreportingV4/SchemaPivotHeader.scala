package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The headers for each of the pivot sections defined in the request.
  */
@js.native
trait SchemaPivotHeader extends js.Object {
  /**
    * A single pivot section header.
    */
  var pivotHeaderEntries: js.UndefOr[js.Array[SchemaPivotHeaderEntry]] = js.native
  /**
    * The total number of groups for this pivot.
    */
  var totalPivotGroupsCount: js.UndefOr[Double] = js.native
}

object SchemaPivotHeader {
  @scala.inline
  def apply(
    pivotHeaderEntries: js.Array[SchemaPivotHeaderEntry] = null,
    totalPivotGroupsCount: Int | Double = null
  ): SchemaPivotHeader = {
    val __obj = js.Dynamic.literal()
    if (pivotHeaderEntries != null) __obj.updateDynamic("pivotHeaderEntries")(pivotHeaderEntries.asInstanceOf[js.Any])
    if (totalPivotGroupsCount != null) __obj.updateDynamic("totalPivotGroupsCount")(totalPivotGroupsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPivotHeader]
  }
}

