package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    tableCellStyle: SchemaTableCellStyle = null,
    tableCellStyleSuggestionState: SchemaTableCellStyleSuggestionState = null
  ): SchemaSuggestedTableCellStyle = {
    val __obj = js.Dynamic.literal()
    if (tableCellStyle != null) __obj.updateDynamic("tableCellStyle")(tableCellStyle.asInstanceOf[js.Any])
    if (tableCellStyleSuggestionState != null) __obj.updateDynamic("tableCellStyleSuggestionState")(tableCellStyleSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSuggestedTableCellStyle]
  }
}

