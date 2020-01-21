package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base
  * PositionedObjectProperties have been changed in this suggestion. For any
  * field set to true, there is a new suggested value.
  */
@js.native
trait SchemaPositionedObjectPropertiesSuggestionState extends js.Object {
  /**
    * A mask that indicates which of the fields in embedded_object have been
    * changed in this suggestion.
    */
  var embeddedObjectSuggestionState: js.UndefOr[SchemaEmbeddedObjectSuggestionState] = js.native
  /**
    * A mask that indicates which of the fields in positioning have been
    * changed in this suggestion.
    */
  var positioningSuggestionState: js.UndefOr[SchemaPositionedObjectPositioningSuggestionState] = js.native
}

object SchemaPositionedObjectPropertiesSuggestionState {
  @scala.inline
  def apply(
    embeddedObjectSuggestionState: SchemaEmbeddedObjectSuggestionState = null,
    positioningSuggestionState: SchemaPositionedObjectPositioningSuggestionState = null
  ): SchemaPositionedObjectPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (embeddedObjectSuggestionState != null) __obj.updateDynamic("embeddedObjectSuggestionState")(embeddedObjectSuggestionState.asInstanceOf[js.Any])
    if (positioningSuggestionState != null) __obj.updateDynamic("positioningSuggestionState")(positioningSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPositionedObjectPropertiesSuggestionState]
  }
}

