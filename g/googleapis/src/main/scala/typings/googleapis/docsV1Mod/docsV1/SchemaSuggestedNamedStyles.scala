package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A suggested change to the NamedStyles.
  */
@js.native
trait SchemaSuggestedNamedStyles extends js.Object {
  
  /**
    * A NamedStyles that only includes the changes made in this suggestion.
    * This can be used along with the named_styles_suggestion_state to see
    * which fields have changed and their new values.
    */
  var namedStyles: js.UndefOr[SchemaNamedStyles] = js.native
  
  /**
    * A mask that indicates which of the fields on the base NamedStyles have
    * been changed in this suggestion.
    */
  var namedStylesSuggestionState: js.UndefOr[SchemaNamedStylesSuggestionState] = js.native
}
object SchemaSuggestedNamedStyles {
  
  @scala.inline
  def apply(): SchemaSuggestedNamedStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestedNamedStyles]
  }
  
  @scala.inline
  implicit class SchemaSuggestedNamedStylesOps[Self <: SchemaSuggestedNamedStyles] (val x: Self) extends AnyVal {
    
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
    def setNamedStyles(value: SchemaNamedStyles): Self = this.set("namedStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedStyles: Self = this.set("namedStyles", js.undefined)
    
    @scala.inline
    def setNamedStylesSuggestionState(value: SchemaNamedStylesSuggestionState): Self = this.set("namedStylesSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedStylesSuggestionState: Self = this.set("namedStylesSuggestionState", js.undefined)
  }
}
