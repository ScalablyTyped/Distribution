package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a response to a SQL statement.
  */
@js.native
trait SchemaSqlresponse extends js.Object {
  /**
    * Columns in the table.
    */
  var columns: js.UndefOr[js.Array[String]] = js.native
  /**
    * The kind of item this is. For responses to SQL queries, this is always
    * fusiontables#sqlresponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The rows in the table. For each cell we print out whatever cell value
    * (e.g., numeric, string) exists. Thus it is important that each cell
    * contains only one value.
    */
  var rows: js.UndefOr[js.Array[js.Array[_]]] = js.native
}

object SchemaSqlresponse {
  @scala.inline
  def apply(): SchemaSqlresponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSqlresponse]
  }
  @scala.inline
  implicit class SchemaSqlresponseOps[Self <: SchemaSqlresponse] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: String*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setRowsVarargs(value: js.Array[js.Any]*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[js.Array[_]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
  
}

