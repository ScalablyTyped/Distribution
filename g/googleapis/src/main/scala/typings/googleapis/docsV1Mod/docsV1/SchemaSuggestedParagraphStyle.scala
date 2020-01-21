package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A suggested change to a ParagraphStyle.
  */
@js.native
trait SchemaSuggestedParagraphStyle extends js.Object {
  /**
    * A ParagraphStyle that only includes the changes made in this suggestion.
    * This can be used along with the paragraph_suggestion_state to see which
    * fields have changed and their new values.
    */
  var paragraphStyle: js.UndefOr[SchemaParagraphStyle] = js.native
  /**
    * A mask that indicates which of the fields on the base ParagraphStyle have
    * been changed in this suggestion.
    */
  var paragraphStyleSuggestionState: js.UndefOr[SchemaParagraphStyleSuggestionState] = js.native
}

object SchemaSuggestedParagraphStyle {
  @scala.inline
  def apply(
    paragraphStyle: SchemaParagraphStyle = null,
    paragraphStyleSuggestionState: SchemaParagraphStyleSuggestionState = null
  ): SchemaSuggestedParagraphStyle = {
    val __obj = js.Dynamic.literal()
    if (paragraphStyle != null) __obj.updateDynamic("paragraphStyle")(paragraphStyle.asInstanceOf[js.Any])
    if (paragraphStyleSuggestionState != null) __obj.updateDynamic("paragraphStyleSuggestionState")(paragraphStyleSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSuggestedParagraphStyle]
  }
}

