package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base ListProperties have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaListPropertiesSuggestionState extends js.Object {
  /**
    * A mask that indicates which of the fields on the corresponding
    * NestingLevel in nesting_levels have been changed in this suggestion.  The
    * nesting level suggestion states are returned in ascending order of the
    * nesting level with the least nested returned first.
    */
  var nestingLevelsSuggestionStates: js.UndefOr[js.Array[SchemaNestingLevelSuggestionState]] = js.native
}

object SchemaListPropertiesSuggestionState {
  @scala.inline
  def apply(nestingLevelsSuggestionStates: js.Array[SchemaNestingLevelSuggestionState] = null): SchemaListPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (nestingLevelsSuggestionStates != null) __obj.updateDynamic("nestingLevelsSuggestionStates")(nestingLevelsSuggestionStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListPropertiesSuggestionState]
  }
}

