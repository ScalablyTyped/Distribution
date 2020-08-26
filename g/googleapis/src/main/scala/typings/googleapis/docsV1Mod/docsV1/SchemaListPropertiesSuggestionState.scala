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
  def apply(): SchemaListPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPropertiesSuggestionState]
  }
  @scala.inline
  implicit class SchemaListPropertiesSuggestionStateOps[Self <: SchemaListPropertiesSuggestionState] (val x: Self) extends AnyVal {
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
    def setNestingLevelsSuggestionStatesVarargs(value: SchemaNestingLevelSuggestionState*): Self = this.set("nestingLevelsSuggestionStates", js.Array(value :_*))
    @scala.inline
    def setNestingLevelsSuggestionStates(value: js.Array[SchemaNestingLevelSuggestionState]): Self = this.set("nestingLevelsSuggestionStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestingLevelsSuggestionStates: Self = this.set("nestingLevelsSuggestionStates", js.undefined)
  }
  
}

