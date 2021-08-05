package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base
  * PositionedObjectProperties have been changed in this suggestion. For any
  * field set to true, there is a new suggested value.
  */
trait SchemaPositionedObjectPropertiesSuggestionState extends StObject {
  
  /**
    * A mask that indicates which of the fields in embedded_object have been
    * changed in this suggestion.
    */
  var embeddedObjectSuggestionState: js.UndefOr[SchemaEmbeddedObjectSuggestionState] = js.undefined
  
  /**
    * A mask that indicates which of the fields in positioning have been
    * changed in this suggestion.
    */
  var positioningSuggestionState: js.UndefOr[SchemaPositionedObjectPositioningSuggestionState] = js.undefined
}
object SchemaPositionedObjectPropertiesSuggestionState {
  
  inline def apply(): SchemaPositionedObjectPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPositionedObjectPropertiesSuggestionState]
  }
  
  extension [Self <: SchemaPositionedObjectPropertiesSuggestionState](x: Self) {
    
    inline def setEmbeddedObjectSuggestionState(value: SchemaEmbeddedObjectSuggestionState): Self = StObject.set(x, "embeddedObjectSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedObjectSuggestionStateUndefined: Self = StObject.set(x, "embeddedObjectSuggestionState", js.undefined)
    
    inline def setPositioningSuggestionState(value: SchemaPositionedObjectPositioningSuggestionState): Self = StObject.set(x, "positioningSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setPositioningSuggestionStateUndefined: Self = StObject.set(x, "positioningSuggestionState", js.undefined)
  }
}
