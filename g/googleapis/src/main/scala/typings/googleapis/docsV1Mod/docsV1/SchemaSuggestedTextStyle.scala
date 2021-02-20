package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A suggested change to a TextStyle.
  */
@js.native
trait SchemaSuggestedTextStyle extends StObject {
  
  /**
    * A TextStyle that only includes the changes made in this suggestion. This
    * can be used along with the text_style_suggestion_state to see which
    * fields have changed and their new values.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.native
  
  /**
    * A mask that indicates which of the fields on the base TextStyle have been
    * changed in this suggestion.
    */
  var textStyleSuggestionState: js.UndefOr[SchemaTextStyleSuggestionState] = js.native
}
object SchemaSuggestedTextStyle {
  
  @scala.inline
  def apply(): SchemaSuggestedTextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestedTextStyle]
  }
  
  @scala.inline
  implicit class SchemaSuggestedTextStyleMutableBuilder[Self <: SchemaSuggestedTextStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextStyle(value: SchemaTextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleSuggestionState(value: SchemaTextStyleSuggestionState): Self = StObject.set(x, "textStyleSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleSuggestionStateUndefined: Self = StObject.set(x, "textStyleSuggestionState", js.undefined)
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
