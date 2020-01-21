package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes a range of cells, shifting other cells into the deleted area.
  */
@js.native
trait SchemaDeleteRangeRequest extends js.Object {
  /**
    * The range of cells to delete.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  /**
    * The dimension from which deleted cells will be replaced with. If ROWS,
    * existing cells will be shifted upward to replace the deleted cells. If
    * COLUMNS, existing cells will be shifted left to replace the deleted
    * cells.
    */
  var shiftDimension: js.UndefOr[String] = js.native
}

object SchemaDeleteRangeRequest {
  @scala.inline
  def apply(range: SchemaGridRange = null, shiftDimension: String = null): SchemaDeleteRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (shiftDimension != null) __obj.updateDynamic("shiftDimension")(shiftDimension.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteRangeRequest]
  }
}

