package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSuggestedNamedStyles extends StObject {
  
  /**
    * A NamedStyles that only includes the changes made in this suggestion. This can be used along with the named_styles_suggestion_state to see which fields have changed and their new values.
    */
  var namedStyles: js.UndefOr[SchemaNamedStyles] = js.undefined
  
  /**
    * A mask that indicates which of the fields on the base NamedStyles have been changed in this suggestion.
    */
  var namedStylesSuggestionState: js.UndefOr[SchemaNamedStylesSuggestionState] = js.undefined
}
object SchemaSuggestedNamedStyles {
  
  inline def apply(): SchemaSuggestedNamedStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestedNamedStyles]
  }
  
  extension [Self <: SchemaSuggestedNamedStyles](x: Self) {
    
    inline def setNamedStyles(value: SchemaNamedStyles): Self = StObject.set(x, "namedStyles", value.asInstanceOf[js.Any])
    
    inline def setNamedStylesSuggestionState(value: SchemaNamedStylesSuggestionState): Self = StObject.set(x, "namedStylesSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setNamedStylesSuggestionStateUndefined: Self = StObject.set(x, "namedStylesSuggestionState", js.undefined)
    
    inline def setNamedStylesUndefined: Self = StObject.set(x, "namedStyles", js.undefined)
  }
}
