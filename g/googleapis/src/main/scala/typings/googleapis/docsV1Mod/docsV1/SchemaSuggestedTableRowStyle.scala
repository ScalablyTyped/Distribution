package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A suggested change to a TableRowStyle.
  */
@js.native
trait SchemaSuggestedTableRowStyle extends js.Object {
  /**
    * A TableRowStyle that only includes the changes made in this suggestion.
    * This can be used along with the table_row_style_suggestion_state to see
    * which fields have changed and their new values.
    */
  var tableRowStyle: js.UndefOr[SchemaTableRowStyle] = js.native
  /**
    * A mask that indicates which of the fields on the base TableRowStyle have
    * been changed in this suggestion.
    */
  var tableRowStyleSuggestionState: js.UndefOr[SchemaTableRowStyleSuggestionState] = js.native
}

object SchemaSuggestedTableRowStyle {
  @scala.inline
  def apply(
    tableRowStyle: SchemaTableRowStyle = null,
    tableRowStyleSuggestionState: SchemaTableRowStyleSuggestionState = null
  ): SchemaSuggestedTableRowStyle = {
    val __obj = js.Dynamic.literal()
    if (tableRowStyle != null) __obj.updateDynamic("tableRowStyle")(tableRowStyle.asInstanceOf[js.Any])
    if (tableRowStyleSuggestionState != null) __obj.updateDynamic("tableRowStyleSuggestionState")(tableRowStyleSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSuggestedTableRowStyle]
  }
}

