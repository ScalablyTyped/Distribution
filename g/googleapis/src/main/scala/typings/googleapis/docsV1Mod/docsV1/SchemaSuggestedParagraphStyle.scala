package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A suggested change to a ParagraphStyle.
  */
trait SchemaSuggestedParagraphStyle extends StObject {
  
  /**
    * A ParagraphStyle that only includes the changes made in this suggestion.
    * This can be used along with the paragraph_suggestion_state to see which
    * fields have changed and their new values.
    */
  var paragraphStyle: js.UndefOr[SchemaParagraphStyle] = js.undefined
  
  /**
    * A mask that indicates which of the fields on the base ParagraphStyle have
    * been changed in this suggestion.
    */
  var paragraphStyleSuggestionState: js.UndefOr[SchemaParagraphStyleSuggestionState] = js.undefined
}
object SchemaSuggestedParagraphStyle {
  
  inline def apply(): SchemaSuggestedParagraphStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestedParagraphStyle]
  }
  
  extension [Self <: SchemaSuggestedParagraphStyle](x: Self) {
    
    inline def setParagraphStyle(value: SchemaParagraphStyle): Self = StObject.set(x, "paragraphStyle", value.asInstanceOf[js.Any])
    
    inline def setParagraphStyleSuggestionState(value: SchemaParagraphStyleSuggestionState): Self = StObject.set(x, "paragraphStyleSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setParagraphStyleSuggestionStateUndefined: Self = StObject.set(x, "paragraphStyleSuggestionState", js.undefined)
    
    inline def setParagraphStyleUndefined: Self = StObject.set(x, "paragraphStyle", js.undefined)
  }
}
