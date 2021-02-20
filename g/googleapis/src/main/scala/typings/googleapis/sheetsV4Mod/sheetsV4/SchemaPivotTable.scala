package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A pivot table.
  */
@js.native
trait SchemaPivotTable extends StObject {
  
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
  implicit class SchemaPivotTableMutableBuilder[Self <: SchemaPivotTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[SchemaPivotGroup]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: SchemaPivotGroup*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setCriteria(value: StringDictionary[SchemaPivotFilterCriteria]): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[SchemaPivotGroup]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: SchemaPivotGroup*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: SchemaGridRange): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setValueLayout(value: String): Self = StObject.set(x, "valueLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueLayoutUndefined: Self = StObject.set(x, "valueLayout", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[SchemaPivotValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: SchemaPivotValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
