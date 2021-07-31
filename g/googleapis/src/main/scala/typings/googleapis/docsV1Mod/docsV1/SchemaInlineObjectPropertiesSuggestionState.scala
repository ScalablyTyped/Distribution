package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base
  * InlineObjectProperties have been changed in this suggestion. For any field
  * set to true, there is a new suggested value.
  */
trait SchemaInlineObjectPropertiesSuggestionState extends StObject {
  
  /**
    * A mask that indicates which of the fields in embedded_object have been
    * changed in this suggestion.
    */
  var embeddedObjectSuggestionState: js.UndefOr[SchemaEmbeddedObjectSuggestionState] = js.undefined
}
object SchemaInlineObjectPropertiesSuggestionState {
  
  @scala.inline
  def apply(): SchemaInlineObjectPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInlineObjectPropertiesSuggestionState]
  }
  
  @scala.inline
  implicit class SchemaInlineObjectPropertiesSuggestionStateMutableBuilder[Self <: SchemaInlineObjectPropertiesSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmbeddedObjectSuggestionState(value: SchemaEmbeddedObjectSuggestionState): Self = StObject.set(x, "embeddedObjectSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedObjectSuggestionStateUndefined: Self = StObject.set(x, "embeddedObjectSuggestionState", js.undefined)
  }
}
