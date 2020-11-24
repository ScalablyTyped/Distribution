package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base
  * InlineObjectProperties have been changed in this suggestion. For any field
  * set to true, there is a new suggested value.
  */
@js.native
trait SchemaInlineObjectPropertiesSuggestionState extends js.Object {
  
  /**
    * A mask that indicates which of the fields in embedded_object have been
    * changed in this suggestion.
    */
  var embeddedObjectSuggestionState: js.UndefOr[SchemaEmbeddedObjectSuggestionState] = js.native
}
object SchemaInlineObjectPropertiesSuggestionState {
  
  @scala.inline
  def apply(): SchemaInlineObjectPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInlineObjectPropertiesSuggestionState]
  }
  
  @scala.inline
  implicit class SchemaInlineObjectPropertiesSuggestionStateOps[Self <: SchemaInlineObjectPropertiesSuggestionState] (val x: Self) extends AnyVal {
    
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
  }
}
