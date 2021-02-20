package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A suggested change to ListProperties.
  */
@js.native
trait SchemaSuggestedListProperties extends StObject {
  
  /**
    * A ListProperties that only includes the changes made in this suggestion.
    * This can be used along with the list_properties_suggestion_state to see
    * which fields have changed and their new values.
    */
  var listProperties: js.UndefOr[SchemaListProperties] = js.native
  
  /**
    * A mask that indicates which of the fields on the base ListProperties have
    * been changed in this suggestion.
    */
  var listPropertiesSuggestionState: js.UndefOr[SchemaListPropertiesSuggestionState] = js.native
}
object SchemaSuggestedListProperties {
  
  @scala.inline
  def apply(): SchemaSuggestedListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestedListProperties]
  }
  
  @scala.inline
  implicit class SchemaSuggestedListPropertiesMutableBuilder[Self <: SchemaSuggestedListProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListProperties(value: SchemaListProperties): Self = StObject.set(x, "listProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPropertiesSuggestionState(value: SchemaListPropertiesSuggestionState): Self = StObject.set(x, "listPropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPropertiesSuggestionStateUndefined: Self = StObject.set(x, "listPropertiesSuggestionState", js.undefined)
    
    @scala.inline
    def setListPropertiesUndefined: Self = StObject.set(x, "listProperties", js.undefined)
  }
}
