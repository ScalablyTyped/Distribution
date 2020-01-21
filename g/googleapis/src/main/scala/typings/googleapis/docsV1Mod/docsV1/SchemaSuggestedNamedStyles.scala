package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A suggested change to the NamedStyles.
  */
@js.native
trait SchemaSuggestedNamedStyles extends js.Object {
  /**
    * A NamedStyles that only includes the changes made in this suggestion.
    * This can be used along with the named_styles_suggestion_state to see
    * which fields have changed and their new values.
    */
  var namedStyles: js.UndefOr[SchemaNamedStyles] = js.native
  /**
    * A mask that indicates which of the fields on the base NamedStyles have
    * been changed in this suggestion.
    */
  var namedStylesSuggestionState: js.UndefOr[SchemaNamedStylesSuggestionState] = js.native
}

object SchemaSuggestedNamedStyles {
  @scala.inline
  def apply(
    namedStyles: SchemaNamedStyles = null,
    namedStylesSuggestionState: SchemaNamedStylesSuggestionState = null
  ): SchemaSuggestedNamedStyles = {
    val __obj = js.Dynamic.literal()
    if (namedStyles != null) __obj.updateDynamic("namedStyles")(namedStyles.asInstanceOf[js.Any])
    if (namedStylesSuggestionState != null) __obj.updateDynamic("namedStylesSuggestionState")(namedStylesSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSuggestedNamedStyles]
  }
}

