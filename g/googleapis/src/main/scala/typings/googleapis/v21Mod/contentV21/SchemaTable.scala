package typings.googleapis.v21Mod.contentV21

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
  def apply(): SchemaTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTable]
  }
  @scala.inline
  implicit class SchemaTableOps[Self <: SchemaTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnHeaders(value: SchemaHeaders): Self = this.set("columnHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnHeaders: Self = this.set("columnHeaders", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRowHeaders(value: SchemaHeaders): Self = this.set("rowHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHeaders: Self = this.set("rowHeaders", js.undefined)
    @scala.inline
    def setRowsVarargs(value: SchemaRow*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[SchemaRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
  
}

