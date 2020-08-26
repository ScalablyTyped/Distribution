package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pivot table.
  */
@js.native
trait SchemaPivotTable extends js.Object {
  /**
    * Each column grouping in the pivot table.
    */
  var columns: js.UndefOr[js.Array[SchemaPivotGroup]] = js.native
  /**
    * An optional mapping of filters per source column offset.  The filters are
    * applied before aggregating data into the pivot table. The map&#39;s key
    * is the column offset of the source range that you want to filter, and the
    * value is the criteria for that column.  For example, if the source was
    * `C10:E15`, a key of `0` will have the filter for column `C`, whereas the
    * key `1` is for column `D`.
    */
  var criteria: js.UndefOr[StringDictionary[SchemaPivotFilterCriteria]] = js.native
  /**
    * Each row grouping in the pivot table.
    */
  var rows: js.UndefOr[js.Array[SchemaPivotGroup]] = js.native
  /**
    * The range the pivot table is reading data from.
    */
  var source: js.UndefOr[SchemaGridRange] = js.native
  /**
    * Whether values should be listed horizontally (as columns) or vertically
    * (as rows).
    */
  var valueLayout: js.UndefOr[String] = js.native
  /**
    * A list of values to include in the pivot table.
    */
  var values: js.UndefOr[js.Array[SchemaPivotValue]] = js.native
}

object SchemaPivotTable {
  @scala.inline
  def apply(): SchemaPivotTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotTable]
  }
  @scala.inline
  implicit class SchemaPivotTableOps[Self <: SchemaPivotTable] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: SchemaPivotGroup*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[SchemaPivotGroup]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setCriteria(value: StringDictionary[SchemaPivotFilterCriteria]): Self = this.set("criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCriteria: Self = this.set("criteria", js.undefined)
    @scala.inline
    def setRowsVarargs(value: SchemaPivotGroup*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[SchemaPivotGroup]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setSource(value: SchemaGridRange): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setValueLayout(value: String): Self = this.set("valueLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueLayout: Self = this.set("valueLayout", js.undefined)
    @scala.inline
    def setValuesVarargs(value: SchemaPivotValue*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SchemaPivotValue]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

