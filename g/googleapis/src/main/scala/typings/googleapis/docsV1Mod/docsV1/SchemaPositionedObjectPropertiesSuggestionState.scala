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
  def apply(): SchemaPositionedObjectPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPositionedObjectPropertiesSuggestionState]
  }
  @scala.inline
  implicit class SchemaPositionedObjectPropertiesSuggestionStateOps[Self <: SchemaPositionedObjectPropertiesSuggestionState] (val x: Self) extends AnyVal {
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
    def setEmbeddedObjectSuggestionState(value: SchemaEmbeddedObjectSuggestionState): Self = this.set("embeddedObjectSuggestionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbeddedObjectSuggestionState: Self = this.set("embeddedObjectSuggestionState", js.undefined)
    @scala.inline
    def setPositioningSuggestionState(value: SchemaPositionedObjectPositioningSuggestionState): Self = this.set("positioningSuggestionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositioningSuggestionState: Self = this.set("positioningSuggestionState", js.undefined)
  }
  
}

