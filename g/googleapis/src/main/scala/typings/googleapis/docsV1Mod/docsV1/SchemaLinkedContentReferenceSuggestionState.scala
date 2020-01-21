package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base
  * LinkedContentReference have been changed in this suggestion. For any field
  * set to true, there is a new suggested value.
  */
@js.native
trait SchemaLinkedContentReferenceSuggestionState extends js.Object {
  /**
    * A mask that indicates which of the fields in sheets_chart_reference have
    * been changed in this suggestion.
    */
  var sheetsChartReferenceSuggestionState: js.UndefOr[SchemaSheetsChartReferenceSuggestionState] = js.native
}

object SchemaLinkedContentReferenceSuggestionState {
  @scala.inline
  def apply(sheetsChartReferenceSuggestionState: SchemaSheetsChartReferenceSuggestionState = null): SchemaLinkedContentReferenceSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (sheetsChartReferenceSuggestionState != null) __obj.updateDynamic("sheetsChartReferenceSuggestionState")(sheetsChartReferenceSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLinkedContentReferenceSuggestionState]
  }
}

