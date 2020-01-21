package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The suggestion state of a NamedStyles message.
  */
@js.native
trait SchemaNamedStylesSuggestionState extends js.Object {
  /**
    * A mask that indicates which of the fields on the corresponding NamedStyle
    * in styles have been changed in this suggestion.  The order of these named
    * style suggestion states match the order of the corresponding named style
    * within the named styles suggestion.
    */
  var stylesSuggestionStates: js.UndefOr[js.Array[SchemaNamedStyleSuggestionState]] = js.native
}

object SchemaNamedStylesSuggestionState {
  @scala.inline
  def apply(stylesSuggestionStates: js.Array[SchemaNamedStyleSuggestionState] = null): SchemaNamedStylesSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (stylesSuggestionStates != null) __obj.updateDynamic("stylesSuggestionStates")(stylesSuggestionStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNamedStylesSuggestionState]
  }
}

