package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes full or partial data disk assignment information of the
  * computation ranges.
  */
@js.native
trait SchemaStreamingComputationRanges extends js.Object {
  /**
    * The ID of the computation.
    */
  var computationId: js.UndefOr[String] = js.native
  /**
    * Data disk assignments for ranges from this computation.
    */
  var rangeAssignments: js.UndefOr[js.Array[SchemaKeyRangeDataDiskAssignment]] = js.native
}

object SchemaStreamingComputationRanges {
  @scala.inline
  def apply(computationId: String = null, rangeAssignments: js.Array[SchemaKeyRangeDataDiskAssignment] = null): SchemaStreamingComputationRanges = {
    val __obj = js.Dynamic.literal()
    if (computationId != null) __obj.updateDynamic("computationId")(computationId.asInstanceOf[js.Any])
    if (rangeAssignments != null) __obj.updateDynamic("rangeAssignments")(rangeAssignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStreamingComputationRanges]
  }
}

