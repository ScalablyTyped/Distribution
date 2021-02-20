package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base
  * PositionedObjectProperties have been changed in this suggestion. For any
  * field set to true, there is a new suggested value.
  */
@js.native
trait SchemaPositionedObjectPropertiesSuggestionState extends StObject {
  
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
  implicit class SchemaPositionedObjectPropertiesSuggestionStateMutableBuilder[Self <: SchemaPositionedObjectPropertiesSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmbeddedObjectSuggestionState(value: SchemaEmbeddedObjectSuggestionState): Self = StObject.set(x, "embeddedObjectSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedObjectSuggestionStateUndefined: Self = StObject.set(x, "embeddedObjectSuggestionState", js.undefined)
    
    @scala.inline
    def setPositioningSuggestionState(value: SchemaPositionedObjectPositioningSuggestionState): Self = StObject.set(x, "positioningSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositioningSuggestionStateUndefined: Self = StObject.set(x, "positioningSuggestionState", js.undefined)
  }
}
