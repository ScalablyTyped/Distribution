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
  def apply(): SchemaSuggestedTableRowStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestedTableRowStyle]
  }
  @scala.inline
  implicit class SchemaSuggestedTableRowStyleOps[Self <: SchemaSuggestedTableRowStyle] (val x: Self) extends AnyVal {
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
    def setTableRowStyle(value: SchemaTableRowStyle): Self = this.set("tableRowStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableRowStyle: Self = this.set("tableRowStyle", js.undefined)
    @scala.inline
    def setTableRowStyleSuggestionState(value: SchemaTableRowStyleSuggestionState): Self = this.set("tableRowStyleSuggestionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableRowStyleSuggestionState: Self = this.set("tableRowStyleSuggestionState", js.undefined)
  }
  
}

