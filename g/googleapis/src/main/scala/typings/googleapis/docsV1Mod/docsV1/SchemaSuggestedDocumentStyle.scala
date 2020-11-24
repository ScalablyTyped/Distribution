package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A suggested change to the DocumentStyle.
  */
@js.native
trait SchemaSuggestedDocumentStyle extends js.Object {
  
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
  implicit class SchemaSuggestedDocumentStyleOps[Self <: SchemaSuggestedDocumentStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocumentStyle(value: SchemaDocumentStyle): Self = this.set("documentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentStyle: Self = this.set("documentStyle", js.undefined)
    
    @scala.inline
    def setDocumentStyleSuggestionState(value: SchemaDocumentStyleSuggestionState): Self = this.set("documentStyleSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentStyleSuggestionState: Self = this.set("documentStyleSuggestionState", js.undefined)
  }
}
