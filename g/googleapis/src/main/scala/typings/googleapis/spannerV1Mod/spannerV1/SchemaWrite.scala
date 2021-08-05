package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments to insert, update, insert_or_update, and replace operations.
  */
trait SchemaWrite extends StObject {
  
  /**
    * The names of the columns in table to be written.  The list of columns
    * must contain enough columns to allow Cloud Spanner to derive values for
    * all primary key columns in the row(s) to be modified.
    */
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. The table whose rows will be written.
    */
  var table: js.UndefOr[String] = js.undefined
  
  /**
    * The values to be written. `values` can contain more than one list of
    * values. If it does, then multiple rows are written, one for each entry in
    * `values`. Each list in `values` must have exactly as many entries as
    * there are entries in columns above. Sending multiple lists is equivalent
    * to sending multiple `Mutation`s, each containing one `values` entry and
    * repeating table and columns. Individual values in each list are encoded
    * as described here.
    */
  var values: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
}
object SchemaWrite {
  
  inline def apply(): SchemaWrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWrite]
  }
  
  extension [Self <: SchemaWrite](x: Self) {
    
    inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setValues(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
