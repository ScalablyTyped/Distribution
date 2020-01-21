package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A suggestion state of a NamedStyle message.
  */
@js.native
trait SchemaNamedStyleSuggestionState extends js.Object {
  /**
    * The named style type that this suggestion state corresponds to.  This
    * field is provided as a convenience for matching the
    * NamedStyleSuggestionState with its corresponding NamedStyle.
    */
  var namedStyleType: js.UndefOr[String] = js.native
  /**
    * A mask that indicates which of the fields in paragraph style have been
    * changed in this suggestion.
    */
  var paragraphStyleSuggestionState: js.UndefOr[SchemaParagraphStyleSuggestionState] = js.native
  /**
    * A mask that indicates which of the fields in text style have been changed
    * in this suggestion.
    */
  var textStyleSuggestionState: js.UndefOr[SchemaTextStyleSuggestionState] = js.native
}

object SchemaNamedStyleSuggestionState {
  @scala.inline
  def apply(
    namedStyleType: String = null,
    paragraphStyleSuggestionState: SchemaParagraphStyleSuggestionState = null,
    textStyleSuggestionState: SchemaTextStyleSuggestionState = null
  ): SchemaNamedStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (namedStyleType != null) __obj.updateDynamic("namedStyleType")(namedStyleType.asInstanceOf[js.Any])
    if (paragraphStyleSuggestionState != null) __obj.updateDynamic("paragraphStyleSuggestionState")(paragraphStyleSuggestionState.asInstanceOf[js.Any])
    if (textStyleSuggestionState != null) __obj.updateDynamic("textStyleSuggestionState")(textStyleSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNamedStyleSuggestionState]
  }
}

