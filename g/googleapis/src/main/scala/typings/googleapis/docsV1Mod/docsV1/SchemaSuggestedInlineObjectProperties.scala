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
  def apply(): SchemaSuggestedInlineObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestedInlineObjectProperties]
  }
  @scala.inline
  implicit class SchemaSuggestedInlineObjectPropertiesOps[Self <: SchemaSuggestedInlineObjectProperties] (val x: Self) extends AnyVal {
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
    def setInlineObjectProperties(value: SchemaInlineObjectProperties): Self = this.set("inlineObjectProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineObjectProperties: Self = this.set("inlineObjectProperties", js.undefined)
    @scala.inline
    def setInlineObjectPropertiesSuggestionState(value: SchemaInlineObjectPropertiesSuggestionState): Self = this.set("inlineObjectPropertiesSuggestionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineObjectPropertiesSuggestionState: Self = this.set("inlineObjectPropertiesSuggestionState", js.undefined)
  }
  
}

