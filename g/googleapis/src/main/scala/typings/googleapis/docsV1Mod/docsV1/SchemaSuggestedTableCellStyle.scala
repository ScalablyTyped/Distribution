package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A suggested change to a TableCellStyle.
  */
trait SchemaSuggestedTableCellStyle extends StObject {
  
  /**
    * A TableCellStyle that only includes the changes made in this suggestion.
    * This can be used along with the table_cell_style_suggestion_state to see
    * which fields have changed and their new values.
    */
  var tableCellStyle: js.UndefOr[SchemaTableCellStyle] = js.undefined
  
  /**
    * A mask that indicates which of the fields on the base TableCellStyle have
    * been changed in this suggestion.
    */
  var tableCellStyleSuggestionState: js.UndefOr[SchemaTableCellStyleSuggestionState] = js.undefined
}
object SchemaSuggestedTableCellStyle {
  
  inline def apply(): SchemaSuggestedTableCellStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestedTableCellStyle]
  }
  
  extension [Self <: SchemaSuggestedTableCellStyle](x: Self) {
    
    inline def setTableCellStyle(value: SchemaTableCellStyle): Self = StObject.set(x, "tableCellStyle", value.asInstanceOf[js.Any])
    
    inline def setTableCellStyleSuggestionState(value: SchemaTableCellStyleSuggestionState): Self = StObject.set(x, "tableCellStyleSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setTableCellStyleSuggestionStateUndefined: Self = StObject.set(x, "tableCellStyleSuggestionState", js.undefined)
    
    inline def setTableCellStyleUndefined: Self = StObject.set(x, "tableCellStyle", js.undefined)
  }
}
