package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The suggestion state of a NamedStyles message.
  */
trait SchemaNamedStylesSuggestionState extends StObject {
  
  /**
    * A mask that indicates which of the fields on the corresponding NamedStyle
    * in styles have been changed in this suggestion.  The order of these named
    * style suggestion states match the order of the corresponding named style
    * within the named styles suggestion.
    */
  var stylesSuggestionStates: js.UndefOr[js.Array[SchemaNamedStyleSuggestionState]] = js.undefined
}
object SchemaNamedStylesSuggestionState {
  
  inline def apply(): SchemaNamedStylesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamedStylesSuggestionState]
  }
  
  extension [Self <: SchemaNamedStylesSuggestionState](x: Self) {
    
    inline def setStylesSuggestionStates(value: js.Array[SchemaNamedStyleSuggestionState]): Self = StObject.set(x, "stylesSuggestionStates", value.asInstanceOf[js.Any])
    
    inline def setStylesSuggestionStatesUndefined: Self = StObject.set(x, "stylesSuggestionStates", js.undefined)
    
    inline def setStylesSuggestionStatesVarargs(value: SchemaNamedStyleSuggestionState*): Self = StObject.set(x, "stylesSuggestionStates", js.Array(value :_*))
  }
}
