package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A coordinate in a sheet. All indexes are zero-based.
  */
@js.native
trait SchemaGridCoordinate extends js.Object {
  /**
    * The column index of the coordinate.
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
    * The row index of the coordinate.
    */
  var rowIndex: js.UndefOr[Double] = js.native
  /**
    * The sheet this coordinate is on.
    */
  var sheetId: js.UndefOr[Double] = js.native
}

object SchemaGridCoordinate {
  @scala.inline
  def apply(
    columnIndex: js.UndefOr[Double] = js.undefined,
    rowIndex: js.UndefOr[Double] = js.undefined,
    sheetId: js.UndefOr[Double] = js.undefined
  ): SchemaGridCoordinate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetId)) __obj.updateDynamic("sheetId")(sheetId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGridCoordinate]
  }
}

