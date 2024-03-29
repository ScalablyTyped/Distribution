package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSuggestedListProperties extends StObject {
  
  /**
    * A ListProperties that only includes the changes made in this suggestion. This can be used along with the list_properties_suggestion_state to see which fields have changed and their new values.
    */
  var listProperties: js.UndefOr[SchemaListProperties] = js.undefined
  
  /**
    * A mask that indicates which of the fields on the base ListProperties have been changed in this suggestion.
    */
  var listPropertiesSuggestionState: js.UndefOr[SchemaListPropertiesSuggestionState] = js.undefined
}
object SchemaSuggestedListProperties {
  
  inline def apply(): SchemaSuggestedListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestedListProperties]
  }
  
  extension [Self <: SchemaSuggestedListProperties](x: Self) {
    
    inline def setListProperties(value: SchemaListProperties): Self = StObject.set(x, "listProperties", value.asInstanceOf[js.Any])
    
    inline def setListPropertiesSuggestionState(value: SchemaListPropertiesSuggestionState): Self = StObject.set(x, "listPropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setListPropertiesSuggestionStateUndefined: Self = StObject.set(x, "listPropertiesSuggestionState", js.undefined)
    
    inline def setListPropertiesUndefined: Self = StObject.set(x, "listProperties", js.undefined)
  }
}
