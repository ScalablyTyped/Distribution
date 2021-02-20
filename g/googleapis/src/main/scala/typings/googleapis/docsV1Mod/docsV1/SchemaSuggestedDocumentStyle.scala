package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A suggested change to the DocumentStyle.
  */
@js.native
trait SchemaSuggestedDocumentStyle extends StObject {
  
  /**
    * A DocumentStyle that only includes the changes made in this suggestion.
    * This can be used along with the document_style_suggestion_state to see
    * which fields have changed and their new values.
    */
  var documentStyle: js.UndefOr[SchemaDocumentStyle] = js.native
  
  /**
    * A mask that indicates which of the fields on the base DocumentStyle have
    * been changed in this suggestion.
    */
  var documentStyleSuggestionState: js.UndefOr[SchemaDocumentStyleSuggestionState] = js.native
}
object SchemaSuggestedDocumentStyle {
  
  @scala.inline
  def apply(): SchemaSuggestedDocumentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestedDocumentStyle]
  }
  
  @scala.inline
  implicit class SchemaSuggestedDocumentStyleMutableBuilder[Self <: SchemaSuggestedDocumentStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentStyle(value: SchemaDocumentStyle): Self = StObject.set(x, "documentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentStyleSuggestionState(value: SchemaDocumentStyleSuggestionState): Self = StObject.set(x, "documentStyleSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentStyleSuggestionStateUndefined: Self = StObject.set(x, "documentStyleSuggestionState", js.undefined)
    
    @scala.inline
    def setDocumentStyleUndefined: Self = StObject.set(x, "documentStyle", js.undefined)
  }
}
