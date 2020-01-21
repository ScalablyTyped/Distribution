package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data about each cell in a row.
  */
@js.native
trait SchemaRowData extends js.Object {
  /**
    * The values in the row, one per column.
    */
  var values: js.UndefOr[js.Array[SchemaCellData]] = js.native
}

object SchemaRowData {
  @scala.inline
  def apply(values: js.Array[SchemaCellData] = null): SchemaRowData = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRowData]
  }
}

