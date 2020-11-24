package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A suggested change to PositionedObjectProperties.
  */
@js.native
trait SchemaSuggestedPositionedObjectProperties extends js.Object {
  
  /**
    * A PositionedObjectProperties that only includes the changes made in this
    * suggestion. This can be used along with the
    * positioned_object_properties_suggestion_state to see which fields have
    * changed and their new values.
    */
  var positionedObjectProperties: js.UndefOr[SchemaPositionedObjectProperties] = js.native
  
  /**
    * A mask that indicates which of the fields on the base
    * PositionedObjectProperties have been changed in this suggestion.
    */
  var positionedObjectPropertiesSuggestionState: js.UndefOr[SchemaPositionedObjectPropertiesSuggestionState] = js.native
}
object SchemaSuggestedPositionedObjectProperties {
  
  @scala.inline
  def apply(): SchemaSuggestedPositionedObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestedPositionedObjectProperties]
  }
  
  @scala.inline
  implicit class SchemaSuggestedPositionedObjectPropertiesOps[Self <: SchemaSuggestedPositionedObjectProperties] (val x: Self) extends AnyVal {
    
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
    def setPositionedObjectProperties(value: SchemaPositionedObjectProperties): Self = this.set("positionedObjectProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionedObjectProperties: Self = this.set("positionedObjectProperties", js.undefined)
    
    @scala.inline
    def setPositionedObjectPropertiesSuggestionState(value: SchemaPositionedObjectPropertiesSuggestionState): Self = this.set("positionedObjectPropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionedObjectPropertiesSuggestionState: Self = this.set("positionedObjectPropertiesSuggestionState", js.undefined)
  }
}
