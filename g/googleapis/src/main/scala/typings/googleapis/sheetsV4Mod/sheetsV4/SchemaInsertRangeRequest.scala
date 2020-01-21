package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inserts cells into a range, shifting the existing cells over or down.
  */
@js.native
trait SchemaInsertRangeRequest extends js.Object {
  /**
    * The range to insert new cells into.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  /**
    * The dimension which will be shifted when inserting cells. If ROWS,
    * existing cells will be shifted down. If COLUMNS, existing cells will be
    * shifted right.
    */
  var shiftDimension: js.UndefOr[String] = js.native
}

object SchemaInsertRangeRequest {
  @scala.inline
  def apply(range: SchemaGridRange = null, shiftDimension: String = null): SchemaInsertRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (shiftDimension != null) __obj.updateDynamic("shiftDimension")(shiftDimension.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInsertRangeRequest]
  }
}

