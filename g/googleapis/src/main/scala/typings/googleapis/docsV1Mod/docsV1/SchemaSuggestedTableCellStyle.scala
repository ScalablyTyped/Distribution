package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A suggested change to a TableCellStyle.
  */
@js.native
trait SchemaSuggestedTableCellStyle extends js.Object {
  
  /**
    * A TableCellStyle that only includes the changes made in this suggestion.
    * This can be used along with the table_cell_style_suggestion_state to see
    * which fields have changed and their new values.
    */
  var tableCellStyle: js.UndefOr[SchemaTableCellStyle] = js.native
  
  /**
    * A mask that indicates which of the fields on the base TableCellStyle have
    * been changed in this suggestion.
    */
  var tableCellStyleSuggestionState: js.UndefOr[SchemaTableCellStyleSuggestionState] = js.native
}
object SchemaSuggestedTableCellStyle {
  
  @scala.inline
  def apply(): SchemaSuggestedTableCellStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestedTableCellStyle]
  }
  
  @scala.inline
  implicit class SchemaSuggestedTableCellStyleOps[Self <: SchemaSuggestedTableCellStyle] (val x: Self) extends AnyVal {
    
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
    def setTableCellStyle(value: SchemaTableCellStyle): Self = this.set("tableCellStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableCellStyle: Self = this.set("tableCellStyle", js.undefined)
    
    @scala.inline
    def setTableCellStyleSuggestionState(value: SchemaTableCellStyleSuggestionState): Self = this.set("tableCellStyleSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableCellStyleSuggestionState: Self = this.set("tableCellStyleSuggestionState", js.undefined)
  }
}
