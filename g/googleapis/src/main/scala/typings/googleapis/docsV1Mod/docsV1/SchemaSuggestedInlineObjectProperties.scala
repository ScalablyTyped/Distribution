package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A suggested change to InlineObjectProperties.
  */
@js.native
trait SchemaSuggestedInlineObjectProperties extends js.Object {
  /**
    * An InlineObjectProperties that only includes the changes made in this
    * suggestion. This can be used along with the
    * inline_object_properties_suggestion_state to see which fields have
    * changed and their new values.
    */
  var inlineObjectProperties: js.UndefOr[SchemaInlineObjectProperties] = js.native
  /**
    * A mask that indicates which of the fields on the base
    * InlineObjectProperties have been changed in this suggestion.
    */
  var inlineObjectPropertiesSuggestionState: js.UndefOr[SchemaInlineObjectPropertiesSuggestionState] = js.native
}

object SchemaSuggestedInlineObjectProperties {
  @scala.inline
  def apply(
    inlineObjectProperties: SchemaInlineObjectProperties = null,
    inlineObjectPropertiesSuggestionState: SchemaInlineObjectPropertiesSuggestionState = null
  ): SchemaSuggestedInlineObjectProperties = {
    val __obj = js.Dynamic.literal()
    if (inlineObjectProperties != null) __obj.updateDynamic("inlineObjectProperties")(inlineObjectProperties.asInstanceOf[js.Any])
    if (inlineObjectPropertiesSuggestionState != null) __obj.updateDynamic("inlineObjectPropertiesSuggestionState")(inlineObjectPropertiesSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSuggestedInlineObjectProperties]
  }
}

