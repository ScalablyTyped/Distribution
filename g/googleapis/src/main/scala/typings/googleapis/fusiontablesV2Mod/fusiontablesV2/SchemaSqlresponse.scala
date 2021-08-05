package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a response to a SQL statement.
  */
trait SchemaSqlresponse extends StObject {
  
  /**
    * Columns in the table.
    */
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The kind of item this is. For responses to SQL queries, this is always
    * fusiontables#sqlresponse.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The rows in the table. For each cell we print out whatever cell value
    * (e.g., numeric, string) exists. Thus it is important that each cell
    * contains only one value.
    */
  var rows: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
}
object SchemaSqlresponse {
  
  inline def apply(): SchemaSqlresponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSqlresponse]
  }
  
  extension [Self <: SchemaSqlresponse](x: Self) {
    
    inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRows(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
