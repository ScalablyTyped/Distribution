package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a response to an sql statement.
  */
@js.native
trait SchemaSqlresponse extends StObject {
  
  /**
    * Columns in the table.
    */
  var columns: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Type name: a template for an individual table.
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
  implicit class SchemaSqlresponseMutableBuilder[Self <: SchemaSqlresponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[js.Array[_]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
