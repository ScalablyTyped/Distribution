package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInlineObjectPropertiesSuggestionState extends StObject {
  
  /**
    * A mask that indicates which of the fields in embedded_object have been changed in this suggestion.
    */
  var embeddedObjectSuggestionState: js.UndefOr[SchemaEmbeddedObjectSuggestionState] = js.undefined
}
object SchemaInlineObjectPropertiesSuggestionState {
  
  inline def apply(): SchemaInlineObjectPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInlineObjectPropertiesSuggestionState]
  }
  
  extension [Self <: SchemaInlineObjectPropertiesSuggestionState](x: Self) {
    
    inline def setEmbeddedObjectSuggestionState(value: SchemaEmbeddedObjectSuggestionState): Self = StObject.set(x, "embeddedObjectSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedObjectSuggestionStateUndefined: Self = StObject.set(x, "embeddedObjectSuggestionState", js.undefined)
  }
}
