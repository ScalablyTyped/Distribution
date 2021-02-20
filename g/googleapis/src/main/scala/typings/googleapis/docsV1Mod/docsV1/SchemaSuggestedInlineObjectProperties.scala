package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A suggested change to InlineObjectProperties.
  */
@js.native
trait SchemaSuggestedInlineObjectProperties extends StObject {
  
  /**
    * An InlineObjectProperties that only includes the changes made in this
    * suggestion. This can be used along with the
    * inline_object_properties_suggestion_state to see which fields have
    * changed and their new values.
    */
  var inlineObjectProperties: js.UndefOr[SchemaInlineObjectProperties] = js.native
  
  /**
    * A mask that indicates which of the fields on the base
    * InlineObjectProperties have been changed in this suggestion.
    */
  var inlineObjectPropertiesSuggestionState: js.UndefOr[SchemaInlineObjectPropertiesSuggestionState] = js.native
}
object SchemaSuggestedInlineObjectProperties {
  
  @scala.inline
  def apply(): SchemaSuggestedInlineObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestedInlineObjectProperties]
  }
  
  @scala.inline
  implicit class SchemaSuggestedInlineObjectPropertiesMutableBuilder[Self <: SchemaSuggestedInlineObjectProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInlineObjectProperties(value: SchemaInlineObjectProperties): Self = StObject.set(x, "inlineObjectProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineObjectPropertiesSuggestionState(value: SchemaInlineObjectPropertiesSuggestionState): Self = StObject.set(x, "inlineObjectPropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineObjectPropertiesSuggestionStateUndefined: Self = StObject.set(x, "inlineObjectPropertiesSuggestionState", js.undefined)
    
    @scala.inline
    def setInlineObjectPropertiesUndefined: Self = StObject.set(x, "inlineObjectProperties", js.undefined)
  }
}
