package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contents of each border row in a table.
  */
@js.native
trait SchemaTableBorderRow extends js.Object {
  /**
    * Properties of each border cell. When a border&#39;s adjacent table cells
    * are merged, it is not included in the response.
    */
  var tableBorderCells: js.UndefOr[js.Array[SchemaTableBorderCell]] = js.native
}

object SchemaTableBorderRow {
  @scala.inline
  def apply(tableBorderCells: js.Array[SchemaTableBorderCell] = null): SchemaTableBorderRow = {
    val __obj = js.Dynamic.literal()
    if (tableBorderCells != null) __obj.updateDynamic("tableBorderCells")(tableBorderCells.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableBorderRow]
  }
}

