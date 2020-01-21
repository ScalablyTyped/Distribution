package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTable extends js.Object {
  /**
    * Headers of the table&#39;s columns. Optional: if not set then the table
    * has only one dimension.
    */
  var columnHeaders: js.UndefOr[SchemaHeaders] = js.native
  /**
    * Name of the table. Required for subtables, ignored for the main table.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Headers of the table&#39;s rows. Required.
    */
  var rowHeaders: js.UndefOr[SchemaHeaders] = js.native
  /**
    * The list of rows that constitute the table. Must have the same length as
    * rowHeaders. Required.
    */
  var rows: js.UndefOr[js.Array[SchemaRow]] = js.native
}

object SchemaTable {
  @scala.inline
  def apply(
    columnHeaders: SchemaHeaders = null,
    name: String = null,
    rowHeaders: SchemaHeaders = null,
    rows: js.Array[SchemaRow] = null
  ): SchemaTable = {
    val __obj = js.Dynamic.literal()
    if (columnHeaders != null) __obj.updateDynamic("columnHeaders")(columnHeaders.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rowHeaders != null) __obj.updateDynamic("rowHeaders")(rowHeaders.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTable]
  }
}

